package org.webrtc;

import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.FGI;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* loaded from: classes5.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    public static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    public static final int MAX_ENCODER_Q_SIZE = 2;
    public static final int MAX_VIDEO_FRAMERATE = 30;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    public static final String TAG = "HardwareVideoEncoder";
    public int adjustedBitrate;
    public boolean automaticResizeOn;
    public final BitrateAdjuster bitrateAdjuster;
    public VideoEncoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final VideoCodecMimeType codecType;
    public ByteBuffer configBuffer;
    public final ThreadUtils.ThreadChecker encodeThreadChecker;
    public final long forcedKeyFrameNs;
    public int frameSizeBytes;
    public int height;
    public boolean isEncodingStatisticsEnabled;
    public boolean isSemiPlanar;
    public final int keyFrameIntervalSec;
    public long lastKeyFrameNs;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public long nextPresentationTimestampUs;
    public final BusyCount outputBuffersBusyCount;
    public Thread outputThread;
    public final ThreadUtils.ThreadChecker outputThreadChecker;
    public final Map<String, String> params;
    public volatile boolean running;
    public final EglBase14.Context sharedContext;
    public volatile Exception shutdownException;
    public int sliceHeight;
    public int stride;
    public final Integer surfaceColorFormat;
    public final GlGenericDrawer textureDrawer;
    public EglBase14 textureEglBase;
    public Surface textureInputSurface;
    public boolean useSurfaceMode;
    public boolean useYuvRender;
    public int width;
    public final Integer yuvColorFormat;
    public final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    public final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    /* renamed from: org.webrtc.HardwareVideoEncoder$1, reason: invalid class name */
    public class AnonymousClass1 extends Thread {
        public AnonymousClass1() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                boolean z = HardwareVideoEncoder.this.running;
                HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                if (!z) {
                    hardwareVideoEncoder.releaseCodecOnOutputThread();
                    return;
                }
                hardwareVideoEncoder.deliverEncodedImage();
            }
        }
    }

    public class BusyCount {
        public int count;
        public final Object countLock;

        public void decrement() {
            synchronized (this.countLock) {
                int i = this.count - 1;
                this.count = i;
                if (i == 0) {
                    this.countLock.notifyAll();
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z;
            synchronized (this.countLock) {
                z = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e);
                        z = true;
                    }
                }
            }
            BV7.A1N(z);
        }

        public BusyCount() {
            this.countLock = C3cG.A0T();
        }
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    /* renamed from: lambda$deliverEncodedImage$0$org-webrtc-HardwareVideoEncoder, reason: not valid java name */
    public /* synthetic */ void m3952lambda$deliverEncodedImage$0$orgwebrtcHardwareVideoEncoder(MediaCodecWrapper mediaCodecWrapper, int i) {
        try {
            mediaCodecWrapper.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new AnonymousClass1();
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j) {
        String strA0I;
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer == -1) {
                Logging.d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() < this.frameSizeBytes) {
                    Logging.e(TAG, FGI.A0T("Input buffer size: ", " is smaller than frame size: ", inputBuffer.capacity(), this.frameSizeBytes));
                    return VideoCodecStatus.ERROR;
                }
                fillInputBuffer(inputBuffer, videoFrame.buffer);
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, this.frameSizeBytes, j, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    e = e;
                    strA0I = "queueInputBuffer failed";
                    Logging.e(TAG, strA0I, e);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                strA0I = FGI.A0I("getInputBuffer with index=", iDequeueInputBuffer, " failed");
            }
        } catch (IllegalStateException e3) {
            e = e3;
            strA0I = "dequeueInputBuffer failed";
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.buffer, 0, videoFrame.timestampNs), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus initEncodeInternal() {
        int iIntValue;
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.nextPresentationTimestampUs = 0L;
        this.lastKeyFrameNs = -1L;
        this.isEncodingStatisticsEnabled = false;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            iIntValue = (this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat).intValue();
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            Logging.e(TAG, FGI.A0M("Cannot create media encoder ", this.codecName), e);
        }
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
            mediaFormatCreateVideoFormat.setInteger("bitrate", this.adjustedBitrate);
            mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
            mediaFormatCreateVideoFormat.setInteger("color-format", iIntValue);
            mediaFormatCreateVideoFormat.setFloat("frame-rate", (float) this.bitrateAdjuster.getAdjustedFramerateFps());
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
            if (this.useYuvRender) {
                mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-enc-linear-color-format.value", 1);
            }
            if (this.codecType == VideoCodecMimeType.H264) {
                String strA0p = C60O.A0p("profile-level-id", this.params);
                if (strA0p == null) {
                    strA0p = "42e01f";
                }
                int iHashCode = strA0p.hashCode();
                if (iHashCode != 1537948542) {
                    if (iHashCode != 1595523960) {
                        if (iHashCode == 1595523974 && strA0p.equals("640c1f")) {
                            mediaFormatCreateVideoFormat.setInteger("profile", 8);
                            i = 256;
                            mediaFormatCreateVideoFormat.setInteger("level", i);
                        }
                        Logging.w(TAG, FGI.A0M("Unknown profile level id: ", strA0p));
                    } else {
                        if (strA0p.equals("640c29")) {
                            mediaFormatCreateVideoFormat.setInteger("profile", 8);
                            i = 4096;
                            mediaFormatCreateVideoFormat.setInteger("level", i);
                        }
                        Logging.w(TAG, FGI.A0M("Unknown profile level id: ", strA0p));
                    }
                } else if (!strA0p.equals("42e01f")) {
                    Logging.w(TAG, FGI.A0M("Unknown profile level id: ", strA0p));
                }
            }
            if (this.codecName.equals("c2.google.av1.encoder")) {
                mediaFormatCreateVideoFormat.setInteger("vendor.google-av1enc.encoding-preset.int32.value", 1);
            }
            if (isEncodingStatisticsSupported()) {
                mediaFormatCreateVideoFormat.setInteger("video-encoding-statistics-level", 1);
                this.isEncodingStatisticsEnabled = true;
            }
            Logging.d(TAG, AnonymousClass007.A0a("Format: ", mediaFormatCreateVideoFormat));
            this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
            if (this.useSurfaceMode) {
                this.textureEglBase = EglBase.CC.createEgl14(this.sharedContext, this.useYuvRender ? EglBase.CONFIG_RECORDABLE_YUV_NV12 : EglBase.CONFIG_RECORDABLE);
                Surface surfaceCreateInputSurface = this.codec.createInputSurface();
                this.textureInputSurface = surfaceCreateInputSurface;
                this.textureEglBase.createSurface(surfaceCreateInputSurface);
                this.textureEglBase.makeCurrent();
            }
            updateInputFormat(this.codec.getInputFormat());
            this.codec.start();
            this.running = true;
            this.outputThreadChecker.thread = null;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            this.outputThread = anonymousClass1;
            anonymousClass1.start();
            return VideoCodecStatus.OK;
        } catch (IllegalArgumentException | IllegalStateException e2) {
            Logging.e(TAG, "initEncodeInternal failed", e2);
            release();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        Logging.d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putInt("request-sync", 0);
            this.codec.setParameters(bundleA0N);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusRelease = release();
        if (videoCodecStatusRelease != VideoCodecStatus.OK) {
            return videoCodecStatusRelease;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        return j2 > 0 && j > this.lastKeyFrameNs + j2;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundleA0N);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    private void updateInputFormat(MediaFormat mediaFormat) {
        int i;
        int i2;
        this.stride = this.width;
        this.sliceHeight = this.height;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("stride")) {
                int integer = mediaFormat.getInteger("stride");
                this.stride = integer;
                this.stride = Math.max(integer, this.width);
            }
            if (mediaFormat.containsKey("slice-height")) {
                int integer2 = mediaFormat.getInteger("slice-height");
                this.sliceHeight = integer2;
                this.sliceHeight = Math.max(integer2, this.height);
            }
        }
        boolean zIsSemiPlanar = isSemiPlanar(this.yuvColorFormat.intValue());
        this.isSemiPlanar = zIsSemiPlanar;
        if (zIsSemiPlanar) {
            int i3 = (this.height + 1) / 2;
            int i4 = this.sliceHeight;
            int i5 = this.stride;
            i = i4 * i5;
            i2 = i3 * i5;
        } else {
            int i6 = this.stride;
            int i7 = this.sliceHeight;
            int i8 = (i7 + 1) / 2;
            i = i7 * i6;
            i2 = i8 * ((i6 + 1) / 2) * 2;
        }
        this.frameSizeBytes = i + i2;
        StringBuilder sbA0f = C3cG.A0f(mediaFormat, "updateInputFormat format: ");
        sbA0f.append(" stride: ");
        sbA0f.append(this.stride);
        sbA0f.append(" sliceHeight: ");
        sbA0f.append(this.sliceHeight);
        sbA0f.append(" isSemiPlanar: ");
        sbA0f.append(this.isSemiPlanar);
        sbA0f.append(" frameSizeBytes: ");
        Logging.d(TAG, BV4.A0l(sbA0f, this.frameSizeBytes));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // org.webrtc.VideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r9, org.webrtc.VideoEncoder.EncodeInfo r10) {
        /*
            r8 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r8.encodeThreadChecker
            r0.checkIsOnValidThread()
            org.webrtc.MediaCodecWrapper r0 = r8.codec
            if (r0 != 0) goto Lc
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.UNINITIALIZED
        Lb:
            return r1
        Lc:
            org.webrtc.VideoFrame$Buffer r0 = r9.buffer
            boolean r4 = r0 instanceof org.webrtc.VideoFrame.TextureBuffer
            int r3 = r0.getWidth()
            org.webrtc.VideoFrame$Buffer r0 = r9.buffer
            int r2 = r0.getHeight()
            boolean r0 = r8.canUseSurface()
            r5 = 0
            if (r0 == 0) goto L24
            r1 = 1
            if (r4 != 0) goto L25
        L24:
            r1 = 0
        L25:
            int r0 = r8.width
            if (r3 != r0) goto L31
            int r0 = r8.height
            if (r2 != r0) goto L31
            boolean r0 = r8.useSurfaceMode
            if (r1 == r0) goto L3a
        L31:
            org.webrtc.VideoCodecStatus r1 = r8.resetCodec(r3, r2, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            if (r1 == r0) goto L3a
            return r1
        L3a:
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r8.outputBuilders
            int r1 = r0.size()
            r0 = 2
            if (r1 <= r0) goto L4d
            java.lang.String r1 = "HardwareVideoEncoder"
            java.lang.String r0 = "Dropped frame, encoder queue full"
            org.webrtc.Logging.e(r1, r0)
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.NO_OUTPUT
            return r1
        L4d:
            org.webrtc.EncodedImage$FrameType[] r4 = r10.frameTypes
            int r3 = r4.length
            r2 = 0
        L51:
            if (r5 >= r3) goto L5d
            r1 = r4[r5]
            org.webrtc.EncodedImage$FrameType r0 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
            if (r1 != r0) goto L5a
            r2 = 1
        L5a:
            int r5 = r5 + 1
            goto L51
        L5d:
            if (r2 != 0) goto L67
            long r0 = r9.timestampNs
            boolean r0 = r8.shouldForceKeyFrame(r0)
            if (r0 == 0) goto L6c
        L67:
            long r0 = r9.timestampNs
            r8.requestKeyFrame(r0)
        L6c:
            org.webrtc.EncodedImage$Builder r2 = new org.webrtc.EncodedImage$Builder
            r2.<init>()
            long r0 = r9.timestampNs
            r2.captureTimeNs = r0
            org.webrtc.VideoFrame$Buffer r0 = r9.buffer
            int r0 = r0.getWidth()
            r2.encodedWidth = r0
            org.webrtc.VideoFrame$Buffer r0 = r9.buffer
            int r0 = r0.getHeight()
            r2.encodedHeight = r0
            int r0 = r9.rotation
            r2.rotation = r0
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r8.outputBuilders
            r0.offer(r2)
            long r2 = r8.nextPresentationTimestampUs
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            org.webrtc.BitrateAdjuster r0 = r8.bitrateAdjuster
            double r0 = r0.getAdjustedFramerateFps()
            double r6 = r6 / r0
            long r4 = (long) r6
            long r0 = r8.nextPresentationTimestampUs
            long r0 = r0 + r4
            r8.nextPresentationTimestampUs = r0
            boolean r0 = r8.useSurfaceMode
            if (r0 == 0) goto Lb4
            org.webrtc.VideoCodecStatus r1 = r8.encodeTextureBuffer(r9, r2)
        Laa:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            if (r1 == r0) goto Lb
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r8.outputBuilders
            r0.pollLast()
            return r1
        Lb4:
            org.webrtc.VideoCodecStatus r1 = r8.encodeByteBuffer(r9, r2)
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.encode(org.webrtc.VideoFrame, org.webrtc.VideoEncoder$EncodeInfo):org.webrtc.VideoCodecStatus");
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        int i;
        int i2;
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                i = 29;
                i2 = 95;
            } else if (videoCodecMimeType == VideoCodecMimeType.H264) {
                i = 24;
                i2 = 37;
            }
            return new VideoEncoder.ScalingSettings(i, i2);
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (i2 != 0 && (i = settings.maxFramerate) != 0) {
            this.bitrateAdjuster.setTargets(i2 * 1000, i);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        StringBuilder sbA0x = C60O.A0x("initEncode name: ");
        sbA0x.append(this.codecName);
        sbA0x.append(" type: ");
        sbA0x.append(this.codecType);
        sbA0x.append(" width: ");
        sbA0x.append(this.width);
        sbA0x.append(" height: ");
        sbA0x.append(this.height);
        sbA0x.append(" framerate_fps: ");
        sbA0x.append(settings.maxFramerate);
        sbA0x.append(" bitrate_kbps: ");
        sbA0x.append(settings.startBitrate);
        sbA0x.append(" surface mode: ");
        sbA0x.append(this.useSurfaceMode);
        Logging.d(TAG, sbA0x.toString());
        return initEncodeInternal();
    }

    public boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        if (videoCodecMimeType == VideoCodecMimeType.VP8 || videoCodecMimeType == VideoCodecMimeType.VP9 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecType.mimeType())) == null) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ boolean isHardwareEncoder() {
        return true;
    }

    public boolean isSemiPlanar(int i) {
        if (i == 19) {
            return false;
        }
        if (i == 21 || i == 2141391872 || i == 2141391876) {
            return true;
        }
        throw BV5.A0Q("Unsupported colorFormat: ", i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // org.webrtc.VideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.webrtc.VideoCodecStatus release() {
        /*
            r3 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r3.encodeThreadChecker
            r0.checkIsOnValidThread()
            java.lang.Thread r0 = r3.outputThread
            if (r0 == 0) goto L58
            r0 = 0
            r3.running = r0
            java.lang.Thread r2 = r3.outputThread
            r0 = 5000(0x1388, double:2.4703E-320)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r2, r0)
            java.lang.String r2 = "HardwareVideoEncoder"
            if (r0 != 0) goto L4a
            java.lang.String r0 = "Media encoder release timeout"
            org.webrtc.Logging.e(r2, r0)
            org.webrtc.VideoCodecStatus r2 = org.webrtc.VideoCodecStatus.TIMEOUT
        L1f:
            org.webrtc.GlGenericDrawer r0 = r3.textureDrawer
            r0.release()
            org.webrtc.VideoFrameDrawer r0 = r3.videoFrameDrawer
            r0.release()
            org.webrtc.EglBase14 r0 = r3.textureEglBase
            r1 = 0
            if (r0 == 0) goto L33
            r0.release()
            r3.textureEglBase = r1
        L33:
            android.view.Surface r0 = r3.textureInputSurface
            if (r0 == 0) goto L3c
            r0.release()
            r3.textureInputSurface = r1
        L3c:
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r3.outputBuilders
            r0.clear()
            r3.codec = r1
            r3.outputThread = r1
            org.webrtc.ThreadUtils$ThreadChecker r0 = r3.encodeThreadChecker
            r0.thread = r1
            return r2
        L4a:
            java.lang.Exception r0 = r3.shutdownException
            if (r0 == 0) goto L58
            java.lang.String r1 = "Media encoder release exception"
            java.lang.Exception r0 = r3.shutdownException
            org.webrtc.Logging.e(r2, r1, r0)
            org.webrtc.VideoCodecStatus r2 = org.webrtc.VideoCodecStatus.ERROR
            goto L1f
        L58:
            org.webrtc.VideoCodecStatus r2 = org.webrtc.VideoCodecStatus.OK
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.release():org.webrtc.VideoCodecStatus");
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > 30) {
            i = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster, EglBase14.Context context, boolean z) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        this.useYuvRender = z;
        this.textureDrawer = z ? new GlRectDrawerYuv() : new GlRectDrawer();
        threadChecker.thread = null;
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ long createNative(long j) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010d A[Catch: IllegalStateException -> 0x0131, TryCatch #0 {IllegalStateException -> 0x0131, blocks: (B:4:0x0016, B:8:0x0027, B:10:0x002d, B:12:0x0034, B:13:0x003b, B:14:0x003f, B:16:0x004d, B:18:0x005e, B:20:0x0064, B:22:0x0068, B:24:0x0073, B:26:0x0084, B:27:0x0087, B:29:0x008e, B:30:0x0093, B:32:0x0098, B:34:0x009e, B:36:0x00a4, B:44:0x00c6, B:46:0x00ca, B:47:0x0101, B:48:0x0103, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:41:0x00b3, B:43:0x00c3), top: B:60:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118 A[Catch: IllegalStateException -> 0x0131, TryCatch #0 {IllegalStateException -> 0x0131, blocks: (B:4:0x0016, B:8:0x0027, B:10:0x002d, B:12:0x0034, B:13:0x003b, B:14:0x003f, B:16:0x004d, B:18:0x005e, B:20:0x0064, B:22:0x0068, B:24:0x0073, B:26:0x0084, B:27:0x0087, B:29:0x008e, B:30:0x0093, B:32:0x0098, B:34:0x009e, B:36:0x00a4, B:44:0x00c6, B:46:0x00ca, B:47:0x0101, B:48:0x0103, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:41:0x00b3, B:43:0x00c3), top: B:60:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void deliverEncodedImage() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.deliverEncodedImage():void");
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        VideoFrame.I420Buffer i420 = buffer.toI420();
        boolean z = this.isSemiPlanar;
        ByteBuffer dataY = i420.getDataY();
        int strideY = i420.getStrideY();
        ByteBuffer dataU = i420.getDataU();
        int strideU = i420.getStrideU();
        ByteBuffer dataV = i420.getDataV();
        int strideV = i420.getStrideV();
        int width = i420.getWidth();
        int height = i420.getHeight();
        int i = this.stride;
        int i2 = this.sliceHeight;
        if (z) {
            YuvHelper.I420ToNV12(dataY, strideY, dataU, strideU, dataV, strideV, byteBuffer, width, height, i, i2);
        } else {
            YuvHelper.I420Copy(dataY, strideY, dataU, strideU, dataV, strideV, byteBuffer, width, height, i, i2);
        }
        i420.release();
    }
}

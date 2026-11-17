package org.webrtc;

import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C8j3;
import X.FGI;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

/* loaded from: classes5.dex */
public class AndroidVideoDecoder implements VideoSink, VideoDecoder {
    public static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    public static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String TAG = "AndroidVideoDecoder";
    public boolean adaptivePlaybackEnabled;
    public VideoDecoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final VideoCodecMimeType codecType;
    public int colorFormat;
    public int configuredHeight;
    public int configuredWidth;
    public ThreadUtils.ThreadChecker decoderThreadChecker;
    public final BlockingDeque<FrameInfo> frameInfos;
    public boolean hasDecodedFirstFrame;
    public int height;
    public boolean keyFrameRequired;
    public boolean lowLatencyEnabled;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public Thread outputThread;
    public ThreadUtils.ThreadChecker outputThreadChecker;
    public DecodedTextureMetadata renderedTextureMetadata;
    public volatile boolean running;
    public final EglBase.Context sharedContext;
    public volatile Exception shutdownException;
    public int sliceHeight;
    public int stride;
    public Surface surface;
    public SurfaceTextureHelper surfaceTextureHelper;
    public int width;
    public final Object dimensionLock = C3cG.A0T();
    public final Object renderedTextureMetadataLock = C3cG.A0T();

    /* renamed from: org.webrtc.AndroidVideoDecoder$1, reason: invalid class name */
    public class AnonymousClass1 extends Thread {
        public AnonymousClass1(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
            while (true) {
                boolean z = AndroidVideoDecoder.this.running;
                AndroidVideoDecoder androidVideoDecoder = AndroidVideoDecoder.this;
                if (!z) {
                    androidVideoDecoder.releaseCodecOnOutputThread();
                    return;
                }
                androidVideoDecoder.deliverDecodedFrame();
            }
        }
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        int i7 = bufferInfo.size;
        if (i7 < ((i3 * i4) * 3) / 2) {
            Logging.e(TAG, FGI.A0H("Insufficient output buffer size: ", i7));
            return;
        }
        if (i7 < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i5 = (i7 * 2) / (i4 * 3);
        }
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i);
        outputBuffer.position(bufferInfo.offset);
        BV7.A19(bufferInfo, outputBuffer);
        ByteBuffer byteBufferSlice = outputBuffer.slice();
        VideoFrame.Buffer bufferCopyI420Buffer = this.colorFormat == 19 ? copyI420Buffer(byteBufferSlice, i5, i6, i3, i4) : copyNV12ToI420Buffer(byteBufferSlice, i5, i6, i3, i4);
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(bufferCopyI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public class DecodedTextureMetadata {
        public final Integer decodeTimeMs;
        public final long presentationTimestampUs;

        public DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    public class FrameInfo {
        public final long decodeStartTimeMs;
        public final int rotation;

        public FrameInfo(long j, int i) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
        }
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        if (i % 2 != 0) {
            throw BV4.A0N(FGI.A0H("Stride is not divisible by two: ", i));
        }
        int i5 = (i3 + 1) / 2;
        int i6 = i2 % 2;
        int i7 = i6 == 0 ? (i4 + 1) / 2 : i4 / 2;
        int i8 = i / 2;
        int i9 = i * i2;
        int i10 = i8 * i7;
        int i11 = i9 + i10;
        int i12 = i9 + ((i8 * i2) / 2);
        int i13 = i10 + i12;
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i3, i4);
        byteBuffer.limit(i * i4);
        YuvHelper.copyPlane(BV6.A0t(byteBuffer, 0), i, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), i3, i4);
        byteBuffer.limit(i11);
        int i14 = i7;
        YuvHelper.copyPlane(BV6.A0t(byteBuffer, i9), i8, javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), i5, i14);
        if (i6 == 1) {
            byteBuffer.position(i9 + ((i7 - 1) * i8));
            ByteBuffer dataU = javaI420BufferAllocate.getDataU();
            dataU.position(javaI420BufferAllocate.getStrideU() * i7);
            dataU.put(byteBuffer);
        }
        byteBuffer.limit(i13);
        YuvHelper.copyPlane(BV6.A0t(byteBuffer, i12), i8, javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i5, i14);
        if (i6 == 1) {
            byteBuffer.position(i12 + (i8 * (i7 - 1)));
            ByteBuffer dataV = javaI420BufferAllocate.getDataV();
            dataV.position(javaI420BufferAllocate.getStrideV() * i7);
            dataV.put(byteBuffer);
        }
        return javaI420BufferAllocate;
    }

    private Thread createOutputThread() {
        return new AnonymousClass1("AndroidVideoDecoder.outputThread");
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        MediaCodecWrapper mediaCodecWrapper;
        boolean z;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                mediaCodecWrapper = this.codec;
                z = false;
            } else {
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.surfaceTextureHelper.setFrameRotation(i2);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                mediaCodecWrapper = this.codec;
                z = true;
            }
            mediaCodecWrapper.releaseOutputBuffer(i, z);
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        StringBuilder sbA0x = C60O.A0x("initDecodeInternal name: ");
        sbA0x.append(this.codecName);
        sbA0x.append(" type: ");
        sbA0x.append(this.codecType);
        sbA0x.append(" width: ");
        sbA0x.append(i);
        sbA0x.append(" height: ");
        sbA0x.append(i2);
        sbA0x.append(" color format: ");
        Logging.d(TAG, BV4.A0l(sbA0x, this.colorFormat));
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
        } else {
            this.width = i;
            this.height = i2;
            this.stride = i;
            this.sliceHeight = i2;
            this.hasDecodedFirstFrame = false;
            this.keyFrameRequired = true;
            try {
                this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
                try {
                    MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                    if (this.lowLatencyEnabled) {
                        mediaFormatCreateVideoFormat.setFeatureEnabled("low-latency", true);
                        mediaFormatCreateVideoFormat.setInteger("low-latency", 1);
                    }
                    if (this.sharedContext == null) {
                        mediaFormatCreateVideoFormat.setInteger("color-format", this.colorFormat);
                    }
                    this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                    this.codec.start();
                    this.configuredWidth = i;
                    this.configuredHeight = i2;
                    this.running = true;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1("AndroidVideoDecoder.outputThread");
                    this.outputThread = anonymousClass1;
                    anonymousClass1.start();
                    Logging.d(TAG, "initDecodeInternal done");
                    return VideoCodecStatus.OK;
                } catch (IllegalArgumentException | IllegalStateException e) {
                    Logging.e(TAG, "initDecode failed", e);
                    release();
                }
            } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
                Logging.e(TAG, FGI.A0M("Cannot create media decoder ", this.codecName));
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        return VideoCodecStatus.FALLBACK_SOFTWARE;
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, AnonymousClass007.A0a("Decoder format changed: ", mediaFormat));
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            integer = mediaFormat.getInteger(HatchWebPageParserKt.WIDTH_ATTR);
            integer2 = mediaFormat.getInteger(HatchWebPageParserKt.HEIGHT_ATTR);
        }
        synchronized (this.dimensionLock) {
            int i3 = this.width;
            if (integer != i3 || integer2 != this.height) {
                if (!this.hasDecodedFirstFrame) {
                    if (integer > 0) {
                        if (integer2 <= 0) {
                        }
                        this.width = integer;
                        this.height = integer2;
                    }
                    Logging.w(TAG, FGI.A0i("Unexpected format dimensions. Configured ", "*", ". New ", "*", ". Skip it", i3, this.height, integer, integer2));
                    return;
                }
                if (!this.adaptivePlaybackEnabled || (i = this.configuredWidth) < integer || (i2 = this.configuredHeight) < integer2) {
                    StringBuilder sbA0y = C60O.A0y("Unexpected size change. Configured ", i3);
                    sbA0y.append("*");
                    sbA0y.append(this.height);
                    sbA0y.append(". New ");
                    sbA0y.append(integer);
                    stopOnOutputThread(BV4.A0c(C60P.A1O("*", sbA0y, integer2)));
                    return;
                }
                StringBuilder sbA0y2 = C60O.A0y("Size change allowed with adaptive playback. Configured ", i);
                sbA0y2.append("*");
                sbA0y2.append(i2);
                BV7.A1G(". Current ", "*", sbA0y2, i3);
                sbA0y2.append(this.height);
                sbA0y2.append(". New ");
                sbA0y2.append(integer);
                Logging.d(TAG, C60P.A1O("*", sbA0y2, integer2));
                this.width = integer;
                this.height = integer2;
            }
            if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                int integer3 = mediaFormat.getInteger("color-format");
                this.colorFormat = integer3;
                Logging.d(TAG, FGI.A0M("Color: 0x", Integer.toHexString(integer3)));
                int i4 = this.colorFormat;
                if (!isSupportedColorFormat(i4)) {
                    stopOnOutputThread(BV7.A0l("Unsupported color format: ", i4));
                    return;
                }
            }
            synchronized (this.dimensionLock) {
                if (mediaFormat.containsKey("stride")) {
                    this.stride = mediaFormat.getInteger("stride");
                }
                if (mediaFormat.containsKey("slice-height")) {
                    this.sliceHeight = mediaFormat.getInteger("slice-height");
                }
                Logging.d(TAG, FGI.A0T("Frame stride and slice height: ", " x ", this.stride, this.sliceHeight));
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        return videoCodecStatusReleaseInternal == VideoCodecStatus.OK ? initDecodeInternal(i, i2) : videoCodecStatusReleaseInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", BV4.A0e(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            }
            this.codec = null;
            this.outputThread = null;
            this.frameInfos.clear();
            return VideoCodecStatus.OK;
        } finally {
            this.codec = null;
            this.outputThread = null;
            this.frameInfos.clear();
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i;
        int i2;
        String str;
        String strA0I;
        this.decoderThreadChecker.checkIsOnValidThread();
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper == null || this.callback == null) {
            StringBuilder sbA0x = C60O.A0x("decode uninitalized, codec: ");
            sbA0x.append(mediaCodecWrapper != null);
            sbA0x.append(", callback: ");
            Logging.d(TAG, C8j3.A14(this.callback, sbA0x));
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            Logging.e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i = this.width;
            i2 = this.height;
        }
        int i3 = encodedImage.encodedWidth;
        int i4 = encodedImage.encodedHeight;
        if (i3 * i4 > 0 && (i3 != i || i4 != i2)) {
            if (!this.adaptivePlaybackEnabled || i3 > this.configuredWidth || i4 > this.configuredHeight) {
                VideoCodecStatus videoCodecStatusReinitDecode = reinitDecode(i3, i4);
                if (videoCodecStatusReinitDecode != VideoCodecStatus.OK) {
                    return videoCodecStatusReinitDecode;
                }
            } else {
                this.keyFrameRequired = true;
                Logging.v(TAG, "decode() - no reinit with adaptive playback enabled");
            }
        }
        if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            Logging.e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (iDequeueInputBuffer < 0) {
                Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.ERROR;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() < iRemaining) {
                    Logging.e(TAG, "decode() - HW buffer too small");
                    return VideoCodecStatus.ERROR;
                }
                inputBuffer.put(encodedImage.buffer);
                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, BV4.A04(encodedImage.captureTimeNs), 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    Logging.e(TAG, "queueInputBuffer failed", e);
                    this.frameInfos.pollLast();
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                str = TAG;
                strA0I = FGI.A0I("getInputBuffer with index=", iDequeueInputBuffer, " failed");
                Logging.e(str, strA0I, e);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            e = e3;
            str = TAG;
            strA0I = "dequeueInputBuffer failed";
        }
    }

    public void deliverDecodedFrame() {
        Integer numValueOf;
        int i;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                Logging.v(TAG, FGI.A0H("dequeueOutputBuffer returned ", iDequeueOutputBuffer));
                return;
            }
            FrameInfo frameInfoPoll = this.frameInfos.poll();
            if (frameInfoPoll != null) {
                numValueOf = Integer.valueOf((int) (SystemClock.elapsedRealtime() - frameInfoPoll.decodeStartTimeMs));
                i = frameInfoPoll.rotation;
            } else {
                numValueOf = null;
                i = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(iDequeueOutputBuffer, bufferInfo, i, numValueOf);
            } else {
                deliverByteFrame(iDequeueOutputBuffer, bufferInfo, i, numValueOf);
            }
        } catch (IllegalStateException e) {
            Logging.e(TAG, "deliverDecodedFrame failed", e);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            SurfaceTextureHelper surfaceTextureHelperCreateSurfaceTextureHelper = createSurfaceTextureHelper();
            this.surfaceTextureHelper = surfaceTextureHelperCreateSurfaceTextureHelper;
            this.surface = new Surface(surfaceTextureHelperCreateSurfaceTextureHelper.surfaceTexture);
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw C3cG.A0Q("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j = decodedTextureMetadata.presentationTimestampUs * 1000;
            num = decodedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.buffer, videoFrame.rotation, j), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.d(TAG, "release");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        return videoCodecStatusReleaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i, boolean z, boolean z2, EglBase.Context context) {
        if (!isSupportedColorFormat(i)) {
            throw BV5.A0Q("Unsupported color format: ", i);
        }
        StringBuilder sbA0x = C3cI.A0x("ctor name: ", str);
        sbA0x.append(" type: ");
        sbA0x.append(videoCodecMimeType);
        sbA0x.append(" color format: ");
        sbA0x.append(i);
        sbA0x.append(" context: ");
        sbA0x.append(context);
        sbA0x.append(" codecSupportsAdaptivePlayback: ");
        sbA0x.append(z);
        Logging.d(TAG, C60P.A1P(" codecSupportsLowLatency: ", sbA0x, z2));
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i;
        this.sharedContext = context;
        this.frameInfos = new LinkedBlockingDeque();
        this.adaptivePlaybackEnabled = z;
        boolean z3 = false;
        this.lowLatencyEnabled = false;
        if (context != null && z2) {
            z3 = true;
            this.lowLatencyEnabled = true;
        }
        Logging.d(TAG, C60P.A1P(" lowLatencyEnabled: ", C60O.A10("adaptivePlaybackEnabled: ", z), z3));
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    @Override // org.webrtc.VideoDecoder
    public /* synthetic */ long createNative(long j) {
        return 0L;
    }
}

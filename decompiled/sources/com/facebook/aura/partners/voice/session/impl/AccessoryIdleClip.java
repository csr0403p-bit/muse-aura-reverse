package com.facebook.aura.partners.voice.session.impl;

import X.ATD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes5.dex */
public final class AccessoryIdleClip {
    public static final long DEQUEUE_TIMEOUT_US = 10000;
    public static final long LOOP_GAP_US = 33000;
    public static final long MAX_FRAME_WAIT_MS = 100;
    public static final String TAG = "AccessoryIdleClip";
    public final SurfaceTextureHelper helper;
    public final G0U<AccessoryIdleClip, Unit> onFailed;
    public final String path;
    public final AtomicBoolean running;
    public static final Companion Companion = new Companion();
    public static final Executor decodeLane = AuraExecutors.INSTANCE.createResponseStreamingSerialExecutor();

    public final class Companion {
        public final AccessoryIdleClip start(String str, EglBase.Context context, final G0U<? super VideoFrame, Unit> g0u, G0U<? super AccessoryIdleClip, Unit> g0u2) {
            AnonymousClass005.A14(str, context, g0u, g0u2);
            try {
                SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create(AccessoryIdleClip.TAG, context);
                if (surfaceTextureHelperCreate == null) {
                    return null;
                }
                surfaceTextureHelperCreate.startListening(new VideoSink() { // from class: com.facebook.aura.partners.voice.session.impl.AccessoryIdleClip$Companion$start$1
                    @Override // org.webrtc.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        G0U<VideoFrame, Unit> g0u3 = g0u;
                        C7384Etj.A0X(videoFrame);
                        g0u3.invoke(videoFrame);
                    }
                });
                final AccessoryIdleClip accessoryIdleClip = new AccessoryIdleClip(str, surfaceTextureHelperCreate, g0u2);
                AccessoryIdleClip.decodeLane.execute(new Runnable() { // from class: com.facebook.aura.partners.voice.session.impl.AccessoryIdleClip$Companion$start$2
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        accessoryIdleClip.run();
                    }
                });
                return accessoryIdleClip;
            } catch (RuntimeException e) {
                CFK.A0K(AccessoryIdleClip.TAG, e, "No surface texture for the idle clip");
                return null;
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[PHI: r4
  0x0083: PHI (r4v4 long) = (r4v2 long), (r4v11 long) binds: [B:18:0x0057, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void decode(android.media.MediaCodec r26, android.media.MediaExtractor r27) throws android.media.MediaCodec.CryptoException, java.lang.InterruptedException {
        /*
            r25 = this;
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo
            r6.<init>()
            long r16 = java.lang.System.nanoTime()
            r2 = 0
            r8 = 0
            r14 = 0
            r4 = 0
        L10:
            r13 = 0
        L11:
            r10 = r25
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.running
            boolean r0 = r0.get()
            if (r0 == 0) goto Lbb
            r7 = r26
            r9 = r27
            if (r13 != 0) goto Lb0
            r0 = 10000(0x2710, double:4.9407E-320)
            int r11 = r7.dequeueInputBuffer(r0)
            if (r11 < 0) goto Lae
            java.nio.ByteBuffer r0 = r7.getInputBuffer(r11)
            if (r0 == 0) goto Lb4
            int r21 = r9.readSampleData(r0, r8)
            if (r21 >= 0) goto L98
            r24 = 4
            r0 = 10000(0x2710, double:4.9407E-320)
            r21 = r8
            r22 = r2
            r18 = r7
            r19 = r11
            r20 = r8
            r18.queueInputBuffer(r19, r20, r21, r22, r24)
            r13 = 1
        L47:
            int r11 = r7.dequeueOutputBuffer(r6, r0)
            if (r11 < 0) goto L11
            int r0 = r6.flags
            r0 = r0 & 4
            boolean r12 = X.AnonymousClass002.A1L(r0)
            int r0 = r6.size
            if (r0 <= 0) goto L83
            long r0 = r6.presentationTimeUs
            long r4 = r14 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r4 = r4 + r16
            long r0 = java.lang.System.nanoTime()
            long r4 = r4 - r0
            long r4 = X.BV4.A05(r4)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L78
            r0 = 100
            long r0 = java.lang.Math.min(r4, r0)
            java.lang.Thread.sleep(r0)
        L78:
            long r4 = r6.presentationTimeUs
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.running
            boolean r1 = r0.get()
            r0 = 1
            if (r1 != 0) goto L84
        L83:
            r0 = 0
        L84:
            r7.releaseOutputBuffer(r11, r0)
            if (r12 == 0) goto L11
            r10 = 33000(0x80e8, double:1.6304E-319)
            long r0 = r4 + r10
            long r14 = r14 + r0
            r0 = 2
            r9.seekTo(r2, r0)
            r7.flush()
            goto L10
        L98:
            r13 = 0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r22 = r9.getSampleTime()
            r18 = r7
            r19 = r11
            r20 = r8
            r24 = r8
            r18.queueInputBuffer(r19, r20, r21, r22, r24)
            r9.advance()
            goto L47
        Lae:
            r13 = 0
            goto Lb1
        Lb0:
            r13 = 1
        Lb1:
            r0 = 10000(0x2710, double:4.9407E-320)
            goto L47
        Lb4:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.AccessoryIdleClip.decode(android.media.MediaCodec, android.media.MediaExtractor):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void run() throws Throwable {
        Integer next;
        MediaExtractor mediaExtractor = new MediaExtractor();
        Surface surface = new Surface(this.helper.surfaceTexture);
        MediaCodec mediaCodec = null;
        try {
            try {
                mediaExtractor.setDataSource(this.path);
                Iterator<Integer> it = ATD.A0C(0, mediaExtractor.getTrackCount()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String string = mediaExtractor.getTrackFormat(AnonymousClass001.A0F(next)).getString("mime");
                    if (string != null && string.startsWith("video/")) {
                        break;
                    }
                }
                Integer num = next;
                if (num != null) {
                    int iIntValue = num.intValue();
                    mediaExtractor.selectTrack(iIntValue);
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(iIntValue);
                    C7384Etj.A0U(trackFormat);
                    this.helper.setTextureSize(trackFormat.getInteger(HatchWebPageParserKt.WIDTH_ATTR), trackFormat.getInteger(HatchWebPageParserKt.HEIGHT_ATTR));
                    String string2 = trackFormat.getString("mime");
                    if (string2 == null) {
                        throw C60O.A0i("Required value was null.");
                    }
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string2);
                    C7384Etj.A0U(mediaCodecCreateDecoderByType);
                    try {
                        mediaCodecCreateDecoderByType.configure(trackFormat, surface, (MediaCrypto) null, 0);
                        mediaCodecCreateDecoderByType.start();
                        decode(mediaCodecCreateDecoderByType, mediaExtractor);
                        try {
                            mediaCodecCreateDecoderByType.stop();
                        } catch (IllegalStateException e) {
                            CFK.A0K(TAG, e, "Failed stopping the idle clip decoder");
                        }
                        mediaCodecCreateDecoderByType.release();
                    } catch (Exception e2) {
                        e = e2;
                        mediaCodec = mediaCodecCreateDecoderByType;
                        CFK.A0K(TAG, e, "Accessory idle clip stopped");
                        if (this.running.get()) {
                            this.onFailed.invoke(this);
                        }
                        if (mediaCodec != null) {
                            try {
                                mediaCodec.stop();
                            } catch (IllegalStateException e3) {
                                CFK.A0K(TAG, e3, "Failed stopping the idle clip decoder");
                            }
                            mediaCodec.release();
                        }
                        mediaExtractor.release();
                        this.helper.stopListening();
                        surface.release();
                        this.helper.dispose();
                    } catch (Throwable th) {
                        th = th;
                        mediaCodec = mediaCodecCreateDecoderByType;
                        try {
                            mediaCodec.stop();
                        } catch (IllegalStateException e4) {
                            CFK.A0K(TAG, e4, "Failed stopping the idle clip decoder");
                        }
                        mediaCodec.release();
                        mediaExtractor.release();
                        this.helper.stopListening();
                        surface.release();
                        this.helper.dispose();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                }
                mediaExtractor.release();
                this.helper.stopListening();
                surface.release();
                this.helper.dispose();
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
        }
        mediaExtractor.release();
        this.helper.stopListening();
        surface.release();
        this.helper.dispose();
    }

    public final void stop() {
        this.running.set(false);
    }

    public /* synthetic */ AccessoryIdleClip(String str, SurfaceTextureHelper surfaceTextureHelper, G0U g0u, C06H c06h) {
        this(str, surfaceTextureHelper, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessoryIdleClip(String str, SurfaceTextureHelper surfaceTextureHelper, G0U<? super AccessoryIdleClip, Unit> g0u) {
        this.path = str;
        this.helper = surfaceTextureHelper;
        this.onFailed = g0u;
        this.running = BV4.A12(true);
    }
}

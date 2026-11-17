package org.webrtc;

import X.BV5;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.C8j3;
import X.FGI;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* loaded from: classes5.dex */
public class SurfaceTextureHelper {
    public static final String TAG = "SurfaceTextureHelper";
    public final EglBase eglBase;
    public final FrameRefMonitor frameRefMonitor;
    public int frameRotation;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public VideoSink listener;
    public final int oesTextureId;
    public VideoSink pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public int textureHeight;
    public final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    public int textureWidth;
    public final TimestampAligner timestampAligner;
    public final YuvConverter yuvConverter;

    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    /* renamed from: lambda$dispose$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m3964lambda$dispose$0$orgwebrtcSurfaceTextureHelper() {
        this.isQuitting = true;
        if (this.isTextureInUse) {
            return;
        }
        release();
    }

    /* renamed from: lambda$forceFrame$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m3965lambda$forceFrame$0$orgwebrtcSurfaceTextureHelper() {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* renamed from: lambda$returnTextureFrame$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m3967lambda$returnTextureFrame$0$orgwebrtcSurfaceTextureHelper() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    /* renamed from: lambda$stopListening$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m3970lambda$stopListening$0$orgwebrtcSurfaceTextureHelper() {
        this.listener = null;
        this.pendingListener = null;
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), null);
    }

    private void release() {
        if (BV7.A13(this.handler) != Thread.currentThread()) {
            throw C3cG.A0Q("Wrong thread.");
        }
        if (this.isTextureInUse || !this.isQuitting) {
            throw C3cG.A0Q("Unexpected release.");
        }
        this.yuvConverter.release();
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3967lambda$returnTextureFrame$0$orgwebrtcSurfaceTextureHelper();
            }
        });
    }

    private void tryDeliverTextureFrame() {
        if (BV7.A13(this.handler) != Thread.currentThread()) {
            throw C3cG.A0Q("Wrong thread.");
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        if (this.textureWidth == 0 || this.textureHeight == 0) {
            Logging.w(TAG, "Texture size has not been set.");
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long timestamp = this.surfaceTexture.getTimestamp();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestamp = timestampAligner.translateTimestamp(timestamp);
        }
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
        FrameRefMonitor frameRefMonitor = this.frameRefMonitor;
        if (frameRefMonitor != null) {
            frameRefMonitor.onNewBuffer(textureBufferImpl);
        }
        VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        Logging.d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3964lambda$dispose$0$orgwebrtcSurfaceTextureHelper();
            }
        });
    }

    public void forceFrame() {
        this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3965lambda$forceFrame$0$orgwebrtcSurfaceTextureHelper();
            }
        });
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    /* renamed from: lambda$new$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m3966lambda$new$0$orgwebrtcSurfaceTextureHelper(SurfaceTexture surfaceTexture) {
        if (this.hasPendingTexture) {
            Logging.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* renamed from: lambda$setTextureSize$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m3969lambda$setTextureSize$0$orgwebrtcSurfaceTextureHelper(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        tryDeliverTextureFrame();
    }

    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.frameRotation = i;
            }
        });
    }

    public void setTextureSize(final int i, final int i2) {
        if (i <= 0) {
            throw BV5.A0Q("Texture width must be positive, but was ", i);
        }
        if (i2 <= 0) {
            throw BV5.A0Q("Texture height must be positive, but was ", i2);
        }
        this.surfaceTexture.setDefaultBufferSize(i, i2);
        this.handler.post(new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3969lambda$setTextureSize$0$orgwebrtcSurfaceTextureHelper(i, i2);
            }
        });
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            throw C3cG.A0Q("SurfaceTextureHelper listener has already been set.");
        }
        this.pendingListener = videoSink;
        this.handler.post(this.setListenerRunnable);
    }

    public void stopListening() {
        Logging.d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3970lambda$stopListening$0$orgwebrtcSurfaceTextureHelper();
            }
        });
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor) {
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.SurfaceTextureHelper.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.this.returnTextureFrame();
                FrameRefMonitor frameRefMonitor2 = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor2 != null) {
                    frameRefMonitor2.onDestroyBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                FrameRefMonitor frameRefMonitor2 = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor2 != null) {
                    frameRefMonitor2.onReleaseBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                FrameRefMonitor frameRefMonitor2 = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor2 != null) {
                    frameRefMonitor2.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                Logging.d(SurfaceTextureHelper.TAG, C8j3.A14(SurfaceTextureHelper.this.pendingListener, C60O.A0x("Setting listener to ")));
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                surfaceTextureHelper.pendingListener = null;
                if (surfaceTextureHelper.hasPendingTexture) {
                    surfaceTextureHelper.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (BV7.A13(handler) != Thread.currentThread()) {
            throw C3cG.A0Q("SurfaceTextureHelper must be created on the handler thread");
        }
        this.handler = handler;
        this.timestampAligner = z ? new TimestampAligner() : null;
        this.yuvConverter = yuvConverter;
        this.frameRefMonitor = frameRefMonitor;
        EglBase eglBaseCreate = EglBase.CC.create(context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = eglBaseCreate;
        try {
            eglBaseCreate.createDummyPbufferSurface();
            eglBaseCreate.makeCurrent();
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
            this.surfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.SurfaceTextureHelper$$ExternalSyntheticLambda4
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    this.f$0.m3966lambda$new$0$orgwebrtcSurfaceTextureHelper(surfaceTexture2);
                }
            }, handler);
        } catch (RuntimeException e) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    /* renamed from: lambda$setFrameRotation$0$org-webrtc-SurfaceTextureHelper, reason: not valid java name */
    public /* synthetic */ void m3968lambda$setFrameRotation$0$orgwebrtcSurfaceTextureHelper(int i) {
        this.frameRotation = i;
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter) {
        return create(str, context, z, yuvConverter, null);
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final YuvConverter yuvConverter, final FrameRefMonitor frameRefMonitor) {
        final Handler handlerA0B = BV5.A0B(new HandlerThread(str));
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handlerA0B, new Callable<SurfaceTextureHelper>() { // from class: org.webrtc.SurfaceTextureHelper.1
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handlerA0B, z, yuvConverter, frameRefMonitor);
                } catch (RuntimeException e) {
                    Logging.e(SurfaceTextureHelper.TAG, FGI.A0M(str, " create failure"), e);
                    return null;
                }
            }
        });
    }
}

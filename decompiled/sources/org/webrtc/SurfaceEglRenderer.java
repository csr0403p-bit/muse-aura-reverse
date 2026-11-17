package org.webrtc;

import X.AnonymousClass002;
import X.BV5;
import X.C3cG;
import X.FGI;
import android.view.SurfaceHolder;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

/* loaded from: classes5.dex */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    public static final String TAG = "SurfaceEglRenderer";
    public int frameRotation;
    public boolean isFirstFrameRendered;
    public boolean isRenderingPaused;
    public final Object layoutLock;
    public RendererCommon.RendererEvents rendererEvents;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;

    private void logD(String str) {
        Logging.d(TAG, FGI.A0U(this.name, ": ", str));
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (!this.isRenderingPaused) {
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    logD("Reporting first rendered frame.");
                    RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.rotation) {
                    logD(FGI.A0Z("Reporting frame resolution changed to ", "x", " with rotation ", videoFrame.buffer.getWidth(), videoFrame.buffer.getHeight(), videoFrame.rotation));
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.buffer.getWidth(), videoFrame.buffer.getHeight(), videoFrame.rotation);
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                    this.frameRotation = videoFrame.rotation;
                }
            }
        }
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        setFpsReduction(0.0f);
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = AnonymousClass002.A1M((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        super.setFpsReduction(f);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
        this.layoutLock = C3cG.A0T();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer, renderSynchronizer);
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        logD(FGI.A0Z("surfaceChanged: format: ", " size: ", "x", i, i2, i3));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        final CountDownLatch countDownLatchA16 = BV5.A16();
        releaseEglSurface(new Runnable() { // from class: org.webrtc.SurfaceEglRenderer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatchA16.countDown();
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatchA16);
    }

    public SurfaceEglRenderer(String str, VideoFrameDrawer videoFrameDrawer, boolean z) {
        super(str, videoFrameDrawer, z);
        this.layoutLock = C3cG.A0T();
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    public SurfaceEglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        super(str, videoFrameDrawer);
        this.layoutLock = C3cG.A0T();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer, renderSynchronizer);
    }
}

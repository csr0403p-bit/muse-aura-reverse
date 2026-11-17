package org.webrtc;

import X.BV4;
import X.BV5;
import X.BV7;
import X.C60O;
import X.FGI;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

/* loaded from: classes5.dex */
public class SurfaceViewRenderer extends SurfaceView implements RendererCommon.RendererEvents, VideoSink, SurfaceHolder.Callback {
    public static final String TAG = "SurfaceViewRenderer";
    public final SurfaceEglRenderer eglRenderer;
    public boolean enableFixedSize;
    public RendererCommon.RendererEvents rendererEvents;
    public final String resourceName;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    public int surfaceHeight;
    public int surfaceWidth;
    public final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    private void logD(String str) {
        Logging.d(TAG, FGI.A0U(this.resourceName, ": ", str));
    }

    public void addFrameDrawnListener(EglRenderer.FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.eglRenderer.addFrameDrawnListener(frameDrawnListenerWithContext);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    /* renamed from: lambda$onFrameResolutionChanged$0$org-webrtc-SurfaceViewRenderer, reason: not valid java name */
    public /* synthetic */ void m3971lambda$onFrameResolutionChanged$0$orgwebrtcSurfaceViewRenderer(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        updateSurfaceSize();
        requestLayout();
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[PHI: r1
  0x0011: PHI (r1v3 int) = (r1v0 int), (r1v4 int) binds: [B:10:0x000f, B:8:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013 A[PHI: r1
  0x0013: PHI (r1v2 int) = (r1v0 int), (r1v3 int) binds: [B:10:0x000f, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameResolutionChanged(final int r3, int r4, int r5) {
        /*
            r2 = this;
            org.webrtc.RendererCommon$RendererEvents r0 = r2.rendererEvents
            if (r0 == 0) goto L7
            r0.onFrameResolutionChanged(r3, r4, r5)
        L7:
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto Le
            r1 = r4
            if (r5 != r0) goto L11
        Le:
            r1 = r3
            if (r5 == 0) goto L13
        L11:
            if (r5 != r0) goto L14
        L13:
            r3 = r4
        L14:
            org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0 r0 = new org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0
            r0.<init>()
            r2.postOrRun(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.SurfaceViewRenderer.onFrameResolutionChanged(int, int, int):void");
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameDrawnListener(EglRenderer.FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.eglRenderer.removeFrameDrawnListener(frameDrawnListenerWithContext);
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == BV5.A0s()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = getWidth() / getHeight();
        int i = this.rotatedFrameWidth;
        float f = i;
        int i2 = this.rotatedFrameHeight;
        float f2 = i2;
        if (f / f2 > width) {
            i = (int) (f2 * width);
        } else {
            i2 = (int) (f / width);
        }
        int iMin = Math.min(getWidth(), i);
        int iMin2 = Math.min(getHeight(), i2);
        StringBuilder sbA0x = C60O.A0x("updateSurfaceSize. Layout size: ");
        sbA0x.append(getWidth());
        sbA0x.append("x");
        sbA0x.append(getHeight());
        sbA0x.append(", frame size: ");
        sbA0x.append(this.rotatedFrameWidth);
        sbA0x.append("x");
        sbA0x.append(this.rotatedFrameHeight);
        BV7.A1G(", requested surface size: ", "x", sbA0x, iMin);
        sbA0x.append(iMin2);
        sbA0x.append(", old surface size: ");
        sbA0x.append(this.surfaceWidth);
        sbA0x.append("x");
        logD(BV4.A0l(sbA0x, this.surfaceHeight));
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
        getHolder().setFixedSize(iMin, iMin2);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point pointMeasure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
        logD(FGI.A0T("onMeasure(). New size: ", "x", pointMeasure.x, pointMeasure.y));
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType);
        requestLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, RenderSynchronizer renderSynchronizer) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer(), renderSynchronizer);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer, renderSynchronizer);
    }
}

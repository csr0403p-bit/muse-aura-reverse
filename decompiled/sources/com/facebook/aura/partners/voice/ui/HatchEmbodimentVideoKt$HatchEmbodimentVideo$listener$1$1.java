package com.facebook.aura.partners.voice.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C7384Etj;
import X.C8j4;
import X.F1F;
import X.G0U;
import X.G0W;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import com.facebook.aura.partners.voice.ui.BackdropFrameReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C1BO<Function0<Long>> $currentEdgeSampleGeneration$delegate;
    public final /* synthetic */ C1BO<Boolean> $currentMatchBackdrop$delegate;
    public final /* synthetic */ C1BO<G0U<Integer, Unit>> $currentOnBackdropColorSampled$delegate;
    public final /* synthetic */ C1BO<G0W<Long, EmbodimentEdge, Integer, Unit>> $currentOnEdgeColorSampled$delegate;
    public final /* synthetic */ C1BO<G0U<Bitmap, Unit>> $currentOnFrameBeforeSurfaceLoss$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnFrameRendered$delegate;
    public final /* synthetic */ C1BO<G0W<Surface, Integer, Integer, Unit>> $currentOnSurfaceAvailable$delegate;
    public final /* synthetic */ C1BO<G0U<Surface, Unit>> $currentOnSurfaceDestroyed$delegate;
    public final /* synthetic */ C1BO<G0W<Surface, Integer, Integer, Unit>> $currentOnSurfaceResized$delegate;
    public SurfaceTexture attachedTexture;
    public boolean backdropSamplePending;
    public boolean backdropSampleTaskScheduled;
    public boolean backdropSamplingWarmupPending;
    public int consecutiveBackdropReadFailures;
    public Object edgeOwner;
    public View edgeView;
    public boolean framePainted;
    public boolean isBackdropSamplingEnabled;
    public boolean isEdgeSamplingEnabled;
    public EmbodimentEdge pendingEdge;
    public boolean preferBackdropSample;
    public Surface surface;
    public TextureView view;
    public Window window;
    public final EmbodimentBackdropSampler backdropSampler = new EmbodimentBackdropSampler(8, 12, 4, 40, 500);
    public final BackdropFrameReader backdropFrameReader = new BackdropFrameReader();
    public final Runnable backdropSampleTask = new Runnable() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$backdropSampleTask$1
        @Override // java.lang.Runnable
        public final void run() {
            this.this$0.sampleBackdropIfNeeded();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeBackdropSample(BackdropFrameReader.PixelCopyColorResult pixelCopyColorResult) {
        G0U g0uA0B;
        this.backdropSamplePending = false;
        if (!this.isBackdropSamplingEnabled) {
            scheduleBackdropSample(0L);
            return;
        }
        this.preferBackdropSample = false;
        if (pixelCopyColorResult.succeeded) {
            this.consecutiveBackdropReadFailures = 0;
            Integer numCompleteSample = this.backdropSampler.completeSample(pixelCopyColorResult.color);
            if (numCompleteSample != null && (g0uA0B = C1BO.A0B(this.$currentOnBackdropColorSampled$delegate)) != null) {
                g0uA0B.invoke(numCompleteSample);
            }
        } else {
            this.consecutiveBackdropReadFailures++;
        }
        if (this.consecutiveBackdropReadFailures >= 12 || this.backdropSampler.finished) {
            this.backdropFrameReader.release();
        }
        if (this.isEdgeSamplingEnabled) {
            scheduleNextEdgeSample();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeEdgeSample(EmbodimentEdge embodimentEdge, long j, BackdropFrameReader.PixelCopyColorResult pixelCopyColorResult) {
        G0W<Long, EmbodimentEdge, Integer, Unit> value;
        this.backdropSamplePending = false;
        this.preferBackdropSample = true;
        if (pixelCopyColorResult.succeeded && this.isEdgeSamplingEnabled && (value = this.$currentOnEdgeColorSampled$delegate.getValue()) != null) {
            value.invoke(Long.valueOf(j), embodimentEdge, pixelCopyColorResult.color);
        }
        scheduleBackdropSample(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sampleBackdropIfNeeded() {
        TextureView textureView;
        boolean z = false;
        this.backdropSampleTaskScheduled = false;
        if (this.backdropSamplePending || !hasSamplingWork() || (textureView = this.view) == null) {
            return;
        }
        View view = this.edgeView;
        if (view == null) {
            view = textureView;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Surface surface = this.surface;
        Boolean boolSampleStrictness = (hasBackdropSamplingWork() && textureView.isShown() && textureView.getWindowVisibility() == 0 && this.attachedTexture != null && surface != null) ? this.backdropSampler.sampleStrictness(jUptimeMillis) : null;
        if (this.isEdgeSamplingEnabled && this.backdropSampler.edgeSampleDelayMs(jUptimeMillis, AnonymousClass002.A1X(this.pendingEdge)) == 0) {
            z = true;
        }
        F1F f1f = new F1F();
        if ((this.preferBackdropSample && sampleBackdropIfNeeded$startBackdropSample(boolSampleStrictness, surface, this, textureView, jUptimeMillis)) || sampleBackdropIfNeeded$startEdgeSample(z, this, f1f, view, textureView, jUptimeMillis, this.$currentEdgeSampleGeneration$delegate)) {
            return;
        }
        if (this.preferBackdropSample || !sampleBackdropIfNeeded$startBackdropSample(boolSampleStrictness, surface, this, textureView, jUptimeMillis)) {
            if (!z || f1f.element) {
                scheduleNextEdgeSample();
            } else {
                scheduleBackdropSample(40L);
            }
        }
    }

    public static final boolean sampleBackdropIfNeeded$startBackdropSample(Boolean bool, Surface surface, HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, TextureView textureView, long j) {
        boolean zSampleBackdrop = false;
        if (bool != null && surface != null) {
            if (hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropSamplingWarmupPending) {
                hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropSamplingWarmupPending = false;
            } else {
                zSampleBackdrop = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropFrameReader.sampleBackdrop(surface, textureView, bool.booleanValue(), new HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$sampleBackdropIfNeeded$startBackdropSample$started$1(hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1));
                if (zSampleBackdrop) {
                    hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropSamplePending = true;
                    hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropSampler.lastAttemptMs = j;
                    return zSampleBackdrop;
                }
            }
        }
        return zSampleBackdrop;
    }

    public static final boolean sampleBackdropIfNeeded$startEdgeSample(boolean z, HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, F1F f1f, View view, TextureView textureView, long j, C1BO<? extends Function0<Long>> c1bo) {
        EmbodimentEdge embodimentEdge;
        if (z) {
            EmbodimentEdge embodimentEdge2 = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.pendingEdge;
            if (embodimentEdge2 == null) {
                embodimentEdge2 = EmbodimentEdge.TOP;
            }
            Window window = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.window;
            if (window != null) {
                long jA0Q = C8j4.A0Q(C1BO.A0A(c1bo));
                f1f.element = true;
                boolean zSampleEdge = hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropFrameReader.sampleEdge(window, view, textureView, embodimentEdge2, new HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$sampleBackdropIfNeeded$startEdgeSample$started$1(hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, embodimentEdge2, jA0Q));
                if (embodimentEdge2 == EmbodimentEdge.TOP) {
                    hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropSampler.lastEdgeCycleMs = j;
                    embodimentEdge = EmbodimentEdge.BOTTOM;
                } else {
                    embodimentEdge = null;
                }
                hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.pendingEdge = embodimentEdge;
                if (zSampleEdge) {
                    hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.backdropSamplePending = true;
                }
                return zSampleEdge;
            }
        }
        return false;
    }

    public final void attachView(TextureView textureView) {
        C7384Etj.A0Y(textureView, 0);
        TextureView textureView2 = this.view;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                G0U g0uA0B = C1BO.A0B(this.$currentOnFrameBeforeSurfaceLoss$delegate);
                if (g0uA0B != null) {
                    g0uA0B.invoke(captureFrame());
                }
                cancelBackdropRead();
                releaseSurface();
            }
            this.view = textureView;
            Context context = textureView.getContext();
            C7384Etj.A0U(context);
            Activity activityFindActivity = HatchEmbodimentVideoKt.findActivity(context);
            this.window = activityFindActivity != null ? activityFindActivity.getWindow() : null;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C7384Etj.A0Y(surfaceTexture, 0);
        TextureView textureView = this.view;
        if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
            return;
        }
        SurfaceTexture surfaceTexture2 = this.attachedTexture;
        if (surfaceTexture2 != null && surfaceTexture2 != surfaceTexture) {
            textureView.setSurfaceTexture(surfaceTexture2);
        }
        restartBackdropSampling();
        if (surfaceTexture2 != null) {
            surfaceTexture = surfaceTexture2;
        }
        bindOrResize(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C7384Etj.A0Y(surfaceTexture, 0);
        if (surfaceTexture != this.attachedTexture) {
            return true;
        }
        cancelBackdropRead();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C7384Etj.A0Y(surfaceTexture, 0);
        cancelBackdropRead();
        bindOrResize(surfaceTexture, i, i2);
        scheduleBackdropSample(0L);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C7384Etj.A0Y(surfaceTexture, 0);
        if (surfaceTexture == this.attachedTexture) {
            if (this.framePainted || hasFrameContent()) {
                this.framePainted = true;
                C1BO.A0D(this.$currentOnFrameRendered$delegate);
                scheduleBackdropSample(0L);
            }
        }
    }

    public final void release(TextureView textureView) {
        C7384Etj.A0Y(textureView, 0);
        if (this.view == textureView) {
            G0U g0uA0B = C1BO.A0B(this.$currentOnFrameBeforeSurfaceLoss$delegate);
            if (g0uA0B != null) {
                g0uA0B.invoke(captureFrame());
            }
            this.isBackdropSamplingEnabled = false;
            this.isEdgeSamplingEnabled = false;
            restartBackdropSampling();
            releaseSurface();
            this.view = null;
            this.edgeView = null;
            this.edgeOwner = null;
            this.window = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1(C1BO<? extends G0U<? super Bitmap, Unit>> c1bo, C1BO<? extends G0W<? super Surface, ? super Integer, ? super Integer, Unit>> c1bo2, C1BO<? extends G0W<? super Surface, ? super Integer, ? super Integer, Unit>> c1bo3, C1BO<? extends Function0<Unit>> c1bo4, C1BO<Boolean> c1bo5, C1BO<? extends Function0<Long>> c1bo6, C1BO<? extends G0U<? super Integer, Unit>> c1bo7, C1BO<? extends G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit>> c1bo8, C1BO<? extends G0U<? super Surface, Unit>> c1bo9) {
        this.$currentOnFrameBeforeSurfaceLoss$delegate = c1bo;
        this.$currentOnSurfaceResized$delegate = c1bo2;
        this.$currentOnSurfaceAvailable$delegate = c1bo3;
        this.$currentOnFrameRendered$delegate = c1bo4;
        this.$currentMatchBackdrop$delegate = c1bo5;
        this.$currentEdgeSampleGeneration$delegate = c1bo6;
        this.$currentOnBackdropColorSampled$delegate = c1bo7;
        this.$currentOnEdgeColorSampled$delegate = c1bo8;
        this.$currentOnSurfaceDestroyed$delegate = c1bo9;
    }

    private final void bindOrResize(SurfaceTexture surfaceTexture, int i, int i2) {
        C1BO<G0W<Surface, Integer, Integer, Unit>> c1bo;
        TextureView textureView = this.view;
        if ((textureView != null ? textureView.getSurfaceTexture() : null) == surfaceTexture) {
            Surface surface = this.surface;
            if (surface == null || this.attachedTexture != surfaceTexture) {
                releaseSurface();
                surface = new Surface(surfaceTexture);
                this.attachedTexture = surfaceTexture;
                this.surface = surface;
                c1bo = this.$currentOnSurfaceAvailable$delegate;
            } else {
                c1bo = this.$currentOnSurfaceResized$delegate;
            }
            AnonymousClass001.A1G(surface, Integer.valueOf(i), c1bo.getValue(), i2);
        }
    }

    private final void cancelBackdropSample() {
        TextureView textureView = this.view;
        if (textureView != null) {
            textureView.removeCallbacks(this.backdropSampleTask);
        }
        this.backdropSampleTaskScheduled = false;
        this.backdropSamplePending = false;
    }

    private final boolean hasBackdropSamplingWork() {
        return this.isBackdropSamplingEnabled && this.consecutiveBackdropReadFailures < 12 && !this.backdropSampler.finished;
    }

    private final boolean hasFrameContent() {
        Bitmap bitmap = (Bitmap) HatchEmbodimentMediaKt.captureEmbodimentFrame(new HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$hasFrameContent$sample$1(this));
        if (bitmap == null) {
            return false;
        }
        try {
            return (bitmap.getPixel(0, 0) >>> 24) != 0;
        } finally {
            bitmap.recycle();
        }
    }

    private final boolean hasSamplingWork() {
        if (C1BO.A0F(this.$currentMatchBackdrop$delegate)) {
            return hasBackdropSamplingWork() || this.isEdgeSamplingEnabled;
        }
        return false;
    }

    private final void releaseSurface() {
        SurfaceTexture surfaceTexture = this.attachedTexture;
        this.attachedTexture = null;
        this.framePainted = false;
        Surface surface = this.surface;
        if (surface != null) {
            this.surface = null;
            try {
                C8j4.A1J(this.$currentOnSurfaceDestroyed$delegate, surface);
            } finally {
                this.backdropFrameReader.releaseSurface(surface);
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
        }
    }

    private final void scheduleBackdropSample(long j) {
        TextureView textureView;
        if (this.backdropSamplePending || !hasSamplingWork() || (textureView = this.view) == null) {
            return;
        }
        if (this.backdropSampleTaskScheduled) {
            if (j > 0) {
                return;
            } else {
                textureView.removeCallbacks(this.backdropSampleTask);
            }
        }
        this.backdropSampleTaskScheduled = true;
        Runnable runnable = this.backdropSampleTask;
        if (j <= 0) {
            textureView.postOnAnimation(runnable);
        } else {
            if (textureView.postDelayed(runnable, j)) {
                return;
            }
            this.backdropSampleTaskScheduled = false;
        }
    }

    public static /* synthetic */ void scheduleBackdropSample$default(HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1 hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        hatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.scheduleBackdropSample(j);
    }

    private final void scheduleNextEdgeSample() {
        if (this.isEdgeSamplingEnabled) {
            scheduleBackdropSample(this.backdropSampler.edgeSampleDelayMs(SystemClock.uptimeMillis(), AnonymousClass002.A1X(this.pendingEdge)));
        }
    }

    public final Bitmap captureFrame() {
        return (Bitmap) HatchEmbodimentMediaKt.captureEmbodimentFrame(new HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1$captureFrame$1(this));
    }

    public final void setEdgeSamplingSource(View view, Object obj) {
        if (this.edgeView == view && C7384Etj.areEqual(this.edgeOwner, obj)) {
            return;
        }
        this.edgeView = view;
        this.edgeOwner = obj;
        cancelBackdropRead();
        this.pendingEdge = null;
        this.backdropSampler.resetEdgeCycle();
        if (hasSamplingWork()) {
            scheduleBackdropSample(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSamplingEnabled(boolean r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3.isBackdropSamplingEnabled
            r2 = 0
            if (r0 != 0) goto La
            boolean r0 = r3.isEdgeSamplingEnabled
            r1 = 0
            if (r0 == 0) goto Lb
        La:
            r1 = 1
        Lb:
            boolean r0 = r3.isEdgeSamplingEnabled
            if (r0 == r5) goto L10
            r2 = 1
        L10:
            r3.isBackdropSamplingEnabled = r4
            r3.isEdgeSamplingEnabled = r5
            r0 = 0
            if (r2 == 0) goto L1e
            r3.pendingEdge = r0
            com.facebook.aura.partners.voice.ui.EmbodimentBackdropSampler r0 = r3.backdropSampler
            r0.resetEdgeCycle()
        L1e:
            if (r1 == 0) goto L28
            if (r4 != 0) goto L28
            if (r5 != 0) goto L28
            r3.cancelBackdropRead()
        L27:
            return
        L28:
            boolean r0 = r3.hasSamplingWork()
            if (r0 == 0) goto L27
            r0 = 0
            r3.scheduleBackdropSample(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt$HatchEmbodimentVideo$listener$1$1.setSamplingEnabled(boolean, boolean):void");
    }

    public final void cancelBackdropRead() {
        cancelBackdropSample();
        this.backdropFrameReader.release();
    }

    public final void restartBackdropSampling() {
        cancelBackdropRead();
        this.consecutiveBackdropReadFailures = 0;
        this.pendingEdge = null;
        this.backdropSampler.reset();
        this.backdropSamplingWarmupPending = true;
        this.preferBackdropSample = false;
        scheduleBackdropSample(0L);
    }
}

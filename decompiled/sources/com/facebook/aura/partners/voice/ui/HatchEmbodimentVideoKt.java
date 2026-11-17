package com.facebook.aura.partners.voice.ui;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.F0C;
import X.G0U;
import X.G0V;
import X.G0W;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchEmbodimentVideoKt {
    public static final int BACKDROP_EDGE_RELAXED_SPREAD_LIMIT = 48;
    public static final int BACKDROP_EDGE_SAMPLE_COUNT = 33;
    public static final int BACKDROP_EDGE_SPREAD_LIMIT = 24;
    public static final int BACKDROP_NEAR_BLACK_MAX_CHANNEL = 32;
    public static final long BACKDROP_PIXEL_COPY_TIMEOUT_MS = 1000;
    public static final int BACKDROP_SAMPLE_ACCEPTED_TARGET = 4;
    public static final long BACKDROP_SAMPLE_BACKOFF_INTERVAL_MS = 500;
    public static final int BACKDROP_SAMPLE_HORIZONTAL_INSET_DP = 20;
    public static final long BACKDROP_SAMPLE_INTERVAL_MS = 40;
    public static final int BACKDROP_SAMPLE_MAX_ATTEMPTS = 12;
    public static final int BACKDROP_SAMPLE_STABLE_CHANNEL_DELTA = 4;
    public static final int BACKDROP_SAMPLE_STRICT_ATTEMPTS = 8;
    public static final int BACKDROP_SAMPLE_VERTICAL_INSET_DP = 4;
    public static final int EDGE_SAMPLE_COUNT = 9;
    public static final long EDGE_SAMPLE_INTERVAL_MS = 250;
    public static final int HATCH_VIDEO_FALLBACK_BACKDROP = -65542;
    public static final F0C backdropPixelCopyExecutor$delegate = AbstractC5321DgF.A03(HatchEmbodimentVideoKt$backdropPixelCopyExecutor$2.INSTANCE);

    /* renamed from: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt$HatchEmbodimentVideo$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $backdropSamplingEnabled;
        public final /* synthetic */ long $backdropSamplingGeneration;
        public final /* synthetic */ Function0<Long> $edgeSampleGeneration;
        public final /* synthetic */ boolean $edgeSamplingEnabled;
        public final /* synthetic */ Object $edgeSamplingOwner;
        public final /* synthetic */ View $edgeSamplingView;
        public final /* synthetic */ boolean $matchBackdrop;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onBackdropColorSampled;
        public final /* synthetic */ G0W<Long, EmbodimentEdge, Integer, Unit> $onEdgeColorSampled;
        public final /* synthetic */ G0U<Bitmap, Unit> $onFrameBeforeSurfaceLoss;
        public final /* synthetic */ G0U<Function0<Bitmap>, Unit> $onFrameCaptureAvailable;
        public final /* synthetic */ Function0<Unit> $onFrameRendered;
        public final /* synthetic */ G0W<Surface, Integer, Integer, Unit> $onSurfaceAvailable;
        public final /* synthetic */ G0U<Surface, Unit> $onSurfaceDestroyed;
        public final /* synthetic */ G0W<Surface, Integer, Integer, Unit> $onSurfaceResized;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(G0W<? super Surface, ? super Integer, ? super Integer, Unit> g0w, G0W<? super Surface, ? super Integer, ? super Integer, Unit> g0w2, G0U<? super Surface, Unit> g0u, BRg bRg, Function0<Unit> function0, G0U<? super Function0<Bitmap>, Unit> g0u2, G0U<? super Bitmap, Unit> g0u3, boolean z, boolean z2, boolean z3, long j, G0U<? super Integer, Unit> g0u4, Function0<Long> function02, G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit> g0w3, View view, Object obj, int i, int i2, int i3) {
            super(2);
            this.$onSurfaceAvailable = g0w;
            this.$onSurfaceResized = g0w2;
            this.$onSurfaceDestroyed = g0u;
            this.$modifier = bRg;
            this.$onFrameRendered = function0;
            this.$onFrameCaptureAvailable = g0u2;
            this.$onFrameBeforeSurfaceLoss = g0u3;
            this.$matchBackdrop = z;
            this.$backdropSamplingEnabled = z2;
            this.$edgeSamplingEnabled = z3;
            this.$backdropSamplingGeneration = j;
            this.$onBackdropColorSampled = g0u4;
            this.$edgeSampleGeneration = function02;
            this.$onEdgeColorSampled = g0w3;
            this.$edgeSamplingView = view;
            this.$edgeSamplingOwner = obj;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchEmbodimentVideoKt.HatchEmbodimentVideo(this.$onSurfaceAvailable, this.$onSurfaceResized, this.$onSurfaceDestroyed, this.$modifier, this.$onFrameRendered, this.$onFrameCaptureAvailable, this.$onFrameBeforeSurfaceLoss, this.$matchBackdrop, this.$backdropSamplingEnabled, this.$edgeSamplingEnabled, this.$backdropSamplingGeneration, this.$onBackdropColorSampled, this.$edgeSampleGeneration, this.$onEdgeColorSampled, this.$edgeSamplingView, this.$edgeSamplingOwner, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ int access$colorChannel(int i, int i2) {
        return (i >>> i2) & 255;
    }

    public static final int colorChannel(int i, int i2) {
        return (i >>> i2) & 255;
    }

    public static final Integer resolveBackdropColor(List<Integer> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        if (!list.isEmpty()) {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<Integer> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (((AnonymousClass001.A0F(next) >>> 24) & 255) == 255) {
                    arrayListA0h.add(next);
                }
            }
            int size = list.size();
            if (!z) {
                size = ((size * 3) + 3) / 4;
            }
            if (arrayListA0h.size() >= size) {
                ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    C60Q.A1P(arrayListA0m, (C60Q.A03(it2) >>> 16) & 255);
                }
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h);
                Iterator it3 = arrayListA0h.iterator();
                while (it3.hasNext()) {
                    C60Q.A1P(arrayListA0m2, (C60Q.A03(it3) >>> 8) & 255);
                }
                ArrayList arrayListA0m3 = AnonymousClass002.A0m(arrayListA0h);
                Iterator it4 = arrayListA0h.iterator();
                while (it4.hasNext()) {
                    C60Q.A1P(arrayListA0m3, (C60Q.A03(it4) >>> 0) & 255);
                }
                int i = z ? 24 : 48;
                if (spread(arrayListA0m) <= i && spread(arrayListA0m2) <= i && spread(arrayListA0m3) <= i) {
                    int iMedianBackdropColor = medianBackdropColor(arrayListA0h);
                    int iMax = Math.max((iMedianBackdropColor >>> 16) & 255, Math.max((iMedianBackdropColor >>> 8) & 255, (iMedianBackdropColor >>> 0) & 255));
                    Integer numValueOf = Integer.valueOf(iMedianBackdropColor);
                    if (iMax > 32) {
                        return numValueOf;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0172 A[PHI: r12
  0x0172: PHI (r12v16 boolean) = (r12v12 boolean), (r12v17 boolean) binds: [B:88:0x0170, B:86:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d A[PHI: r12
  0x017d: PHI (r12v13 boolean) = (r12v12 boolean), (r12v16 boolean), (r12v16 boolean), (r12v16 boolean) binds: [B:88:0x0170, B:89:0x0172, B:90:0x0174, B:92:0x017b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchEmbodimentVideo(X.G0W<? super android.view.Surface, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r35, X.G0W<? super android.view.Surface, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r36, X.G0U<? super android.view.Surface, kotlin.Unit> r37, X.BRg r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, X.G0U<? super kotlin.jvm.functions.Function0<android.graphics.Bitmap>, kotlin.Unit> r40, X.G0U<? super android.graphics.Bitmap, kotlin.Unit> r41, boolean r42, boolean r43, boolean r44, long r45, X.G0U<? super java.lang.Integer, kotlin.Unit> r47, kotlin.jvm.functions.Function0<java.lang.Long> r48, X.G0W<? super java.lang.Long, ? super com.facebook.aura.partners.voice.ui.EmbodimentEdge, ? super java.lang.Integer, kotlin.Unit> r49, android.view.View r50, java.lang.Object r51, X.BFM r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt.HatchEmbodimentVideo(X.G0W, X.G0W, X.G0U, X.BRg, kotlin.jvm.functions.Function0, X.G0U, X.G0U, boolean, boolean, boolean, long, X.G0U, kotlin.jvm.functions.Function0, X.G0W, android.view.View, java.lang.Object, X.BFM, int, int, int):void");
    }

    public static final boolean backdropColorsConverged(int i, int i2) {
        return Math.max(Math.abs(((i >>> 16) & 255) - ((i2 >>> 16) & 255)), Math.max(Math.abs(((i >>> 8) & 255) - ((i2 >>> 8) & 255)), Math.abs(((i >>> 0) & 255) - ((i2 >>> 0) & 255)))) <= 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        return (android.app.Activity) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.app.Activity findActivity(android.content.Context r3) {
        /*
        L0:
            boolean r2 = r3 instanceof android.content.ContextWrapper
            r1 = 0
            boolean r0 = r3 instanceof android.app.Activity
            if (r2 == 0) goto L14
            if (r0 != 0) goto L16
            r0 = r3
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r0 == r3) goto L19
            r3 = r0
            goto L0
        L14:
            if (r0 == 0) goto L19
        L16:
            android.app.Activity r3 = (android.app.Activity) r3
            return r3
        L19:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt.findActivity(android.content.Context):android.app.Activity");
    }

    public static final ExecutorService getBackdropPixelCopyExecutor() {
        return (ExecutorService) backdropPixelCopyExecutor$delegate.getValue();
    }

    public static final int opaqueColor(int i, int i2, int i3) {
        return (i << 16) | (-16777216) | (i2 << 8) | i3;
    }

    public static final G0W<Long, EmbodimentEdge, Integer, Unit> HatchEmbodimentVideo$lambda$11(C1BO<? extends G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final G0W<Surface, Integer, Integer, Unit> HatchEmbodimentVideo$lambda$3(C1BO<? extends G0W<? super Surface, ? super Integer, ? super Integer, Unit>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final G0W<Surface, Integer, Integer, Unit> HatchEmbodimentVideo$lambda$4(C1BO<? extends G0W<? super Surface, ? super Integer, ? super Integer, Unit>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final /* synthetic */ G0W access$HatchEmbodimentVideo$lambda$11(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final /* synthetic */ G0W access$HatchEmbodimentVideo$lambda$3(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final /* synthetic */ G0W access$HatchEmbodimentVideo$lambda$4(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final int median(List<Integer> list) {
        List listA0W = AbstractC0878AGe.A0W(list);
        int size = listA0W.size() / 2;
        return listA0W.size() % 2 == 0 ? (C8j4.A0H(listA0W, size - 1) + C8j4.A0H(listA0W, size)) / 2 : C8j4.A0H(listA0W, size);
    }

    public static final int medianBackdropColor(List<Integer> list) {
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            C60Q.A1P(arrayListA0m, (C60Q.A03(it) >>> 16) & 255);
        }
        int iMedian = median(arrayListA0m);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            C60Q.A1P(arrayListA0m2, (C60Q.A03(it2) >>> 8) & 255);
        }
        int iMedian2 = median(arrayListA0m2);
        ArrayList arrayListA0m3 = AnonymousClass002.A0m(list);
        Iterator<Integer> it3 = list.iterator();
        while (it3.hasNext()) {
            C60Q.A1P(arrayListA0m3, (C60Q.A03(it3) >>> 0) & 255);
        }
        return opaqueColor(iMedian, iMedian2, median(arrayListA0m3));
    }

    public static final int spread(List<Integer> list) {
        int iA0F = AnonymousClass001.A0F(AbstractC0878AGe.A08(list));
        C7384Etj.A0Y(list, 0);
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return iA0F - AnonymousClass001.A0F(comparable);
    }
}

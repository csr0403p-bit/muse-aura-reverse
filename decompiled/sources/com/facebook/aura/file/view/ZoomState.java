package com.facebook.aura.file.view;

import X.AOW;
import X.AQY;
import X.ARY;
import X.AT5;
import X.AT8;
import X.ATD;
import X.AVd;
import X.AWA;
import X.AWx;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BBP;
import X.C06H;
import X.C1003AOr;
import X.C1BO;
import X.C3UX;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ZoomState {
    public static final int $stable = 0;
    public long canvasSize;
    public final C1BO isZoomed$delegate;
    public final Float maxScale;
    public long mediaSize;
    public final AT5<AWx, ARY> offsetAnimation;
    public final AT5<Float, AOW> scaleAnimation;
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.file.view.ZoomState$animateToValidBounds$1", f = "FileViewerZoom.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ZoomState$animateToValidBounds$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $coercedScale;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$coercedScale = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ZoomState.this.new AnonymousClass1(this.$coercedScale, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<Float, AOW> at5 = ZoomState.this.scaleAnimation;
                Float f = new Float(this.$coercedScale);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, at5.A08, f, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.ZoomState$animateToValidBounds$2", f = "FileViewerZoom.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ZoomState$animateToValidBounds$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $coercedOffset;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$coercedOffset = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ZoomState.this.new AnonymousClass2(this.$coercedOffset, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<AWx, ARY> at5 = ZoomState.this.offsetAnimation;
                AWx aWx = new AWx(this.$coercedOffset);
                C1003AOr c1003AOrA0Q = AnonymousClass003.A0Q(null);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, c1003AOrA0Q, aWx, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.file.view.ZoomState$isZoomed$2, reason: invalid class name and case insensitive filesystem */
    public final class C119882 extends AbstractC7559F3s implements Function0<Boolean> {
        public C119882() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r3 = this;
                com.facebook.aura.file.view.ZoomState r0 = com.facebook.aura.file.view.ZoomState.this
                X.AT5<java.lang.Float, X.AOW> r0 = r0.scaleAnimation
                androidx.compose.runtime.MutableState r0 = r0.A0B
                java.lang.Object r0 = r0.getValue()
                float r1 = X.AnonymousClass001.A02(r0)
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 != 0) goto L42
                com.facebook.aura.file.view.ZoomState r0 = com.facebook.aura.file.view.ZoomState.this
                X.AT5<X.AWx, X.ARY> r0 = r0.offsetAnimation
                androidx.compose.runtime.MutableState r0 = r0.A0B
                java.lang.Object r0 = r0.getValue()
                X.AWx r0 = (X.AWx) r0
                long r0 = r0.A00
                float r0 = X.AnonymousClass003.A03(r0)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L42
                com.facebook.aura.file.view.ZoomState r0 = com.facebook.aura.file.view.ZoomState.this
                X.AT5<X.AWx, X.ARY> r0 = r0.offsetAnimation
                androidx.compose.runtime.MutableState r0 = r0.A0B
                java.lang.Object r0 = r0.getValue()
                X.AWx r0 = (X.AWx) r0
                long r0 = r0.A00
                float r0 = X.AnonymousClass004.A00(r0)
                int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r0 = 0
                if (r1 == 0) goto L43
            L42:
                r0 = 1
            L43:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.ZoomState.C119882.invoke():java.lang.Boolean");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.ZoomState$resetZoom$1", f = "FileViewerZoom.kt", l = {111}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ZoomState$resetZoom$1, reason: invalid class name and case insensitive filesystem */
    public final class C119891 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C119891(HtJ<? super C119891> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ZoomState.this.new C119891(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<Float, AOW> at5 = ZoomState.this.scaleAnimation;
                Float fA0m = AnonymousClass001.A0m();
                this.label = 1;
                if (at5.A04(fA0m, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ZoomState.this.new C119891(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.ZoomState$resetZoom$2", f = "FileViewerZoom.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ZoomState$resetZoom$2, reason: invalid class name and case insensitive filesystem */
    public final class C119902 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C119902(HtJ<? super C119902> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ZoomState.this.new C119902(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<AWx, ARY> at5 = ZoomState.this.offsetAnimation;
                AWx aWx = new AWx(0L);
                this.label = 1;
                if (at5.A04(aWx, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ZoomState.this.new C119902(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.ZoomState$resetZoomAnimated$1", f = "FileViewerZoom.kt", l = {106}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ZoomState$resetZoomAnimated$1, reason: invalid class name and case insensitive filesystem */
    public final class C119911 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C119911(HtJ<? super C119911> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ZoomState.this.new C119911(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<Float, AOW> at5 = ZoomState.this.scaleAnimation;
                Float fA0m = AnonymousClass001.A0m();
                this.label = 1;
                if (AnonymousClass002.A0i(at5, at5.A08, fA0m, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ZoomState.this.new C119911(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.ZoomState$resetZoomAnimated$2", f = "FileViewerZoom.kt", l = {107}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ZoomState$resetZoomAnimated$2, reason: invalid class name and case insensitive filesystem */
    public final class C119922 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C119922(HtJ<? super C119922> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ZoomState.this.new C119922(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<AWx, ARY> at5 = ZoomState.this.offsetAnimation;
                AWx aWx = new AWx(0L);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, at5.A08, aWx, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ZoomState.this.new C119922(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ZoomState(C3UX c3ux, Float f) {
        C7384Etj.A0Y(c3ux, 0);
        this.scope = c3ux;
        this.maxScale = f;
        this.offsetAnimation = new AT5<>(AVd.A06, new AWx(0L), null);
        this.scaleAnimation = AT8.A00(1.0f);
        this.isZoomed$delegate = new BBP(null, new C119882());
        long j = 1 | (1 << 32);
        this.canvasSize = j;
        this.mediaSize = j;
    }

    /* renamed from: transform-Uv8p0NA, reason: not valid java name */
    public final void m936transformUv8p0NA(float f, long j) {
        float fA03 = ATD.A03(MutableState.A00(this.scaleAnimation) * f, 0.5f, getMaxZoom());
        long jA02 = AWx.A02(m933getOffsetF1C5BW0(), fA03 / MutableState.A00(this.scaleAnimation));
        AnonymousClass001.A1J(new ZoomState$transform$1(this, jA02, j, fA03, null), this.scope);
    }

    /* renamed from: coerceOffsetForScale-8S9VItk, reason: not valid java name */
    private final long m930coerceOffsetForScale8S9VItk(long j, float f) {
        long jA02 = AWA.A02(AQY.A01(this.mediaSize), f);
        float fA00 = AnonymousClass001.A00(jA02);
        long j2 = this.canvasSize;
        float f2 = fA00 - ((int) (j2 >> 32));
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float fA01 = AnonymousClass001.A01(jA02, 4294967295L) - ((int) (j2 & 4294967295L));
        if (fA01 < 0.0f) {
            fA01 = 0.0f;
        }
        float f3 = f2 * 0.5f;
        float f4 = fA01 * 0.5f;
        return AnonymousClass005.A0M(ATD.A03(AnonymousClass001.A00(j), -f3, f3), ATD.A03(AnonymousClass001.A01(j, 4294967295L), -f4, f4));
    }

    private final float getMaxPersistentZoom() {
        Float f = this.maxScale;
        if (f != null) {
            return f.floatValue();
        }
        if (AnonymousClass002.A1M((this.mediaSize > 0L ? 1 : (this.mediaSize == 0L ? 0 : -1)))) {
            return 2.0f;
        }
        long j = this.canvasSize;
        return Math.max(2.0f, Math.max(((int) (j >> 32)) / ((int) (r4 >> 32)), ((int) (j & 4294967295L)) / ((int) (r4 & 4294967295L))));
    }

    private final float getMaxZoom() {
        Float f = this.maxScale;
        return f != null ? f.floatValue() : Math.max(3.0f, getMaxPersistentZoom());
    }

    public final void animateToValidBounds() {
        float fA03 = ATD.A03(MutableState.A00(this.scaleAnimation), 1.0f, getMaxPersistentZoom());
        long jM930coerceOffsetForScale8S9VItk = m930coerceOffsetForScale8S9VItk(m933getOffsetF1C5BW0(), fA03);
        C3UX c3ux = this.scope;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fA03, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, c3ux);
        GAo.A02(num, c6ys, new AnonymousClass2(jM930coerceOffsetForScale8S9VItk, null), this.scope);
    }

    /* renamed from: getCanvasSize-YbymL2g, reason: not valid java name */
    public final long m931getCanvasSizeYbymL2g() {
        return this.canvasSize;
    }

    /* renamed from: getMediaSize-YbymL2g, reason: not valid java name */
    public final long m932getMediaSizeYbymL2g() {
        return this.mediaSize;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m933getOffsetF1C5BW0() {
        return ((AWx) this.offsetAnimation.A04.A05.getValue()).A00;
    }

    public final float getScale() {
        return MutableState.A00(this.scaleAnimation);
    }

    public final boolean isZoomed() {
        return C1BO.A0F(this.isZoomed$delegate);
    }

    public final void resetZoom() {
        C3UX c3ux = this.scope;
        C119891 c119891 = new C119891(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, c119891, c3ux);
        GAo.A02(num, c6ys, new C119902(null), this.scope);
    }

    public final void resetZoomAnimated() {
        C3UX c3ux = this.scope;
        C119911 c119911 = new C119911(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, c119911, c3ux);
        GAo.A02(num, c6ys, new C119922(null), this.scope);
    }

    /* renamed from: setCanvasSize-ozmzZPI, reason: not valid java name */
    public final void m934setCanvasSizeozmzZPI(long j) {
        this.canvasSize = j;
    }

    /* renamed from: setMediaSize-ozmzZPI, reason: not valid java name */
    public final void m935setMediaSizeozmzZPI(long j) {
        this.mediaSize = j;
    }

    public /* synthetic */ ZoomState(C3UX c3ux, Float f, int i, C06H c06h) {
        this(c3ux, (i & 2) != 0 ? null : f);
    }
}

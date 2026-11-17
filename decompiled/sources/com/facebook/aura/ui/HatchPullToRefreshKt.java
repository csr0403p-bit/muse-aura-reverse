package com.facebook.aura.ui;

import X.AEk;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC1045ASp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0dx;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1419Aio;
import X.C1515AkP;
import X.C1BO;
import X.C1SA;
import X.C2VU;
import X.C5Mp;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.pulltorefresh.PullRefreshKt;
import com.facebook.aura.ui.pulltorefresh.PullRefreshState;
import com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPullToRefreshKt {
    public static final float ArcStrokeWidth = 3.0f;
    public static final float IndicatorSize = 40.0f;
    public static final float MarkSize = 24.0f;

    /* renamed from: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRLoader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSpinning;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Float> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$progress = function0;
            this.$isSpinning = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPullToRefreshKt.HatchPTRLoader(this.$progress, this.$isSpinning, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRLoaderMark$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Float> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$progress = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPullToRefreshKt.HatchPTRLoaderMark(this.$progress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRProgressArc$1, reason: invalid class name and case insensitive filesystem */
    public final class C142461 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSpinning;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142461(Function0<Float> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$progress = function0;
            this.$isSpinning = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPullToRefreshKt.HatchPTRProgressArc(this.$progress, this.$isSpinning, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchPTRLoader(Function0<Float> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1943238891);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                m2320HatchPTRLoaderRingiJQMabo(AnonymousClass002.A0R(bRg2, bfm, -834251080), 0L, bfm, 0, 2);
            } else {
                bfm.AgE(-834181950);
                HatchPTRLoaderMark(function0, C10G.A07(bRg2, MarkSize), bfm, iA0T & 14, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, z, bRg2, i, i2);
        }
    }

    public static final void HatchPTRLoaderMark(Function0<Float> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(2101689468);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_logo, 0);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C1062ATq c1062ATq = C10G.A01;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            C1419Aio c1419Aio = new C1419Aio(AnonymousClass001.A0f(bfm, akh).primaryIcon.disabled, 5);
            int i4 = AVy.$stable;
            C1SA.A00(bfm, null, c1062ATq, c1419Aio, aVyA00, null, null, 0.0f, i4 | 432, 56);
            boolean zA1F = AnonymousClass004.A1F(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new HatchPullToRefreshKt$HatchPTRLoaderMark$1$1$1(function0);
                bfm.Ai0(objAaT);
            }
            C1SA.A00(bfm, null, AEk.A03(c1062ATq, (G0U) objAaT), new C1419Aio(C06G.A0G(bfm, akh), 5), aVyA00, null, null, 0.0f, i4 | 48, 56);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRgA0P, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: HatchPTRLoaderRing-iJQMabo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2320HatchPTRLoaderRingiJQMabo(X.BRg r26, long r27, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchPullToRefreshKt.m2320HatchPTRLoaderRingiJQMabo(X.BRg, long, X.BFM, int, int):void");
    }

    /* renamed from: HatchPTRLoadingIndicator-jIwJxvA, reason: not valid java name */
    public static final void m2321HatchPTRLoadingIndicatorjIwJxvA(Function0<Float> function0, boolean z, Function0<Float> function02, float f, AuraThemeMode auraThemeMode, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchPullToRefreshKt$HatchPTRLoadingIndicator$4;
        BRg bRg2 = bRg;
        bfm.AgG(1645706462);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0G(bfm, auraThemeMode.ordinal());
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            int i4 = iA0T & 896;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 256);
            Object objAaT2 = bfm.AaT();
            if (zA1Q || objAaT2 == obj) {
                objAaT2 = AnonymousClass003.A0R(bfm, new HatchPullToRefreshKt$HatchPTRLoadingIndicator$isAtRest$2$1(function02));
            }
            C1BO c1bo = (C1BO) objAaT2;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(C1BO.A0F(c1bo));
            boolean zA1R = AnonymousClass001.A1R(bfm, c1bo, AnonymousClass003.A1C(iA0T));
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new HatchPullToRefreshKt$HatchPTRLoadingIndicator$1$1(z, mutableState, c1bo);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A19(bfm, objAaT3, boolValueOf, boolValueOf2);
            boolean zA1F = AnonymousClass004.A1F(iA0T) | (i4 == 256);
            Object objAaT4 = bfm.AaT();
            if (zA1F || objAaT4 == obj) {
                objAaT4 = AnonymousClass003.A0R(bfm, new HatchPullToRefreshKt$HatchPTRLoadingIndicator$showPTR$2$1(z, function0, function02));
            }
            if (!C1BO.A0F((C1BO) objAaT4)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchPullToRefreshKt$HatchPTRLoadingIndicator$4 = new HatchPullToRefreshKt$HatchPTRLoadingIndicator$2(function0, z, function02, f, auraThemeMode, bRg2, i, i2);
                    bBbAAc.A06 = hatchPullToRefreshKt$HatchPTRLoadingIndicator$4;
                }
                return;
            }
            AnonymousClass002.A0x(bfm, auraThemeMode, B1V.A00(bfm, new HatchPullToRefreshKt$HatchPTRLoadingIndicator$3(bRg2, f, function02, z, function0, mutableState), -876421871), ((iA0T >> 12) & 14) | 384);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchPullToRefreshKt$HatchPTRLoadingIndicator$4 = new HatchPullToRefreshKt$HatchPTRLoadingIndicator$4(function0, z, function02, f, auraThemeMode, bRg2, i, i2);
            bBbAAc.A06 = hatchPullToRefreshKt$HatchPTRLoadingIndicator$4;
        }
    }

    public static final void HatchPTRProgressArc(Function0<Float> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-134868603);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long jA06 = C06G.A06(bfm);
            if (z) {
                bfm.AgE(-2075930788);
                AbstractC1045ASp.A00(ArcStrokeWidth, jA06, C10G.A07(bRg2, MarkSize), bfm, 384, 0);
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(-2075761745);
                AbstractC1045ASp.A01(bfm, C10G.A07(bRg2, MarkSize), function0, ArcStrokeWidth, 0.0f, (iA0T & 14) | 224256, 64, jA06, B6A.A06, true);
                AnonymousClass002.A19(bfm);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142461(function0, z, bRg2, i, i2);
        }
    }

    /* renamed from: HatchPullToRefresh-jIwJxvA, reason: not valid java name */
    public static final void m2322HatchPullToRefreshjIwJxvA(boolean z, Function0<Unit> function0, BRg bRg, float f, AuraThemeMode auraThemeMode, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        AuraThemeMode auraThemeMode2 = auraThemeMode;
        AnonymousClass002.A1D(function0, 1, g0w);
        bfm.AgG(1503948972);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A07(bfm, f2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0G(bfm, AnonymousClass003.A0K(auraThemeMode2));
        }
        if ((196608 & i) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0n, 74898), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 30.0f;
            }
            if (i5 != 0) {
                auraThemeMode2 = AuraThemeMode.DEFAULT;
            }
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            boolean zA67 = bfm.A67(c0dxA0T) | AnonymousClass001.A1N(iA0n);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchPullToRefreshKt$HatchPullToRefresh$pullRefreshState$1$1(c0dxA0T, function0);
                bfm.Ai0(objAaT);
            }
            PullRefreshState pullRefreshStateM2371rememberPullRefreshState1yyLQnY = PullRefreshStateKt.m2371rememberPullRefreshState1yyLQnY(z, (Function0) objAaT, 0.0f, 0.0f, null, false, bfm, iA0n & 14, 60);
            boolean zA1M = AnonymousClass003.A1M(bfm, pullRefreshStateM2371rememberPullRefreshState1yyLQnY, c0dxA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new HatchPullToRefreshKt$HatchPullToRefresh$1$1(pullRefreshStateM2371rememberPullRefreshState1yyLQnY, c0dxA0T, null);
                bfm.Ai0(objAaT2);
            }
            int i6 = PullRefreshState.$stable;
            C78e.A06(bfm, pullRefreshStateM2371rememberPullRefreshState1yyLQnY, (G0V) objAaT2);
            BRg bRgPullRefresh = PullRefreshKt.pullRefresh(bRg2, pullRefreshStateM2371rememberPullRefreshState1yyLQnY, false, bfm, ((iA0n >> 6) & 14) | (i6 << 3), 2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgPullRefresh);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0D);
            C0z7 c0z7 = C0z7.A00;
            AnonymousClass001.A1G(c0z7, bfm, g0w, ((iA0n >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            boolean zA672 = bfm.A67(pullRefreshStateM2371rememberPullRefreshState1yyLQnY);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchPullToRefreshKt$HatchPullToRefresh$2$1$1(pullRefreshStateM2371rememberPullRefreshState1yyLQnY);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) objAaT3;
            boolean zA673 = bfm.A67(pullRefreshStateM2371rememberPullRefreshState1yyLQnY);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchPullToRefreshKt$HatchPullToRefresh$2$2$1(pullRefreshStateM2371rememberPullRefreshState1yyLQnY);
                bfm.Ai0(objAaT4);
            }
            m2321HatchPTRLoadingIndicatorjIwJxvA(function03, z, (Function0) objAaT4, f2, auraThemeMode2, C5Mp.A00(c0z7.A4C(C2VU.A0C, BRg.A00), 1.0f), bfm, AnonymousClass003.A07(iA0n, (iA0n << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchPullToRefreshKt$HatchPullToRefresh$3(z, function0, bRg2, f2, auraThemeMode2, g0w, i, i2);
        }
    }
}

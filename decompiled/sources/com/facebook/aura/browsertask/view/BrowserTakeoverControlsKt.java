package com.facebook.aura.browsertask.view;

import X.AKQ;
import X.APu;
import X.AQI;
import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1Cd;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C78N;
import X.C8j3;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class BrowserTakeoverControlsKt {
    public static final void BrowserTakeoverControls(final Function0<Unit> function0, final boolean z, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        bfm.AgG(1207669061);
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
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0w2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0w2 = null;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            if (g0w2 == null) {
                bfm.AgE(1620395522);
            } else {
                AnonymousClass001.A1G(C3cG.A09(bfm, -224823841), bfm, g0w2, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            }
            BBI.A0R(bbi, false);
            if (function0 != null) {
                bfm.AgE(1620442922);
                TakeoverStopButton(z, function0, AnonymousClass002.A1X(g0w2), AuraContentFrameKt.auraContentWidth(BRg.A00, AuraContentRole.Focused, bfm, 54).then(c1062ATq), bfm, ((iA0T >> 3) & 14) | ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            } else {
                bfm.AgE(1620666835);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w3 = g0w2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverControlsKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function03 = function0;
                    boolean z2 = z;
                    BRg bRg4 = bRg3;
                    G0W g0w4 = g0w3;
                    int i5 = i;
                    BrowserTakeoverControlsKt.BrowserTakeoverControls(function03, z2, bRg4, g0w4, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void TakeoverStopButton(final boolean z, final Function0<Unit> function0, final boolean z2, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-963233161);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final int iAbr = AnonymousClass002.A0Y(bfm).Abr(AuraDimensKt.SpacingMedium);
            boolean zA63 = bfm.A63(iAbr);
            Object objAaT = bfm.AaT();
            if (zA63 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverControlsKt$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(AnonymousClass001.A0F(obj) + iAbr);
                    }
                };
                bfm.Ai0(objAaT);
            }
            APu aPuA09 = AbstractC1011APs.A09(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), (G0U) objAaT);
            C1AC c1ac = C2VU.A05;
            AQI aqiA00 = aPuA09.A00(AbstractC1011APs.A01(c1ac, 13));
            boolean zA632 = bfm.A63(iAbr);
            Object objAaT2 = bfm.AaT();
            if (zA632 || objAaT2 == C78N.A00) {
                objAaT2 = new G0U() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverControlsKt$$ExternalSyntheticLambda2
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(AnonymousClass001.A0F(obj) + iAbr);
                    }
                };
                bfm.Ai0(objAaT2);
            }
            AbstractC04661Bq.A08(aqiA00, AbstractC1011APs.A0I(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), (G0U) objAaT2).A00(AbstractC1011APs.A0B(c1ac, 13)), bfm, bRg2, null, B1V.A00(bfm, new G0W() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverControlsKt$$ExternalSyntheticLambda3
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BrowserTakeoverControlsKt.TakeoverStopButton$lambda$3(function0, z2, (C1Cd) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
                }
            }, 331690831), (iA0n & 14) | 196608 | ((iA0n >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 16, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverControlsKt$$ExternalSyntheticLambda4
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3 = z;
                    Function0 function02 = function0;
                    boolean z4 = z2;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    BrowserTakeoverControlsKt.TakeoverStopButton(z3, function02, z4, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: $r8$lambda$oWYguDTwmF_h53-ECGmreonAPVI, reason: not valid java name */
    public static /* synthetic */ int m319$r8$lambda$oWYguDTwmF_h53ECGmreonAPVI(int i, int i2) {
        return i2 + i;
    }

    public static /* synthetic */ int $r8$lambda$yQ4iPWBDbYLVkAdnLB1p6hZOgvM(int i, int i2) {
        return i2 + i;
    }

    public static final Unit BrowserTakeoverControls$lambda$1(Function0 function0, boolean z, BRg bRg, G0W g0w, int i, int i2, BFM bfm, int i3) {
        BrowserTakeoverControls(function0, z, bRg, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final int TakeoverStopButton$lambda$1$0(int i, int i2) {
        return i2 + i;
    }

    public static final int TakeoverStopButton$lambda$2$0(int i, int i2) {
        return i2 + i;
    }

    public static final Unit TakeoverStopButton$lambda$3(Function0 function0, boolean z, C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            BRg bRgA04 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            if (z) {
                bRgA04 = C3U4.A04(bRgA04, AuraDimensKt.SpacingMedium);
            }
            BrowserStopButtonKt.BrowserStopButton(function0, c1062ATq.then(bRgA04), false, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit TakeoverStopButton$lambda$4(boolean z, Function0 function0, boolean z2, BRg bRg, int i, int i2, BFM bfm, int i3) {
        TakeoverStopButton(z, function0, z2, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}

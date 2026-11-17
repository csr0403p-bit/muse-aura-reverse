package com.facebook.aura.components.pagerindicator;

import X.AKQ;
import X.ATD;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0A8;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1b8;
import X.C2VU;
import X.C2av;
import X.C31t;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraPagerIndicatorKt {
    public static final float DotSize = 8.0f;
    public static final float DotSpacing = 8.0f;

    /* renamed from: PagerDot-Kz89ssw, reason: not valid java name */
    public static final void m379PagerDotKz89ssw(final float f, final boolean z, BRg bRg, BFM bfm, final int i, final int i2) {
        long jA04;
        final BRg bRg2 = bRg;
        bfm.AgG(-1631596548);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA02 = C11U.A02(bRg2, f);
            if (z) {
                jA04 = AnonymousClass003.A0c(bfm, -747632384).primaryText;
            } else {
                long j = AnonymousClass003.A0c(bfm, -747556310).secondaryText;
                jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.24f);
            }
            AnonymousClass001.A1D(bfm);
            C1b8.A04(bfm, bRgA02, jA04);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.components.pagerindicator.AuraPagerIndicatorKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    float f2 = f;
                    boolean z2 = z;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    AuraPagerIndicatorKt.m379PagerDotKz89ssw(f2, z2, bRg3, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit WindowedPagerIndicator$lambda$1$0$0(C1BO c1bo, C2av c2av) {
        C7384Etj.A0Y(c2av, 1);
        c2av.Af5((-C1BO.A01(c1bo)) * c2av.Ah4(DotSize + DotSpacing));
        return Unit.INSTANCE;
    }

    public static final void AuraPagerIndicator(final int i, final PagerState pagerState, BRg bRg, int i2, BFM bfm, final int i3, final int i4) {
        final int i5;
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(pagerState, 1);
        bfm.AgG(499623461);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, pagerState);
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            iA0D |= 384;
        } else if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            iA0D |= 3072;
        } else if ((i3 & 3072) == 0) {
            iA0D |= AnonymousClass007.A06(bfm, i2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0D), bfm, iA0D)) {
            if (i6 != 0) {
                bRgA0Q = BRg.A00;
            }
            i5 = Integer.MAX_VALUE;
            if (i7 == 0) {
                i5 = i2;
                if (i > i2) {
                    bfm.AgE(-2073931160);
                    WindowedPagerIndicator(i, pagerState, i2, bRgA0Q, bfm, (iA0D & 126) | ((iA0D >> 3) & 896) | ((iA0D << 3) & 7168), 0);
                    bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                    if (bBbAAc != null) {
                        final BRg bRg2 = bRgA0Q;
                        g0v = new G0V() { // from class: com.facebook.aura.components.pagerindicator.AuraPagerIndicatorKt$$ExternalSyntheticLambda1
                            @Override // X.G0V
                            public final Object invoke(Object obj, Object obj2) {
                                int i8 = i;
                                PagerState pagerState2 = pagerState;
                                BRg bRg3 = bRg2;
                                int i9 = i5;
                                int i10 = i3;
                                AuraPagerIndicatorKt.AuraPagerIndicator(i8, pagerState2, bRg3, i9, (BFM) obj, AnonymousClass011.A02(obj2, i10), i4);
                                return Unit.INSTANCE;
                            }
                        };
                        bBbAAc.A06 = g0v;
                    }
                    return;
                }
            }
            bfm.AgE(-2073757219);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(DotSpacing), bfm, C2VU.A05, 6);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            bfm.AgE(2122371886);
            for (int i8 = 0; i8 < i; i8++) {
                m379PagerDotKz89ssw(DotSize, AnonymousClass002.A1Q(i8, pagerState.A07()), null, bfm, 6, 4);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
            i5 = i2;
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRgA0Q;
            g0v = new G0V() { // from class: com.facebook.aura.components.pagerindicator.AuraPagerIndicatorKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i;
                    PagerState pagerState2 = pagerState;
                    BRg bRg4 = bRg3;
                    int i10 = i5;
                    int i11 = i3;
                    AuraPagerIndicatorKt.AuraPagerIndicator(i9, pagerState2, bRg4, i10, (BFM) obj, AnonymousClass011.A02(obj2, i11), i4);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final void WindowedPagerIndicator(final int i, final PagerState pagerState, final int i2, BRg bRg, BFM bfm, final int i3, final int i4) {
        BRg bRg2 = bRg;
        bfm.AgG(-949290005);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, pagerState);
        }
        if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A0F(bfm, i2);
        }
        int i5 = i4 & 8;
        if (i5 != 0) {
            iA0D |= 3072;
        } else if ((i3 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            int iA07 = pagerState.A07();
            int iA04 = ATD.A04(iA07 - (i2 / 2), 0, i - i2);
            final C1BO c1boA01 = C31t.A01(null, bfm, iA04, 3072, 22);
            float f = DotSize;
            float f2 = DotSpacing;
            BRg bRgA00 = C11U.A00(C10G.A08(bRg2, (f * i2) + ((i2 - 1) * f2)));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA002 = C10G.A00(C2VU.A02, bs0, true);
            boolean zA65 = bfm.A65(c1boA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.components.pagerindicator.AuraPagerIndicatorKt$$ExternalSyntheticLambda3
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return AuraPagerIndicatorKt.WindowedPagerIndicator$lambda$1$0$0(c1boA01, (C2av) obj);
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA002, objAaT);
            InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(AcQ.A00(f2), bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0W);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0Q, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            bfm.AgE(1910407300);
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = i7 - iA04;
                boolean zA1N = AnonymousClass002.A1N(iA04);
                boolean z = false;
                if (iA04 + i2 < i) {
                    z = true;
                }
                C1BO c1boA02 = C31t.A02(null, bfm, null, windowedDotSize(i8, i2, zA1N, z), 384, 10);
                BRg bRgA07 = C10G.A07(bs0, f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA07);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA013, g0vA0u);
                m379PagerDotKz89ssw(C1BO.A00(c1boA02), AnonymousClass002.A1Q(i7, iA07), null, bfm, 0, 4);
                BBI.A0R(bbi, true);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.components.pagerindicator.AuraPagerIndicatorKt$$ExternalSyntheticLambda4
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i;
                    PagerState pagerState2 = pagerState;
                    int i10 = i2;
                    BRg bRg4 = bRg3;
                    int i11 = i3;
                    AuraPagerIndicatorKt.WindowedPagerIndicator(i9, pagerState2, i10, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i11), i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final float windowedDotSize(int i, int i2, boolean z, boolean z2) {
        if (i < 0 || i >= i2) {
            return 0.0f;
        }
        if (z) {
            if (i == 0) {
                return 4.0f;
            }
            if (i == 1) {
                return 6.0f;
            }
        }
        if (z2) {
            if (i == i2 - 1) {
                return 4.0f;
            }
            if (i == i2 - 2) {
                return 6.0f;
            }
        }
        return DotSize;
    }

    public static final Unit AuraPagerIndicator$lambda$0(int i, PagerState pagerState, BRg bRg, int i2, int i3, int i4, BFM bfm, int i5) {
        AuraPagerIndicator(i, pagerState, bRg, i2, bfm, AnonymousClass011.A00(i3), i4);
        return Unit.INSTANCE;
    }

    public static final Unit AuraPagerIndicator$lambda$2(int i, PagerState pagerState, BRg bRg, int i2, int i3, int i4, BFM bfm, int i5) {
        AuraPagerIndicator(i, pagerState, bRg, i2, bfm, AnonymousClass011.A00(i3), i4);
        return Unit.INSTANCE;
    }

    public static final Unit PagerDot_Kz89ssw$lambda$0(float f, boolean z, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m379PagerDotKz89ssw(f, z, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit WindowedPagerIndicator$lambda$2(int i, PagerState pagerState, int i2, BRg bRg, int i3, int i4, BFM bfm, int i5) {
        WindowedPagerIndicator(i, pagerState, i2, bRg, bfm, AnonymousClass011.A00(i3), i4);
        return Unit.INSTANCE;
    }
}

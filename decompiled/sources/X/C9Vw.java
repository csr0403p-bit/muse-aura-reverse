package X;

import androidx.compose.ui.Alignment;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9Vw, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9Vw {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(androidx.compose.foundation.lazy.LazyListState r38, X.BFM r39, X.BRg r40, X.InterfaceC07449Vz r41, X.C07389Vo r42, X.C07429Vx r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9Vw.A00(androidx.compose.foundation.lazy.LazyListState, X.BFM, X.BRg, X.9Vz, X.9Vo, X.9Vx, int, int):void");
    }

    public static final void A01(BFM bfm, C9W5 c9w5, C07409Vs c07409Vs, C07429Vx c07429Vx, int i) {
        C9WZ c9wz;
        bfm.AgG(-768999104);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07409Vs) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c07429Vx);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c9w5);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A07(bs0, c07429Vx.A00), "place_reviews_avatar");
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA01);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            BRg bRgAQJ = c0z7.AQJ(bs0);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C11U.A03(bRgAQJ, c1d3);
            long j = c07429Vx.A0J;
            C1DM c1dm = C1OM.A00;
            BRg bRgA032 = C1b8.A03(bRgA03, c1dm, j);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA032);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = c07409Vs.A02;
            if (c9w5 == null || str == null || C7BY.A0j(str)) {
                bfm.AgE(2051088982);
            } else {
                bfm.AgE(2051021712);
                c9w5.GalleryImage(str, c0z7.AQJ(bs0), bfm, iA0d & 896);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            int iOrdinal = c07409Vs.A00.ordinal();
            if (iOrdinal == 0) {
                c9wz = C9WZ.A05;
            } else if (iOrdinal == 1) {
                c9wz = C9WZ.A03;
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                bfm.AgE(-271910480);
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            }
            bfm.AgE(-271910479);
            float f = c07429Vx.A04;
            BRg bRgA002 = AbstractC07539Wl.A00(C1b8.A03(C11U.A03(C1DI.A02(C10G.A07(AYD.A01(bs0, f, f), c07429Vx.A07), c1d3, c07429Vx.A02, c07429Vx.A0N), c1d3), c1dm, c07429Vx.A0K), "place_reviews_badge");
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA002);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C9WU.A00(bfm, null, c9wz, c07429Vx.A03, c07429Vx.A06, c07429Vx.A05, 0.0f, 0, 96, c07429Vx.A0L);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2340BUo(c07409Vs, c07429Vx, c9w5, i, 2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9Vs;FLX/9Vx;LX/9W5;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A02(BFM bfm, C9W5 c9w5, C07409Vs c07409Vs, C07429Vx c07429Vx, Function0 function0, float f, int i) {
        boolean z;
        BRg bRgA04;
        bfm.AgG(408847743);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07409Vs) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c07429Vx);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c9w5);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            C1D3 c1d3A00 = C1D8.A00(c07429Vx.A0A);
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = AbstractC07539Wl.A00(C1b8.A01(C11U.A03(C1DI.A02(C10G.A08(bs0, c07429Vx.A0D), c1d3A00, c07429Vx.A08, c07429Vx.A0M), c1d3A00), c07429Vx.A0N), "place_reviews_card");
            if (c07409Vs.A03 == null) {
                bRgA04 = bs0;
                z = false;
            } else {
                z = false;
                bRgA04 = C0v5.A04(bs0, C3cG.A0A(0), null, function0, true);
            }
            BRg bRgA09 = C3U4.A09(bRgA00.then(bRgA04), c07429Vx.A0B);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA042 = C10G.A04(bs0, c07429Vx.A00);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA042);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            A01(bfm, c9w5, c07409Vs, c07429Vx, AnonymousClass002.A07(iA0d >> 3, iA0d & 14));
            String str = c07409Vs.A01;
            if (str == null) {
                bfm.AgE(-692011522);
                BBI.A0R(bbi, z);
            } else {
                bfm.AgE(-692011521);
                C01N.A09(bfm, bs0, c07429Vx.A01);
                AbstractC1727ApL.A02(null, bfm, AbstractC07539Wl.A00(bs0, "place_reviews_handle"), null, c07429Vx.A0P, str, null, 2, 1, z ? 1 : 0, 1597488, 936, z);
                BBI.A0R(bbi, z);
            }
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, c07429Vx.A09);
            AbstractC1727ApL.A02(null, bfm, AbstractC07539Wl.A00(C10G.A04(bs0, f), "place_reviews_body"), null, c07429Vx.A0O, c07409Vs.A04, null, 2, c07429Vx.A0I, z ? 1 : 0, RuntimeInternals.IOPRIO_BACKGROUND, 936, z);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9Vv(c9w5, c07409Vs, c07429Vx, function0, f, i);
        }
    }
}

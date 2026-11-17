package X;

import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8sN, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8sN {
    public static final void A01(BFM bfm, C8sO c8sO, String str, Function0 function0, int i) {
        bfm.AgG(-997824507);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, null) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c8sO);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            bfm.Afo();
            BBb bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                bBbAAc.A06 = new C8sQ(c8sO, str, function0, i);
                return;
            }
            return;
        }
        bfm.A6v(C9WW.A00);
        BRg bRgA00 = AbstractC07539Wl.A00(C0v5.A04(C10G.A08(BRg.A00, c8sO.A01), C3cG.A0A(0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e10), function0, true), "place_events_card");
        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
        BBI bbi = (BBI) bfm;
        int iA02 = C3cG.A02(bbi.A06);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgA00);
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
        BRg bRgA002 = AbstractC07539Wl.A00(C1b8.A01(C11U.A01(BJe.A00(C10G.A02, c8sO.A02, false), c8sO.A03), c8sO.A0A), "place_events_cover");
        InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
        int iA0D = AnonymousClass001.A0D(bbi);
        AKQ akqA042 = BBI.A04(bbi);
        BRg bRgA012 = AxM.A01(bfm, bRgA002);
        AnonymousClass005.A0n(bfm, bbi, function02);
        BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
        BPg.A02(bfm, akqA042, g0v);
        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
        BPg.A02(bfm, bRgA012, g0vA0u);
        throw new NullPointerException("getCoverUrl");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.BFM r33, X.BRg r34, X.C8sR r35, X.C8sP r36, X.C8sO r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8sN.A00(X.BFM, X.BRg, X.8sR, X.8sP, X.8sO, int, int):void");
    }
}

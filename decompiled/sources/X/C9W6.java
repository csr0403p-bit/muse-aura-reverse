package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.9W6, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9W6 {
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
    
        if (r6 != 1) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.BFM r35, X.BRg r36, X.C9VT r37, X.C9W7 r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9W6.A00(X.BFM, X.BRg, X.9VT, X.9W7, int, int):void");
    }

    public static final void A01(BFM bfm, ApQ apQ, C9W7 c9w7, int i, boolean z) {
        bfm.AgG(317100084);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c9w7);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new AEG();
                BBI.A0T(bfm, objAaT);
            }
            AEG aeg = (AEG) objAaT;
            boolean zA1V = AnonymousClass002.A1V(bfm, aeg, AnonymousClass003.A1C(iA0d), (iA0d & 896) == 256);
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == obj) {
                objAaT2 = new C1032ARl(aeg, c9w7, z);
                bfm.Ai0(objAaT2);
            }
            BS0 bs0 = BRg.A00;
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, objAaT2, akqA04, bRgA01, iA0D);
            if (z) {
                bfm.AgE(1036526518);
                A02(bfm, c9w7, (iA0d >> 6) & 14);
            } else {
                bfm.AgE(1036558231);
            }
            BBI.A0R(bbi, false);
            BRg bRgA00 = AbstractC07539Wl.A00(bs0, "place_header_subtitle");
            C1822Arm c1822Arm = c9w7.A0B;
            boolean zA67 = bfm.A67(aeg);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new C2326BUa(aeg, 23);
                bfm.Ai0(objAaT3);
            }
            AbstractC1727ApL.A04(bfm, bRgA00, null, apQ, c1822Arm, null, (G0U) objAaT3, 0, 0, 0, (iA0d & 14) | 48, 0, 2032, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9W9(apQ, c9w7, i, z);
        }
    }

    public static final void A02(BFM bfm, C9W7 c9w7, int i) {
        bfm.AgG(1549477427);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9w7) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A07(BRg.A00, c9w7.A03), "place_header_star");
            boolean z = (iA0d & 14) == 4;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new C2326BUa(c9w7, 22);
                bfm.Ai0(objAaT);
            }
            C0zJ.A00(bRgA00, (G0U) objAaT, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2330BUe(c9w7, i, 7);
        }
    }

    public static final void A03(BFM bfm, C9W7 c9w7, int i) {
        bfm.AgG(1029486442);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9w7) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A03(BRg.A00, c9w7.A02), c9w7.A01), c9w7.A08);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = BUU.A00(bfm, 33);
            }
            AbstractC1727ApL.A02(null, bfm, AnonymousClass001.A0X(bRgA01, objAaT), null, c9w7.A0C, "", null, 0, 0, 0, 6, 1016, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2330BUe(c9w7, i, 8);
        }
    }
}

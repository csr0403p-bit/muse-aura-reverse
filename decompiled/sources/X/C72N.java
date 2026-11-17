package X;

/* renamed from: X.72N, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C72N {
    public static void A00(BFM bfm, C76B c76b, float f) {
        A01(c76b.Agp(new C062875i(new C72R(f))), bfm, 0, 0);
    }

    public static final void A01(C76B c76b, BFM bfm, int i, int i2) {
        bfm.AgG(1380468206);
        int i3 = i2 & 1;
        if (((i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i : i) & 3) == 2 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i3 != 0) {
                c76b = C76B.A00;
            }
            bfm.AgF(1849434622);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C72O.A00;
                bfm.Ai0(objAaT);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT;
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            C60R.A10(bfm);
            if (!(bbi.A0V instanceof C73Q)) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            C60R.A12(bfm, bbi, interfaceC7353EnQ);
            C8i0.A00(bfm, c76b, 24);
            AnonymousClass002.A10(bbi, true, false);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8i7(c76b, i, i2, 1);
        }
    }
}

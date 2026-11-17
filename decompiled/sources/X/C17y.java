package X;

import kotlin.Unit;

/* renamed from: X.17y, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17y {
    public static final AKH<C1822Arm> A00 = new AGN(AGF.A01(), new C3bN(8));

    public static final void A00(C1822Arm c1822Arm, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-13499697);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1822Arm) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AKH<C1822Arm> akh = A00;
            AnonymousClass001.A14(bfm, akh.A04(((C1822Arm) bfm.A6v(akh)).A02(c1822Arm)), g0v, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3bZ(c1822Arm, g0v, i, 2);
        }
    }
}

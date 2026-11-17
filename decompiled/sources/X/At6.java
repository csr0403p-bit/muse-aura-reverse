package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class At6 implements C1Hj {
    public static final At6 A00 = new At6();

    @Override // X.C1Hj
    public final void Decoration(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-2101003086);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            AnonymousClass003.A13(bfm, g0v, iA0T);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, this, g0v, i, 2);
        }
    }
}

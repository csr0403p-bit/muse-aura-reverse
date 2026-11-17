package X;

import kotlin.Unit;

/* renamed from: X.0zJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0zJ {
    public static final void A00(BRg bRg, G0U<? super AT3, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-932836462);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            C01N.A07(bfm, AEk.A01(bRg, g0u));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3bZ(bRg, g0u, i, 0);
        }
    }
}

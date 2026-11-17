package X;

/* renamed from: X.0nM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0nM {
    public static final void A00(BFM bfm, BRg bRg, float f, int i, int i2, long j, boolean z) {
        float fAEm;
        boolean z2 = z;
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(-1968128800);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                z2 = true;
            }
            if (C1DG.A08(f, 0.0f)) {
                bfm.AgE(-1926347766);
                fAEm = 1.0f / AnonymousClass002.A0Y(bfm).AEm();
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -1926287161);
                fAEm = f;
            }
            C1b8.A04(bfm, bRg.then(z2 ? C10G.A04(C10G.A02, fAEm) : C10G.A08(C10G.A00, fAEm)), j);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C0nN(bRg, f, i, i2, j, z2);
        }
    }
}

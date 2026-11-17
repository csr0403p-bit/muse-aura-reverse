package X;

import java.text.BreakIterator;

/* renamed from: X.AoA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1673AoA extends AoF {
    public static C1673AoA A01;
    public BreakIterator A00;

    @Override // X.InterfaceC1686AoP
    public final int[] ABi(int i) {
        int iA01 = AoF.A01(this);
        if (iA01 > 0 && i < iA01) {
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    C7384Etj.A0b("impl");
                    throw F60.createAndThrow();
                }
                boolean zIsBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (zIsBoundary) {
                    if (breakIterator2 == null) {
                        C7384Etj.A0b("impl");
                        throw F60.createAndThrow();
                    }
                    int iFollowing = breakIterator2.following(i);
                    if (iFollowing != -1) {
                        return A03(i, iFollowing);
                    }
                } else {
                    if (breakIterator2 == null) {
                        C7384Etj.A0b("impl");
                        throw F60.createAndThrow();
                    }
                    i = breakIterator2.following(i);
                }
            } while (i != -1);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1686AoP
    public final int[] AYK(int i) {
        int iA01 = AoF.A01(this);
        if (iA01 > 0 && i > 0) {
            if (i > iA01) {
                i = iA01;
            }
            do {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    C7384Etj.A0b("impl");
                    throw F60.createAndThrow();
                }
                boolean zIsBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (zIsBoundary) {
                    if (breakIterator2 == null) {
                        C7384Etj.A0b("impl");
                        throw F60.createAndThrow();
                    }
                    int iPreceding = breakIterator2.preceding(i);
                    if (iPreceding != -1) {
                        return A03(iPreceding, i);
                    }
                } else {
                    if (breakIterator2 == null) {
                        C7384Etj.A0b("impl");
                        throw F60.createAndThrow();
                    }
                    i = breakIterator2.preceding(i);
                }
            } while (i != -1);
            return null;
        }
        return null;
    }
}

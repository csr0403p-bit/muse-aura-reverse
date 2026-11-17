package X;

import java.text.BreakIterator;

/* loaded from: classes4.dex */
public final class Ao9 extends AoF {
    public static Ao9 A01;
    public BreakIterator A00;

    private final boolean A00(int i) {
        if (i < 0 || i >= AoF.A01(this)) {
            return false;
        }
        return Character.isLetterOrDigit(A02().codePointAt(i));
    }

    @Override // X.InterfaceC1686AoP
    public final int[] ABi(int i) {
        if (AoF.A01(this) > 0 && i < AoF.A01(this)) {
            if (i < 0) {
                i = 0;
            }
            while (!A00(i) && (!A00(i) || (i != 0 && A00(i - 1)))) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    C7384Etj.A0b("impl");
                    throw F60.createAndThrow();
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.A00;
            if (breakIterator2 == null) {
                C7384Etj.A0b("impl");
                throw F60.createAndThrow();
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing != -1 && iFollowing > 0 && A00(iFollowing - 1) && (iFollowing == AoF.A01(this) || !A00(iFollowing))) {
                return A03(i, iFollowing);
            }
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
            while (i > 0) {
                int i2 = i - 1;
                if (A00(i2) || (A00(i2) && (i == AoF.A01(this) || !A00(i)))) {
                    break;
                }
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    C7384Etj.A0b("impl");
                    throw F60.createAndThrow();
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.A00;
            if (breakIterator2 == null) {
                C7384Etj.A0b("impl");
                throw F60.createAndThrow();
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding != -1 && A00(iPreceding) && (iPreceding == 0 || !A00(iPreceding - 1))) {
                return A03(iPreceding, i);
            }
        }
        return null;
    }
}

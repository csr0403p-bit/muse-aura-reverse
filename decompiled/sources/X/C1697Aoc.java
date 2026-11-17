package X;

/* renamed from: X.Aoc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1697Aoc {
    public final C1824Aro A00;
    public final C1824Aro A01;
    public final C1824Aro A02;
    public final C1824Aro A03;

    public C1697Aoc() {
        this(null, null, null, null);
    }

    public static int A00(C1731ApS c1731ApS, C1824Aro c1824Aro, String str) {
        return c1731ApS.A01(new C1ji(new C1697Aoc(c1824Aro, null, null, null), str));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C1697Aoc)) {
                C1697Aoc c1697Aoc = (C1697Aoc) obj;
                if (!C7384Etj.areEqual(this.A03, c1697Aoc.A03) || !C7384Etj.areEqual(this.A00, c1697Aoc.A00) || !C7384Etj.areEqual(this.A01, c1697Aoc.A01) || !C7384Etj.areEqual(this.A02, c1697Aoc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((C60R.A01(this.A03) * 31) + C60R.A01(this.A00)) * 31) + C60R.A01(this.A01)) * 31) + C8j4.A0E(this.A02, 0);
    }

    public C1697Aoc(C1824Aro c1824Aro, C1824Aro c1824Aro2, C1824Aro c1824Aro3, C1824Aro c1824Aro4) {
        this.A03 = c1824Aro;
        this.A00 = c1824Aro2;
        this.A01 = c1824Aro3;
        this.A02 = c1824Aro4;
    }
}

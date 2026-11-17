package X;

/* renamed from: X.AvF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1963AvF {
    public String A01;
    public final String A03;
    public boolean A02 = false;
    public C1948Aum A00 = null;

    public C1963AvF(String str, String str2) {
        this.A03 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1963AvF) {
                C1963AvF c1963AvF = (C1963AvF) obj;
                if (!C7384Etj.areEqual(this.A03, c1963AvF.A03) || !C7384Etj.areEqual(this.A01, c1963AvF.A01) || this.A02 != c1963AvF.A02 || !C7384Etj.areEqual(this.A00, c1963AvF.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(AnonymousClass005.A0I(this.A01, AnonymousClass001.A0G(this.A03)), this.A02) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextSubstitution(layoutCache=");
        sbA0x.append(this.A00);
        sbA0x.append(", isShowingSubstitution=");
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }
}

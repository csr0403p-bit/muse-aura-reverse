package X;

/* renamed from: X.AvG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1964AvG {
    public ApQ A01;
    public final ApQ A03;
    public boolean A02 = false;
    public C1944Aui A00 = null;

    public C1964AvG(ApQ apQ, ApQ apQ2) {
        this.A03 = apQ;
        this.A01 = apQ2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1964AvG) {
                C1964AvG c1964AvG = (C1964AvG) obj;
                if (!C7384Etj.areEqual(this.A03, c1964AvG.A03) || !C7384Etj.areEqual(this.A01, c1964AvG.A01) || this.A02 != c1964AvG.A02 || !C7384Etj.areEqual(this.A00, c1964AvG.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A03)), this.A02) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextSubstitutionValue(original=");
        sbA0x.append((Object) this.A03);
        sbA0x.append(", substitution=");
        sbA0x.append((Object) this.A01);
        sbA0x.append(", isShowingSubstitution=");
        sbA0x.append(this.A02);
        sbA0x.append(", layoutCache=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}

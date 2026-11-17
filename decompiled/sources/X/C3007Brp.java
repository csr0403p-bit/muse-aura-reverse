package X;

/* renamed from: X.Brp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3007Brp {
    public final DZf A00;
    public final C5119DZv A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3007Brp) {
                C3007Brp c3007Brp = (C3007Brp) obj;
                if (!this.A02.equals(c3007Brp.A02) || !C7384Etj.areEqual(this.A01, c3007Brp.A01) || !this.A00.equals(c3007Brp.A00) || this.A03 != c3007Brp.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.A00, (AnonymousClass001.A0G(this.A02) + AnonymousClass006.A0D(this.A01)) * 31), this.A03);
    }

    public final String toString() {
        String str = this.A02;
        C5119DZv c5119DZv = this.A01;
        DZf dZf = this.A00;
        boolean z = this.A03;
        StringBuilder sbA0x = C3cI.A0x("ScopeKey(buildConfigName=", str);
        sbA0x.append(", assetReader=");
        sbA0x.append(c5119DZv);
        sbA0x.append(", variables=");
        sbA0x.append(dZf);
        return C8j5.A0W(", useSegmentedCanonicalArguments=", sbA0x, z);
    }

    public C3007Brp(String str, C5119DZv c5119DZv, DZf dZf, boolean z) {
        AnonymousClass003.A0v(str, dZf);
        this.A02 = str;
        this.A01 = c5119DZv;
        this.A00 = dZf;
        this.A03 = z;
    }
}

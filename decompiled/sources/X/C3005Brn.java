package X;

/* renamed from: X.Brn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3005Brn {
    public final int A00;
    public final long A01;
    public final String A02;
    public final BXn A03;
    public final BXn A04;
    public final BXn A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3005Brn) {
                C3005Brn c3005Brn = (C3005Brn) obj;
                if (this.A05 != c3005Brn.A05 || this.A03 != c3005Brn.A03 || this.A04 != c3005Brn.A04 || this.A06 != c3005Brn.A06 || !C7384Etj.areEqual(this.A02, c3005Brn.A02) || this.A01 != c3005Brn.A01 || this.A00 != c3005Brn.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C60R.A00(this.A01, (C0KA.A01(AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A05))), this.A06) + AnonymousClass006.A0G(this.A02)) * 31) + this.A00;
    }

    public final String toString() {
        BXn bXn = this.A05;
        BXn bXn2 = this.A03;
        BXn bXn3 = this.A04;
        boolean z = this.A06;
        String str = this.A02;
        long j = this.A01;
        int i = this.A00;
        StringBuilder sbA0f = C3cG.A0f(bXn, "GenericData(ssoEligibility=");
        sbA0f.append(", ntaEligibility=");
        sbA0f.append(bXn2);
        sbA0f.append(", ntaSuperEligibility=");
        sbA0f.append(bXn3);
        sbA0f.append(", isFeta=");
        sbA0f.append(z);
        sbA0f.append(", personalizationData=");
        sbA0f.append(str);
        sbA0f.append(", timestamp=");
        sbA0f.append(j);
        sbA0f.append(", versionNumber=");
        sbA0f.append(i);
        return BV7.A10(sbA0f);
    }

    public C3005Brn(String str, BXn bXn, BXn bXn2, BXn bXn3, int i, long j, boolean z) {
        this.A05 = bXn;
        this.A03 = bXn2;
        this.A04 = bXn3;
        this.A06 = z;
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
    }
}

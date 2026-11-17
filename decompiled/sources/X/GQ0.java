package X;

/* loaded from: classes6.dex */
public final class GQ0 {
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GQ0) {
                GQ0 gq0 = (GQ0) obj;
                if (this.A00 != gq0.A00 || this.A02 != gq0.A02 || !C7384Etj.areEqual(this.A01, gq0.A01) || this.A03 != gq0.A03 || this.A05 != gq0.A05 || this.A04 != gq0.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(this.A00 * 31, this.A02) + AnonymousClass006.A0G(this.A01)) * 31, this.A03), this.A05), this.A04);
    }

    public final String toString() {
        int i = this.A00;
        boolean z = this.A02;
        String str = this.A01;
        boolean z2 = this.A03;
        boolean z3 = this.A05;
        boolean z4 = this.A04;
        StringBuilder sbA0y = C60O.A0y("NetworkHandlerFinishLoginResponse(attemptsRemainingValue=", i);
        sbA0y.append(", attemptsRemainingIsNonNull=");
        sbA0y.append(z);
        sbA0y.append(", base64urlEncodedLoginPayload=");
        sbA0y.append(str);
        sbA0y.append(", loginSuccessValue=");
        sbA0y.append(z2);
        sbA0y.append(", triggerPostLoginRegisterValue=");
        sbA0y.append(z3);
        sbA0y.append(", triggerPostLoginRegisterIsNonNull=");
        sbA0y.append(z4);
        return C3cJ.A0L(null, ", wrappedBy=", sbA0y);
    }

    public GQ0(String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = str;
        this.A03 = z2;
        this.A05 = z3;
        this.A04 = z4;
    }
}

package X;

/* loaded from: classes6.dex */
public final class GQ1 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GQ1) {
                GQ1 gq1 = (GQ1) obj;
                if (!C7384Etj.areEqual(this.A01, gq1.A01) || !C7384Etj.areEqual(this.A04, gq1.A04) || !C7384Etj.areEqual(this.A02, gq1.A02) || !C7384Etj.areEqual(this.A03, gq1.A03) || !C7384Etj.areEqual(this.A00, gq1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass006.A0G(this.A01) * 31) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass006.A0G(this.A03)) * 31) + C3cH.A02(this.A00);
    }

    public final String toString() {
        String str = this.A01;
        String str2 = this.A04;
        String str3 = this.A02;
        String str4 = this.A03;
        Integer num = this.A00;
        StringBuilder sbA0x = C3cI.A0x("VestaFleetKeyListBundle(base64EncodedFleetKeyList=", str);
        sbA0x.append(", base64EncodedFleetKeyListSignatureMessage=");
        sbA0x.append(str2);
        sbA0x.append(", base64EncodedFleetKeyListSignature1=");
        sbA0x.append(str3);
        sbA0x.append(", base64EncodedFleetKeyListSignature2=");
        sbA0x.append(str4);
        return C3cJ.A0L(num, ", bundleVersion=", sbA0x);
    }

    public GQ1(String str, String str2, String str3, String str4, Integer num) {
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = num;
    }
}

package X;

/* loaded from: classes5.dex */
public final class ENw {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final EP0 A03;
    public final EP1 A04;
    public final C3005Brn A05;
    public final EO8 A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ENw) {
                ENw eNw = (ENw) obj;
                if (!this.A02.equals(eNw.A02) || !this.A01.equals(eNw.A01) || this.A03 != eNw.A03 || this.A04 != eNw.A04 || !C7384Etj.areEqual(this.A00, eNw.A00) || !C7384Etj.areEqual(this.A06, eNw.A06) || !C7384Etj.areEqual(this.A05, eNw.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0I(this.A01, AnonymousClass001.A0G(this.A02)))) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A06)) * 31) + C3cH.A02(this.A05);
    }

    public final String toString() {
        String str = this.A02;
        String str2 = this.A01;
        EP0 ep0 = this.A03;
        EP1 ep1 = this.A04;
        Long l = this.A00;
        EO8 eo8 = this.A06;
        C3005Brn c3005Brn = this.A05;
        StringBuilder sbA0x = C3cI.A0x("FXAccountItem(userId=", str);
        sbA0x.append(", authToken=");
        sbA0x.append(str2);
        sbA0x.append(", appSource=");
        sbA0x.append(ep0);
        sbA0x.append(", credentialSource=");
        sbA0x.append(ep1);
        sbA0x.append(", timestamp=");
        sbA0x.append(l);
        sbA0x.append(", debugData=");
        sbA0x.append(eo8);
        return C3cJ.A0L(c3005Brn, ", genericData=", sbA0x);
    }

    public ENw(Long l, String str, String str2, EP0 ep0, EP1 ep1, C3005Brn c3005Brn, EO8 eo8) {
        AnonymousClass003.A0u(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = ep0;
        this.A04 = ep1;
        this.A00 = l;
        this.A06 = eo8;
        this.A05 = c3005Brn;
    }
}

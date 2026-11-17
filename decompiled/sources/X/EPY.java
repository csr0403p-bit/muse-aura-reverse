package X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EPY {
    public HashMap<String, String> A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map<String, String> A04;
    public final EPM A05;
    public final EPi A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EPY) {
                EPY epy = (EPY) obj;
                if (!this.A03.equals(epy.A03) || !this.A02.equals(epy.A02) || !this.A01.equals(epy.A01) || this.A05 != epy.A05 || this.A06 != epy.A06 || !C7384Etj.areEqual(this.A04, epy.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0I(this.A01, AnonymousClass005.A0I(this.A02, AnonymousClass001.A0G(this.A03))))) + AnonymousClass006.A0D(this.A04);
    }

    public final String toString() {
        String str = this.A03;
        String str2 = this.A02;
        String str3 = this.A01;
        EPM epm = this.A05;
        EPi ePi = this.A06;
        Map<String, String> map = this.A04;
        StringBuilder sbA0x = C3cI.A0x("FXAccountItem(userId=", str);
        sbA0x.append(", authToken=");
        sbA0x.append(str2);
        sbA0x.append(", accountType=");
        sbA0x.append(str3);
        sbA0x.append(", appSource=");
        sbA0x.append(epm);
        sbA0x.append(", credentialSource=");
        sbA0x.append(ePi);
        return C3cJ.A0L(map, ", genericData=", sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LX/EPM;LX/EPi;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public EPY(String str, String str2, String str3, Map map, EPM epm, EPi ePi) {
        AnonymousClass005.A0y(str, str2, epm);
        C7384Etj.A0Y(ePi, 4);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A05 = epm;
        this.A06 = ePi;
        this.A04 = map;
        this.A00 = BV4.A0u();
    }
}

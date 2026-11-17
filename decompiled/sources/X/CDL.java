package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class CDL extends C06G {
    public final String A00;
    public final String A01;
    public final Map<EnumC3179C1j, String> A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CDL) {
                CDL cdl = (CDL) obj;
                if (!C7384Etj.areEqual(this.A01, cdl.A01) || !C7384Etj.areEqual(this.A00, cdl.A00) || this.A03 != cdl.A03 || this.A04 != cdl.A04 || !C7384Etj.areEqual(this.A02, cdl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, (((AnonymousClass005.A0I(this.A00, AnonymousClass001.A0G(this.A01)) + BV7.A02(this.A03 ? 1 : 0)) * 31) + BV7.A02(this.A04 ? 1 : 0)) * 31);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map<LX/C1j;Ljava/lang/String;>;)V */
    public CDL(String str, Map map, String str2, boolean z, boolean z2) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = map;
    }
}

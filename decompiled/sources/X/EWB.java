package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class EWB {
    public final String A00;
    public final String A01;
    public final Map<String, Object> A02;
    public final boolean A03;

    public EWB() {
        this(null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EWB) {
                EWB ewb = (EWB) obj;
                if (!C7384Etj.areEqual(this.A01, ewb.A01) || !C7384Etj.areEqual(this.A02, ewb.A02) || !C7384Etj.areEqual(this.A00, ewb.A00) || this.A03 != ewb.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        String str = this.A01;
        Map<String, Object> map = this.A02;
        String str2 = this.A00;
        boolean z = this.A03;
        StringBuilder sbA0x = C3cI.A0x("PttRequestParams(paymentAccountId=", null);
        sbA0x.append(", paymentOtcSessionId=");
        sbA0x.append((String) null);
        sbA0x.append(", paymentOtcType=");
        sbA0x.append((String) null);
        sbA0x.append(", paymentType=");
        sbA0x.append(str);
        sbA0x.append(", receiverId=");
        sbA0x.append((String) null);
        sbA0x.append(", loggingData=");
        sbA0x.append(map);
        sbA0x.append(", id=");
        sbA0x.append(str2);
        return C8j5.A0W(", enforceOptionalServerKey=", sbA0x, z);
    }

    public final int hashCode() {
        return C0KA.A00(((((AnonymousClass006.A0G(this.A01) * 31 * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass005.A0H(this.A00)) * 31, this.A03);
    }

    public EWB(String str, String str2, Map map, boolean z) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = str2;
        this.A03 = z;
    }
}

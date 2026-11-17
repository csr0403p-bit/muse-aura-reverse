package X;

/* loaded from: classes5.dex */
public final class EW2 {
    public final String A00;
    public final String A01;

    public EW2() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EW2) {
                EW2 ew2 = (EW2) obj;
                if (!C7384Etj.areEqual(this.A01, ew2.A01) || !C7384Etj.areEqual(this.A00, ew2.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        String str = this.A01;
        String str2 = this.A00;
        StringBuilder sbA0x = C3cI.A0x("ServerKeyQuery(targetAccountId=", null);
        sbA0x.append(", otcSessionId=");
        sbA0x.append((String) null);
        sbA0x.append(", otcType=");
        sbA0x.append((String) null);
        sbA0x.append(", receiverId=");
        sbA0x.append((String) null);
        sbA0x.append(", paymentType=");
        sbA0x.append(str);
        return C3cJ.A0N(", id=", str2, sbA0x);
    }

    public final int hashCode() {
        return (AnonymousClass006.A0G(this.A01) * 31) + AnonymousClass005.A0H(this.A00);
    }

    public EW2(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}

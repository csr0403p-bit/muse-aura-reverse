package X;

/* loaded from: classes6.dex */
public final class Hz2 extends C06G {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hz2) {
                Hz2 hz2 = (Hz2) obj;
                if (!C7384Etj.areEqual(this.A03, hz2.A03) || !C7384Etj.areEqual(this.A02, hz2.A02) || !C7384Etj.areEqual(this.A01, hz2.A01) || this.A00 != hz2.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int iA0I = AnonymousClass005.A0I(this.A01, AnonymousClass005.A0I(this.A02, AnonymousClass001.A0G(this.A03)));
        int iIntValue = this.A00.intValue();
        switch (iIntValue) {
            case 1:
                str = "ASYNCHRONOUS";
                break;
            case 2:
                str = "ASYNCHRONOUS_BATCHED";
                break;
            default:
                str = "USER_PURCHASE";
                break;
        }
        return iA0I + str.hashCode() + iIntValue;
    }

    public Hz2(String str, String str2, String str3, Integer num) {
        AnonymousClass005.A14(str, str2, str3, num);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = num;
    }
}

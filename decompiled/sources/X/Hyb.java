package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes6.dex */
public final class Hyb extends C06G {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hyb) {
                Hyb hyb = (Hyb) obj;
                if (!C7384Etj.areEqual(this.A04, hyb.A04) || !C7384Etj.areEqual(this.A05, hyb.A05) || this.A02 != hyb.A02 || this.A03 != hyb.A03 || this.A01 != hyb.A01 || this.A00 != hyb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA00 = C60R.A00(this.A02, AnonymousClass005.A0I(this.A05, AnonymousClass001.A0G(this.A04)));
        Integer num = this.A03;
        return ((((iA00 + BV5.A03(num, A0y(num))) * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        String str = this.A04;
        String str2 = this.A05;
        long j = this.A02;
        Integer num = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        StringBuilder sbA0x = C3cI.A0x("IapSubscriptionOffer(offerId=", str);
        sbA0x.append(", price=");
        sbA0x.append(str2);
        sbA0x.append(", priceAmountMicros=");
        sbA0x.append(j);
        sbA0x.append(", billingPeriodUnit=");
        sbA0x.append(num != null ? A0y(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", billingPeriodLength=");
        sbA0x.append(i);
        return AbstractC7610F5x.A0x(", billingCycleCount=", sbA0x, i2);
    }

    public Hyb(Integer num, String str, String str2, int i, int i2, long j) {
        AnonymousClass003.A0u(str, str2);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = j;
        this.A03 = num;
        this.A01 = i;
        this.A00 = i2;
    }

    public static String A0y(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "WEEK";
            case 2:
                return "MONTH";
            case 3:
                return "YEAR";
            case 4:
                return "UNKNOWN";
            default:
                return "DAY";
        }
    }
}

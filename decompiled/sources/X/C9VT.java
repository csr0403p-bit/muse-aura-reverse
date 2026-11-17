package X;

/* renamed from: X.9VT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VT extends C06G {
    public final Double A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9VT) {
                C9VT c9vt = (C9VT) obj;
                if (!C7384Etj.areEqual(this.A08, c9vt.A08) || !C7384Etj.areEqual(this.A00, c9vt.A00) || !C7384Etj.areEqual(this.A04, c9vt.A04) || !C7384Etj.areEqual(this.A05, c9vt.A05) || this.A03 != c9vt.A03 || this.A02 != c9vt.A02 || !C7384Etj.areEqual(this.A06, c9vt.A06) || !C7384Etj.areEqual(this.A07, c9vt.A07) || this.A01 != c9vt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iA0G = ((((((AnonymousClass006.A0G(this.A08) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0G(this.A05)) * 31;
        Integer num = this.A03;
        int iA00 = (iA0G + (num == null ? 0 : C9Vg.A00(num))) * 31;
        Integer num2 = this.A02;
        int iA002 = (((((iA00 + (num2 == null ? 0 : C9VO.A00(num2))) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A07)) * 31;
        Integer num3 = this.A01;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            iHashCode = (1 != iIntValue ? "TEMPORARY" : "PERMANENT").hashCode() + iIntValue;
        }
        return iA002 + iHashCode;
    }

    public C9VT(Double d, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4) {
        this.A08 = str;
        this.A00 = d;
        this.A04 = num;
        this.A05 = str2;
        this.A03 = num2;
        this.A02 = num3;
        this.A06 = str3;
        this.A07 = str4;
        this.A01 = num4;
    }

    public C9VT() {
        this(null, null, null, null, null, null, null, null, null);
    }
}

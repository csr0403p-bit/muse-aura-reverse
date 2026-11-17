package X;

/* renamed from: X.9Tm, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Tm extends C06G {
    public final double A00;
    public final double A01;
    public final Float A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Tm) {
                C9Tm c9Tm = (C9Tm) obj;
                if (!C7384Etj.areEqual(this.A09, c9Tm.A09) || !C7384Etj.areEqual(this.A0B, c9Tm.A0B) || !C7384Etj.areEqual(this.A08, c9Tm.A08) || Double.compare(this.A00, c9Tm.A00) != 0 || Double.compare(this.A01, c9Tm.A01) != 0 || !C7384Etj.areEqual(this.A07, c9Tm.A07) || !C7384Etj.areEqual(this.A02, c9Tm.A02) || !C7384Etj.areEqual(this.A05, c9Tm.A05) || !C7384Etj.areEqual(this.A0D, c9Tm.A0D) || this.A04 != c9Tm.A04 || this.A03 != c9Tm.A03 || !C7384Etj.areEqual(this.A0A, c9Tm.A0A) || !C7384Etj.areEqual(this.A06, c9Tm.A06) || !C7384Etj.areEqual(this.A0C, c9Tm.A0C) || !C7384Etj.areEqual(this.A0E, c9Tm.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0I = (((((AnonymousClass005.A0I(this.A07, (((AnonymousClass005.A0I(this.A08, AnonymousClass005.A0I(this.A0B, AnonymousClass001.A0G(this.A09))) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A00))) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A01))) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0G(this.A0D)) * 31;
        Integer num = this.A04;
        int iA00 = (iA0I + (num == null ? 0 : C9Vg.A00(num))) * 31;
        Integer num2 = this.A03;
        return ((AnonymousClass005.A0I(this.A06, (((iA00 + (num2 == null ? 0 : C9VO.A00(num2))) * 31) + AnonymousClass006.A0G(this.A0A)) * 31) + AnonymousClass006.A0G(this.A0C)) * 31) + AnonymousClass005.A0H(this.A0E);
    }

    public C9Tm(Float f, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, double d, double d2) {
        AnonymousClass003.A0u(str, str2);
        this.A09 = str;
        this.A0B = str2;
        this.A08 = str3;
        this.A00 = d;
        this.A01 = d2;
        this.A07 = str4;
        this.A02 = f;
        this.A05 = num;
        this.A0D = str5;
        this.A04 = num2;
        this.A03 = num3;
        this.A0A = str6;
        this.A06 = str7;
        this.A0C = str8;
        this.A0E = str9;
    }
}

package X;

/* renamed from: X.9xt, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9xt extends C06G {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9xt) {
                C9xt c9xt = (C9xt) obj;
                if (this.A09 != c9xt.A09 || this.A03 != c9xt.A03 || !C7384Etj.areEqual(this.A06, c9xt.A06) || !C7384Etj.areEqual(this.A05, c9xt.A05) || !C7384Etj.areEqual(this.A01, c9xt.A01) || !C7384Etj.areEqual(this.A07, c9xt.A07) || this.A0A != c9xt.A0A || !C7384Etj.areEqual(this.A02, c9xt.A02) || !C7384Etj.areEqual(this.A04, c9xt.A04) || this.A08 != c9xt.A08 || this.A00 != c9xt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01((((C0KA.A01((AnonymousClass005.A0I(this.A01, AnonymousClass005.A0I(this.A05, AnonymousClass005.A0I(this.A06, C0KA.A01(C0KA.A02(this.A09), this.A03)))) + AnonymousClass006.A0G(this.A07)) * 31, this.A0A) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass005.A0H(this.A04)) * 31, this.A08) + this.A00;
    }

    public C9xt(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = z;
        this.A03 = z2;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = str3;
        this.A07 = str4;
        this.A0A = z3;
        this.A02 = str5;
        this.A04 = str6;
        this.A08 = z4;
        this.A00 = i;
    }
}

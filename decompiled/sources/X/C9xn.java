package X;

/* renamed from: X.9xn, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9xn extends C06G {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9xn) {
                C9xn c9xn = (C9xn) obj;
                if (!C7384Etj.areEqual(this.A01, c9xn.A01) || !C7384Etj.areEqual(this.A0A, c9xn.A0A) || !C7384Etj.areEqual(this.A06, c9xn.A06) || !C7384Etj.areEqual(this.A04, c9xn.A04) || !C7384Etj.areEqual(this.A09, c9xn.A09) || !C7384Etj.areEqual(this.A05, c9xn.A05) || !C7384Etj.areEqual(this.A00, c9xn.A00) || !C7384Etj.areEqual(this.A07, c9xn.A07) || !C7384Etj.areEqual(this.A08, c9xn.A08) || !C7384Etj.areEqual(this.A02, c9xn.A02) || !C7384Etj.areEqual(this.A03, c9xn.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0I(this.A02, (AnonymousClass005.A0I(this.A07, AnonymousClass005.A0I(this.A00, AnonymousClass005.A0I(this.A05, AnonymousClass005.A0I(this.A09, AnonymousClass005.A0I(this.A04, AnonymousClass005.A0I(this.A06, AnonymousClass005.A0I(this.A0A, AnonymousClass001.A0G(this.A01)))))))) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass005.A0H(this.A03);
    }

    public C9xn(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A01 = str;
        this.A0A = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A09 = str5;
        this.A05 = str6;
        this.A00 = str7;
        this.A07 = str8;
        this.A08 = str9;
        this.A02 = str10;
        this.A03 = str11;
    }
}

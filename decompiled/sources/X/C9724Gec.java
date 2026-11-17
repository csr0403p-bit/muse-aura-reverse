package X;

/* renamed from: X.Gec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9724Gec extends C06G {
    public String A00;
    public final int A01;
    public final int A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9724Gec) {
                C9724Gec c9724Gec = (C9724Gec) obj;
                if (this.A02 != c9724Gec.A02 || !C7384Etj.areEqual(this.A06, c9724Gec.A06) || !C7384Etj.areEqual(this.A07, c9724Gec.A07) || this.A01 != c9724Gec.A01 || !C7384Etj.areEqual(this.A05, c9724Gec.A05) || !C7384Etj.areEqual(this.A08, c9724Gec.A08) || !C7384Etj.areEqual(this.A03, c9724Gec.A03) || !C7384Etj.areEqual(this.A00, c9724Gec.A00) || !C7384Etj.areEqual(this.A04, c9724Gec.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((this.A02 * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + this.A01) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0G(this.A00)) * 31) + C3cH.A02(this.A04);
    }

    public C9724Gec(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.A02 = i;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i2;
        this.A05 = str3;
        this.A08 = str4;
        this.A03 = bool;
        this.A00 = str5;
        this.A04 = bool2;
    }
}

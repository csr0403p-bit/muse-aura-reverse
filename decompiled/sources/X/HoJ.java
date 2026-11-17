package X;

/* loaded from: classes6.dex */
public final class HoJ extends C06G {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HoJ) {
                HoJ hoJ = (HoJ) obj;
                if (!C7384Etj.areEqual(this.A01, hoJ.A01) || !C7384Etj.areEqual(this.A06, hoJ.A06) || !C7384Etj.areEqual(this.A02, hoJ.A02) || !C7384Etj.areEqual(this.A03, hoJ.A03) || !C7384Etj.areEqual(this.A04, hoJ.A04) || !C7384Etj.areEqual(this.A05, hoJ.A05) || this.A00 != hoJ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0I(this.A05, AnonymousClass005.A0I(this.A04, (AnonymousClass005.A0I(this.A02, AnonymousClass005.A0I(this.A06, AnonymousClass001.A0G(this.A01))) + AnonymousClass006.A0G(this.A03)) * 31)));
    }

    public HoJ(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.A01 = str;
        this.A06 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A00 = j;
    }
}

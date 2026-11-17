package X;

/* renamed from: X.BIl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2259BIl extends C06G {
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2259BIl) {
                C2259BIl c2259BIl = (C2259BIl) obj;
                if (!C7384Etj.areEqual(this.A03, c2259BIl.A03) || !C7384Etj.areEqual(this.A04, c2259BIl.A04) || !C7384Etj.areEqual(this.A06, c2259BIl.A06) || !C7384Etj.areEqual(this.A02, c2259BIl.A02) || !C7384Etj.areEqual(this.A01, c2259BIl.A01) || !C7384Etj.areEqual(this.A00, c2259BIl.A00) || this.A07 != c2259BIl.A07 || !C7384Etj.areEqual(this.A05, c2259BIl.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(((((((((((AnonymousClass006.A0G(this.A03) * 31) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A00)) * 31, this.A07) + AnonymousClass005.A0H(this.A05);
    }

    public C2259BIl(Long l, Long l2, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A03 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A02 = str4;
        this.A01 = l;
        this.A00 = l2;
        this.A07 = z;
        this.A05 = str5;
    }

    public C2259BIl() {
        this(null, null, null, null, null, null, null, false);
    }
}

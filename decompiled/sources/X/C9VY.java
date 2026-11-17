package X;

/* renamed from: X.9VY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VY extends C06G {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9VY) {
                C9VY c9vy = (C9VY) obj;
                if (!C7384Etj.areEqual(this.A06, c9vy.A06) || !C7384Etj.areEqual(this.A05, c9vy.A05) || !C7384Etj.areEqual(this.A02, c9vy.A02) || !C7384Etj.areEqual(this.A03, c9vy.A03) || !C7384Etj.areEqual(this.A01, c9vy.A01) || !C7384Etj.areEqual(this.A04, c9vy.A04) || !C7384Etj.areEqual(this.A08, c9vy.A08) || !C7384Etj.areEqual(this.A00, c9vy.A00) || !C7384Etj.areEqual(this.A07, c9vy.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass006.A0G(this.A06) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass006.A0G(this.A03)) * 31) + AnonymousClass006.A0G(this.A01)) * 31) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass005.A0H(this.A07);
    }

    public C9VY(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A06 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A01 = str5;
        this.A04 = str6;
        this.A08 = str7;
        this.A00 = num;
        this.A07 = str8;
    }

    public C9VY() {
        this(null, null, null, null, null, null, null, null, null);
    }
}

package X;

/* renamed from: X.9xo, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9xo extends C06G {
    public final C9xk A00;
    public final C9xt A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9xo) {
                C9xo c9xo = (C9xo) obj;
                if (!C7384Etj.areEqual(this.A03, c9xo.A03) || !C7384Etj.areEqual(this.A02, c9xo.A02) || this.A04 != c9xo.A04 || !C7384Etj.areEqual(this.A06, c9xo.A06) || !C7384Etj.areEqual(this.A05, c9xo.A05) || !C7384Etj.areEqual(this.A01, c9xo.A01) || !C7384Etj.areEqual(this.A00, c9xo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((C0KA.A01(AnonymousClass005.A0I(this.A02, AnonymousClass001.A0G(this.A03)), this.A04) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + C3cH.A02(this.A00);
    }

    public C9xo(C9xk c9xk, C9xt c9xt, String str, String str2, String str3, String str4, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A06 = str3;
        this.A05 = str4;
        this.A01 = c9xt;
        this.A00 = c9xk;
    }
}

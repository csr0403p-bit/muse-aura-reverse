package X;

/* renamed from: X.9Ve, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Ve extends C06G {
    public final Double A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Ve) {
                C9Ve c9Ve = (C9Ve) obj;
                if (!C7384Etj.areEqual(this.A02, c9Ve.A02) || !C7384Etj.areEqual(this.A00, c9Ve.A00) || !C7384Etj.areEqual(this.A01, c9Ve.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass006.A0G(this.A02) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass005.A0H(this.A01);
    }

    public C9Ve(String str, String str2, Double d) {
        this.A02 = str;
        this.A00 = d;
        this.A01 = str2;
    }

    public C9Ve() {
        this(null, null, null);
    }
}

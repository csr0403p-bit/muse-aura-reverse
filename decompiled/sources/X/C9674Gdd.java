package X;

/* renamed from: X.Gdd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9674Gdd extends C06G {
    public final String A00 = "ALL_PRODUCTS";
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9674Gdd) {
                C9674Gdd c9674Gdd = (C9674Gdd) obj;
                if (!C7384Etj.areEqual(this.A00, c9674Gdd.A00) || !C7384Etj.areEqual(this.A01, c9674Gdd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9674Gdd(String str) {
        this.A01 = str;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A00) + AnonymousClass006.A0G(this.A01);
    }
}

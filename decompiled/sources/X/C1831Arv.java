package X;

/* renamed from: X.Arv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1831Arv {
    public final C1830Aru A00;
    public final C1848AsL A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1831Arv) {
                C1831Arv c1831Arv = (C1831Arv) obj;
                if (!C7384Etj.areEqual(this.A00, c1831Arv.A00) || !C7384Etj.areEqual(this.A01, c1831Arv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C60R.A01(this.A01) * 31) + C8j4.A0E(this.A00, 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PlatformTextStyle(spanStyle=");
        sbA0x.append(this.A01);
        sbA0x.append(", paragraphSyle=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C1831Arv(C1830Aru c1830Aru, C1848AsL c1848AsL) {
        this.A01 = c1848AsL;
        this.A00 = c1830Aru;
    }

    public C1831Arv() {
        this(new C1830Aru(false), null);
    }
}

package X;

/* loaded from: classes6.dex */
public final class GRA extends C06G {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GRA) {
                GRA gra = (GRA) obj;
                if (!C7384Etj.areEqual(this.A01, gra.A01) || !C7384Etj.areEqual(this.A00, gra.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + AnonymousClass006.A0G(this.A00);
    }

    public GRA(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}

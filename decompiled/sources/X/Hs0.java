package X;

/* loaded from: classes6.dex */
public final class Hs0 extends C06G {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hs0) {
                Hs0 hs0 = (Hs0) obj;
                if (!C7384Etj.areEqual(this.A00, hs0.A00) || !C7384Etj.areEqual(this.A02, hs0.A02) || !C7384Etj.areEqual(this.A01, hs0.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass006.A0G(this.A00) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + AnonymousClass006.A0G(this.A01)) * 31;
    }

    public Hs0(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}

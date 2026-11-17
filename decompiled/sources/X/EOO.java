package X;

/* loaded from: classes5.dex */
public final class EOO {
    public final EO0 A00;
    public final EO0 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EOO) {
                EOO eoo = (EOO) obj;
                if (!this.A01.equals(eoo.A01) || !C7384Etj.areEqual(this.A00, eoo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", debug=", C3cG.A0f(this.A01, "ContentProviders(production="));
    }

    public EOO(EO0 eo0, EO0 eo02) {
        this.A01 = eo0;
        this.A00 = eo02;
    }
}

package X;

/* loaded from: classes5.dex */
public final class EK1 {
    public final Long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EK1) {
                EK1 ek1 = (EK1) obj;
                if (!this.A01.equals(ek1.A01) || !C7384Etj.areEqual(this.A00, ek1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", value=", C3cI.A0x("Preference(key=", this.A01));
    }

    public EK1(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }
}

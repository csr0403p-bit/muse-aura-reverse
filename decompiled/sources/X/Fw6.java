package X;

/* loaded from: classes6.dex */
public final class Fw6 {
    public final String A00;
    public final boolean A01;

    public Fw6(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Fw6) {
                Fw6 fw6 = (Fw6) obj;
                if (!this.A00.equals(fw6.A00) || this.A01 != fw6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0n("MetaHealthQuantitySampleType(id=", this.A00, ", isCumulative=", ")", this.A01);
    }
}

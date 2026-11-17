package X;

/* renamed from: X.Exf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7482Exf {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.fresco.urimod.Dimensions");
                C7482Exf c7482Exf = (C7482Exf) obj;
                if (this.A01 != c7482Exf.A01 || this.A00 != c7482Exf.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return FGI.A07(this.A01, this.A00, "x");
    }

    public C7482Exf(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}

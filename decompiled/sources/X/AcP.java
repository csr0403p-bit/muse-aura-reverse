package X;

/* loaded from: classes4.dex */
public final class AcP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AcP) {
                AcP acP = (AcP) obj;
                if (this.A01 != acP.A01 || this.A00 != acP.A00) {
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
        return C8j4.A0y("Interval(start=", ", end=", this.A01, this.A00);
    }

    public AcP(int i, int i2) {
        String str;
        this.A01 = i;
        this.A00 = i2;
        if (i < 0) {
            str = "negative start index";
        } else if (i2 >= i) {
            return;
        } else {
            str = "end index greater than start";
        }
        AbstractC1061ATk.A00(str);
        throw F60.createAndThrow();
    }
}

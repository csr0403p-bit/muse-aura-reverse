package X;

/* loaded from: classes6.dex */
public final class Hl5 {
    public int A01 = 0;
    public double A00 = 0.0d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hl5) {
                Hl5 hl5 = (Hl5) obj;
                if (this.A01 != hl5.A01 || Double.compare(this.A00, hl5.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AvgData(count=");
        sbA0x.append(this.A01);
        sbA0x.append(", total=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }
}

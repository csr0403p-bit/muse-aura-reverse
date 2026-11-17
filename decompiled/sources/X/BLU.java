package X;

/* loaded from: classes4.dex */
public final class BLU {
    public static final BLU A04 = new BLU(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BLU) {
                BLU blu = (BLU) obj;
                if (this.A01 != blu.A01 || this.A03 != blu.A03 || this.A02 != blu.A02 || this.A00 != blu.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final long A00() {
        int i = this.A01;
        int i2 = i + ((this.A02 - i) / 2);
        int i3 = this.A03;
        return C8j3.A0T(i2, i3 + ((this.A00 - i3) / 2));
    }

    public final long A01() {
        return C8j3.A0T(this.A02 - this.A01, this.A00 - this.A03);
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("IntRect.fromLTRB(");
        sbA0x.append(this.A01);
        sbA0x.append(", ");
        sbA0x.append(this.A03);
        sbA0x.append(", ");
        sbA0x.append(this.A02);
        sbA0x.append(", ");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public BLU(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}

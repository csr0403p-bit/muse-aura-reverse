package X;

/* loaded from: classes5.dex */
public final class BdE extends Bd6 {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Bd6) {
                BdE bdE = (BdE) ((Bd6) obj);
                if (this.A01 != bdE.A01 || this.A02 != bdE.A02 || this.A00 != bdE.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01 ^ 1000003) * 1000003) ^ this.A02) * 1000003) ^ this.A00;
    }

    public final String toString() {
        return FGI.A0f("VideoEncoderDataSpace{standard=", ", transfer=", ", range=", "}", this.A01, this.A02, this.A00);
    }

    public BdE(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }
}

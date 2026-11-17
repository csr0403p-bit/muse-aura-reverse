package X;

/* loaded from: classes6.dex */
public final class Hoy {
    public final int A00;
    public final B0q A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hoy) {
                Hoy hoy = (Hoy) obj;
                if (!this.A01.equals(hoy.A01) || this.A00 != hoy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ImageVectorEntry(imageVector=");
        sbA0x.append(this.A01);
        sbA0x.append(", configFlags=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public Hoy(B0q b0q, int i) {
        this.A01 = b0q;
        this.A00 = i;
    }
}

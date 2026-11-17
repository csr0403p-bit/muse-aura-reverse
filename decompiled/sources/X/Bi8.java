package X;

/* loaded from: classes5.dex */
public final class Bi8 extends AbstractC2814Blr {
    public final int A00;
    public final int A01;
    public final BiM<AbstractC2815Bls> A02;
    public final BiM<AbstractC2815Bls> A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2814Blr) {
                Bi8 bi8 = (Bi8) ((AbstractC2814Blr) obj);
                if (!this.A02.equals(bi8.A02) || !this.A03.equals(bi8.A03) || this.A00 != bi8.A00 || this.A01 != bi8.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((BV6.A08(this.A03, (this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("In{edge=");
        sbA0x.append(this.A02);
        sbA0x.append(", postviewEdge=");
        sbA0x.append(this.A03);
        sbA0x.append(", inputFormat=");
        sbA0x.append(this.A00);
        sbA0x.append(", outputFormat=");
        return BV8.A0z(sbA0x, this.A01);
    }

    public Bi8(BiM<AbstractC2815Bls> biM, BiM<AbstractC2815Bls> biM2, int i, int i2) {
        this.A02 = biM;
        this.A03 = biM2;
        this.A00 = i;
        this.A01 = i2;
    }
}

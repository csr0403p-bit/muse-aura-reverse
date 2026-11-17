package X;

/* loaded from: classes6.dex */
public final class GMG extends GLK {
    public final GMM A00;

    public final boolean equals(Object o) {
        return (o instanceof GMG) && ((GMG) o).A00 == this.A00;
    }

    public final int hashCode() {
        return BV7.A0D(GMG.class, this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ChaCha20Poly1305 Parameters (variant: ");
        sbA0x.append(this.A00);
        return BV7.A10(sbA0x);
    }

    public GMG(GMM variant) {
        this.A00 = variant;
    }
}

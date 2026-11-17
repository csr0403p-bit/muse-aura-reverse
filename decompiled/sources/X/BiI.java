package X;

/* loaded from: classes5.dex */
public final class BiI extends AbstractC2812Blp {
    public final int A00;
    public final AbstractC2866BnZ<InterfaceC2873Bng> A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2812Blp) {
                BiI biI = (BiI) ((AbstractC2812Blp) obj);
                if (!this.A01.equals(biI.A01) || this.A00 != biI.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV8.A0A(this.A01) ^ this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("In{packet=");
        sbA0x.append(this.A01);
        sbA0x.append(", jpegQuality=");
        return BV8.A0z(sbA0x, this.A00);
    }

    public BiI(AbstractC2866BnZ<InterfaceC2873Bng> abstractC2866BnZ, int i) {
        if (abstractC2866BnZ == null) {
            throw BV4.A0a("Null packet");
        }
        this.A01 = abstractC2866BnZ;
        this.A00 = i;
    }
}

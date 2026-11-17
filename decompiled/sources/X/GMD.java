package X;

/* loaded from: classes6.dex */
public final class GMD extends GLK {
    public final GMP A00;
    public final String A01;

    public final boolean equals(Object o) {
        if (!(o instanceof GMD)) {
            return false;
        }
        GMD gmd = (GMD) o;
        if (gmd.A01.equals(this.A01)) {
            return BV7.A1X(gmd.A00, this.A00, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0E(GMD.class, this.A01, this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LegacyKmsAead Parameters (keyUri: ");
        sbA0x.append(this.A01);
        sbA0x.append(", variant: ");
        sbA0x.append(this.A00);
        return BV7.A10(sbA0x);
    }

    public GMD(GMP keyUri, String variant) {
        this.A01 = variant;
        this.A00 = keyUri;
    }
}

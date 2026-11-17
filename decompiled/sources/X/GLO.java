package X;

/* loaded from: classes6.dex */
public final class GLO extends AbstractC9487GLd {
    public final int A00;
    public final int A01;
    public final GLL A02;
    public final C9484GLa A03;

    private final int A00() {
        C9484GLa c9484GLa = this.A03;
        if (c9484GLa == C9484GLa.A03) {
            return this.A01;
        }
        if (c9484GLa == C9484GLa.A04 || c9484GLa == C9484GLa.A01 || c9484GLa == C9484GLa.A02) {
            return this.A01 + 5;
        }
        throw C3cG.A0Q("Unknown variant");
    }

    public final boolean equals(Object o) {
        if (!(o instanceof GLO)) {
            return false;
        }
        GLO glo = (GLO) o;
        return glo.A00 == this.A00 && glo.A00() == A00() && glo.A03 == this.A03 && glo.A02 == this.A02;
    }

    public final int hashCode() {
        return BV7.A0F(GLO.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A03, this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HMAC Parameters (variant: ");
        sbA0x.append(this.A03);
        sbA0x.append(", hashType: ");
        AbstractC7608F5v.A1O(sbA0x, this.A02);
        sbA0x.append(this.A01);
        sbA0x.append("-byte tags, and ");
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v("-byte key)", sbA0x);
    }

    public GLO(GLL keySizeBytes, C9484GLa tagSizeBytes, int variant, int hashType) {
        this.A00 = variant;
        this.A01 = hashType;
        this.A03 = tagSizeBytes;
        this.A02 = keySizeBytes;
    }
}

package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GLV extends AbstractC9487GLd {
    public final int A00;
    public final int A01;
    public final GLZ A02;

    private final int A00() {
        GLZ glz = this.A02;
        if (glz == GLZ.A03) {
            return this.A01;
        }
        if (glz == GLZ.A04 || glz == GLZ.A01 || glz == GLZ.A02) {
            return this.A01 + 5;
        }
        throw C3cG.A0Q("Unknown variant");
    }

    public final boolean equals(Object o) {
        if (!(o instanceof GLV)) {
            return false;
        }
        GLV glv = (GLV) o;
        return glv.A00 == this.A00 && glv.A00() == A00() && glv.A02 == this.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{GLV.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02});
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AES-CMAC Parameters (variant: ");
        AbstractC7608F5v.A1O(sbA0x, this.A02);
        sbA0x.append(this.A01);
        sbA0x.append("-byte tags, and ");
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v("-byte key)", sbA0x);
    }

    public GLV(GLZ keySizeBytes, int tagSizeBytes, int variant) {
        this.A00 = tagSizeBytes;
        this.A01 = variant;
        this.A02 = keySizeBytes;
    }
}

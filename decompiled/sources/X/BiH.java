package X;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class BiH extends AbstractC2811Blo {
    public final int A00;
    public final AbstractC2866BnZ<Bitmap> A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2811Blo) {
                BiH biH = (BiH) ((AbstractC2811Blo) obj);
                if (!this.A01.equals(biH.A01) || this.A00 != biH.A00) {
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

    public BiH(AbstractC2866BnZ<Bitmap> abstractC2866BnZ, int i) {
        if (abstractC2866BnZ == null) {
            throw BV4.A0a("Null packet");
        }
        this.A01 = abstractC2866BnZ;
        this.A00 = i;
    }
}

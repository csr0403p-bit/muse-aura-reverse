package X;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes5.dex */
public final class Bi9 extends AbstractC2816Blt {
    public final int A00;
    public final ImageCaptureException A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2816Blt) {
                Bi9 bi9 = (Bi9) ((AbstractC2816Blt) obj);
                if (this.A00 != bi9.A00 || !this.A01.equals(bi9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A01, (this.A00 ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CaptureError{requestId=");
        sbA0x.append(this.A00);
        sbA0x.append(", imageCaptureException=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public Bi9(ImageCaptureException imageCaptureException, int i) {
        this.A00 = i;
        if (imageCaptureException == null) {
            throw BV4.A0a("Null imageCaptureException");
        }
        this.A01 = imageCaptureException;
    }
}

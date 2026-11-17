package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes5.dex */
public final class BfX extends BhO {
    public final int A00;
    public final int A01;
    public final Matrix A02;
    public final Rect A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BhO) {
                BfX bfX = (BfX) ((BhO) obj);
                if (!this.A03.equals(bfX.A03) || this.A00 != bfX.A00 || this.A01 != bfX.A01 || this.A04 != bfX.A04 || !this.A02.equals(bfX.A02) || this.A05 != bfX.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A08(this.A02, (((((((this.A03.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ this.A01) * 1000003) ^ BV7.A02(this.A04 ? 1 : 0)) * 1000003) ^ (this.A05 ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TransformationInfo{getCropRect=");
        sbA0x.append(this.A03);
        sbA0x.append(", getRotationDegrees=");
        sbA0x.append(this.A00);
        sbA0x.append(", getTargetRotation=");
        sbA0x.append(this.A01);
        sbA0x.append(", hasCameraTransform=");
        sbA0x.append(this.A04);
        sbA0x.append(", getSensorToBufferTransform=");
        sbA0x.append(this.A02);
        sbA0x.append(", isMirroring=");
        sbA0x.append(this.A05);
        return BV7.A11(sbA0x);
    }

    public BfX(Matrix matrix, Rect rect, int i, int i2, boolean z, boolean z2) {
        if (rect == null) {
            throw BV4.A0a("Null getCropRect");
        }
        this.A03 = rect;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A02 = matrix;
        this.A05 = z2;
    }
}

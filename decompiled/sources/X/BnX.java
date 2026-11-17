package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes5.dex */
public final class BnX<T> extends AbstractC2866BnZ<T> {
    public final int A00;
    public final int A01;
    public final Matrix A02;
    public final Rect A03;
    public final Size A04;
    public final InterfaceC2861BnK A05;
    public final BqP A06;
    public final T A07;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2866BnZ) {
                BnX bnX = (BnX) ((AbstractC2866BnZ) obj);
                if (this.A07.equals(bnX.A07)) {
                    BqP bqP = this.A06;
                    BqP bqP2 = bnX.A06;
                    if (bqP != null ? bqP.equals(bqP2) : bqP2 == null) {
                        if (this.A00 != bnX.A00 || !this.A04.equals(bnX.A04) || !this.A03.equals(bnX.A03) || this.A01 != bnX.A01 || !this.A02.equals(bnX.A02) || !this.A05.equals(bnX.A05)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A05, BV6.A08(this.A02, (BV6.A08(this.A03, BV6.A08(this.A04, (((((this.A07.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A06)) * 1000003) ^ this.A00) * 1000003)) ^ this.A01) * 1000003));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Packet{data=");
        sbA0x.append(this.A07);
        sbA0x.append(", exif=");
        sbA0x.append(this.A06);
        sbA0x.append(", format=");
        sbA0x.append(this.A00);
        sbA0x.append(", size=");
        sbA0x.append(this.A04);
        sbA0x.append(", cropRect=");
        sbA0x.append(this.A03);
        sbA0x.append(", rotationDegrees=");
        sbA0x.append(this.A01);
        sbA0x.append(", sensorToBufferTransform=");
        sbA0x.append(this.A02);
        sbA0x.append(", cameraCaptureResult=");
        return BV8.A0v(this.A05, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/BqP;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LX/BnK;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public BnX(Matrix matrix, Rect rect, Size size, InterfaceC2861BnK interfaceC2861BnK, BqP bqP, Object obj, int i, int i2) {
        if (obj == 0) {
            throw BV4.A0a("Null data");
        }
        this.A07 = obj;
        this.A06 = bqP;
        this.A00 = i;
        if (size == null) {
            throw BV4.A0a("Null size");
        }
        this.A04 = size;
        if (rect == null) {
            throw BV4.A0a("Null cropRect");
        }
        this.A03 = rect;
        this.A01 = i2;
        if (matrix == null) {
            throw BV4.A0a("Null sensorToBufferTransform");
        }
        this.A02 = matrix;
        if (interfaceC2861BnK == null) {
            throw BV4.A0a("Null cameraCaptureResult");
        }
        this.A05 = interfaceC2861BnK;
    }
}

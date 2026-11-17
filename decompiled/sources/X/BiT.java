package X;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes5.dex */
public final class BiT extends BhN {
    public final int A00;
    public final Rect A01;
    public final Size A02;
    public final InterfaceC2610Bfb A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BhN) {
                BiT biT = (BiT) ((BhN) obj);
                if (this.A02.equals(biT.A02) && this.A01.equals(biT.A01)) {
                    InterfaceC2610Bfb interfaceC2610Bfb = this.A03;
                    InterfaceC2610Bfb interfaceC2610Bfb2 = biT.A03;
                    if (interfaceC2610Bfb != null ? interfaceC2610Bfb.equals(interfaceC2610Bfb2) : interfaceC2610Bfb2 == null) {
                        if (this.A00 != biT.A00 || this.A04 != biT.A04) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((BV6.A08(this.A01, (this.A02.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A03)) * 1000003) ^ this.A00) * 1000003) ^ BV7.A02(this.A04 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CameraInputInfo{inputSize=");
        sbA0x.append(this.A02);
        sbA0x.append(", inputCropRect=");
        sbA0x.append(this.A01);
        sbA0x.append(", cameraInternal=");
        sbA0x.append(this.A03);
        sbA0x.append(", rotationDegrees=");
        sbA0x.append(this.A00);
        sbA0x.append(", mirroring=");
        sbA0x.append(this.A04);
        return BV7.A11(sbA0x);
    }

    public BiT(Rect rect, Size size, InterfaceC2610Bfb interfaceC2610Bfb, int i, boolean z) {
        if (size == null) {
            throw BV4.A0a("Null inputSize");
        }
        this.A02 = size;
        if (rect == null) {
            throw BV4.A0a("Null inputCropRect");
        }
        this.A01 = rect;
        this.A03 = interfaceC2610Bfb;
        this.A00 = i;
        this.A04 = z;
    }
}

package X;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class BfT extends BhW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Rect A03;
    public final Size A04;
    public final UUID A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BhW) {
                BfT bfT = (BfT) ((BhW) obj);
                if (!this.A05.equals(bfT.A05) || this.A02 != bfT.A02 || this.A00 != bfT.A00 || !this.A03.equals(bfT.A03) || !this.A04.equals(bfT.A04) || this.A01 != bfT.A01 || this.A06 != bfT.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((BV6.A08(this.A04, BV6.A08(this.A03, (((((this.A05.hashCode() ^ 1000003) * 1000003) ^ this.A02) * 1000003) ^ this.A00) * 1000003)) ^ this.A01) * 1000003) ^ BV7.A02(this.A06 ? 1 : 0)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OutConfig{getUuid=");
        sbA0x.append(this.A05);
        sbA0x.append(", getTargets=");
        sbA0x.append(this.A02);
        sbA0x.append(", getFormat=");
        sbA0x.append(this.A00);
        sbA0x.append(", getCropRect=");
        sbA0x.append(this.A03);
        sbA0x.append(", getSize=");
        sbA0x.append(this.A04);
        sbA0x.append(", getRotationDegrees=");
        sbA0x.append(this.A01);
        sbA0x.append(", isMirroring=");
        sbA0x.append(this.A06);
        sbA0x.append(", shouldRespectInputCropRect=");
        sbA0x.append(false);
        return BV7.A11(sbA0x);
    }

    public BfT(Rect rect, Size size, UUID uuid, int i, int i2, int i3, boolean z) {
        if (uuid == null) {
            throw BV4.A0a("Null getUuid");
        }
        this.A05 = uuid;
        this.A02 = i;
        this.A00 = i2;
        if (rect == null) {
            throw BV4.A0a("Null getCropRect");
        }
        this.A03 = rect;
        if (size == null) {
            throw BV4.A0a("Null getSize");
        }
        this.A04 = size;
        this.A01 = i3;
        this.A06 = z;
    }
}

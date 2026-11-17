package X;

import android.graphics.Point;
import android.view.RoundedCorner;

/* loaded from: classes6.dex */
public final class HkQ {
    public final int A00;
    public final int A01;
    public final Point A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof HkQ) {
                HkQ hkQ = (HkQ) obj;
                if (this.A00 != hkQ.A00 || this.A01 != hkQ.A01 || !this.A02.equals(hkQ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public HkQ(Point point, int i, int i2) {
        int i3 = point.x;
        int i4 = point.y;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = new Point(i3, i4);
    }

    public static HkQ A00(RoundedCorner roundedCorner) {
        if (roundedCorner == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        int i = 0;
        if (position != 0) {
            i = 1;
            if (position != 1) {
                i = 2;
                if (position != 2) {
                    i = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(FGI.A0H("Invalid position: ", position));
                    }
                }
            }
        }
        return new HkQ(roundedCorner.getCenter(), i, roundedCorner.getRadius());
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RoundedCornerCompat{position=");
        int i = this.A00;
        sbA0x.append(i != 0 ? i != 1 ? i != 2 ? "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sbA0x.append(", radius=");
        sbA0x.append(this.A01);
        sbA0x.append(", center=");
        sbA0x.append(this.A02);
        return C8j3.A15(sbA0x);
    }
}

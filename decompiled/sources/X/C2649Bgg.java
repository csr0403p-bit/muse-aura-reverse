package X;

import java.util.List;

/* renamed from: X.Bgg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2649Bgg extends BhS {
    public final int A00;
    public final int A01 = -1;
    public final C2507Bcd A02;
    public final BjC A03;
    public final List<BjC> A04;

    public C2649Bgg(C2507Bcd c2507Bcd, BjC bjC, List list, int i) {
        this.A03 = bjC;
        this.A04 = list;
        this.A00 = i;
        this.A02 = c2507Bcd;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BhS) {
                C2649Bgg c2649Bgg = (C2649Bgg) ((BhS) obj);
                if (!this.A03.equals(c2649Bgg.A03) || !this.A04.equals(c2649Bgg.A04) || this.A00 != c2649Bgg.A00 || this.A01 != c2649Bgg.A01 || !this.A02.equals(c2649Bgg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A02, ((((((((this.A03.hashCode() ^ 1000003) * 1000003) ^ this.A04.hashCode()) * 1000003) * 1000003) ^ this.A00) * 1000003) ^ this.A01) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OutputConfig{surface=");
        sbA0x.append(this.A03);
        sbA0x.append(", sharedSurfaces=");
        sbA0x.append(this.A04);
        sbA0x.append(", physicalCameraId=");
        sbA0x.append((String) null);
        sbA0x.append(", mirrorMode=");
        sbA0x.append(this.A00);
        sbA0x.append(", surfaceGroupId=");
        sbA0x.append(this.A01);
        sbA0x.append(", dynamicRange=");
        return BV8.A0v(this.A02, sbA0x);
    }
}

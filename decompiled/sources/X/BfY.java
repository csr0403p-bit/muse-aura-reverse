package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BfY extends BhV {
    public final BfK A00;
    public final BfK A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BhV) {
                BfY bfY = (BfY) ((BhV) obj);
                if (!this.A00.equals(bfY.A00) || !this.A01.equals(bfY.A01) || !this.A02.equals(bfY.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A08(this.A01, (this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("In{primarySurfaceEdge=");
        sbA0x.append(this.A00);
        sbA0x.append(", secondarySurfaceEdge=");
        sbA0x.append(this.A01);
        sbA0x.append(", outConfigs=");
        return BV8.A0v(this.A02, sbA0x);
    }

    public BfY(BfK bfK, BfK bfK2, List list) {
        if (bfK == null) {
            throw BV4.A0a("Null primarySurfaceEdge");
        }
        this.A00 = bfK;
        if (bfK2 == null) {
            throw BV4.A0a("Null secondarySurfaceEdge");
        }
        this.A01 = bfK2;
        if (list == null) {
            throw BV4.A0a("Null outConfigs");
        }
        this.A02 = list;
    }
}

package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BfZ extends BhT {
    public final BfK A00;
    public final List<BhW> A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BhT) {
                BfZ bfZ = (BfZ) ((BhT) obj);
                if (!this.A00.equals(bfZ.A00) || !this.A01.equals(bfZ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV8.A0A(this.A00) ^ this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("In{surfaceEdge=");
        sbA0x.append(this.A00);
        sbA0x.append(", outConfigs=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public BfZ(BfK bfK, List<BhW> list) {
        if (bfK == null) {
            throw BV4.A0a("Null surfaceEdge");
        }
        this.A00 = bfK;
        if (list == null) {
            throw BV4.A0a("Null outConfigs");
        }
        this.A01 = list;
    }
}

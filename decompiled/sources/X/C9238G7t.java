package X;

/* renamed from: X.G7t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9238G7t {
    public final char A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9238G7t) {
                C9238G7t c9238G7t = (C9238G7t) obj;
                if (this.A02 != c9238G7t.A02 || this.A00 != c9238G7t.A00 || this.A01 != c9238G7t.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ListMarkerInfo(markerLength=");
        sbA0x.append(this.A02);
        sbA0x.append(", markerType=");
        sbA0x.append(this.A00);
        sbA0x.append(", markerIndent=");
        return C8j5.A0X(sbA0x, this.A01);
    }

    public C9238G7t(char c, int i, int i2) {
        this.A02 = i;
        this.A00 = c;
        this.A01 = i2;
    }
}

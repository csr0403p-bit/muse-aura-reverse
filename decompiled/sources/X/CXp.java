package X;

/* loaded from: classes5.dex */
public final class CXp extends C06G {
    public final byte A00;
    public final boolean A01;

    public CXp() {
        this((byte) 3, true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CXp) {
                CXp cXp = (CXp) obj;
                if (this.A00 != cXp.A00 || this.A01 != cXp.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(this.A00 * 31, this.A01);
    }

    public CXp(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }
}

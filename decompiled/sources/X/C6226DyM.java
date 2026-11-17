package X;

/* renamed from: X.DyM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6226DyM {
    public static final C6226DyM A02 = new C6226DyM(-1, -1);
    public final int A00;
    public final int A01;

    static {
        new C6226DyM(0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof C6226DyM) {
                    C6226DyM c6226DyM = (C6226DyM) obj;
                    if (this.A01 != c6226DyM.A01 || this.A00 != c6226DyM.A00) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return FGI.A07(this.A01, this.A00, "x");
    }

    public C6226DyM(int i, int i2) {
        C1G.A07((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.A01 = i;
        this.A00 = i2;
    }
}

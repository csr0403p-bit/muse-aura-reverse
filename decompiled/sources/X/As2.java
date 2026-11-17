package X;

/* loaded from: classes4.dex */
public final class As2 {
    public final int A00;
    public final boolean A01;
    public static final As2 A03 = new As2(2, false);
    public static final As2 A02 = new As2(1, true);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof As2) {
                As2 as2 = (As2) obj;
                if (this.A00 != as2.A00 || this.A01 != as2.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(this.A00 * 31, this.A01);
    }

    public final String toString() {
        return equals(A03) ? "TextMotion.Static" : equals(A02) ? "TextMotion.Animated" : "Invalid";
    }

    public As2(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}

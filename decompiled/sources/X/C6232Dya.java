package X;

/* renamed from: X.Dya, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6232Dya {
    public static final C6232Dya A03 = new C6232Dya(0, 0, 1.0f);
    public final float A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6232Dya) {
                C6232Dya c6232Dya = (C6232Dya) obj;
                if (this.A02 != c6232Dya.A02 || this.A01 != c6232Dya.A01 || this.A00 != c6232Dya.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((217 + this.A02) * 31) + this.A01) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public C6232Dya(int i, int i2, float f) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }
}

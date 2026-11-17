package X;

/* renamed from: X.1DH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DH {
    public final float A00;
    public final C1EQ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1DH) {
                C1DH c1dh = (C1DH) obj;
                if (!C1DG.A08(this.A00, c1dh.A00) || !this.A01.equals(c1dh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, Float.floatToIntBits(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        C1DG.A07(sb, this.A00);
        sb.append(", brush=");
        return AnonymousClass007.A0Z(this.A01, sb);
    }

    public C1DH(C1EQ c1eq, float f) {
        this.A00 = f;
        this.A01 = c1eq;
    }
}

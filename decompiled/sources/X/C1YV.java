package X;

/* renamed from: X.1YV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YV {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1YV) {
                C1YV c1yv = (C1YV) obj;
                if (this.A00 != c1yv.A00 || this.A01 != c1yv.A01 || this.A02 != c1yv.A02 || this.A03 != c1yv.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.A00) * 31, this.A01), this.A02) + Float.floatToIntBits(this.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.A00);
        sb.append(", focusedAlpha=");
        sb.append(this.A01);
        sb.append(", hoveredAlpha=");
        sb.append(this.A02);
        sb.append(", pressedAlpha=");
        sb.append(this.A03);
        return AnonymousClass006.A0z(sb);
    }

    public C1YV(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}

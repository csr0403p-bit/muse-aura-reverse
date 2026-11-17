package X;

/* loaded from: classes6.dex */
public final class FJB extends C06G {
    public final float A00;
    public final int A01 = 2;

    public FJB(float f) {
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FJB) {
                FJB fjb = (FJB) obj;
                if (Float.compare(this.A00, fjb.A00) != 0 || this.A01 != fjb.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A04(this.A00) + this.A01;
    }
}

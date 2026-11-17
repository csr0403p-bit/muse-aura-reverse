package X;

/* loaded from: classes4.dex */
public final class B39 extends B3E {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B39) {
                B39 b39 = (B39) obj;
                if (!Float.valueOf(this.A01).equals(Float.valueOf(b39.A01)) || !Float.valueOf(this.A00).equals(Float.valueOf(b39.A00))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A01), this.A00);
    }

    public final String toString() {
        return FGI.A0P("Progress(min=", ", max=", ')', this.A01, this.A00);
    }

    public B39(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public B39() {
        this(0.0f, 1.0f);
    }
}

package X;

/* loaded from: classes6.dex */
public final class FMX extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FMX) {
                FMX fmx = (FMX) obj;
                if (Float.compare(this.A00, fmx.A00) != 0 || Float.compare(this.A01, fmx.A01) != 0 || Float.compare(this.A02, fmx.A02) != 0 || Float.compare(this.A03, fmx.A03) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A00), this.A01), this.A02), this.A03);
    }

    public FMX(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}

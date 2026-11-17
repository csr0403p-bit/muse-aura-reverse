package X;

/* loaded from: classes6.dex */
public final class FP8<TColor> extends C06G {
    public final float A00;
    public final TColor A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FP8) {
                FP8 fp8 = (FP8) obj;
                if (!C7384Etj.areEqual(this.A01, fp8.A01) || Float.compare(this.A00, fp8.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass006.A0D(this.A01) * 31, this.A00);
    }

    public FP8(TColor tcolor, float f) {
        this.A01 = tcolor;
        this.A00 = f;
    }
}

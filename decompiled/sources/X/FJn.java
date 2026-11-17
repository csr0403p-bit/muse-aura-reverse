package X;

/* loaded from: classes6.dex */
public final class FJn {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FJn) {
                FJn fJn = (FJn) obj;
                if (this.A06 != fJn.A06 || this.A07 != fJn.A07 || Float.compare(this.A05, fJn.A05) != 0 || Float.compare(this.A00, fJn.A00) != 0 || Float.compare(this.A04, fJn.A04) != 0 || Float.compare(this.A01, fJn.A01) != 0 || Float.compare(this.A02, fJn.A02) != 0 || Float.compare(this.A03, fJn.A03) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(((this.A06 * 31) + this.A07) * 31, this.A05), this.A00), this.A04), this.A01), this.A02), this.A03);
    }

    public final String toString() {
        int i = this.A06;
        int i2 = this.A07;
        float f = this.A05;
        float f2 = this.A00;
        float f3 = this.A04;
        float f4 = this.A01;
        float f5 = this.A02;
        float f6 = this.A03;
        StringBuilder sbA0y = C60O.A0y("TouchExpansion(childId=", i);
        sbA0y.append(", zIndex=");
        sbA0y.append(i2);
        sbA0y.append(", topPx=");
        sbA0y.append(f);
        sbA0y.append(", bottomPx=");
        sbA0y.append(f2);
        sbA0y.append(", startPx=");
        sbA0y.append(f3);
        sbA0y.append(", endPx=");
        sbA0y.append(f4);
        sbA0y.append(", leftPx=");
        sbA0y.append(f5);
        sbA0y.append(", rightPx=");
        sbA0y.append(f6);
        return BV7.A10(sbA0y);
    }

    public FJn(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2) {
        this.A06 = i;
        this.A07 = i2;
        this.A05 = f;
        this.A00 = f2;
        this.A04 = f3;
        this.A01 = f4;
        this.A02 = f5;
        this.A03 = f6;
    }
}

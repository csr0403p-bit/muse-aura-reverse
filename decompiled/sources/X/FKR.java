package X;

/* loaded from: classes6.dex */
public final class FKR {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FKR) {
                FKR fkr = (FKR) obj;
                if (this.A03 != fkr.A03 || Float.compare(this.A00, fkr.A00) != 0 || Float.compare(this.A01, fkr.A01) != 0 || Float.compare(this.A02, fkr.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(this.A03 * 31, this.A00), this.A01), this.A02);
    }

    public final String toString() {
        int i = this.A03;
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        StringBuilder sbA0y = C60O.A0y(C8j2.A00(56), i);
        sbA0y.append(", offsetX=");
        sbA0y.append(f);
        sbA0y.append(", offsetY=");
        sbA0y.append(f2);
        sbA0y.append(", radius=");
        sbA0y.append(f3);
        return BV7.A10(sbA0y);
    }

    public FKR(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }
}

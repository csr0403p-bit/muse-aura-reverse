package X;

/* renamed from: X.FlX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8819FlX extends AbstractC8825Fld {
    public final float A00;
    public final float A01;

    public C8819FlX(float f, float f2) {
        super(false, true);
        this.A00 = f;
        this.A01 = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8819FlX) {
                C8819FlX c8819FlX = (C8819FlX) obj;
                if (Float.compare(this.A00, c8819FlX.A00) != 0 || Float.compare(this.A01, c8819FlX.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0P("RelativeReflectiveQuadTo(dx=", ", dy=", ')', this.A00, this.A01);
    }
}

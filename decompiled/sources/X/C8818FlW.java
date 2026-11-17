package X;

/* renamed from: X.FlW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8818FlW extends AbstractC8825Fld {
    public final float A00;
    public final float A01;

    public C8818FlW(float f, float f2) {
        super(false, false);
        this.A00 = f;
        this.A01 = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8818FlW) {
                C8818FlW c8818FlW = (C8818FlW) obj;
                if (Float.compare(this.A00, c8818FlW.A00) != 0 || Float.compare(this.A01, c8818FlW.A01) != 0) {
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
        return FGI.A0P("RelativeMoveTo(dx=", ", dy=", ')', this.A00, this.A01);
    }
}

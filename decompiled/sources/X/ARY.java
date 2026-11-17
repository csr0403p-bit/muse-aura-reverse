package X;

/* loaded from: classes4.dex */
public final class ARY extends AOd {
    public float A00;
    public float A01;

    @Override // X.AOd
    public final void A04() {
        this.A00 = 0.0f;
        this.A01 = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ARY) {
            ARY ary = (ARY) obj;
            if (ary.A00 == this.A00 && ary.A01 == this.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnimationVector2D: v1 = ");
        sbA0x.append(this.A00);
        sbA0x.append(", v2 = ");
        sbA0x.append(this.A01);
        return sbA0x.toString();
    }

    public ARY(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}

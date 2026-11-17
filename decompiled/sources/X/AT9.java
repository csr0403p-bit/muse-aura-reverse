package X;

/* loaded from: classes4.dex */
public final class AT9 extends AOd {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final boolean equals(Object obj) {
        if (obj instanceof AT9) {
            AT9 at9 = (AT9) obj;
            if (at9.A00 == this.A00 && at9.A01 == this.A01 && at9.A02 == this.A02 && at9.A03 == this.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A00), this.A01), this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnimationVector4D: v1 = ");
        sbA0x.append(this.A00);
        sbA0x.append(", v2 = ");
        sbA0x.append(this.A01);
        sbA0x.append(", v3 = ");
        sbA0x.append(this.A02);
        sbA0x.append(", v4 = ");
        sbA0x.append(this.A03);
        return sbA0x.toString();
    }
}

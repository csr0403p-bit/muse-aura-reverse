package X;

/* renamed from: X.FlQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8812FlQ extends AbstractC8825Fld {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public C8812FlQ(float f, float f2, float f3, float f4) {
        super(false, true);
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A03 = f4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8812FlQ) {
                C8812FlQ c8812FlQ = (C8812FlQ) obj;
                if (Float.compare(this.A00, c8812FlQ.A00) != 0 || Float.compare(this.A02, c8812FlQ.A02) != 0 || Float.compare(this.A01, c8812FlQ.A01) != 0 || Float.compare(this.A03, c8812FlQ.A03) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A00), this.A02), this.A01), this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RelativeQuadTo(dx1=");
        sbA0x.append(this.A00);
        sbA0x.append(", dy1=");
        sbA0x.append(this.A02);
        sbA0x.append(", dx2=");
        sbA0x.append(this.A01);
        sbA0x.append(", dy2=");
        sbA0x.append(this.A03);
        return AnonymousClass006.A0z(sbA0x);
    }
}

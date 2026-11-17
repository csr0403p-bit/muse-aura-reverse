package X;

/* renamed from: X.FlP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8811FlP extends AbstractC8825Fld {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public C8811FlP(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false);
        this.A00 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A04 = f4;
        this.A02 = f5;
        this.A05 = f6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8811FlP) {
                C8811FlP c8811FlP = (C8811FlP) obj;
                if (Float.compare(this.A00, c8811FlP.A00) != 0 || Float.compare(this.A03, c8811FlP.A03) != 0 || Float.compare(this.A01, c8811FlP.A01) != 0 || Float.compare(this.A04, c8811FlP.A04) != 0 || Float.compare(this.A02, c8811FlP.A02) != 0 || Float.compare(this.A05, c8811FlP.A05) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A00), this.A03), this.A01), this.A04), this.A02), this.A05);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RelativeCurveTo(dx1=");
        sbA0x.append(this.A00);
        sbA0x.append(", dy1=");
        sbA0x.append(this.A03);
        sbA0x.append(", dx2=");
        sbA0x.append(this.A01);
        sbA0x.append(", dy2=");
        sbA0x.append(this.A04);
        sbA0x.append(", dx3=");
        sbA0x.append(this.A02);
        sbA0x.append(", dy3=");
        sbA0x.append(this.A05);
        return AnonymousClass006.A0z(sbA0x);
    }
}

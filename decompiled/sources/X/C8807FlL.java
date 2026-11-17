package X;

/* renamed from: X.FlL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8807FlL extends AbstractC8825Fld {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final boolean A05;
    public final boolean A06;

    public C8807FlL(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        super(false, false);
        this.A02 = f;
        this.A04 = f2;
        this.A03 = f3;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = f4;
        this.A01 = f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8807FlL) {
                C8807FlL c8807FlL = (C8807FlL) obj;
                if (Float.compare(this.A02, c8807FlL.A02) != 0 || Float.compare(this.A04, c8807FlL.A04) != 0 || Float.compare(this.A03, c8807FlL.A03) != 0 || this.A05 != c8807FlL.A05 || this.A06 != c8807FlL.A06 || Float.compare(this.A00, c8807FlL.A00) != 0 || Float.compare(this.A01, c8807FlL.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(C0KA.A01(C0KA.A01(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A02), this.A04), this.A03), this.A05), this.A06), this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RelativeArcTo(horizontalEllipseRadius=");
        sbA0x.append(this.A02);
        sbA0x.append(", verticalEllipseRadius=");
        sbA0x.append(this.A04);
        sbA0x.append(", theta=");
        sbA0x.append(this.A03);
        sbA0x.append(", isMoreThanHalf=");
        sbA0x.append(this.A05);
        sbA0x.append(", isPositiveArc=");
        sbA0x.append(this.A06);
        sbA0x.append(", arcStartDx=");
        sbA0x.append(this.A00);
        sbA0x.append(", arcStartDy=");
        sbA0x.append(this.A01);
        return AnonymousClass006.A0z(sbA0x);
    }
}

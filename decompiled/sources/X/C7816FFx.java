package X;

/* renamed from: X.FFx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7816FFx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7816FFx) {
                C7816FFx c7816FFx = (C7816FFx) obj;
                if (this.A05 != c7816FFx.A05 || this.A04 != c7816FFx.A04 || this.A02 != c7816FFx.A02 || this.A03 != c7816FFx.A03 || this.A01 != c7816FFx.A01 || this.A00 != c7816FFx.A00 || this.A07 != c7816FFx.A07 || this.A06 != c7816FFx.A06 || this.A08 != c7816FFx.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(((((((((((((((this.A05 * 31) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31, this.A08);
    }

    public final String toString() {
        int i = this.A05;
        int i2 = this.A04;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A01;
        int i6 = this.A00;
        int i7 = this.A07;
        int i8 = this.A06;
        boolean z = this.A08;
        StringBuilder sbA0y = C60O.A0y("OnComputePositionInfo(screenWidth=", i);
        sbA0y.append(", screenHeight=");
        sbA0y.append(i2);
        sbA0y.append(", anchorX=");
        sbA0y.append(i3);
        sbA0y.append(", anchorY=");
        sbA0y.append(i4);
        sbA0y.append(", anchorWidth=");
        sbA0y.append(i5);
        sbA0y.append(", anchorHeight=");
        sbA0y.append(i6);
        sbA0y.append(", tooltipIntrinsicWidth=");
        sbA0y.append(i7);
        sbA0y.append(", tooltipIntrinsicHeight=");
        sbA0y.append(i8);
        return C8j5.A0W(C60N.A00(9), sbA0y, z);
    }

    public C7816FFx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A08 = z;
    }
}

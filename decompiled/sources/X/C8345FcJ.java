package X;

import android.graphics.Insets;

/* renamed from: X.FcJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8345FcJ {
    public static final C8345FcJ A04 = new C8345FcJ(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C8345FcJ c8345FcJ = (C8345FcJ) obj;
                if (this.A00 != c8345FcJ.A00 || this.A01 != c8345FcJ.A01 || this.A02 != c8345FcJ.A02 || this.A03 != c8345FcJ.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public static C8345FcJ A00(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? A04 : new C8345FcJ(i, i2, i3, i4);
    }

    public static C8345FcJ A01(Insets insets) {
        return A00(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static C8345FcJ A02(C8345FcJ c8345FcJ, C8345FcJ c8345FcJ2) {
        return A00(Math.max(c8345FcJ.A01, c8345FcJ2.A01), Math.max(c8345FcJ.A03, c8345FcJ2.A03), Math.max(c8345FcJ.A02, c8345FcJ2.A02), Math.max(c8345FcJ.A00, c8345FcJ2.A00));
    }

    public static C8345FcJ A03(C8345FcJ c8345FcJ, C8345FcJ c8345FcJ2) {
        return A00(Math.min(c8345FcJ.A01, c8345FcJ2.A01), Math.min(c8345FcJ.A03, c8345FcJ2.A03), Math.min(c8345FcJ.A02, c8345FcJ2.A02), Math.min(c8345FcJ.A00, c8345FcJ2.A00));
    }

    public final Insets A04() {
        return Insets.of(this.A01, this.A03, this.A02, this.A00);
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Insets{left=");
        sbA0x.append(this.A01);
        sbA0x.append(AnonymousClass000.A00(7));
        sbA0x.append(this.A03);
        sbA0x.append(", right=");
        sbA0x.append(this.A02);
        sbA0x.append(", bottom=");
        sbA0x.append(this.A00);
        return C8j3.A15(sbA0x);
    }

    public C8345FcJ(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}

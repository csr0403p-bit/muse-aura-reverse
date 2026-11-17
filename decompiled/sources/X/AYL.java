package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public abstract class AYL {
    public static long A03(int i) {
        return A05(0, Integer.MAX_VALUE, 0, i);
    }

    public static long A04(int i) {
        return A05(0, i, 0, Integer.MAX_VALUE);
    }

    public static final long A05(int i, int i2, int i3, int i4) {
        boolean z = (i2 >= i) & (i4 >= i3) & (i >= 0);
        if (i3 < 0 || (!z || !true)) {
            throw new IllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return A06(i, i2, i3, i4);
    }

    public static final int A00(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long A09(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iA03 = Constraints.A03(j);
        int iA01 = Constraints.A01(j);
        if (i < iA03) {
            i = iA03;
        }
        if (i <= iA01) {
            iA01 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iA02 = Constraints.A02(j);
        int iA00 = Constraints.A00(j);
        if (i2 < iA02) {
            i2 = iA02;
        }
        if (i2 <= iA00) {
            iA00 = i2;
        }
        return (iA01 << 32) | (4294967295L & iA00);
    }

    public static final int A01(long j, int i) {
        int iA02 = Constraints.A02(j);
        int iA00 = Constraints.A00(j);
        if (i < iA02) {
            i = iA02;
        }
        return i > iA00 ? iA00 : i;
    }

    public static final int A02(long j, int i) {
        int iA03 = Constraints.A03(j);
        int iA01 = Constraints.A01(j);
        if (i < iA03) {
            i = iA03;
        }
        return i > iA01 ? iA01 : i;
    }

    public static final long A06(int i, int i2, int i3, int i4) {
        int i5 = i4;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        }
        int iA00 = A00(i5);
        int i6 = i2;
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        }
        int iA002 = A00(i6);
        if (iA00 + iA002 > 31) {
            throw new IllegalArgumentException(FGI.A0Y("Can't represent a width of ", " and height of ", " in Constraints", i6, i5));
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA002 - 13;
        return ((i7 & ((i7 >> 31) ^ (-1))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (iA002 + 2)) | ((i8 & ((i8 >> 31) ^ (-1))) << (iA002 + 33));
    }

    public static long A07(long j) {
        return A05(Constraints.A03(j), Constraints.A01(j), Constraints.A02(j), Constraints.A00(j));
    }

    public static final long A08(long j, int i, int i2) {
        int iA03 = Constraints.A03(j) + i;
        if (iA03 < 0) {
            iA03 = 0;
        }
        int iA01 = Constraints.A01(j);
        if (iA01 != Integer.MAX_VALUE && (iA01 = iA01 + i) < 0) {
            iA01 = 0;
        }
        int iA02 = Constraints.A02(j) + i2;
        if (iA02 < 0) {
            iA02 = 0;
        }
        int iA00 = Constraints.A00(j);
        return A05(iA03, iA01, iA02, (iA00 == Integer.MAX_VALUE || (iA00 = iA00 + i2) >= 0) ? iA00 : 0);
    }

    public static final long A0A(long j, long j2) {
        int iA03 = Constraints.A03(j);
        int iA01 = Constraints.A01(j);
        int iA02 = Constraints.A02(j);
        int iA00 = Constraints.A00(j);
        int iA032 = Constraints.A03(j2);
        if (iA032 < iA03) {
            iA032 = iA03;
        }
        if (iA032 > iA01) {
            iA032 = iA01;
        }
        int iA012 = Constraints.A01(j2);
        if (iA012 >= iA03) {
            iA03 = iA012;
        }
        if (iA03 <= iA01) {
            iA01 = iA03;
        }
        int iA022 = Constraints.A02(j2);
        if (iA022 < iA02) {
            iA022 = iA02;
        }
        if (iA022 > iA00) {
            iA022 = iA00;
        }
        int iA002 = Constraints.A00(j2);
        if (iA002 >= iA02) {
            iA02 = iA002;
        }
        if (iA02 <= iA00) {
            iA00 = iA02;
        }
        return A05(iA032, iA01, iA022, iA00);
    }
}

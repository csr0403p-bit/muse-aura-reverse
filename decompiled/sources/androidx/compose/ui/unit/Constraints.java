package androidx.compose.ui.unit;

import X.AYL;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C60O;
import X.C8j3;

/* loaded from: classes4.dex */
public final class Constraints {
    public final long A00;

    public static final int A00(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        int i4 = i3 - 1;
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    public static final int A01(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        int i3 = i2 - 1;
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static final int A02(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int A03(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static final long A05(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            throw new IllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AYL.A06(i, i2, i3, i4);
    }

    public static final boolean A09(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean A0A(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean A0B(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        int i6 = i5 - 1;
        if (i5 == 0) {
            i6 = Integer.MAX_VALUE;
        }
        return i4 == i6;
    }

    public static final boolean A0C(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        int i5 = i4 - 1;
        if (i4 == 0) {
            i5 = Integer.MAX_VALUE;
        }
        return i3 == i5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Constraints) && this.A00 == ((Constraints) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A08(this.A00);
    }

    public /* synthetic */ Constraints(long j) {
        this.A00 = j;
    }

    public static final long A04(int i, int i2) {
        boolean zA1Q = C8j3.A1Q(i);
        if (i2 < 0 || (!zA1Q || !true)) {
            throw C60O.A0i("width and height must be >= 0");
        }
        return AYL.A06(i, i, i2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A06(int r6, int r7, int r8, int r9) {
        /*
            r5 = 262142(0x3fffe, float:3.67339E-40)
            int r4 = java.lang.Math.min(r8, r5)
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r3) goto L3a
            r1 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            r2 = r4
        L10:
            r0 = 8191(0x1fff, float:1.1478E-41)
            if (r2 < r0) goto L1b
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L2a
            r5 = 65534(0xfffe, float:9.1833E-41)
        L1b:
            if (r7 == r3) goto L21
            int r3 = java.lang.Math.min(r5, r7)
        L21:
            int r0 = java.lang.Math.min(r5, r6)
            long r0 = X.AYL.A05(r0, r3, r4, r1)
            return r0
        L2a:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L32
            r5 = 32766(0x7ffe, float:4.5915E-41)
            goto L1b
        L32:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L42
            r5 = 8190(0x1ffe, float:1.1477E-41)
            goto L1b
        L3a:
            int r1 = java.lang.Math.min(r9, r5)
            r2 = r1
            if (r1 != r3) goto L10
            goto Lf
        L42:
            java.lang.String r1 = "Can't represent a size of "
            java.lang.String r0 = " in Constraints"
            java.lang.String r0 = X.FGI.A0I(r1, r2, r0)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.unit.Constraints.A06(int, int, int, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A07(int r6, int r7, int r8, int r9) {
        /*
            r5 = 262142(0x3fffe, float:3.67339E-40)
            int r4 = java.lang.Math.min(r6, r5)
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r3) goto L3a
            r1 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            r2 = r4
        L10:
            r0 = 8191(0x1fff, float:1.1478E-41)
            if (r2 < r0) goto L1b
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L2a
            r5 = 65534(0xfffe, float:9.1833E-41)
        L1b:
            if (r9 == r3) goto L21
            int r3 = java.lang.Math.min(r5, r9)
        L21:
            int r0 = java.lang.Math.min(r5, r8)
            long r0 = X.AYL.A05(r4, r1, r0, r3)
            return r0
        L2a:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L32
            r5 = 32766(0x7ffe, float:4.5915E-41)
            goto L1b
        L32:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L42
            r5 = 8190(0x1ffe, float:1.1477E-41)
            goto L1b
        L3a:
            int r1 = java.lang.Math.min(r7, r5)
            r2 = r1
            if (r1 != r3) goto L10
            goto Lf
        L42:
            java.lang.String r1 = "Can't represent a size of "
            java.lang.String r0 = " in Constraints"
            java.lang.String r1 = X.FGI.A0I(r1, r2, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.unit.Constraints.A07(int, int, int, int):long");
    }

    public static String A08(long j) {
        int iA01 = A01(j);
        String strValueOf = iA01 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iA01);
        int iA00 = A00(j);
        String strValueOf2 = iA00 != Integer.MAX_VALUE ? String.valueOf(iA00) : "Infinity";
        StringBuilder sbA0x = C60O.A0x("Constraints(minWidth = ");
        sbA0x.append(A03(j));
        sbA0x.append(", maxWidth = ");
        sbA0x.append(strValueOf);
        sbA0x.append(", minHeight = ");
        sbA0x.append(A02(j));
        sbA0x.append(", maxHeight = ");
        sbA0x.append(strValueOf2);
        return AnonymousClass006.A0z(sbA0x);
    }
}

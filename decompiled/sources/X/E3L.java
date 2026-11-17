package X;

/* loaded from: classes5.dex */
public abstract class E3L {
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(X.E1P r16, X.E5Z r17, X.E3A r18, int r19) {
        /*
            r3 = r16
            int r6 = r3.A01
            long r15 = r3.A0H()
            r0 = 16
            long r4 = r15 >>> r0
            r0 = r19
            long r1 = (long) r0
            r14 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb3
            r12 = 1
            long r4 = r4 & r12
            r11 = 1
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            boolean r10 = X.AnonymousClass002.A1M(r0)
            r0 = 12
            long r4 = r15 >> r0
            r0 = 15
            long r4 = r4 & r0
            int r2 = (int) r4
            r4 = 8
            long r7 = r15 >> r4
            long r7 = r7 & r0
            int r4 = (int) r7
            r5 = 4
            long r7 = r15 >> r5
            long r0 = r0 & r7
            int r9 = (int) r0
            long r0 = r15 >> r11
            r7 = 7
            long r0 = r0 & r7
            int r7 = (int) r0
            long r15 = r15 & r12
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            boolean r1 = X.AnonymousClass002.A1M(r0)
            r0 = 7
            r5 = r18
            if (r9 > r0) goto L51
            int r0 = r5.A02
            int r0 = r0 - r11
        L46:
            if (r9 != r0) goto Lb3
            if (r7 == 0) goto L4e
            int r0 = r5.A01
            if (r7 != r0) goto Lb3
        L4e:
            if (r1 != 0) goto Lb3
            goto L59
        L51:
            r0 = 10
            if (r9 > r0) goto Lb3
            int r9 = r5.A02
            r0 = 2
            goto L46
        L59:
            long r7 = r3.A0J()     // Catch: java.lang.NumberFormatException -> Lb3
            if (r10 != 0) goto L63
            int r0 = r5.A03
            long r0 = (long) r0
            long r7 = r7 * r0
        L63:
            r0 = r17
            r0.A00 = r7
            int r1 = A00(r3, r2)
            r0 = -1
            if (r1 == r0) goto Lb3
            int r0 = r5.A03
            if (r1 > r0) goto Lb3
            int r2 = r5.A07
            if (r4 == 0) goto L7e
            r0 = 11
            if (r4 > r0) goto L96
            int r0 = r5.A08
            if (r4 != r0) goto Lb3
        L7e:
            int r5 = r3.A0A()
            int r4 = r3.A01
            byte[] r3 = r3.A02
            int r4 = r4 - r11
            r2 = 0
        L88:
            if (r6 >= r4) goto Lb0
            int[] r1 = androidx.media3.common.util.Util.A0A
            r0 = r3[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r0
            r2 = r1[r2]
            int r6 = r6 + 1
            goto L88
        L96:
            r0 = 12
            if (r4 != r0) goto La3
            int r0 = r3.A0A()
            int r1 = r0 * 1000
        La0:
            if (r1 != r2) goto Lb3
            goto L7e
        La3:
            r0 = 14
            if (r4 > r0) goto Lb3
            int r1 = r3.A0D()
            if (r4 != r0) goto La0
            int r1 = r1 * 10
            goto La0
        Lb0:
            if (r5 != r2) goto Lb3
            return r11
        Lb3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3L.A01(X.E1P, X.E5Z, X.E3A, int):boolean");
    }

    public static int A00(E1P e1p, int i) {
        int i2;
        int i3;
        int iA0D;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = i - 2;
                i3 = 576;
                return i3 << i2;
            case 6:
                iA0D = e1p.A0A();
                return iA0D + 1;
            case 7:
                iA0D = e1p.A0D();
                return iA0D + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = i - 8;
                i3 = 256;
                return i3 << i2;
            default:
                return -1;
        }
    }
}

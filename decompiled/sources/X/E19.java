package X;

/* loaded from: classes5.dex */
public abstract class E19 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[PHI: r8
  0x0043: PHI (r8v2 double) = (r8v1 double), (r8v3 double) binds: [B:12:0x003a, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A00(java.math.RoundingMode r10, double r11) {
        /*
            r2 = r11
            int r1 = java.lang.Math.getExponent(r11)
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r1 > r0) goto Lae
            int[] r1 = X.E4N.A00
            int r0 = r10.ordinal()
            r0 = r1[r0]
            r8 = 1
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 0
            switch(r0) {
                case 1: goto L67;
                case 2: goto L75;
                case 3: goto L5a;
                case 4: goto L82;
                case 5: goto L4a;
                case 6: goto L45;
                case 7: goto L2e;
                case 8: goto L1f;
                default: goto L1a;
            }
        L1a:
            java.lang.AssertionError r1 = X.BV6.A0f()
            throw r1
        L1f:
            double r8 = java.lang.Math.rint(r11)
            double r0 = r11 - r8
            double r6 = java.lang.Math.abs(r0)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L43
            goto L82
        L2e:
            double r8 = java.lang.Math.rint(r11)
            double r0 = r11 - r8
            double r1 = java.lang.Math.abs(r0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L43
            double r0 = java.lang.Math.copySign(r4, r11)
            double r2 = r11 + r0
            goto L82
        L43:
            r2 = r8
            goto L82
        L45:
            double r2 = java.lang.Math.rint(r11)
            goto L82
        L4a:
            boolean r0 = A01(r11)
            if (r0 != 0) goto L82
            long r4 = (long) r11
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            r0 = -1
            if (r1 <= 0) goto L57
            r0 = 1
        L57:
            long r0 = (long) r0
            long r4 = r4 + r0
            goto L81
        L5a:
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 <= 0) goto L82
            boolean r0 = A01(r11)
            if (r0 != 0) goto L82
            long r4 = (long) r11
            long r4 = r4 + r8
            goto L81
        L67:
            boolean r0 = A01(r11)
            if (r0 != 0) goto L82
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r0)
            throw r1
        L75:
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto L82
            boolean r0 = A01(r11)
            if (r0 != 0) goto L82
            long r4 = (long) r11
            long r4 = r4 - r8
        L81:
            double r2 = (double) r4
        L82:
            r6 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r6 = r6 - r2
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            boolean r1 = X.C8j3.A1R(r0)
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L99
            r0 = r1 & 1
            if (r0 == 0) goto L99
            long r0 = (long) r2
            return r0
        L99:
            java.lang.String r0 = "rounded value is out of range for input "
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            r1.append(r11)
            java.lang.String r0 = " and rounding mode "
            java.lang.String r0 = X.AnonymousClass006.A0y(r10, r0, r1)
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r0)
            throw r1
        Lae:
            java.lang.String r0 = "input is infinite or NaN"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E19.A00(java.math.RoundingMode, double):long");
    }

    public static boolean A01(double x) {
        int exponent = Math.getExponent(x);
        if (exponent <= 1023) {
            return x == 0.0d || 52 - Long.numberOfTrailingZeros(E1A.A00(x)) <= exponent;
        }
        return false;
    }
}

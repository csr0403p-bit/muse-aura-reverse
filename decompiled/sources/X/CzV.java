package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CzV {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    /* JADX WARN: Illegal instructions before constructor call */
    public CzV(String name, char[] chars) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!C8j3.A1T(c, 128)) {
                throw BV7.A0k("Non-ASCII character: %s", new Object[]{Character.valueOf(c)});
            }
            if (!(bArr[c] == -1)) {
                throw BV7.A0k("Duplicate character: %s", new Object[]{Character.valueOf(c)});
            }
            bArr[c] = (byte) i;
        }
        this(name, bArr, chars, false);
    }

    public final boolean equals(Object other) {
        if (!(other instanceof CzV)) {
            return false;
        }
        CzV czV = (CzV) other;
        return this.A05 == czV.A05 && Arrays.equals(this.A07, czV.A07);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A07) + BV7.A02(this.A05 ? 1 : 0);
    }

    public final String toString() {
        return this.A04;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[LOOP:0: B:18:0x0074->B:20:0x0078, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CzV(java.lang.String r6, byte[] r7, char[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r6.getClass()
            r5.A04 = r6
            r8.getClass()
            r5.A07 = r8
            int r4 = r8.length     // Catch: java.lang.ArithmeticException -> L87
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L87
            java.lang.String r3 = "x"
            if (r4 <= 0) goto L32
            int[] r1 = X.E4M.A00     // Catch: java.lang.ArithmeticException -> L87
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L87
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L87
            switch(r0) {
                case 1: goto L25;
                case 2: goto L49;
                case 3: goto L49;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L50;
                case 7: goto L50;
                case 8: goto L50;
                default: goto L20;
            }     // Catch: java.lang.ArithmeticException -> L87
        L20:
            java.lang.AssertionError r1 = X.BV6.A0f()     // Catch: java.lang.ArithmeticException -> L87
        L24:
            throw r1     // Catch: java.lang.ArithmeticException -> L87
        L25:
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 == 0) goto L49
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L87
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> L87
            goto L24
        L32:
            java.lang.String r2 = " ("
            r1 = 0
            java.lang.String r0 = ") must be > 0"
            java.lang.String r0 = X.FGI.A0X(r3, r2, r0, r1)     // Catch: java.lang.ArithmeticException -> L87
            java.lang.IllegalArgumentException r1 = X.C60O.A0i(r0)     // Catch: java.lang.ArithmeticException -> L87
            goto L24
        L40:
            int r0 = r4 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L87
            int r3 = 32 - r0
            goto L5e
        L49:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L87
            int r3 = 31 - r0
            goto L5e
        L50:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L87
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r3 = 31 - r1
            int r0 = r0 - r4
            int r0 = r0 >>> 31
            int r3 = r3 + r0
        L5e:
            r5.A00 = r3     // Catch: java.lang.ArithmeticException -> L87
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r0 = 3 - r2
            r1 = 1
            int r0 = r1 << r0
            r5.A02 = r0
            int r3 = r3 >> r2
            r5.A01 = r3
            int r4 = r4 - r1
            r5.A03 = r4
            r5.A06 = r7
            r3 = 0
        L74:
            int r0 = r5.A01
            if (r3 >= r0) goto L84
            int r2 = r3 * 8
            int r1 = r5.A00
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.AbstractC4595Cza.A00(r0, r2, r1)
            int r3 = r3 + 1
            goto L74
        L84:
            r5.A05 = r9
            return
        L87:
            r2 = move-exception
            java.lang.String r1 = "Illegal alphabet length "
            int r0 = r8.length
            java.lang.String r0 = X.FGI.A0H(r1, r0)
            java.lang.IllegalArgumentException r0 = X.BV4.A0Q(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CzV.<init>(java.lang.String, byte[], char[], boolean):void");
    }
}

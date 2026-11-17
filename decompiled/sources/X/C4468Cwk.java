package X;

import java.util.Arrays;

/* renamed from: X.Cwk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4468Cwk {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4468Cwk(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!C8j3.A1T(c, 128)) {
                throw C60O.A0i(CL4.A00("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw C60O.A0i(CL4.A00("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i;
        }
        this(str, bArr, cArr, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4468Cwk)) {
            return false;
        }
        C4468Cwk c4468Cwk = (C4468Cwk) obj;
        return this.A05 == c4468Cwk.A05 && Arrays.equals(this.A07, c4468Cwk.A07);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A07) + (true != this.A05 ? 1237 : 1231);
    }

    public final String toString() {
        return this.A04;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[LOOP:0: B:18:0x0068->B:20:0x006c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4468Cwk(java.lang.String r6, byte[] r7, char[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A04 = r6
            r8.getClass()
            r5.A07 = r8
            int r4 = r8.length     // Catch: java.lang.ArithmeticException -> L7b
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L7b
            if (r4 <= 0) goto L2c
            int[] r1 = X.E4O.A00     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L7b
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L7b
            switch(r0) {
                case 1: goto L1f;
                case 2: goto L43;
                case 3: goto L43;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L34;
                case 7: goto L34;
                case 8: goto L34;
                default: goto L1a;
            }     // Catch: java.lang.ArithmeticException -> L7b
        L1a:
            java.lang.AssertionError r1 = X.BV6.A0f()     // Catch: java.lang.ArithmeticException -> L7b
        L1e:
            throw r1     // Catch: java.lang.ArithmeticException -> L7b
        L1f:
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 == 0) goto L43
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L7b
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> L7b
            goto L1e
        L2c:
            java.lang.String r0 = "x (0) must be > 0"
            java.lang.IllegalArgumentException r1 = X.C60O.A0i(r0)     // Catch: java.lang.ArithmeticException -> L7b
            goto L1e
        L34:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L7b
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r3 = 31 - r1
            int r0 = r0 - r4
            int r0 = r0 >>> 31
            int r3 = r3 + r0
            goto L52
        L43:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L7b
            int r3 = 31 - r0
            goto L52
        L4a:
            int r0 = r4 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L7b
            int r3 = 32 - r0
        L52:
            r5.A01 = r3     // Catch: java.lang.ArithmeticException -> L7b
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r1 = 3 - r2
            r0 = 1
            int r0 = r0 << r1
            r5.A02 = r0
            int r3 = r3 >> r2
            r5.A03 = r3
            int r0 = r4 + (-1)
            r5.A00 = r0
            r5.A06 = r7
            r3 = 0
        L68:
            int r0 = r5.A03
            if (r3 >= r0) goto L78
            int r2 = r3 * 8
            int r1 = r5.A01
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.AbstractC4469Cwl.A00(r0, r2, r1)
            int r3 = r3 + 1
            goto L68
        L78:
            r5.A05 = r9
            return
        L7b:
            r2 = move-exception
            int r1 = r8.length
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r0 = X.FGI.A0H(r0, r1)
            java.lang.IllegalArgumentException r0 = X.BV4.A0Q(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4468Cwk.<init>(java.lang.String, byte[], char[], boolean):void");
    }
}

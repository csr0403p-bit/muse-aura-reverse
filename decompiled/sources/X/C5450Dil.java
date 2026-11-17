package X;

/* renamed from: X.Dil, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5450Dil {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final boolean A04;
    public final Integer A05;
    public final boolean A06;

    public C5450Dil(Integer num, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        long jA00 = j;
        if (z4 && j2 < 0) {
            throw C60O.A0i("Segment-specific start must be non-negative");
        }
        if (z3 && j <= 0) {
            throw C60O.A0i("Segment-specific size must be positive");
        }
        if (z2 && j3 <= 0) {
            throw C60O.A0i("Segment-specific duration must be positive");
        }
        this.A04 = z3;
        this.A06 = z;
        this.A05 = num;
        this.A03 = j2;
        this.A01 = j3;
        if (j > 0 && j3 > 0) {
            this.A02 = j;
            this.A00 = A00(8000000L, jA00, j3);
            return;
        }
        if (j <= 0) {
            if (j4 > 0 && j3 > 0) {
                jA00 = A00(j4, j3, 8000000L);
            } else if (j4 > 0) {
                jA00 = -1;
            }
        }
        this.A02 = jA00;
        this.A00 = j4;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SegmentInfo -> size: ");
        sbA0x.append(this.A02);
        sbA0x.append(C8j2.A00(30));
        sbA0x.append(this.A01);
        sbA0x.append(", bitrate: ");
        return BV4.A0m(sbA0x, this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if ((r6 / r8) != r10) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A00(long r8, long r10, long r12) {
        /*
            int r4 = java.lang.Long.numberOfLeadingZeros(r8)     // Catch: java.lang.ArithmeticException -> L47
            r2 = -1
            long r0 = r8 ^ r2
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L47
            int r4 = r4 + r0
            int r0 = java.lang.Long.numberOfLeadingZeros(r10)     // Catch: java.lang.ArithmeticException -> L47
            int r4 = r4 + r0
            long r2 = r2 ^ r10
            int r0 = java.lang.Long.numberOfLeadingZeros(r2)     // Catch: java.lang.ArithmeticException -> L47
            int r4 = r4 + r0
            r0 = 65
            if (r4 <= r0) goto L1f
            long r6 = r8 * r10
            goto L3f
        L1f:
            r0 = 64
            if (r4 < r0) goto L41
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            boolean r3 = X.C8j3.A1Q(r0)
            r1 = -9223372036854775808
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
            if (r3 == 0) goto L41
        L33:
            long r6 = r8 * r10
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L3f
            long r1 = r6 / r8
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L41
        L3f:
            long r6 = r6 / r12
            return r6
        L41:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L47
            r0.<init>()     // Catch: java.lang.ArithmeticException -> L47
            throw r0     // Catch: java.lang.ArithmeticException -> L47
        L47:
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r10)
            java.math.BigInteger r1 = r1.multiply(r0)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r1 = r1.divide(r0)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r6)
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L6e
            long r6 = r1.longValue()
        L6e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5450Dil.A00(long, long, long):long");
    }
}

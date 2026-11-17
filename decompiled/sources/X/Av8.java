package X;

/* loaded from: classes4.dex */
public final class Av8 extends Av4 {
    public int A00;

    private final int A01(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long jA0C = C8j5.A0C(C8j5.A0H(this.A04, i3));
            if (jA0C != 0) {
                return (i3 + (Long.numberOfTrailingZeros(jA0C) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public Av8() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A02(this, 6);
    }

    public static final void A02(Av8 av8, int i) {
        int iA0C = C8j3.A0C(i);
        ((Av4) av8).A00 = iA0C;
        long[] jArrA1Y = C8j3.A1Y(iA0C);
        av8.A04 = jArrA1Y;
        C8j3.A1O(jArrA1Y, iA0C);
        av8.A00 = C8j3.A0A(((Av4) av8).A00) - av8.A01;
        av8.A03 = new long[iA0C];
        av8.A02 = new int[iA0C];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if ((X.C8j4.A0M(r20) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        r1 = A01(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (r39.A00 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (X.C8j3.A0W(r4, r1) == 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r5 <= 8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        r14 = r39.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (X.BMp.A00(r14, r5) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r9 = r39.A03;
        r8 = r39.A02;
        r1 = (r5 + 7) >> 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r0 >= r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r4[r0] = X.C8j5.A0B(r4[r0] & (-9187201950435737472L));
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r1 = X.C8j3.A0B(r5);
        r0 = r39.A03;
        r0 = r39.A02;
        A02(r39, r1);
        r13 = r39.A04;
        r0 = r39.A03;
        r14 = r39.A02;
        r39 = r39.A00;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        if (r12 >= r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (X.C8j3.A0W(r4, r12) >= 128) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        r20 = r0[r12];
        r9 = A01(X.C8j5.A06(r20) >>> 7);
        r19 = r9 >> 3;
        r18 = (r9 & 7) << 3;
        r0 = (r13[r19] & ((255 << r18) ^ (-1))) | ((r1 & 127) << r18);
        r13[r19] = r0;
        X.C8j3.A1P(r13, r9, r39, r0);
        r0[r9] = r20;
        r14[r9] = r0[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
    
        r12 = r4.length - 1;
        r32 = X.C8j3.A0X(r4, r12);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fa, code lost:
    
        r31 = r7 >> 3;
        r28 = (r7 & 7) << 3;
        r16 = (r4[r31] >> r28) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010a, code lost:
    
        if (r16 == 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010e, code lost:
    
        if (r16 != 254) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0110, code lost:
    
        r25 = X.C8j5.A06(r9[r7]);
        r0 = r25 >>> 7;
        r24 = A01(r0);
        r0 = r0 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0129, code lost:
    
        if ((((r24 - r0) & r5) / 8) != (((r7 - r0) & r5) / 8)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r4[r31] = ((r25 & 127) << r28) | (r4[r31] & ((255 << r28) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013c, code lost:
    
        r4[r12] = (r4[0] & r32) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0144, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0146, code lost:
    
        if (r7 != r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        r39.A00 = X.C8j3.A0A(r5) - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
    
        r1 = A01(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0153, code lost:
    
        r39.A01++;
        r4 = r39.A00;
        r9 = r1 >> 3;
        r16 = r13[r9];
        r5 = (r1 & 7) << 3;
        r39.A00 = r4 - (X.AnonymousClass002.A1M((((r16 >> r5) & 255) > 128 ? 1 : (((r16 >> r5) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r2 = (((255 << r5) ^ (-1)) & r16) | (r10 << r5);
        r13[r9] = r2;
        X.C8j3.A1P(r13, r1, r39, r2);
        r12 = r1 ^ (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018e, code lost:
    
        r21 = r24 >> 3;
        r19 = r4[r21];
        r18 = (r24 & 7) << 3;
        r0 = r25 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x019e, code lost:
    
        if (((r19 >> r18) & 255) != 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a0, code lost:
    
        r4[r21] = (r19 & ((255 << r18) ^ (-1))) | (r0 << r18);
        r4[r31] = (r4[r31] & ((255 << r28) ^ (-1))) | (128 << r28);
        r9[r24] = r9[r7];
        r9[r7] = 0;
        r8[r24] = r8[r7];
        r8[r7] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c9, code lost:
    
        r4[r21] = (r0 << r18) | (r19 & ((255 << r18) ^ (-1)));
        r16 = r9[r24];
        r9[r24] = r9[r7];
        r9[r7] = r16;
        r1 = r8[r24];
        r8[r24] = r8[r7];
        r8[r7] = r1;
        r7 = r7 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(long r40, int r42) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Av8.A04(long, int):void");
    }
}

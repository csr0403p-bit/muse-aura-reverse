package X;

/* loaded from: classes4.dex */
public final class AMS<K> extends AMT<K> {
    public int A00;

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & (((-1) ^ j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0077, code lost:
    
        if (((r15 & ((r15 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        r1 = A00(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (r37.A00 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        r7 = r37.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        if (X.C8j3.A0W(r7, r1) == 254) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        r6 = r37.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if (r6 <= 8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (X.BMp.A00(r37.A01, r6) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r9 = r37.A04;
        r5 = r37.A02;
        r1 = (r6 + 7) >> 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (r0 >= r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        r13 = r7[r0] & (-9187201950435737472L);
        r7[r0] = (((-1) ^ r13) + (r13 >>> 7)) & (-72340172838076674L);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        r1 = X.C8j3.A0B(r6);
        r0 = r37.A04;
        r15 = r37.A02;
        A01(r37, r1);
        r14 = r37.A03;
        r13 = r37.A04;
        r9 = r37.A02;
        r5 = r37.A00;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r4 >= r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        if (((r7[r4 >> 3] >> ((r4 & 7) << 3)) & 255) >= 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        r23 = r0[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
    
        if (r23 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        r1 = r23.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f8, code lost:
    
        r1 = (r1 ^ (r1 >>> 16)) * (-862048943);
        r22 = A00((r1 ^ (r1 >>> 16)) >>> 7);
        r21 = r22 >> 3;
        r20 = (r22 & 7) << 3;
        r0 = ((r1 & 127) << r20) | (r14[r21] & ((255 << r20) ^ (-1)));
        r14[r21] = r0;
        r14[(((r22 - 7) & r5) + (r5 & 7)) >> 3] = r0;
        r13[r22] = r23;
        r9[r22] = r15[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012f, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0132, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0134, code lost:
    
        r13 = r7.length - 1;
        r30 = X.C8j3.A0X(r7, r13);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013c, code lost:
    
        r29 = r4 >> 3;
        r24 = (r4 & 7) << 3;
        r14 = (r7[r29] >> r24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014b, code lost:
    
        if (r14 == 128) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
    
        if (r14 != 254) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0151, code lost:
    
        r0 = r9[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0153, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0155, code lost:
    
        r23 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0159, code lost:
    
        r23 = (r23 ^ (r23 >>> 16)) * (-862048943);
        r23 = r23 ^ (r23 >>> 16);
        r14 = r23 >>> 7;
        r22 = A00(r14);
        r14 = r14 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0176, code lost:
    
        if ((((r22 - r14) & r6) / 8) != (((r4 - r14) & r6) / 8)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0178, code lost:
    
        r7[r29] = ((r23 & 127) << r24) | (r7[r29] & ((255 << r24) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0189, code lost:
    
        r7[r13] = (r7[0] & r30) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0191, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0193, code lost:
    
        if (r4 != r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0195, code lost:
    
        r37.A00 = X.C8j3.A0A(r37.A00) - r37.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a0, code lost:
    
        r1 = A00(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a4, code lost:
    
        r37.A01++;
        r7 = r37.A00;
        r6 = r37.A03;
        r16 = r1 >> 3;
        r14 = r6[r16];
        r9 = (r1 & 7) << 3;
        r37.A00 = r7 - (X.AnonymousClass002.A1M((((r14 >> r9) & 255) > 128 ? 1 : (((r14 >> r9) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r0 = r37.A00;
        r2 = (((255 << r9) ^ (-1)) & r14) | (r10 << r9);
        r6[r16] = r2;
        X.C8j3.A1P(r6, r1, r0, r2);
        r2 = r1 ^ (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e0, code lost:
    
        r19 = r22 >> 3;
        r17 = r7[r19];
        r16 = (r22 & 7) << 3;
        r0 = r23 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ef, code lost:
    
        if (((r17 >> r16) & 255) != 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f1, code lost:
    
        r7[r19] = (r17 & ((255 << r16) ^ (-1))) | (r0 << r16);
        r7[r29] = (r7[r29] & ((255 << r24) ^ (-1))) | (128 << r24);
        r9[r22] = r9[r4];
        r9[r4] = null;
        r5[r22] = r5[r4];
        r5[r4] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x021b, code lost:
    
        r7[r19] = (r0 << r16) | (r17 & ((255 << r16) ^ (-1)));
        r1 = r9[r22];
        r9[r22] = r9[r4];
        r9[r4] = r1;
        r1 = r5[r22];
        r5[r22] = r5[r4];
        r5[r4] = r1;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023c, code lost:
    
        r23 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(K r38, float r39) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMS.A04(java.lang.Object, float):void");
    }

    public AMS() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A01(this, 6);
    }

    public static final void A01(AMS ams, int i) {
        int iA0C = C8j3.A0C(i);
        ((AMT) ams).A00 = iA0C;
        long[] jArrA1Y = C8j3.A1Y(iA0C);
        ams.A03 = jArrA1Y;
        C8j3.A1O(jArrA1Y, iA0C);
        ams.A00 = C8j3.A0A(((AMT) ams).A00) - ams.A01;
        ams.A04 = new Object[iA0C];
        ams.A02 = new float[iA0C];
    }
}

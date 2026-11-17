package X;

/* renamed from: X.Abw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1143Abw extends AbstractC1142Abv {
    public int A00;

    public final void A03() {
        this.A01 = 0;
        long[] jArr = this.A04;
        if (jArr != AbstractC0977AKq.A01) {
            C8j3.A1N(jArr);
            C8j3.A1O(this.A04, super.A00);
        }
        this.A00 = C8j3.A0A(super.A00) - this.A01;
    }

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A04;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0078, code lost:
    
        if (((r21 & ((r21 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        r1 = A00(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (r39.A00 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (X.C8j3.A0W(r6, r1) == 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (r7 <= 8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (X.BMp.A00(r39.A01, r7) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        r9 = r39.A02;
        r5 = r39.A03;
        r1 = (r7 + 7) >> 3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r0 >= r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r15 = r6[r0] & (-9187201950435737472L);
        r6[r0] = (((-1) ^ r15) + (r15 >>> 7)) & (-72340172838076674L);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        r1 = X.C8j3.A0B(r7);
        r0 = r39.A02;
        r15 = r39.A03;
        A01(r39, r1);
        r12 = r39.A04;
        r9 = r39.A02;
        r5 = r39.A03;
        r13 = r39.A00;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        if (r4 >= r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        if (((r6[r4 >> 3] >> ((r4 & 7) << 3)) & 255) >= 128) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        r23 = r0[r4];
        r1 = ((r23 >>> 16) ^ r23) * (-862048943);
        r22 = A00((r1 ^ (r1 >>> 16)) >>> 7);
        r21 = r22 >> 3;
        r20 = (r22 & 7) << 3;
        r0 = ((r1 & 127) << r20) | (r12[r21] & ((255 << r20) ^ (-1)));
        r12[r21] = r0;
        r12[(((r22 - 7) & r13) + (r13 & 7)) >> 3] = r0;
        r9[r22] = r23;
        r5[r22] = r15[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0129, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012c, code lost:
    
        r15 = r6.length - 1;
        r32 = X.C8j3.A0X(r6, r15);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0134, code lost:
    
        r31 = r4 >> 3;
        r30 = (r4 & 7) << 3;
        r16 = (r6[r31] >> r30) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0144, code lost:
    
        if (r16 == 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        if (r16 != 254) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014a, code lost:
    
        r25 = r9[r4];
        r25 = (r25 ^ (r25 >>> 16)) * (-862048943);
        r25 = r25 ^ (r25 >>> 16);
        r0 = r25 >>> 7;
        r24 = A00(r0);
        r0 = r0 & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0169, code lost:
    
        if ((((r24 - r0) & r7) / 8) != (((r4 - r0) & r7) / 8)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016b, code lost:
    
        r6[r31] = ((r25 & 127) << r30) | (r6[r31] & ((255 << r30) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017c, code lost:
    
        r6[r15] = (r6[0] & r32) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0184, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0186, code lost:
    
        if (r4 != r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0188, code lost:
    
        r39.A00 = X.C8j3.A0A(r39.A00) - r39.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0193, code lost:
    
        r1 = A00(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0197, code lost:
    
        r39.A01++;
        r6 = r39.A00;
        r9 = r1 >> 3;
        r16 = r12[r9];
        r7 = (r1 & 7) << 3;
        r39.A00 = r6 - (X.AnonymousClass002.A1M((((r16 >> r7) & 255) > 128 ? 1 : (((r16 >> r7) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r2 = (((255 << r7) ^ (-1)) & r16) | (r10 << r7);
        r12[r9] = r2;
        X.C8j3.A1P(r12, r1, r13, r2);
        r2 = r1 ^ (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d0, code lost:
    
        r21 = r24 >> 3;
        r19 = r6[r21];
        r18 = (r24 & 7) << 3;
        r0 = r25 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e0, code lost:
    
        if (((r19 >> r18) & 255) != 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e2, code lost:
    
        r6[r21] = (r19 & ((255 << r18) ^ (-1))) | (r0 << r18);
        r6[r31] = (r6[r31] & ((255 << r30) ^ (-1))) | (128 << r30);
        r9[r24] = r9[r4];
        r9[r4] = 0;
        r5[r24] = r5[r4];
        r5[r4] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020b, code lost:
    
        r6[r21] = (r0 << r18) | (r19 & ((255 << r18) ^ (-1)));
        r1 = r9[r24];
        r9[r24] = r9[r4];
        r9[r4] = r1;
        r1 = r5[r24];
        r5[r24] = r5[r4];
        r5[r4] = r1;
        r4 = r4 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143Abw.A04(int, int):void");
    }

    public C1143Abw() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        A01(this, 6);
    }

    public static final void A01(C1143Abw c1143Abw, int i) {
        int iA0C = C8j3.A0C(i);
        ((AbstractC1142Abv) c1143Abw).A00 = iA0C;
        long[] jArrA1Y = C8j3.A1Y(iA0C);
        c1143Abw.A04 = jArrA1Y;
        C8j3.A1O(jArrA1Y, iA0C);
        c1143Abw.A00 = C8j3.A0A(((AbstractC1142Abv) c1143Abw).A00) - c1143Abw.A01;
        c1143Abw.A02 = new int[iA0C];
        c1143Abw.A03 = new int[iA0C];
    }
}

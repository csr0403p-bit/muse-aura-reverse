package X;

/* renamed from: X.EaB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6800EaB {
    public int A00;
    public final byte[] A01 = new byte[15];

    public static void A00(C6800EaB c6800EaB, int i) {
        byte[] bArr = c6800EaB.A01;
        int i2 = c6800EaB.A00 + 1;
        c6800EaB.A00 = i2;
        bArr[i2] = (byte) i;
    }

    public static void A01(C6800EaB c6800EaB, int i) {
        byte[] bArr = c6800EaB.A01;
        int i2 = c6800EaB.A00 + 1;
        c6800EaB.A00 = i2;
        bArr[i2] = (byte) (i + 48);
    }

    public static void A03(C6800EaB c6800EaB, int i, int i2, int i3) {
        long j;
        long j2;
        int i4;
        int i5 = i2 & 1;
        long j3 = i2 << 2;
        long j4 = j3 + 2;
        if (AnonymousClass002.A1P(i2, 8388608) || AnonymousClass002.A1Q(i, -149)) {
            j = j3 - 2;
            j2 = i * 661971961083L;
        } else {
            j = j3 - 1;
            j2 = (i * 661971961083L) - 274743187321L;
        }
        int i6 = (int) (j2 >> 41);
        int i7 = i + ((int) (((-i6) * 913124641741L) >> 38)) + 33;
        long j5 = 1 + AbstractC6801EaC.A00[(i6 + 324) << 1];
        long jA00 = AbstractC6801EaC.A00(j5, j3 << i7);
        int i8 = (int) ((((jA00 & 4294967295L) + 4294967295L) >>> 32) | (jA00 >>> 31));
        long jA002 = AbstractC6801EaC.A00(j5, j << i7);
        int i9 = (int) ((((jA002 & 4294967295L) + 4294967295L) >>> 32) | (jA002 >>> 31));
        long jA003 = AbstractC6801EaC.A00(j5, j4 << i7);
        int i10 = (int) ((((jA003 & 4294967295L) + 4294967295L) >>> 32) | (jA003 >>> 31));
        int i11 = i8 >> 2;
        if (i11 >= 100) {
            int i12 = ((int) ((i11 * 1717986919) >>> 34)) * 10;
            int i13 = i12 + 10;
            boolean zA1S = BV7.A1S(i9 + i5, i12 << 2);
            if (zA1S != BV7.A1S((i13 << 2) + i5, i10)) {
                if (!zA1S) {
                    i12 = i13;
                }
                A02(c6800EaB, i12, i6);
                return;
            }
        }
        int i14 = i11 + 1;
        boolean zA1S2 = BV7.A1S(i9 + i5, i11 << 2);
        if (zA1S2 == ((i14 << 2) + i5 <= i10) ? !((i4 = i8 - ((i11 + i14) << 1)) < 0 || (i4 == 0 && (i11 & 1) == 0)) : !zA1S2) {
            i11 = i14;
        }
        A02(c6800EaB, i11, i6 + i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[LOOP:2: B:26:0x008f->B:28:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce A[LOOP:4: B:36:0x00c4->B:38:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e A[EDGE_INSN: B:51:0x009e->B:29:0x009e BREAK  A[LOOP:2: B:26:0x008f->B:28:0x0099], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3 A[EDGE_INSN: B:55:0x00d3->B:39:0x00d3 BREAK  A[LOOP:4: B:36:0x00c4->B:38:0x00ce], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C6800EaB r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6800EaB.A02(X.EaB, int, int):void");
    }
}

package X;

import android.R;
import java.security.Permission;
import java.util.Arrays;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes6.dex */
public final class G9q {
    public static final long[] A08 = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    public static final byte[][] A09 = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public final byte[] A05;
    public final long[] A06;
    public final long[] A07;

    public static void A01(G9q g9q, int i) {
        long j = i;
        long j2 = g9q.A03 + j;
        g9q.A03 = j2;
        if (BMp.A01(j2, j) < 0) {
            g9q.A04++;
        }
    }

    public final void A04(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = this.A01;
        if (i > length - i2) {
            throw new OutputLengthException("output buffer too short");
        }
        this.A02 = -1L;
        int i3 = this.A00;
        if (i3 > 0) {
            A01(this, i3);
        }
        byte[] bArr2 = this.A05;
        A03(this, bArr2, 0);
        int i4 = i2 >>> 3;
        int i5 = i2 & 7;
        long[] jArr = this.A06;
        int i6 = i;
        for (int i7 = 0; i7 < i4; i7++) {
            long j = jArr[i7];
            G9r.A01((int) (4294967295L & j), bArr, i6);
            G9r.A01(BV6.A03(j), bArr, i6 + 4);
            i6 += 8;
        }
        if (i5 > 0) {
            long j2 = jArr[i4];
            int i8 = (i + i2) - i5;
            bArr[i8] = (byte) j2;
            for (int i9 = 1; i9 < i5; i9++) {
                j2 >>>= 8;
                bArr[i8 + i9] = (byte) j2;
            }
        }
        this.A00 = 0;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A04 = 0L;
        Arrays.fill(this.A07, 0L);
        Arrays.fill(bArr2, (byte) 0);
        A00(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[LOOP:0: B:13:0x0029->B:14:0x002b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(byte[] r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            if (r7 == 0) goto L18
            int r3 = r5.A00
            r2 = 128(0x80, float:1.794E-43)
            r1 = 0
            if (r3 == 0) goto L27
            int r1 = 128 - r3
            byte[] r0 = r5.A05
            if (r1 < r7) goto L19
            java.lang.System.arraycopy(r6, r4, r0, r3, r7)
        L13:
            int r0 = r5.A00
            int r0 = r0 + r7
            r5.A00 = r0
        L18:
            return
        L19:
            java.lang.System.arraycopy(r6, r4, r0, r3, r1)
            A01(r5, r2)
            A03(r5, r0, r4)
            r5.A00 = r4
            java.util.Arrays.fill(r0, r4)
        L27:
            int r0 = r7 + (-128)
        L29:
            if (r1 >= r0) goto L34
            A01(r5, r2)
            A03(r5, r6, r1)
            int r1 = r1 + 128
            goto L29
        L34:
            byte[] r0 = r5.A05
            int r7 = r7 - r1
            java.lang.System.arraycopy(r6, r1, r0, r4, r7)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G9q.A05(byte[], int):void");
    }

    public G9q() {
        this(512);
    }

    public static void A00(G9q g9q) {
        long[] jArr = g9q.A06;
        long[] jArr2 = A08;
        jArr[0] = jArr2[0] ^ ((g9q.A01 | r6) | R.attr.theme);
        jArr[1] = jArr2[1];
        jArr[2] = jArr2[2] ^ (0 << 8);
        jArr[3] = jArr2[3];
        jArr[4] = jArr2[4];
        jArr[5] = jArr2[5];
        jArr[6] = jArr2[6];
        jArr[7] = jArr2[7];
    }

    public static void A02(G9q g9q, int i, int i2, int i3, int i4, long j, long j2) {
        long[] jArr = g9q.A07;
        long j3 = jArr[i] + jArr[i2] + j;
        jArr[i] = j3;
        long jRotateRight = Long.rotateRight(jArr[i4] ^ j3, 32);
        jArr[i4] = jRotateRight;
        long j4 = jArr[i3] + jRotateRight;
        jArr[i3] = j4;
        long jRotateRight2 = Long.rotateRight(j4 ^ jArr[i2], 24);
        jArr[i2] = jRotateRight2;
        long j5 = jArr[i] + jRotateRight2 + j2;
        jArr[i] = j5;
        long jRotateRight3 = Long.rotateRight(jArr[i4] ^ j5, 16);
        jArr[i4] = jRotateRight3;
        long j6 = jArr[i3] + jRotateRight3;
        jArr[i3] = j6;
        jArr[i2] = Long.rotateRight(j6 ^ jArr[i2], 63);
    }

    public static void A03(G9q g9q, byte[] bArr, int i) {
        int i2 = i;
        long[] jArr = g9q.A06;
        long[] jArr2 = g9q.A07;
        System.arraycopy(jArr, 0, jArr2, 0, 8);
        long[] jArr3 = A08;
        System.arraycopy(jArr3, 0, jArr2, 8, 4);
        jArr2[12] = g9q.A03 ^ jArr3[4];
        jArr2[13] = g9q.A04 ^ jArr3[5];
        jArr2[14] = g9q.A02 ^ jArr3[6];
        jArr2[15] = jArr3[7];
        long[] jArr4 = new long[16];
        int i3 = 0;
        do {
            jArr4[i3] = G9r.A00(bArr, i2);
            i2 += 8;
            i3++;
        } while (i3 < 16);
        int i4 = 0;
        for (int i5 = 0; i5 < 12; i5++) {
            byte[][] bArr2 = A09;
            byte[] bArr3 = bArr2[i5];
            A02(g9q, 0, 4, 8, 12, jArr4[bArr3[0]], jArr4[bArr3[1]]);
            byte[] bArr4 = bArr2[i5];
            A02(g9q, 1, 5, 9, 13, jArr4[bArr4[2]], jArr4[bArr4[3]]);
            byte[] bArr5 = bArr2[i5];
            A02(g9q, 2, 6, 10, 14, jArr4[bArr5[4]], jArr4[bArr5[5]]);
            byte[] bArr6 = bArr2[i5];
            A02(g9q, 3, 7, 11, 15, jArr4[bArr6[6]], jArr4[bArr6[7]]);
            byte[] bArr7 = bArr2[i5];
            A02(g9q, 0, 5, 10, 15, jArr4[bArr7[8]], jArr4[bArr7[9]]);
            byte[] bArr8 = bArr2[i5];
            A02(g9q, 1, 6, 11, 12, jArr4[bArr8[10]], jArr4[bArr8[11]]);
            byte[] bArr9 = bArr2[i5];
            A02(g9q, 2, 7, 8, 13, jArr4[bArr9[12]], jArr4[bArr9[13]]);
            byte[] bArr10 = bArr2[i5];
            A02(g9q, 3, 4, 9, 14, jArr4[bArr10[14]], jArr4[bArr10[15]]);
        }
        do {
            jArr[i4] = (jArr[i4] ^ jArr2[i4]) ^ jArr2[i4 + 8];
            i4++;
        } while (i4 < 8);
    }

    public G9q(int i) {
        this.A01 = 64;
        this.A05 = new byte[128];
        this.A00 = 0;
        this.A07 = new long[16];
        this.A06 = new long[8];
        this.A03 = 0L;
        this.A04 = 0L;
        this.A02 = 0L;
        if (i >= 8 && i <= 512 && i % 8 == 0) {
            this.A01 = i / 8;
            Permission permission = EZG.A03;
            A00(this);
            return;
        }
        throw C60O.A0i("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
    }
}

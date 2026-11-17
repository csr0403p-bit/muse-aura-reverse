package X;

/* loaded from: classes6.dex */
public abstract class GQ6 {
    public static final byte[] A00 = new byte[4];

    public static void A01(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = new byte[4];
        G9r.A01(i, bArr3, 0);
        if (i <= 64) {
            G9q g9q = new G9q(i * 8);
            g9q.A05(bArr3, 4);
            g9q.A05(bArr, bArr.length);
            g9q.A04(bArr2, 0);
            return;
        }
        G9q g9q2 = new G9q(512);
        byte[] bArr4 = new byte[64];
        g9q2.A05(bArr3, 4);
        g9q2.A05(bArr, bArr.length);
        g9q2.A04(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        int i2 = 32;
        int i3 = 2;
        int i4 = ((i + 31) / 32) - 2;
        while (i3 <= i4) {
            g9q2.A05(bArr4, 64);
            g9q2.A04(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i2, 32);
            i3++;
            i2 += 32;
        }
        G9q g9q3 = new G9q((i - (i4 * 32)) * 8);
        g9q3.A05(bArr4, 64);
        g9q3.A04(bArr2, i2);
    }

    public static void A00(GQA gqa, GQA gqa2, GQ9 gq9) {
        long[] jArr = gqa.A00;
        jArr[6] = jArr[6] + 1;
        GQA gqa3 = gq9.A01;
        long[] jArr2 = gqa3.A00;
        System.arraycopy(jArr, 0, jArr2, 0, 128);
        GQ9.A00(gq9);
        GQA.A00(gqa2, gqa, gqa3);
        System.arraycopy(gqa2.A00, 0, jArr2, 0, 128);
        GQ9.A00(gq9);
        GQA.A00(gqa2, gqa2, gqa3);
    }

    public static void A02(long[] jArr, int i, int i2, int i3, int i4) {
        long j = jArr[i];
        long j2 = jArr[i2];
        long j3 = jArr[i3];
        long j4 = j + ((j & 4294967295L) * 2 * (j2 & 4294967295L)) + j2;
        long jRotateRight = Long.rotateRight(jArr[i4] ^ j4, 32);
        long j5 = j3 + ((j3 & 4294967295L) * 2 * (jRotateRight & 4294967295L)) + jRotateRight;
        long jRotateRight2 = Long.rotateRight(j2 ^ j5, 24);
        long j6 = j4 + ((j4 & 4294967295L) * 2 * (jRotateRight2 & 4294967295L)) + jRotateRight2;
        long jRotateRight3 = Long.rotateRight(jRotateRight ^ j6, 16);
        long j7 = j5 + ((j5 & 4294967295L) * 2 * (4294967295L & jRotateRight3)) + jRotateRight3;
        long jRotateRight4 = Long.rotateRight(jRotateRight2 ^ j7, 63);
        jArr[i] = j6;
        jArr[i2] = jRotateRight4;
        jArr[i3] = j7;
        jArr[i4] = jRotateRight3;
    }
}

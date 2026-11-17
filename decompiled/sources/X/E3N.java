package X;

/* loaded from: classes5.dex */
public final class E3N {
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final E3J A07 = new E3J(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final E1P A06 = BV6.A0X();

    public static long A00(E1P e1p) {
        int i = e1p.A01;
        if (e1p.A04() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        e1p.A0U(bArr, 0, 9);
        e1p.A0R(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        return (((j & 56) >> 3) << 30) | ((j & 3) << 28) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | (BV6.A0K(bArr, 3) << 5) | ((b3 & 248) >> 3);
    }
}

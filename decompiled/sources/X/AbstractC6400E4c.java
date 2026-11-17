package X;

/* renamed from: X.E4c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6400E4c {
    public static long A00(E1P e1p, int i, int i2) {
        e1p.A0R(i);
        if (e1p.A04() < 5) {
            return -9223372036854775807L;
        }
        int iA05 = e1p.A05();
        if ((8388608 & iA05) != 0 || ((2096896 & iA05) >> 8) != i2 || (iA05 & 32) == 0 || e1p.A0A() < 7 || e1p.A04() < 7 || (e1p.A0A() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        e1p.A0U(bArr, 0, 6);
        return ((bArr[0] & 255) << 25) | (BV6.A0K(bArr, 1) << 17) | (BV6.A0K(bArr, 2) << 9) | (BV6.A0K(bArr, 3) << 1) | ((255 & bArr[4]) >> 7);
    }
}

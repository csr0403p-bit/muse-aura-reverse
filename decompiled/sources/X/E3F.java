package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E3F implements E51 {
    public final int A00;
    public final E3J A01;
    public final E1P A02 = BV6.A0X();

    @Override // X.E51
    public final void AVf() {
        this.A02.A0T(Util.A07, 0);
    }

    @Override // X.E51
    public final C6422E4y AcJ(E2K e2k, long j) {
        long jAIu = e2k.AIu();
        int iA01 = BV4.A01(112800L, e2k.getLength() - jAIu);
        E1P e1p = this.A02;
        boolean zA03 = E2K.A03(e1p, e2k, iA01);
        int i = e1p.A00;
        long j2 = -1;
        long j3 = -1;
        long j4 = -9223372036854775807L;
        while (e1p.A04() >= 188) {
            byte[] bArr = e1p.A02;
            int i2 = e1p.A01;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jA00 = AbstractC6400E4c.A00(e1p, i2, this.A00);
            if (jA00 != -9223372036854775807L) {
                long jA03 = this.A01.A03(jA00);
                if (jA03 <= j) {
                    j3 = i2;
                    if (100000 + jA03 <= j) {
                        j4 = jA03;
                    }
                } else if (j4 == -9223372036854775807L) {
                    return new C6422E4y(-1, jA03, jAIu);
                }
                return new C6422E4y(zA03 ? 1 : 0, -9223372036854775807L, jAIu + j3);
            }
            e1p.A0R(i3);
            j2 = i3;
        }
        return j4 != -9223372036854775807L ? new C6422E4y(-2, j4, jAIu + j2) : C6422E4y.A03;
    }

    public E3F(E3J e3j, int i) {
        this.A00 = i;
        this.A01 = e3j;
    }
}

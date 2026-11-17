package X;

import androidx.media3.common.ParserException;

/* renamed from: X.E3y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6396E3y {
    public static final byte[] A01 = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] A00 = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean A01(E2K e2k) {
        E1P e1pA0Y = BV6.A0Y(8);
        int i = E4Q.A00(e1pA0Y, e2k).A00;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        e2k.AXi(e1pA0Y.A02, 0, 4);
        int iA05 = BV6.A05(e1pA0Y, 0);
        if (iA05 == 1463899717) {
            return true;
        }
        CNC.A02("WavHeaderReader", FGI.A0H("Unsupported form type: ", iA05));
        return false;
    }

    public static E4Q A00(E1P e1p, E2K e2k, int i) throws ParserException {
        while (true) {
            E4Q e4qA00 = E4Q.A00(e1p, e2k);
            int i2 = e4qA00.A00;
            if (i2 == i) {
                return e4qA00;
            }
            CNC.A04("WavHeaderReader", FGI.A0H("Ignoring unknown WAV chunk: ", i2));
            long j = e4qA00.A01;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.A00(FGI.A0H("Chunk is too large (~2GB+) to skip; id: ", i2));
            }
            e2k.Afm((int) j2);
        }
    }
}

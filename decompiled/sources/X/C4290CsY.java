package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.CsY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4290CsY implements Closeable {
    public C4373CuT A00;
    public final InputStream A02;
    public final byte[] A03 = new byte[8];
    public final C4297Csl A01 = new C4297Csl();

    private final void A03(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.A02.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        this.A00 = null;
    }

    public static final long A00(C4290CsY c4290CsY) throws IOException {
        long j;
        long j2;
        C4373CuT c4373CuT = c4290CsY.A00;
        byte b = c4373CuT.A01;
        if (b < 24) {
            long j3 = b;
            c4290CsY.A00 = null;
            return j3;
        }
        if (b == 24) {
            int i = c4290CsY.A02.read();
            if (i == -1) {
                throw new EOFException();
            }
            c4290CsY.A00 = null;
            return i & 255;
        }
        if (b == 25) {
            byte[] bArr = c4290CsY.A03;
            c4290CsY.A03(bArr, 2);
            long j4 = bArr[0];
            j = bArr[1];
            j2 = (j4 & 255) << 8;
        } else if (b == 26) {
            byte[] bArr2 = c4290CsY.A03;
            c4290CsY.A03(bArr2, 4);
            long j5 = bArr2[0];
            long j6 = bArr2[1];
            long j7 = bArr2[2];
            j = bArr2[3];
            j2 = ((j7 & 255) << 8) | ((j6 & 255) << 16) | ((j5 & 255) << 24);
        } else {
            if (b != 27) {
                throw BV7.A0j("invalid additional information %s for major type %s", BV5.A1a(Byte.valueOf(b), (c4373CuT.A00 >> 5) & 7));
            }
            byte[] bArr3 = c4290CsY.A03;
            c4290CsY.A03(bArr3, 8);
            long j8 = bArr3[0];
            long j9 = bArr3[1];
            long j10 = bArr3[2];
            long j11 = bArr3[3];
            long j12 = bArr3[4];
            long j13 = bArr3[5];
            long j14 = bArr3[6];
            j = bArr3[7];
            j2 = ((j10 & 255) << 40) | ((j9 & 255) << 48) | ((j8 & 255) << 56) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16) | ((j14 & 255) << 8);
        }
        return (j & 255) | j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f6, code lost:
    
        if (r3 == (-5)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9 A[PHI: r5
  0x00f9: PHI (r5v1 X.Csl) = (r5v2 X.Csl), (r5v3 X.Csl) binds: [B:54:0x00c9, B:41:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4373CuT A05() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4290CsY.A05():X.CuT");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
        this.A01.A01();
    }

    public C4290CsY(InputStream inputStream) {
        this.A02 = inputStream;
    }

    public static final void A01(C4290CsY c4290CsY) throws IOException {
        c4290CsY.A05();
        byte b = c4290CsY.A00.A01;
        if (b == 31) {
            throw BV5.A0W("expected definite length but found %s", new Object[]{Byte.valueOf(b)});
        }
    }

    public static final void A02(C4290CsY c4290CsY, byte b) throws IOException {
        c4290CsY.A05();
        byte b2 = c4290CsY.A00.A00;
        if (b2 != b) {
            throw BV5.A0W("expected major type %s but found %s", BV5.A1a(Integer.valueOf((b >> 5) & 7), (b2 >> 5) & 7));
        }
    }

    public static final byte[] A04(C4290CsY c4290CsY) throws IOException {
        A01(c4290CsY);
        long jA00 = A00(c4290CsY);
        if (jA00 < 0 || jA00 > 2147483647L) {
            throw C8j3.A18(String.format("the maximum supported byte/text string length is %s bytes", BV5.A1Y(Integer.MAX_VALUE)));
        }
        if (c4290CsY.A02.available() < jA00) {
            throw new EOFException();
        }
        int i = (int) jA00;
        byte[] bArr = new byte[i];
        c4290CsY.A03(bArr, i);
        return bArr;
    }
}

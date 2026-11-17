package X;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.Eaa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6822Eaa extends InputStream {
    public final /* synthetic */ C6819EaX A00;

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        C7384Etj.A0Y(outputStream, 0);
        C6819EaX c6819EaX = this.A00;
        if (c6819EaX.A00) {
            throw BV4.A0J();
        }
        long j = 0;
        while (true) {
            C6818EaW c6818EaW = c6819EaX.A01;
            if (c6818EaW.A00 == 0 && C6819EaX.A00(c6818EaW, c6819EaX) == -1) {
                return j;
            }
            long j2 = c6818EaW.A00;
            j += j2;
            AbstractC6789EZy.A01(j2, 0L, j2);
            C6830Eai c6830EaiA01 = c6818EaW.A01;
            while (true) {
                C6830Eai c6830Eai = c6830EaiA01;
                while (j2 > 0) {
                    C7384Etj.A0X(c6830EaiA01);
                    int i = c6830EaiA01.A00;
                    int i2 = c6830EaiA01.A01;
                    int iA01 = BV4.A01(j2, i - i2);
                    outputStream.write(c6830EaiA01.A06, i2, iA01);
                    int i3 = c6830EaiA01.A01 + iA01;
                    c6830EaiA01.A01 = i3;
                    long j3 = iA01;
                    c6818EaW.A00 -= j3;
                    j2 -= j3;
                    if (i3 == c6830EaiA01.A00) {
                        break;
                    }
                }
                c6830EaiA01 = c6830EaiA01.A01();
                c6818EaW.A01 = c6830EaiA01;
                AbstractC6826Eae.A01(c6830Eai);
            }
        }
    }

    public C6822Eaa(C6819EaX c6819EaX) {
        this.A00 = c6819EaX;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C6819EaX c6819EaX = this.A00;
        if (c6819EaX.A00) {
            throw BV4.A0J();
        }
        return BV4.A01(c6819EaX.A01.A00, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.A00.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C6819EaX c6819EaX = this.A00;
        if (c6819EaX.A00) {
            throw BV4.A0J();
        }
        C6818EaW c6818EaW = c6819EaX.A01;
        if (c6818EaW.A00 == 0 && C6819EaX.A00(c6818EaW, c6819EaX) == -1) {
            return -1;
        }
        return c6818EaW.readByte() & 255;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        return AnonymousClass001.A0v(".inputStream()", sbA0w);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        C6819EaX c6819EaX = this.A00;
        if (!c6819EaX.A00) {
            AbstractC6789EZy.A01(bArr.length, i, i2);
            C6818EaW c6818EaW = c6819EaX.A01;
            if (c6818EaW.A00 == 0 && C6819EaX.A00(c6818EaW, c6819EaX) == -1) {
                return -1;
            }
            return c6818EaW.A03(bArr, i, i2);
        }
        throw BV4.A0J();
    }
}

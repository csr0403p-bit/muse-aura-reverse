package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.ByE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3100ByE extends FilterInputStream {
    public int A00;
    public int A01;
    public final byte[] A02;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.A01 = this.A00;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw BV4.A0K("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.A00 = this.A01;
    }

    public C3100ByE(byte[] bArr, InputStream inputStream) {
        super(inputStream);
        this.A02 = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 == -1) {
            i3 = 0;
            if (i2 == 0) {
                return 0;
            }
            while (i3 < i2) {
                int i4 = this.A00;
                byte[] bArr2 = this.A02;
                if (i4 >= bArr2.length) {
                    break;
                }
                this.A00 = i4 + 1;
                bArr[i + i3] = (byte) (bArr2[i4] & 255);
                i3++;
            }
            if (i3 <= 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i == -1) {
            int i2 = this.A00;
            byte[] bArr = this.A02;
            if (i2 >= bArr.length) {
                return -1;
            }
            this.A00 = i2 + 1;
            return bArr[i2] & 255;
        }
        return i;
    }
}

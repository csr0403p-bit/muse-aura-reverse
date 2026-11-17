package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.ByD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3099ByD extends FilterInputStream {
    public int A00;
    public int A01;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.A00);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.A01 = this.A00;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.A00--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw BV4.A0K("mark is not supported");
        }
        if (this.A01 == -1) {
            throw BV4.A0K("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.A00 = this.A01;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.A00));
        this.A00 -= (int) jSkip;
        return jSkip;
    }

    public C3099ByD(InputStream inputStream, int i) {
        super(inputStream);
        if (i < 0) {
            throw C60O.A0i("limit must be >= 0");
        }
        this.A00 = i;
        this.A01 = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int i4 = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (i4 <= 0) {
            return i4;
        }
        this.A00 -= i4;
        return i4;
    }
}

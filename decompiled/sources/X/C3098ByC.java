package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.ByC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3098ByC extends FilterInputStream {
    public long A00;
    public long A01;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.A01 = this.A00;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw BV4.A0K("Mark not supported");
        }
        if (this.A01 == -1) {
            throw BV4.A0K("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.A00 = this.A01;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return BV4.A01(((FilterInputStream) this).in.available(), this.A00);
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
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.A00));
        this.A00 -= jSkip;
        return jSkip;
    }

    public C3098ByC(InputStream inputStream) {
        super(inputStream);
        this.A01 = -1L;
        inputStream.getClass();
        this.A00 = 1048576L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        int i3 = ((FilterInputStream) this).in.read(bArr, i, BV4.A01(i2, j));
        if (i3 != -1) {
            this.A00 -= i3;
        }
        return i3;
    }
}

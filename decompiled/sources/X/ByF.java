package X;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class ByF extends InputStream {
    public final InputStream A00;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.A00.mark(i);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        return this.A00.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.A00.reset();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A00.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.A00.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.A00.markSupported();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.A00.skip(j);
    }

    public ByF(InputStream inputStream) {
        this.A00 = inputStream;
    }
}

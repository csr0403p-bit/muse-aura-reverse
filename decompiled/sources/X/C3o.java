package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class C3o extends InputStream {
    public final InputStream A00;
    public final ZipFile A01;

    @Override // java.io.InputStream
    public final int available() {
        return this.A00.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.A00.close();
        } finally {
            this.A01.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.A00.read();
    }

    public C3o(InputStream inputStream, ZipFile zipFile) {
        this.A00 = inputStream;
        this.A01 = zipFile;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }
}

package X;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public final class HqT extends OutputStream {
    public final FileOutputStream A00;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        this.A00.write(bArr);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.A00.flush();
    }

    public HqT(FileOutputStream fileOutputStream) {
        this.A00 = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        this.A00.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.A00.write(i);
    }
}

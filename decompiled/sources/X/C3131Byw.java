package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Byw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3131Byw extends OutputStream {
    public boolean A00 = false;
    public final FileOutputStream A01;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        flush();
        try {
            this.A01.getFD().sync();
        } catch (IOException e) {
            CNC.A06("AtomicFile", "Failed to sync file descriptor:", e);
        }
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.A01.write(i);
    }

    public C3131Byw(File file) {
        this.A01 = BV4.A0I(file);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.A01.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.A01.write(bArr);
    }
}

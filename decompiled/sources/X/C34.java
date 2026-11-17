package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes5.dex */
public final class C34 implements C3N {
    public File A00;
    public FileInputStream A01;
    public FileChannel A02;

    @Override // X.C3N
    public final int AZ5(ByteBuffer byteBuffer, long j) {
        return this.A02.read(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.A02.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.A02.read(byteBuffer);
    }

    @Override // X.C3N
    public final long size() {
        return this.A02.size();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.A02.write(byteBuffer);
    }
}

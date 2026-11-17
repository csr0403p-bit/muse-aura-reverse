package X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: classes5.dex */
public final class C1Z implements Closeable {
    public final FileOutputStream A00;
    public final FileLock A01;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            FileLock fileLock = this.A01;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.A00.close();
        }
    }

    public C1Z(File file) throws IOException {
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        this.A00 = fileOutputStreamA0I;
        try {
            FileLock fileLockLock = fileOutputStreamA0I.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStreamA0I.close();
            }
            this.A01 = fileLockLock;
        } catch (Throwable th) {
            this.A00.close();
            throw th;
        }
    }
}

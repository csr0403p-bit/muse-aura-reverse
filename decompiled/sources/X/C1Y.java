package X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: classes5.dex */
public final class C1Y implements Closeable {
    public final FileOutputStream A00;
    public final Runnable A01;
    public final FileLock A02;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Runnable runnable;
        try {
            try {
                FileLock fileLock = this.A02;
                if (fileLock != null) {
                    fileLock.release();
                }
                if (r0 != null) {
                    this.A01.run();
                }
            } finally {
                th = th;
                this.A00.close();
                runnable = this.A01;
                if (runnable == null) {
                }
                runnable.run();
                throw th;
            }
        } catch (Throwable th) {
            th = th;
            runnable = this.A01;
            if (runnable == null) {
                throw th;
            }
            runnable.run();
            throw th;
        }
    }

    public C1Y(File file, Runnable runnable) throws IOException {
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        this.A00 = fileOutputStreamA0I;
        try {
            FileLock fileLockLock = fileOutputStreamA0I.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStreamA0I.close();
            }
            this.A02 = fileLockLock;
            this.A01 = runnable;
        } catch (Throwable th) {
            this.A00.close();
            throw th;
        }
    }
}

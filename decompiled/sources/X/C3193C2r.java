package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.C2r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3193C2r {
    public MappedByteBuffer A00;
    public final int A01;
    public final File A02;

    public C3193C2r(File file, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (i > 65536) {
            throw BV5.A0Q("Size too big for file: ", i);
        }
        this.A02 = file;
        this.A01 = i;
        RandomAccessFile randomAccessFileA0M = BV4.A0M(file);
        try {
            FileChannel channel = randomAccessFileA0M.getChannel();
            try {
                this.A00 = channel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
                if (channel.tryLock() == null) {
                    throw BV5.A0M("Unable to acquire lock for app state log aslFile: ", file.getCanonicalPath());
                }
                channel.close();
                randomAccessFileA0M.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                randomAccessFileA0M.close();
                throw th;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
            }
        }
    }
}

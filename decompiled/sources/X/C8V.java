package X;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class C8V {
    public static final Map<String, Lock> A03 = BV4.A0u();
    public FileChannel A00;
    public final File A01;
    public final Lock A02;

    public C8V(File file, String str) {
        Lock lock;
        this.A01 = file != null ? BV5.A0L(str, ".lck", file) : null;
        Map<String, Lock> map = A03;
        synchronized (map) {
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            lock = reentrantLock;
        }
        this.A02 = lock;
    }
}

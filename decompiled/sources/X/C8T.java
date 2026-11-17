package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class C8T {
    public static C8T A07;
    public long A00;
    public volatile File A04;
    public volatile File A05;
    public volatile StatFs A03 = null;
    public volatile StatFs A02 = null;
    public volatile boolean A06 = false;
    public final Lock A01 = new ReentrantLock();

    public static StatFs A00(StatFs statFs, File file) throws Throwable {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                C8U.A00(th);
                throw F60.createAndThrow();
            }
        }
        return null;
    }

    public static void A01(C8T c8t) {
        if (c8t.A06) {
            return;
        }
        Lock lock = c8t.A01;
        lock.lock();
        try {
            if (!c8t.A06) {
                c8t.A05 = Environment.getDataDirectory();
                c8t.A04 = Environment.getExternalStorageDirectory();
                c8t.A03 = A00(c8t.A03, c8t.A05);
                c8t.A02 = A00(c8t.A02, c8t.A04);
                c8t.A00 = SystemClock.uptimeMillis();
                c8t.A06 = true;
            }
        } finally {
            lock.unlock();
        }
    }
}

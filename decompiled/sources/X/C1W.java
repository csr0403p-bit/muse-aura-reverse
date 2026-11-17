package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public abstract class C1W {
    public static final ConcurrentHashMap<String, CountDownLatch> A00 = C60O.A1C();

    public static C1Y A00(File file) throws InterruptedException, IOException {
        String canonicalPath = file.getCanonicalPath();
        CountDownLatch countDownLatchA16 = BV5.A16();
        while (true) {
            CountDownLatch countDownLatchPutIfAbsent = A00.putIfAbsent(canonicalPath, countDownLatchA16);
            if (countDownLatchPutIfAbsent == null) {
                C1X c1x = new C1X(canonicalPath, countDownLatchA16);
                try {
                    return new C1Y(file, c1x);
                } catch (Throwable th) {
                    c1x.run();
                    throw th;
                }
            }
            Log.w("soloader.FileLockManager", FGI.A0M("Waiting for in-process lock for ", canonicalPath));
            try {
                countDownLatchPutIfAbsent.await();
            } catch (InterruptedException e) {
                BV4.A1A();
                throw new IOException(FGI.A0M("Interrupted while waiting for in-process lock for ", canonicalPath), e);
            }
        }
    }
}

package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public final class C1X implements Runnable {
    public static final String __redex_internal_original_name = "FileLockManager$CleanupRunnable";
    public final String A00;
    public final CountDownLatch A01;

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap<String, CountDownLatch> concurrentHashMap = C1W.A00;
        String str = this.A00;
        CountDownLatch countDownLatch = this.A01;
        concurrentHashMap.remove(str, countDownLatch);
        countDownLatch.countDown();
    }

    public C1X(String str, CountDownLatch countDownLatch) {
        this.A00 = str;
        this.A01 = countDownLatch;
    }
}

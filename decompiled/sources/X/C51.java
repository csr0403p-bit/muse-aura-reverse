package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class C51 {
    public static ExecutorService A00;
    public static ExecutorService A01;
    public static final ExecutorService A02;
    public static final ExecutorService A03;
    public static final ScheduledExecutorService A04;
    public static final ExecutorService A05;
    public static final ExecutorService A06;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A06 = new ThreadPoolExecutor(0, 1, 15L, timeUnit, new LinkedBlockingQueue(), new C2T("main", 5));
        A03 = new ThreadPoolExecutor(1, 1, 15L, timeUnit, new LinkedBlockingQueue(), new C2T("single", 0));
        A05 = new ThreadPoolExecutor(10, 10, 10L, timeUnit, new LinkedBlockingQueue(), new C2T("init", 0));
        A02 = new ThreadPoolExecutor(0, 1, 10L, timeUnit, new LinkedBlockingQueue(), new C2T("startup", 0));
        A04 = new ScheduledThreadPoolExecutor(3, new C2T("scheduled", 10));
    }

    public static ExecutorService A00() {
        if (A01 == null) {
            synchronized (C51.class) {
                ExecutorService executorService = A01;
                if (executorService != null) {
                    return executorService;
                }
                A01 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2T("sender", 10));
            }
        }
        return A01;
    }

    public static synchronized ExecutorService A01() {
        ExecutorService threadPoolExecutor;
        threadPoolExecutor = A00;
        if (threadPoolExecutor == null) {
            threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2T("background", 10));
            A00 = threadPoolExecutor;
        }
        return threadPoolExecutor;
    }
}

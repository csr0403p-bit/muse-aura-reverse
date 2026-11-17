package X;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.D9r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4871D9r {
    public static final C4871D9r A03 = new C4871D9r();
    public final Executor A00;
    public final ExecutorService A01;
    public final ScheduledExecutorService A02;

    public C4871D9r() {
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null || !property.toLowerCase(Locale.US).contains("android")) {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        } else {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C4873D9t.A01, C4873D9t.A02, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        }
        this.A01 = executorServiceNewCachedThreadPool;
        this.A02 = Executors.newSingleThreadScheduledExecutor();
        this.A00 = new ExecutorC4872D9s();
    }
}

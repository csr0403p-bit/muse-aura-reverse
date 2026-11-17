package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CVK implements ThreadFactory {
    public static final AtomicInteger A03 = BV5.A18();
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = BV5.A18();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.A01, runnable, FGI.A0H(this.A00, this.A02.getAndIncrement()), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public CVK() {
        SecurityManager securityManager = System.getSecurityManager();
        this.A01 = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.A00 = FGI.A0I("lottie-", A03.getAndIncrement(), "-thread-");
    }
}

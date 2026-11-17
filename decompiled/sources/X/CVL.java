package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CVL implements ThreadFactory {
    public int A00;
    public final String A01;
    public final ThreadGroup A02 = Thread.currentThread().getThreadGroup();
    public final AtomicInteger A03 = BV5.A18();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        Thread thread = new Thread(this.A02, new CVM(this, runnable), FGI.A0H(this.A01, this.A03.getAndIncrement()), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public CVL(BYM bym) {
        this.A01 = FGI.A0U("cask-", bym.name(), "-pool--thread-");
        this.A00 = 10;
        if (bym == BYM.A03) {
            this.A00 = 19;
        }
    }
}

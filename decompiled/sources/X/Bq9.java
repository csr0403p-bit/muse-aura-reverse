package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class Bq9 implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = BV5.A18();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.A00.newThread(runnable);
        threadNewThread.setName(FGI.A0H("PlayBillingLibrary-", this.A01.getAndIncrement()));
        return threadNewThread;
    }
}

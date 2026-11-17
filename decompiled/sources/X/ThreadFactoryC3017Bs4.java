package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Bs4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC3017Bs4 implements ThreadFactory {
    public final AtomicInteger A00 = BV5.A18();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, FGI.A0M("gcm-task#", Integer.toString(this.A00.getAndIncrement())));
        thread.setPriority(4);
        return thread;
    }
}

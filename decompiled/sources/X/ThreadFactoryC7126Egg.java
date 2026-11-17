package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Egg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC7126Egg implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = BV4.A13(1);

    public ThreadFactoryC7126Egg(String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        return new Thread(new RunnableC7133Ego(this, runnable), FGI.A0S(this.A00, "-", this.A01.getAndIncrement()));
    }
}

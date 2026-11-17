package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class C04 implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.A01.newThread(new C05(runnable));
        threadNewThread.setName(this.A00);
        return threadNewThread;
    }

    public C04(String str) {
        this.A00 = str;
    }
}

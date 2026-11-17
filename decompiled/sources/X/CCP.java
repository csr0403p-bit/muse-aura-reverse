package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CCP implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = BV5.A18();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C3152Bzs(new CCO(this, runnable), FGI.A0H(this.A01, this.A02.getAndIncrement()));
    }

    public CCP(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}

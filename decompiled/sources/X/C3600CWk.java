package X;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CWk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3600CWk {
    public final ThreadPoolExecutor A00;

    public C3600CWk(ThreadFactory threadFactory) {
        this.A00 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }
}

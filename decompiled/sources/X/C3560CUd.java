package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CUd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3560CUd {
    public static final ThreadFactory A03 = new ThreadFactory() { // from class: X.CUf
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "heartbeat-information-executor");
        }
    };
    public CUK<C3563CUg> A00;
    public final Set<InterfaceC3564CUh> A01;
    public final Executor A02;

    public C3560CUd(Context context, Set<InterfaceC3564CUh> set) {
        CUJ cuj = new CUJ(new C7602F5p(context, 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), A03);
        this.A00 = cuj;
        this.A01 = set;
        this.A02 = threadPoolExecutor;
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class BrH extends Dg6 {
    public final Object A00 = C3cG.A0T();
    public final ExecutorService A01 = Executors.newFixedThreadPool(4, new F2W(this));
    public volatile Handler A02;

    @Override // X.Dg6
    public final void A01(Runnable runnable) {
        this.A01.execute(runnable);
    }

    @Override // X.Dg6
    public final void A02(Runnable runnable) {
        if (this.A02 == null) {
            synchronized (this.A00) {
                if (this.A02 == null) {
                    this.A02 = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        this.A02.post(runnable);
    }

    @Override // X.Dg6
    public final boolean A03() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}

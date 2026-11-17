package X;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Hhq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10443Hhq<T> {
    public RunnableFuture<T> A00;
    public T A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public final T A00() {
        RunnableFuture<T> runnableFuture;
        T t;
        synchronized (this) {
            runnableFuture = this.A00;
            t = this.A01;
        }
        if (t == null) {
            if (runnableFuture == null) {
                throw AbstractC7608F5v.A0e();
            }
            AtomicInteger atomicInteger = this.A02;
            if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                runnableFuture.run();
            }
            t = (T) AbstractC8162FXe.A00(runnableFuture, atomicInteger.get());
            synchronized (this) {
                this.A01 = t;
                this.A00 = null;
            }
            if (this instanceof FEI) {
                C7384Etj.A0Y(t, 0);
                ((FEI) this).A01 = null;
                return t;
            }
            if (0 != 0) {
                C7384Etj.A0Y(t, 0);
                return t;
            }
        }
        return t;
    }

    public final boolean A01() {
        RunnableFuture<T> runnableFuture;
        synchronized (this) {
            runnableFuture = this.A00;
        }
        return runnableFuture == null || runnableFuture.isDone();
    }

    public C10443Hhq(Callable callable) {
        this.A00 = new FutureTask(callable);
    }
}

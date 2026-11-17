package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Brr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3009Brr<T> implements ListenableFuture<T> {
    public final CQV<T> A00 = new C3008Brq(this);
    public final WeakReference<C3010Brs<T>> A01;

    public final boolean A00(Throwable th) {
        CQV<T> cqv = this.A00;
        C3012Bru c3012Bru = C3012Bru.A01;
        th.getClass();
        if (!CQV.A00.A02(cqv, null, new C3012Bru(th))) {
            return false;
        }
        CQV.A03(cqv);
        return true;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C3010Brs<T> c3010Brs = this.A01.get();
        boolean zCancel = this.A00.cancel(z);
        if (zCancel && c3010Brs != null) {
            c3010Brs.A02 = null;
            c3010Brs.A00 = null;
            c3010Brs.A01.A05(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A00.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A00.isDone();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C3009Brr(C3010Brs<T> c3010Brs) {
        this.A01 = BV4.A0q(c3010Brs);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }
}

package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class Bpa<V> implements ListenableFuture<List<V>> {
    public C3010Brs<List<V>> A00;
    public List<? extends ListenableFuture<? extends V>> A01;
    public List<V> A02;
    public final ListenableFuture<List<V>> A03 = AbstractC2947Bpi.A01(this, 22);
    public final AtomicInteger A04;
    public final boolean A05;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A03.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        List<? extends ListenableFuture<? extends V>> list = this.A01;
        if (list != null) {
            Iterator<? extends ListenableFuture<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z);
            }
        }
        return this.A03.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get() {
        List<? extends ListenableFuture<? extends V>> list = this.A01;
        if (list != null && !isDone()) {
            loop0: for (ListenableFuture<? extends V> listenableFuture : list) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error | InterruptedException e) {
                        throw e;
                    } catch (Throwable unused) {
                        if (this.A05) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return this.A03.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A03.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A03.isDone();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+Lcom/google/common/util/concurrent/ListenableFuture<+TV;>;>;ZLjava/util/concurrent/Executor;)V */
    public Bpa(List list, Executor executor, boolean z) {
        this.A01 = list;
        this.A02 = C60Q.A0t(list);
        this.A05 = z;
        this.A04 = BV4.A13(list.size());
        addListener(new RunnableC2944Bpc(this), ExecutorC2446BbZ.A00());
        if (this.A01.isEmpty()) {
            this.A00.A03(BV4.A0t(this.A02));
            return;
        }
        for (int i = 0; i < this.A01.size(); i++) {
            this.A02.add(null);
        }
        List<? extends ListenableFuture<? extends V>> list2 = this.A01;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ListenableFuture<? extends V> listenableFuture = list2.get(i2);
            listenableFuture.addListener(new RunnableC2943Bpb(this, listenableFuture, i2), executor);
        }
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return this.A03.get(j, timeUnit);
    }
}

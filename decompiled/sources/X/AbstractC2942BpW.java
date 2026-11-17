package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: X.BpW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2942BpW {
    public static final BpS<?, ?> A00 = new F5L(7);

    public static <V> V A02(Future<V> future) {
        boolean z = false;
        while (true) {
            try {
                V v = future.get();
                BV7.A1N(z);
                return v;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                BV7.A1N(z);
                throw th;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: <V:Ljava/lang/Object;>(Lcom/google/common/util/concurrent/ListenableFuture<TV;>;LX/BpZ<-TV;>;Ljava/util/concurrent/Executor;)V */
    public static void A03(BpZ bpZ, ListenableFuture listenableFuture, Executor executor) {
        listenableFuture.addListener(new BpX(bpZ, listenableFuture), executor);
    }

    /* JADX WARN: Incorrect types in method signature: <V:Ljava/lang/Object;>(Lcom/google/common/util/concurrent/ListenableFuture<TV;>;LX/Brs<TV;>;)V */
    public static void A04(C3010Brs c3010Brs, ListenableFuture listenableFuture) {
        BpS<?, ?> bpS = A00;
        ExecutorC2446BbZ executorC2446BbZA00 = ExecutorC2446BbZ.A00();
        listenableFuture.getClass();
        c3010Brs.getClass();
        executorC2446BbZA00.getClass();
        A03(new F58(7, bpS, c3010Brs), listenableFuture, executorC2446BbZA00);
        C3010Brs.A00(c3010Brs, new BpY(listenableFuture), ExecutorC2446BbZ.A00());
    }

    public static <V> ListenableFuture<List<V>> A00(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new Bpa(BV4.A0t(collection), ExecutorC2446BbZ.A00(), true);
    }

    public static <V> ListenableFuture<V> A01(ListenableFuture<V> listenableFuture) {
        listenableFuture.getClass();
        return !listenableFuture.isDone() ? AbstractC2947Bpi.A01(listenableFuture, 21) : listenableFuture;
    }
}

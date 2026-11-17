package X;

import com.google.common.base.Strings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public abstract class CQD {
    /* JADX WARN: Incorrect types in method signature: <V:Ljava/lang/Object;>(Lcom/google/common/util/concurrent/ListenableFuture<TV;>;LX/CQG<-TV;>;Ljava/util/concurrent/Executor;)V */
    public static void A01(final CQG future, final ListenableFuture callback, Executor executor) {
        callback.addListener(new CQE(future, callback), executor);
    }

    public static <V> V A00(Future<V> future) {
        if (future.isDone()) {
            return (V) AbstractC2991Br9.A00(future);
        }
        throw new IllegalStateException(Strings.lenientFormat("Future was expected to be done: %s", future));
    }
}

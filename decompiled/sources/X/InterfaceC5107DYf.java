package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.DYf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5107DYf {
    <T> Object asCoroutine(DYI<T> dyi, Executor executor, HtJ<? super AbstractC7555F3i<? extends F1G<T>, ? extends Throwable>> htJ);

    <T> ListenableFuture<F1G<T>> asFuture(DYI<T> dyi, Executor executor);

    <T> InterfaceC5106DYe execute(DYI<T> dyi, F0T<T> f0t, CPS cps, Executor executor);

    <T> InterfaceC5106DYe executeAndSubscribe(DYI<T> dyi, F0T<T> f0t, CPS cps, Executor executor);
}

package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Bpd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2945Bpd<V> implements ListenableFuture<V> {
    public C3010Brs<V> A00;
    public final ListenableFuture<V> A01;

    public static <V> C2945Bpd<V> A00(ListenableFuture<V> listenableFuture) {
        return listenableFuture instanceof C2945Bpd ? (C2945Bpd) listenableFuture : new C2945Bpd<>(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A01.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.A01.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.A01.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A01.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A01.isDone();
    }

    public C2945Bpd(ListenableFuture<V> listenableFuture) {
        listenableFuture.getClass();
        this.A01 = listenableFuture;
    }

    public C2945Bpd() {
        this.A01 = AbstractC2947Bpi.A01(this, 19);
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }
}

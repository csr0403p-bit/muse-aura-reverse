package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class Bpe<I, O> extends C2945Bpd<O> implements Runnable {
    public static final String __redex_internal_original_name = "ChainingListenableFuture";
    public InterfaceC2939BpT<? super I, ? extends O> A00;
    public ListenableFuture<? extends I> A01;
    public final BlockingQueue<Boolean> A02 = new LinkedBlockingQueue(1);
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile ListenableFuture<? extends O> A04;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.concurrent.BlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.BpT<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends I>] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r2 = (InterfaceC2939BpT<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            ListenableFuture<? extends O> listenableFutureA4O = this.A00.A4O(AbstractC2942BpW.A02(this.A01));
                            this.A04 = listenableFutureA4O;
                            if (isCancelled()) {
                                boolean z = false;
                                ?? Take = this.A02;
                                while (true) {
                                    try {
                                        Take = Take.take();
                                        break;
                                    } catch (InterruptedException unused) {
                                        z = true;
                                        Take = Take;
                                    } catch (Throwable th) {
                                        if (z) {
                                            BV4.A1A();
                                        }
                                        throw th;
                                    }
                                }
                                if (z) {
                                    BV4.A1A();
                                }
                                listenableFutureA4O.cancel(AnonymousClass001.A1X(Take));
                                this.A04 = null;
                            } else {
                                ExecutorC2446BbZ.A03(listenableFutureA4O, new Bpf(this, listenableFutureA4O));
                            }
                        } catch (UndeclaredThrowableException e) {
                            Throwable cause = e.getCause();
                            C3010Brs<V> c3010Brs = super.A00;
                            if (c3010Brs != 0) {
                                c3010Brs.A04(cause);
                            }
                        }
                    } catch (Exception e2) {
                        C3010Brs<V> c3010Brs2 = super.A00;
                        if (c3010Brs2 != 0) {
                            c3010Brs2.A04(e2);
                        }
                    }
                } finally {
                    this.A00 = null;
                    this.A01 = null;
                    this.A03.countDown();
                }
            } catch (CancellationException unused2) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause2 = e3.getCause();
                C3010Brs<V> c3010Brs3 = super.A00;
                if (c3010Brs3 != 0) {
                    c3010Brs3.A04(cause2);
                }
            }
        } catch (Error e4) {
            C3010Brs<V> c3010Brs4 = super.A00;
            if (c3010Brs4 != 0) {
                c3010Brs4.A04(e4);
            }
        }
    }

    public static Bpe A01(InterfaceC2939BpT interfaceC2939BpT, C2945Bpd c2945Bpd, Executor executor) {
        Bpe bpe = new Bpe(interfaceC2939BpT, c2945Bpd);
        c2945Bpd.addListener(bpe, executor);
        return bpe;
    }

    public Bpe(InterfaceC2939BpT<? super I, ? extends O> interfaceC2939BpT, ListenableFuture<? extends I> listenableFuture) {
        this.A00 = interfaceC2939BpT;
        listenableFuture.getClass();
        this.A01 = listenableFuture;
    }

    @Override // X.C2945Bpd, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            try {
                this.A02.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                BV7.A1N(z2);
                throw th;
            }
        }
        BV7.A1N(z2);
        ListenableFuture<? extends I> listenableFuture = this.A01;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture<? extends O> listenableFuture2 = this.A04;
        if (listenableFuture2 == null) {
            return true;
        }
        listenableFuture2.cancel(z);
        return true;
    }

    @Override // X.C2945Bpd, java.util.concurrent.Future
    public final O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.A01;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.A03.await();
            ListenableFuture<? extends O> listenableFuture2 = this.A04;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    @Override // X.C2945Bpd, java.util.concurrent.Future
    public final O get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = TimeUnit.NANOSECONDS;
            }
            ListenableFuture<? extends I> listenableFuture = this.A01;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.A03.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture<? extends O> listenableFuture2 = this.A04;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}

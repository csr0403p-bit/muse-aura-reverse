package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.CQd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3485CQd<V> implements ListenableFuture<V> {
    public static final CQf A00;
    public static final Object A02;
    public volatile CQi listeners;
    public volatile Object value;
    public volatile C3490CQn waiters;
    public static final boolean A01 = BV5.A1N();
    public static final Logger A03 = BV5.A1B(AbstractC3485CQd.class);

    private void A01(C3490CQn node) {
        node.thread = null;
        while (true) {
            C3490CQn c3490CQn = this.waiters;
            if (c3490CQn != C3490CQn.A00) {
                C3490CQn c3490CQn2 = null;
                while (c3490CQn != null) {
                    C3490CQn c3490CQn3 = c3490CQn.next;
                    if (c3490CQn.thread != null) {
                        c3490CQn2 = c3490CQn;
                    } else if (c3490CQn2 != null) {
                        c3490CQn2.next = c3490CQn3;
                        if (c3490CQn2.thread == null) {
                            break;
                        }
                    } else if (!A00.A01(c3490CQn, c3490CQn3, this)) {
                        break;
                    }
                    c3490CQn = c3490CQn3;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static V A00(Object obj) {
        if (!(obj instanceof C3488CQl)) {
            if (obj == A02) {
                return null;
            }
            return obj;
        }
        Throwable th = ((C3488CQl) obj).A00;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        C3488CQl c3488CQl;
        boolean zA00;
        C3490CQn c3490CQn;
        CQi cQi;
        Object obj = this.value;
        if (obj == null) {
            if (A01) {
                C3488CQl c3488CQl2 = C3488CQl.A01;
                c3488CQl = new C3488CQl(new CancellationException("Future.cancel() was called."));
            } else {
                c3488CQl = mayInterruptIfRunning ? C3488CQl.A02 : C3488CQl.A01;
            }
            CQf cQf = A00;
            if (cQf instanceof C3486CQe) {
                synchronized (this) {
                    if (this.value == obj) {
                        this.value = c3488CQl;
                        zA00 = true;
                    } else {
                        zA00 = false;
                    }
                }
            } else {
                zA00 = AbstractC5217DdT.A00(this, obj, c3488CQl, ((C3484CQc) cQf).A01);
            }
            if (zA00) {
                CQi cQi2 = null;
                do {
                    c3490CQn = this.waiters;
                } while (!cQf.A01(c3490CQn, C3490CQn.A00, this));
                while (c3490CQn != null) {
                    Thread thread = c3490CQn.thread;
                    if (thread != null) {
                        c3490CQn.thread = null;
                        LockSupport.unpark(thread);
                    }
                    c3490CQn = c3490CQn.next;
                }
                do {
                    cQi = this.listeners;
                } while (!cQf.A00(cQi, CQi.A03, this));
                while (true) {
                    CQi cQi3 = cQi;
                    if (cQi == null) {
                        break;
                    }
                    cQi = cQi.A00;
                    cQi3.A00 = cQi2;
                    cQi2 = cQi3;
                }
                while (true) {
                    CQi cQi4 = cQi2;
                    if (cQi2 == null) {
                        return true;
                    }
                    cQi2 = cQi2.A00;
                    A02(cQi4.A01, cQi4.A02);
                }
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C3488CQl;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return AnonymousClass002.A1X(this.value) & true;
    }

    static {
        CQf c3486CQe;
        try {
            c3486CQe = new C3484CQc(AtomicReferenceFieldUpdater.newUpdater(C3490CQn.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C3490CQn.class, C3490CQn.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3485CQd.class, C3490CQn.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3485CQd.class, CQi.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3485CQd.class, Object.class, BrowserOperationCatalogKt.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            c3486CQe = new C3486CQe();
        }
        A00 = c3486CQe;
        if (th != null) {
            A03.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A02 = C3cG.A0T();
    }

    public static void A02(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            A03.log(Level.SEVERE, AnonymousClass006.A0y(executor, " with executor ", C3cG.A0f(runnable, "RuntimeException while executing runnable ")), (Throwable) e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        listener.getClass();
        executor.getClass();
        CQi cQi = this.listeners;
        CQi cQi2 = CQi.A03;
        if (cQi != cQi2) {
            CQi cQi3 = new CQi(listener, executor);
            do {
                cQi3.A00 = cQi;
                if (A00.A00(cQi, cQi3, this)) {
                    return;
                } else {
                    cQi = this.listeners;
                }
            } while (cQi != cQi2);
        }
        A02(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (obj == null) {
            C3490CQn c3490CQn = this.waiters;
            C3490CQn c3490CQn2 = C3490CQn.A00;
            if (c3490CQn != c3490CQn2) {
                C3490CQn c3490CQn3 = new C3490CQn();
                do {
                    CQf cQf = A00;
                    if (cQf instanceof C3486CQe) {
                        c3490CQn3.next = c3490CQn;
                    } else {
                        ((C3484CQc) cQf).A02.lazySet(c3490CQn3, c3490CQn);
                    }
                    if (cQf.A01(c3490CQn, c3490CQn3, this)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                A01(c3490CQn3);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (obj == null);
                    } else {
                        c3490CQn = this.waiters;
                    }
                } while (c3490CQn != c3490CQn2);
                obj = this.value;
            } else {
                obj = this.value;
            }
        }
        return (V) A00(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r3 = X.C60O.A0w()
            java.lang.String r0 = super.toString()
            r3.append(r0)
            java.lang.String r0 = "[status="
            r3.append(r0)
            boolean r0 = r7.isCancelled()
            java.lang.String r2 = "]"
            if (r0 == 0) goto L22
            java.lang.String r0 = "CANCELLED"
        L1a:
            r3.append(r0)
        L1d:
            java.lang.String r0 = X.AnonymousClass001.A0v(r2, r3)
            return r0
        L22:
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L64
            boolean r0 = r7 instanceof java.util.concurrent.ScheduledFuture     // Catch: java.lang.RuntimeException -> L40
            if (r0 == 0) goto L3e
            java.lang.String r6 = "remaining delay=["
            r1 = r7
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1     // Catch: java.lang.RuntimeException -> L40
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.RuntimeException -> L40
            long r4 = r1.getDelay(r0)     // Catch: java.lang.RuntimeException -> L40
            java.lang.String r0 = " ms]"
            java.lang.String r1 = X.FGI.A0J(r6, r4, r0)     // Catch: java.lang.RuntimeException -> L40
            goto L47
        L3e:
            r1 = 0
            goto L47
        L40:
            r1 = move-exception
            java.lang.String r0 = "Exception thrown from implementation: "
            java.lang.String r1 = X.BV8.A0x(r0, r1)
        L47:
            if (r1 == 0) goto L5b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L5b
            java.lang.String r0 = "PENDING, info=["
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            goto L1d
        L5b:
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L64
            java.lang.String r0 = "PENDING"
            goto L1a
        L64:
            r4 = 0
        L65:
            java.lang.Object r1 = r7.get()     // Catch: java.lang.InterruptedException -> L6a java.lang.Throwable -> L88
            goto L6c
        L6a:
            r4 = 1
            goto L65
        L6c:
            if (r4 == 0) goto L71
            X.BV4.A1A()     // Catch: java.lang.RuntimeException -> L8f java.util.concurrent.CancellationException -> L98 java.util.concurrent.ExecutionException -> L9b
        L71:
            java.lang.String r0 = "SUCCESS, result=["
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L8f java.util.concurrent.CancellationException -> L98 java.util.concurrent.ExecutionException -> L9b
            if (r1 != r7) goto L79
            goto L7e
        L79:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L8f java.util.concurrent.CancellationException -> L98 java.util.concurrent.ExecutionException -> L9b
            goto L81
        L7e:
            java.lang.String r0 = "this future"
        L81:
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L8f java.util.concurrent.CancellationException -> L98 java.util.concurrent.ExecutionException -> L9b
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L8f java.util.concurrent.CancellationException -> L98 java.util.concurrent.ExecutionException -> L9b
            goto L1d
        L88:
            r0 = move-exception
            if (r4 == 0) goto L8e
            X.BV4.A1A()     // Catch: java.lang.RuntimeException -> L8f java.util.concurrent.CancellationException -> L98 java.util.concurrent.ExecutionException -> L9b
        L8e:
            throw r0     // Catch: java.lang.RuntimeException -> L8f java.util.concurrent.CancellationException -> L98 java.util.concurrent.ExecutionException -> L9b
        L8f:
            r1 = move-exception
            java.lang.String r0 = "UNKNOWN, cause=["
            X.BV7.A1C(r1, r0, r3)
            java.lang.String r0 = " thrown from get()]"
            goto L1a
        L98:
            java.lang.String r0 = "CANCELLED"
            goto L1a
        L9b:
            r0 = move-exception
            X.BV8.A1Q(r3, r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3485CQd.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r16, java.util.concurrent.TimeUnit r18) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3485CQd.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}

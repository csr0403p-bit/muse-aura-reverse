package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class CQV<V> implements ListenableFuture<V> {
    public static final CQh A00;
    public static final Object A02;
    public volatile C3492CQp listeners;
    public volatile Object value;
    public volatile C3489CQm waiters;
    public static final boolean A01 = BV5.A1N();
    public static final Logger A03 = BV5.A1B(CQV.class);

    public static <V> V A01(Future<V> future) {
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

    private void A02(C3489CQm c3489CQm) {
        c3489CQm.thread = null;
        while (true) {
            C3489CQm c3489CQm2 = this.waiters;
            if (c3489CQm2 != C3489CQm.A00) {
                C3489CQm c3489CQm3 = null;
                while (c3489CQm2 != null) {
                    C3489CQm c3489CQm4 = c3489CQm2.next;
                    if (c3489CQm2.thread != null) {
                        c3489CQm3 = c3489CQm2;
                    } else if (c3489CQm3 != null) {
                        c3489CQm3.next = c3489CQm4;
                        if (c3489CQm3.thread == null) {
                            break;
                        }
                    } else if (!A00.A01(c3489CQm2, c3489CQm4, this)) {
                        break;
                    }
                    c3489CQm2 = c3489CQm4;
                }
                return;
            }
            return;
        }
    }

    public static void A03(CQV<?> cqv) {
        C3489CQm c3489CQm;
        CQh cQh;
        C3492CQp c3492CQp;
        C3492CQp c3492CQp2 = null;
        do {
            c3489CQm = cqv.waiters;
            cQh = A00;
        } while (!cQh.A01(c3489CQm, C3489CQm.A00, cqv));
        while (c3489CQm != null) {
            Thread thread = c3489CQm.thread;
            if (thread != null) {
                c3489CQm.thread = null;
                LockSupport.unpark(thread);
            }
            c3489CQm = c3489CQm.next;
        }
        do {
            c3492CQp = cqv.listeners;
        } while (!cQh.A00(c3492CQp, C3492CQp.A03, cqv));
        while (true) {
            C3492CQp c3492CQp3 = c3492CQp;
            if (c3492CQp == null) {
                break;
            }
            c3492CQp = c3492CQp.A00;
            c3492CQp3.A00 = c3492CQp2;
            c3492CQp2 = c3492CQp3;
        }
        while (true) {
            C3492CQp c3492CQp4 = c3492CQp2;
            if (c3492CQp2 == null) {
                return;
            }
            c3492CQp2 = c3492CQp2.A00;
            A04(c3492CQp4.A01, c3492CQp4.A02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static V A00(Object obj) throws ExecutionException {
        if (obj instanceof C3493CQq) {
            Throwable th = ((C3493CQq) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C3012Bru) {
            throw new ExecutionException(((C3012Bru) obj).A00);
        }
        if (obj == A02) {
            return null;
        }
        return obj;
    }

    public final boolean A05(V v) {
        if (v == null) {
            v = (V) A02;
        }
        if (!A00.A02(this, null, v)) {
            return false;
        }
        A03(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C3493CQq c3493CQq;
        Object obj = this.value;
        if (obj == null) {
            if (A01) {
                C3493CQq c3493CQq2 = C3493CQq.A01;
                c3493CQq = new C3493CQq(new CancellationException("Future.cancel() was called."));
            } else {
                c3493CQq = z ? C3493CQq.A02 : C3493CQq.A01;
            }
            if (A00.A02(this, obj, c3493CQq)) {
                A03(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C3493CQq;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return AnonymousClass002.A1X(this.value) & true;
    }

    static {
        CQh c3487CQg;
        try {
            c3487CQg = new C3483CQb(AtomicReferenceFieldUpdater.newUpdater(C3489CQm.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C3489CQm.class, C3489CQm.class, "next"), AtomicReferenceFieldUpdater.newUpdater(CQV.class, C3489CQm.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(CQV.class, C3492CQp.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(CQV.class, Object.class, BrowserOperationCatalogKt.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            c3487CQg = new C3487CQg();
        }
        A00 = c3487CQg;
        if (th != null) {
            A03.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A02 = C3cG.A0T();
    }

    public static void A04(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            A03.log(Level.SEVERE, AnonymousClass006.A0y(executor, " with executor ", C3cG.A0f(runnable, "RuntimeException while executing runnable ")), (Throwable) e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C3492CQp c3492CQp = this.listeners;
        C3492CQp c3492CQp2 = C3492CQp.A03;
        if (c3492CQp != c3492CQp2) {
            C3492CQp c3492CQp3 = new C3492CQp(runnable, executor);
            do {
                c3492CQp3.A00 = c3492CQp;
                if (A00.A00(c3492CQp, c3492CQp3, this)) {
                    return;
                } else {
                    c3492CQp = this.listeners;
                }
            } while (c3492CQp != c3492CQp2);
        }
        A04(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (obj == null) {
            C3489CQm c3489CQm = this.waiters;
            C3489CQm c3489CQm2 = C3489CQm.A00;
            if (c3489CQm != c3489CQm2) {
                C3489CQm c3489CQm3 = new C3489CQm();
                do {
                    CQh cQh = A00;
                    if (cQh instanceof C3487CQg) {
                        c3489CQm3.next = c3489CQm;
                    } else {
                        ((C3483CQb) cQh).A02.lazySet(c3489CQm3, c3489CQm);
                    }
                    if (cQh.A01(c3489CQm, c3489CQm3, this)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                A02(c3489CQm3);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (obj == null);
                    } else {
                        c3489CQm = this.waiters;
                    }
                } while (c3489CQm != c3489CQm2);
                obj = this.value;
            } else {
                obj = this.value;
            }
        }
        return (V) A00(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = X.C60O.A0w()
            java.lang.String r0 = super.toString()
            r3.append(r0)
            java.lang.String r0 = "[status="
            r3.append(r0)
            boolean r0 = r5.isCancelled()
            java.lang.String r2 = "]"
            if (r0 == 0) goto L22
            java.lang.String r0 = "CANCELLED"
        L1a:
            r3.append(r0)
        L1d:
            java.lang.String r0 = X.AnonymousClass001.A0v(r2, r3)
            return r0
        L22:
            boolean r0 = r5.isDone()
            if (r0 != 0) goto L75
            boolean r0 = r5 instanceof X.C3008Brq     // Catch: java.lang.RuntimeException -> L51
            if (r0 == 0) goto L4c
            r0 = r5
            X.Brq r0 = (X.C3008Brq) r0     // Catch: java.lang.RuntimeException -> L51
            X.Brr r0 = r0.A00     // Catch: java.lang.RuntimeException -> L51
            java.lang.ref.WeakReference<X.Brs<T>> r0 = r0.A01     // Catch: java.lang.RuntimeException -> L51
            java.lang.Object r4 = r0.get()     // Catch: java.lang.RuntimeException -> L51
            X.Brs r4 = (X.C3010Brs) r4     // Catch: java.lang.RuntimeException -> L51
            if (r4 != 0) goto L3e
            java.lang.String r1 = "Completer object has been garbage collected, future will fail soon"
            goto L58
        L3e:
            java.lang.String r0 = "tag=["
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)     // Catch: java.lang.RuntimeException -> L51
            java.lang.Object r0 = r4.A02     // Catch: java.lang.RuntimeException -> L51
            java.lang.String r1 = X.BV8.A0u(r0, r1)     // Catch: java.lang.RuntimeException -> L51
            goto L58
        L4c:
            java.lang.String r1 = X.BV8.A0t(r5)     // Catch: java.lang.RuntimeException -> L51
            goto L58
        L51:
            r1 = move-exception
            java.lang.String r0 = "Exception thrown from implementation: "
            java.lang.String r1 = X.BV8.A0x(r0, r1)
        L58:
            if (r1 == 0) goto L6c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6c
            java.lang.String r0 = "PENDING, info=["
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            goto L1d
        L6c:
            boolean r0 = r5.isDone()
            if (r0 != 0) goto L75
            java.lang.String r0 = "PENDING"
            goto L1a
        L75:
            java.lang.Object r1 = A01(r5)     // Catch: java.lang.RuntimeException -> L90 java.util.concurrent.CancellationException -> L99 java.util.concurrent.ExecutionException -> L9d
            java.lang.String r0 = "SUCCESS, result=["
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L90 java.util.concurrent.CancellationException -> L99 java.util.concurrent.ExecutionException -> L9d
            if (r1 != r5) goto L81
            goto L86
        L81:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L90 java.util.concurrent.CancellationException -> L99 java.util.concurrent.ExecutionException -> L9d
            goto L89
        L86:
            java.lang.String r0 = "this future"
        L89:
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L90 java.util.concurrent.CancellationException -> L99 java.util.concurrent.ExecutionException -> L9d
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L90 java.util.concurrent.CancellationException -> L99 java.util.concurrent.ExecutionException -> L9d
            goto L1d
        L90:
            r1 = move-exception
            java.lang.String r0 = "UNKNOWN, cause=["
            X.BV7.A1C(r1, r0, r3)
            java.lang.String r0 = " thrown from get()]"
            goto L1a
        L99:
            java.lang.String r0 = "CANCELLED"
            goto L1a
        L9d:
            r0 = move-exception
            X.BV8.A1Q(r3, r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQV.toString():java.lang.String");
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
        throw new UnsupportedOperationException("Method not decompiled: X.CQV.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}

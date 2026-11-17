package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.CNl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractRunnableC3440CNl<T> extends AtomicReference<Runnable> implements Runnable {
    public static final Runnable A00 = new RunnableC3442CNn();
    public static final Runnable A01 = new RunnableC3442CNn();
    public static final String __redex_internal_original_name = "InterruptibleTask";

    public T A01() {
        return (T) ((C3436CNh) this).callable.call();
    }

    public void A03(T result) {
        ((C3436CNh) this).this$0.set(result);
    }

    public boolean A04() {
        return ((C3436CNh) this).this$0.isDone();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(java.lang.Thread r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.get()
            r3 = 0
            r2 = 0
            r1 = 0
        L7:
            boolean r0 = r4 instanceof X.RunnableC3441CNm
            if (r0 != 0) goto L15
            java.lang.Runnable r0 = X.AbstractRunnableC3440CNl.A01
            if (r4 == r0) goto L16
            if (r2 == 0) goto L14
            r6.interrupt()
        L14:
            return
        L15:
            r3 = r4
        L16:
            int r1 = r1 + 1
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto L39
            java.lang.Runnable r0 = X.AbstractRunnableC3440CNl.A01
            if (r4 == r0) goto L26
            boolean r0 = r5.compareAndSet(r4, r0)
            if (r0 == 0) goto L34
        L26:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L30
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L31
        L30:
            r2 = 1
        L31:
            java.util.concurrent.locks.LockSupport.park(r3)
        L34:
            java.lang.Object r4 = r5.get()
            goto L7
        L39:
            java.lang.Thread.yield()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC3440CNl.A00(java.lang.Thread):void");
    }

    public final void A02() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            RunnableC3441CNm runnableC3441CNm = new RunnableC3441CNm(this);
            RunnableC3441CNm.A00(runnableC3441CNm, Thread.currentThread());
            if (compareAndSet(runnable, runnableC3441CNm)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(A00) == A01) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (getAndSet(A00) == A01) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.CPo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.CNl, X.CNl<T>, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        boolean z = false;
        ?? A012 = 0;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zA04 = A04();
            if (!zA04) {
                try {
                    A012 = A01();
                    z = A012;
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            threadCurrentThread.interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, A00)) {
                            A00(threadCurrentThread);
                        }
                        if (this instanceof C3436CNh) {
                            ((C3436CNh) this).this$0.setException(th);
                            return;
                        }
                        CPn cPn = ((AbstractC3480CPo) this).this$0;
                        CPa cPa = CPg.A03;
                        cPn.A00 = A012;
                        if (th instanceof ExecutionException) {
                            cPn.setException(th.getCause());
                            return;
                        } else if (th instanceof CancellationException) {
                            cPn.cancel(false);
                            return;
                        } else {
                            cPn.setException(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, A00)) {
                            A00(threadCurrentThread);
                        }
                        A03(A012);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, A00)) {
                A00(threadCurrentThread);
            }
            if (zA04) {
                return;
            }
            A03(z);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = get();
        return FGI.A0U(runnable == A00 ? "running=[DONE]" : runnable instanceof RunnableC3441CNm ? "running=[INTERRUPTED]" : runnable instanceof Thread ? FGI.A0U("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", (this instanceof C3436CNh ? ((C3436CNh) this).callable : ((CPq) this).callable).toString());
    }
}

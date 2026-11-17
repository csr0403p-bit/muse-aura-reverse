package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.google.common.base.Preconditions;
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
public abstract class CQU<V> extends AbstractC3445CNq implements ListenableFuture<V> {
    public static final CQX ATOMIC_HELPER;
    public static final boolean GENERATE_CANCELLATION_CAUSES;
    public static final Object NULL;
    public static final long SPIN_THRESHOLD_NANOS = 1000;
    public static final CPa log;
    public volatile CQj listeners;
    public volatile Object value;
    public volatile C3491CQo waiters;

    public static void complete(CQU<?> cqu, boolean z) {
        CQj cQj = null;
        while (true) {
            cqu.releaseWaiters();
            if (z) {
                cqu.interruptTask();
                z = false;
            }
            cqu.afterDone();
            CQj cQjClearListeners = cqu.clearListeners(cQj);
            while (cQjClearListeners != null) {
                cQj = cQjClearListeners.A00;
                Runnable runnable = cQjClearListeners.A01;
                runnable.getClass();
                if (runnable instanceof CQW) {
                    CQW cqw = (CQW) runnable;
                    cqu = cqw.A00;
                    if (cqu.value == cqw) {
                        if (ATOMIC_HELPER.A06(cqu, cqw, getFutureValue(cqw.A01))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cQjClearListeners.A02;
                    executor.getClass();
                    executeListener(runnable, executor);
                }
                cQjClearListeners = cQj;
            }
            return;
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
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

    private void removeWaiter(C3491CQo node) {
        node.thread = null;
        while (true) {
            C3491CQo c3491CQo = this.waiters;
            if (c3491CQo != C3491CQo.A00) {
                C3491CQo c3491CQo2 = null;
                while (c3491CQo != null) {
                    C3491CQo c3491CQo3 = c3491CQo.next;
                    if (c3491CQo.thread != null) {
                        c3491CQo2 = c3491CQo;
                    } else if (c3491CQo2 != null) {
                        c3491CQo2.next = c3491CQo3;
                        if (c3491CQo2.thread == null) {
                            break;
                        }
                    } else if (!ATOMIC_HELPER.A05(c3491CQo, c3491CQo3, this)) {
                        break;
                    }
                    c3491CQo = c3491CQo3;
                }
                return;
            }
            return;
        }
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    private void addDoneString(StringBuilder builder) {
        String str;
        try {
            Object uninterruptibly = getUninterruptibly(this);
            builder.append("SUCCESS, result=[");
            appendResultObject(builder, uninterruptibly);
            builder.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            builder.append(str);
        } catch (ExecutionException e) {
            BV8.A1Q(builder, e);
        } catch (Exception e2) {
            BV7.A1C(e2, "UNKNOWN, cause=[", builder);
            str = " thrown from get()]";
            builder.append(str);
        }
    }

    private void appendResultObject(StringBuilder builder, Object o) {
        String strA0x;
        if (o == null) {
            strA0x = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        } else if (o == this) {
            strA0x = "this future";
        } else {
            builder.append(C60Q.A0e(o));
            builder.append("@");
            strA0x = BV7.A0x(o);
        }
        builder.append(strA0x);
    }

    private void appendUserObject(StringBuilder builder, Object o) {
        try {
            if (o == this) {
                builder.append("this future");
            } else {
                builder.append(o);
            }
        } catch (Exception | StackOverflowError e) {
            BV7.A1C(e, "Exception thrown from implementation: ", builder);
        }
    }

    public static CancellationException cancellationExceptionWithCause(String message, Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    private CQj clearListeners(CQj onto) {
        CQj cQjA00 = ATOMIC_HELPER.A00(this, CQj.A03);
        while (true) {
            CQj cQj = cQjA00;
            if (cQjA00 == null) {
                return onto;
            }
            cQjA00 = cQjA00.A00;
            cQj.A00 = onto;
            onto = cQj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof CQk) {
            Throwable th = ((CQk) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof CEi) {
            throw new ExecutionException(((CEi) obj).A00);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(ListenableFuture<?> future) {
        Throwable cause;
        Object cQk;
        if (future instanceof InterfaceC2989Br2) {
            cQk = ((CQU) future).value;
            if (cQk instanceof CQk) {
                CQk cQk2 = (CQk) cQk;
                if (cQk2.A01) {
                    Throwable th = cQk2.A00;
                    if (th != null) {
                        cQk = new CQk(th, false);
                    }
                }
            }
            cQk.getClass();
            return cQk;
        }
        if (!(future instanceof AbstractC3445CNq) || (cause = ((AbstractC3445CNq) future).tryInternalFastPathGetFailure()) == null) {
            boolean zIsCancelled = future.isCancelled();
            if (!((!GENERATE_CANCELLATION_CAUSES) & zIsCancelled)) {
                try {
                    Object uninterruptibly = getUninterruptibly(future);
                    if (!zIsCancelled) {
                        return uninterruptibly == null ? NULL : uninterruptibly;
                    }
                    CQk cQk3 = CQk.A02;
                    return new CQk(BV5.A0O(future, "get() did not throw CancellationException, despite reporting isCancelled() == true: "), false);
                } catch (Error | Exception e) {
                    return new CEi(e);
                } catch (CancellationException e2) {
                    if (zIsCancelled) {
                        return new CQk(e2, false);
                    }
                    CEi cEi = CEi.A01;
                    return new CEi(BV4.A0Q(AnonymousClass007.A0a("get() threw CancellationException, despite reporting isCancelled() == false: ", future), e2));
                } catch (ExecutionException e3) {
                    if (zIsCancelled) {
                        CQk cQk4 = CQk.A02;
                        return new CQk(BV4.A0Q(AnonymousClass007.A0a("get() did not throw CancellationException, despite reporting isCancelled() == true: ", future), e3), false);
                    }
                    CEi cEi2 = CEi.A01;
                    cause = e3.getCause();
                }
            }
        }
        return new CEi(cause);
        cQk = CQk.A02;
        cQk.getClass();
        return cQk;
    }

    private void releaseWaiters() {
        for (C3491CQo c3491CQoA01 = ATOMIC_HELPER.A01(this, C3491CQo.A00); c3491CQoA01 != null; c3491CQoA01 = c3491CQoA01.next) {
            Thread thread = c3491CQoA01.thread;
            if (thread != null) {
                c3491CQoA01.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public void addListener(Runnable listener, Executor executor) {
        CQj cQj;
        CQj cQj2;
        Preconditions.checkNotNull(listener, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (cQj = this.listeners) != (cQj2 = CQj.A03)) {
            CQj cQj3 = new CQj(listener, executor);
            do {
                cQj3.A00 = cQj;
                if (ATOMIC_HELPER.A04(cQj, cQj3, this)) {
                    return;
                } else {
                    cQj = this.listeners;
                }
            } while (cQj != cQj2);
        }
        executeListener(listener, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r6) {
        /*
            r5 = this;
            java.lang.Object r3 = r5.value
            r4 = 1
            r2 = 0
            boolean r1 = X.AnonymousClass002.A1Y(r3)
            boolean r0 = r3 instanceof X.CQW
            r1 = r1 | r0
            if (r1 == 0) goto L5c
            boolean r0 = X.CQU.GENERATE_CANCELLATION_CAUSES
            if (r0 == 0) goto L4d
            X.CQk r0 = X.CQk.A02
            java.lang.String r1 = "Future.cancel() was called."
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            X.CQk r2 = new X.CQk
            r2.<init>(r0, r6)
        L1f:
            r1 = 0
        L20:
            X.CQX r0 = X.CQU.ATOMIC_HELPER
            boolean r0 = r0.A06(r5, r3, r2)
            if (r0 == 0) goto L46
            complete(r5, r6)
            boolean r0 = r3 instanceof X.CQW
            if (r0 == 0) goto L5b
            X.CQW r3 = (X.CQW) r3
            com.google.common.util.concurrent.ListenableFuture<? extends V> r5 = r3.A01
            boolean r0 = r5 instanceof X.InterfaceC2989Br2
            if (r0 == 0) goto L58
            X.CQU r5 = (X.CQU) r5
            java.lang.Object r3 = r5.value
            boolean r1 = X.AnonymousClass002.A1Y(r3)
            boolean r0 = r3 instanceof X.CQW
            r1 = r1 | r0
            if (r1 == 0) goto L5b
            r1 = 1
            goto L20
        L46:
            java.lang.Object r3 = r5.value
            boolean r0 = r3 instanceof X.CQW
            if (r0 != 0) goto L20
            return r1
        L4d:
            if (r6 == 0) goto L55
            X.CQk r2 = X.CQk.A03
        L51:
            r2.getClass()
            goto L1f
        L55:
            X.CQk r2 = X.CQk.A02
            goto L51
        L58:
            r5.cancel(r6)
        L5b:
            return r4
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQU.cancel(boolean):boolean");
    }

    public boolean isCancelled() {
        return this.value instanceof CQk;
    }

    public boolean isDone() {
        return (!(r0 instanceof CQW)) & (this.value != null);
    }

    public boolean set(V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.A06(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setException(Throwable throwable) {
        CEi cEi = CEi.A01;
        throwable.getClass();
        if (!ATOMIC_HELPER.A06(this, null, new CEi(throwable))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    @Override // X.AbstractC3445CNq
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof InterfaceC2989Br2)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof CEi) {
            return ((CEi) obj).A00;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof CQk) && ((CQk) obj).A01;
    }

    static {
        boolean zA1N;
        CQX cqz;
        try {
            zA1N = BV5.A1N();
        } catch (SecurityException unused) {
            zA1N = false;
        }
        GENERATE_CANCELLATION_CAUSES = zA1N;
        log = new CPa(CQU.class);
        Throwable e = null;
        try {
            cqz = new CQa();
            e = null;
        } catch (Error | Exception e2) {
            e = e2;
            try {
                cqz = new CQY(AtomicReferenceFieldUpdater.newUpdater(C3491CQo.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C3491CQo.class, C3491CQo.class, "next"), AtomicReferenceFieldUpdater.newUpdater(CQU.class, C3491CQo.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(CQU.class, CQj.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(CQU.class, Object.class, BrowserOperationCatalogKt.VALUE));
            } catch (Error | Exception e3) {
                e = e3;
                cqz = new CQZ();
            }
        }
        ATOMIC_HELPER = cqz;
        if (e != null) {
            CPa cPa = log;
            Logger loggerA00 = cPa.A00();
            Level level = Level.SEVERE;
            loggerA00.log(level, "UnsafeAtomicHelper is broken!", e);
            cPa.A00().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
        NULL = C3cG.A0T();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addPendingString(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r3 = r5.length()
            java.lang.String r0 = "PENDING"
            r5.append(r0)
            java.lang.Object r1 = r4.value
            boolean r0 = r1 instanceof X.CQW
            java.lang.String r2 = "]"
            if (r0 == 0) goto L31
            java.lang.String r0 = ", setFuture=["
            r5.append(r0)
            X.CQW r1 = (X.CQW) r1
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r1.A01
            r4.appendUserObject(r5, r0)
        L1d:
            r5.append(r2)
        L20:
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L30
            int r0 = r5.length()
            r5.delete(r3, r0)
            r4.addDoneString(r5)
        L30:
            return
        L31:
            java.lang.String r1 = r4.pendingToString()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L20
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L45
            goto L20
        L3e:
            r1 = move-exception
            java.lang.String r0 = "Exception thrown from implementation: "
            java.lang.String r1 = X.BV8.A0x(r0, r1)
        L45:
            java.lang.String r0 = ", info=["
            r5.append(r0)
            r5.append(r1)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQU.addPendingString(java.lang.StringBuilder):void");
    }

    public static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerA00 = log.A00();
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            loggerA00.log(level, sb.toString(), (Throwable) e);
        }
    }

    public V get() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (!((obj != null) & (!(obj instanceof CQW)))) {
            C3491CQo c3491CQo = this.waiters;
            C3491CQo c3491CQo2 = C3491CQo.A00;
            if (c3491CQo != c3491CQo2) {
                C3491CQo c3491CQo3 = new C3491CQo();
                do {
                    CQX cqx = ATOMIC_HELPER;
                    cqx.A02(c3491CQo3, c3491CQo);
                    if (cqx.A05(c3491CQo, c3491CQo3, this)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                removeWaiter(c3491CQo3);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof CQW))));
                    } else {
                        c3491CQo = this.waiters;
                    }
                } while (c3491CQo != c3491CQo2);
                obj = this.value;
                obj.getClass();
            } else {
                obj = this.value;
                obj.getClass();
            }
        }
        return getDoneValue(obj);
    }

    public final void maybePropagateCancellationTo(Future<?> related) {
        if (AnonymousClass002.A1X(related) && isCancelled()) {
            related.cancel(wasInterrupted());
        }
    }

    public String pendingToString() {
        return BV8.A0t(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r8) {
        /*
            r7 = this;
            r8.getClass()
            java.lang.Object r1 = r7.value
            r6 = 0
            if (r1 != 0) goto L42
            boolean r0 = r8.isDone()
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L20
            java.lang.Object r1 = getFutureValue(r8)
            X.CQX r0 = X.CQU.ATOMIC_HELPER
            boolean r0 = r0.A06(r7, r4, r1)
            if (r0 == 0) goto L4d
            complete(r7, r6)
            return r5
        L20:
            X.CQW r3 = new X.CQW
            r3.<init>(r7, r8)
            X.CQX r2 = X.CQU.ATOMIC_HELPER
            boolean r0 = r2.A06(r7, r4, r3)
            if (r0 == 0) goto L40
            X.CNw r0 = X.EnumC3451CNw.A01     // Catch: java.lang.Throwable -> L33
            r8.addListener(r3, r0)     // Catch: java.lang.Throwable -> L33
            return r5
        L33:
            r1 = move-exception
            X.CEi r0 = new X.CEi     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            X.CEi r0 = X.CEi.A01
        L3c:
            r2.A06(r7, r3, r0)
            return r5
        L40:
            java.lang.Object r1 = r7.value
        L42:
            boolean r0 = r1 instanceof X.CQk
            if (r0 == 0) goto L4d
            X.CQk r1 = (X.CQk) r1
            boolean r0 = r1.A01
            r8.cancel(r0)
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQU.setFuture(com.google.common.util.concurrent.ListenableFuture):boolean");
    }

    public String toString() {
        StringBuilder sbA0w = C60O.A0w();
        Class<?> cls = getClass();
        String name = cls.getName();
        if (name.startsWith("com.google.common.util.concurrent.")) {
            sbA0w.append(cls.getSimpleName());
        } else {
            sbA0w.append(name);
        }
        sbA0w.append('@');
        BV4.A1N(sbA0w, System.identityHashCode(this));
        sbA0w.append("[status=");
        if (isCancelled()) {
            sbA0w.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sbA0w);
        } else {
            addPendingString(sbA0w);
        }
        return AnonymousClass001.A0v("]", sbA0w);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(long r14, java.util.concurrent.TimeUnit r16) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQU.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}

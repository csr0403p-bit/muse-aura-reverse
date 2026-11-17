package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.CQt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3496CQt implements ListenableFuture {
    public static final CR0 A00;
    public static final Object A01;
    public volatile Object a;
    public volatile CR2 b;
    public volatile C3502CQz c;
    public static final boolean A03 = BV5.A1N();
    public static final Logger A02 = BV5.A1B(AbstractC3496CQt.class);

    private final void A01(C3502CQz c3502CQz) {
        c3502CQz.a = null;
        while (true) {
            C3502CQz c3502CQz2 = this.c;
            if (c3502CQz2 != C3502CQz.A00) {
                C3502CQz c3502CQz3 = null;
                while (c3502CQz2 != null) {
                    C3502CQz c3502CQz4 = c3502CQz2.b;
                    if (c3502CQz2.a != null) {
                        c3502CQz3 = c3502CQz2;
                    } else if (c3502CQz3 != null) {
                        c3502CQz3.b = c3502CQz4;
                        if (c3502CQz3.a == null) {
                            break;
                        }
                    } else if (!A00.A00(c3502CQz2, c3502CQz4, this)) {
                        break;
                    }
                    c3502CQz2 = c3502CQz4;
                }
                return;
            }
            return;
        }
    }

    static {
        CR0 c3501CQy;
        try {
            c3501CQy = new C3500CQx(AtomicReferenceFieldUpdater.newUpdater(C3502CQz.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3502CQz.class, C3502CQz.class, CRD.__redex_internal_original_name), AtomicReferenceFieldUpdater.newUpdater(AbstractC3496CQt.class, C3502CQz.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3496CQt.class, CR2.class, CRD.__redex_internal_original_name), AtomicReferenceFieldUpdater.newUpdater(AbstractC3496CQt.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c3501CQy = new C3501CQy();
        }
        A00 = c3501CQy;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A01 = C3cG.A0T();
    }

    public static Object A00(Object obj) throws ExecutionException {
        if (obj instanceof CR1) {
            CancellationException cancellationException = ((CR1) obj).A00;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof CR3) {
            throw new ExecutionException(((CR3) obj).A00);
        }
        if (obj == A01) {
            return null;
        }
        return obj;
    }

    public static void A02(AbstractC3496CQt abstractC3496CQt) {
        C3502CQz c3502CQz;
        CR0 cr0;
        CR2 cr2;
        CR2 cr22;
        CR2 cr23;
        do {
            c3502CQz = abstractC3496CQt.c;
            cr0 = A00;
        } while (!cr0.A00(c3502CQz, C3502CQz.A00, abstractC3496CQt));
        while (true) {
            cr2 = null;
            if (c3502CQz == null) {
                break;
            }
            Thread thread = c3502CQz.a;
            if (thread != null) {
                c3502CQz.a = null;
                LockSupport.unpark(thread);
            }
            c3502CQz = c3502CQz.b;
        }
        do {
            cr22 = abstractC3496CQt.b;
        } while (!cr0.A01(abstractC3496CQt, cr22, CR2.A03));
        while (true) {
            cr23 = cr2;
            cr2 = cr22;
            if (cr22 == null) {
                break;
            }
            cr22 = cr22.A00;
            cr2.A00 = cr23;
        }
        while (cr23 != null) {
            CR2 cr24 = cr23.A00;
            Runnable runnable = cr23.A01;
            Executor executor = cr23.A02;
            try {
                executor.execute(runnable);
            } catch (RuntimeException e) {
                A02.log(Level.SEVERE, AnonymousClass006.A0y(executor, " with executor ", C3cG.A0f(runnable, "RuntimeException while executing runnable ")), (Throwable) e);
            }
            cr23 = cr24;
        }
    }

    public final void A03(Throwable th) {
        if (A00.A02(this, new CR3(th))) {
            A02(this);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        CR1 cr1;
        if (this.a == null) {
            if (A03) {
                CR1 cr12 = CR1.A01;
                cr1 = new CR1(new CancellationException("Future.cancel() was called."));
            } else {
                cr1 = z ? CR1.A01 : CR1.A02;
            }
            if (A00.A02(this, cr1)) {
                A02(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof CR1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return AnonymousClass002.A1X(this.a);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        CR2 cr2 = this.b;
        CR2 cr22 = CR2.A03;
        if (cr2 != cr22) {
            CR2 cr23 = new CR2(runnable, executor);
            do {
                cr23.A00 = cr2;
                if (A00.A01(this, cr2, cr23)) {
                    return;
                } else {
                    cr2 = this.b;
                }
            } while (cr2 != cr22);
        }
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            A02.log(Level.SEVERE, AnonymousClass006.A0y(executor, " with executor ", C3cG.A0f(runnable, "RuntimeException while executing runnable ")), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj == null) {
            C3502CQz c3502CQz = this.c;
            C3502CQz c3502CQz2 = C3502CQz.A00;
            if (c3502CQz != c3502CQz2) {
                C3502CQz c3502CQz3 = new C3502CQz();
                do {
                    CR0 cr0 = A00;
                    if (cr0 instanceof C3501CQy) {
                        c3502CQz3.b = c3502CQz;
                    } else {
                        ((C3500CQx) cr0).A01.lazySet(c3502CQz3, c3502CQz);
                    }
                    if (cr0.A00(c3502CQz, c3502CQz3, this)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                A01(c3502CQz3);
                                throw new InterruptedException();
                            }
                            obj = this.a;
                        } while (obj == null);
                    } else {
                        c3502CQz = this.c;
                    }
                } while (c3502CQz != c3502CQz2);
                obj = this.a;
            } else {
                obj = this.a;
            }
        }
        return A00(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
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
            java.lang.Object r0 = r5.a
            boolean r0 = r0 instanceof X.CR1
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
            boolean r0 = r5 instanceof X.C3499CQw     // Catch: java.lang.RuntimeException -> L51
            if (r0 == 0) goto L4c
            r0 = r5
            X.CQw r0 = (X.C3499CQw) r0     // Catch: java.lang.RuntimeException -> L51
            X.CQu r0 = r0.A00     // Catch: java.lang.RuntimeException -> L51
            java.lang.ref.WeakReference r0 = r0.A01     // Catch: java.lang.RuntimeException -> L51
            java.lang.Object r4 = r0.get()     // Catch: java.lang.RuntimeException -> L51
            X.CQv r4 = (X.C3498CQv) r4     // Catch: java.lang.RuntimeException -> L51
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
            r4 = 0
        L76:
            java.lang.Object r1 = r5.get()     // Catch: java.lang.InterruptedException -> L7b java.lang.Throwable -> L98
            goto L7d
        L7b:
            r4 = 1
            goto L76
        L7d:
            if (r4 == 0) goto L82
            X.BV4.A1A()     // Catch: java.lang.RuntimeException -> L9f java.util.concurrent.CancellationException -> La9 java.util.concurrent.ExecutionException -> Lad
        L82:
            java.lang.String r0 = "SUCCESS, result=["
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L9f java.util.concurrent.CancellationException -> La9 java.util.concurrent.ExecutionException -> Lad
            if (r1 != r5) goto L8d
            java.lang.String r0 = "this future"
            goto L91
        L8d:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L9f java.util.concurrent.CancellationException -> La9 java.util.concurrent.ExecutionException -> Lad
        L91:
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L9f java.util.concurrent.CancellationException -> La9 java.util.concurrent.ExecutionException -> Lad
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L9f java.util.concurrent.CancellationException -> La9 java.util.concurrent.ExecutionException -> Lad
            goto L1d
        L98:
            r0 = move-exception
            if (r4 == 0) goto L9e
            X.BV4.A1A()     // Catch: java.lang.RuntimeException -> L9f java.util.concurrent.CancellationException -> La9 java.util.concurrent.ExecutionException -> Lad
        L9e:
            throw r0     // Catch: java.lang.RuntimeException -> L9f java.util.concurrent.CancellationException -> La9 java.util.concurrent.ExecutionException -> Lad
        L9f:
            r1 = move-exception
            java.lang.String r0 = "UNKNOWN, cause=["
            X.BV7.A1C(r1, r0, r3)
            java.lang.String r0 = " thrown from get()]"
            goto L1a
        La9:
            java.lang.String r0 = "CANCELLED"
            goto L1a
        Lad:
            r0 = move-exception
            X.BV8.A1Q(r3, r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3496CQt.toString():java.lang.String");
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
    public final java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3496CQt.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}

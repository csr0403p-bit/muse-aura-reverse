package X;

import java.lang.reflect.InvocationTargetException;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CRv {
    public boolean A00;
    public final Object A02 = C3cG.A0T();
    public final Queue A03 = BV4.A0s();
    public final AtomicReference A01 = BV4.A15();

    public static final void A00(CRv cRv) {
        synchronized (cRv.A02) {
            Queue queue = cRv.A03;
            if (queue.isEmpty()) {
                cRv.A00 = false;
            } else {
                CRx cRx = (CRx) queue.remove();
                cRv.A01(cRx.A01, cRx.A00);
            }
        }
    }

    private final void A01(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: X.CRw
                public static final String __redex_internal_original_name = "zzt";

                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    CRv cRv = this.A00;
                    AtomicReference atomicReference = cRv.A01;
                    if (atomicReference.getAndSet(Thread.currentThread()) != null) {
                        throw BV4.A0T();
                    }
                    try {
                        runnable.run();
                        atomicReference.set(null);
                        CRv.A00(cRv);
                    } catch (Throwable th) {
                        try {
                            atomicReference.set(null);
                            CRv.A00(cRv);
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            A00(this);
        }
    }

    public final void A02(Executor executor, Runnable runnable) {
        synchronized (this.A02) {
            if (this.A00) {
                this.A03.add(new CRx(runnable, executor));
            } else {
                this.A00 = true;
                A01(executor, runnable);
            }
        }
    }
}

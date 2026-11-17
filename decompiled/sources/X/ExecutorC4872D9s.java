package X;

import java.util.concurrent.Executor;

/* renamed from: X.D9s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC4872D9s implements Executor {
    public ThreadLocal<Integer> A00 = new ThreadLocal<>();

    private void A00() {
        ThreadLocal<Integer> threadLocal = this.A00;
        Integer numA0V = threadLocal.get();
        if (numA0V == null) {
            numA0V = BV4.A0V();
        }
        int iIntValue = numA0V.intValue() - 1;
        if (iIntValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(iIntValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ThreadLocal<Integer> threadLocal = this.A00;
        Integer numA0V = threadLocal.get();
        if (numA0V == null) {
            numA0V = BV4.A0V();
        }
        int iIntValue = numA0V.intValue() + 1;
        threadLocal.set(Integer.valueOf(iIntValue));
        try {
            if (iIntValue <= 15) {
                runnable.run();
            } else {
                C4871D9r.A03.A01.execute(runnable);
            }
        } finally {
            A00();
        }
    }
}

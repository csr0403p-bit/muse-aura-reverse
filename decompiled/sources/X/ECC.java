package X;

import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class ECC implements Executor {
    public Runnable A00;
    public final Executor A02;
    public final Object A03 = C3cG.A0T();
    public final Queue<Runnable> A01 = BV4.A0s();

    public static final void A00(ECC ecc) {
        synchronized (ecc.A03) {
            Runnable runnablePoll = ecc.A01.poll();
            ecc.A00 = runnablePoll;
            if (runnablePoll != null) {
                ecc.A02.execute(runnablePoll);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.A03) {
            this.A01.add(new Runnable() { // from class: X.ECG
                public static final String __redex_internal_original_name = "AppCompatDelegate$SerialExecutor$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    ECC ecc = this.A00;
                    try {
                        runnable.run();
                    } finally {
                        ECC.A00(ecc);
                    }
                }
            });
            if (this.A00 == null) {
                A00(this);
            }
        }
    }

    public ECC(Executor executor) {
        this.A02 = executor;
    }
}

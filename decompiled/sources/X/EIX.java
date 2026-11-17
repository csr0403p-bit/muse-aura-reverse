package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EIX implements Executor {
    public Runnable A00;
    public final Executor A03;
    public final ArrayDeque<Runnable> A02 = BV4.A0s();
    public final Object A01 = C3cG.A0T();

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        synchronized (this.A01) {
            this.A02.offer(new Runnable(this) { // from class: X.EIc
                public static final String __redex_internal_original_name = "TransactionExecutor$$ExternalSyntheticLambda0";
                public final /* synthetic */ EIX A00;

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    EIX eix = this.A00;
                    try {
                        runnable2.run();
                    } finally {
                        EIX.A00(eix);
                    }
                }

                {
                    this.A00 = this;
                }
            });
            if (this.A00 == null) {
                A00(this);
            }
        }
    }

    public static final void A00(EIX eix) {
        synchronized (eix.A01) {
            Runnable runnablePoll = eix.A02.poll();
            Runnable runnable = runnablePoll;
            eix.A00 = runnable;
            if (runnablePoll != null) {
                eix.A03.execute(runnable);
            }
        }
    }

    public EIX(Executor executor) {
        this.A03 = executor;
    }
}

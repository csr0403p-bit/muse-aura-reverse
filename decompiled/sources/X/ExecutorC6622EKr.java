package X;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.EKr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC6622EKr implements Executor {
    public static final String A04 = EK9.A01("SerialExecutorImpl");
    public Runnable A00;
    public final Executor A03;
    public final ArrayDeque<ELV> A02 = BV4.A0s();
    public final Object A01 = C3cG.A0T();

    public final void A00() {
        ELV elvPoll = this.A02.poll();
        this.A00 = elvPoll;
        if (elvPoll != null) {
            try {
                this.A03.execute(elvPoll);
            } catch (Throwable th) {
                EK9.A00();
                Log.e(A04, "Delegate executor failed to execute", th);
                this.A00 = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        synchronized (this.A01) {
            this.A02.add(new ELV(this, command));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public ExecutorC6622EKr(Executor executor) {
        this.A03 = executor;
    }
}

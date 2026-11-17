package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* renamed from: X.I0o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC10644I0o implements Executor {
    public final int $t;
    public final Object A00;

    public ExecutorC10644I0o(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$t) {
            case 0:
                ((Choreographer) this.A00).postFrameCallback(new ChoreographerFrameCallbackC10645I0p(runnable, 0));
                break;
            case 1:
                ((C9621GSq) this.A00).A08.post(runnable);
                break;
            default:
                C7729FCg c7729FCg = (C7729FCg) this.A00;
                Handler handlerA00 = C7743FCu.A00();
                Object obj = c7729FCg.A03;
                handlerA00.removeCallbacksAndMessages(obj);
                handlerA00.postAtTime(runnable, obj, 0L);
                break;
        }
    }
}

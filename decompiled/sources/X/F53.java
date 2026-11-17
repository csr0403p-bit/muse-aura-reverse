package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class F53 implements Executor {
    public final int $t;
    public final Object A00;

    public F53(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        (this.$t != 0 ? ((C6616EKj) this.A00).A00 : (Handler) this.A00).post(command);
    }
}

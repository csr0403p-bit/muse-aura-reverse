package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class F52 implements Executor {
    public final int $t;

    public F52(int i) {
        this.$t = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$t) {
            case 0:
                Dg0.A00().A01(runnable);
                break;
            case 1:
            case 2:
                runnable.run();
                break;
            case 3:
                C60O.A02().post(runnable);
                break;
            case 4:
                new Thread(runnable).start();
                break;
        }
    }
}

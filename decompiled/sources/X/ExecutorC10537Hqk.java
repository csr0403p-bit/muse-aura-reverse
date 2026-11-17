package X;

import java.util.concurrent.Executor;
import kotlinx.coroutines.DispatchException;

/* renamed from: X.Hqk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ExecutorC10537Hqk implements Executor {
    public final GBK A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws DispatchException {
        GBK gbk = this.A00;
        C6ys c6ys = C6ys.A00;
        if (GBI.A02(c6ys, gbk)) {
            GBI.A01(runnable, c6ys, gbk);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.A00.toString();
    }

    public ExecutorC10537Hqk(GBK gbk) {
        this.A00 = gbk;
    }
}

package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class HmJ implements Executor {
    public final Handler A00 = C60O.A02();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}

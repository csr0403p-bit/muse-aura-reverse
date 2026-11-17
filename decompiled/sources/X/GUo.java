package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.rsys.execution.gen.Task;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* loaded from: classes6.dex */
public final class GUo extends TaskExecutor {
    public final Handler A00;

    @Override // com.facebook.rsys.execution.gen.TaskExecutor
    public final void execute(Task task, long j) {
        C7384Etj.A0Y(task, 0);
        this.A00.postDelayed(new GVP(task), j);
    }

    public GUo() {
        Looper looperMyLooper = Looper.myLooper();
        this.A00 = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
    }

    @Override // com.facebook.rsys.execution.gen.TaskExecutor
    public final boolean isCurrent() {
        return C7384Etj.areEqual(Looper.myLooper(), this.A00.getLooper());
    }
}

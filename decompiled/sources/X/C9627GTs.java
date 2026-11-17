package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.rsys.execution.gen.Task;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* renamed from: X.GTs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9627GTs extends TaskExecutor {
    public final Handler A00;

    @Override // com.facebook.rsys.execution.gen.TaskExecutor
    public final void execute(Task task, long j) {
        C7384Etj.A0Y(task, 0);
        this.A00.postDelayed(new GVQ(task), j);
    }

    @Override // com.facebook.rsys.execution.gen.TaskExecutor
    public final boolean isCurrent() {
        return C7384Etj.areEqual(this.A00.getLooper(), Looper.myLooper());
    }

    public C9627GTs(Handler handler) {
        this.A00 = handler;
    }
}

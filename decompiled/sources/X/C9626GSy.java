package X;

import com.facebook.rsys.execution.gen.Task;

/* renamed from: X.GSy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9626GSy extends Task {
    public final /* synthetic */ Runnable A00;

    public C9626GSy(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // com.facebook.rsys.execution.gen.Task
    public final void run() {
        this.A00.run();
    }
}

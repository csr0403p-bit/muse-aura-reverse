package X;

import com.facebook.rsys.execution.gen.Task;

/* loaded from: classes6.dex */
public final class GVQ implements Runnable {
    public static final String __redex_internal_original_name = "HandlerTaskExecutor$execute$1";
    public final /* synthetic */ Task A00;

    public GVQ(Task task) {
        this.A00 = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }
}

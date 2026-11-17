package X;

import android.view.Choreographer;

/* renamed from: X.FCs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7741FCs implements Runnable {
    public static final String __redex_internal_original_name = "RenderCallbackQueue$1";
    public final /* synthetic */ C7739FCq A00;

    public RunnableC7741FCs(C7739FCq c7739FCq) {
        this.A00 = c7739FCq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Choreographer.getInstance().postFrameCallback(this.A00.A02);
    }
}

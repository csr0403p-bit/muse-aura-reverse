package X;

import android.view.Choreographer;
import java.util.Iterator;

/* renamed from: X.FCr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7740FCr implements Runnable {
    public static final String __redex_internal_original_name = "RenderCallbackQueue$special$$inlined$TracedRunnable$1";
    public final /* synthetic */ C7739FCq A00;

    public RunnableC7740FCr(C7739FCq c7739FCq) {
        this.A00 = c7739FCq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7739FCq c7739FCq = this.A00;
        if (c7739FCq.A00) {
            c7739FCq.A06.invoke();
            return;
        }
        c7739FCq.A01 = true;
        Iterator<RunnableC7742FCt> it = c7739FCq.A04.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            ((RunnableC7742FCt) C7384Etj.A0F(it)).run();
            it.remove();
        }
        c7739FCq.A01 = false;
        if (c7739FCq.A00) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(c7739FCq.A02);
    }
}

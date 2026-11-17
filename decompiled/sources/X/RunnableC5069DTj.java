package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: X.DTj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5069DTj implements Runnable {
    public static final String __redex_internal_original_name = "Task$4";
    public final /* synthetic */ C5067DTh A00;
    public final /* synthetic */ Callable A01;

    public RunnableC5069DTj(C5067DTh c5067DTh, Callable callable) {
        this.A00 = c5067DTh;
        this.A01 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        try {
            C5067DTh c5067DTh = this.A00;
            if (c5067DTh.A00.A04(this.A01.call())) {
            } else {
                throw C3cG.A0Q("Cannot set the result of a completed task.");
            }
        } catch (CancellationException unused) {
            if (!this.A00.A00.A03()) {
                throw C3cG.A0Q("Cannot cancel a completed task.");
            }
        } catch (Exception e) {
            this.A00.A00(e);
        }
    }
}

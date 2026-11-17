package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.DTi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5068DTi implements Runnable {
    public static final String __redex_internal_original_name = "Task$14";
    public final /* synthetic */ InterfaceC5071DTl A00;
    public final /* synthetic */ C5066DTg A01;
    public final /* synthetic */ C5067DTh A02;

    public RunnableC5068DTi(InterfaceC5071DTl interfaceC5071DTl, C5066DTg c5066DTg, C5067DTh c5067DTh) {
        this.A02 = c5067DTh;
        this.A00 = interfaceC5071DTl;
        this.A01 = c5066DTg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.A02.A00.A04(this.A00.Agq(this.A01))) {
            } else {
                throw C3cG.A0Q("Cannot set the result of a completed task.");
            }
        } catch (CancellationException unused) {
            if (!this.A02.A00.A03()) {
                throw C3cG.A0Q("Cannot cancel a completed task.");
            }
        } catch (Exception e) {
            this.A02.A00(e);
        }
    }
}

package X;

import java.util.List;

/* renamed from: X.FNs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7977FNs implements Runnable {
    public static final String __redex_internal_original_name = "DataSynchronizer$2";
    public final /* synthetic */ FNC A00;
    public final /* synthetic */ C7975FNq A01;

    public RunnableC7977FNs(FNC fnc, C7975FNq c7975FNq) {
        this.A00 = fnc;
        this.A01 = c7975FNq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7975FNq c7975FNq = this.A01;
        FNC fnc = this.A00;
        List list = c7975FNq.A01;
        if (list != null) {
            list.remove(fnc);
        }
    }
}

package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FNx implements Runnable {
    public static final String __redex_internal_original_name = "DataSynchronizer$3";
    public final /* synthetic */ C7975FNq A00;

    public FNx(C7975FNq c7975FNq) {
        this.A00 = c7975FNq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00.A01;
        if (list != null) {
            list.clear();
        }
    }
}

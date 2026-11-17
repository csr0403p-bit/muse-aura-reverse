package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class BxB implements Runnable {
    public static final String __redex_internal_original_name = "MountContentPools$ensureLifecycleCallbacks$1$1";
    public final /* synthetic */ Context A00;

    public BxB(Context context) {
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1HY c1hy = (C1HY) this.A00;
        c1hy.getLifecycle().A04(new BxC(C8j3.A0m(c1hy)));
    }
}

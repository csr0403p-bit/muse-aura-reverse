package X;

import android.view.View;

/* renamed from: X.Drv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5912Drv implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$maybeSetKeepScreenOn$1";
    public final /* synthetic */ C5627DmA A00;
    public final /* synthetic */ boolean A01;

    public RunnableC5912Drv(C5627DmA c5627DmA, boolean z) {
        this.A00 = c5627DmA;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00.A02;
        if (view != null) {
            view.setKeepScreenOn(this.A01);
        }
    }
}

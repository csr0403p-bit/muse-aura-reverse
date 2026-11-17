package X;

import android.os.Handler;

/* renamed from: X.Dh4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5359Dh4 implements Runnable {
    public static final String __redex_internal_original_name = "DashMediaSource$3";
    public final /* synthetic */ C5423DiJ A00;
    public final /* synthetic */ C5358Dh3 A01;

    public RunnableC5359Dh4(C5423DiJ c5423DiJ, C5358Dh3 c5358Dh3) {
        this.A00 = c5423DiJ;
        this.A01 = c5358Dh3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5358Dh3 c5358Dh3 = this.A01;
        C5358Dh3 c5358Dh32 = C5358Dh3.$redex_init_class;
        Handler handler = c5358Dh3.A08;
        if (handler != null) {
            handler.removeCallbacks(c5358Dh3.A0T);
        }
    }
}

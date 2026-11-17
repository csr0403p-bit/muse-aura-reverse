package X;

import android.widget.FrameLayout;

/* renamed from: X.FOv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8001FOv implements Runnable {
    public static final String __redex_internal_original_name = "CdsScreenErrorViewHandler$hideErrorView$1";
    public final /* synthetic */ C7997FOq A00;

    public RunnableC8001FOv(C7997FOq c7997FOq) {
        this.A00 = c7997FOq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null) {
            AbstractC7610F5x.A19(frameLayout);
            frameLayout.removeAllViews();
        }
    }
}

package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.Fb6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8282Fb6 implements Runnable {
    public static final String __redex_internal_original_name = "ActionBarOverlayLayout$2";
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public RunnableC8282Fb6(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A03();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A0L);
    }
}

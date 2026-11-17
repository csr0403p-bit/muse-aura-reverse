package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.Fb5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8281Fb5 implements Runnable {
    public static final String __redex_internal_original_name = "ActionBarOverlayLayout$3";
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public RunnableC8281Fb5(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A03();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY(-actionBarOverlayLayout.A02.getHeight()).setListener(actionBarOverlayLayout.A0L);
    }
}

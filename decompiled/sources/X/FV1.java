package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
public final class FV1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public FV1(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A00.A0B(0);
        return true;
    }
}

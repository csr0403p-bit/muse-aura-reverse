package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* loaded from: classes6.dex */
public final class FVX implements InterfaceC8055FRi {
    public final /* synthetic */ SwipeDismissBehavior A00;

    public FVX(SwipeDismissBehavior swipeDismissBehavior) {
        this.A00 = swipeDismissBehavior;
    }

    @Override // X.InterfaceC8055FRi
    public final boolean AXn(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.A00;
        if (!(swipeDismissBehavior instanceof BaseTransientBottomBar$Behavior ? view instanceof FW2 : true)) {
            return false;
        }
        view.offsetLeftAndRight((swipeDismissBehavior.A02 == 0 && (view.getLayoutDirection() == 1)) ? -view.getWidth() : view.getWidth());
        view.setAlpha(0.0f);
        FVc fVc = swipeDismissBehavior.A04;
        if (fVc != null) {
            fVc.ASY(view);
        }
        return true;
    }
}

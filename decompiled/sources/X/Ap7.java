package X;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* loaded from: classes4.dex */
public abstract class Ap7 {
    public static final ViewGroup.LayoutParams A00 = new ViewGroup.LayoutParams(-2, -2);

    public static final void A00(ComponentActivity componentActivity, G0V g0v) {
        ComposeView composeView;
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if ((childAt instanceof ComposeView) && (composeView = (ComposeView) childAt) != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(g0v);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(g0v);
        View decorView = componentActivity.getWindow().getDecorView();
        if (AbstractC1720Ap8.A00(decorView) == null) {
            AbstractC1720Ap8.A01(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.A00(decorView) == null) {
            C7384Etj.A0Y(decorView, 0);
            decorView.setTag(com.facebook.aura.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (Ap6.A00(decorView) == null) {
            C7384Etj.A0Y(decorView, 0);
            decorView.setTag(com.facebook.aura.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(composeView2, A00);
    }
}

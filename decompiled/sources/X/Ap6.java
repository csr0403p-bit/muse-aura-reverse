package X;

import android.view.View;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.aura.R;

/* loaded from: classes4.dex */
public abstract class Ap6 {
    public static final A6I A00(View view) {
        A6I a6i;
        C7384Etj.A0Y(view, 0);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if ((tag instanceof A6I) && (a6i = (A6I) tag) != null) {
                return a6i;
            }
            Object objA00 = AbstractC1722ApB.A00(view);
            view = objA00 instanceof View ? (View) objA00 : null;
        }
        return null;
    }

    public static void A01(View view, View view2) {
        AbstractC1720Ap8.A01(view2, AbstractC1720Ap8.A00(view));
        view2.setTag(R.id.view_tree_view_model_store_owner, ViewTreeViewModelStoreOwner.A00(view));
        view2.setTag(R.id.view_tree_saved_state_registry_owner, A00(view));
    }
}

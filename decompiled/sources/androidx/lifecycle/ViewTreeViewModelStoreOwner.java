package androidx.lifecycle;

import X.AbstractC1722ApB;
import X.BOD;
import X.C7384Etj;
import android.view.View;
import com.facebook.aura.R;

/* loaded from: classes4.dex */
public abstract class ViewTreeViewModelStoreOwner {
    public static final BOD A00(View view) {
        BOD bod;
        C7384Etj.A0Y(view, 0);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if ((tag instanceof BOD) && (bod = (BOD) tag) != null) {
                return bod;
            }
            Object objA00 = AbstractC1722ApB.A00(view);
            view = objA00 instanceof View ? (View) objA00 : null;
        }
        return null;
    }
}

package X;

import android.view.View;
import com.facebook.aura.R;

/* renamed from: X.ApD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1724ApD {
    public static final C28u A00(View view) {
        C28u c28u;
        C7384Etj.A0Y(view, 0);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            if ((tag instanceof C28u) && (c28u = (C28u) tag) != null) {
                return c28u;
            }
            Object objA00 = AbstractC1722ApB.A00(view);
            view = objA00 instanceof View ? (View) objA00 : null;
        }
        return null;
    }
}

package X;

import android.view.View;
import com.facebook.aura.R;

/* renamed from: X.Ap8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1720Ap8 {
    public static final C1HY A00(View view) {
        C1HY c1hy;
        C7384Etj.A0Y(view, 0);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if ((tag instanceof C1HY) && (c1hy = (C1HY) tag) != null) {
                return c1hy;
            }
            Object objA00 = AbstractC1722ApB.A00(view);
            view = objA00 instanceof View ? (View) objA00 : null;
        }
        return null;
    }

    public static final void A01(View view, C1HY c1hy) {
        C7384Etj.A0Y(view, 0);
        view.setTag(R.id.view_tree_lifecycle_owner, c1hy);
    }
}

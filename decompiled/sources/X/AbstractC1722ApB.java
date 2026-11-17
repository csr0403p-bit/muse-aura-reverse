package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.aura.R;

/* renamed from: X.ApB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1722ApB {
    public static final ViewParent A00(View view) {
        C7384Etj.A0Y(view, 0);
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}

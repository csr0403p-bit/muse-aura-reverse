package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class FMG implements ViewGroup.OnHierarchyChangeListener {
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        C7384Etj.A0Y(view2, 1);
        if (view2 instanceof TextView) {
            C8631Fhi c8631FhiA00 = C8631Fhi.A00(5);
            C8053FRg c8053FRgA00 = AbstractC8060FRo.A00(view2);
            if (c8053FRgA00 instanceof FRc) {
                return;
            }
            AbstractC8060FRo.A06(view2, new FRc(c8053FRgA00, c8631FhiA00));
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}

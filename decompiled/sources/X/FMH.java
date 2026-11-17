package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FMH implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CharSequence A00;

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        C7384Etj.A0Y(view2, 1);
        CharSequence charSequence = this.A00;
        C8053FRg c8053FRgA00 = AbstractC8060FRo.A00(view2);
        if (c8053FRgA00 == null || (c8053FRgA00 instanceof C8049FRb)) {
            return;
        }
        AbstractC8060FRo.A06(view2, new C8049FRb(c8053FRgA00, charSequence));
    }

    public FMH(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}

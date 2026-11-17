package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.FUz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewGroupOnHierarchyChangeListenerC8129FUz implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public ViewGroupOnHierarchyChangeListenerC8129FUz(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.A00;
        coordinatorLayout.A0B(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}

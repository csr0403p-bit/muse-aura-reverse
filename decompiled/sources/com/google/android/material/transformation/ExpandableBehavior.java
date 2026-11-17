package com.google.android.material.transformation;

import X.BV4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw BV4.A0a("isExpanded");
    }

    public ExpandableBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.isLaidOut()) {
            return false;
        }
        List<View> listA0A = coordinatorLayout.A0A(view);
        int size = listA0A.size();
        for (int i2 = 0; i2 < size && !layoutDependsOn(coordinatorLayout, view, listA0A.get(i2)); i2++) {
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}

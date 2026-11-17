package com.google.android.material.transformation;

import X.AbstractC7607F5u;
import X.C3cG;
import X.C8128FUx;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
/* loaded from: classes6.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00 = AbstractC7607F5u.A0X();
    public final RectF A01 = AbstractC7607F5u.A0Y();
    public final RectF A02 = AbstractC7607F5u.A0Y();

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(C8128FUx c8128FUx) {
        if (c8128FUx.A01 == 0) {
            c8128FUx.A01 = 80;
        }
    }

    public FabTransformationBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw C3cG.A0Q("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
    }
}

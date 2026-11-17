package com.google.android.material.floatingactionbutton;

import X.BV4;
import X.C8128FUx;
import X.FVV;
import X.FX0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* loaded from: classes6.dex */
public class FloatingActionButton$BaseBehavior<T extends FVV> extends CoordinatorLayout.Behavior<T> {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        A00(coordinatorLayout, null, i);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        throw BV4.A0a("shadowPadding");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(C8128FUx c8128FUx) {
        if (c8128FUx.A01 == 0) {
            c8128FUx.A01 = 80;
        }
    }

    public FloatingActionButton$BaseBehavior() {
    }

    public void A00(CoordinatorLayout coordinatorLayout, FVV fvv, int i) {
        List<View> listA0A = coordinatorLayout.A0A(fvv);
        int size = listA0A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewGroup.LayoutParams layoutParams = listA0A.get(i2).getLayoutParams();
            if ((layoutParams instanceof C8128FUx) && (((C8128FUx) layoutParams).A0A instanceof BottomSheetBehavior)) {
                throw BV4.A0a("getLayoutParams");
            }
        }
        coordinatorLayout.A0C(fvv, i);
        throw BV4.A0a("shadowPadding");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((layoutParams instanceof C8128FUx) && (((C8128FUx) layoutParams).A0A instanceof BottomSheetBehavior)) {
            throw BV4.A0a("getLayoutParams");
        }
        return false;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FX0.A05);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}

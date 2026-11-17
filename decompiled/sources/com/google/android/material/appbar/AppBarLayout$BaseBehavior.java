package com.google.android.material.appbar;

import X.AbstractC8060FRo;
import X.BV4;
import X.C2203BAi;
import X.FVR;
import X.InterfaceC8078FSh;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class AppBarLayout$BaseBehavior<T extends FVR> extends HeaderBehavior<T> {
    public int A00;
    public WeakReference<View> A01;

    @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        A01(coordinatorLayout, null, i);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        A00(view2, coordinatorLayout, null, iArr, i, i2, i3);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if ((i & 2) != 0) {
            throw BV4.A0a("isLiftOnScroll");
        }
        this.A01 = null;
        this.A00 = i2;
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;Landroid/view/View;II[II)V */
    public void A00(View view, CoordinatorLayout coordinatorLayout, FVR fvr, int[] iArr, int i, int i2, int i3) {
        if (i2 == 0) {
            throw BV4.A0a("isLiftOnScroll");
        }
        if (i2 >= 0) {
            throw BV4.A0a("getUpNestedPreScrollRange");
        }
        throw BV4.A0a("getTotalScrollRange");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        throw BV4.A0a("getLayoutParams");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            throw BV4.A0a("getDownNestedScrollRange");
        }
        if (i4 == 0) {
            AbstractC8060FRo.A05(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) C2203BAi.A0Z.A03).getId());
            AbstractC8060FRo.A04(coordinatorLayout, 0);
            AbstractC8060FRo.A05(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) C2203BAi.A0X.A03).getId());
            AbstractC8060FRo.A04(coordinatorLayout, 0);
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if ((childAt instanceof InterfaceC8078FSh) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    if (childAt != null) {
                        throw BV4.A0a("getTotalScrollRange");
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        throw BV4.A0a("getChildCount");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.A00 == 0 || i == 1) {
            throw BV4.A0a("getChildCount");
        }
        this.A01 = BV4.A0q(view2);
    }

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;I)Z */
    public void A01(CoordinatorLayout coordinatorLayout, FVR fvr, int i) {
        super.onLayoutChild(coordinatorLayout, fvr, i);
        throw BV4.A0a("getPendingAction");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

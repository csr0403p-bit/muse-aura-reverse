package com.google.android.material.appbar;

import X.AbstractC7607F5u;
import X.BV4;
import X.FVR;
import X.FX0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: classes6.dex */
public class AppBarLayout$ScrollingViewBehavior extends HeaderScrollingViewBehavior {
    public static int getAppBarLayoutOffset(FVR fvr) {
        throw BV4.A0a("getLayoutParams");
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public float getOverlapRatioForOffset(View view) {
        return 0.0f;
    }

    public AppBarLayout$ScrollingViewBehavior() {
    }

    private void offsetChildAsNeeded(View view, View view2) {
        if (AbstractC7607F5u.A0h(view2).A0A instanceof AppBarLayout$BaseBehavior) {
            view.offsetTopAndBottom((AbstractC7607F5u.A0E(view, view2.getBottom()) + this.verticalLayoutGap) - getOverlapPixelsForOffset(view2));
        }
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public FVR findFirstDependency(List<View> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        return null;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
        return super.getLeftAndRightOffset();
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
        return super.getTopAndBottomOffset();
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
        return super.isHorizontalOffsetEnabled();
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
        return super.isVerticalOffsetEnabled();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        offsetChildAsNeeded(view, view2);
        return false;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (findFirstDependency(coordinatorLayout.A0A(view)) != null) {
            rect.offset(view.getLeft(), view.getTop());
            Rect rect2 = this.tempRect1;
            rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!rect2.contains(rect)) {
                throw BV4.A0a("setExpanded");
            }
        }
        return false;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
        return super.setLeftAndRightOffset(i);
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
        return super.setTopAndBottomOffset(i);
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
        super.setHorizontalOffsetEnabled(z);
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
        super.setVerticalOffsetEnabled(z);
    }

    private void updateLiftedStateIfNeeded(View view, View view2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FX0.A0H);
        this.overlayTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public /* bridge */ /* synthetic */ View findFirstDependency(List list) {
        return findFirstDependency((List<View>) list);
    }
}

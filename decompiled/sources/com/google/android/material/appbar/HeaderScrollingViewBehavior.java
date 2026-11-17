package com.google.android.material.appbar;

import X.AbstractC7607F5u;
import X.C8128FUx;
import X.C8496Ff3;
import X.C8497Ff4;
import X.FVR;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    public int overlayTop;
    public final Rect tempRect1;
    public final Rect tempRect2;
    public int verticalLayoutGap;

    public abstract View findFirstDependency(List<View> list);

    public abstract float getOverlapRatioForOffset(View view);

    public abstract int getScrollRange(View view);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        C8497Ff4 c8497Ff4;
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        FVR fvrFindFirstDependency = ((AppBarLayout$ScrollingViewBehavior) this).findFirstDependency(coordinatorLayout.A0A(view));
        if (fvrFindFirstDependency == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (fvrFindFirstDependency.getFitsSystemWindows() && (c8497Ff4 = coordinatorLayout.A02) != null) {
            size += AbstractC7607F5u.A0i(c8497Ff4).A03 + AbstractC7607F5u.A0i(c8497Ff4).A00;
        }
        coordinatorLayout.A0D(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + fvrFindFirstDependency.getMeasuredHeight()) - fvrFindFirstDependency.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public final int getOverlapPixelsForOffset(View view) {
        int i;
        int i2 = this.overlayTop;
        if (i2 != 0 && (i = (int) (0.0f * i2)) >= 0) {
            return i > i2 ? i2 : i;
        }
        return 0;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = AbstractC7607F5u.A0X();
        this.tempRect2 = AbstractC7607F5u.A0X();
        this.verticalLayoutGap = 0;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        int bottom;
        FVR fvrFindFirstDependency = ((AppBarLayout$ScrollingViewBehavior) this).findFirstDependency(coordinatorLayout.A0A(view));
        if (fvrFindFirstDependency != null) {
            C8128FUx c8128FUxA0h = AbstractC7607F5u.A0h(view);
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8128FUxA0h).leftMargin, fvrFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c8128FUxA0h).topMargin, AbstractC7607F5u.A0F(coordinatorLayout, coordinatorLayout.getWidth()) - ((ViewGroup.MarginLayoutParams) c8128FUxA0h).rightMargin, ((coordinatorLayout.getHeight() + fvrFindFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c8128FUxA0h).bottomMargin);
            C8497Ff4 c8497Ff4 = coordinatorLayout.A02;
            if (c8497Ff4 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                int i2 = rect.left;
                C8496Ff3 c8496Ff3 = c8497Ff4.A00;
                rect.left = i2 + c8496Ff3.A0D().A01;
                rect.right -= c8496Ff3.A0D().A02;
            }
            Rect rect2 = this.tempRect2;
            int i3 = c8128FUxA0h.A02;
            if (i3 == 0) {
                i3 = 8388659;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(fvrFindFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            bottom = rect2.top - fvrFindFirstDependency.getBottom();
        } else {
            coordinatorLayout.A0C(view, i);
            bottom = 0;
        }
        this.verticalLayoutGap = bottom;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = AbstractC7607F5u.A0X();
        this.tempRect2 = AbstractC7607F5u.A0X();
        this.verticalLayoutGap = 0;
    }
}

package com.google.android.material.appbar;

import X.FVP;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public FVP viewOffsetHelper;
    public int tempTopBottomOffset = 0;
    public int tempLeftRightOffset = 0;

    public int getLeftAndRightOffset() {
        FVP fvp = this.viewOffsetHelper;
        if (fvp != null) {
            return fvp.A02;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        FVP fvp = this.viewOffsetHelper;
        if (fvp != null) {
            return fvp.A03;
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        FVP fvp = this.viewOffsetHelper;
        return fvp != null && fvp.A04;
    }

    public boolean isVerticalOffsetEnabled() {
        FVP fvp = this.viewOffsetHelper;
        return fvp != null && fvp.A05;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        FVP fvp = this.viewOffsetHelper;
        if (fvp != null) {
            fvp.A04 = z;
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        FVP fvp = this.viewOffsetHelper;
        if (fvp == null) {
            this.tempLeftRightOffset = i;
            return false;
        }
        if (!fvp.A04 || fvp.A02 == i) {
            return false;
        }
        fvp.A02 = i;
        fvp.A00();
        return true;
    }

    public boolean setTopAndBottomOffset(int i) {
        FVP fvp = this.viewOffsetHelper;
        if (fvp == null) {
            this.tempTopBottomOffset = i;
            return false;
        }
        if (!fvp.A05 || fvp.A03 == i) {
            return false;
        }
        fvp.A03 = i;
        fvp.A00();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        FVP fvp = this.viewOffsetHelper;
        if (fvp != null) {
            fvp.A05 = z;
        }
    }

    public ViewOffsetBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        FVP fvp = this.viewOffsetHelper;
        if (fvp == null) {
            fvp = new FVP(v);
            this.viewOffsetHelper = fvp;
        }
        View view = fvp.A06;
        fvp.A01 = view.getTop();
        fvp.A00 = view.getLeft();
        this.viewOffsetHelper.A00();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            FVP fvp2 = this.viewOffsetHelper;
            if (fvp2.A05 && fvp2.A03 != i2) {
                fvp2.A03 = i2;
                fvp2.A00();
            }
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 == 0) {
            return true;
        }
        FVP fvp3 = this.viewOffsetHelper;
        if (fvp3.A04 && fvp3.A02 != i3) {
            fvp3.A02 = i3;
            fvp3.A00();
        }
        this.tempLeftRightOffset = 0;
        return true;
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.A0C(v, i);
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
    }
}

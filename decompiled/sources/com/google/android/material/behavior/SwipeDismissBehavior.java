package com.google.android.material.behavior;

import X.AbstractC8060FRo;
import X.C2203BAi;
import X.FUL;
import X.FUN;
import X.FVX;
import X.FVZ;
import X.FVc;
import X.FW2;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* loaded from: classes6.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public FUL A03;
    public FVc A04;
    public boolean A05;
    public int A02 = 2;
    public float A01 = 0.0f;
    public float A00 = 0.5f;
    public final FUN A06 = new FVZ(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            AbstractC8060FRo.A05(v, 1048576);
            AbstractC8060FRo.A04(v, 0);
            if (!(this instanceof BaseTransientBottomBar$Behavior) || (v instanceof FW2)) {
                C2203BAi c2203BAi = C2203BAi.A0D;
                AbstractC8060FRo.A09(v, new C2203BAi(new FVX(this), null, c2203BAi.A02, null, c2203BAi.A00));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zA0E = this.A05;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zA0E = coordinatorLayout.A0E(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A05 = zA0E;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
        }
        if (!zA0E) {
            return false;
        }
        FUL ful = this.A03;
        if (ful == null) {
            ful = new FUL(coordinatorLayout.getContext(), coordinatorLayout, this.A06);
            this.A03 = ful;
        }
        return ful.A0F(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        FUL ful = this.A03;
        if (ful == null) {
            return false;
        }
        ful.A0B(motionEvent);
        return true;
    }
}

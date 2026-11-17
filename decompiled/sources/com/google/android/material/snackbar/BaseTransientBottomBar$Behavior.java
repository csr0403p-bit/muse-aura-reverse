package com.google.android.material.snackbar;

import X.FVd;
import X.FW5;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes6.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final FVd A00;

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        FVd fVd = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                FW5.A00().A06(fVd.A00);
            }
        } else if (coordinatorLayout.A0E(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            FW5.A00().A05(fVd.A00);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public BaseTransientBottomBar$Behavior() {
        FVd fVd = new FVd();
        this.A01 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        super.A00 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.A02 = 0;
        this.A00 = fVd;
    }
}

package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;

/* loaded from: classes6.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public VelocityTracker A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.A03
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.A03 = r0
        L12:
            int r1 = r9.getActionMasked()
            r0 = 2
            r4 = 1
            r5 = -1
            r2 = 0
            if (r1 != r0) goto L3c
            boolean r0 = r6.A04
            if (r0 == 0) goto L3c
            int r0 = r6.A01
            if (r0 == r5) goto L8c
            int r0 = r9.findPointerIndex(r0)
            if (r0 == r5) goto L8c
            float r0 = r9.getY(r0)
            int r3 = (int) r0
            int r0 = r6.A02
            int r1 = X.AbstractC7607F5u.A0B(r3, r0)
            int r0 = r6.A03
            if (r1 <= r0) goto L3c
            r6.A02 = r3
            return r4
        L3c:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L85
            r6.A01 = r5
            float r0 = r9.getX()
            int r4 = (int) r0
            float r0 = r9.getY()
            int r3 = (int) r0
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout$BaseBehavior) r0
            java.lang.ref.WeakReference<android.view.View> r0 = r0.A01
            if (r0 == 0) goto L67
            android.view.View r1 = X.AbstractC7607F5u.A0c(r0)
            if (r1 == 0) goto L6e
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L6e
            boolean r0 = r1.canScrollVertically(r5)
            if (r0 != 0) goto L6e
        L67:
            boolean r1 = r7.A0E(r8, r4, r3)
            r0 = 1
            if (r1 != 0) goto L6f
        L6e:
            r0 = 0
        L6f:
            r6.A04 = r0
            if (r0 == 0) goto L85
            r6.A02 = r3
            int r0 = r9.getPointerId(r2)
            r6.A01 = r0
            android.view.VelocityTracker r0 = r6.A00
            if (r0 != 0) goto L85
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.A00 = r0
        L85:
            android.view.VelocityTracker r0 = r6.A00
            if (r0 == 0) goto L8c
            r0.addMovement(r9)
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior() {
        this.A01 = -1;
        this.A03 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r6, V r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            int r4 = r8.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r4 == r3) goto L36
            r0 = 2
            if (r4 == r0) goto L61
            r0 = 3
            if (r4 == r0) goto L52
            r0 = 6
            if (r4 != r0) goto L2a
            int r0 = r8.getActionIndex()
            boolean r1 = X.AnonymousClass002.A1M(r0)
            int r0 = r8.getPointerId(r1)
            r5.A01 = r0
            float r1 = r8.getY(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r5.A02 = r0
        L2a:
            android.view.VelocityTracker r0 = r5.A00
            if (r0 == 0) goto L31
            r0.addMovement(r8)
        L31:
            boolean r0 = r5.A04
            if (r0 == 0) goto L77
            return r3
        L36:
            android.view.VelocityTracker r0 = r5.A00
            if (r0 == 0) goto L52
            r0.addMovement(r8)
            android.view.VelocityTracker r1 = r5.A00
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            android.view.VelocityTracker r1 = r5.A00
            int r0 = r5.A01
            r1.getYVelocity(r0)
            java.lang.String r0 = "getTotalScrollRange"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L52:
            r5.A04 = r2
            r5.A01 = r1
            android.view.VelocityTracker r0 = r5.A00
            if (r0 == 0) goto L2a
            r0.recycle()
            r0 = 0
            r5.A00 = r0
            goto L2a
        L61:
            int r0 = r5.A01
            int r0 = r8.findPointerIndex(r0)
            if (r0 == r1) goto L77
            float r0 = r8.getY(r0)
            int r0 = (int) r0
            r5.A02 = r0
            java.lang.String r0 = "getDownNestedScrollRange"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = -1;
        this.A03 = -1;
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* renamed from: X.AnA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1635AnA extends ViewGroup {
    public final HashMap<C1634An9, C1453AjM> A00;
    public final HashMap<C1453AjM, C1634An9> A01;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<C1634An9, C1453AjM> getHolderToLayoutNode() {
        return this.A00;
    }

    public final HashMap<C1453AjM, C1634An9> getLayoutNodeToHolder() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (C1634An9 c1634An9 : this.A00.keySet()) {
            c1634An9.layout(c1634An9.getLeft(), c1634An9.getTop(), c1634An9.getRight(), c1634An9.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public C1635AnA(Context context) {
        super(context);
        setClipChildren(false);
        this.A00 = new HashMap<>();
        this.A01 = new HashMap<>();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        int i3;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            str = "widthMeasureSpec should be EXACTLY";
        } else {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                for (C1634An9 c1634An9 : this.A00.keySet()) {
                    int i4 = c1634An9.A01;
                    if (i4 != Integer.MIN_VALUE && (i3 = c1634An9.A00) != Integer.MIN_VALUE) {
                        c1634An9.measure(i4, i3);
                    }
                }
                return;
            }
            str = "heightMeasureSpec should be EXACTLY";
        }
        throw C60O.A0i(str);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1453AjM c1453AjM = this.A00.get(childAt);
            if (childAt.isLayoutRequested() && c1453AjM != null) {
                C1453AjM.A0B(c1453AjM, false, true, true);
            }
        }
    }
}

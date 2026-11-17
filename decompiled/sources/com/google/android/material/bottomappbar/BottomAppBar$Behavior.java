package com.google.android.material.bottomappbar;

import X.AbstractC7607F5u;
import X.BV4;
import X.I0V;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public WeakReference A00;
    public final Rect A01;
    public final View.OnLayoutChangeListener A02;

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A00 = BV4.A0q(null);
        throw BV4.A0a("findDependentView");
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        throw BV4.A0a("getHideOnScroll");
    }

    public BottomAppBar$Behavior() {
        this.A02 = new I0V(this, 3);
        this.A01 = AbstractC7607F5u.A0X();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new I0V(this, 3);
        this.A01 = AbstractC7607F5u.A0X();
    }
}

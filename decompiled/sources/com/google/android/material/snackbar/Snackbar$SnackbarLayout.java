package com.google.android.material.snackbar;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.FW2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes6.dex */
public final class Snackbar$SnackbarLayout extends FW2 {
    public Snackbar$SnackbarLayout(Context context) {
        super(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int iA0I = AbstractC7610F5x.A0I(this, getMeasuredWidth());
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                AbstractC7608F5v.A1E(childAt, childAt.getMeasuredHeight(), 1073741824, View.MeasureSpec.makeMeasureSpec(iA0I, 1073741824));
            }
        }
    }

    @Override // X.FW2, android.view.View
    public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // X.FW2, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // X.FW2, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
    }

    @Override // X.FW2, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
        super.setBackgroundTintMode(mode);
    }

    @Override // X.FW2, android.view.View
    public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

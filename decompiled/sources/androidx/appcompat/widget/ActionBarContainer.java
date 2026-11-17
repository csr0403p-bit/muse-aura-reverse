package androidx.appcompat.widget;

import X.AbstractC8127FUv;
import X.AnonymousClass002;
import X.BV4;
import X.C8126FUu;
import X.FYT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public View A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public View A07;
    public View A08;
    public boolean A09;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public View getTabContainer() {
        return this.A03;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A09 || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.A07
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r3) goto L1c
            int r1 = r6.A06
            if (r1 < 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = java.lang.Math.min(r1, r0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r0 = r6.A07
            if (r0 == 0) goto L74
            int r5 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.A03
            if (r0 == 0) goto L74
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L74
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == r0) goto L74
            int r4 = X.AbstractC7609F5w.A0B(r6)
            android.view.View r2 = r6.A07
            if (r2 == 0) goto L79
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L79
            int r0 = r2.getMeasuredHeight()
            if (r0 == 0) goto L79
            android.view.View r1 = r6.A07
        L4f:
            android.view.ViewGroup$MarginLayoutParams r0 = X.AbstractC7607F5u.A0e(r1)
            int r0 = X.AbstractC7610F5x.A0J(r1, r0)
        L57:
            if (r5 != r3) goto L75
            int r3 = android.view.View.MeasureSpec.getSize(r8)
        L5d:
            int r2 = r6.getMeasuredWidth()
            int r4 = r4 + r0
            android.view.View r1 = r6.A03
            android.view.ViewGroup$MarginLayoutParams r0 = X.AbstractC7607F5u.A0e(r1)
            int r0 = X.AbstractC7610F5x.A0J(r1, r0)
            int r4 = r4 + r0
            int r0 = java.lang.Math.min(r4, r3)
            r6.setMeasuredDimension(r2, r0)
        L74:
            return
        L75:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L5d
        L79:
            android.view.View r2 = r6.A08
            if (r2 == 0) goto L8e
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L8e
            int r0 = r2.getMeasuredHeight()
            if (r0 == 0) goto L8e
            android.view.View r1 = r6.A08
            goto L4f
        L8e:
            r0 = 0
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A00;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.A00);
        }
        this.A00 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A07 != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.A04) {
            if (this.A00 == null) {
                drawable2 = this.A02;
            }
            setWillNotDraw(z);
            invalidate();
            invalidateOutline();
        }
        drawable2 = this.A01;
        if (drawable2 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4 = this.A01;
        if (drawable4 != null) {
            drawable4.setCallback(null);
            unscheduleDrawable(this.A01);
        }
        this.A01 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A04 && (drawable3 = this.A01) != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.A04) {
            if (this.A00 == null) {
                drawable2 = this.A02;
            }
            setWillNotDraw(z);
            invalidate();
            invalidateOutline();
        }
        drawable2 = this.A01;
        if (drawable2 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4 = this.A02;
        if (drawable4 != null) {
            drawable4.setCallback(null);
            unscheduleDrawable(this.A02);
        }
        this.A02 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A05 && (drawable3 = this.A02) != null) {
                drawable3.setBounds(this.A03.getLeft(), this.A03.getTop(), this.A03.getRight(), this.A03.getBottom());
            }
        }
        if (!this.A04) {
            if (this.A00 == null) {
                drawable2 = this.A02;
            }
            setWillNotDraw(z);
            invalidate();
            invalidateOutline();
        }
        drawable2 = this.A01;
        boolean z = drawable2 == null;
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC8127FUv abstractC8127FUv) {
        View view = this.A03;
        if (view != null) {
            removeView(view);
        }
        this.A03 = abstractC8127FUv;
        if (abstractC8127FUv != null) {
            addView(abstractC8127FUv);
            throw BV4.A0a("getLayoutParams");
        }
    }

    public void setTransitioning(boolean z) {
        this.A09 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.A00 && !this.A04) || (drawable == this.A02 && this.A05) || ((drawable == this.A01 && this.A04) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful()) {
            this.A00.setState(getDrawableState());
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null && drawable2.isStateful()) {
            this.A02.setState(getDrawableState());
        }
        Drawable drawable3 = this.A01;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.A01.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.A07 = findViewById(R.id.action_bar);
        this.A08 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[PHI: r4
  0x0014: PHI (r4v3 boolean) = (r4v0 boolean), (r4v4 boolean) binds: [B:7:0x0012, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            android.view.View r5 = r7.A03
            r1 = 8
            r3 = 0
            if (r5 == 0) goto L11
            int r0 = r5.getVisibility()
            r4 = 1
            if (r0 != r1) goto L14
        L11:
            r4 = 0
            if (r5 == 0) goto L2f
        L14:
            int r0 = r5.getVisibility()
            if (r0 == r1) goto L2f
            int r6 = r7.getMeasuredHeight()
            android.view.ViewGroup$MarginLayoutParams r2 = X.AbstractC7607F5u.A0e(r5)
            int r0 = r5.getMeasuredHeight()
            int r1 = r6 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r6 = r6 - r0
            r5.layout(r9, r1, r11, r6)
        L2f:
            boolean r0 = r7.A04
            if (r0 == 0) goto L46
            android.graphics.drawable.Drawable r2 = r7.A01
            if (r2 == 0) goto L45
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L42:
            r7.invalidate()
        L45:
            return
        L46:
            android.graphics.drawable.Drawable r0 = r7.A00
            if (r0 == 0) goto L6a
            android.view.View r0 = r7.A07
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L5c
            android.view.View r0 = r7.A08
            if (r0 == 0) goto L86
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L86
        L5c:
            android.graphics.drawable.Drawable r2 = r7.A00
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L69:
            r3 = 1
        L6a:
            r7.A05 = r4
            if (r4 == 0) goto L8c
            android.graphics.drawable.Drawable r4 = r7.A02
            if (r4 == 0) goto L8c
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L42
        L86:
            android.graphics.drawable.Drawable r0 = r7.A00
            r0.setBounds(r3, r3, r3, r3)
            goto L69
        L8c:
            if (r3 == 0) goto L45
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean zA1M = AnonymousClass002.A1M(i);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setVisible(zA1M, false);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setVisible(zA1M, false);
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.setVisible(zA1M, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(context, attributeSet);
        setBackground(new C8126FUu(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FYT.A00);
        this.A00 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.A02 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.A06 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.A04 = true;
            this.A01 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (this.A04) {
            drawable = this.A01;
        } else {
            drawable = this.A00 == null ? this.A02 : drawable;
            setWillNotDraw(z);
        }
        boolean z = drawable == null;
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}

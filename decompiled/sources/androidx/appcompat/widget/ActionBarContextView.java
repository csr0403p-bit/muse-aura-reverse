package androidx.appcompat.widget;

import X.AbstractC10491Hlv;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC8060FRo;
import X.AbstractC8231Fa7;
import X.BV5;
import X.C3cI;
import X.C8093FSz;
import X.C8140FWd;
import X.C8240FaG;
import X.C8243FaJ;
import X.C8249FaR;
import X.C8292FbH;
import X.FYT;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class ActionBarContextView extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public C8243FaJ A05;
    public C8093FSz A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public View A0H;
    public View A0I;
    public LinearLayout A0J;
    public TextView A0K;
    public TextView A0L;
    public boolean A0M;
    public boolean A0N;
    public ActionMenuView A0O;
    public final Context A0P;
    public final C8292FbH A0Q;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    private void A01() {
        if (this.A0J == null) {
            Context context = getContext();
            LayoutInflater.from(context).inflate(R.layout._name_removed__res_0x7f0d0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A0J = linearLayout;
            this.A0L = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A0K = (TextView) this.A0J.findViewById(R.id.action_bar_subtitle);
            int i = this.A0G;
            if (i != 0) {
                this.A0L.setTextAppearance(context, i);
            }
            int i2 = this.A0F;
            if (i2 != 0) {
                this.A0K.setTextAppearance(context, i2);
            }
        }
        this.A0L.setText(this.A08);
        this.A0K.setText(this.A07);
        boolean zIsEmpty = TextUtils.isEmpty(this.A08);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.A07);
        int i3 = 0;
        this.A0K.setVisibility(zIsEmpty2 ? 8 : 0);
        LinearLayout linearLayout2 = this.A0J;
        if (zIsEmpty && zIsEmpty2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.A0J.getParent() == null) {
            addView(this.A0J);
        }
    }

    public static void A02(ActionBarContextView actionBarContextView) {
        super.setPadding(actionBarContextView.A01 + actionBarContextView.A0C, actionBarContextView.A03 + actionBarContextView.A0E, actionBarContextView.A02 + actionBarContextView.A0D, actionBarContextView.A0B);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.AbstractC8280Fb4 r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.A04
            if (r0 != 0) goto L91
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            int r1 = r6.A0A
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r6, r0)
            r6.A04 = r0
        L15:
            r6.addView(r0)
        L18:
            android.view.View r1 = r6.A04
            r0 = 2131361855(0x7f0a003f, float:1.8343474E38)
            android.view.View r1 = r1.findViewById(r0)
            r6.A0H = r1
            r5 = 0
            X.I0Y r0 = new X.I0Y
            r0.<init>(r5, r6, r7)
            r1.setOnClickListener(r0)
            boolean r0 = r7 instanceof X.C8261Faj
            if (r0 == 0) goto L8c
            X.Faj r7 = (X.C8261Faj) r7
            X.FaR r2 = r7.A02
        L34:
            X.FaJ r0 = r6.A05
            if (r0 == 0) goto L3b
            r0.A01()
        L3b:
            android.content.Context r0 = r6.getContext()
            X.FaJ r1 = new X.FaJ
            r1.<init>(r0)
            r6.A05 = r1
            r0 = 1
            r1.A0G = r0
            r1.A0H = r0
            r1 = -2
            r0 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r0)
            X.FaJ r1 = r6.A05
            android.content.Context r0 = r6.A0P
            r2.A08(r0, r1)
            X.FaJ r3 = r6.A05
            X.Fc4 r2 = r3.A08
            if (r2 != 0) goto L74
            android.view.LayoutInflater r1 = r3.A05
            r0 = 2131558402(0x7f0d0002, float:1.8742119E38)
            android.view.View r1 = r1.inflate(r0, r6, r5)
            X.Fc4 r1 = (X.InterfaceC8337Fc4) r1
            r3.A08 = r1
            X.FaR r0 = r3.A06
            r1.ANe(r0)
            r3.Ahy()
        L74:
            X.Fc4 r1 = r3.A08
            if (r2 == r1) goto L7e
            r0 = r1
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r3)
        L7e:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.A0O = r1
            r0 = 0
            r1.setBackground(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r6.A0O
            r6.addView(r0, r4)
            return
        L8c:
            X.Fae r7 = (X.C8258Fae) r7
            X.FaR r2 = r7.A03
            goto L34
        L91:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L18
            android.view.View r0 = r6.A04
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A06(X.Fb4):void");
    }

    /* renamed from: getAnimatedVisibility$AbsActionBarView, reason: merged with bridge method [inline-methods] */
    public int getAnimatedVisibility() {
        return this.A06 != null ? this.A0Q.A00 : getVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return this.A00;
    }

    public int getContentHeight$AbsActionBarView() {
        return this.A00;
    }

    public CharSequence getSubtitle() {
        return this.A07;
    }

    public CharSequence getTitle() {
        return this.A08;
    }

    public void setContentHeight(int i) {
        this.A00 = i;
    }

    public void setCustomView(View view) {
        View view2 = this.A0I;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0I = view;
        if (view != null) {
            LinearLayout linearLayout = this.A0J;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A0J = null;
            }
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.A0C = i;
        this.A0E = i2;
        this.A0D = i3;
        this.A0B = i4;
        A02(this);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A07 = charSequence;
        A01();
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A01();
        AbstractC8060FRo.A0A(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A09) {
            requestLayout();
        }
        this.A09 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static final int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public final void A05() {
        removeAllViews();
        this.A0I = null;
        this.A0O = null;
        this.A05 = null;
        View view = this.A0H;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, FYT.A00, R.attr._name_removed__res_0x7f040007, 0);
        this.A00 = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        typedArrayObtainStyledAttributes.recycle();
        C8243FaJ c8243FaJ = this.A05;
        if (c8243FaJ != null) {
            c8243FaJ.A00 = AbstractC10491Hlv.A00(c8243FaJ.A01);
            C8249FaR c8249FaR = c8243FaJ.A06;
            if (c8249FaR != null) {
                c8249FaR.A0D(true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, FYT.A03, R.attr._name_removed__res_0x7f040026, 0);
        this.A00 = typedArrayObtainStyledAttributes2.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC8231Fa7 abstractC8231Fa7;
        super.onDetachedFromWindow();
        C8243FaJ c8243FaJ = this.A05;
        if (c8243FaJ != null) {
            c8243FaJ.A02();
            C8240FaG c8240FaG = this.A05.A09;
            if (c8240FaG == null || (abstractC8231Fa7 = c8240FaG.A03) == null || !abstractC8231Fa7.AP1()) {
                return;
            }
            c8240FaG.A03.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            r3 = 0
            r2 = 9
            if (r4 != r2) goto Lb
            r5.A0M = r3
        Lb:
            boolean r0 = r5.A0M
            r1 = 1
            if (r0 != 0) goto L1b
            boolean r0 = super.onHoverEvent(r6)
            if (r4 != r2) goto L1b
            if (r0 != 0) goto L1a
            r5.A0M = r1
        L1a:
            return r1
        L1b:
            r0 = 10
            if (r4 == r0) goto L22
            r0 = 3
            if (r4 != r0) goto L1a
        L22:
            r5.A0M = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean z2 = true;
        if (getLayoutDirection() == 1) {
            paddingLeft = AbstractC7607F5u.A0F(this, i3 - i);
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int iA0H = AbstractC7610F5x.A0H(this, i4 - i2);
        View view = this.A04;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(this.A04);
            if (z2) {
                int i7 = marginLayoutParamsA0e.rightMargin;
                i5 = marginLayoutParamsA0e.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = marginLayoutParamsA0e.leftMargin;
                i5 = marginLayoutParamsA0e.rightMargin;
                i6 = paddingLeft + i8;
            }
            int iA00 = i6 + A00(this.A04, i6, paddingTop, iA0H, z2);
            int i9 = iA00 + i5;
            if (z2) {
                i9 = iA00 - i5;
            }
            paddingLeft = i9;
        }
        LinearLayout linearLayout = this.A0J;
        if (linearLayout != null && this.A0I == null && linearLayout.getVisibility() != 8) {
            paddingLeft += A00(this.A0J, paddingLeft, paddingTop, iA0H, z2);
        }
        View view2 = this.A0I;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, iA0H, z2);
        }
        int paddingLeft2 = z2 ? getPaddingLeft() : AbstractC7607F5u.A0F(this, i3 - i);
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView != null) {
            A00(actionMenuView, paddingLeft2, paddingTop, iA0H, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw BV5.A0U(C3cI.A0Y(this), " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw BV5.A0U(C3cI.A0Y(this), " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int iA0I = AbstractC7610F5x.A0I(this, size);
        int iA0B = AbstractC7609F5w.A0B(this);
        int i4 = this.A00;
        int size2 = i4 > 0 ? i4 + this.A03 : View.MeasureSpec.getSize(i2);
        int iMin = size2 - iA0B;
        int i5 = Integer.MIN_VALUE;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.A04;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(iA0I, Integer.MIN_VALUE), iMakeMeasureSpec);
            int iA0D = AbstractC7607F5u.A0D(iA0I, view.getMeasuredWidth(), 0);
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(this.A04);
            iA0I = iA0D - (marginLayoutParamsA0e.leftMargin + marginLayoutParamsA0e.rightMargin);
        }
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            ActionMenuView actionMenuView2 = this.A0O;
            actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(iA0I, Integer.MIN_VALUE), iMakeMeasureSpec);
            iA0I = AbstractC7607F5u.A0D(iA0I, actionMenuView2.getMeasuredWidth(), 0);
        }
        LinearLayout linearLayout = this.A0J;
        if (linearLayout != null && this.A0I == null) {
            if (this.A09) {
                this.A0J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.A0J.getMeasuredWidth();
                boolean z = false;
                if (measuredWidth <= iA0I) {
                    z = true;
                    iA0I -= measuredWidth;
                }
                this.A0J.setVisibility(z ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(iA0I, Integer.MIN_VALUE), iMakeMeasureSpec);
                iA0I = AbstractC7607F5u.A0D(iA0I, linearLayout.getMeasuredWidth(), 0);
            }
        }
        View view2 = this.A0I;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            if (i6 != -2) {
                i5 = 1073741824;
                if (i6 >= 0) {
                    iA0I = Math.min(i6, iA0I);
                }
            }
            int i7 = layoutParams.height;
            if (i7 == -2) {
                i3 = Integer.MIN_VALUE;
            } else if (i7 >= 0) {
                iMin = Math.min(i7, iMin);
            }
            AbstractC7608F5v.A1E(this.A0I, iMin, i3, View.MeasureSpec.makeMeasureSpec(iA0I, i5));
        }
        if (this.A00 <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                int measuredHeight = getChildAt(i8).getMeasuredHeight() + iA0B;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            r2 = 0
            if (r3 != 0) goto L9
            r4.A0N = r2
        L9:
            boolean r0 = r4.A0N
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = super.onTouchEvent(r5)
            if (r3 != 0) goto L19
            if (r0 != 0) goto L18
            r4.A0N = r1
        L18:
            return r1
        L19:
            if (r3 == r1) goto L1e
            r0 = 3
            if (r3 != r0) goto L18
        L1e:
            r4.A0N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.A0C = i;
            this.A0D = i3;
        } else {
            this.A0C = i3;
            this.A0D = i;
        }
        this.A0E = i2;
        this.A0B = i4;
        A02(this);
    }

    @Override // android.view.View
    /* renamed from: setVisibility$AbsActionBarView, reason: merged with bridge method [inline-methods] */
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C8093FSz c8093FSz = this.A06;
            if (c8093FSz != null) {
                c8093FSz.A01();
            }
            super.setVisibility(i);
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.A0Q = new C8292FbH(this);
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        if (context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f040004, typedValueA0Z, true) && (i2 = typedValueA0Z.resourceId) != 0) {
            this.A0P = new ContextThemeWrapper(context, i2);
        } else {
            this.A0P = context;
        }
        C8140FWd c8140FWdA00 = C8140FWd.A00(context, attributeSet, FYT.A03, i, 0);
        setBackground(c8140FWdA00.A02(0));
        TypedArray typedArray = c8140FWdA00.A02;
        this.A0G = typedArray.getResourceId(5, 0);
        this.A0F = typedArray.getResourceId(4, 0);
        this.A00 = typedArray.getLayoutDimension(3, 0);
        this.A0A = typedArray.getResourceId(2, R.layout._name_removed__res_0x7f0d0004);
        typedArray.recycle();
        this.A0C = getPaddingLeft();
        this.A0E = getPaddingTop();
        this.A0D = getPaddingRight();
        this.A0B = getPaddingBottom();
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._name_removed__res_0x7f040026);
    }
}

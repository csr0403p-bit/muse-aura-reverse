package androidx.appcompat.widget;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.BV7;
import X.C60Q;
import X.C8243FaJ;
import X.C8249FaR;
import X.C8252FaX;
import X.C8274Fay;
import X.C8315Fbh;
import X.C8338Fc5;
import X.FY0;
import X.InterfaceC8322Fbo;
import X.InterfaceC8331Fby;
import X.InterfaceC8335Fc2;
import X.InterfaceC8336Fc3;
import X.InterfaceC8337Fc4;
import X.InterfaceC8357FcV;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

/* loaded from: classes6.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC8336Fc3, InterfaceC8337Fc4 {
    public int A00;
    public int A01;
    public InterfaceC8322Fbo A02;
    public C8249FaR A03;
    public C8243FaJ A04;
    public InterfaceC8357FcV A05;
    public boolean A06;
    public int A07;
    public int A08;
    public Context A09;
    public InterfaceC8331Fby A0A;
    public boolean A0B;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    private final boolean A00(int i) {
        boolean zAR4 = false;
        if (i != 0) {
            KeyEvent.Callback childAt = getChildAt(i - 1);
            KeyEvent.Callback childAt2 = getChildAt(i);
            if (i < getChildCount() && (childAt instanceof InterfaceC8335Fc2)) {
                zAR4 = ((InterfaceC8335Fc2) childAt).AR4();
            }
            if (i > 0 && (childAt2 instanceof InterfaceC8335Fc2)) {
                return ((InterfaceC8335Fc2) childAt2).AR5() | zAR4;
            }
        }
        return zAR4;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C8315Fbh c8315Fbh = new C8315Fbh(-2, -2);
        c8315Fbh.A04 = false;
        ((LinearLayout.LayoutParams) c8315Fbh).gravity = 16;
        return c8315Fbh;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final C8315Fbh generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C8315Fbh c8315Fbh;
        if (layoutParams != null) {
            if (layoutParams instanceof C8315Fbh) {
                C8315Fbh c8315Fbh2 = (C8315Fbh) layoutParams;
                c8315Fbh = new C8315Fbh(c8315Fbh2);
                c8315Fbh.A04 = c8315Fbh2.A04;
            } else {
                c8315Fbh = new C8315Fbh(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c8315Fbh).gravity <= 0) {
            }
            return c8315Fbh;
        }
        c8315Fbh = new C8315Fbh(-2, -2);
        c8315Fbh.A04 = false;
        ((LinearLayout.LayoutParams) c8315Fbh).gravity = 16;
        return c8315Fbh;
    }

    @Override // X.InterfaceC8337Fc4
    public final void ANe(C8249FaR c8249FaR) {
        this.A03 = c8249FaR;
    }

    @Override // X.InterfaceC8336Fc3
    public final boolean AO1(C8252FaX c8252FaX) {
        return this.A03.A0I(c8252FaX, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8315Fbh;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        C8249FaR c8249FaR = this.A03;
        if (c8249FaR != null) {
            return c8249FaR;
        }
        Context context = getContext();
        C8249FaR c8249FaR2 = new C8249FaR(context);
        this.A03 = c8249FaR2;
        c8249FaR2.A03 = new C8274Fay(this);
        C8243FaJ c8243FaJ = new C8243FaJ(context);
        this.A04 = c8243FaJ;
        c8243FaJ.A0G = true;
        c8243FaJ.A0H = true;
        InterfaceC8331Fby c8338Fc5 = this.A0A;
        if (c8338Fc5 == null) {
            c8338Fc5 = new C8338Fc5();
        }
        c8243FaJ.A07 = c8338Fc5;
        this.A03.A08(this.A09, c8243FaJ);
        C8243FaJ c8243FaJ2 = this.A04;
        c8243FaJ2.A08 = this;
        C8249FaR c8249FaR3 = c8243FaJ2.A06;
        this.A03 = c8249FaR3;
        return c8249FaR3;
    }

    public int getPopupTheme() {
        return this.A08;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iA0F;
        int paddingLeft;
        if (!this.A0B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int i6 = super.A05;
        int i7 = i3 - i;
        int iA0F2 = AbstractC7607F5u.A0F(this, i7) - getPaddingLeft();
        boolean zA1Q = BV7.A1Q(getLayoutDirection());
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C8315Fbh c8315Fbh = (C8315Fbh) childAt.getLayoutParams();
                if (c8315Fbh.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A00(i10)) {
                        measuredWidth += i6;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA1Q) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8315Fbh).leftMargin;
                        iA0F = paddingLeft + measuredWidth;
                    } else {
                        iA0F = AbstractC7607F5u.A0F(this, getWidth()) - ((ViewGroup.MarginLayoutParams) c8315Fbh).rightMargin;
                        paddingLeft = iA0F - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, iA0F, measuredHeight + i11);
                    iA0F2 -= measuredWidth;
                    i8 = 1;
                } else {
                    iA0F2 -= AbstractC7608F5v.A0A(c8315Fbh, childAt.getMeasuredWidth());
                    A00(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? iA0F2 / i14 : 0);
        if (zA1Q) {
            int iA0F3 = AbstractC7607F5u.A0F(this, getWidth());
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C8315Fbh c8315Fbh2 = (C8315Fbh) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c8315Fbh2.A04) {
                    int i16 = iA0F3 - ((ViewGroup.MarginLayoutParams) c8315Fbh2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    iA0F3 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c8315Fbh2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C8315Fbh c8315Fbh3 = (C8315Fbh) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c8315Fbh3.A04) {
                int i19 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c8315Fbh3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c8315Fbh3).rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A04.A0E = z;
    }

    public void setMenuCallbacks(InterfaceC8331Fby interfaceC8331Fby, InterfaceC8322Fbo interfaceC8322Fbo) {
        this.A0A = interfaceC8331Fby;
        this.A02 = interfaceC8322Fbo;
    }

    public void setOnMenuItemClickListener(InterfaceC8357FcV interfaceC8357FcV) {
        this.A05 = interfaceC8357FcV;
    }

    public void setOverflowReserved(boolean z) {
        this.A06 = z;
    }

    public void setPopupTheme(int i) {
        if (this.A08 != i) {
            this.A08 = i;
            this.A09 = i == 0 ? getContext() : new ContextThemeWrapper(getContext(), i);
        }
    }

    public void setPresenter(C8243FaJ c8243FaJ) {
        this.A04 = c8243FaJ;
        c8243FaJ.A08 = this;
        this.A03 = c8243FaJ.A06;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8315Fbh(getContext(), attributeSet);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C8243FaJ c8243FaJ = this.A04;
        FY0 fy0 = c8243FaJ.A0C;
        if (fy0 != null) {
            return fy0.getDrawable();
        }
        if (c8243FaJ.A0F) {
            return c8243FaJ.A03;
        }
        return null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C8243FaJ c8243FaJ = this.A04;
        if (c8243FaJ != null) {
            c8243FaJ.Ahy();
            if (this.A04.A03()) {
                this.A04.A02();
                this.A04.A04();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C8243FaJ c8243FaJ = this.A04;
        if (c8243FaJ != null) {
            c8243FaJ.A01();
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C8243FaJ c8243FaJ = this.A04;
        FY0 fy0 = c8243FaJ.A0C;
        if (fy0 != null) {
            fy0.setImageDrawable(drawable);
        } else {
            c8243FaJ.A0F = true;
            c8243FaJ.A03 = drawable;
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.A0B = false;
        float f = C60Q.A0B(context).density;
        this.A01 = (int) (56.0f * f);
        this.A00 = (int) (f * 4.0f);
        this.A09 = context;
        this.A08 = 0;
    }
}

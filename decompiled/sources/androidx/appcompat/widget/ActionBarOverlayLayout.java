package androidx.appcompat.widget;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC8060FRo;
import X.AnonymousClass002;
import X.BV5;
import X.C3cI;
import X.C8243FaJ;
import X.C8249FaR;
import X.C8251FaW;
import X.C8254Faa;
import X.C8264Fam;
import X.C8342FcF;
import X.C8343FcG;
import X.C8345FcJ;
import X.C8497Ff4;
import X.C8498Ff5;
import X.FU2;
import X.FU9;
import X.FWf;
import X.Hqj;
import X.I05;
import X.InterfaceC8305FbX;
import X.InterfaceC8331Fby;
import X.InterfaceC8333Fc0;
import X.InterfaceC8355FcT;
import X.RunnableC8281Fb5;
import X.RunnableC8282Fb6;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC8305FbX, FU2, FU9 {
    public static final Rect A0V;
    public static final C8497Ff4 A0W;
    public static final int[] A0X = {R.attr._name_removed__res_0x7f040005, android.R.attr.windowContentOverlay};
    public ViewPropertyAnimator A00;
    public OverScroller A01;
    public ActionBarContainer A02;
    public InterfaceC8333Fc0 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public InterfaceC8355FcT A0C;
    public ContentFrameLayout A0D;
    public C8497Ff4 A0E;
    public C8497Ff4 A0F;
    public C8497Ff4 A0G;
    public C8497Ff4 A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AnimatorListenerAdapter A0L;
    public final Rect A0M;
    public final C8343FcG A0N;
    public final Runnable A0O;
    public final Runnable A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final Rect A0S;
    public final Rect A0T;
    public final Hqj A0U;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // X.FU9
    public final void AUG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        AUF(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8342FcF(-1, -1);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        int iMax;
        int i3;
        int iMax2;
        C8497Ff4 c8497Ff4A00;
        int iMax3;
        A01(this);
        measureChildWithMargins(this.A02, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(this.A02);
        int iMax4 = Math.max(0, AbstractC7608F5v.A0A(marginLayoutParamsA0e, this.A02.getMeasuredWidth()));
        int iMax5 = Math.max(0, AbstractC7610F5x.A0J(this.A02, marginLayoutParamsA0e));
        int iA09 = AbstractC7608F5v.A09(this.A02, 0);
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
            measuredHeight = this.A07;
            if (this.A0I) {
                measuredHeight += this.A0T.top;
            }
            if (this.A05 && this.A02.A03 != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            z = false;
            measuredHeight = this.A02.getVisibility() != 8 ? this.A02.getMeasuredHeight() : 0;
        }
        Rect rect = this.A0R;
        rect.set(this.A0Q);
        C8497Ff4 c8497Ff4 = this.A0E;
        this.A0F = c8497Ff4;
        if (this.A06 || z || !this.A0J) {
            boolean z2 = this.A0I;
            int i4 = AbstractC7607F5u.A0i(c8497Ff4).A01;
            C8345FcJ c8345FcJA0i = AbstractC7607F5u.A0i(this.A0F);
            if (z2) {
                iMax = Math.max(c8345FcJA0i.A03, measuredHeight);
                i3 = AbstractC7607F5u.A0i(this.A0F).A02;
                iMax2 = Math.max(AbstractC7607F5u.A0i(this.A0F).A00, 0);
            } else {
                iMax = c8345FcJA0i.A03 + measuredHeight;
                i3 = AbstractC7607F5u.A0i(this.A0F).A02;
                iMax2 = AbstractC7607F5u.A0i(this.A0F).A00;
            }
            C8345FcJ c8345FcJA00 = C8345FcJ.A00(i4, iMax, i3, iMax2);
            C8498Ff5 c8498Ff5 = new C8498Ff5(this.A0F);
            c8498Ff5.A01(c8345FcJA00);
            c8497Ff4A00 = c8498Ff5.A00();
        } else {
            boolean z3 = this.A0I;
            int i5 = rect.top;
            if (z3) {
                rect.top = Math.max(i5, measuredHeight);
                iMax3 = Math.max(rect.bottom, 0);
            } else {
                rect.top = i5 + measuredHeight;
                iMax3 = rect.bottom;
            }
            rect.bottom = iMax3;
            c8497Ff4A00 = c8497Ff4.A00.A0A(0, measuredHeight, 0, 0);
        }
        this.A0F = c8497Ff4A00;
        A02(this.A0D, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.A0H.equals(this.A0F)) {
            C8497Ff4 c8497Ff42 = this.A0F;
            this.A0H = c8497Ff42;
            AbstractC8060FRo.A08(this.A0D, c8497Ff42);
        }
        measureChildWithMargins(this.A0D, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e2 = AbstractC7607F5u.A0e(this.A0D);
        int iMax6 = Math.max(iMax4, AbstractC7608F5v.A0A(marginLayoutParamsA0e2, this.A0D.getMeasuredWidth()));
        int iMax7 = Math.max(iMax5, AbstractC7610F5x.A0J(this.A0D, marginLayoutParamsA0e2));
        int iA092 = AbstractC7608F5v.A09(this.A0D, iA09);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + AbstractC7609F5w.A09(this), getSuggestedMinimumWidth()), i, iA092), View.resolveSizeAndState(Math.max(iMax7 + AbstractC7609F5w.A0B(this), getSuggestedMinimumHeight()), i2, iA092 << 16));
    }

    public static final void A01(ActionBarOverlayLayout actionBarOverlayLayout) {
        InterfaceC8333Fc0 wrapper;
        if (actionBarOverlayLayout.A0D == null) {
            actionBarOverlayLayout.A0D = (ContentFrameLayout) actionBarOverlayLayout.findViewById(R.id.action_bar_activity_content);
            actionBarOverlayLayout.A02 = (ActionBarContainer) actionBarOverlayLayout.findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = actionBarOverlayLayout.findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC8333Fc0) {
                wrapper = (InterfaceC8333Fc0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw BV5.A0U("Can't make a decor toolbar out of ", C3cI.A0Y(callbackFindViewById));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            actionBarOverlayLayout.A03 = wrapper;
        }
    }

    public final void A03() {
        removeCallbacks(this.A0P);
        removeCallbacks(this.A0O);
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // X.FU2
    public final void AUF(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.FU2
    public final void AUH(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.FU2
    public final boolean AWB(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // X.FU2
    public final void AWH(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8342FcF;
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A02;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Hqj hqj = this.A0U;
        return hqj.A01 | hqj.A00;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        if (!this.A0K || !z) {
            return false;
        }
        this.A01.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A01.getFinalY() > this.A02.getHeight()) {
            A03();
            runnable = this.A0O;
        } else {
            A03();
            runnable = this.A0P;
        }
        runnable.run();
        this.A04 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A08 + i2;
        this.A08 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C8251FaW c8251FaW;
        C8264Fam c8264Fam;
        this.A0U.A01 = i;
        this.A08 = getActionBarHideOffset();
        A03();
        InterfaceC8355FcT interfaceC8355FcT = this.A0C;
        if (interfaceC8355FcT == null || (c8264Fam = (c8251FaW = (C8251FaW) interfaceC8355FcT).A07) == null) {
            return;
        }
        c8264Fam.A00();
        c8251FaW.A07 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A02.getVisibility() != 0) {
            return false;
        }
        return this.A0K;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        Runnable runnable;
        if (!this.A0K || this.A04) {
            return;
        }
        if (this.A08 <= this.A02.getHeight()) {
            A03();
            runnable = this.A0P;
        } else {
            A03();
            runnable = this.A0O;
        }
        postDelayed(runnable, 600L);
    }

    public void setActionBarVisibilityCallback(InterfaceC8355FcT interfaceC8355FcT) {
        this.A0C = interfaceC8355FcT;
        if (getWindowToken() != null) {
            ((C8251FaW) this.A0C).A00 = this.A0A;
            int i = this.A09;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A05 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0K) {
            this.A0K = z;
            if (z) {
                return;
            }
            A03();
            setActionBarHideOffset(0);
        }
    }

    public void setOverlayMode(boolean z) {
        this.A06 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    static {
        C8498Ff5 c8498Ff5 = new C8498Ff5();
        c8498Ff5.A01(new C8345FcJ(0, 1, 0, 1));
        A0W = c8498Ff5.A00();
        A0V = AbstractC7607F5u.A0X();
    }

    private void A00(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0X);
        this.A07 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.A0B = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.A01 = new OverScroller(context);
    }

    public static boolean A02(View view, int i, int i2, int i3, int i4) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        if (marginLayoutParamsA0e.leftMargin != i) {
            marginLayoutParamsA0e.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (marginLayoutParamsA0e.topMargin != i2) {
            marginLayoutParamsA0e.topMargin = i2;
            z = true;
        }
        if (marginLayoutParamsA0e.rightMargin != i3) {
            marginLayoutParamsA0e.rightMargin = i3;
            z = true;
        }
        if (marginLayoutParamsA0e.bottomMargin == i4) {
            return z;
        }
        marginLayoutParamsA0e.bottomMargin = i4;
        return true;
    }

    @Override // X.InterfaceC8305FbX
    public final boolean AOr() {
        C8243FaJ c8243FaJ;
        A01(this);
        ActionMenuView actionMenuView = ((C8254Faa) this.A03).A09.A0A;
        return (actionMenuView == null || (c8243FaJ = actionMenuView.A04) == null || !c8243FaJ.A03()) ? false : true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A0B != null) {
            int bottom = this.A02.getVisibility() == 0 ? (int) (this.A02.getBottom() + this.A02.getTranslationY() + 0.5f) : 0;
            this.A0B.setBounds(0, bottom, getWidth(), this.A0B.getIntrinsicHeight() + bottom);
            this.A0B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8342FcF(getContext(), attributeSet);
    }

    public CharSequence getTitle() {
        A01(this);
        return ((C8254Faa) this.A03).A09.A0F;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r10) {
        /*
            r9 = this;
            A01(r9)
            int r1 = r9.getWindowSystemUiVisibility()
            r0 = r1 & 256(0x100, float:3.59E-43)
            r5 = 0
            boolean r4 = X.AnonymousClass002.A1L(r0)
            r0 = r1 & 1536(0x600, float:2.152E-42)
            boolean r3 = X.AnonymousClass002.A1L(r0)
            X.FcG r2 = r9.A0N
            X.Ff4 r0 = androidx.appcompat.widget.ActionBarOverlayLayout.A0W
            android.graphics.Rect r1 = r9.A0M
            android.view.WindowInsets r0 = r0.A02()
            if (r0 == 0) goto Ldc
            android.view.WindowInsets r0 = r2.computeSystemWindowInsets(r0, r1)
            X.C8497Ff4.A01(r2, r0)
        L27:
            android.graphics.Rect r0 = androidx.appcompat.widget.ActionBarOverlayLayout.A0V
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            r9.A0J = r0
            if (r0 == 0) goto L37
            if (r4 == 0) goto Ld9
            if (r3 == 0) goto Ld9
        L37:
            r2 = 1
        L38:
            r9.A0I = r2
            X.FcT r1 = r9.A0C
            if (r1 == 0) goto L48
            if (r4 != 0) goto L43
            r0 = 1
            if (r2 == 0) goto L44
        L43:
            r0 = 0
        L44:
            X.FaW r1 = (X.C8251FaW) r1
            r1.A0D = r0
        L48:
            X.Ff4 r7 = X.C8497Ff4.A01(r9, r10)
            X.Ff3 r4 = r7.A00
            X.FcJ r0 = r4.A0D()
            android.graphics.Rect r1 = r9.A0T
            int r8 = r0.A01
            int r6 = r0.A03
            int r3 = r0.A02
            int r0 = r0.A00
            r1.set(r8, r6, r3, r0)
            boolean r0 = r9.A0I
            if (r0 == 0) goto Lcd
            r0 = 2
            X.FcJ r0 = r4.A04(r0)
            int r2 = r0.A01
            int r8 = r8 - r2
            int r1 = r0.A02
            int r3 = r3 - r1
            androidx.appcompat.widget.ActionBarContainer r0 = r9.A02
            r0.setPadding(r8, r6, r3, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r9.A02
            boolean r6 = A02(r0, r2, r5, r1, r5)
        L79:
            android.graphics.Rect r5 = r9.A0Q
            android.view.WindowInsets r0 = r7.A02()
            if (r0 == 0) goto Lc9
            android.view.WindowInsets r0 = r9.computeSystemWindowInsets(r0, r5)
            X.C8497Ff4.A01(r9, r0)
        L88:
            int r3 = r5.left
            int r2 = r5.top
            int r1 = r5.right
            int r0 = r5.bottom
            X.Ff4 r1 = r4.A0A(r3, r2, r1, r0)
            r9.A0E = r1
            X.Ff4 r0 = r9.A0G
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La3
            X.Ff4 r0 = r9.A0E
            r9.A0G = r0
            r6 = 1
        La3:
            android.graphics.Rect r1 = r9.A0S
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto Lc6
            r1.set(r5)
        Lae:
            r9.requestLayout()
        Lb1:
            X.Ff4 r0 = r4.A07()
            X.Ff3 r0 = r0.A00
            X.Ff4 r0 = r0.A09()
            X.Ff3 r0 = r0.A00
            X.Ff4 r0 = r0.A08()
            android.view.WindowInsets r0 = r0.A02()
            return r0
        Lc6:
            if (r6 == 0) goto Lb1
            goto Lae
        Lc9:
            r5.setEmpty()
            goto L88
        Lcd:
            androidx.appcompat.widget.ActionBarContainer r0 = r9.A02
            r0.setPadding(r5, r5, r5, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r9.A02
            boolean r6 = A02(r0, r8, r6, r3, r5)
            goto L79
        Ld9:
            r2 = 0
            goto L38
        Ldc:
            r1.setEmpty()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A00(getContext());
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParamsA0e.leftMargin + paddingLeft;
                int i7 = marginLayoutParamsA0e.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        A01(this);
        int i2 = this.A09 ^ i;
        this.A09 = i;
        boolean zA1M = AnonymousClass002.A1M(i & 4);
        boolean zA1L = AnonymousClass002.A1L(i & 256);
        InterfaceC8355FcT interfaceC8355FcT = this.A0C;
        if (interfaceC8355FcT != null) {
            C8251FaW c8251FaW = (C8251FaW) interfaceC8355FcT;
            c8251FaW.A0D = (zA1L || this.A0I) ? false : true;
            if (zA1M || !zA1L) {
                if (c8251FaW.A0G) {
                    c8251FaW.A0G = false;
                    z = true;
                    C8251FaW.A01(c8251FaW, z);
                }
            } else if (!c8251FaW.A0G) {
                z = true;
                c8251FaW.A0G = true;
                C8251FaW.A01(c8251FaW, z);
            }
        }
        if ((i2 & 256) == 0 || this.A0C == null) {
            return;
        }
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A0A = i;
        InterfaceC8355FcT interfaceC8355FcT = this.A0C;
        if (interfaceC8355FcT != null) {
            ((C8251FaW) interfaceC8355FcT).A00 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        A03();
        this.A02.setTranslationY(-BV5.A02(i, this.A02.getHeight(), 0));
    }

    public void setIcon(int i) {
        A01(this);
        C8254Faa c8254Faa = (C8254Faa) this.A03;
        c8254Faa.A03 = i != 0 ? FWf.A01(c8254Faa.A09, i) : null;
        C8254Faa.A00(c8254Faa);
    }

    public void setLogo(int i) {
        A01(this);
        C8254Faa c8254Faa = (C8254Faa) this.A03;
        c8254Faa.A04 = i != 0 ? FWf.A01(c8254Faa.A09, i) : null;
        C8254Faa.A00(c8254Faa);
    }

    @Override // X.InterfaceC8305FbX
    public void setMenu(Menu menu, InterfaceC8331Fby interfaceC8331Fby) {
        A01(this);
        C8254Faa c8254Faa = (C8254Faa) this.A03;
        C8243FaJ c8243FaJ = c8254Faa.A08;
        if (c8243FaJ == null) {
            c8243FaJ = new C8243FaJ(c8254Faa.A09.getContext());
            c8254Faa.A08 = c8243FaJ;
        }
        c8243FaJ.A07 = interfaceC8331Fby;
        c8254Faa.A09.setMenu((C8249FaR) menu, c8243FaJ);
    }

    @Override // X.InterfaceC8305FbX
    public void setWindowCallback(Window.Callback callback) {
        A01(this);
        ((C8254Faa) this.A03).A07 = callback;
    }

    @Override // X.InterfaceC8305FbX
    public void setWindowTitle(CharSequence charSequence) {
        A01(this);
        this.A03.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // X.FU2
    public final void AUE(View view, int[] iArr, int i, int i2, int i3) {
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = 0;
        this.A0Q = AbstractC7607F5u.A0X();
        this.A0S = AbstractC7607F5u.A0X();
        this.A0R = AbstractC7607F5u.A0X();
        this.A0T = AbstractC7607F5u.A0X();
        this.A0M = AbstractC7607F5u.A0X();
        this.A0J = true;
        this.A0I = false;
        C8497Ff4 c8497Ff4 = C8497Ff4.A01;
        this.A0E = c8497Ff4;
        this.A0G = c8497Ff4;
        this.A0F = c8497Ff4;
        this.A0H = c8497Ff4;
        this.A0L = new I05(this, 0);
        this.A0P = new RunnableC8282Fb6(this);
        this.A0O = new RunnableC8281Fb5(this);
        A00(context);
        this.A0U = new Hqj();
        C8343FcG c8343FcG = new C8343FcG(context);
        c8343FcG.setWillNotDraw(true);
        this.A0N = c8343FcG;
        addView(c8343FcG);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C8342FcF(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A01(this);
        C8254Faa c8254Faa = (C8254Faa) this.A03;
        c8254Faa.A03 = drawable;
        C8254Faa.A00(c8254Faa);
    }
}

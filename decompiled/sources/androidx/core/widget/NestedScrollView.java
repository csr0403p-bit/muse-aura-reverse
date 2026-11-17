package androidx.core.widget;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AbstractC8060FRo;
import X.AnonymousClass002;
import X.BV5;
import X.BV7;
import X.C10638I0i;
import X.C3cG;
import X.C60Q;
import X.C8108FTx;
import X.C8j3;
import X.FGI;
import X.FTg;
import X.FU6;
import X.FU9;
import X.FUA;
import X.FUK;
import X.FUZ;
import X.HjG;
import X.Hqj;
import X.HrF;
import X.Hvz;
import X.InterfaceC8078FSh;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;

/* loaded from: classes6.dex */
public class NestedScrollView extends FrameLayout implements FU9, InterfaceC8078FSh {
    public static final float A0U = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final HjG A0V = new HjG();
    public static final int[] A0W = {R.attr.fillViewport};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public OverScroller A09;
    public FUK A0A;
    public FU6 A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E;
    public int A0F;
    public long A0G;
    public View A0H;
    public FUZ A0I;
    public SavedState A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final Rect A0O;
    public final FTg A0P;
    public final C8108FTx A0Q;
    public final Hqj A0R;
    public final int[] A0S;
    public final int[] A0T;

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10638I0i(13);
        public int A00;

        public final String toString() {
            return FGI.A0A(this.A00, "HorizontalScrollView.SavedState{", BV7.A0x(this), " scrollPosition=", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private final boolean A06(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A0A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                maxScrollAmount = Math.min(AbstractC7611F5y.A09(this, 0) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A01(null, maxScrollAmount, -1, 0, 1, true);
        } else {
            Rect rect = this.A0O;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            A01(null, A00(rect), -1, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!A0A(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private final boolean A08(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        int i5 = i2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i6 = i3 + i;
        if (i2 > 0 || i2 < 0) {
            i5 = 0;
            z = true;
        } else {
            z = false;
        }
        if (i6 > i4) {
            i6 = i4;
        } else {
            if (i6 >= 0) {
                z2 = false;
                onOverScrolled(i5, i6, z, z2);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (this.A0P.A00 == null) {
            this.A09.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i6, z, z2);
        if (z) {
        }
    }

    public static boolean A0B(View view, View view2) {
        if (view != view2) {
            Object parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A0B((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    private boolean A0C(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fA00 = HrF.A00(edgeEffect) * AbstractC7607F5u.A03(this);
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.A0N * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = A0U;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * dLog))) < fA00;
    }

    @Override // X.FU2
    public final void AUE(View view, int[] iArr, int i, int i2, int i3) {
        this.A0P.A07(iArr, null, i, i2, i3);
    }

    @Override // X.FU2
    public final void AUF(View view, int i, int i2, int i3, int i4, int i5) {
        A05(null, i4, i5);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0P.A07(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float axisValue;
        int width;
        if (motionEvent.getAction() == 8 && !this.A0C) {
            if (AnonymousClass002.A1Q(motionEvent.getSource() & 2, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                i = 26;
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
            }
            if (axisValue != 0.0f) {
                A01(motionEvent, -((int) (axisValue * getVerticalScrollFactorCompat())), i, width, 1, AnonymousClass002.A1Q(motionEvent.getSource() & 8194, 8194));
                this.A0A.A00(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A0D((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        AUE(view, iArr, i, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A05(null, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        AUH(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (!A0A(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        AWH(view, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.A0M = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.A0P.A06(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.A0P.A02(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A01(android.view.MotionEvent r26, int r27, int r28, int r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A01(android.view.MotionEvent, int, int, int, int, boolean):int");
    }

    private final void A02(int i) {
        int iA09;
        boolean zA1Q = AnonymousClass002.A1Q(i, 130);
        int height = getHeight();
        Rect rect = this.A0O;
        int scrollY = getScrollY();
        if (zA1Q) {
            rect.top = scrollY + height;
            int childCount = getChildCount();
            if (childCount > 0 && rect.top + height > (iA09 = AbstractC7611F5y.A09(this, childCount - 1) + getPaddingBottom())) {
                rect.top = iA09 - height;
            }
        } else {
            int i2 = scrollY - height;
            rect.top = i2;
            if (i2 < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = i3 + height;
        rect.bottom = i4;
        A07(i, i3, i4);
    }

    public static void A04(NestedScrollView nestedScrollView, int i, int i2, boolean z) {
        if (nestedScrollView.getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - nestedScrollView.A0G > 250) {
                View childAt = nestedScrollView.getChildAt(0);
                int iA0K = AbstractC7610F5x.A0K(childAt, AbstractC7607F5u.A0e(childAt));
                int iA0H = AbstractC7610F5x.A0H(nestedScrollView, nestedScrollView.getHeight());
                int scrollY = nestedScrollView.getScrollY();
                nestedScrollView.A09.startScroll(nestedScrollView.getScrollX(), scrollY, 0, BV5.A02(i2 + scrollY, AbstractC7607F5u.A0D(iA0K, iA0H, 0), 0) - scrollY, 250);
                if (z) {
                    nestedScrollView.A0P.A06(2, 1);
                } else {
                    nestedScrollView.A0P.A02(1);
                }
                nestedScrollView.A02 = nestedScrollView.getScrollY();
                nestedScrollView.postInvalidateOnAnimation();
            } else {
                OverScroller overScroller = nestedScrollView.A09;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                    nestedScrollView.A0P.A02(1);
                }
                nestedScrollView.scrollBy(i, i2);
            }
            nestedScrollView.A0G = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(int r20, int r21, int r22) {
        /*
            r19 = this;
            r15 = r19
            r8 = r22
            int r11 = r15.getHeight()
            int r10 = r15.getScrollY()
            int r11 = r11 + r10
            r0 = 33
            r19 = 0
            r7 = r20
            boolean r14 = X.AnonymousClass002.A1Q(r7, r0)
            r0 = 2
            java.util.ArrayList r9 = r15.getFocusables(r0)
            int r6 = r9.size()
            r5 = 0
            r4 = 0
            r13 = 0
        L23:
            r0 = r21
            if (r4 >= r6) goto L62
            android.view.View r12 = X.AbstractC7607F5u.A0d(r9, r4)
            int r3 = r12.getTop()
            int r2 = r12.getBottom()
            if (r0 >= r2) goto L41
            if (r3 >= r8) goto L41
            if (r0 >= r3) goto L3c
            r1 = 1
            if (r2 < r8) goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r5 != 0) goto L44
            r5 = r12
            r13 = r1
        L41:
            int r4 = r4 + 1
            goto L23
        L44:
            if (r14 == 0) goto L5a
            int r0 = r5.getTop()
            if (r3 < r0) goto L60
        L4c:
            r0 = 0
        L4d:
            if (r13 == 0) goto L55
            if (r1 == 0) goto L41
        L51:
            if (r0 == 0) goto L41
            r5 = r12
            goto L41
        L55:
            if (r1 == 0) goto L51
            r5 = r12
            r13 = 1
            goto L41
        L5a:
            int r0 = r5.getBottom()
            if (r2 <= r0) goto L4c
        L60:
            r0 = 1
            goto L4d
        L62:
            if (r5 != 0) goto L65
            r5 = r15
        L65:
            if (r0 < r10) goto L73
            if (r8 > r11) goto L73
        L69:
            android.view.View r0 = r15.findFocus()
            if (r5 == r0) goto L72
            r5.requestFocus(r7)
        L72:
            return r19
        L73:
            int r8 = r22 - r11
            if (r14 == 0) goto L79
            int r8 = r21 - r10
        L79:
            r20 = 1
            r18 = -1
            r16 = 0
            r21 = r20
            r17 = r8
            r15.A01(r16, r17, r18, r19, r20, r21)
            r19 = 1
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A07(int, int, int):boolean");
    }

    private boolean A09(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A08;
        if (HrF.A00(edgeEffect) != 0.0f) {
            HrF.A01(edgeEffect, 0.0f, AbstractC7608F5v.A00(this, motionEvent.getX()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (HrF.A00(edgeEffect2) == 0.0f) {
            return z;
        }
        HrF.A01(edgeEffect2, 0.0f, 1.0f - AbstractC7608F5v.A00(this, motionEvent.getX()));
        return true;
    }

    private boolean A0A(View view, int i, int i2) {
        Rect rect = this.A0O;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    private FU6 getScrollFeedbackProvider() {
        FU6 fu6 = this.A0B;
        if (fu6 != null) {
            return fu6;
        }
        FU6 fu62 = new FU6(this);
        this.A0B = fu62;
        return fu62;
    }

    public final boolean A0E(KeyEvent keyEvent) {
        Rect rect = this.A0O;
        rect.setEmpty();
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (AbstractC7610F5x.A0K(childAt, AbstractC7607F5u.A0e(childAt)) > AbstractC7610F5x.A0H(this, getHeight())) {
                z = true;
            }
        }
        int i = 130;
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    if (keyCode != 92) {
                        if (keyCode != 93) {
                            if (keyCode == 122) {
                                A02(33);
                                return false;
                            }
                            if (keyCode != 123) {
                                return false;
                            }
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                A02(i);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return A06(130);
            }
            int height = getHeight();
            rect.top = 0;
            rect.bottom = height;
            int childCount = getChildCount();
            if (childCount > 0) {
                int iA09 = AbstractC7611F5y.A09(this, childCount - 1) + getPaddingBottom();
                rect.bottom = iA09;
                rect.top = iA09 - height;
            }
            return A07(130, rect.top, rect.bottom);
        }
        if (!keyEvent.isAltPressed()) {
            return A06(33);
        }
        int height2 = getHeight();
        rect.top = 0;
        rect.bottom = height2;
        return A07(33, 0, height2);
    }

    @Override // X.FU2
    public final void AUH(View view, View view2, int i, int i2) {
        Hqj hqj = this.A0R;
        if (i2 == 1) {
            hqj.A00 = i;
        } else {
            hqj.A01 = i;
        }
        this.A0P.A06(2, i2);
    }

    @Override // X.FU2
    public final boolean AWB(View view, View view2, int i, int i2) {
        return AnonymousClass002.A1L(i & 2);
    }

    @Override // X.FU2
    public final void AWH(View view, int i) {
        Hqj hqj = this.A0R;
        if (i == 1) {
            hqj.A00 = 0;
        } else {
            hqj.A01 = 0;
        }
        this.A0P.A02(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            r18 = this;
            r1 = r18
            android.widget.OverScroller r2 = r1.A09
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto Lb9
            r2.computeScrollOffset()
            int r5 = r2.getCurrY()
            int r0 = r1.A02
            int r11 = r5 - r0
            int r8 = r1.getHeight()
            r7 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r6 = 1082130432(0x40800000, float:4.0)
            if (r11 <= 0) goto Lbd
            android.widget.EdgeEffect r4 = r1.A08
            float r0 = X.HrF.A00(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L40
            int r0 = -r11
            float r0 = (float) r0
            float r0 = r0 * r6
            float r3 = (float) r8
            float r0 = r0 / r3
            int r3 = -r8
            float r3 = (float) r3
        L31:
            float r3 = r3 / r6
            float r0 = X.HrF.A01(r4, r0, r7)
            int r0 = X.AbstractC7607F5u.A09(r3, r0)
            if (r0 == r11) goto L3f
            r4.finish()
        L3f:
            int r11 = r11 - r0
        L40:
            r1.A02 = r5
            int[] r7 = r1.A0S
            r12 = 1
            r8 = 0
            r7[r12] = r8
            r15 = 0
            X.FTg r5 = r1.A0P
            r13 = r5
            r14 = r7
            r16 = r8
            r17 = r11
            r18 = r12
            r13.A07(r14, r15, r16, r17, r18)
            r0 = r7[r12]
            int r11 = r11 - r0
            int r4 = r1.getScrollRange()
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r3 < r0) goto L6e
            float r0 = r2.getCurrVelocity()
            float r0 = java.lang.Math.abs(r0)
            X.FUA.A00(r1, r0)
        L6e:
            if (r11 == 0) goto Lb0
            int r3 = r1.getScrollY()
            int r0 = r1.getScrollX()
            r1.A08(r11, r0, r3, r4)
            int r9 = r1.getScrollY()
            int r9 = r9 - r3
            int r11 = r11 - r9
            r7[r12] = r8
            int[] r6 = r1.A0T
            r10 = r8
            X.FTg.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r7[r12]
            int r11 = r11 - r0
            if (r11 == 0) goto Lb0
            int r0 = r1.getOverScrollMode()
            if (r0 == 0) goto L98
            if (r0 != r12) goto Laa
            if (r4 <= 0) goto Laa
        L98:
            if (r11 >= 0) goto Lba
            android.widget.EdgeEffect r3 = r1.A08
        L9c:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto Laa
            float r0 = r2.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        Laa:
            r2.abortAnimation()
            r5.A02(r12)
        Lb0:
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto Lcf
            r1.postInvalidateOnAnimation()
        Lb9:
            return
        Lba:
            android.widget.EdgeEffect r3 = r1.A07
            goto L9c
        Lbd:
            if (r11 >= 0) goto L40
            android.widget.EdgeEffect r4 = r1.A07
            float r0 = X.HrF.A00(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L40
            float r0 = (float) r11
            float r0 = r0 * r6
            float r3 = (float) r8
            float r0 = r0 / r3
            goto L31
        Lcf:
            r5.A02(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0P.A05(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0P.A04(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return FTg.A01(this.A0P, iArr, null, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Hqj hqj = this.A0R;
        return hqj.A01 | hqj.A00;
    }

    public float getVerticalScrollFactorCompat() {
        float f = this.A0E;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValueA0Z, true)) {
            throw C3cG.A0Q("Expected theme to define listPreferredItemHeight.");
        }
        float dimension = typedValueA0Z.getDimension(C60Q.A0B(context));
        this.A0E = dimension;
        return dimension;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return AnonymousClass002.A1X(this.A0P.A01);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A0P.A02;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0P.A04(f, f2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0J = savedState;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return AnonymousClass002.A1L(i & 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2 A[PHI: r11
  0x00d2: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v5 int) binds: [B:39:0x00ba, B:49:0x00e6, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.A0M) {
            this.A0H = view2;
        } else {
            Rect rect = this.A0O;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iA00 = A00(rect);
            if (iA00 != 0) {
                scrollBy(0, iA00);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A06) != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0K) {
            this.A0K = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A0P.A03(z);
    }

    public void setOnScrollChangeListener(FUZ fuz) {
        this.A0I = fuz;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0D = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    private final int A00(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(childAt);
        int i2 = i;
        if (rect.bottom < AbstractC7610F5x.A0K(childAt, marginLayoutParamsA0e)) {
            i2 = i - verticalFadingEdgeLength;
        }
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return C8j3.A0F(childAt.getBottom() + marginLayoutParamsA0e.bottomMargin, i, rect.height() > height ? rect.top - scrollY : rect.bottom - i2);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(-(rect.height() > height ? i2 - rect.bottom : scrollY - rect.top), -getScrollY());
    }

    private void A03(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A00) {
            boolean zA1M = AnonymousClass002.A1M(actionIndex);
            this.A01 = (int) motionEvent.getY(zA1M ? 1 : 0);
            this.A00 = motionEvent.getPointerId(zA1M ? 1 : 0);
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void A05(int[] iArr, int i, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            AbstractC7607F5u.A1T(iArr, 1, scrollY2);
        }
        FTg.A01(this.A0P, null, iArr, 0, scrollY2, 0, i - scrollY2, i2);
    }

    public final void A0D(int i) {
        if (getChildCount() > 0) {
            OverScroller overScroller = this.A09;
            overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.A0P.A06(2, 1);
            this.A02 = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                FUA.A00(this, Math.abs(overScroller.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw C3cG.A0Q("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iA0A = AbstractC7609F5w.A0A(this) - getPaddingTop();
        if (childCount == 0) {
            return iA0A;
        }
        int iA09 = AbstractC7611F5y.A09(this, 0);
        int scrollY = getScrollY();
        int iA0D = AbstractC7607F5u.A0D(iA09, iA0A, 0);
        return scrollY < 0 ? iA09 - scrollY : scrollY > iA0D ? iA09 + (scrollY - iA0D) : iA09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0E(keyEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A08;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= AbstractC7609F5w.A09(this);
                paddingLeft = getPaddingLeft();
                height -= AbstractC7609F5w.A0B(this);
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= AbstractC7609F5w.A09(this);
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= AbstractC7609F5w.A0B(this);
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(childAt);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + marginLayoutParamsA0e.bottomMargin) - getScrollY()) - AbstractC7609F5w.A0A(this);
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (AbstractC7607F5u.A03(this) * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        return AbstractC7607F5u.A0D(AbstractC7610F5x.A0K(childAt, AbstractC7607F5u.A0e(childAt)), AbstractC7610F5x.A0H(this, getHeight()), 0);
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, AbstractC7609F5w.A09(this), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        AbstractC7608F5v.A1E(view, marginLayoutParamsA0e.topMargin + marginLayoutParamsA0e.bottomMargin, 0, ViewGroup.getChildMeasureSpec(i, AbstractC7608F5v.A0A(marginLayoutParamsA0e, AbstractC7609F5w.A09(this)) + i2, ((ViewGroup.LayoutParams) marginLayoutParamsA0e).width));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0L = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int iA0J = 0;
        this.A0M = false;
        View view = this.A0H;
        if (view != null && A0B(view, this)) {
            View view2 = this.A0H;
            Rect rect = this.A0O;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iA00 = A00(rect);
            if (iA00 != 0) {
                scrollBy(0, iA00);
            }
        }
        this.A0H = null;
        if (!this.A0L) {
            if (this.A0J != null) {
                scrollTo(getScrollX(), this.A0J.A00);
                this.A0J = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                iA0J = AbstractC7610F5x.A0J(childAt, AbstractC7607F5u.A0e(childAt));
            }
            int iA0H = AbstractC7610F5x.A0H(this, i4 - i2);
            int scrollY = getScrollY();
            int i5 = scrollY;
            if (iA0H >= iA0J || scrollY < 0) {
                i5 = 0;
            } else if (iA0H + scrollY > iA0J) {
                i5 = iA0J - iA0H;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0L = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.A0K || View.MeasureSpec.getMode(i2) == 0 || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(childAt);
        int measuredHeight = childAt.getMeasuredHeight();
        int iA0H = (AbstractC7610F5x.A0H(this, getMeasuredHeight()) - marginLayoutParamsA0e.topMargin) - marginLayoutParamsA0e.bottomMargin;
        if (measuredHeight < iA0H) {
            AbstractC7608F5v.A1E(childAt, iA0H, 1073741824, ViewGroup.getChildMeasureSpec(i, AbstractC7608F5v.A0A(marginLayoutParamsA0e, AbstractC7609F5w.A09(this)), ((ViewGroup.LayoutParams) marginLayoutParamsA0e).width));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A0A(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.A0O;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iA00 = A00(rect);
        if (iA00 != 0) {
            if (this.A0D) {
                A04(this, 0, iA00, false);
            } else {
                scrollBy(0, iA00);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iA00 = A00(rect);
        boolean z2 = false;
        if (iA00 != 0) {
            z2 = true;
            if (!z) {
                A04(this, 0, iA00, false);
                return true;
            }
            scrollBy(0, iA00);
        }
        return z2;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(childAt);
            int iA0I = AbstractC7610F5x.A0I(this, getWidth());
            int iA0A = AbstractC7608F5v.A0A(marginLayoutParamsA0e, childAt.getWidth());
            int iA0H = AbstractC7610F5x.A0H(this, getHeight());
            int iA0K = AbstractC7610F5x.A0K(childAt, marginLayoutParamsA0e);
            if (iA0I >= iA0A || i < 0) {
                i = 0;
            } else if (iA0I + i > iA0A) {
                i = iA0A - iA0I;
            }
            if (iA0H >= iA0K || i2 < 0) {
                i2 = 0;
            } else if (iA0H + i2 > iA0K) {
                i2 = iA0K - iA0H;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // X.FU9
    public final void AUG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A05(iArr, i4, i5);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i);
        this.A0O = AbstractC7607F5u.A0X();
        this.A0M = true;
        this.A0L = false;
        this.A0H = null;
        this.A0C = false;
        this.A0D = true;
        this.A00 = -1;
        this.A0T = new int[2];
        this.A0S = new int[2];
        C8108FTx c8108FTx = new C8108FTx(this);
        this.A0Q = c8108FTx;
        Context context2 = getContext();
        this.A0A = new FUK(context2, c8108FTx);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = Hvz.A02(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.A08 = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = Hvz.A02(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.A07 = edgeEffect2;
        this.A0N = C60Q.A0B(context).density * 160.0f * 386.0878f * 0.84f;
        this.A09 = new OverScroller(context2);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A04 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A03 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0W, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.A0R = new Hqj();
        this.A0P = new FTg(this);
        setNestedScrollingEnabled(true);
        AbstractC8060FRo.A06(this, A0V);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw C3cG.A0Q("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f04040f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw C3cG.A0Q("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw C3cG.A0Q("ScrollView can host only one direct child");
    }
}

package com.google.android.material.bottomsheet;

import X.AbstractC7607F5u;
import X.AbstractC8060FRo;
import X.AbstractC8132FVu;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C2203BAi;
import X.C3cG;
import X.C8128FUx;
import X.C8131FVp;
import X.C8j3;
import X.FUL;
import X.FUN;
import X.FVi;
import X.FVj;
import X.FVl;
import X.FVo;
import X.FVt;
import X.FX9;
import X.FXB;
import X.FXK;
import X.I15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.aura.R;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public ValueAnimator A0H;
    public VelocityTracker A0I;
    public FUL A0J;
    public FX9 A0K;
    public WeakReference<View> A0L;
    public WeakReference<V> A0M;
    public Map<View, Integer> A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/android/material/bottomsheet/BottomSheetBehavior<TV;>.SettleRunnable; */
    public FVl A0e;
    public FXK A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final ArrayList<AbstractC8132FVu> A0l;
    public final FUN A0m;

    private void A03(int i) {
        boolean zA1Q;
        ValueAnimator valueAnimator;
        if (i == 2 || this.A0h == (zA1Q = AnonymousClass002.A1Q(i, 3))) {
            return;
        }
        this.A0h = zA1Q;
        if (this.A0K == null || (valueAnimator = this.A0H) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
            return;
        }
        float f = zA1Q ? 0.0f : 1.0f;
        valueAnimator.setFloatValues(AbstractC7607F5u.A1Z(1.0f - f, f, 2));
        valueAnimator.start();
    }

    private void A05(V v, C2203BAi c2203BAi, int i) {
        AbstractC8060FRo.A09(v, new C2203BAi(new C8131FVp(this, i), null, c2203BAi.A02, null, c2203BAi.A00));
    }

    public final void A0B(View view, int i) throws Resources.NotFoundException {
        int iA07;
        int i2;
        if (i == 4) {
            iA07 = this.A04;
        } else if (i == 6) {
            iA07 = this.A08;
            if (this.A0P && iA07 <= (i2 = this.A06)) {
                iA07 = i2;
                i = 3;
            }
        } else if (i == 3) {
            iA07 = A07();
        } else {
            if (!this.A0R || i != 5) {
                throw BV5.A0Q("Illegal state argument: ", i);
            }
            iA07 = this.A0C;
        }
        A0C(view, i, iA07, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(C8128FUx c8128FUx) {
        this.A0M = null;
        this.A0J = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        this.A0M = null;
        this.A0J = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r6, V r7, android.view.View r8, int r9, int r10, int[] r11, int r12) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            r2 = 1
            if (r12 == r2) goto L30
            java.lang.ref.WeakReference<android.view.View> r0 = r5.A0L
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.get()
        Lb:
            if (r8 != r0) goto L30
            int r4 = r7.getTop()
            int r3 = r4 - r10
            if (r10 <= 0) goto L31
            int r0 = r5.A07()
            if (r3 >= r0) goto L4b
            int r4 = r4 - r0
            r11[r2] = r4
            int r0 = -r4
            r7.offsetTopAndBottom(r0)
            r0 = 3
        L23:
            r5.A0A(r0)
        L26:
            r7.getTop()
            r5.A08()
            r5.A0b = r10
            r5.A0i = r2
        L30:
            return
        L31:
            if (r10 >= 0) goto L26
            r0 = -1
            boolean r0 = r8.canScrollVertically(r0)
            if (r0 != 0) goto L26
            int r1 = r5.A04
            if (r3 <= r1) goto L4b
            boolean r0 = r5.A0R
            if (r0 != 0) goto L4b
            int r4 = r4 - r1
            r11[r2] = r4
            int r0 = -r4
            r7.offsetTopAndBottom(r0)
            r0 = 4
            goto L23
        L4b:
            boolean r0 = r5.A0O
            if (r0 == 0) goto L30
            r11[r2] = r10
            int r0 = -r10
            r7.offsetTopAndBottom(r0)
            r5.A0A(r2)
            goto L26
        L59:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.A0b = 0;
        this.A0i = false;
        return (i & 2) != 0;
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new I15(5);
        public int A00;
        public boolean A01;
        public boolean A02;
        public boolean A03;
        public final int A04;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A04 = parcel.readInt();
            this.A00 = parcel.readInt();
            this.A01 = AnonymousClass002.A1Q(parcel.readInt(), 1);
            this.A02 = AnonymousClass002.A1Q(parcel.readInt(), 1);
            this.A03 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A04);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A02 ? 1 : 0);
            parcel.writeInt(this.A03 ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.A04 = bottomSheetBehavior.A0G;
            this.A00 = bottomSheetBehavior.A0E;
            this.A01 = bottomSheetBehavior.A0P;
            this.A02 = bottomSheetBehavior.A0R;
            this.A03 = bottomSheetBehavior.A0W;
        }
    }

    private int A00() {
        int iMin;
        int i;
        if (this.A0V) {
            iMin = Math.min(AbstractC7607F5u.A0D(this.A0C, (this.A0D * 9) / 16, this.A0d), this.A0Y);
        } else {
            if (!this.A0Q && !this.A0S && (i = this.A07) > 0) {
                return Math.max(this.A0E, i + this.A0c);
            }
            iMin = this.A0E;
        }
        return iMin + this.A09;
    }

    private void A02() throws Resources.NotFoundException {
        View viewA0c;
        int i;
        C2203BAi c2203BAi;
        int id;
        WeakReference<V> weakReference = this.A0M;
        if (weakReference == null || (viewA0c = AbstractC7607F5u.A0c(weakReference)) == null) {
            return;
        }
        AbstractC8060FRo.A05(viewA0c, 524288);
        AbstractC8060FRo.A04(viewA0c, 0);
        AbstractC8060FRo.A05(viewA0c, 262144);
        AbstractC8060FRo.A04(viewA0c, 0);
        AbstractC8060FRo.A05(viewA0c, 1048576);
        AbstractC8060FRo.A04(viewA0c, 0);
        int i2 = this.A0Z;
        if (i2 != -1) {
            AbstractC8060FRo.A05(viewA0c, i2);
            AbstractC8060FRo.A04(viewA0c, 0);
        }
        if (!this.A0P && this.A0G != 6) {
            String string = viewA0c.getResources().getString(R.string._name_removed__res_0x7f1206c0);
            C8131FVp c8131FVp = new C8131FVp(this, 6);
            AbstractList abstractListA0h = (AbstractList) viewA0c.getTag(R.id.tag_accessibility_actions);
            if (abstractListA0h == null) {
                abstractListA0h = C3cG.A0h();
                viewA0c.setTag(R.id.tag_accessibility_actions, abstractListA0h);
            }
            int i3 = 0;
            while (true) {
                if (i3 >= abstractListA0h.size()) {
                    int i4 = 0;
                    id = -1;
                    while (true) {
                        int[] iArr = AbstractC8060FRo.A02;
                        if (i4 >= 32 || id != -1) {
                            break;
                        }
                        int i5 = iArr[i4];
                        boolean zA1P = true;
                        for (int i6 = 0; i6 < abstractListA0h.size(); i6++) {
                            zA1P &= AnonymousClass002.A1P(((AccessibilityNodeInfo.AccessibilityAction) ((C2203BAi) abstractListA0h.get(i6)).A03).getId(), i5);
                        }
                        if (zA1P) {
                            id = i5;
                        }
                        i4++;
                    }
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C2203BAi) abstractListA0h.get(i3)).A03).getLabel())) {
                        id = ((AccessibilityNodeInfo.AccessibilityAction) ((C2203BAi) abstractListA0h.get(i3)).A03).getId();
                        break;
                    }
                    i3++;
                }
            }
            if (id != -1) {
                AbstractC8060FRo.A09(viewA0c, new C2203BAi(c8131FVp, string, null, null, id));
            }
            this.A0Z = id;
        }
        if (this.A0R && this.A0G != 5) {
            A05(viewA0c, C2203BAi.A0D, 5);
        }
        int i7 = this.A0G;
        if (i7 == 3) {
            i = this.A0P ? 4 : 6;
            c2203BAi = C2203BAi.A09;
        } else {
            if (i7 != 4) {
                if (i7 == 6) {
                    A05(viewA0c, C2203BAi.A09, 4);
                    A05(viewA0c, C2203BAi.A0H, 3);
                    return;
                }
                return;
            }
            i = this.A0P ? 3 : 6;
            c2203BAi = C2203BAi.A0H;
        }
        A05(viewA0c, c2203BAi, i);
    }

    private void A04(Context context, ColorStateList colorStateList, AttributeSet attributeSet, boolean z) {
        if (this.A0k) {
            FXK fxk = new FXK(FXK.A02(context, attributeSet, R.attr._name_removed__res_0x7f0400a1, R.style._name_removed__res_0x7f13010a));
            this.A0f = fxk;
            FX9 fx9 = new FX9(fxk);
            this.A0K = fx9;
            fx9.A00.A0J = new FXB(context);
            FX9.A04(fx9);
            if (z && colorStateList != null) {
                this.A0K.A09(colorStateList);
                return;
            }
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValueA0Z, true);
            this.A0K.setTint(typedValueA0Z.data);
        }
    }

    public final int A07() {
        if (this.A0P) {
            return this.A06;
        }
        return Math.max(this.A05, this.A0j ? 0 : this.A0A);
    }

    public final void A08() {
        View viewA0c = AbstractC7607F5u.A0c(this.A0M);
        if (viewA0c != null) {
            ArrayList<AbstractC8132FVu> arrayList = this.A0l;
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC8132FVu abstractC8132FVu = arrayList.get(i);
                if (abstractC8132FVu instanceof FVj) {
                    FVj.A00(viewA0c, (FVj) abstractC8132FVu);
                }
            }
        }
    }

    public final void A09(int i) throws Resources.NotFoundException {
        if (i != this.A0G) {
            WeakReference<V> weakReference = this.A0M;
            if (weakReference == null) {
                if (i == 4 || i == 3 || i == 6 || (this.A0R && i == 5)) {
                    this.A0G = i;
                    return;
                }
                return;
            }
            View viewA0c = AbstractC7607F5u.A0c(weakReference);
            if (viewA0c != null) {
                ViewParent parent = viewA0c.getParent();
                if (parent != null && parent.isLayoutRequested() && viewA0c.isAttachedToWindow()) {
                    viewA0c.post(new FVo(viewA0c, this, i));
                } else {
                    A0B(viewA0c, i);
                }
            }
        }
    }

    public final void A0A(int i) throws Resources.NotFoundException {
        View viewA0c;
        WeakReference<V> weakReference;
        if (this.A0G == i) {
            return;
        }
        this.A0G = i;
        WeakReference<V> weakReference2 = this.A0M;
        if (weakReference2 == null || (viewA0c = AbstractC7607F5u.A0c(weakReference2)) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            WeakReference<V> weakReference3 = this.A0M;
            if (weakReference3 != null) {
                ViewParent parent = AbstractC7607F5u.A0c(weakReference3).getParent();
                if (parent instanceof CoordinatorLayout) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int childCount = viewGroup.getChildCount();
                    if (this.A0N == null) {
                        this.A0N = BV4.A0v(childCount);
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt != this.A0M.get()) {
                                BV4.A1H(childAt, this.A0N, childAt.getImportantForAccessibility());
                            }
                        }
                    }
                }
            }
        } else if ((i == 6 || i == 5 || i == 4) && (weakReference = this.A0M) != null) {
            ViewParent parent2 = AbstractC7607F5u.A0c(weakReference).getParent();
            if (parent2 instanceof CoordinatorLayout) {
                ViewGroup viewGroup2 = (ViewGroup) parent2;
                int childCount2 = viewGroup2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    viewGroup2.getChildAt(i4);
                    this.A0M.get();
                }
                this.A0N = null;
            }
        }
        A03(i);
        while (true) {
            ArrayList<AbstractC8132FVu> arrayList = this.A0l;
            if (i2 >= arrayList.size()) {
                A02();
                return;
            }
            AbstractC8132FVu abstractC8132FVu = arrayList.get(i2);
            if (abstractC8132FVu instanceof FVj) {
                FVj.A00(viewA0c, (FVj) abstractC8132FVu);
            } else {
                FVt fVt = (FVt) abstractC8132FVu;
                if (i == 5) {
                    fVt.A00.cancel();
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r2.A0E(r1, r6) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(android.view.View r4, int r5, int r6, boolean r7) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            X.FUL r2 = r3.A0J
            if (r2 == 0) goto L48
            int r1 = r4.getLeft()
            if (r7 == 0) goto L31
            boolean r0 = r2.A0E(r1, r6)
            if (r0 == 0) goto L48
        L10:
            r0 = 2
            r3.A0A(r0)
            r3.A03(r5)
            X.FVl r1 = r3.A0e
            if (r1 != 0) goto L22
            X.FVl r1 = new X.FVl
            r1.<init>(r4, r3, r5)
            r3.A0e = r1
        L22:
            boolean r0 = r1.A01
            r1.A00 = r5
            if (r0 != 0) goto L30
            r4.postOnAnimation(r1)
            X.FVl r1 = r3.A0e
            r0 = 1
            r1.A01 = r0
        L30:
            return
        L31:
            r2.A06 = r4
            r0 = -1
            r2.A01 = r0
            r0 = 0
            boolean r0 = X.FUL.A09(r2, r1, r6, r0, r0)
            if (r0 != 0) goto L10
            int r0 = r2.A02
            if (r0 != 0) goto L48
            android.view.View r0 = r2.A06
            if (r0 == 0) goto L48
            r0 = 0
            r2.A06 = r0
        L48:
            r3.A0A(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0C(android.view.View, int, int, boolean):void");
    }

    public final void A0D(boolean z) throws Resources.NotFoundException {
        if (this.A0R != z) {
            this.A0R = z;
            if (!z && this.A0G == 5) {
                A09(4);
            }
            A02();
        }
    }

    public final boolean A0E(View view, float f) {
        if (!this.A0W) {
            if (view.getTop() >= this.A04) {
                if (C8j3.A01(view.getTop() + (f * 0.1f), this.A04) / A00() > 0.5f) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.A0L;
        return (weakReference == null || view != weakReference.get() || this.A0G == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.A0F;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.A0E = savedState.A00;
            }
            if (i == -1 || (i & 2) == 2) {
                this.A0P = savedState.A01;
            }
            if (i == -1 || (i & 4) == 4) {
                this.A0R = savedState.A02;
            }
            if (i == -1 || (i & 8) == 8) {
                this.A0W = savedState.A03;
            }
        }
        int i2 = savedState.A04;
        if (i2 == 1 || i2 == 2) {
            this.A0G = 4;
        } else {
            this.A0G = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState((Parcelable) android.view.AbsSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public BottomSheetBehavior() {
        this.A0F = 0;
        this.A0P = true;
        this.A0B = -1;
        this.A0e = null;
        this.A01 = 0.5f;
        this.A00 = -1.0f;
        this.A0O = true;
        this.A0G = 4;
        this.A0l = C3cG.A0h();
        this.A0Z = -1;
        this.A0m = new FVi(this);
    }

    private final View A01(View view) {
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewA01 = A01(viewGroup.getChildAt(i));
                if (viewA01 != null) {
                    return viewA01;
                }
            }
        }
        return null;
    }

    public static void A06(BottomSheetBehavior bottomSheetBehavior) {
        int iA00 = bottomSheetBehavior.A00();
        boolean z = bottomSheetBehavior.A0P;
        int i = bottomSheetBehavior.A0C - iA00;
        if (z) {
            bottomSheetBehavior.A04 = Math.max(i, bottomSheetBehavior.A06);
        } else {
            bottomSheetBehavior.A04 = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r6 = 0
            r5 = 1
            if (r0 == 0) goto Lcc
            boolean r0 = r9.A0O
            if (r0 == 0) goto Lcc
            int r4 = r12.getActionMasked()
            if (r4 != 0) goto L1f
            r0 = -1
            r9.A03 = r0
            android.view.VelocityTracker r0 = r9.A0I
            if (r0 == 0) goto L1f
            r0.recycle()
            r0 = 0
            r9.A0I = r0
        L1f:
            android.view.VelocityTracker r0 = r9.A0I
            if (r0 != 0) goto L29
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0I = r0
        L29:
            r0.addMovement(r12)
            r2 = 0
            r7 = -1
            r3 = 2
            if (r4 == 0) goto L50
            if (r4 == r5) goto L45
            r0 = 3
            if (r4 == r0) goto L45
        L36:
            boolean r0 = r9.A0g
            if (r0 != 0) goto L8d
            X.FUL r0 = r9.A0J
            if (r0 == 0) goto L8d
            boolean r0 = r0.A0F(r12)
            if (r0 == 0) goto L8d
            return r5
        L45:
            r9.A0X = r6
            r9.A03 = r7
            boolean r0 = r9.A0g
            if (r0 == 0) goto L36
            r9.A0g = r6
            return r6
        L50:
            float r0 = r12.getX()
            int r1 = (int) r0
            float r0 = r12.getY()
            int r8 = (int) r0
            r9.A0a = r8
            int r0 = r9.A0G
            if (r0 == r3) goto L7c
            java.lang.ref.WeakReference<android.view.View> r0 = r9.A0L
            if (r0 == 0) goto L7c
            android.view.View r0 = X.AbstractC7607F5u.A0c(r0)
            if (r0 == 0) goto L7c
            boolean r0 = r10.A0E(r0, r1, r8)
            if (r0 == 0) goto L7c
            int r0 = r12.getActionIndex()
            int r0 = r12.getPointerId(r0)
            r9.A03 = r0
            r9.A0X = r5
        L7c:
            int r0 = r9.A03
            if (r0 != r7) goto L89
            int r0 = r9.A0a
            boolean r1 = r10.A0E(r11, r1, r0)
            r0 = 1
            if (r1 == 0) goto L8a
        L89:
            r0 = 0
        L8a:
            r9.A0g = r0
            goto L36
        L8d:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.A0L
            if (r0 == 0) goto L97
            java.lang.Object r2 = r0.get()
            android.view.View r2 = (android.view.View) r2
        L97:
            if (r4 != r3) goto Lce
            if (r2 == 0) goto Lce
            boolean r0 = r9.A0g
            if (r0 != 0) goto Lce
            int r0 = r9.A0G
            if (r0 == r5) goto Lce
            float r0 = r12.getX()
            int r1 = (int) r0
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r0 = r10.A0E(r2, r1, r0)
            if (r0 != 0) goto Lce
            X.FUL r0 = r9.A0J
            if (r0 == 0) goto Lce
            int r0 = r9.A0a
            float r1 = (float) r0
            float r0 = r12.getY()
            float r1 = X.C8j3.A01(r1, r0)
            X.FUL r0 = r9.A0J
            int r0 = r0.A05
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lce
            return r5
        Lcc:
            r9.A0g = r5
        Lce:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r9, V r10, int r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r1 >= X.AbstractC7607F5u.A0B(r3, r4)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r1 >= java.lang.Math.abs(r3)) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091 A[PHI: r2
  0x0091: PHI (r2v10 int) = (r2v2 int), (r2v5 int), (r2v12 int) binds: [B:41:0x0086, B:49:0x009d, B:44:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.View r9, int r10) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            int r1 = r8.getTop()
            int r0 = r6.A07()
            r5 = 3
            if (r1 != r0) goto Lf
            r6.A0A(r5)
        Le:
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r0 = r6.A0L
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.get()
            if (r9 != r0) goto Le
            boolean r0 = r6.A0i
            if (r0 == 0) goto Le
            int r0 = r6.A0b
            if (r0 <= 0) goto L2e
            boolean r0 = r6.A0P
            if (r0 == 0) goto L89
            int r2 = r6.A06
        L27:
            r0 = 0
            r6.A0C(r8, r5, r2, r0)
            r6.A0i = r0
            return
        L2e:
            boolean r0 = r6.A0R
            if (r0 == 0) goto L51
            android.view.VelocityTracker r2 = r6.A0I
            if (r2 != 0) goto L41
            r0 = 0
        L37:
            boolean r0 = r6.A0E(r8, r0)
            if (r0 == 0) goto L51
            int r2 = r6.A0C
            r5 = 5
            goto L27
        L41:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r6.A02
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r6.A0I
            int r0 = r6.A03
            float r0 = r1.getYVelocity(r0)
            goto L37
        L51:
            int r0 = r6.A0b
            if (r0 != 0) goto L6e
            int r3 = r8.getTop()
            boolean r0 = r6.A0P
            if (r0 == 0) goto L93
            int r2 = r6.A06
            int r1 = X.AbstractC7607F5u.A0B(r3, r2)
            int r4 = r6.A04
            int r0 = X.AbstractC7607F5u.A0B(r3, r4)
            if (r1 < r0) goto L27
        L6b:
            r2 = r4
        L6c:
            r5 = 4
            goto L27
        L6e:
            boolean r0 = r6.A0P
            if (r0 == 0) goto L75
            int r2 = r6.A04
            goto L6c
        L75:
            int r3 = r8.getTop()
            int r2 = r6.A08
            int r1 = X.AbstractC7607F5u.A0B(r3, r2)
            int r4 = r6.A04
            int r3 = r3 - r4
        L82:
            int r0 = java.lang.Math.abs(r3)
            if (r1 < r0) goto L91
            goto L6b
        L89:
            int r0 = r8.getTop()
            int r2 = r6.A08
            if (r0 <= r2) goto L9f
        L91:
            r5 = 6
            goto L27
        L93:
            int r2 = r6.A08
            if (r3 >= r2) goto La4
            int r0 = r6.A04
            int r0 = X.AbstractC7607F5u.A0B(r3, r0)
            if (r3 >= r0) goto L91
        L9f:
            int r2 = r6.A07()
            goto L27
        La4:
            int r1 = X.AbstractC7607F5u.A0B(r3, r2)
            int r4 = r6.A04
            int r3 = r3 - r4
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0G == 1 && actionMasked == 0) {
            return true;
        }
        FUL ful = this.A0J;
        if (ful != null) {
            ful.A0B(motionEvent);
        }
        if (actionMasked == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A0I;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0I = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.A0I;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.A0I = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.A0J != null && actionMasked == 2 && !this.A0g) {
            float fA01 = C8j3.A01(this.A0a, motionEvent.getY());
            FUL ful2 = this.A0J;
            if (fA01 > ful2.A05) {
                ful2.A0C(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0g;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomSheetBehavior(android.content.Context r13, android.util.AttributeSet r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}

package androidx.coordinatorlayout.widget;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AbstractC8082FSn;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C3110ByZ;
import X.C3cG;
import X.C60O;
import X.C8128FUx;
import X.C8497Ff4;
import X.DQZ;
import X.FGI;
import X.FPU;
import X.FU2;
import X.FU9;
import X.FV1;
import X.FV6;
import X.Hhu;
import X.HlB;
import X.HmI;
import X.Hqj;
import X.HsC;
import X.I10;
import X.I15;
import X.ViewGroupOnHierarchyChangeListenerC8129FUz;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class CoordinatorLayout extends ViewGroup implements FU2, FU9 {
    public static final String A0J;
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> A0K;
    public static final Comparator<View> A0L;
    public static final Class<?>[] A0M;
    public static final HsC<Rect> A0N;
    public ViewGroup.OnHierarchyChangeListener A00;
    public FV1 A01;
    public C8497Ff4 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public Drawable A06;
    public View A07;
    public View A08;
    public FPU A09;
    public boolean A0A;
    public int[] A0B;
    public final Hhu<View> A0C;
    public final int[] A0D;
    public final Hqj A0E;
    public final List<View> A0F;
    public final List<View> A0G;
    public final int[] A0H;
    public final int[] A0I;

    public abstract class Behavior<V extends View> {
        public abstract boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i);

        public void onAttachedToLayoutParams(C8128FUx c8128FUx) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public Behavior() {
        }

        public static Object getTag(View view) {
            return AbstractC7607F5u.A0h(view).A0B;
        }

        public static void setTag(View view, Object obj) {
            AbstractC7607F5u.A0h(view).A0B = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return AbsSavedState.EMPTY_STATE;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public C8497Ff4 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, C8497Ff4 c8497Ff4) {
            return c8497Ff4;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AbstractC7607F5u.A1T(iArr, 0, i3);
            AbstractC7607F5u.A1T(iArr, 1, i4);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private int getFullContentHeight() {
        int iA0K = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            iA0K += AbstractC7610F5x.A0K(childAt, AbstractC7607F5u.A0e(childAt));
        }
        return iA0K;
    }

    @Override // X.FU2
    public final void AUF(View view, int i, int i2, int i3, int i4, int i5) {
        AUG(view, this.A0I, i, i2, i3, i4, 0);
    }

    @Override // X.FU2
    public final boolean AWB(View view, View view2, int i, int i2) {
        boolean zOnStartNestedScroll;
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C8128FUx c8128FUx = (C8128FUx) childAt.getLayoutParams();
                Behavior behavior = c8128FUx.A0A;
                if (behavior != null) {
                    zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                } else {
                    zOnStartNestedScroll = false;
                }
                if (i2 == 0) {
                    c8128FUx.A0E = zOnStartNestedScroll;
                } else if (i2 == 1) {
                    c8128FUx.A0D = zOnStartNestedScroll;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r1 != 123) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r11.isShiftPressed() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        r10 = getFullContentHeight() - getHeight();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r4 = r10
            boolean r2 = super.dispatchKeyEvent(r11)
            if (r2 != 0) goto L2d
            int r0 = r11.getAction()
            if (r0 != 0) goto L2d
            int r1 = r11.getKeyCode()
            r0 = 19
            if (r1 == r0) goto L43
            r0 = 20
            if (r1 == r0) goto L2e
            r0 = 62
            if (r1 == r0) goto L58
            r0 = 92
            if (r1 == r0) goto L53
            r0 = 93
            if (r1 == r0) goto L3e
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L5e
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L7a
        L2d:
            return r2
        L2e:
            boolean r0 = r11.isAltPressed()
            if (r0 != 0) goto L3e
            float r1 = X.AbstractC7607F5u.A03(r10)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r10 = (int) r1
            goto L63
        L3e:
            int r10 = r10.getHeight()
            goto L63
        L43:
            boolean r0 = r11.isAltPressed()
            if (r0 != 0) goto L53
            float r1 = X.AbstractC7607F5u.A03(r10)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r0 = (int) r1
            goto L62
        L53:
            int r0 = r10.getHeight()
            goto L62
        L58:
            boolean r0 = r11.isShiftPressed()
            if (r0 == 0) goto L7a
        L5e:
            int r0 = r10.getFullContentHeight()
        L62:
            int r10 = -r0
        L63:
            r5 = r4
        L64:
            r1 = 0
            if (r5 == 0) goto L84
            boolean r0 = r5.isFocused()
            if (r0 != 0) goto L85
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L78
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.getFocusedChild()
            goto L64
        L78:
            r5 = r1
            goto L64
        L7a:
            int r10 = r10.getFullContentHeight()
            int r0 = r4.getHeight()
            int r10 = r10 - r0
            goto L63
        L84:
            r5 = r1
        L85:
            r0 = 2
            r11 = 1
            r4.AWB(r4, r5, r0, r11)
            int[] r6 = r4.A0D
            r7 = 0
            r8 = r10
            r9 = r11
            r4.AUE(r5, r6, r7, r8, r9)
            r8 = r6[r11]
            r6[r7] = r7
            r6[r11] = r7
            r9 = r7
            r4.AUG(r5, r6, r7, r8, r9, r10, r11)
            r4.AWH(r5, r11)
            r0 = r6[r11]
            boolean r2 = X.AnonymousClass002.A1N(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8128FUx(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C8128FUx c8128FUxA0h = AbstractC7607F5u.A0h(childAt);
                if (c8128FUxA0h.A0E && (behavior = c8128FUxA0h.A0A) != null) {
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        AUE(view, iArr, i, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        AUF(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        AUH(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return AWB(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        AWH(view, 0);
    }

    public final class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new I15(1);
        public SparseArray<Parcelable> A00;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            SparseArray<Parcelable> sparseArray = new SparseArray<>(i);
            this.A00 = sparseArray;
            for (int i2 = 0; i2 < i; i2++) {
                sparseArray.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.A00;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.A00.keyAt(i2);
                parcelableArr[i2] = this.A00.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r1 = CoordinatorLayout.class.getPackage();
        A0J = r1 != null ? r1.getName() : null;
        A0L = new HmI();
        A0M = new Class[]{Context.class, AttributeSet.class};
        A0K = new ThreadLocal<>();
        A0N = new C3110ByZ(12);
    }

    private int A00(int i) {
        StringBuilder sbA0y;
        int[] iArr = this.A0B;
        if (iArr == null) {
            sbA0y = C3cG.A0f(this, "No keylines defined for ");
            sbA0y.append(" - attempted index lookup ");
            sbA0y.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sbA0y = C60O.A0y("Keyline index ", i);
            sbA0y.append(" out of range for ");
            sbA0y.append(this);
        }
        Log.e("CoordinatorLayout", sbA0y.toString());
        return 0;
    }

    public static Rect A01() {
        Rect rectA2t = A0N.A2t();
        return rectA2t == null ? AbstractC7607F5u.A0X() : rectA2t;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A03():void");
    }

    private void A04() {
        View view = this.A07;
        if (view != null) {
            Behavior behavior = AbstractC7607F5u.A0h(view).A0A;
            if (behavior != null) {
                MotionEvent motionEventA0L = AbstractC7611F5y.A0L();
                behavior.onTouchEvent(this, this.A07, motionEventA0L);
                motionEventA0L.recycle();
            }
            this.A07 = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
        this.A0A = false;
    }

    public static void A07(Rect rect, Rect rect2, C8128FUx c8128FUx, int i, int i2, int i3) {
        int i4 = c8128FUx.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c8128FUx.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public final List<View> A0A(View view) {
        DQZ<View, ArrayList<View>> dqz = this.A0C.A00;
        int size = dqz.size();
        ArrayList arrayListA0x = null;
        for (int i = 0; i < size; i++) {
            ArrayList<View> arrayListA07 = dqz.A07(i);
            if (arrayListA07 != null && arrayListA07.contains(view)) {
                arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
                arrayListA0x.add(dqz.A05(i));
            }
        }
        return arrayListA0x == null ? Collections.EMPTY_LIST : arrayListA0x;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(int r27) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A0B(int):void");
    }

    @Override // X.FU2
    public final void AUE(View view, int[] iArr, int i, int i2, int i3) {
        boolean z;
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C8128FUx c8128FUxA0h = AbstractC7607F5u.A0h(childAt);
                if (i3 == 0) {
                    z = c8128FUxA0h.A0E;
                } else if (i3 == 1) {
                    z = c8128FUxA0h.A0D;
                }
                if (z && (behavior = c8128FUxA0h.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int i5 = iArr2[0];
                    iMax = i > 0 ? Math.max(iMax, i5) : Math.min(iMax, i5);
                    int i6 = iArr2[1];
                    iMax2 = i2 > 0 ? Math.max(iMax2, i6) : Math.min(iMax2, i6);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            A0B(1);
        }
    }

    @Override // X.FU9
    public final void AUG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C8128FUx c8128FUxA0h = AbstractC7607F5u.A0h(childAt);
                if (i5 == 0) {
                    z = c8128FUxA0h.A0E;
                } else if (i5 == 1) {
                    z = c8128FUxA0h.A0D;
                }
                if (z && (behavior = c8128FUxA0h.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int i7 = iArr2[0];
                    iMax = i3 > 0 ? Math.max(iMax, i7) : Math.min(iMax, i7);
                    int i8 = iArr2[1];
                    iMax2 = i4 > 0 ? Math.max(iMax2, i8) : Math.min(iMax2, i8);
                    z2 = true;
                }
            }
        }
        AbstractC7607F5u.A1T(iArr, 0, iMax);
        AbstractC7607F5u.A1T(iArr, 1, iMax2);
        if (z2) {
            A0B(1);
        }
    }

    @Override // X.FU2
    public final void AUH(View view, View view2, int i, int i2) {
        Hqj hqj = this.A0E;
        if (i2 == 1) {
            hqj.A00 = i;
        } else {
            hqj.A01 = i;
        }
        this.A08 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    @Override // X.FU2
    public final void AWH(View view, int i) {
        boolean z;
        Hqj hqj = this.A0E;
        if (i == 1) {
            hqj.A00 = 0;
        } else {
            hqj.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C8128FUx c8128FUxA0h = AbstractC7607F5u.A0h(childAt);
            if (i == 0) {
                z = c8128FUxA0h.A0E;
            } else if (i == 1) {
                z = c8128FUxA0h.A0D;
            }
            if (z) {
                Behavior behavior = c8128FUxA0h.A0A;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                if (i != 0) {
                    c8128FUxA0h.A0D = false;
                } else {
                    c8128FUxA0h.A0E = false;
                }
                c8128FUxA0h.A0F = false;
            }
        }
        this.A08 = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C8128FUx) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8128FUx ? new C8128FUx((C8128FUx) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C8128FUx((ViewGroup.MarginLayoutParams) layoutParams) : new C8128FUx(layoutParams);
    }

    public final C8497Ff4 getLastWindowInsets() {
        return this.A02;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Hqj hqj = this.A0E;
        return hqj.A01 | hqj.A00;
    }

    public Drawable getStatusBarBackground() {
        return this.A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r31, int r32) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).A00);
        SparseArray<Parcelable> sparseArray = savedState.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = A02(childAt).A0A;
            if (id != -1 && behavior != null && (parcelable2 = sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        Parcelable.Creator<SavedState> creator = SavedState.CREATOR;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArrayA0B = BV4.A0B();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = AbstractC7607F5u.A0h(childAt).A0A;
            if (id != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArrayA0B.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.A00 = sparseArrayA0B;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A00 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.A06 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.A06.setState(getDrawableState());
                }
                this.A06.setLayoutDirection(getLayoutDirection());
                this.A06.setVisible(AnonymousClass002.A1M(getVisibility()), false);
                this.A06.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    public static final C8128FUx A02(View view) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        C8128FUx c8128FUxA0h = AbstractC7607F5u.A0h(view);
        if (!c8128FUxA0h.A0C) {
            Class<?> superclass = view.getClass();
            while (true) {
                DefaultBehavior defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior == null) {
                    superclass = superclass.getSuperclass();
                    if (superclass == null) {
                        break;
                    }
                } else {
                    try {
                        Behavior behaviorNewInstance = defaultBehavior.value().getDeclaredConstructor(null).newInstance(null);
                        Behavior behavior = c8128FUxA0h.A0A;
                        if (behavior != behaviorNewInstance) {
                            if (behavior != null) {
                                behavior.onDetachedFromLayoutParams();
                            }
                            c8128FUxA0h.A0A = behaviorNewInstance;
                            c8128FUxA0h.A0B = null;
                            c8128FUxA0h.A0C = true;
                            if (behaviorNewInstance != null) {
                                behaviorNewInstance.onAttachedToLayoutParams(c8128FUxA0h);
                            }
                        }
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", FGI.A0U("Default behavior class ", defaultBehavior.value().getName(), " could not be instantiated. Did you forget a default constructor?"), e);
                    }
                }
            }
            c8128FUxA0h.A0C = true;
        }
        return c8128FUxA0h;
    }

    private void A05() {
        if (!getFitsSystemWindows()) {
            AbstractC8082FSn.A00(this, null);
            return;
        }
        FPU i10 = this.A09;
        if (i10 == null) {
            i10 = new I10(this, 1);
            this.A09 = i10;
        }
        AbstractC8082FSn.A00(this, i10);
        setSystemUiVisibility(1280);
    }

    public static void A06(Rect rect) {
        rect.setEmpty();
        A0N.AaC(rect);
    }

    private void A08(Rect rect, C8128FUx c8128FUx, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iA02 = BV5.A02(rect.left, (AbstractC7607F5u.A0F(this, width) - i) - ((ViewGroup.MarginLayoutParams) c8128FUx).rightMargin, getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8128FUx).leftMargin);
        int iA022 = BV5.A02(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c8128FUx).bottomMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c8128FUx).topMargin);
        rect.set(iA02, iA022, i + iA02, i2 + iA022);
    }

    private boolean A09(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.A0G;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Collections.sort(list, A0L);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnTouchEvent = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            Behavior behavior = AbstractC7607F5u.A0h(view).A0A;
            if (zOnTouchEvent) {
                if (actionMasked != 0 && behavior != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    if (i != 0) {
                        behavior.onTouchEvent(this, view, motionEventObtain);
                    } else {
                        behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                    }
                }
            } else if (behavior != null) {
                zOnTouchEvent = i != 0 ? behavior.onTouchEvent(this, view, motionEvent) : behavior.onInterceptTouchEvent(this, view, motionEvent);
                if (zOnTouchEvent) {
                    this.A07 = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = list.get(i4);
                            Behavior behavior2 = AbstractC7607F5u.A0h(view2).A0A;
                            if (behavior2 != null) {
                                if (motionEventObtain == null) {
                                    motionEventObtain = MotionEvent.obtain(motionEvent);
                                    motionEventObtain.setAction(3);
                                }
                                if (i != 0) {
                                    behavior2.onTouchEvent(this, view2, motionEventObtain);
                                } else {
                                    behavior2.onInterceptTouchEvent(this, view2, motionEventObtain);
                                }
                            }
                        }
                    }
                }
            }
        }
        list.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zOnTouchEvent;
    }

    public final void A0C(View view, int i) {
        Rect rectA01;
        Rect rectA012;
        int i2;
        C8128FUx c8128FUxA0h = AbstractC7607F5u.A0h(view);
        View view2 = c8128FUxA0h.A09;
        if (view2 != null) {
            rectA01 = A01();
            rectA012 = A01();
            try {
                HlB.A01(rectA01, view2, this);
                C8128FUx c8128FUx = (C8128FUx) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A07(rectA01, rectA012, c8128FUx, i, measuredWidth, measuredHeight);
                A08(rectA012, c8128FUx, measuredWidth, measuredHeight);
                view.layout(rectA012.left, rectA012.top, rectA012.right, rectA012.bottom);
                return;
            } finally {
                A06(rectA01);
                A06(rectA012);
            }
        }
        if (c8128FUxA0h.A05 != -1) {
            throw C3cG.A0Q("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        int i3 = c8128FUxA0h.A04;
        if (i3 < 0) {
            C8128FUx c8128FUxA0h2 = AbstractC7607F5u.A0h(view);
            rectA01 = A01();
            rectA01.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8128FUxA0h2).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c8128FUxA0h2).topMargin, AbstractC7607F5u.A0F(this, getWidth()) - ((ViewGroup.MarginLayoutParams) c8128FUxA0h2).rightMargin, AbstractC7609F5w.A0A(this) - ((ViewGroup.MarginLayoutParams) c8128FUxA0h2).bottomMargin);
            if (this.A02 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectA01.left += AbstractC7607F5u.A0i(this.A02).A01;
                rectA01.top += AbstractC7607F5u.A0i(this.A02).A03;
                rectA01.right -= AbstractC7607F5u.A0i(this.A02).A02;
                rectA01.bottom -= AbstractC7607F5u.A0i(this.A02).A00;
            }
            rectA012 = A01();
            int i4 = c8128FUxA0h2.A02;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA01, rectA012, i);
            view.layout(rectA012.left, rectA012.top, rectA012.right, rectA012.bottom);
            return;
        }
        C8128FUx c8128FUxA0h3 = AbstractC7607F5u.A0h(view);
        int i5 = c8128FUxA0h3.A02;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iA00 = A00(i3) - measuredWidth2;
        if (i6 == 1) {
            iA00 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iA00 += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = measuredHeight2;
            if (i7 != 80) {
                i2 = 0;
            }
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iA02 = BV5.A02(iA00, (AbstractC7607F5u.A0F(this, width) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c8128FUxA0h3).rightMargin, getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8128FUxA0h3).leftMargin);
        int iA022 = BV5.A02(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c8128FUxA0h3).bottomMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c8128FUxA0h3).topMargin);
        view.layout(iA02, iA022, measuredWidth2 + iA02, measuredHeight2 + iA022);
    }

    public final boolean A0E(View view, int i, int i2) {
        Rect rectA01 = A01();
        HlB.A01(rectA01, view, this);
        try {
            return rectA01.contains(i, i2);
        } finally {
            A06(rectA01);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final List<View> getDependencySortedChildren() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        A03();
        return Collections.unmodifiableList(this.A0F);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), AbstractC7609F5w.A0B(this));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), AbstractC7609F5w.A09(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
        if (this.A05) {
            if (this.A01 == null) {
                this.A01 = new FV1(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A01);
        }
        if (this.A02 == null && getFitsSystemWindows()) {
            requestApplyInsets();
        }
        this.A04 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
        if (this.A05 && this.A01 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A01);
        }
        View view = this.A08;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A04 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C8497Ff4 c8497Ff4;
        int i;
        super.onDraw(canvas);
        if (!this.A03 || this.A06 == null || (c8497Ff4 = this.A02) == null || (i = AbstractC7607F5u.A0i(c8497Ff4).A03) <= 0) {
            return;
        }
        this.A06.setBounds(0, 0, getWidth(), i);
        this.A06.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A04();
        }
        boolean zA09 = A09(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A04();
        }
        return zA09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int layoutDirection = getLayoutDirection();
        List<View> list = this.A0F;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            if (view.getVisibility() != 8 && ((behavior = AbstractC7607F5u.A0h(view).A0A) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                A0C(view, layoutDirection);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zA09;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.A07;
        boolean z = false;
        if (view != null) {
            Behavior behavior = AbstractC7607F5u.A0h(view).A0A;
            zA09 = behavior != null ? behavior.onTouchEvent(this, this.A07, motionEvent) : false;
        } else {
            zA09 = A09(motionEvent, 1);
            if (actionMasked != 0 && zA09) {
                z = true;
            }
        }
        if (this.A07 == null || actionMasked == 3) {
            zA09 |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A04();
        }
        return zA09;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = AbstractC7607F5u.A0h(view).A0A;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.A0A) {
            return;
        }
        if (this.A07 == null) {
            int childCount = getChildCount();
            MotionEvent motionEventA0L = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Behavior behavior = AbstractC7607F5u.A0h(childAt).A0A;
                if (behavior != null) {
                    if (motionEventA0L == null) {
                        motionEventA0L = AbstractC7611F5y.A0L();
                    }
                    behavior.onInterceptTouchEvent(this, childAt, motionEventA0L);
                }
            }
            if (motionEventA0L != null) {
                motionEventA0L.recycle();
            }
        }
        A04();
        this.A0A = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A05();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean zA1M = AnonymousClass002.A1M(i);
        Drawable drawable = this.A06;
        if (drawable == null || drawable.isVisible() == zA1M) {
            return;
        }
        this.A06.setVisible(zA1M, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A06;
    }

    public final void A0D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.A0F = C3cG.A0h();
        this.A0C = new Hhu<>();
        this.A0G = C3cG.A0h();
        this.A0H = new int[2];
        this.A0I = new int[2];
        this.A0D = new int[2];
        this.A0E = new Hqj();
        int[] iArr = FV6.A00;
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style._name_removed__res_0x7f13011e);
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, R.style._name_removed__res_0x7f13011e);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.A0B = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int[] iArr2 = this.A0B;
            int length = iArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        this.A06 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        A05();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC8129FUz(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8128FUx(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._name_removed__res_0x7f04016c);
    }
}

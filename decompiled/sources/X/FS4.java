package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class FS4 extends RecyclerView implements FU9 {
    public static final int[] A08 = {0, 0};
    public C8053FRg A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public ArrayList<FS5> A05;
    public boolean A06;
    public final Hqj A07;

    public FS4(Context context) {
        super(context, null);
        this.A03 = true;
        this.A01 = false;
        this.A04 = 0;
        this.A02 = true;
        this.A07 = new Hqj();
    }

    private void A01(int[] iArr, int i, int i2, int i3) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        RecyclerView.A0J(null, this, i, i2);
        this.A06 = true;
        ArrayList<FS5> arrayList = this.A05;
        if (arrayList != null) {
            Iterator<FS5> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().A01(this, 1);
            }
        }
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        if (iArr != null) {
            AbstractC7607F5u.A1T(iArr, 0, scrollX2);
            AbstractC7607F5u.A1T(iArr, 1, scrollY2);
        }
        A16(A08, iArr, 0, scrollX2, 0, scrollY2, i3);
    }

    @Override // X.FU2
    public final void AUF(View view, int i, int i2, int i3, int i4, int i5) {
        A01(null, i3, i4, i5);
    }

    @Override // X.FU2
    public final void AWH(View view, int i) {
        setIsScrollEnabled(true);
        Hqj hqj = this.A07;
        if (i == 1) {
            hqj.A00 = 0;
        } else {
            hqj.A01 = 0;
        }
        if (getScrollState() == 1) {
            this.A06 = false;
            ArrayList<FS5> arrayList = this.A05;
            if (arrayList != null) {
                Iterator<FS5> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().A01(this, 0);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(final View view, View view2) {
        super.requestChildFocus(view, view2);
        final int i = this.A04;
        this.A04 = 0;
        boolean z = this.A0I instanceof FSF;
        if (view == null || i == 0 || z) {
            return;
        }
        final int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        final int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        post(new Runnable() { // from class: X.FFb
            public static final String __redex_internal_original_name = "RCRecyclerView$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                int top;
                int i2;
                int bottom;
                int height;
                int left;
                int i3;
                int right;
                int width;
                FS4 fs4 = this;
                int i4 = i;
                int i5 = verticalFadingEdgeLength;
                View view3 = view;
                int i6 = horizontalFadingEdgeLength;
                switch (i4) {
                    case 19:
                        if (i5 > 0 && (top = view3.getTop()) < i5) {
                            i2 = top - i5;
                            fs4.A0v(0, i2, false);
                            break;
                        }
                        break;
                    case 20:
                        if (i5 > 0 && (bottom = view3.getBottom()) > (height = fs4.getHeight() - i5)) {
                            i2 = bottom - height;
                            fs4.A0v(0, i2, false);
                            break;
                        }
                        break;
                    case 21:
                        if (i6 > 0 && (left = view3.getLeft()) < i6) {
                            i3 = left - i6;
                            fs4.A0v(i3, 0, false);
                            break;
                        }
                        break;
                    case 22:
                        if (i6 > 0 && (right = view3.getRight()) > (width = fs4.getWidth() - i6)) {
                            i3 = right - width;
                            fs4.A0v(i3, 0, false);
                            break;
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(ViewParent viewParent) {
        if (viewParent instanceof View) {
            ((View) viewParent).getTag();
        }
        if (viewParent != 0) {
            A00(viewParent.getParent());
        }
    }

    public static boolean A02(ViewParent viewParent) {
        if (viewParent instanceof InterfaceC8057FRl) {
            return ((View) ((InterfaceC8057FRl) viewParent)).isEnabled();
        }
        if (viewParent != null) {
            return A02(viewParent.getParent());
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void A10(FS5 fs5) {
        ArrayList<FS5> arrayListA0h = this.A05;
        if (arrayListA0h == null) {
            arrayListA0h = C3cG.A0h();
            this.A05 = arrayListA0h;
        }
        arrayListA0h.add(fs5);
        super.A10(fs5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void A11(FS5 fs5) {
        ArrayList<FS5> arrayList = this.A05;
        if (arrayList != null) {
            arrayList.remove(fs5);
        }
        super.A11(fs5);
    }

    @Override // X.FU2
    public final void AUE(View view, int[] iArr, int i, int i2, int i3) {
        A18(iArr, A08, i, i2, i3);
    }

    @Override // X.FU2
    public final void AUH(View view, View view2, int i, int i2) {
        Hqj hqj = this.A07;
        if (i2 == 1) {
            hqj.A00 = i;
        } else {
            hqj.A01 = i;
        }
    }

    @Override // X.FU2
    public final boolean AWB(View view, View view2, int i, int i2) {
        if (!(view2 instanceof FS6)) {
            return false;
        }
        setIsScrollEnabled(false);
        return true;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Hqj hqj = this.A07;
        return hqj.A01 | hqj.A00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getScrollState() {
        if (this.A06) {
            return 1;
        }
        return super.A04;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
        /*
            r2 = this;
            boolean r0 = r2.A03
            if (r0 == 0) goto L11
            boolean r0 = r2.A02
        L6:
            if (r0 == 0) goto Lf
        L8:
            boolean r1 = super.onInterceptTouchEvent(r3)
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            int r1 = r3.getAction()
            r0 = 2
            if (r1 != r0) goto L8
            boolean r0 = r2.A01
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FS4.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A02 && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A02 && super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setIsScrollEnabled(boolean z) {
        boolean z2 = this.A02;
        if (z2 != z) {
            this.A02 = z;
            if (z2) {
                this.A00 = AbstractC8060FRo.A00(this);
            }
            if (!this.A02) {
                AbstractC8060FRo.A06(this, new HnU(this, this));
            } else {
                AbstractC8060FRo.A06(this, this.A00);
                this.A00 = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x012a, code lost:
    
        if (r1 > (r6 - r0)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ef, code lost:
    
        if (r11 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0114, code lost:
    
        if (r1 < r0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FS4.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(getParent());
        this.A01 = A02(getParent());
        boolean z2 = true;
        if (!canScrollVertically(1) && !canScrollVertically(-1) && !canScrollHorizontally(1) && !canScrollHorizontally(-1)) {
            z2 = false;
        }
        this.A03 = z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        dispatchNestedFling(f, f2, z);
        if (!RecyclerView.A0e(this, (int) (-f), (int) (-f2), this.A0w, this.A0v)) {
            return false;
        }
        this.A06 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // X.FU9
    public final void AUG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A01(iArr, i3, i4, i5);
    }
}

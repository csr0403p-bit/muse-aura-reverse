package X;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Scroller;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class FS7 extends ViewGroup {
    public int A00;
    public View A01;
    public C8006FPa A02;
    public FSE A03;
    public InterfaceC8012FPj A04;
    public InterfaceC8012FPj A05;
    public FS8 A06;
    public HashMap<FSE, List<FSE>> A07;
    public List<FSE> A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public FSE[] A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final List<FSC> A0J;
    public final Set<FSE> A0K;
    public final Hqj A0L;
    public final boolean A0M;

    public FS7(Context context) {
        super(context);
        this.A0L = new Hqj();
        this.A0C = true;
        this.A0I = true;
        this.A0K = C60O.A13();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.A0J = copyOnWriteArrayList;
        this.A09 = true;
        this.A0A = true;
        this.A00 = -1;
        this.A0D = false;
        this.A0M = true;
        FS9 fs9 = new FS9(this);
        if (this.A06 == null) {
            this.A06 = new FS8(getContext(), this, fs9);
        }
        copyOnWriteArrayList.add(new FOk(this));
    }

    public final void A03(FSE[] fseArr, boolean z) {
        FSE fseA00 = null;
        this.A0E = (FSE[]) Arrays.copyOf(fseArr, fseArr.length);
        FSE fseA002 = this.A03;
        if (fseA002 != null) {
            if (this.A01 != null) {
                int height = getHeight();
                List list = Collections.EMPTY_LIST;
                View view = this.A01;
                fseA00 = A00(view, this, list, this.A03.AIt(view, height), height);
            }
            this.A03 = fseA00;
            fseA002 = fseA00;
        }
        if (z) {
            if (fseA002 == null) {
                List list2 = Collections.EMPTY_LIST;
                View view2 = this.A01;
                if (view2 == null || !view2.isLaidOut()) {
                    return;
                }
                int height2 = getHeight();
                fseA002 = A00(view2, this, list2, AbstractC7607F5u.A0E(view2, height2), height2);
                if (fseA002 == null) {
                    return;
                }
            }
            A02(fseA002, this.A00, false);
        }
    }

    public static FSE A00(View view, FS7 fs7, List list, int i, int i2) {
        int iA0B;
        if (fs7.A0E == null || view == null || !view.isLaidOut()) {
            return null;
        }
        HashSet hashSet = new HashSet(list);
        hashSet.addAll(fs7.A0K);
        int i3 = Integer.MAX_VALUE;
        FSE fse = null;
        for (FSE fse2 : fs7.A0E) {
            if (!hashSet.contains(fse2) && (iA0B = AbstractC7607F5u.A0B(fse2.AIt(view, i2), i)) < i3) {
                fse = fse2;
                i3 = iA0B;
            }
        }
        HashMap<FSE, List<FSE>> map = fs7.A07;
        if (map != null) {
            if (!map.containsKey(fse)) {
                fs7.A08 = null;
                fs7.A04 = null;
                return fse;
            }
            fs7.A08 = fs7.A07.get(fse);
            fs7.A04 = fs7.A05;
        }
        return fse;
    }

    private boolean A01(int i, int i2) {
        int iAIt;
        View view = this.A01;
        if (getNestedScrollAxes() == 1) {
            if (i2 != 0 && Math.abs(i) / Math.abs(i2) <= 0.7f) {
                return true;
            }
        } else if (view != null) {
            int height = getHeight();
            FSE[] fseArr = this.A0E;
            if (fseArr == null || fseArr.length <= 0) {
                iAIt = 0;
            } else {
                iAIt = height - fseArr[0].AIt(view, height);
                int length = this.A0E.length;
                for (int i3 = 1; i3 < length; i3++) {
                    iAIt = C8j3.A0F(height, this.A0E[i3].AIt(view, height), iAIt);
                }
            }
            if (view.getBottom() > height && view.getTop() > iAIt) {
                return true;
            }
        }
        return false;
    }

    public final void A02(FSE fse, final int i, final boolean z) {
        final View view = this.A01;
        if (view != null) {
            this.A03 = fse;
            Runnable runnable = new Runnable() { // from class: X.FSA
                public static final String __redex_internal_original_name = "FoaSlidingViewGroup$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    FS7 fs7 = this;
                    View view2 = view;
                    boolean z2 = z;
                    int i2 = i;
                    if (fs7.A03 != null) {
                        int height = fs7.getHeight();
                        int iAIt = height - fs7.A03.AIt(view2, height);
                        FS8 fs8 = fs7.A06;
                        int i3 = fs8.A03;
                        if (z2) {
                            view2.offsetTopAndBottom(AbstractC7607F5u.A0E(view2, iAIt));
                            Iterator<FSC> it = fs7.A0J.iterator();
                            while (it.hasNext()) {
                                it.next().AUm(view2, fs7.getHeight());
                            }
                            return;
                        }
                        fs8.A08 = view2;
                        fs8.A02 = -1;
                        if (FS8.A07(fs8, iAIt, 0, i2)) {
                            fs7.postInvalidateOnAnimation();
                            return;
                        }
                        List<FSC> list = fs7.A0J;
                        if (list.isEmpty() || i3 != 0) {
                            return;
                        }
                        Iterator<FSC> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().AUp(view2, fs7.A03);
                        }
                    }
                }
            };
            if (isLaidOut()) {
                runnable.run();
            } else {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8002FOw(this, viewTreeObserver, runnable));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            r6 = this;
            X.FS8 r3 = r6.A06
            int r0 = r3.A03
            r2 = 2
            if (r0 != r2) goto L53
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L5a
            android.widget.Scroller r0 = r3.A0A
            boolean r5 = r0.computeScrollOffset()
            android.widget.Scroller r0 = r3.A0A
            int r4 = r0.getCurrY()
            android.view.View r0 = r3.A08
            int r0 = X.AbstractC7607F5u.A0E(r0, r4)
            if (r0 <= 0) goto L5b
            int r0 = r3.A04
            int r4 = java.lang.Math.min(r4, r0)
        L25:
            android.view.View r0 = r3.A08
            int r1 = X.AbstractC7607F5u.A0E(r0, r4)
            if (r1 == 0) goto L39
            android.view.View r0 = r3.A08
            r0.offsetTopAndBottom(r1)
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r1 = r3.A0H
            android.view.View r0 = r3.A08
            r1.A00(r0)
        L39:
            if (r5 == 0) goto L4c
            int r0 = r3.A04
            if (r4 != r0) goto L53
            android.widget.Scroller r0 = r3.A0A
            r0.abortAnimation()
            android.widget.Scroller r0 = r3.A0A
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L53
        L4c:
            android.view.ViewGroup r1 = r3.A0G
            java.lang.Runnable r0 = r3.A0I
            r1.post(r0)
        L53:
            int r0 = r3.A03
            if (r0 != r2) goto L5a
            r6.postInvalidateOnAnimation()
        L5a:
            return
        L5b:
            if (r0 >= 0) goto L25
            int r0 = r3.A04
            int r4 = java.lang.Math.max(r4, r0)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FS7.computeScroll():void");
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Hqj hqj = this.A0L;
        return hqj.A01 | hqj.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0 A[PHI: r1 r3
  0x00f0: PHI (r1v4 android.view.View) = (r1v3 android.view.View), (r1v11 android.view.View) binds: [B:58:0x00ee, B:31:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r3v2 int) = (r3v1 int), (r3v5 int) binds: [B:58:0x00ee, B:31:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FS7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FSE fse;
        View view = this.A01;
        if (view != null) {
            int top = !this.A0I ? view.getTop() : getHeight();
            int measuredHeight = view.getMeasuredHeight() + top;
            if (this.A0M) {
                measuredHeight = Math.max(getHeight(), measuredHeight);
            }
            view.layout(0, top, getWidth(), measuredHeight);
            boolean zA1P = AnonymousClass002.A1P(view.getMeasuredHeight(), this.A0F);
            this.A0F = view.getMeasuredHeight();
            if ((z || zA1P) && (fse = this.A03) != null) {
                A02(fse, this.A00, this.A0D);
            }
            List<FSC> list = this.A0J;
            if (!list.isEmpty()) {
                Iterator<FSC> it = list.iterator();
                while (it.hasNext()) {
                    it.next().AUm(view, getHeight());
                }
            }
            this.A0I = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A09 || z) {
            return false;
        }
        FS8 fs8 = this.A06;
        View view2 = this.A01;
        fs8.A08 = view2;
        fs8.A0B = true;
        fs8.A0H.A01(view2, -f2);
        fs8.A0B = false;
        if (fs8.A03 != 1) {
            return true;
        }
        fs8.A09(0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.A09 || !A01((int) f, (int) f2)) {
            return false;
        }
        FS8 fs8 = this.A06;
        View view2 = this.A01;
        fs8.A08 = view2;
        fs8.A0B = true;
        fs8.A0H.A01(view2, -f2);
        fs8.A0B = false;
        if (fs8.A03 != 1) {
            return true;
        }
        fs8.A09(0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A09 && A01(i, i2)) {
            FS8 fs8 = this.A06;
            int i3 = -i;
            int i4 = -i2;
            View view2 = fs8.A08;
            if (view2 != null) {
                int left = view2.getLeft() + i3;
                int top = fs8.A08.getTop() + i4;
                FS8.A05(fs8, i3, i4);
                View view3 = fs8.A08;
                if (view3 != null && iArr != null) {
                    int left2 = left - view3.getLeft();
                    int iA0E = AbstractC7607F5u.A0E(fs8.A08, top);
                    iArr[0] = left2 - i3;
                    iArr[1] = iA0E - i4;
                }
            }
            if (getNestedScrollAxes() != 1 || iArr[1] == 0) {
                return;
            }
            iArr[0] = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A09) {
            FS8 fs8 = this.A06;
            int i5 = -i3;
            int i6 = -i4;
            View view2 = fs8.A08;
            if (view2 != null) {
                view2.getLeft();
                fs8.A08.getTop();
                FS8.A05(fs8, i5, i6);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0L.A01 = i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z = false;
        if (!this.A0H) {
            z = true;
            this.A0H = true;
            FS8 fs8 = this.A06;
            View view3 = this.A01;
            if (fs8.A07 == null) {
                fs8.A07 = VelocityTracker.obtain();
            }
            fs8.A09(1);
            fs8.A08 = view3;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.A0L.A01 = 0;
        this.A0H = false;
        FS8 fs8 = this.A06;
        fs8.A08 = this.A01;
        if (fs8.A03 != 2) {
            FS8.A02(fs8, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0221, code lost:
    
        if (r5.A03 == 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        r0 = r5.A07;
        r9 = r5.A00;
        r0.computeCurrentVelocity(1000, r9);
        r5.A07.getXVelocity(r5.A02);
        r4 = r5.A01;
        r3 = r5.A07.getYVelocity(r5.A02);
        r2 = java.lang.Math.abs(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (r2 >= r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        r9 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        X.FS8.A02(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010c, code lost:
    
        if (r2 <= r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0110, code lost:
    
        if (r3 > 0.0f) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0112, code lost:
    
        r3 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0113, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FS7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDismissFriction(float f) {
        FS8 fs8 = this.A06;
        fs8.A0A.setFriction(f);
        Scroller scroller = fs8.A09;
        if (scroller != fs8.A0A) {
            scroller.setFriction(f);
        }
    }

    public void setInteractable(boolean z) {
        this.A0C = z;
        if (z) {
            return;
        }
        this.A06.A08();
    }

    public void setSlideToAnchorImmediately(boolean z) {
        this.A0D = z;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw C3cG.A0Q("FoaSlidingViewGroup only supports a single child");
        }
        if (this.A0F > 0) {
            view.setTop(getHeight() - this.A0F);
        }
        this.A0F = 0;
        super.addView(view, i, layoutParams);
        this.A01 = view;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        if (this.A0B) {
            View view = this.A01;
            if (this.A0E == null || view == null) {
                iMax = 0;
            } else {
                int measuredHeight = getMeasuredHeight();
                iMax = 0;
                for (FSE fse : this.A0E) {
                    iMax = Math.max(iMax, fse.AIt(view, measuredHeight));
                }
            }
            measureChildren(i, View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE));
        }
    }
}

package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FUL {
    public static final Interpolator A0M = new FUU();
    public float A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public Interpolator A07;
    public boolean A08;
    public float[] A09;
    public float[] A0A;
    public float[] A0B;
    public float[] A0C;
    public int[] A0D;
    public int[] A0E;
    public int[] A0F;
    public VelocityTracker A0G;
    public final float A0H;
    public final ViewGroup A0I;
    public final FUN A0J;
    public final OverScroller A0K;
    public int A01 = -1;
    public final Runnable A0L = new FUQ(this);

    private final void A03() {
        this.A01 = -1;
        float[] fArr = this.A09;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0A, 0.0f);
            Arrays.fill(this.A0B, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0F, 0);
            Arrays.fill(this.A0D, 0);
            Arrays.fill(this.A0E, 0);
            this.A04 = 0;
        }
        VelocityTracker velocityTracker = this.A0G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0G = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L3a
            X.FUN r3 = r5.A0J
            boolean r0 = r3 instanceof X.FVZ
            if (r0 == 0) goto L38
            int r0 = r6.getWidth()
        Ld:
            r2 = 1
            boolean r1 = X.AnonymousClass002.A1N(r0)
            int r0 = r3.A00()
            boolean r0 = X.AnonymousClass002.A1N(r0)
            if (r1 == 0) goto L2f
            if (r0 == 0) goto L2a
            float r7 = r7 * r7
            float r8 = r8 * r8
            float r7 = r7 + r8
            int r0 = r5.A05
            int r0 = r0 * r0
        L24:
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3a
            return r2
        L2a:
            float r7 = java.lang.Math.abs(r7)
            goto L35
        L2f:
            if (r0 == 0) goto L3a
            float r7 = java.lang.Math.abs(r8)
        L35:
            int r0 = r5.A05
            goto L24
        L38:
            r0 = 0
            goto Ld
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FUL.A07(android.view.View, float, float):boolean");
    }

    private int A00(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.A0I.getWidth();
        float fAbs = Math.abs(i);
        float f = width / 2;
        float fSin = f + (((float) Math.sin((Math.min(1.0f, fAbs / width) - 0.5f) * 0.47123894f)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? AbstractC7607F5u.A09(Math.abs(fSin / iAbs), 1000.0f) * 4 : (int) (((fAbs / i3) + 1.0f) * 256.0f), 600);
    }

    private final View A01(int i, int i2) {
        ViewGroup viewGroup = this.A0I;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    private void A02() throws Resources.NotFoundException {
        VelocityTracker velocityTracker = this.A0G;
        float f = this.A0H;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.A0G.getXVelocity(this.A01);
        float f2 = this.A00;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.A0G.getYVelocity(this.A01);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            yVelocity = -f;
            f = yVelocity;
        }
        this.A08 = true;
        this.A0J.A02(this.A06, xVelocity, f);
        this.A08 = false;
        if (this.A02 == 1) {
            A0A(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A04(float f, float f2, int i) {
        float[] fArr = this.A09;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0A;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0B;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0C;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0F;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0D;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0E;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A09 = fArr2;
            fArr = fArr2;
            this.A0A = fArr3;
            this.A0B = fArr4;
            this.A0C = fArr5;
            this.A0F = iArr;
            this.A0D = iArr2;
            this.A0E = iArr3;
        }
        this.A0B[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A0A;
        this.A0C[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0F;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.A0I;
        int left = viewGroup.getLeft();
        int i5 = this.A03;
        boolean zA1T = C8j3.A1T(i3, left + i5);
        int i6 = zA1T;
        if (i4 < viewGroup.getTop() + i5) {
            i6 = (zA1T ? 1 : 0) | 4;
        }
        int i7 = i6;
        if (i3 > viewGroup.getRight() - i5) {
            i7 = (i6 == true ? 1 : 0) | 2;
        }
        int i8 = i7;
        if (i4 > viewGroup.getBottom() - i5) {
            i8 = (i7 == true ? 1 : 0) | 8;
        }
        iArr7[i] = i8;
        this.A04 |= 1 << i;
    }

    private void A05(int i) {
        float[] fArr = this.A09;
        if (fArr != null) {
            int i2 = this.A04;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.A0A[i] = 0.0f;
                this.A0B[i] = 0.0f;
                this.A0C[i] = 0.0f;
                this.A0F[i] = 0;
                this.A0D[i] = 0;
                this.A0E[i] = 0;
                this.A04 = (i3 ^ (-1)) & i2;
            }
        }
    }

    private final boolean A08(View view, int i) {
        Reference reference;
        WeakReference<View> weakReference;
        View viewA0c;
        if (view == this.A06 && this.A01 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        FUN fun = this.A0J;
        if (fun instanceof FVi) {
            BottomSheetBehavior bottomSheetBehavior = ((FVi) fun).A00;
            int i2 = bottomSheetBehavior.A0G;
            if (i2 == 1 || bottomSheetBehavior.A0X) {
                return false;
            }
            if ((i2 == 3 && bottomSheetBehavior.A03 == i && (weakReference = bottomSheetBehavior.A0L) != null && (viewA0c = AbstractC7607F5u.A0c(weakReference)) != null && viewA0c.canScrollVertically(-1)) || (reference = bottomSheetBehavior.A0M) == null || reference.get() != view) {
                return false;
            }
        } else {
            FVZ fvz = (FVZ) fun;
            int i3 = fvz.A00;
            if (i3 != -1 && i3 != i) {
                return false;
            }
            if ((fvz.A02 instanceof BaseTransientBottomBar$Behavior) && !(view instanceof FW2)) {
                return false;
            }
        }
        this.A01 = i;
        A0C(view, i);
        return true;
    }

    public static boolean A09(FUL ful, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        int i5 = i3;
        int i6 = i4;
        int left = ful.A06.getLeft();
        int top = ful.A06.getTop();
        int i7 = i - left;
        int i8 = i2 - top;
        if (i7 == 0 && i8 == 0) {
            ful.A0K.abortAnimation();
            ful.A0A(0);
            return false;
        }
        View view = ful.A06;
        int i9 = (int) ful.A00;
        int i10 = (int) ful.A0H;
        int iAbs = Math.abs(i5);
        if (iAbs < i9) {
            i5 = 0;
        } else if (iAbs > i10) {
            i5 = i3 > 0 ? i10 : -i10;
        }
        int iAbs2 = Math.abs(i6);
        if (iAbs2 < i9) {
            i6 = 0;
        } else if (iAbs2 > i10) {
            i6 = i4 > 0 ? i10 : -i10;
        }
        int iAbs3 = Math.abs(i7);
        int iAbs4 = Math.abs(i8);
        int iAbs5 = Math.abs(i5);
        int iAbs6 = Math.abs(i6);
        int i11 = iAbs5 + iAbs6;
        float f = iAbs3;
        float f2 = iAbs3 + iAbs4;
        float f3 = f2;
        if (i5 != 0) {
            f = iAbs5;
            f2 = i11;
        }
        float f4 = f / f2;
        float f5 = iAbs4;
        if (i6 != 0) {
            f5 = iAbs6;
            f3 = i11;
        }
        float f6 = f5 / f3;
        ful.A07 = A0M;
        ful.A0K.startScroll(left, top, i7, i8, (int) ((ful.A00(i7, i5, ful.A0J instanceof FVZ ? view.getWidth() : 0) * f4) + (ful.A00(i8, i6, r2.A00()) * f6)));
        ful.A0A(2);
        return true;
    }

    public final void A0A(int i) throws Resources.NotFoundException {
        this.A0I.removeCallbacks(this.A0L);
        if (this.A02 != i) {
            this.A02 = i;
            FUN fun = this.A0J;
            if (fun instanceof FVi) {
                FVi fVi = (FVi) fun;
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = fVi.A00;
                    if (bottomSheetBehavior.A0O) {
                        bottomSheetBehavior.A0A(1);
                    }
                }
            } else {
                FVc fVc = ((FVZ) fun).A02.A04;
                if (fVc != null) {
                    FW5 fw5A00 = FW5.A00();
                    FVe fVe = ((FVb) fVc).A00.A07;
                    if (i != 0) {
                        fw5A00.A05(fVe);
                    } else {
                        fw5A00.A06(fVe);
                    }
                }
            }
            if (this.A02 == 0) {
                this.A06 = null;
            }
        }
    }

    public final boolean A0D() {
        if (this.A02 == 2) {
            OverScroller overScroller = this.A0K;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.A06.getLeft();
            int iA0E = AbstractC7607F5u.A0E(this.A06, currY);
            if (left != 0) {
                this.A06.offsetLeftAndRight(left);
            }
            if (iA0E != 0) {
                this.A06.offsetTopAndBottom(iA0E);
            }
            if (left != 0 || iA0E != 0) {
                this.A0J.A03(this.A06, currX);
            }
            if (!zComputeScrollOffset) {
                this.A0I.post(this.A0L);
            } else if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                this.A0I.post(this.A0L);
            }
        }
        return this.A02 == 2;
    }

    public final boolean A0E(int i, int i2) {
        if (this.A08) {
            return A09(this, i, i2, (int) this.A0G.getXVelocity(this.A01), (int) this.A0G.getYVelocity(this.A01));
        }
        throw C3cG.A0Q("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public FUL(Context context, ViewGroup viewGroup, FUN fun) {
        if (fun == null) {
            throw BV4.A0a("Callback may not be null");
        }
        this.A0I = viewGroup;
        this.A0J = fun;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A03 = (int) ((C60Q.A0B(context).density * 20.0f) + 0.5f);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A0H = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A00 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A07 = A0M;
        this.A0K = new OverScroller(context, new FUO(this));
    }

    private void A06(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (((1 << pointerId) & this.A04) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0B[pointerId] = x;
                this.A0C[pointerId] = y;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        A02();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FUL.A0B(android.view.MotionEvent):void");
    }

    public final void A0C(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0I;
        if (parent != viewGroup) {
            throw C60O.A0i(C3cJ.A0M("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup));
        }
        this.A06 = view;
        this.A01 = i;
        FUN fun = this.A0J;
        if (fun instanceof FVZ) {
            FVZ fvz = (FVZ) fun;
            fvz.A00 = i;
            fvz.A01 = view.getLeft();
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        }
        A0A(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[PHI: r1 r4
  0x0119: PHI (r1v4 android.view.View) = (r1v3 android.view.View), (r1v13 android.view.View) binds: [B:67:0x00f7, B:73:0x0117] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:67:0x00f7, B:73:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0F(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FUL.A0F(android.view.MotionEvent):boolean");
    }
}

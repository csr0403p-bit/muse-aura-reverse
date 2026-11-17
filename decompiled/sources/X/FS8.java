package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FS8 {
    public float A00;
    public float A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public Scroller A09;
    public Scroller A0A;
    public boolean A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public float[] A0F;
    public final ViewGroup A0G;
    public final ViewDragHelper$Callback A0H;
    public int A02 = -1;
    public final Runnable A0I = new FSB(this);

    public static void A02(FS8 fs8, float f) {
        fs8.A0B = true;
        fs8.A0H.A01(fs8.A08, f);
        fs8.A0B = false;
        if (fs8.A03 == 1) {
            fs8.A09(0);
        }
    }

    public final void A08() {
        this.A02 = -1;
        float[] fArr = this.A0C;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            Arrays.fill(this.A0F, 0.0f);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public static final View A00(FS8 fs8, int i, int i2) {
        ViewGroup viewGroup = fs8.A0G;
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

    public static void A03(FS8 fs8, float f, float f2, int i) {
        float[] fArr = fs8.A0C;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = fs8.A0D;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = fs8.A0E;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = fs8.A0F;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            fs8.A0C = fArr2;
            fArr = fArr2;
            fs8.A0D = fArr3;
            fs8.A0E = fArr4;
            fs8.A0F = fArr5;
        }
        fs8.A0E[i] = f;
        fArr[i] = f;
        float[] fArr9 = fs8.A0D;
        fs8.A0F[i] = f2;
        fArr9[i] = f2;
        fs8.A05 |= 1 << i;
    }

    public static void A04(FS8 fs8, int i) {
        float[] fArr = fs8.A0C;
        if (fArr == null || fArr.length <= i) {
            return;
        }
        fArr[i] = 0.0f;
        fs8.A0D[i] = 0.0f;
        fs8.A0E[i] = 0.0f;
        fs8.A0F[i] = 0.0f;
        fs8.A05 = ((1 << i) ^ (-1)) & fs8.A05;
    }

    public static void A05(FS8 fs8, int i, int i2) {
        View view = fs8.A08;
        if (view != null) {
            int left = view.getLeft();
            int top = fs8.A08.getTop();
            ViewDragHelper$Callback viewDragHelper$Callback = fs8.A0H;
            View view2 = fs8.A08;
            FS7 fs7 = ((FS9) viewDragHelper$Callback).A00;
            if (fs7.A04 != null) {
                i2 = (int) (i2 * 0.15f);
            }
            int iA02 = top + i2;
            if (i != 0) {
                view2.offsetLeftAndRight(-left);
            }
            if (i2 != 0) {
                View view3 = fs8.A08;
                if (fs7.A0E != null) {
                    int height = fs7.getHeight();
                    FSE fse = null;
                    FSE fse2 = null;
                    for (FSE fse3 : fs7.A0E) {
                        if (fse == null) {
                            fse = fse3;
                        } else {
                            int iAIt = fse3.AIt(view3, height);
                            if (iAIt >= fse2.AIt(view3, height)) {
                                if (iAIt > fse.AIt(view3, height)) {
                                    fse = fse3;
                                }
                            }
                        }
                        fse2 = fse3;
                    }
                    iA02 = height - BV5.A02(fse == null ? iA02 : fse.AIt(view3, height), height - iA02, fse2 == null ? iA02 : fse2.AIt(view3, height));
                }
                fs8.A08.offsetTopAndBottom(iA02 - top);
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            viewDragHelper$Callback.A00(fs8.A08);
        }
    }

    public static final boolean A06(View view, FS8 fs8, int i) {
        if (view == fs8.A08 && fs8.A02 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        fs8.A02 = i;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = fs8.A0G;
        if (parent != viewGroup) {
            throw C60O.A0i(C3cJ.A0M("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup));
        }
        fs8.A08 = view;
        fs8.A02 = i;
        fs8.A09(1);
        return true;
    }

    public static boolean A07(FS8 fs8, int i, int i2, int i3) {
        int iMin;
        int i4 = i3;
        View view = fs8.A08;
        if (view != null) {
            int left = view.getLeft();
            int top = fs8.A08.getTop();
            int i5 = -left;
            int i6 = i - top;
            if (i5 != 0 || i6 != 0) {
                if (i3 < 0) {
                    int i7 = (int) fs8.A01;
                    int i8 = (int) fs8.A00;
                    int iAbs = Math.abs(i2);
                    if (iAbs < i7) {
                        i2 = 0;
                    } else if (iAbs > i8) {
                        i2 = i2 > 0 ? i8 : -i8;
                    }
                    int iAbs2 = Math.abs(i5);
                    int iAbs3 = Math.abs(i6);
                    float f = i2 != 0 ? 1.0f : iAbs3 / (iAbs2 + iAbs3);
                    int height = ((FS9) fs8.A0H).A00.getHeight();
                    int width = fs8.A0G.getWidth();
                    if (i6 == 0) {
                        iMin = 0;
                    } else {
                        float f2 = iAbs3;
                        float f3 = width / 2;
                        float fSin = f3 + (((float) Math.sin((Math.min(1.0f, f2 / width) - 0.5f) * 0.4712389f)) * f3);
                        int iAbs4 = Math.abs(i2);
                        iMin = Math.min(iAbs4 > 0 ? AbstractC7607F5u.A09(Math.abs(fSin / iAbs4), 1000.0f) * 4 : (int) (((f2 / height) + 1.0f) * 256.0f), 600);
                    }
                    i4 = (int) (iMin * f);
                }
                fs8.A0A.startScroll(left, top, i5, i6, i4);
                fs8.A04 = top + i6;
                fs8.A09(2);
                return true;
            }
            fs8.A0A.abortAnimation();
            fs8.A09(0);
        }
        return false;
    }

    public final void A09(int i) {
        FSE fseA00;
        if (this.A03 != i) {
            this.A03 = i;
            FS7 fs7 = ((FS9) this.A0H).A00;
            View view = fs7.A01;
            if (view != null && view.isLaidOut()) {
                List<FSC> list = fs7.A0J;
                if (!list.isEmpty()) {
                    if (i == 0) {
                        List list2 = Collections.EMPTY_LIST;
                        View view2 = fs7.A01;
                        if (view2 == null || !view2.isLaidOut()) {
                            fseA00 = null;
                        } else {
                            int height = fs7.getHeight();
                            fseA00 = FS7.A00(view2, fs7, list2, AbstractC7607F5u.A0E(view2, height), height);
                        }
                        fs7.A03 = fseA00;
                        Iterator<FSC> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().AUp(view, fseA00);
                        }
                        fs7.requestLayout();
                    }
                    if (!list.isEmpty()) {
                        Iterator<FSC> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().ASh(i);
                        }
                    }
                }
            }
            if (i == 0) {
                this.A08 = null;
            }
        }
    }

    public final void A0A(Scroller scroller) {
        Scroller scroller2 = this.A0A;
        if (scroller != null) {
            if (scroller2 == scroller) {
                return;
            }
        } else if (scroller2 == this.A09) {
            return;
        }
        A08();
        if (this.A03 == 2) {
            this.A0A.getCurrX();
            this.A0A.getCurrY();
            this.A0A.abortAnimation();
            this.A0A.getCurrX();
            this.A0A.getCurrY();
            this.A0H.A00(this.A08);
        }
        A09(0);
        if (scroller == null) {
            scroller = this.A09;
        }
        this.A0A = scroller;
    }

    public FS8(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0G = viewGroup;
        this.A0H = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        context.getResources().getDisplayMetrics();
        this.A06 = viewConfiguration.getScaledTouchSlop();
        this.A00 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A0A = scroller;
        this.A09 = scroller;
    }

    public static void A01(MotionEvent motionEvent, FS8 fs8) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (((1 << pointerId) & fs8.A05) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                fs8.A0E[pointerId] = x;
                fs8.A0F[pointerId] = y;
            }
        }
    }
}

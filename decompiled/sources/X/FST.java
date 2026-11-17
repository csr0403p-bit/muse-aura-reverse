package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FST {
    public static final FrameLayout.LayoutParams A0d = new FrameLayout.LayoutParams(-1, -1);
    public float A00;
    public float A01;
    public float A04;
    public float A05;
    public int A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public ViewGroup.LayoutParams A0C;
    public ViewGroup A0D;
    public FSU A0E;
    public FSW A0F;
    public FSW A0G;
    public FSW A0H;
    public C8073FSb A0I;
    public Function0<Unit> A0K;
    public Function0<Unit> A0L;
    public G0U<? super MotionEvent, Unit> A0M;
    public G0U<? super MotionEvent, Unit> A0N;
    public G0U<? super MotionEvent, Unit> A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final int A0T;
    public final Context A0U;
    public final ScaleGestureDetector A0W;
    public final View A0X;
    public final OverScroller A0Y;
    public final F0C A0Z;
    public final F0C A0a;
    public final float A0b;
    public final FSS A0c;
    public int A07 = 255;
    public float A06 = 4.0f;
    public float A02 = 1.0f;
    public Integer A0J = C79.A00;
    public float A03 = 4.0f;
    public boolean A0S = true;
    public final PointF A0V = new PointF();

    public FST(Context context, View view) {
        this.A0U = context;
        this.A0X = view;
        this.A0Y = new OverScroller(context);
        this.A0T = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.A0b = 4.0f * C60Q.A0B(this.A0U).density;
        AbstractC8162FXe.A02("init() must be called on the main thread");
        FSX fsx = new FSX(new C8072FSa(Choreographer.getInstance()));
        FSW fswA00 = fsx.A00();
        fswA00.A02 = C8076FSf.A00(90.0d, 10.0d);
        fswA00.A01(1.0d);
        this.A0H = fswA00;
        FSW fswA002 = fsx.A00();
        fswA002.A02 = C8076FSf.A00(90.0d, 10.0d);
        this.A0F = fswA002;
        FSW fswA003 = fsx.A00();
        fswA003.A02 = C8076FSf.A00(90.0d, 10.0d);
        this.A0G = fswA003;
        FSS fss = new FSS(this);
        this.A0c = fss;
        Integer num = C79.A0C;
        this.A0a = FZO.A00(num, this, 4);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, fss);
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A0W = scaleGestureDetector;
        this.A0Z = FZO.A00(num, this, 3);
    }

    public static final void A02(FST fst) {
        FSW fsw;
        double d;
        FSW fsw2;
        fst.A0P = false;
        View view = fst.A0X;
        float fA02 = AbstractC7607F5u.A02(view) / 2.0f;
        float fA03 = AbstractC7607F5u.A03(view) / 2.0f;
        PointF pointF = fst.A0V;
        pointF.x = fA02;
        pointF.y = fA03;
        boolean z = fst.A0R;
        FSW fsw3 = fst.A0H;
        if (z) {
            fsw3.A01(1.0d);
            fsw = fst.A0F;
            d = 0.0d;
            fsw.A01(0.0d);
            fsw2 = fst.A0G;
        } else {
            fsw3.A01(fst.A02);
            fsw = fst.A0F;
            fsw.A01(fst.A04);
            fsw2 = fst.A0G;
            d = fst.A05;
        }
        fsw2.A01(d);
        fsw3.A09.remove(fst);
        fsw.A09.remove(fst);
        fsw2.A09.remove(fst);
        view.setHasTransientState(false);
        fst.A0C = null;
        fst.A09(C79.A00);
    }

    public static final HxE A00(FST fst, float f) {
        View view = fst.A0X;
        float fA02 = ((AbstractC7607F5u.A02(view) * f) - AbstractC7607F5u.A02(view)) / 2.0f;
        float fA03 = ((f * AbstractC7607F5u.A03(view)) - AbstractC7607F5u.A03(view)) / 2.0f;
        return C3cG.A0r(Float.valueOf(AnonymousClass001.A02(ATD.A0A(Float.valueOf(fst.A04), new C2Cy(-fA02, fA02)))), Float.valueOf(AnonymousClass001.A02(ATD.A0A(Float.valueOf(fst.A05), new C2Cy(-fA03, fA03)))));
    }

    public static final void A01(MotionEvent motionEvent, FST fst) {
        if (fst.A0P) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    return;
                }
            } else if (fst.A0R || fst.A0J != C79.A0P) {
                return;
            }
        } else if (fst.A0R || fst.A02 - 1.0f <= 0.05f) {
            return;
        }
        fst.A0P = true;
        FSU fsu = fst.A0E;
        if (fsu == null) {
            throw BV4.A0U();
        }
        fsu.getParent().requestDisallowInterceptTouchEvent(true);
    }

    public static final void A03(FST fst) {
        FSU fsu = fst.A0E;
        C8073FSb c8073FSb = fst.A0I;
        View view = fst.A0X;
        if (c8073FSb == null || c8073FSb.getChildCount() != 1) {
            return;
        }
        view.setHasTransientState(false);
        c8073FSb.detachViewFromParent(view);
        if (fsu != null) {
            fsu.attachViewToParent(view, 0, fst.A0C);
        }
        view.requestLayout();
        ViewGroup viewGroup = fst.A0D;
        if (viewGroup != null) {
            viewGroup.removeView(c8073FSb);
        }
        fst.A0I = null;
    }

    public static final void A04(FST fst, double d, double d2, double d3, boolean z) {
        fst.A09(C79.A01);
        fst.A0P = false;
        FSW fsw = fst.A0H;
        fsw.A09.add(fst);
        FSW fsw2 = fst.A0F;
        fsw2.A09.add(fst);
        FSW fsw3 = fst.A0G;
        fsw3.A09.add(fst);
        if (z) {
            fsw.A01(d);
            fsw2.A01(d2);
            fsw3.A01(d3);
        } else {
            fsw.A02(d);
            fsw2.A02(d2);
            fsw3.A02(d3);
        }
        if (fsw.A03() && fsw2.A03() && fsw3.A03()) {
            A02(fst);
        }
    }

    public static final boolean A05(FST fst, float f) {
        float f2 = fst.A02;
        View view = fst.A0X;
        float fA02 = ((f2 * AbstractC7607F5u.A02(view)) - AbstractC7607F5u.A02(view)) / 2.0f;
        float f3 = fst.A0b;
        float f4 = fA02 + f3;
        float f5 = -f4;
        float f6 = fst.A04;
        return f5 <= f6 && f6 <= f4 && Math.abs(f) > f3;
    }

    public static final boolean A06(FST fst, float f) {
        float f2 = fst.A02;
        View view = fst.A0X;
        float fA03 = ((f2 * AbstractC7607F5u.A03(view)) - AbstractC7607F5u.A03(view)) / 2.0f;
        float f3 = fst.A0b;
        float f4 = fA03 + f3;
        float f5 = -f4;
        float f6 = fst.A05;
        return f5 <= f6 && f6 <= f4 && Math.abs(f) > f3;
    }

    public final void A07() {
        if (this.A0J == C79.A01) {
            A08((float) this.A0H.A05.A00);
            float f = this.A02;
            if (Float.isNaN(f)) {
                f = 1.0f;
            }
            View view = this.A0X;
            view.setScaleX(f);
            view.setScaleY(f);
            float f2 = (float) this.A0F.A05.A00;
            this.A04 = f2;
            float f3 = (float) this.A0G.A05.A00;
            this.A05 = f3;
            view.setTranslationX(f2);
            view.setTranslationY(f3);
        }
    }

    public final void A08(float f) {
        float fA03 = ATD.A03(f, 0.0f, this.A06);
        if (fA03 != this.A02) {
            this.A02 = fA03;
            Drawable drawable = this.A0B;
            if (drawable != null) {
                float f2 = fA03 - 1.0f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f3 = this.A06 - 1.0f;
                if (f3 < Float.MIN_VALUE) {
                    f3 = Float.MIN_VALUE;
                }
                int iA01 = Ab3.A01(((f2 / f3) * this.A07) + this.A08);
                if (iA01 < 0) {
                    iA01 = 0;
                } else if (iA01 > 255) {
                    iA01 = 255;
                }
                drawable.setAlpha(iA01);
            }
        }
    }

    public final void A09(Integer num) {
        Function0<Unit> function0;
        if (this.A0J != num) {
            this.A0J = num;
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                function0 = this.A0K;
            } else if (iIntValue != 2) {
                return;
            } else {
                function0 = this.A0L;
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}

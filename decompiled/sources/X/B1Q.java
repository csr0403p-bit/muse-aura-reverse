package X;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class B1Q extends View {
    public static final int[] A05 = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] A06 = new int[0];
    public B1R A00;
    public Boolean A01;
    public Long A02;
    public Runnable A03;
    public Function0<Unit> A04;

    public final void A00() {
        this.A04 = null;
        Runnable runnable = this.A03;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.A03;
            C7384Etj.A0X(runnable2);
            runnable2.run();
        } else {
            B1R b1r = this.A00;
            if (b1r != null) {
                b1r.setState(A06);
            }
        }
        B1R b1r2 = this.A00;
        if (b1r2 != null) {
            b1r2.setVisible(false, false);
            unscheduleDrawable(b1r2);
        }
    }

    public final void A01() {
        setRippleState(false);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AWp;ZJIJFLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public final void A03(AWp aWp, Function0 function0, float f, int i, long j, long j2, boolean z) {
        float fCenterX;
        float fCenterY;
        B1R b1r = this.A00;
        if (b1r == null || !Boolean.valueOf(z).equals(this.A01)) {
            b1r = new B1R(z);
            setBackground(b1r);
            this.A00 = b1r;
            this.A01 = Boolean.valueOf(z);
        }
        C7384Etj.A0X(b1r);
        this.A04 = function0;
        A02(f, i, j, j2);
        if (z) {
            long j3 = aWp.A00;
            fCenterX = AnonymousClass003.A03(j3);
            fCenterY = AnonymousClass004.A00(j3);
        } else {
            fCenterX = b1r.getBounds().centerX();
            fCenterY = b1r.getBounds().centerY();
        }
        b1r.setHotspot(fCenterX, fCenterY);
        setRippleState(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public static final void setRippleState$lambda$1(B1Q b1q) {
        B1R b1r = b1q.A00;
        if (b1r != null) {
            b1r.setState(A06);
        }
        b1q.A03 = null;
    }

    public final void A02(float f, int i, long j, long j2) {
        B1R b1r = this.A00;
        if (b1r != null) {
            Integer num = b1r.A01;
            if (num == null || num.intValue() != i) {
                b1r.A01 = Integer.valueOf(i);
                b1r.setRadius(i);
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            long jA04 = HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), f);
            B6A b6a = b1r.A00;
            if (b6a == null || b6a.A00 != jA04) {
                b1r.A00 = C60P.A04(jA04);
                b1r.setColor(ColorStateList.valueOf(HxS.A01(jA04)));
            }
            Rect rect = new Rect(0, 0, Ab3.A01(AnonymousClass003.A03(j)), Ab3.A01(AWA.A00(j)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            b1r.setBounds(rect);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0<Unit> function0 = this.A04;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    private final void setRippleState(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.A03;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        long jA01 = jCurrentAnimationTimeMillis - C60P.A01(this.A02);
        if (z) {
            iArr = A05;
        } else {
            if (jA01 < 5) {
                Runnable runnable2 = new Runnable() { // from class: X.B1S
                    public static final String __redex_internal_original_name = "RippleHostView$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        B1Q.setRippleState$lambda$1(this.A00);
                    }
                };
                this.A03 = runnable2;
                postDelayed(runnable2, 50L);
                this.A02 = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = A06;
        }
        B1R b1r = this.A00;
        if (b1r != null) {
            b1r.setState(iArr);
        }
        this.A02 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            A00();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

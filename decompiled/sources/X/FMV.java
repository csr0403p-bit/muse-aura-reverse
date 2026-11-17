package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;

/* loaded from: classes6.dex */
public final class FMV extends Drawable implements Animatable {
    public static final TimeInterpolator A07;
    public static final TimeInterpolator A08;
    public static final ArgbEvaluator A09 = new ArgbEvaluator();
    public static final FMX A0A;
    public boolean A00;
    public final Paint A01;
    public final float A02;
    public final ValueAnimator.AnimatorUpdateListener A03;
    public final ValueAnimator A04;
    public final RectF A05;
    public final Integer A06;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        int iIntValue = this.A06.intValue();
        if (iIntValue == 0) {
            RectF rectF = this.A05;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A01);
        } else {
            if (iIntValue != 1) {
                throw C3cG.A0q();
            }
            RectF rectF2 = this.A05;
            float f = this.A02;
            canvas.drawRoundRect(rectF2, f, f, this.A01);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        this.A05.set(rect);
    }

    static {
        FMX fmxA4K = FQX.A00(EnumC7995FOo.A02).A4K(C79.A0Y);
        A0A = fmxA4K;
        A07 = new FMY();
        A08 = new PathInterpolator(fmxA4K.A00, fmxA4K.A01, fmxA4K.A02, fmxA4K.A03);
    }

    public FMV(FMW fmw, FMO fmo, FMO fmo2, Integer num, float f, int i, int i2, boolean z) {
        long jA04;
        float f2;
        float f3;
        long j = 200;
        this.A06 = num;
        C8918Fta c8918Fta = new C8918Fta(this, i2, 1);
        this.A03 = c8918Fta;
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A01 = paintA0T;
        this.A05 = AbstractC7607F5u.A0Y();
        AbstractC7607F5u.A1G(paintA0T);
        paintA0T.setAntiAlias(true);
        this.A02 = f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A04 = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(c8918Fta);
        if (fmw == FMW.A02) {
            jA04 = i % fmw.orderedElementCount;
        } else {
            jA04 = ATD.A04(i, 0, fmw.orderedElementCount - 1);
            j = fmw.staggerIntervalMs;
        }
        valueAnimator.setStartDelay(jA04 * j);
        valueAnimator.setDuration(fmw.totalDurationMs);
        valueAnimator.setInterpolator(fmw.interpolator);
        valueAnimator.setEvaluator(A09);
        if (z) {
            f2 = fmo2.A00;
            f3 = fmo2.A01;
        } else {
            f2 = fmo.A00;
            f3 = fmo.A01;
        }
        valueAnimator.setFloatValues(f2, f3);
        paintA0T.setColor(HyN.A00(i2, f2));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A04.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.A01;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            this.A04.pause();
        } else if (this.A00) {
            ValueAnimator valueAnimator = this.A04;
            if (valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            }
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (FLP.A00) {
            return;
        }
        this.A04.start();
        this.A00 = true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A04.cancel();
        this.A00 = false;
    }
}

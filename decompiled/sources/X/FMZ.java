package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import kotlin.Deprecated;

/* loaded from: classes6.dex */
public final class FMZ extends Drawable implements Animatable {
    public float A00;
    public float A01;
    public boolean A02;
    public final RectF A03;
    public final int A04;
    public final int A05;
    public final ValueAnimator.AnimatorUpdateListener A06;
    public final ValueAnimator A07;
    public final Paint A08;
    public final Paint A09;
    public final Integer A0A;
    public final Integer A0B;
    public static final Interpolator A0D = new LinearInterpolator();
    public static final Interpolator A0C = new PathInterpolator(0.6f, 0.0f, 0.1f, 1.0f);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        RectF rectF = this.A03;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.A09);
        canvas.drawArc(rectF, this.A01, this.A00, false, this.A08);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        Paint paint = this.A08;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        RectF rectF = this.A03;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = this.A05;
        rectF.set(i + strokeWidth, i2 + strokeWidth, (i + i3) - strokeWidth, (i2 + i3) - strokeWidth);
        Integer num = this.A0B;
        int i4 = this.A04;
        Integer num2 = this.A0A;
        LinearGradient linearGradient = null;
        if (num2 != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, num2.intValue(), i4, Shader.TileMode.CLAMP);
            } else if (iIntValue != 0) {
                throw C3cG.A0q();
            }
        }
        paint.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A07.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = this.A02;
        if (z) {
            if (z3) {
                this.A07.start();
            }
        } else if (z3) {
            this.A07.cancel();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (!FLP.A00) {
            this.A07.start();
            this.A02 = true;
        } else {
            this.A01 = -90.0f;
            this.A00 = 90.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A07.cancel();
        this.A02 = false;
    }

    public FMZ(Integer num, Integer num2, int i, int i2, int i3) {
        this.A04 = i;
        this.A05 = i3;
        this.A0B = num;
        this.A0A = num2;
        Paint paintA0U = AbstractC7607F5u.A0U(1);
        this.A08 = paintA0U;
        Paint paintA0U2 = AbstractC7607F5u.A0U(1);
        this.A09 = paintA0U2;
        this.A03 = AbstractC7607F5u.A0Y();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A07 = valueAnimator;
        float f = i3 / 12.0f;
        this.A01 = -90.0f;
        C8919Ftb c8919Ftb = new C8919Ftb(this, 17);
        this.A06 = c8919Ftb;
        valueAnimator.setInterpolator(A0D);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c8919Ftb);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(4000L);
        Paint.Style style = Paint.Style.STROKE;
        paintA0U.setStyle(style);
        paintA0U.setStrokeWidth(f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paintA0U.setStrokeCap(cap);
        paintA0U.setColor(i);
        paintA0U2.setStyle(style);
        paintA0U2.setStrokeWidth(f);
        paintA0U2.setStrokeCap(cap);
        paintA0U2.setColor(i2);
    }
}

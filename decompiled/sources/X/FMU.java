package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import kotlin.Deprecated;

/* loaded from: classes6.dex */
public final class FMU extends Drawable implements Animatable {
    public float A00;
    public float A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final ValueAnimator.AnimatorUpdateListener A05;
    public final ValueAnimator A06;
    public final Paint A07;
    public final RectF A08;
    public static final Interpolator A0A = new LinearInterpolator();
    public static final Interpolator A09 = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    public static final float[] A0D = {0.0f, 0.7f, 0.45f, 0.7f, 0.0f};
    public static final float[] A0B = {0.8f, 0.8f, 1.0f, 0.8f, 0.8f};
    public static final float[] A0C = {0.0f, 180.0f, 360.0f, 540.0f, 1080.0f};

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        Paint paint = this.A07;
        paint.setColor(this.A03);
        canvas.drawArc(this.A08, this.A01, this.A00, false, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        float strokeWidth = this.A07.getStrokeWidth() / 2.0f;
        RectF rectF = this.A08;
        rectF.set(rect);
        rectF.offset(strokeWidth, strokeWidth);
        int i = rect.left;
        int i2 = this.A04;
        rectF.right = (i + i2) - strokeWidth;
        rectF.bottom = (rect.top + i2) - strokeWidth;
    }

    public FMU(Context context, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        Paint paintA0U = AbstractC7607F5u.A0U(1);
        this.A07 = paintA0U;
        this.A08 = AbstractC7607F5u.A0Y();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A06 = valueAnimator;
        this.A01 = -90.0f;
        C8919Ftb c8919Ftb = new C8919Ftb(this, 16);
        this.A05 = c8919Ftb;
        valueAnimator.setInterpolator(A0A);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c8919Ftb);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(2000L);
        paintA0U.setStyle(Paint.Style.STROKE);
        paintA0U.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, C60Q.A0B(context)));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A06.isRunning();
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
                this.A06.start();
            }
        } else if (z3) {
            this.A06.cancel();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (!FLP.A00) {
            this.A06.start();
            this.A02 = true;
        } else {
            this.A01 = -90.0f;
            this.A00 = 90.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A06.cancel();
        this.A02 = false;
    }
}

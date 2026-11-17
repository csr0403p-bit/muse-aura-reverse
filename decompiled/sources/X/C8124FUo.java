package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.FUo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8124FUo extends Drawable implements Animatable {
    public static final Interpolator A06 = new LinearInterpolator();
    public static final Interpolator A07 = new FWI();
    public static final int[] A08 = {-16777216};
    public float A00;
    public float A01;
    public Animator A02;
    public Resources A03;
    public boolean A04;
    public final C8125FUp A05;

    public final void A00(int i) {
        float f = 10.0f;
        float f2 = 5.0f;
        float f3 = 7.5f;
        float f4 = 2.5f;
        if (i == 0) {
            f = 12.0f;
            f2 = 6.0f;
            f3 = 11.0f;
            f4 = 3.0f;
        }
        C8125FUp c8125FUp = this.A05;
        float f5 = this.A03.getDisplayMetrics().density;
        float f6 = f4 * f5;
        c8125FUp.A08 = f6;
        c8125FUp.A0J.setStrokeWidth(f6);
        c8125FUp.A02 = f3 * f5;
        c8125FUp.A0C = 0;
        c8125FUp.A0D = c8125FUp.A0G[0];
        c8125FUp.A0B = (int) (f * f5);
        c8125FUp.A0A = (int) (f2 * f5);
        invalidateSelf();
    }

    public final void A01(C8125FUp c8125FUp, float f) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c8125FUp.A0G;
            int i2 = c8125FUp.A0C;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            i = ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r8) * f2))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r7) * f2))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r6) * f2))) << 8) | ((i3 & 255) + ((int) (f2 * ((i4 & 255) - r4))));
        } else {
            i = c8125FUp.A0G[c8125FUp.A0C];
        }
        c8125FUp.A0D = i;
    }

    public final void A02(C8125FUp c8125FUp, float f, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.A04) {
            A01(c8125FUp, f);
            float f2 = c8125FUp.A06;
            float fFloor = (float) (Math.floor(f2 / 0.8f) + 1.0d);
            float f3 = c8125FUp.A07;
            float f4 = c8125FUp.A05;
            c8125FUp.A04 = C8j3.A02(f4 - 0.01f, f3, f);
            c8125FUp.A01 = f4;
            c8125FUp.A03 = C8j3.A02(fFloor, f2, f);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c8125FUp.A06;
            if (f < 0.5f) {
                interpolation2 = c8125FUp.A07;
                interpolation = (A07.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                interpolation = c8125FUp.A07 + 0.79f;
                interpolation2 = interpolation - (((1.0f - A07.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f6 = f5 + (0.20999998f * f);
            float f7 = (f + this.A01) * 216.0f;
            c8125FUp.A04 = interpolation2;
            c8125FUp.A01 = interpolation;
            c8125FUp.A03 = f6;
            this.A00 = f7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A05.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A02.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.A09 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.A0J.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        long j;
        Animator animator = this.A02;
        animator.cancel();
        C8125FUp c8125FUp = this.A05;
        float f = c8125FUp.A04;
        c8125FUp.A07 = f;
        float f2 = c8125FUp.A01;
        c8125FUp.A05 = f2;
        c8125FUp.A06 = c8125FUp.A03;
        if (f2 != f) {
            this.A04 = true;
            j = 666;
        } else {
            c8125FUp.A0C = 0;
            c8125FUp.A0D = c8125FUp.A0G[0];
            c8125FUp.A07 = 0.0f;
            c8125FUp.A05 = 0.0f;
            c8125FUp.A06 = 0.0f;
            c8125FUp.A04 = 0.0f;
            c8125FUp.A01 = 0.0f;
            c8125FUp.A03 = 0.0f;
            j = 1332;
        }
        animator.setDuration(j);
        animator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A02.cancel();
        this.A00 = 0.0f;
        C8125FUp c8125FUp = this.A05;
        if (c8125FUp.A0F) {
            c8125FUp.A0F = false;
        }
        c8125FUp.A0C = 0;
        c8125FUp.A0D = c8125FUp.A0G[0];
        c8125FUp.A07 = 0.0f;
        c8125FUp.A05 = 0.0f;
        c8125FUp.A06 = 0.0f;
        c8125FUp.A04 = 0.0f;
        c8125FUp.A01 = 0.0f;
        c8125FUp.A03 = 0.0f;
        invalidateSelf();
    }

    public C8124FUo(Context context) {
        context.getClass();
        this.A03 = context.getResources();
        C8125FUp c8125FUp = new C8125FUp();
        this.A05 = c8125FUp;
        int[] iArr = A08;
        c8125FUp.A0G = iArr;
        c8125FUp.A0C = 0;
        c8125FUp.A0D = iArr[0];
        c8125FUp.A08 = 2.5f;
        c8125FUp.A0J.setStrokeWidth(2.5f);
        invalidateSelf();
        C8125FUp c8125FUp2 = this.A05;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C8917FtZ(1, c8125FUp2, this));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(A06);
        valueAnimatorOfFloat.addListener(new I0N(1, this, c8125FUp2));
        this.A02 = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.A00, bounds.exactCenterX(), bounds.exactCenterY());
        C8125FUp c8125FUp = this.A05;
        RectF rectF = c8125FUp.A0K;
        float f = c8125FUp.A02;
        float fMin = (c8125FUp.A08 / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c8125FUp.A0B * c8125FUp.A00) / 2.0f, c8125FUp.A08 / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c8125FUp.A04;
        float f3 = c8125FUp.A03;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c8125FUp.A01 + f3) * 360.0f) - f4;
        Paint paint = c8125FUp.A0J;
        paint.setColor(c8125FUp.A0D);
        paint.setAlpha(c8125FUp.A09);
        float f6 = c8125FUp.A08 / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c8125FUp.A0I);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        if (c8125FUp.A0F) {
            Path path = c8125FUp.A0E;
            if (path == null) {
                Path pathA0V = AbstractC7607F5u.A0V();
                c8125FUp.A0E = pathA0V;
                pathA0V.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c8125FUp.A0B * c8125FUp.A00) / 2.0f;
            c8125FUp.A0E.moveTo(0.0f, 0.0f);
            c8125FUp.A0E.lineTo(c8125FUp.A0B * c8125FUp.A00, 0.0f);
            Path path2 = c8125FUp.A0E;
            float f9 = c8125FUp.A0B;
            float f10 = c8125FUp.A00;
            path2.lineTo((f9 * f10) / 2.0f, c8125FUp.A0A * f10);
            c8125FUp.A0E.offset((fMin2 + rectF.centerX()) - f8, rectF.centerY() + (c8125FUp.A08 / 2.0f));
            c8125FUp.A0E.close();
            Paint paint2 = c8125FUp.A0H;
            paint2.setColor(c8125FUp.A0D);
            paint2.setAlpha(c8125FUp.A09);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c8125FUp.A0E, paint2);
            canvas.restore();
        }
        canvas.restore();
    }
}

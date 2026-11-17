package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class FKM extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public FKP A04;
    public FKP A05;
    public int A06;
    public final Paint A07;
    public final Paint A08 = AbstractC7607F5u.A0U(5);
    public final float[] A09;
    public final Path A0A;
    public final Path A0B;
    public final Rect A0C;
    public final RectF A0D;
    public final RectF A0E;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int iSaveLayerAlpha = (this.A05 == null || (i = this.A06) == 255) ? -1 : canvas.saveLayerAlpha(this.A0E, i);
        if (Hnb.A02(this.A03)) {
            RectF rectF = this.A0E;
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A08);
            Paint paint = this.A07;
            if (paint.getStrokeWidth() != 0.0f) {
                RectF rectF2 = this.A0D;
                float f2 = this.A01;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
            }
        } else {
            canvas.drawPath(this.A0B, this.A08);
            Paint paint2 = this.A07;
            if (paint2.getStrokeWidth() != 0.0f) {
                canvas.drawPath(this.A0A, paint2);
            }
        }
        FKP fkp = this.A05;
        if (fkp != null) {
            float[] fArr = this.A09;
            float f3 = this.A02;
            int i2 = this.A03;
            if (i2 == 0) {
                i2 = 15;
            }
            Hnb.A01(fArr, f3, i2);
            fkp.A04(canvas, this.A0E, fArr);
        }
        if (iSaveLayerAlpha != -1) {
            canvas.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.A05 == null ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.A0C, this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06 = Math.max(0, Math.min(255, i));
        if (this.A05 != null) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public FKM() {
        Paint paintA0U = AbstractC7607F5u.A0U(1);
        this.A07 = paintA0U;
        this.A0E = AbstractC7607F5u.A0Y();
        this.A0C = AbstractC7607F5u.A0X();
        this.A0D = AbstractC7607F5u.A0Y();
        this.A0B = AbstractC7607F5u.A0V();
        this.A0A = AbstractC7607F5u.A0V();
        this.A09 = new float[8];
        this.A06 = 255;
        paintA0U.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A0E;
        rectF.set(rect);
        this.A0C.set(rect);
        RectF rectF2 = this.A0D;
        float f = rect.left;
        float f2 = this.A00;
        AbstractC7611F5y.A0e(rect, rectF2, f, f2, f2);
        int i = this.A03;
        if (Hnb.A02(i)) {
            return;
        }
        Path path = this.A0B;
        float f3 = this.A02;
        float[] fArr = this.A09;
        Hnb.A01(fArr, f3, i);
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        if (this.A07.getStrokeWidth() != 0.0f) {
            Path path2 = this.A0A;
            Hnb.A01(fArr, this.A01, this.A03);
            path2.reset();
            path2.addRoundRect(rectF2, fArr, direction);
        }
    }
}

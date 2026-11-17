package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.Ek9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7282Ek9 extends AbstractC7281Ek8 implements InterfaceC7175Ehk {
    public Integer A00;
    public boolean A01;
    public final Paint A02;
    public final float[] A03;
    public final Path A04;
    public final Path A05;
    public final RectF A06;
    public final RectF A07;
    public final float[] A08;

    private void A00() {
        float[] fArr;
        Path path = this.A05;
        path.reset();
        Path path2 = this.A04;
        path2.reset();
        RectF rectF = this.A07;
        rectF.set(getBounds());
        rectF.inset(0.0f, 0.0f);
        if (this.A00 == C79.A00) {
            path.addRect(rectF, Path.Direction.CW);
        }
        if (this.A01) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, this.A08, Path.Direction.CW);
        }
        rectF.inset(-0.0f, -0.0f);
        float f = 0.0f / 2.0f;
        rectF.inset(f, f);
        if (this.A01) {
            BV8.A1D(path2, rectF);
        } else {
            int i = 0;
            while (true) {
                fArr = this.A03;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.A08[i] + 0.0f) - f;
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = (-0.0f) / 2.0f;
        rectF.inset(f2, f2);
    }

    @Override // X.InterfaceC7175Ehk
    public final void AeL(float f) {
        Arrays.fill(this.A08, f);
        A00();
        invalidateSelf();
    }

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.A06;
        rectF.set(getBounds());
        int iIntValue = this.A00.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.A05);
                super.draw(canvas);
                canvas.restoreToCount(iSave);
                return;
            }
            return;
        }
        super.draw(canvas);
        Paint paint = this.A02;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        paint.setStrokeWidth(0.0f);
        paint.setFilterBitmap(false);
        Path path = this.A05;
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, paint);
        if (this.A01) {
            float fWidth = ((rectF.width() - rectF.height()) + 0.0f) / 2.0f;
            float fHeight = ((rectF.height() - rectF.width()) + 0.0f) / 2.0f;
            if (fWidth > 0.0f) {
                float f = rectF.left;
                canvas.drawRect(f, rectF.top, f + fWidth, rectF.bottom, paint);
                float f2 = rectF.right;
                canvas.drawRect(f2 - fWidth, rectF.top, f2, rectF.bottom, paint);
            }
            if (fHeight > 0.0f) {
                float f3 = rectF.left;
                float f4 = rectF.top;
                canvas.drawRect(f3, f4, rectF.right, f4 + fHeight, paint);
                float f5 = rectF.left;
                float f6 = rectF.bottom;
                canvas.drawRect(f5, f6 - fHeight, rectF.right, f6, paint);
            }
        }
    }

    public C7282Ek9(Drawable drawable) {
        super(drawable);
        this.A00 = C79.A00;
        this.A06 = new RectF();
        this.A08 = new float[8];
        this.A03 = new float[8];
        this.A02 = new Paint(1);
        this.A01 = false;
        this.A05 = new Path();
        this.A04 = new Path();
        this.A07 = new RectF();
    }

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
    }
}

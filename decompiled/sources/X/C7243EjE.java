package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.EjE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7243EjE extends AbstractC7281Ek8 {
    public final Matrix A00;
    public final int A01;
    public final int A02;
    public final Matrix A03;
    public final RectF A04;

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C7384Etj.A0Y(canvas, 0);
        if (this.A02 <= 0 && ((i = this.A01) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.A00);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Matrix matrix;
        int i;
        C7384Etj.A0Y(rect, 0);
        Drawable drawable = super.A00;
        if (drawable != null) {
            int i2 = this.A02;
            if (i2 <= 0 && ((i = this.A01) == 0 || i == 1)) {
                drawable.setBounds(rect);
                return;
            }
            int i3 = this.A01;
            if (i3 == 2) {
                matrix = this.A00;
                matrix.setScale(-1.0f, 1.0f);
            } else if (i3 != 7) {
                matrix = this.A00;
                if (i3 == 4) {
                    matrix.setScale(1.0f, -1.0f);
                } else if (i3 != 5) {
                    matrix.setRotate(i2, rect.centerX(), rect.centerY());
                } else {
                    matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
                    matrix.postScale(1.0f, -1.0f);
                }
            } else {
                matrix = this.A00;
                matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
                matrix.postScale(-1.0f, 1.0f);
            }
            Matrix matrix2 = this.A03;
            matrix2.reset();
            matrix.invert(matrix2);
            RectF rectF = this.A04;
            rectF.set(rect);
            matrix2.mapRect(rectF);
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
    }

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A01;
        return (i == 5 || i == 7 || this.A02 % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.A01;
        return (i == 5 || i == 7 || this.A02 % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    public C7243EjE(Drawable drawable, int i, int i2) {
        super(drawable);
        this.A00 = BV4.A08();
        this.A02 = i - (i % 90);
        this.A01 = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.A03 = BV4.A08();
        this.A04 = new RectF();
    }
}

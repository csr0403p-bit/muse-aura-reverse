package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class HwY extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        int iSave = canvas.save();
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A07);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = rect.left;
        float f2 = this.A04;
        AbstractC7611F5y.A0e(rect, rectF, f, f2, f2);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        float fWidth = rect.width() / 2.0f;
        this.A02 = fWidth;
        if (fWidth > 0.0f) {
            float f3 = f2 / fWidth;
            float f4 = 1.0f - f3;
            float f5 = (f3 * 0.25f) + f4;
            if (f5 > 1.0f) {
                StringBuilder sbA0g = C3cG.A0g("Gradient quarter fraction cannot be greater than 1, value is: ");
                sbA0g.append(f5);
                FFI.A01(null, sbA0g.toString(), null);
            } else {
                float[] fArr = {0.0f, f4, f4, 0.0f, 0.0f};
                AbstractC7609F5w.A1T(fArr, f5, 1.0f);
                int i = this.A05;
                int i2 = this.A06;
                float f6 = this.A03;
                this.A07.setShader(new RadialGradient(this.A00, this.A01, fWidth, new int[]{i, i, HyN.A00(i2, f6), HyN.A00(i2, f6 * 0.66f), 0}, fArr, Shader.TileMode.CLAMP));
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public HwY(int i, float f, int i2) {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A07 = paintA0T;
        paintA0T.setAntiAlias(false);
        paintA0T.setDither(true);
        AbstractC7607F5u.A1G(paintA0T);
        this.A04 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A08 = AbstractC7607F5u.A0Y();
        this.A03 = Color.alpha(i) / 255.0f;
    }
}

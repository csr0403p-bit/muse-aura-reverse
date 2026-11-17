package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.EkT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7302EkT extends Drawable implements InterfaceC7175Ehk, InterfaceC7293EkK {
    public final boolean A00;
    public InterfaceC7291EkI A02;
    public boolean A04;
    public final Drawable A0H;
    public final Path A0C = new Path();
    public boolean A01 = true;
    public final Path A0B = new Path();
    public final float[] A0J = new float[8];
    public final float[] A0I = new float[8];
    public final RectF A0G = new RectF();
    public final RectF A0F = new RectF();
    public final RectF A0D = new RectF();
    public final RectF A0E = new RectF();
    public final Matrix A05 = BV4.A08();
    public final Matrix A08 = BV4.A08();
    public final Matrix A07 = BV4.A08();
    public final Matrix A09 = BV4.A08();
    public final Matrix A06 = BV4.A08();
    public final Matrix A0A = BV4.A08();
    public boolean A03 = true;

    @Override // X.InterfaceC7175Ehk
    public final void AeL(float f) {
        if (f < 0.0f) {
            throw BV4.A0S();
        }
        Arrays.fill(this.A0J, f);
        this.A04 = !AnonymousClass002.A1M((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        this.A03 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        C7267Ejs.A00();
        this.A0H.draw(canvas);
        C7267Ejs.A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        this.A0H.setBounds(rect);
    }

    public void A00() {
        RectF rectF;
        InterfaceC7291EkI interfaceC7291EkI = this.A02;
        Matrix matrix = this.A07;
        if (interfaceC7291EkI != null) {
            interfaceC7291EkI.ALx(matrix);
            InterfaceC7291EkI interfaceC7291EkI2 = this.A02;
            C7384Etj.A0X(interfaceC7291EkI2);
            rectF = this.A0G;
            interfaceC7291EkI2.AJq(rectF);
        } else {
            matrix.reset();
            rectF = this.A0G;
            rectF.set(getBounds());
        }
        RectF rectF2 = this.A0D;
        Drawable drawable = this.A0H;
        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.A0E;
        rectF3.set(drawable.getBounds());
        Matrix matrix2 = this.A05;
        matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
        Matrix matrix3 = this.A09;
        if (!C7384Etj.areEqual(matrix, matrix3) || !matrix2.equals(this.A08)) {
            this.A01 = true;
            matrix.invert(this.A06);
            Matrix matrix4 = this.A0A;
            matrix4.set(matrix);
            matrix4.preConcat(matrix2);
            matrix3.set(matrix);
            this.A08.set(matrix2);
        }
        RectF rectF4 = this.A0F;
        if (C7384Etj.areEqual(rectF, rectF4)) {
            return;
        }
        this.A03 = true;
        rectF4.set(rectF);
    }

    public final void A01() {
        if (this.A03) {
            Path path = this.A0B;
            path.reset();
            RectF rectF = this.A0G;
            float f = 0.0f / 2.0f;
            rectF.inset(f, f);
            if (this.A00) {
                BV8.A1D(path, rectF);
            } else {
                float[] fArr = this.A0I;
                int length = fArr.length;
                for (int i = 0; i < length; i++) {
                    fArr[i] = (this.A0J[i] + 0.0f) - f;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = (-0.0f) / 2.0f;
            rectF.inset(f2, f2);
            Path path2 = this.A0C;
            path2.reset();
            float f3 = 0.0f + 0.0f;
            rectF.inset(f3, f3);
            if (this.A00) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, this.A0J, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.A03 = false;
        }
    }

    public boolean A02() {
        return this.A00 || this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.A0H.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A0H.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A0H.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0H.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0H.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.A0H.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A0H.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A0H.setColorFilter(colorFilter);
    }

    public AbstractC7302EkT(Drawable drawable) {
        this.A0H = drawable;
    }

    @Override // X.InterfaceC7293EkK
    public final void Af3(InterfaceC7291EkI interfaceC7291EkI) {
        this.A02 = interfaceC7291EkI;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        C7384Etj.A0Y(mode, 1);
        this.A0H.setColorFilter(i, mode);
    }
}

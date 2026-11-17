package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class HuR extends Drawable {
    public Path A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final RectF A05;
    public final Paint[] A08;
    public final Paint[] A09;
    public final Path[] A0A;
    public final float A0B;
    public final float A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final RectF A0F;
    public final boolean A07 = true;
    public final boolean A06 = true;

    public HuR(float f, float f2, float f3, float f4, int i, int i2) {
        this.A01 = f;
        this.A03 = f2;
        this.A0B = f3;
        this.A0C = f4;
        this.A04 = i;
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A0E = paintA0T;
        float fAlpha = Color.alpha(i);
        this.A02 = fAlpha;
        Paint.Style style = Paint.Style.FILL;
        paintA0T.setStyle(style);
        paintA0T.setColor(i2);
        paintA0T.setAntiAlias(true);
        Paint paintA0T2 = AbstractC7607F5u.A0T();
        this.A0D = paintA0T2;
        paintA0T2.setStyle(style);
        paintA0T2.setColor(i);
        paintA0T2.setAntiAlias(true);
        paintA0T2.setAlpha(Math.round(fAlpha));
        Path[] pathArr = new Path[4];
        int i3 = 0;
        int i4 = 0;
        do {
            pathArr[i4] = AbstractC7607F5u.A0V();
            i4++;
        } while (i4 < 4);
        this.A0A = pathArr;
        Paint[] paintArr = new Paint[4];
        int i5 = 0;
        do {
            Paint paintA0U = AbstractC7607F5u.A0U(4);
            paintA0U.setStyle(style);
            paintA0U.setAntiAlias(true);
            paintArr[i5] = paintA0U;
            i5++;
        } while (i5 < 4);
        this.A08 = paintArr;
        Paint[] paintArr2 = new Paint[4];
        do {
            Paint paintA0U2 = AbstractC7607F5u.A0U(4);
            paintA0U2.setStyle(style);
            paintArr2[i3] = paintA0U2;
            i3++;
        } while (i3 < 4);
        this.A09 = paintArr2;
        this.A05 = AbstractC7607F5u.A0Y();
        this.A0F = AbstractC7607F5u.A0Y();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        C7384Etj.A0Y(canvas, 0);
        Path path = this.A0A[0];
        Paint paint = this.A08[0];
        Paint paint2 = this.A09[0];
        boolean z = this.A07;
        if (z) {
            int iSave = canvas.save();
            RectF rectF = this.A05;
            float f3 = rectF.left;
            float f4 = this.A01;
            canvas.translate(f3 + f4, rectF.top + f4);
            canvas.drawPath(path, paint);
            float f5 = -f4;
            canvas.drawRect(0.0f, f5 - this.A03, rectF.width() - (f4 * 2.0f), f5, paint2);
            canvas.restoreToCount(iSave);
        }
        int iSave2 = canvas.save();
        RectF rectF2 = this.A05;
        float f6 = rectF2.right;
        float f7 = this.A01;
        canvas.translate(f6 - f7, rectF2.top + f7);
        canvas.rotate(90.0f);
        if (z) {
            canvas.drawPath(path, paint);
            f = 0.0f;
        } else {
            f = -f7;
        }
        float f8 = -f7;
        float f9 = f8 - this.A03;
        float fHeight = rectF2.height();
        boolean z2 = this.A06;
        canvas.drawRect(f, f9, fHeight - ((z2 ? 2.0f : 1.0f) * f7), f8, paint2);
        canvas.restoreToCount(iSave2);
        if (z2) {
            int iSave3 = canvas.save();
            canvas.translate(rectF2.right - f7, rectF2.bottom - f7);
            canvas.rotate(180.0f);
            canvas.drawPath(path, paint);
            canvas.drawRect(0.0f, f9, rectF2.width() - (f7 * 2.0f), f8, paint2);
            canvas.restoreToCount(iSave3);
        }
        int iSave4 = canvas.save();
        canvas.translate(rectF2.left + f7, rectF2.bottom - f7);
        canvas.rotate(270.0f);
        if (z2) {
            canvas.drawPath(path, paint);
            f2 = 0.0f;
        } else {
            f2 = f8;
        }
        canvas.drawRect(f2, f9, rectF2.height() - ((z ? 2.0f : 1.0f) * f7), f8, paint2);
        canvas.restoreToCount(iSave4);
        if (f7 <= 0.0f || !(z || z2)) {
            canvas.drawRect(rectF2, this.A0E);
            return;
        }
        if (this.A0C > 0.0f || this.A0B > 0.0f) {
            canvas.drawRoundRect(rectF2, f7, f7, this.A0D);
            canvas.drawRoundRect(this.A0F, f7, f7, this.A0E);
            return;
        }
        Path path2 = this.A00;
        Paint paint3 = this.A0E;
        if (path2 != null) {
            canvas.drawPath(path2, paint3);
        } else {
            canvas.drawRoundRect(rectF2, f7, f7, paint3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        float f = this.A03;
        float f2 = this.A0B;
        int i = (int) (f - f2);
        float f3 = this.A07 ? f : 0.0f;
        float f4 = this.A0C;
        int i2 = (int) (f3 - f4);
        int i3 = (int) (f2 + f);
        if (!this.A06) {
            f = 0.0f;
        }
        rect.set(i, i2, i3, (int) (f + f4));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        LinearGradient linearGradient;
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A05;
        float f = rect.left;
        float f2 = this.A03;
        float f3 = f + f2;
        float f4 = rect.top;
        boolean z = this.A07;
        if (!z) {
            f2 = 0.0f;
        }
        float f5 = f4 + f2;
        float f6 = rect.right - f2;
        float f7 = rect.bottom;
        boolean z2 = this.A06;
        rectF.set(f3, f5, f6, f7 - (z2 ? f2 : 0.0f));
        RectF rectF2 = this.A0F;
        float f8 = this.A0B;
        float f9 = (rect.left + f2) - f8;
        float f10 = rect.top;
        float f11 = z ? f2 : 0.0f;
        float f12 = this.A0C;
        rectF2.set(f9, (f10 + f11) - f12, (rect.right - f2) - f8, (rect.bottom - (z2 ? f2 : 0.0f)) - f12);
        if (z != z2) {
            Path path = this.A00;
            if (path == null) {
                this.A00 = AbstractC7607F5u.A0V();
            } else {
                path.reset();
            }
            float[] fArr = new float[8];
            Arrays.fill(fArr, 0, 4, z ? this.A01 : 0.0f);
            Arrays.fill(fArr, 4, 8, z2 ? this.A01 : 0.0f);
            Path path2 = this.A00;
            C7384Etj.A0X(path2);
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        } else {
            this.A00 = null;
        }
        float f13 = this.A01;
        float f14 = -f13;
        RectF rectF3 = new RectF(f14, f14, f13, f13);
        RectF rectF4 = new RectF(rectF3);
        float f15 = -f2;
        rectF4.inset(f15, f15);
        int i = this.A04;
        float f16 = this.A02;
        int[] iArr = {HyN.A00(i, f16 / 255.0f), HyN.A00(i, (f16 * 0.5f) / 255.0f), HyN.A00(i, 0.0f)};
        float[] fArr2 = {0.0f, 0.5f, 1.0f};
        float f17 = f13 + f2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f17, iArr, fArr2, tileMode);
        Path[] pathArr = this.A0A;
        int length = pathArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Path path3 = pathArr[i3];
            path3.reset();
            path3.setFillType(Path.FillType.EVEN_ODD);
            this.A08[i3].setShader(radialGradient);
            if (i2 == 90) {
                i2 = 90;
                path3.moveTo(0.0f, f14);
                path3.rLineTo(0.0f, f15);
                linearGradient = new LinearGradient(0.0f, 0.0f, f17, 0.0f, iArr, fArr2, tileMode);
            } else if (i2 == 180) {
                i2 = 180;
                path3.moveTo(f13, 0.0f);
                path3.rLineTo(f2, 0.0f);
                linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f17, iArr, fArr2, tileMode);
            } else if (i2 != 270) {
                path3.moveTo(f14, 0.0f);
                path3.rLineTo(f15, 0.0f);
                linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f15 - f13, iArr, fArr2, tileMode);
            } else {
                i2 = 270;
                path3.moveTo(0.0f, f13);
                path3.rLineTo(0.0f, f2);
                linearGradient = new LinearGradient(0.0f, 0.0f, f15 - f13, 0.0f, iArr, fArr2, tileMode);
            }
            float f18 = i2;
            path3.arcTo(rectF4, 180.0f + f18, 90.0f, false);
            path3.arcTo(rectF3, f18 + 270.0f, -90.0f, false);
            path3.close();
            this.A09[i3].setShader(linearGradient);
            i2 += 90;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        for (Paint paint : this.A08) {
            paint.setAlpha(i);
        }
        for (Paint paint2 : this.A09) {
            paint2.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.A08) {
            paint.setColorFilter(colorFilter);
        }
        for (Paint paint2 : this.A09) {
            paint2.setColorFilter(colorFilter);
        }
    }
}

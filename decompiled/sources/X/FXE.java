package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class FXE {
    public static final Matrix A00 = BV4.A08();

    public final void A00(Canvas canvas, Matrix matrix, FYA fya, int i) {
        int[] iArr;
        int i2;
        if (this instanceof FYC) {
            FYC fyc = (FYC) this;
            FYW fyw = fyc.A02;
            float f = fyw.A01;
            float f2 = fyc.A01;
            float f3 = fyw.A00;
            float f4 = fyc.A00;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate((float) Math.toDegrees(Math.atan((fyw.A01 - f2) / (fyw.A00 - f4))));
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr2 = FYA.A0B;
            iArr2[0] = fya.A00;
            iArr2[1] = fya.A01;
            iArr2[2] = fya.A02;
            Paint paint = fya.A05;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr2, FYA.A09, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
        } else {
            if (!(this instanceof FYB)) {
                FXI fxi = (FXI) this;
                Iterator it = fxi.A02.iterator();
                while (it.hasNext()) {
                    ((FXE) it.next()).A00(canvas, fxi.A00, fya, i);
                }
                return;
            }
            FYH fyh = ((FYB) this).A00;
            RectF rectF2 = FYH.A06;
            float f6 = fyh.A03;
            float f7 = fyh.A04;
            RectF rectF3 = new RectF(fyh.A01, fyh.A05, fyh.A02, fyh.A00);
            boolean zA1R = C8j3.A1R((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)));
            Path path = fya.A07;
            if (zA1R) {
                iArr = FYA.A0A;
                iArr[0] = 0;
                iArr[1] = fya.A00;
                iArr[2] = fya.A01;
                i2 = fya.A02;
            } else {
                path.rewind();
                path.moveTo(rectF3.centerX(), rectF3.centerY());
                path.arcTo(rectF3, f6, f7);
                path.close();
                float f8 = -i;
                rectF3.inset(f8, f8);
                iArr = FYA.A0A;
                iArr[0] = 0;
                iArr[1] = fya.A02;
                iArr[2] = fya.A01;
                i2 = fya.A00;
            }
            iArr[3] = i2;
            float fWidth = rectF3.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f9 = 1.0f - (i / fWidth);
            float[] fArr = FYA.A08;
            fArr[1] = f9;
            fArr[2] = ((1.0f - f9) / 2.0f) + f9;
            RadialGradient radialGradient = new RadialGradient(rectF3.centerX(), rectF3.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint2 = fya.A04;
            paint2.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF3.height() / rectF3.width());
            if (!zA1R) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, fya.A03);
            }
            canvas.drawArc(rectF3, f6, f7, true, paint2);
        }
        canvas.restore();
    }
}

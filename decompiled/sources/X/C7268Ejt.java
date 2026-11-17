package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.Ejt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7268Ejt extends Drawable implements InterfaceC7175Ehk {
    public int A00;
    public final float[] A08 = new float[8];
    public final float[] A06 = new float[8];
    public final Paint A03 = new Paint(1);
    public boolean A02 = false;
    public final Path A05 = new Path();
    public final Path A04 = new Path();
    public final RectF A07 = new RectF();
    public int A01 = 255;

    @Override // X.InterfaceC7175Ehk
    public final void AeL(float f) {
        CVn.A04(C8j3.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))), "radius should be non negative");
        Arrays.fill(this.A08, f);
        A00();
        invalidateSelf();
    }

    private void A00() {
        float[] fArr;
        Path path = this.A05;
        path.reset();
        Path path2 = this.A04;
        path2.reset();
        RectF rectF = this.A07;
        rectF.set(getBounds());
        float f = 0.0f / 2.0f;
        rectF.inset(f, f);
        if (this.A02) {
            BV8.A1D(path2, rectF);
        } else {
            int i = 0;
            while (true) {
                fArr = this.A06;
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
        float f3 = 0.0f + 0.0f;
        rectF.inset(f3, f3);
        if (this.A02) {
            BV8.A1D(path, rectF);
        } else {
            path.addRoundRect(rectF, this.A08, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i;
        if (i2 != 255) {
            i3 = i & 16777215;
            if (i2 != 0) {
                i3 |= (((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24;
            }
        }
        paint.setColor(i3);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.A05, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i = this.A00;
        int i2 = this.A01;
        if (i2 != 255) {
            if (i2 == 0) {
                return -2;
            }
            i = (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
        }
        int i3 = i >>> 24;
        if (i3 != 0) {
            return i3 != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.A01) {
            this.A01 = i;
            invalidateSelf();
        }
    }

    public C7268Ejt(int i) {
        this.A00 = 0;
        if (this.A00 != i) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

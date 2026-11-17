package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* renamed from: X.EkU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7303EkU extends AbstractC7302EkT {
    public WeakReference<Bitmap> A00;
    public RectF A01;
    public final Bitmap A02;
    public final Paint A03;
    public final Paint A04;

    @Override // X.AbstractC7302EkT, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        C7384Etj.A0Y(canvas, 0);
        C7267Ejs.A00();
        if (A02()) {
            A00();
            A01();
            WeakReference<Bitmap> weakReference = this.A00;
            if (weakReference == null || !C7384Etj.areEqual(weakReference.get(), this.A02)) {
                Bitmap bitmap = this.A02;
                this.A00 = BV4.A0q(bitmap);
                if (bitmap != null && !bitmap.isRecycled()) {
                    Paint paint = this.A03;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    super.A01 = true;
                }
            }
            if (super.A01 && (shader = this.A03.getShader()) != null) {
                shader.setLocalMatrix(this.A0A);
                super.A01 = false;
            }
            Paint paint2 = this.A03;
            paint2.setFilterBitmap(false);
            int iSave = canvas.save();
            canvas.concat(this.A06);
            if (this.A01 != null) {
                int iSave2 = canvas.save();
                RectF rectF = this.A01;
                C7384Etj.A0X(rectF);
                canvas.clipRect(rectF);
                canvas.drawPath(this.A0C, paint2);
                canvas.restoreToCount(iSave2);
            } else {
                canvas.drawPath(this.A0C, paint2);
            }
            canvas.restoreToCount(iSave);
        } else {
            super.draw(canvas);
        }
        C7267Ejs.A00();
    }

    public C7303EkU(Resources resources, Bitmap bitmap) {
        super(new BitmapDrawable(resources, bitmap));
        this.A02 = bitmap;
        Paint paint = new Paint();
        this.A03 = paint;
        Paint paint2 = new Paint(1);
        this.A04 = paint2;
        paint.setFlags(1);
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override // X.AbstractC7302EkT
    public final void A00() {
        super.A00();
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        this.A0A.mapRect(rectF, this.A0D);
    }

    @Override // X.AbstractC7302EkT
    public final boolean A02() {
        return super.A02() && this.A02 != null;
    }

    @Override // X.AbstractC7302EkT, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.A03;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // X.AbstractC7302EkT, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }
}

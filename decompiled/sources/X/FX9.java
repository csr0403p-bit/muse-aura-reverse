package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;

/* loaded from: classes6.dex */
public final class FX9 extends Drawable implements InterfaceC8153FWv {
    public static final Paint A0M = AbstractC7607F5u.A0U(1);
    public FXA A00;
    public FXK A01;
    public boolean A02;
    public boolean A03;
    public PorterDuffColorFilter A04;
    public PorterDuffColorFilter A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;
    public final RectF A0A;
    public final RectF A0B;
    public final RectF A0C;
    public final FZX A0D;
    public final FXH A0E;
    public final BitSet A0F;
    public final FXE[] A0G;
    public final FXE[] A0H;
    public final Matrix A0I;
    public final Region A0J;
    public final Region A0K;
    public final FYA A0L;

    public static void A03(FXA fxa) {
        fxa.A0H = PorterDuff.Mode.SRC_IN;
        fxa.A0I = null;
        fxa.A03 = 1.0f;
        fxa.A01 = 1.0f;
        fxa.A06 = 255;
        fxa.A02 = 0.0f;
        fxa.A00 = 0.0f;
        fxa.A05 = 0.0f;
        fxa.A07 = 0;
        fxa.A09 = 0;
        fxa.A08 = 0;
        fxa.A0A = 0;
        fxa.A0L = false;
        fxa.A0G = Paint.Style.FILL_AND_STROKE;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.A02 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A02 = true;
        super.onBoundsChange(rect);
    }

    public FX9() {
        this(new FXK());
    }

    private float A00() {
        Paint.Style style = this.A00.A0G;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.STROKE) {
            return 0.0f;
        }
        Paint paint = this.A07;
        if (paint.getStrokeWidth() > 0.0f) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void A01(Canvas canvas) {
        if (this.A0F.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.A00.A08 != 0) {
            canvas.drawPath(this.A08, this.A0L.A06);
        }
        int i = 0;
        do {
            FXE fxe = this.A0G[i];
            FYA fya = this.A0L;
            int i2 = this.A00.A09;
            Matrix matrix = FXE.A00;
            fxe.A00(canvas, matrix, fya, i2);
            this.A0H[i].A00(canvas, matrix, fya, this.A00.A09);
            i++;
        } while (i < 4);
        if (this.A03) {
            double d = this.A00.A08;
            double radians = Math.toRadians(r1.A0A);
            int iSin = (int) (d * Math.sin(radians));
            int iCos = (int) (d * Math.cos(radians));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(this.A08, A0M);
            canvas.translate(iSin, iCos);
        }
    }

    private void A02(Path path, RectF rectF) {
        FXH fxh = this.A0E;
        FXA fxa = this.A00;
        fxh.A01(path, rectF, fxa.A0K, this.A0D, fxa.A01);
        if (this.A00.A03 != 1.0f) {
            Matrix matrix = this.A0I;
            matrix.reset();
            float f = this.A00.A03;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A0B, true);
    }

    public static void A04(FX9 fx9) {
        FXA fxa = fx9.A00;
        float f = fxa.A00 + fxa.A05;
        fxa.A09 = AbstractC7607F5u.A08(0.75f * f);
        fxa.A08 = AbstractC7607F5u.A08(f * 0.25f);
        fx9.A05();
        super.invalidateSelf();
    }

    private boolean A05() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A05;
        PorterDuffColorFilter porterDuffColorFilter3 = this.A04;
        FXA fxa = this.A00;
        ColorStateList colorStateList = fxa.A0E;
        PorterDuff.Mode mode = fxa.A0H;
        Paint paint = this.A06;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iA07 = A07(color);
            porterDuffColorFilter = iA07 != color ? new PorterDuffColorFilter(iA07, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(A07(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.A05 = porterDuffColorFilter;
        FXA fxa2 = this.A00;
        ColorStateList colorStateList2 = fxa2.A0D;
        PorterDuff.Mode mode2 = fxa2.A0H;
        this.A04 = (colorStateList2 == null || mode2 == null) ? null : new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode2);
        FXA fxa3 = this.A00;
        if (fxa3.A0L) {
            FYA fya = this.A0L;
            int colorForState = fxa3.A0E.getColorForState(getState(), 0);
            int iA05 = EGb.A05(colorForState, 68);
            fya.A02 = iA05;
            fya.A01 = EGb.A05(colorForState, 20);
            fya.A00 = colorForState & 16777215;
            fya.A06.setColor(iA05);
        }
        return (Ht0.A00(porterDuffColorFilter2, this.A05) && Ht0.A00(porterDuffColorFilter3, this.A04)) ? false : true;
    }

    private boolean A06(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.A00.A0B == null || color2 == (colorForState2 = this.A00.A0B.getColorForState(iArr, (color2 = (paint2 = this.A06).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.A00.A0C == null || color == (colorForState = this.A00.A0C.getColorForState(iArr, (color = (paint = this.A07).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final int A07(int i) {
        FXA fxa = this.A00;
        float f = fxa.A00 + fxa.A05 + fxa.A02;
        FXB fxb = fxa.A0J;
        if (fxb == null || !fxb.A03 || EGb.A05(i, 255) != fxb.A01) {
            return i;
        }
        float fMin = 0.0f;
        if (fxb.A00 > 0.0f && f > 0.0f) {
            fMin = Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return EGb.A05(FWP.A00(fMin, EGb.A05(i, 255), fxb.A02), Color.alpha(i));
    }

    public final void A08(float f) {
        FXA fxa = this.A00;
        if (fxa.A00 != f) {
            fxa.A00 = f;
            A04(this);
        }
    }

    public final void A09(ColorStateList colorStateList) {
        FXA fxa = this.A00;
        if (fxa.A0B != colorStateList) {
            fxa.A0B = colorStateList;
            onStateChange(getState());
        }
    }

    public final void A0A(ColorStateList colorStateList) {
        FXA fxa = this.A00;
        if (fxa.A0C != colorStateList) {
            fxa.A0C = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.A06;
        paint.setColorFilter(this.A05);
        int alpha = paint.getAlpha();
        int i = this.A00.A06;
        paint.setAlpha((alpha * (i + (i >>> 7))) >>> 8);
        Paint paint2 = this.A07;
        paint2.setColorFilter(this.A04);
        paint2.setStrokeWidth(this.A00.A04);
        int alpha2 = paint2.getAlpha();
        int i2 = this.A00.A06;
        paint2.setAlpha((alpha2 * (i2 + (i2 >>> 7))) >>> 8);
        if (this.A02) {
            float f = -A00();
            FXA fxa = this.A00;
            FXK fxk = fxa.A0K;
            FXL fxl = new FXL(fxk);
            FXF fxc = fxk.A02;
            if (!(fxc instanceof FXM)) {
                fxc = new FXC(fxc, f);
            }
            fxl.A02 = fxc;
            FXF fxc2 = fxk.A03;
            if (!(fxc2 instanceof FXM)) {
                fxc2 = new FXC(fxc2, f);
            }
            fxl.A03 = fxc2;
            FXF fxc3 = fxk.A00;
            if (!(fxc3 instanceof FXM)) {
                fxc3 = new FXC(fxc3, f);
            }
            fxl.A00 = fxc3;
            FXF fxc4 = fxk.A01;
            if (!(fxc4 instanceof FXM)) {
                fxc4 = new FXC(fxc4, f);
            }
            fxl.A01 = fxc4;
            FXK fxk2 = new FXK(fxl);
            this.A01 = fxk2;
            FXH fxh = this.A0E;
            float f2 = fxa.A01;
            RectF rectF = this.A0A;
            RectF rectF2 = this.A0C;
            AbstractC7607F5u.A1J(rectF2, this);
            rectF.set(rectF2);
            float fA00 = A00();
            rectF.inset(fA00, fA00);
            fxh.A01(this.A09, rectF, fxk2, null, f2);
            AbstractC7607F5u.A1J(rectF2, this);
            A02(this.A08, rectF2);
            this.A02 = false;
        }
        FXA fxa2 = this.A00;
        int i3 = fxa2.A07;
        if (i3 != 1 && fxa2.A09 > 0) {
            if (i3 != 2) {
                FXK fxk3 = fxa2.A0K;
                RectF rectF3 = this.A0C;
                AbstractC7607F5u.A1J(rectF3, this);
                if (!fxk3.A04(rectF3)) {
                    this.A08.isConvex();
                }
            } else {
                canvas.save();
                double d = this.A00.A08;
                double radians = Math.toRadians(r1.A0A);
                canvas.translate((int) (d * Math.sin(radians)), (int) (d * Math.cos(radians)));
                if (this.A03) {
                    RectF rectF4 = this.A0B;
                    int iWidth = (int) (rectF4.width() - getBounds().width());
                    int iHeight = (int) (rectF4.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw C3cG.A0Q("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) rectF4.width()) + (this.A00.A09 * 2) + iWidth, ((int) rectF4.height()) + (this.A00.A09 * 2) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.A00.A09) - iWidth;
                    float f4 = (getBounds().top - this.A00.A09) - iHeight;
                    canvas2.translate(-f3, -f4);
                    A01(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                } else {
                    A01(canvas);
                }
                canvas.restore();
            }
        }
        FXA fxa3 = this.A00;
        Paint.Style style = fxa3.A0G;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        if (style == style2 || style == Paint.Style.FILL) {
            Path path = this.A08;
            FXK fxk4 = fxa3.A0K;
            RectF rectF5 = this.A0C;
            AbstractC7607F5u.A1J(rectF5, this);
            if (fxk4.A04(rectF5)) {
                float fAE9 = fxk4.A03.AE9(rectF5) * this.A00.A01;
                canvas.drawRoundRect(rectF5, fAE9, fAE9, paint);
            } else {
                canvas.drawPath(path, paint);
            }
        }
        Paint.Style style3 = this.A00.A0G;
        if ((style3 == style2 || style3 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            Path path2 = this.A09;
            FXK fxk5 = this.A01;
            RectF rectF6 = this.A0A;
            RectF rectF7 = this.A0C;
            AbstractC7607F5u.A1J(rectF7, this);
            rectF6.set(rectF7);
            float fA002 = A00();
            rectF6.inset(fA002, fA002);
            if (fxk5.A04(rectF6)) {
                float fAE92 = fxk5.A03.AE9(rectF6) * this.A00.A01;
                canvas.drawRoundRect(rectF6, fAE92, fAE92, paint2);
            } else {
                canvas.drawPath(path2, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        FXA fxa = this.A00;
        if (fxa.A07 != 2) {
            FXK fxk = fxa.A0K;
            RectF rectF = this.A0C;
            AbstractC7607F5u.A1J(rectF, this);
            if (fxk.A04(rectF)) {
                FXF fxf = this.A00.A0K.A02;
                AbstractC7607F5u.A1J(rectF, this);
                outline.setRoundRect(getBounds(), fxf.AE9(rectF) * this.A00.A01);
                return;
            }
            AbstractC7607F5u.A1J(rectF, this);
            Path path = this.A08;
            A02(path, rectF);
            path.isConvex();
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.A00.A0I;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        FXA fxa = this.A00;
        FXA fxa2 = new FXA();
        fxa2.A0B = null;
        fxa2.A0C = null;
        fxa2.A0D = null;
        fxa2.A0E = null;
        A03(fxa2);
        fxa2.A0K = fxa.A0K;
        fxa2.A0J = fxa.A0J;
        fxa2.A04 = fxa.A04;
        fxa2.A0F = fxa.A0F;
        fxa2.A0B = fxa.A0B;
        fxa2.A0C = fxa.A0C;
        fxa2.A0H = fxa.A0H;
        fxa2.A0E = fxa.A0E;
        fxa2.A06 = fxa.A06;
        fxa2.A03 = fxa.A03;
        fxa2.A08 = fxa.A08;
        fxa2.A07 = fxa.A07;
        fxa2.A0L = fxa.A0L;
        fxa2.A01 = fxa.A01;
        fxa2.A02 = fxa.A02;
        fxa2.A00 = fxa.A00;
        fxa2.A05 = fxa.A05;
        fxa2.A09 = fxa.A09;
        fxa2.A0A = fxa.A0A;
        fxa2.A0D = fxa.A0D;
        fxa2.A0G = fxa.A0G;
        Rect rect = fxa.A0I;
        if (rect != null) {
            fxa2.A0I = new Rect(rect);
        }
        this.A00 = fxa2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        FXA fxa = this.A00;
        if (fxa.A06 != i) {
            fxa.A06 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.A0F = colorFilter;
        super.invalidateSelf();
    }

    @Override // X.InterfaceC8153FWv
    public final void setShapeAppearanceModel(FXK fxk) {
        this.A00.A0K = fxk;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.A00.A0E = colorStateList;
        A05();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        FXA fxa = this.A00;
        if (fxa.A0H != mode) {
            fxa.A0H = mode;
            A05();
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.A0K;
        region.set(bounds);
        RectF rectF = this.A0C;
        AbstractC7607F5u.A1J(rectF, this);
        Path path = this.A08;
        A02(path, rectF);
        Region region2 = this.A0J;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A0E;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.A00.A0D;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A00.A0C;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A00.A0B;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zA06 = A06(iArr);
        boolean zA05 = A05();
        if (!zA06 && !zA05) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public FX9(FXK fxk) {
        FXA fxa = new FXA();
        fxa.A0B = null;
        fxa.A0C = null;
        fxa.A0D = null;
        fxa.A0E = null;
        A03(fxa);
        fxa.A0K = fxk;
        fxa.A0J = null;
        this(fxa);
    }

    public FX9(FXA fxa) {
        FXH fxh;
        this.A0G = new FXE[4];
        this.A0H = new FXE[4];
        this.A0F = new BitSet(8);
        this.A0I = BV4.A08();
        this.A08 = AbstractC7607F5u.A0V();
        this.A09 = AbstractC7607F5u.A0V();
        this.A0C = AbstractC7607F5u.A0Y();
        this.A0A = AbstractC7607F5u.A0Y();
        this.A0K = new Region();
        this.A0J = new Region();
        Paint paintA0U = AbstractC7607F5u.A0U(1);
        this.A06 = paintA0U;
        Paint paintA0U2 = AbstractC7607F5u.A0U(1);
        this.A07 = paintA0U2;
        this.A0L = new FYA();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            fxh = FXO.A00;
        } else {
            fxh = new FXH();
        }
        this.A0E = fxh;
        this.A0B = AbstractC7607F5u.A0Y();
        this.A03 = true;
        this.A00 = fxa;
        paintA0U2.setStyle(Paint.Style.STROKE);
        AbstractC7607F5u.A1G(paintA0U);
        Paint paint = A0M;
        paint.setColor(-1);
        AbstractC7607F5u.A1H(paint, PorterDuff.Mode.DST_OUT);
        A05();
        A06(getState());
        this.A0D = new FXG(this);
    }
}

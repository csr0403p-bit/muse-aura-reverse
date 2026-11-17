package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.EjD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7242EjD extends AbstractC7281Ek8 {
    public static InterfaceC7005EeA<Boolean> A06 = AbstractC7180Ehp.A00;
    public int A00;
    public int A01;
    public Matrix A02;
    public PointF A03;
    public InterfaceC8647Fhz A04;
    public final Matrix A05;

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        Drawable drawable = super.A00;
        if (drawable != null && (this.A01 != drawable.getIntrinsicWidth() || this.A00 != drawable.getIntrinsicHeight())) {
            A00(this);
        }
        if (this.A02 == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.A02);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public static final void A00(C7242EjD c7242EjD) {
        float f;
        float f2;
        Drawable drawable = ((AbstractC7281Ek8) c7242EjD).A00;
        Matrix matrix = null;
        if (drawable == null) {
            c7242EjD.A00 = 0;
            c7242EjD.A01 = 0;
        } else {
            Rect bounds = c7242EjD.getBounds();
            C7384Etj.A0U(bounds);
            int iWidth = bounds.width();
            int iHeight = bounds.height();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            c7242EjD.A01 = intrinsicWidth;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            c7242EjD.A00 = intrinsicHeight;
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ((intrinsicWidth == iWidth && intrinsicHeight == iHeight) || c7242EjD.A04 == InterfaceC8647Fhz.A09)) {
                drawable.setBounds(bounds);
            } else {
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                matrix = c7242EjD.A05;
                matrix.reset();
                InterfaceC8647Fhz interfaceC8647Fhz = c7242EjD.A04;
                PointF pointF = c7242EjD.A03;
                if (pointF != null) {
                    f = pointF.x;
                    f2 = pointF.y;
                } else {
                    f = 0.5f;
                    f2 = 0.5f;
                }
                interfaceC8647Fhz.ALy(matrix, bounds, f, f2, intrinsicWidth, intrinsicHeight);
            }
        }
        c7242EjD.A02 = matrix;
    }

    public final void A01(Drawable drawable) {
        AbstractC7294EkL.A00(null, super.A00, null);
        AbstractC7294EkL.A00(null, drawable, null);
        C7283EkA c7283EkA = super.A02;
        if (drawable != null && c7283EkA != null) {
            c7283EkA.A00(drawable);
        }
        AbstractC7294EkL.A01(drawable, this);
        AbstractC7294EkL.A00(this, drawable, this);
        super.A00 = drawable;
        invalidateSelf();
        A00(this);
    }

    public C7242EjD(Drawable drawable, InterfaceC8647Fhz interfaceC8647Fhz) {
        super(drawable);
        this.A05 = BV4.A08();
        this.A04 = interfaceC8647Fhz;
    }

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        A00(this);
    }

    public C7242EjD(PointF pointF, Drawable drawable, InterfaceC8647Fhz interfaceC8647Fhz) {
        super(drawable);
        this.A05 = BV4.A08();
        this.A04 = interfaceC8647Fhz;
        this.A03 = pointF;
    }
}

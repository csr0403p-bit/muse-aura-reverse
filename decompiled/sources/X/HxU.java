package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class HxU extends Drawable {
    public static final float[] A07;
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final boolean A05;
    public final RectF A06;

    public HxU(Context context, InterfaceC10557Hsn interfaceC10557Hsn) {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A04 = paintA0T;
        paintA0T.setAntiAlias(false);
        paintA0T.setDither(true);
        AbstractC7607F5u.A1G(paintA0T);
        if (context == null) {
            throw BV4.A0U();
        }
        this.A03 = HsH.A00(context, 12.0f);
        this.A06 = AbstractC7607F5u.A0Y();
        this.A05 = interfaceC10557Hsn.AOJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        int iSave = canvas.save();
        canvas.rotate(94.0f, this.A00, this.A01);
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A04);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A06;
        float f = rect.left;
        float f2 = this.A03;
        AbstractC7611F5y.A0e(rect, rectF, f, f2, f2);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = rect.width() / 2.0f;
        SweepGradient sweepGradient = new SweepGradient(this.A00, this.A01, this.A05 ? A08 : A09, A07);
        float f3 = this.A02;
        if (f3 > 0.0f) {
            float f4 = f2 / f3;
            float f5 = 1.0f - f4;
            float f6 = (f4 * 0.25f) + f5;
            if (f6 > 1.0f) {
                StringBuilder sbA0g = C3cG.A0g("Gradient quarter fraction cannot be greater than 1, value is: ");
                sbA0g.append(f6);
                FFI.A01(null, sbA0g.toString(), null);
            } else {
                float[] fArr = {0.0f, f5, f5, 0.0f, 0.0f};
                AbstractC7609F5w.A1T(fArr, f6, 1.0f);
                this.A04.setShader(new ComposeShader(new RadialGradient(this.A00, this.A01, f3, A0A, fArr, Shader.TileMode.CLAMP), sweepGradient, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    static {
        int iA00 = HyN.A00(-6278145, 0.1f);
        A09 = new int[]{iA00, HyN.A00(-15173646, 0.1f), HyN.A00(-14298266, 0.1f), HyN.A00(-668109, 0.1f), HyN.A00(-37796, 0.1f), iA00};
        int iA002 = HyN.A00(-7982634, 0.2f);
        A08 = new int[]{iA002, HyN.A00(-15111988, 0.2f), HyN.A00(-14438052, 0.2f), HyN.A00(-3494861, 0.2f), HyN.A00(-2990252, 0.2f), iA002};
        A07 = new float[]{0.0f, 0.15428571f, 0.46666667f, 0.6027778f, 0.69166666f, 1.0f};
        A0A = new int[]{0, 0, HyN.A00(-16777216, 0.3f), HyN.A00(-16777216, 0.2f), 0};
    }
}

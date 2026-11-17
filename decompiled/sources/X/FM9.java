package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes6.dex */
public final class FM9 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public FKP A04;
    public FKP A05;
    public boolean A07;
    public final View A0E;
    public final Paint A09 = AbstractC7607F5u.A0U(1);
    public final Paint A08 = AbstractC7607F5u.A0U(1);
    public final Path A0B = AbstractC7607F5u.A0V();
    public final RectF A0D = AbstractC7607F5u.A0Y();
    public final RectF A0C = AbstractC7607F5u.A0Y();
    public final Path A0A = AbstractC7607F5u.A0V();
    public final float[] A0F = new float[8];
    public boolean A06 = true;

    public final void A00(float[] fArr, float f, float f2, float f3, int i, int i2, int i3) {
        DashPathEffect dashPathEffect = null;
        this.A05 = null;
        this.A06 = true;
        this.A03 = i3;
        this.A02 = f2;
        Paint paint = this.A09;
        paint.setColor(i);
        paint.setXfermode(i == 0 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        Paint paint2 = this.A08;
        if (f != 0.0f) {
            paint2.setColor(i2);
        } else {
            paint2.setColor(0);
        }
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f);
        if (f > 0.0f && fArr != null) {
            dashPathEffect = new DashPathEffect(fArr, f3);
        }
        paint2.setPathEffect(dashPathEffect);
        Path path = this.A0B;
        path.setFillType(Path.FillType.EVEN_ODD);
        float f4 = f / 2.0f;
        this.A00 = f4;
        this.A01 = this.A02 - f4;
        path.reset();
        this.A0E.invalidate();
    }

    public FM9(View view) {
        this.A0E = view;
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import android.text.style.LineHeightSpan;

/* loaded from: classes6.dex */
public final class FKN implements LineBackgroundSpan, LineHeightSpan {
    public final int A00;
    public final int A01;
    public final Layout A02;
    public final FJO A03;

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        float f;
        float f2;
        boolean zA1a = AnonymousClass002.A1a(canvas, paint);
        int i10 = this.A01;
        if (i7 <= i10 || i6 >= (i9 = this.A00)) {
            return;
        }
        Layout layout = this.A02;
        boolean zA1Q = AnonymousClass002.A1Q(i8, layout.getLineForOffset(i10));
        boolean z = i8 == layout.getLineForOffset(i9 - (zA1a ? 1 : 0));
        RectF rectF = new RectF(zA1Q ? layout.getPrimaryHorizontal(i10) : layout.getLineLeft(i8), i3, z ? layout.getPrimaryHorizontal(i9) : layout.getLineRight(i8), i5);
        float f3 = zA1Q ? this.A03.A00.A02 : 0.0f;
        if (z) {
            FKT fkt = this.A03.A00;
            f = fkt.A03;
            f2 = fkt.A01;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        float f4 = zA1Q ? this.A03.A00.A00 : 0.0f;
        float[] fArr = new float[8];
        fArr[0] = f3;
        fArr[zA1a ? 1 : 0] = f3;
        fArr[2] = f;
        AbstractC7609F5w.A1T(fArr, f, f2);
        fArr[5] = f2;
        AbstractC7609F5w.A1S(fArr, f4);
        Path pathA0V = AbstractC7607F5u.A0V();
        pathA0V.addRoundRect(rectF, fArr, Path.Direction.CW);
        Integer num = this.A03.A01;
        if (num != null) {
            int iIntValue = num.intValue();
            Paint paint2 = new Paint(paint);
            paint2.setColor(iIntValue);
            AbstractC7607F5u.A1G(paint2);
            paint2.setAntiAlias(zA1a);
            canvas.drawPath(pathA0V, paint2);
        }
    }

    public FKN(Layout layout, FJO fjo, int i, int i2) {
        this.A03 = fjo;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = layout;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }
}

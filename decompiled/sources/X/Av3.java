package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes4.dex */
public final class Av3 extends ReplacementSpan {
    public int A00;
    public boolean A01;
    public int A02;
    public Paint.FontMetricsInt A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final int A09;
    public final int A0A;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        int iA00;
        this.A01 = true;
        float textSize = paint.getTextSize();
        this.A03 = paint.getFontMetricsInt();
        if (A01().descent <= A01().ascent) {
            throw C60O.A0i("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.A0A;
        if (i3 != 0) {
            if (i3 == 1) {
                f = this.A06 * textSize;
            }
            throw C60O.A0i("Unsupported unit.");
        }
        f = this.A07;
        this.A00 = C8j3.A08(f);
        int i4 = this.A08;
        if (i4 != 0) {
            if (i4 == 1) {
                f2 = this.A04 * textSize;
            }
            throw C60O.A0i("Unsupported unit.");
        }
        f2 = this.A05;
        this.A02 = C8j3.A08(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = A01().ascent;
            fontMetricsInt.descent = A01().descent;
            fontMetricsInt.leading = A01().leading;
            switch (this.A09) {
                case 0:
                    if (fontMetricsInt.ascent > (-A00())) {
                        fontMetricsInt.ascent = -A00();
                        break;
                    }
                    break;
                case 1:
                case 2:
                case 3:
                default:
                    int i5 = fontMetricsInt.descent;
                    int i6 = fontMetricsInt.ascent;
                    int i7 = i5 - i6;
                    if (i7 < A00()) {
                        iA00 = i6 - ((A00() - i7) / 2);
                        fontMetricsInt.ascent = iA00;
                        fontMetricsInt.descent = iA00 + A00();
                        break;
                    }
                    break;
                case 4:
                    iA00 = fontMetricsInt.ascent;
                    if (iA00 + A00() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = iA00 + A00();
                        break;
                    }
                    break;
            }
            fontMetricsInt.top = Math.min(A01().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(A01().bottom, fontMetricsInt.descent);
        }
        if (this.A01) {
            return this.A00;
        }
        throw C3cG.A0Q("PlaceholderSpan is not laid out yet.");
    }

    public Av3(AXN axn, float f, float f2, int i, int i2, int i3) {
        float fAh3 = i == 0 ? axn.Ah3(C19U.A02(f)) : 0.0f;
        float fAh32 = i2 == 0 ? axn.Ah3(C19U.A02(f2)) : 0.0f;
        this.A06 = f;
        this.A0A = i;
        this.A04 = f2;
        this.A08 = i2;
        this.A07 = fAh3;
        this.A05 = fAh32;
        this.A09 = i3;
    }

    public final int A00() {
        if (this.A01) {
            return this.A02;
        }
        throw C3cG.A0Q("PlaceholderSpan is not laid out yet.");
    }

    public final Paint.FontMetricsInt A01() {
        Paint.FontMetricsInt fontMetricsInt = this.A03;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C7384Etj.A0b("fontMetrics");
        throw F60.createAndThrow();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}

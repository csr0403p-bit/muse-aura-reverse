package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.AwY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2020AwY implements LineHeightSpan {
    public final float A00;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        if (i5 - fontMetricsInt.ascent > 0) {
            int iA08 = C8j3.A08(this.A00);
            int iCeil = (int) Math.ceil(i5 * ((iA08 * 1.0f) / r2));
            fontMetricsInt.descent = iCeil;
            fontMetricsInt.ascent = iCeil - iA08;
        }
    }

    public C2020AwY(float f) {
        this.A00 = f;
    }
}

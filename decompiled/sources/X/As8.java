package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes4.dex */
public final class As8 extends MetricAffectingSpan {
    public final Typeface A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public As8(Typeface typeface) {
        this.A00 = typeface;
    }
}

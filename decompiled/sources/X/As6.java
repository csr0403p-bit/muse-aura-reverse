package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes4.dex */
public final class As6 extends MetricAffectingSpan {
    public final float A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += C8j3.A08(textPaint.ascent() * this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += C8j3.A08(textPaint.ascent() * this.A00);
    }

    public As6(float f) {
        this.A00 = f;
    }
}

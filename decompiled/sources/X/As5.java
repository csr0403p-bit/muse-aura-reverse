package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes4.dex */
public final class As5 extends MetricAffectingSpan {
    public final float A00;

    public As5(float f) {
        this.A00 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }
}

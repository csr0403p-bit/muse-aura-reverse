package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes4.dex */
public final class As9 extends MetricAffectingSpan {
    public final float A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    public As9(float f) {
        this.A00 = f;
    }
}

package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes4.dex */
public final class As7 extends MetricAffectingSpan {
    public final float A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public As7(float f) {
        this.A00 = f;
    }
}

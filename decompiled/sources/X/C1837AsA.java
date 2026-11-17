package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.AsA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1837AsA extends MetricAffectingSpan {
    public final String A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public C1837AsA(String str) {
        this.A00 = str;
    }
}

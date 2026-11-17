package X;

import android.text.TextPaint;

/* renamed from: X.Aqh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1781Aqh {
    public static final void A00(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }
}

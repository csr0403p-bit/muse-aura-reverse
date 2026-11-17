package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes6.dex */
public final class HnF extends CharacterStyle {
    public int A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C7384Etj.A0Y(textPaint, 0);
        textPaint.setAlpha(this.A00);
    }

    public HnF(int i) {
        int iMax = Math.max(i, 0);
        this.A00 = iMax;
        this.A00 = Math.min(iMax, 255);
    }
}

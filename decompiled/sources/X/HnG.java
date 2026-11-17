package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes6.dex */
public final class HnG extends CharacterStyle {
    public final Shader A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C7384Etj.A0Y(textPaint, 0);
        textPaint.setShader(this.A00);
    }

    public HnG(Shader shader) {
        this.A00 = shader;
    }
}

package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;

/* renamed from: X.Aqi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1782Aqi extends CharacterStyle implements UpdateAppearance {
    public final AbstractC1336AhN A01;
    public final float A02;
    public final MutableState A00 = AbstractC1798ArH.A06(new AWA(9205357640488583168L));
    public final C1BO<Shader> A03 = BBP.A0A(C2293BSt.A00(this, 32));

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC1781Aqh.A00(textPaint, this.A02);
        textPaint.setShader(this.A03.getValue());
    }

    public C1782Aqi(AbstractC1336AhN abstractC1336AhN, float f) {
        this.A01 = abstractC1336AhN;
        this.A02 = f;
    }
}

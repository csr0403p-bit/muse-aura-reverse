package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.Aql, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1785Aql extends CharacterStyle {
    public final boolean A00;
    public final boolean A01;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.A01);
        textPaint.setStrikeThruText(this.A00);
    }

    public C1785Aql(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}

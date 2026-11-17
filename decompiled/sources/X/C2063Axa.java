package X;

import android.text.TextPaint;

/* renamed from: X.Axa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2063Axa implements InterfaceC2106AyW {
    public final TextPaint A00;
    public final CharSequence A01;

    private final int A00(int i) {
        TextPaint textPaint = this.A00;
        CharSequence charSequence = this.A01;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // X.InterfaceC2106AyW
    public final int ARI(int i) {
        TextPaint textPaint = this.A00;
        CharSequence charSequence = this.A01;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // X.InterfaceC2106AyW
    public final int ARJ(int i) {
        TextPaint textPaint = this.A00;
        CharSequence charSequence = this.A01;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        if (textRunCursor == -1 || textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    public C2063Axa(CharSequence charSequence, TextPaint textPaint) {
        this.A01 = charSequence;
        this.A00 = textPaint;
    }

    @Override // X.InterfaceC2106AyW
    public final int AYU(int i) {
        int iA00 = A00(i);
        if (iA00 == -1 || A00(iA00) == -1) {
            return -1;
        }
        return iA00;
    }

    @Override // X.InterfaceC2106AyW
    public final int AYW(int i) {
        return A00(i);
    }

    public C2063Axa() {
    }
}

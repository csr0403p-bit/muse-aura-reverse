package X;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes5.dex */
public abstract class E9U extends ReplacementSpan {
    public final CMN A02;
    public final Paint.FontMetricsInt A03 = new Paint.FontMetricsInt();
    public short A00 = -1;
    public float A01 = 1.0f;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.A03;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        CMN cmn = this.A02;
        this.A01 = fAbs / (CMN.A00(cmn).A02(14) != 0 ? r0.A04.getShort(r2 + r0.A00) : (short) 0);
        CMM cmmA00 = CMN.A00(cmn);
        int iA02 = cmmA00.A02(14);
        if (iA02 != 0) {
            cmmA00.A04.getShort(iA02 + cmmA00.A00);
        }
        short s = (short) ((CMN.A00(cmn).A02(12) != 0 ? r4.A04.getShort(r2 + r4.A00) : (short) 0) * this.A01);
        this.A00 = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }

    public E9U(CMN cmn) {
        this.A02 = cmn;
    }
}

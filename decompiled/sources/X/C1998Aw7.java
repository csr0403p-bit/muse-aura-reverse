package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.Aw7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1998Aw7 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1 || layout.getEllipsisCount(lineForOffset) <= 0) {
            return;
        }
        float fA00 = AbstractC2003AwC.A00(paint, layout, lineForOffset) + AbstractC2003AwC.A01(paint, layout, lineForOffset);
        if (fA00 != 0.0f) {
            C7384Etj.A0X(canvas);
            canvas.translate(fA00, 0.0f);
        }
    }
}

package X;

import android.text.style.LeadingMarginSpan;

/* renamed from: X.AlJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1554AlJ implements LeadingMarginSpan {
    public final C1DM A00;
    public final AXN A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final C16b A06;

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    @Override // android.text.style.LeadingMarginSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawLeadingMargin(android.graphics.Canvas r15, android.graphics.Paint r16, int r17, int r18, int r19, int r20, int r21, java.lang.CharSequence r22, int r23, int r24, boolean r25, android.text.Layout r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1554AlJ.drawLeadingMargin(android.graphics.Canvas, android.graphics.Paint, int, int, int, int, int, java.lang.CharSequence, int, int, boolean, android.text.Layout):void");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.A04;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }

    public C1554AlJ(C1DM c1dm, C16b c16b, AXN axn, float f, float f2, float f3, float f4) {
        this.A00 = c1dm;
        this.A03 = f;
        this.A02 = f2;
        this.A06 = c16b;
        this.A01 = axn;
        int iA01 = Ab3.A01(f + f3);
        this.A05 = iA01;
        this.A04 = Ab3.A01(f4) - iA01;
    }
}

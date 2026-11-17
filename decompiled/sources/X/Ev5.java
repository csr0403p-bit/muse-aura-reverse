package X;

import android.text.TextPaint;

/* loaded from: classes5.dex */
public final class Ev5 extends E9U {
    public TextPaint A00;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r15, java.lang.CharSequence r16, int r17, int r18, float r19, int r20, int r21, int r22, android.graphics.Paint r23) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof android.text.Spanned
            r13 = 0
            r7 = r15
            r11 = r19
            r5 = r23
            r6 = r14
            if (r0 == 0) goto L26
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.Class<android.text.style.CharacterStyle> r0 = android.text.style.CharacterStyle.class
            r1 = r18
            r2 = r17
            java.lang.Object[] r4 = r3.getSpans(r2, r1, r0)
            android.text.style.CharacterStyle[] r4 = (android.text.style.CharacterStyle[]) r4
            int r3 = r4.length
            if (r3 == 0) goto L26
            r2 = 0
            r0 = 1
            if (r3 != r0) goto L85
            r0 = r4[r2]
            if (r0 != r14) goto L85
        L26:
            boolean r0 = r5 instanceof android.text.TextPaint
            if (r0 == 0) goto L61
            r13 = r5
            android.text.TextPaint r13 = (android.text.TextPaint) r13
        L2d:
            if (r13 == 0) goto L61
            int r0 = r13.bgColor
            if (r0 == 0) goto L61
            short r0 = r14.A00
            float r0 = (float) r0
            float r17 = r19 + r0
            r0 = r20
            float r4 = (float) r0
            r0 = r22
            float r3 = (float) r0
            int r2 = r13.getColor()
            android.graphics.Paint$Style r1 = r13.getStyle()
            int r0 = r13.bgColor
            r13.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r13.setStyle(r0)
            r14 = r15
            r15 = r11
            r18 = r3
            r19 = r13
            r16 = r4
            r14.drawRect(r15, r16, r17, r18, r19)
            r13.setStyle(r1)
            r13.setColor(r2)
        L61:
            X.E9X.A00()
            X.CMN r3 = r6.A02
            r0 = r21
            float r12 = (float) r0
            if (r13 != 0) goto L6c
            r13 = r5
        L6c:
            X.CPK r2 = r3.A01
            android.graphics.Typeface r0 = r2.A07
            android.graphics.Typeface r1 = r13.getTypeface()
            r13.setTypeface(r0)
            int r0 = r3.A00
            int r9 = r0 * 2
            char[] r8 = r2.A09
            r10 = 2
            r7.drawText(r8, r9, r10, r11, r12, r13)
            r13.setTypeface(r1)
            return
        L85:
            android.text.TextPaint r13 = r14.A00
            if (r13 != 0) goto L90
            android.text.TextPaint r13 = new android.text.TextPaint
            r13.<init>()
            r14.A00 = r13
        L90:
            r13.set(r5)
        L93:
            r1 = r4[r2]
            boolean r0 = r1 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L9c
            r1.updateDrawState(r13)
        L9c:
            int r2 = r2 + 1
            if (r2 >= r3) goto L2d
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ev5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}

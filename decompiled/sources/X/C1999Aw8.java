package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.Aw8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1999Aw8 {
    public C2000Aw9 A00;
    public C1959Auy A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Rect A08 = new Rect();
    public final Layout A09;
    public final TextPaint A0A;
    public final TextUtils.TruncateAt A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final Paint.FontMetricsInt A0F;
    public final Av1 A0G;
    public final C2002AwB[] A0H;

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0215, code lost:
    
        r2 = r1.A00;
        r5 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0271, code lost:
    
        if (r4 < 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0273, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
    
        r2 = r1.A01;
        r5 = r2;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/Aw8;Landroid/text/Layout;LX/Aw9;ILandroid/graphics/RectF;LX/AyW;LX/G0V<-Landroid/graphics/RectF;-Landroid/graphics/RectF;Ljava/lang/Boolean;>;Z)I */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0278 A[LOOP:2: B:45:0x011c->B:150:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028d A[EDGE_INSN: B:164:0x028d->B:155:0x028d BREAK  A[LOOP:2: B:45:0x011c->B:150:0x0278], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(android.graphics.RectF r22, android.text.Layout r23, X.C2000Aw9 r24, X.C1999Aw8 r25, X.InterfaceC2106AyW r26, X.G0V r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1999Aw8.A00(android.graphics.RectF, android.text.Layout, X.Aw9, X.Aw8, X.AyW, X.G0V, int, boolean):int");
    }

    public static final Rect A01(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    rect.right += rect2.width();
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    public final float A02(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.A07 + ((i != this.A06 + (-1) || (fontMetricsInt = this.A0F) == null) ? this.A09.getLineBaseline(i) : A04(i) - fontMetricsInt.ascent);
    }

    public final float A03(int i) {
        float lineBottom;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.A06 - 1;
        if (i != i3 || (fontMetricsInt = this.A0F) == null) {
            lineBottom = this.A07 + this.A09.getLineBottom(i);
            i2 = i == i3 ? this.A04 : 0;
        } else {
            lineBottom = this.A09.getLineBottom(i - 1);
            i2 = fontMetricsInt.bottom;
        }
        return lineBottom + i2;
    }

    public final float A04(int i) {
        return this.A09.getLineTop(i) + (i == 0 ? 0 : this.A07);
    }

    public final float A05(int i, boolean z) {
        C2000Aw9 c2000Aw9 = this.A00;
        if (c2000Aw9 == null) {
            c2000Aw9 = new C2000Aw9(this.A09);
            this.A00 = c2000Aw9;
        }
        return c2000Aw9.A02(i, true, z) + (this.A09.getLineForOffset(i) == this.A06 + (-1) ? this.A02 + this.A03 : 0.0f);
    }

    public final float A06(int i, boolean z) {
        C2000Aw9 c2000Aw9 = this.A00;
        if (c2000Aw9 == null) {
            c2000Aw9 = new C2000Aw9(this.A09);
            this.A00 = c2000Aw9;
        }
        return c2000Aw9.A02(i, false, z) + (this.A09.getLineForOffset(i) == this.A06 + (-1) ? this.A02 + this.A03 : 0.0f);
    }

    public final int A07(int i) {
        Layout layout = this.A09;
        return (layout.getEllipsisCount(i) <= 0 || this.A0B != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : C8j3.A0H(layout);
    }

    public final C1959Auy A08() {
        C1959Auy c1959Auy = this.A01;
        if (c1959Auy != null) {
            return c1959Auy;
        }
        Layout layout = this.A09;
        C1959Auy c1959Auy2 = new C1959Auy(layout.getText(), this.A0A.getTextLocale(), C8j3.A0H(layout));
        this.A01 = c1959Auy2;
        return c1959Auy2;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/graphics/RectF;ILX/G0V<-Landroid/graphics/RectF;-Landroid/graphics/RectF;Ljava/lang/Boolean;>;)[I */
    public final int[] A09(RectF rectF, G0V g0v, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2001AwA.A01(rectF, this, g0v, i);
        }
        Layout layout = this.A09;
        C2000Aw9 c2000Aw9 = this.A00;
        if (c2000Aw9 == null) {
            c2000Aw9 = new C2000Aw9(layout);
            this.A00 = c2000Aw9;
        }
        CharSequence text = layout.getText();
        InterfaceC2106AyW c2016AwU = i == 1 ? new C2016AwU(A08(), text) : new C2063Axa(text, this.A0A);
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > A03(lineForVertical) && (lineForVertical = lineForVertical + 1) >= this.A06) {
            return null;
        }
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < A04(0)) {
            return null;
        }
        int iA00 = A00(rectF, layout, c2000Aw9, this, c2016AwU, g0v, lineForVertical, true);
        while (iA00 == -1) {
            if (lineForVertical >= lineForVertical2) {
                return null;
            }
            lineForVertical++;
            iA00 = A00(rectF, layout, c2000Aw9, this, c2016AwU, g0v, lineForVertical, true);
        }
        C2000Aw9 c2000Aw92 = c2000Aw9;
        InterfaceC2106AyW interfaceC2106AyW = c2016AwU;
        int iA002 = A00(rectF, layout, c2000Aw92, this, interfaceC2106AyW, g0v, lineForVertical2, false);
        while (iA002 == -1) {
            if (lineForVertical >= lineForVertical2) {
                return null;
            }
            lineForVertical2--;
            iA002 = A00(rectF, layout, c2000Aw92, this, interfaceC2106AyW, g0v, lineForVertical2, false);
        }
        return new int[]{c2016AwU.AYW(iA00 + 1), c2016AwU.ARI(iA002 - 1)};
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f A[PHI: r1
  0x015f: PHI (r1v8 boolean) = (r1v7 boolean), (r1v39 boolean), (r1v39 boolean), (r1v39 boolean), (r1v39 boolean) binds: [B:118:0x0220, B:64:0x014f, B:66:0x0153, B:68:0x0157, B:70:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1999Aw8(android.text.TextPaint r16, android.text.TextUtils.TruncateAt r17, X.Av1 r18, java.lang.CharSequence r19, float r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1999Aw8.<init>(android.text.TextPaint, android.text.TextUtils$TruncateAt, X.Av1, java.lang.CharSequence, float, int, int, int, int, int, int, int, int, boolean):void");
    }
}

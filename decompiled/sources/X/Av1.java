package X;

import android.text.BoringLayout;
import android.text.TextPaint;

/* loaded from: classes4.dex */
public final class Av1 {
    public BoringLayout.Metrics A01;
    public boolean A02;
    public CharSequence A04;
    public final int A05;
    public final TextPaint A06;
    public final CharSequence A07;
    public float A03 = Float.NaN;
    public float A00 = Float.NaN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence A00(X.Av1 r7) {
        /*
            java.lang.CharSequence r5 = r7.A04
            if (r5 != 0) goto L3f
            java.lang.CharSequence r6 = r7.A07
            boolean r0 = r6 instanceof android.text.Spanned
            if (r0 == 0) goto L3c
            r2 = r6
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<android.text.style.CharacterStyle> r1 = android.text.style.CharacterStyle.class
            boolean r0 = X.AbstractC2029Awi.A00(r2, r1)
            if (r0 == 0) goto L3c
            int r0 = r6.length()
            r4 = 0
            java.lang.Object[] r3 = r2.getSpans(r4, r0, r1)
            android.text.style.CharacterStyle[] r3 = (android.text.style.CharacterStyle[]) r3
            if (r3 == 0) goto L3c
            int r2 = r3.length
            if (r2 == 0) goto L3c
            r5 = 0
        L26:
            r1 = r3[r4]
            boolean r0 = r1 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L36
            if (r5 != 0) goto L33
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r6)
        L33:
            r5.removeSpan(r1)
        L36:
            int r4 = r4 + 1
            if (r4 < r2) goto L26
            if (r5 != 0) goto L3d
        L3c:
            r5 = r6
        L3d:
            r7.A04 = r5
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Av1.A00(X.Av1):java.lang.CharSequence");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A01() {
        /*
            r5 = this;
            float r4 = r5.A03
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 == 0) goto L6d
            boolean r0 = r5.A02
            if (r0 != 0) goto L1f
            int r0 = r5.A05
            android.text.TextDirectionHeuristic r2 = X.AbstractC2117Ayi.A00(r0)
            java.lang.CharSequence r1 = r5.A07
            android.text.TextPaint r0 = r5.A06
            android.text.BoringLayout$Metrics r0 = X.AbstractC2015AwT.A00(r2, r0, r1)
            r5.A01 = r0
            r0 = 1
            r5.A02 = r0
        L1f:
            android.text.BoringLayout$Metrics r0 = r5.A01
            if (r0 == 0) goto L2b
            int r0 = r0.width
            float r4 = (float) r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L44
        L2b:
            java.lang.CharSequence r0 = A00(r5)
            int r3 = r0.length()
            r2 = 0
            java.lang.CharSequence r1 = A00(r5)
            android.text.TextPaint r0 = r5.A06
            float r0 = android.text.Layout.getDesiredWidth(r1, r2, r3, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r4 = (float) r0
        L44:
            java.lang.CharSequence r3 = r5.A07
            android.text.TextPaint r2 = r5.A06
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            boolean r0 = r3 instanceof android.text.Spanned
            if (r0 == 0) goto L63
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.Class<X.As5> r0 = X.As5.class
            boolean r0 = X.AbstractC2029Awi.A00(r3, r0)
            if (r0 != 0) goto L6e
            java.lang.Class<X.As9> r0 = X.As9.class
            boolean r0 = X.AbstractC2029Awi.A00(r3, r0)
            if (r0 != 0) goto L6e
        L63:
            float r0 = r2.getLetterSpacing()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6e
        L6b:
            r5.A03 = r4
        L6d:
            return r4
        L6e:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Av1.A01():float");
    }

    public Av1(TextPaint textPaint, CharSequence charSequence, int i) {
        this.A07 = charSequence;
        this.A06 = textPaint;
        this.A05 = i;
    }
}

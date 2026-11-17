package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.FSs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8087FSs {
    public Typeface A00;
    public Typeface A01;
    public String A02;
    public final TextView A03;
    public final BeM<Typeface> A04;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        if (r1 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(java.lang.String r14) {
        /*
            r13 = this;
            android.graphics.Typeface r10 = r13.A01
            android.widget.TextView r3 = r13.A03
            android.text.TextPaint r2 = r3.getPaint()
            android.graphics.Typeface r1 = r13.A00
            android.graphics.Typeface r0 = r2.getTypeface()
            if (r1 == r0) goto L1b
            java.lang.String r1 = "FontVarSettings"
            java.lang.String r0 = "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint()."
            android.util.Log.w(r1, r0)
            android.graphics.Typeface r10 = r2.getTypeface()
        L1b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L30
            android.content.Context r0 = r3.getContext()
            android.content.res.Configuration r0 = X.C8j3.A0Z(r0)
            int r2 = r0.fontWeightAdjustment
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L31
        L30:
            r2 = 0
        L31:
            r9 = 0
            X.Hld r8 = new X.Hld
            r8.<init>(r10, r14, r2)
            X.EzA<X.Hld, android.graphics.Typeface> r7 = X.AbstractC8086FSr.A01
            java.lang.Object r1 = r7.A02(r8)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto Ld1
            android.graphics.Paint r6 = X.AbstractC8086FSr.A00
            if (r6 != 0) goto L4b
            android.graphics.Paint r6 = X.AbstractC7607F5u.A0T()
            X.AbstractC8086FSr.A00 = r6
        L4b:
            r3 = r14
            if (r2 == 0) goto Lb1
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L86
            android.graphics.fonts.FontVariationAxis[] r1 = new android.graphics.fonts.FontVariationAxis[r9]
        L56:
            r11 = 0
            r12 = 0
        L58:
            int r5 = r1.length
            java.lang.String r4 = "wght"
            if (r11 >= r5) goto L8d
            r3 = r1[r11]
            java.lang.String r0 = r3.getTag()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L83
            float r5 = r3.getStyleValue()
            float r0 = (float) r2
            float r5 = r5 + r0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L7b
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = java.lang.Math.min(r5, r0)
        L7b:
            android.graphics.fonts.FontVariationAxis r0 = new android.graphics.fonts.FontVariationAxis
            r0.<init>(r4, r3)
            r1[r11] = r0
            r12 = 1
        L83:
            int r11 = r11 + 1
            goto L58
        L86:
            android.graphics.fonts.FontVariationAxis[] r1 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r14)
            if (r1 != 0) goto L56
            goto Lb1
        L8d:
            if (r12 != 0) goto Lad
            int r0 = r5 + 1
            android.graphics.fonts.FontVariationAxis[] r3 = new android.graphics.fonts.FontVariationAxis[r0]
            java.lang.System.arraycopy(r1, r9, r3, r9, r5)
            int r0 = r2 + 400
            float r2 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto La5
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = java.lang.Math.min(r2, r0)
        La5:
            android.graphics.fonts.FontVariationAxis r0 = new android.graphics.fonts.FontVariationAxis
            r0.<init>(r4, r1)
            r3[r5] = r0
            r1 = r3
        Lad:
            java.lang.String r3 = android.graphics.fonts.FontVariationAxis.toFontVariationSettings(r1)
        Lb1:
            java.lang.String r0 = r6.getFontVariationSettings()
            boolean r1 = X.C6xC.A00(r0, r3)
            r0 = 0
            if (r1 == 0) goto Lbf
            r6.setFontVariationSettings(r0)
        Lbf:
            r6.setTypeface(r10)
            boolean r0 = r6.setFontVariationSettings(r3)
            if (r0 == 0) goto Ldc
            android.graphics.Typeface r1 = r6.getTypeface()
            r7.A05(r8, r1)
            if (r1 == 0) goto Ldc
        Ld1:
            r13.A00 = r1
            X.BeM<android.graphics.Typeface> r0 = r13.A04
            r0.accept(r1)
            r13.A02 = r14
            r0 = 1
            return r0
        Ldc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8087FSs.A00(java.lang.String):boolean");
    }

    public C8087FSs(TextView textView, BeM<Typeface> beM) {
        this.A03 = textView;
        this.A04 = beM;
    }
}

package X;

/* loaded from: classes6.dex */
public abstract class FI7 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r8.equals("italic") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r8.equals("normal") != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085 A[Catch: NullPointerException -> 0x00ba, TRY_ENTER, TryCatch #0 {NullPointerException -> 0x00ba, blocks: (B:51:0x00ac, B:53:0x00b3, B:54:0x00b5, B:49:0x00a0, B:44:0x0091, B:46:0x0099, B:47:0x009b, B:42:0x0085), top: B:58:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091 A[Catch: NullPointerException -> 0x00ba, TryCatch #0 {NullPointerException -> 0x00ba, blocks: (B:51:0x00ac, B:53:0x00b3, B:54:0x00b5, B:49:0x00a0, B:44:0x0091, B:46:0x0099, B:47:0x009b, B:42:0x0085), top: B:58:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Typeface A00(android.content.Context r5, android.graphics.Typeface r6, X.FJK r7, java.lang.String r8) throws com.instagram.common.bloks.lexer.ParsingException {
        /*
            r0 = 400(0x190, float:5.6E-43)
            if (r6 == 0) goto L8
            int r0 = r6.getWeight()
        L8:
            r1 = 400(0x190, float:5.6E-43)
            r2 = 0
            if (r0 <= r1) goto Lf
            int r2 = r0 - r1
        Lf:
            int r0 = r8.hashCode()
            switch(r0) {
                case -1178781136: goto L1d;
                case -1078030475: goto L26;
                case -1039745817: goto L31;
                case 3029637: goto L3a;
                case 99152071: goto L45;
                case 102970646: goto L50;
                case 1223860979: goto L5b;
                case 1734741290: goto L70;
                default: goto L16;
            }
        L16:
            java.lang.String r0 = "Can't parse unknown typeface: "
            com.instagram.common.bloks.lexer.ParsingException r0 = X.FGI.A00(r0, r8)
            throw r0
        L1d:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            goto L7a
        L26:
            java.lang.String r0 = "medium"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            r1 = 500(0x1f4, float:7.0E-43)
            goto L65
        L31:
            java.lang.String r0 = "normal"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            goto L65
        L3a:
            java.lang.String r0 = "bold"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            r1 = 700(0x2bc, float:9.81E-43)
            goto L65
        L45:
            java.lang.String r0 = "heavy"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            r1 = 800(0x320, float:1.121E-42)
            goto L65
        L50:
            java.lang.String r0 = "light"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            r1 = 300(0x12c, float:4.2E-43)
            goto L65
        L5b:
            java.lang.String r0 = "semibold"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            r1 = 600(0x258, float:8.41E-43)
        L65:
            int r1 = r1 + r2
            r4 = 1000(0x3e8, float:1.401E-42)
            int r3 = java.lang.Math.min(r1, r4)
            r2 = 0
            if (r7 == 0) goto L91
            goto L85
        L70:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            r1 = 700(0x2bc, float:9.81E-43)
        L7a:
            int r1 = r1 + r2
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.min(r1, r3)
            r1 = 1
            if (r7 == 0) goto Lac
            goto La0
        L85:
            r0 = r7
            com.facebook.aura.bloks.fonts.AuraVariableFontBuilder r0 = (com.facebook.aura.bloks.fonts.AuraVariableFontBuilder) r0     // Catch: java.lang.NullPointerException -> Lba
            r0.weight = r3     // Catch: java.lang.NullPointerException -> Lba
            r0.italic = r2     // Catch: java.lang.NullPointerException -> Lba
            android.graphics.Typeface r0 = r7.build(r5)     // Catch: java.lang.NullPointerException -> Lba
            return r0
        L91:
            java.lang.String r1 = "weight"
            r0 = 1
            X.BeS.A04(r1, r3, r0, r4)     // Catch: java.lang.NullPointerException -> Lba
            if (r6 != 0) goto L9b
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT     // Catch: java.lang.NullPointerException -> Lba
        L9b:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r6, r3, r2)     // Catch: java.lang.NullPointerException -> Lba
            return r0
        La0:
            r0 = r7
            com.facebook.aura.bloks.fonts.AuraVariableFontBuilder r0 = (com.facebook.aura.bloks.fonts.AuraVariableFontBuilder) r0     // Catch: java.lang.NullPointerException -> Lba
            r0.weight = r2     // Catch: java.lang.NullPointerException -> Lba
            r0.italic = r1     // Catch: java.lang.NullPointerException -> Lba
            android.graphics.Typeface r0 = r7.build(r5)     // Catch: java.lang.NullPointerException -> Lba
            return r0
        Lac:
            java.lang.String r0 = "weight"
            X.BeS.A04(r0, r2, r1, r3)     // Catch: java.lang.NullPointerException -> Lba
            if (r6 != 0) goto Lb5
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT     // Catch: java.lang.NullPointerException -> Lba
        Lb5:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r6, r2, r1)     // Catch: java.lang.NullPointerException -> Lba
            return r0
        Lba:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FI7.A00(android.content.Context, android.graphics.Typeface, X.FJK, java.lang.String):android.graphics.Typeface");
    }
}

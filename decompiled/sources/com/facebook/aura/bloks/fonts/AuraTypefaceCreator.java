package com.facebook.aura.bloks.fonts;

/* loaded from: classes6.dex */
public final class AuraTypefaceCreator {
    public static final AuraTypefaceCreator INSTANCE = new AuraTypefaceCreator();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.bloks.fonts.AuraVariableFontBuilder createTypefaceBuilderFromFontFamily(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 1
            X.C7384Etj.A0Y(r4, r0)
            int r0 = r4.hashCode()
            r3 = 0
            switch(r0) {
                case -1604433430: goto L43;
                case -1486560683: goto L2c;
                case -385284302: goto L1e;
                case -306555237: goto L1b;
                case -306554589: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r3
        Ld:
            java.lang.String r0 = "Optimistic VF"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc
            r2 = 2131296262(0x7f090006, float:1.8210436E38)
            java.lang.String r1 = "optimistic_vf.ttf"
            goto L50
        L1b:
            java.lang.String r0 = "Optimistic AI"
            goto L2e
        L1e:
            java.lang.String r0 = "Roboto Mono VF"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc
            r2 = 2131296263(0x7f090007, float:1.8210438E38)
            java.lang.String r1 = "roboto_mono_vf.ttf"
            goto L50
        L2c:
            java.lang.String r0 = "Optimistic AI VF"
        L2e:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc
            com.facebook.aura.vds.font.api.AuraAppTypeface r0 = com.facebook.aura.vds.font.api.AuraAppTypeface.INSTANCE
            int r2 = r0.getOptimisticAi()
            r0 = 17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "optimistic_ai_vf.ttf"
            goto L50
        L43:
            java.lang.String r0 = "Optimistic VF App Lite"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc
            r2 = 2131296259(0x7f090003, float:1.821043E38)
            java.lang.String r1 = "optimistic_vf_app_lite.ttf"
        L50:
            com.facebook.aura.bloks.fonts.AuraVariableFontBuilder r0 = new com.facebook.aura.bloks.fonts.AuraVariableFontBuilder
            r0.<init>(r2, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.fonts.AuraTypefaceCreator.createTypefaceBuilderFromFontFamily(android.content.Context, java.lang.String):com.facebook.aura.bloks.fonts.AuraVariableFontBuilder");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface createTypefaceFromFontFamily(android.content.Context r1, java.lang.String r2, int r3) {
        /*
            r0 = this;
            X.AnonymousClass003.A0u(r1, r2)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1604433430: goto L5f;
                case -1486560683: goto L50;
                case -1231384652: goto L44;
                case -385284302: goto L38;
                case -306555237: goto L35;
                case -306554589: goto L29;
                case 627451709: goto L1d;
                case 1178287748: goto L12;
                default: goto La;
            }
        La:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r2, r3)
            X.C7384Etj.A0U(r0)
        L11:
            return r0
        L12:
            java.lang.String r0 = "Optimistic Text App Bold"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131296256(0x7f090000, float:1.8210424E38)
            goto L6a
        L1d:
            java.lang.String r0 = "Optimistic Text App Regular"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131296258(0x7f090002, float:1.8210428E38)
            goto L6a
        L29:
            java.lang.String r0 = "Optimistic VF"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131296262(0x7f090006, float:1.8210436E38)
            goto L6a
        L35:
            java.lang.String r0 = "Optimistic AI"
            goto L52
        L38:
            java.lang.String r0 = "Roboto Mono VF"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131296263(0x7f090007, float:1.8210438E38)
            goto L6a
        L44:
            java.lang.String r0 = "Optimistic Text App Medium"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131296257(0x7f090001, float:1.8210426E38)
            goto L6a
        L50:
            java.lang.String r0 = "Optimistic AI VF"
        L52:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            com.facebook.aura.vds.font.api.AuraAppTypeface r0 = com.facebook.aura.vds.font.api.AuraAppTypeface.INSTANCE
            int r0 = r0.getOptimisticAi()
            goto L6a
        L5f:
            java.lang.String r0 = "Optimistic VF App Lite"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131296259(0x7f090003, float:1.821043E38)
        L6a:
            int r0 = X.BV6.A02(r0)
            android.graphics.Typeface r0 = X.CMG.A00(r1, r0)
            if (r0 == 0) goto La
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            if (r0 != 0) goto L11
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.fonts.AuraTypefaceCreator.createTypefaceFromFontFamily(android.content.Context, java.lang.String, int):android.graphics.Typeface");
    }
}

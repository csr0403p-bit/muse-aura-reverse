package com.facebook.aura.marketplacemap;

/* loaded from: classes4.dex */
public abstract class MarketplaceMapLoggingKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberMarketplaceMapImpression(java.lang.String r13, com.facebook.aura.marketplacemap.MarketplaceMapLogContext r14, X.BFM r15, int r16) {
        /*
            X.AnonymousClass003.A0u(r13, r14)
            r0 = r16 & 14
            r1 = r0 ^ 6
            r4 = 0
            r2 = 4
            r0 = r15
            if (r1 <= r2) goto L12
            boolean r1 = r15.A65(r13)
            if (r1 != 0) goto L17
        L12:
            r1 = r16 & 6
            r3 = 0
            if (r1 != r2) goto L18
        L17:
            r3 = 1
        L18:
            r1 = r16 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 32
            if (r1 <= r2) goto L26
            boolean r1 = r15.A65(r14)
            if (r1 != 0) goto L2a
        L26:
            r1 = r16 & 48
            if (r1 != r2) goto L2b
        L2a:
            r4 = 1
        L2b:
            r3 = r3 | r4
            java.lang.Object r1 = r15.AaT()
            if (r3 != 0) goto L36
            java.lang.Object r2 = X.C78N.A00
            if (r1 != r2) goto L59
        L36:
            X.BS0 r2 = X.BRg.A00
            com.facebook.aura.analytics.hatch.HatchOrigin r3 = com.facebook.aura.analytics.hatch.HatchOrigin.CHAT
            com.facebook.aura.analytics.hatch.HatchSurface r4 = com.facebook.aura.analytics.hatch.HatchSurface.CHAT
            com.facebook.aura.analytics.hatch.HatchSubsurface r5 = com.facebook.aura.analytics.hatch.HatchSubsurface.MESSAGE_LIST
            com.facebook.aura.analytics.hatch.HatchScreen r6 = r14.impressionScreen
            com.facebook.aura.analytics.hatch.HatchComponent r7 = com.facebook.aura.analytics.hatch.HatchComponent.MARKETPLACE_MAP
            java.util.Map<java.lang.String, java.lang.String> r9 = r14.metadata
            java.lang.String r1 = "marketplace_map:"
            java.lang.String r14 = X.FGI.A0M(r1, r13)
            r8 = 0
            r11 = 500(0x1f4, double:2.47E-321)
            r13 = 0
            r10 = r8
            r15 = r8
            r16 = r8
            X.BRg r1 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.hatchImpression(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            r0.Ai0(r1)
        L59:
            X.BRg r1 = (X.BRg) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.marketplacemap.MarketplaceMapLoggingKt.rememberMarketplaceMapImpression(java.lang.String, com.facebook.aura.marketplacemap.MarketplaceMapLogContext, X.BFM, int):X.BRg");
    }
}

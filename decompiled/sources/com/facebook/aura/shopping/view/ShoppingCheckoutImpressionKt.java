package com.facebook.aura.shopping.view;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchShoppingSurface;
import com.facebook.aura.model.ExternalLinkPresentation;
import com.facebook.aura.model.ShoppingCheckoutAttribution;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;

/* loaded from: classes3.dex */
public abstract class ShoppingCheckoutImpressionKt {
    public static final long SHOPPING_CHECKOUT_IMPRESSION_MIN_DURATION_MS = 250;
    public static final float SHOPPING_CHECKOUT_IMPRESSION_MIN_FRACTION_VISIBLE = 0.5f;

    public static final ShoppingCheckoutLogContext rememberCheckoutOfferLogContext(ExternalLinkPresentation externalLinkPresentation, String str, HatchScreen hatchScreen, BFM bfm, int i) {
        AnonymousClass005.A10(externalLinkPresentation, str, hatchScreen);
        bfm.AgE(-1027644819);
        ShoppingCheckoutAttribution shoppingCheckoutAttribution = externalLinkPresentation.shoppingCheckout;
        if (shoppingCheckoutAttribution == null) {
            AnonymousClass001.A1D(bfm);
            return null;
        }
        ShoppingCheckoutLogContext shoppingCheckoutLogContextRememberShoppingCheckoutLogContext = rememberShoppingCheckoutLogContext(HatchShoppingSurface.CHECKOUT_OFFER, hatchScreen, externalLinkPresentation.widgetId, str, shoppingCheckoutAttribution.provider, shoppingCheckoutAttribution.flowId, shoppingCheckoutAttribution.entryPoint, bfm, ((i >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | ((i << 6) & 7168), 0);
        AnonymousClass001.A1D(bfm);
        return shoppingCheckoutLogContextRememberShoppingCheckoutLogContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext rememberShoppingCheckoutLogContext(com.facebook.aura.analytics.hatch.HatchShoppingSurface r9, com.facebook.aura.analytics.hatch.HatchScreen r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.BFM r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingCheckoutImpressionKt.rememberShoppingCheckoutLogContext(com.facebook.aura.analytics.hatch.HatchShoppingSurface, com.facebook.aura.analytics.hatch.HatchScreen, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.BFM, int, int):com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberShoppingCheckoutImpression(com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext r15, com.facebook.aura.analytics.hatch.HatchShoppingControl r16, com.facebook.aura.analytics.hatch.HatchShoppingDataState r17, X.BFM r18, int r19, int r20) {
        /*
            r14 = r16
            r0 = 0
            r13 = r15
            X.C7384Etj.A0Y(r15, r0)
            r0 = r20 & 2
            r15 = 0
            if (r0 == 0) goto Ld
            r14 = r15
        Ld:
            r2 = 4
            r0 = r20 & 4
            if (r0 != 0) goto L14
            r15 = r17
        L14:
            r5 = -1
            r4 = r19
            r0 = r19 & 14
            r0 = r0 ^ 6
            r7 = 0
            r1 = r18
            if (r0 <= r2) goto L26
            boolean r0 = r1.A65(r13)
            if (r0 != 0) goto L2b
        L26:
            r0 = r19 & 6
            r6 = 0
            if (r0 != r2) goto L2c
        L2b:
            r6 = 1
        L2c:
            r0 = r19 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r3 = 32
            if (r0 <= r3) goto L3e
            int r0 = X.AnonymousClass003.A0K(r14)
            boolean r0 = r1.A63(r0)
            if (r0 != 0) goto L43
        L3e:
            r2 = r19 & 48
            r0 = 0
            if (r2 != r3) goto L44
        L43:
            r0 = 1
        L44:
            r6 = r6 | r0
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L59
            if (r15 == 0) goto L53
            int r5 = r15.ordinal()
        L53:
            boolean r0 = r1.A63(r5)
            if (r0 != 0) goto L5d
        L59:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != r2) goto L5e
        L5d:
            r7 = 1
        L5e:
            r6 = r6 | r7
            java.lang.Object r0 = r1.AaT()
            if (r6 != 0) goto L69
            java.lang.Object r2 = X.C78N.A00
            if (r0 != r2) goto La5
        L69:
            X.BS0 r5 = X.BRg.A00
            com.facebook.aura.analytics.hatch.HatchOrigin r6 = com.facebook.aura.analytics.hatch.HatchOrigin.SHOPPING
            com.facebook.aura.analytics.hatch.HatchSurface r7 = com.facebook.aura.analytics.hatch.HatchSurface.SHOPPING
            com.facebook.aura.analytics.hatch.HatchScreen r9 = r13.screen
            if (r14 != 0) goto Lab
            com.facebook.aura.analytics.hatch.HatchComponent r10 = com.facebook.aura.analytics.hatch.HatchComponent.SHOPPING_SURFACE
        L75:
            r8 = 0
            java.lang.String r2 = r13.checkoutFlowId
            java.lang.String r0 = r13.checkoutEntryPoint
            r16 = r8
            r17 = r2
            r18 = r0
            X.BO6 r12 = com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLoggingKt.metadata(r13, r14, r15, r16, r17, r18)
            java.lang.String r4 = r13.viewId
            if (r14 == 0) goto La8
            java.lang.String r3 = r14.name()
        L8c:
            java.lang.String r2 = "shopping_checkout:"
            java.lang.String r0 = ":"
            java.lang.String r17 = X.FGI.A0d(r2, r4, r0, r3)
            r14 = 250(0xfa, double:1.235E-321)
            r16 = 1056964608(0x3f000000, float:0.5)
            r11 = r8
            r13 = r8
            r18 = r8
            r19 = r8
            X.BRg r0 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.hatchImpression(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            r1.Ai0(r0)
        La5:
            X.BRg r0 = (X.BRg) r0
            return r0
        La8:
            java.lang.String r3 = "surface"
            goto L8c
        Lab:
            com.facebook.aura.analytics.hatch.HatchComponent r10 = com.facebook.aura.analytics.hatch.HatchComponent.SHOPPING_ACTION
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingCheckoutImpressionKt.rememberShoppingCheckoutImpression(com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext, com.facebook.aura.analytics.hatch.HatchShoppingControl, com.facebook.aura.analytics.hatch.HatchShoppingDataState, X.BFM, int, int):X.BRg");
    }
}

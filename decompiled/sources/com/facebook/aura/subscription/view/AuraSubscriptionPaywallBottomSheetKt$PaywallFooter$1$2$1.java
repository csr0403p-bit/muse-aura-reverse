package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.model.PaywallCta;
import com.facebook.aura.subscription.model.PurchaseTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PaywallCta $cta;
    public final /* synthetic */ String $currentTierCode;
    public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
    public final /* synthetic */ Boolean $homeLinkSelected;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
    public final /* synthetic */ Function0<Unit> $onPlanChangeBlocked;
    public final /* synthetic */ G0U<PurchaseTap, Unit> $proceedToPurchase;
    public final /* synthetic */ String $selectedId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$1$2$1(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, String str, Function0<Unit> function0, G0U<? super PurchaseTap, Unit> g0u, PaywallCta paywallCta, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, Boolean bool, String str2) {
        super(0);
        this.$loaded = loaded;
        this.$selectedId = str;
        this.$onPlanChangeBlocked = function0;
        this.$proceedToPurchase = g0u;
        this.$cta = paywallCta;
        this.$entryPoint = subscriptionPaywallEntryPoint;
        this.$homeLinkSelected = bool;
        this.$currentTierCode = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r15 = this;
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loaded r1 = r15.$loaded
            r0 = 0
            if (r1 == 0) goto Lc6
            X.AHD<com.facebook.aura.subscription.repo.SubscriptionProduct> r1 = r1.products
            if (r1 == 0) goto Lc6
            java.lang.String r3 = r15.$selectedId
            java.util.Iterator r2 = r1.iterator()
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r4 = r2.next()
            r1 = r4
            com.facebook.aura.subscription.repo.SubscriptionProduct r1 = (com.facebook.aura.subscription.repo.SubscriptionProduct) r1
            java.lang.String r1 = r1.productId
            boolean r1 = X.C7384Etj.areEqual(r1, r3)
            if (r1 == 0) goto Lf
        L24:
            com.facebook.aura.subscription.repo.SubscriptionProduct r4 = (com.facebook.aura.subscription.repo.SubscriptionProduct) r4
            if (r4 == 0) goto Lc7
            java.lang.Long r10 = r4.selectedTier
        L2a:
            java.lang.String r12 = com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.xgradeDirection(r4)
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loaded r3 = r15.$loaded
            if (r3 == 0) goto L38
            boolean r2 = r3.isPaidTier
            r1 = 1
            r14 = 1
            if (r2 == r1) goto L39
        L38:
            r14 = 0
        L39:
            java.lang.String r2 = r15.$selectedId
            if (r2 == 0) goto L49
            if (r3 == 0) goto L49
            X.BO6<java.lang.String, com.facebook.aura.iap.HatchTierPrice> r1 = r3.prices
            if (r1 == 0) goto L49
            java.lang.Object r0 = r1.get(r2)
            com.facebook.aura.iap.HatchTierPrice r0 = (com.facebook.aura.iap.HatchTierPrice) r0
        L49:
            java.util.Map r13 = com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.tierPriceEventData(r4, r0)
            com.facebook.aura.subscription.model.PaywallCta r8 = r15.$cta
            com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint r7 = r15.$entryPoint
            java.lang.String r6 = r15.$selectedId
            java.lang.Boolean r5 = r15.$homeLinkSelected
            java.lang.String r3 = r15.$currentTierCode
            X.AIa r2 = X.C3cG.A0u()
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.CTA_TYPE
            java.lang.String r1 = r0.getValue()
            java.lang.String r0 = com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.paywallCtaType(r8)
            r2.put(r1, r0)
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.ENTRY_POINT
            java.lang.String r1 = r0.getValue()
            java.lang.String r0 = r7.getValue()
            r2.put(r1, r0)
            if (r6 == 0) goto L7c
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.SELECTED_PRODUCT_ID
            X.AnonymousClass001.A1C(r0, r6, r2)
        L7c:
            if (r5 == 0) goto L87
            boolean r1 = r5.booleanValue()
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.HOME_LINK_SELECTED
            X.AnonymousClass003.A0s(r0, r2, r1)
        L87:
            if (r3 == 0) goto L8e
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.CURRENT_TIER
            X.AnonymousClass001.A1C(r0, r3, r2)
        L8e:
            if (r4 == 0) goto L9f
            java.lang.String r1 = r4.tierCode
            if (r1 == 0) goto L9f
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L9f
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.TARGET_TIER
            X.AnonymousClass001.A1C(r0, r1, r2)
        L9f:
            X.AIa r11 = X.AIW.A0K(r2)
            java.lang.String r9 = r15.$selectedId
            com.facebook.aura.subscription.model.PurchaseTap r8 = new com.facebook.aura.subscription.model.PurchaseTap
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.facebook.aura.analytics.hatch.HatchInteractionLogger r0 = com.facebook.aura.analytics.hatch.HatchInteractionLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchSurface r1 = com.facebook.aura.analytics.hatch.HatchSurface.MONETIZATION
            com.facebook.aura.analytics.hatch.HatchSubsurface r2 = com.facebook.aura.analytics.hatch.HatchSubsurface.SUBSCRIPTION
            com.facebook.aura.analytics.hatch.HatchScreen r3 = com.facebook.aura.analytics.hatch.HatchScreen.SUBSCRIPTION_PAYWALL
            com.facebook.aura.analytics.hatch.HatchComponent r4 = com.facebook.aura.analytics.hatch.HatchComponent.PAY_NOW_BUTTON
            java.util.Map<java.lang.String, java.lang.String> r6 = r8.payMetadata
            r5 = 0
            r7 = r5
            r0.logClick(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r15.$onPlanChangeBlocked
            if (r0 == 0) goto Lca
            r0.invoke()
            return
        Lc3:
            r4 = r0
            goto L24
        Lc6:
            r4 = r0
        Lc7:
            r10 = r0
            goto L2a
        Lca:
            X.G0U<com.facebook.aura.subscription.model.PurchaseTap, kotlin.Unit> r0 = r15.$proceedToPurchase
            r0.invoke(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$1$2$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

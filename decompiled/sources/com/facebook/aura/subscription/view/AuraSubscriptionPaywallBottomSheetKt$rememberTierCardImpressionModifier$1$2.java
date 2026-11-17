package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.C98f;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$rememberTierCardImpressionModifier$1$2 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $currentTierCode;
    public final /* synthetic */ boolean $hasDowngradeOption;
    public final /* synthetic */ boolean $hasUpgradeOption;
    public final /* synthetic */ PaywallImpressionState $impressions;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ SubscriptionProduct $product;
    public final /* synthetic */ C98d $waterfallStage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$rememberTierCardImpressionModifier$1$2(PaywallImpressionState paywallImpressionState, C98d c98d, C98f c98f, String str, boolean z, boolean z2, SubscriptionProduct subscriptionProduct) {
        super(0);
        this.$impressions = paywallImpressionState;
        this.$waterfallStage = c98d;
        this.$nmeEntryPoint = c98f;
        this.$currentTierCode = str;
        this.$hasUpgradeOption = z;
        this.$hasDowngradeOption = z2;
        this.$product = subscriptionProduct;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PaywallImpressionState paywallImpressionState = this.$impressions;
        if (paywallImpressionState != null) {
            paywallImpressionState.loggedTierCards.put(this.$product.productId, true);
        }
        HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = new HatchNMEGaiWaterfallEventLogger(null, 1, null);
        C98e c98e = C98e.TIER_SELECTION_SCREEN;
        C98d c98d = this.$waterfallStage;
        hatchNMEGaiWaterfallEventLogger.logEvent(c98e, c98d, C98b.IMPRESSION, this.$nmeEntryPoint, AuraSubscriptionPaywallBottomSheetKt.paywallImpressionEventData(this.$currentTierCode, c98d, this.$hasUpgradeOption, this.$hasDowngradeOption), C98c.TIER_SELECTION_CARD_WITH_PRICE_INFO, this.$product.selectedTier);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C98f;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $currentTierCode;
    public final /* synthetic */ PaywallFunnel $funnel;
    public final /* synthetic */ SubscriptionProduct $impressionProduct;
    public final /* synthetic */ PaywallImpressionState $impressions;
    public final /* synthetic */ C98f $nmeEntryPoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$4$1(PaywallImpressionState paywallImpressionState, PaywallFunnel paywallFunnel, C98f c98f, String str, SubscriptionProduct subscriptionProduct) {
        super(0);
        this.$impressions = paywallImpressionState;
        this.$funnel = paywallFunnel;
        this.$nmeEntryPoint = c98f;
        this.$currentTierCode = str;
        this.$impressionProduct = subscriptionProduct;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$impressions.setScreenLogged(true);
        AuraSubscriptionPaywallBottomSheetKt.logPaywallScreenImpression(this.$funnel, this.$nmeEntryPoint, this.$currentTierCode, this.$impressionProduct, this.$impressions.restoredUserSelectedId != null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

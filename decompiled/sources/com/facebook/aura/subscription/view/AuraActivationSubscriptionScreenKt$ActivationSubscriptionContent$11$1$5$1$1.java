package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C3cG;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $complimentaryClaimProductId;
    public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$1$1(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel) {
        super(0);
        this.$entryPoint = subscriptionPaywallEntryPoint;
        this.$complimentaryClaimProductId = str;
        this.$viewModel = auraSubscriptionPaywallViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_PAYWALL, HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_BUTTON, null, AnonymousClass007.A0d(HatchMetadataKey.SELECTED_PRODUCT_ID.getValue(), this.$complimentaryClaimProductId, C3cG.A0r(HatchMetadataKey.ENTRY_POINT.getValue(), this.$entryPoint.getValue())), null);
        this.$viewModel.claimComplimentary();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

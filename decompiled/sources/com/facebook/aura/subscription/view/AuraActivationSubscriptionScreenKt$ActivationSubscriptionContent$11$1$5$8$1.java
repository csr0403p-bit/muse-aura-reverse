package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G2k;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import com.facebook.aura.subscription.model.PaywallCta;
import com.facebook.aura.subscription.model.PurchaseTap;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.SubscriptionNameDialog;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$8$1 extends AbstractC7559F3s implements G2k<PurchaseTap, SubscriptionNameDialog, Disclaimer, PaywallCta, SubscriptionAddOnIntegration, Unit> {
    public final /* synthetic */ SubscriptionAttribution $attribution;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$8$1(AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, SubscriptionAttribution subscriptionAttribution) {
        super(5);
        this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        this.$attribution = subscriptionAttribution;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchaseTap purchaseTap, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, PaywallCta paywallCta, SubscriptionAddOnIntegration subscriptionAddOnIntegration) {
        AnonymousClass005.A0y(purchaseTap, subscriptionNameDialog, paywallCta);
        this.$nameGateViewModel.holdForNameConfirmation(new AuraSubscriptionNameGateViewModel.HeldCheckout.Tier(purchaseTap, paywallCta, this.$attribution, null), subscriptionNameDialog, disclaimer);
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(PurchaseTap purchaseTap, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, PaywallCta paywallCta, SubscriptionAddOnIntegration subscriptionAddOnIntegration) {
        invoke2(purchaseTap, subscriptionNameDialog, disclaimer, paywallCta, subscriptionAddOnIntegration);
        return Unit.INSTANCE;
    }
}

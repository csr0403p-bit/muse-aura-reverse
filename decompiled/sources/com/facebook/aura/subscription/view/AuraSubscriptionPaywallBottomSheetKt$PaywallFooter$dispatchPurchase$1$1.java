package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.C98f;
import X.G0U;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.model.PaywallCta;
import com.facebook.aura.subscription.model.PurchaseTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$dispatchPurchase$1$1 extends AbstractC7559F3s implements G0U<PurchaseTap, Unit> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ SubscriptionAddOnIntegration $checkoutAddOn;
    public final /* synthetic */ PaywallCta $cta;
    public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
    public final /* synthetic */ NameGate $nameGate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ G0U<String, AuraSubscriptionPaywallViewModel.PayNowResult> $onPayNowClicked;
    public final /* synthetic */ Function0<Unit> $onPurchaseConfirmed;
    public final /* synthetic */ Function0<Unit> $onPurchasePending;
    public final /* synthetic */ G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> $onPurchaseResult;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchaseTap purchaseTap) {
        Function0<Unit> function0;
        C7384Etj.A0Y(purchaseTap, 0);
        AuraSubscriptionPaywallViewModel.PayNowResult payNowResultInvoke = this.$onPayNowClicked.invoke(purchaseTap.selectedId);
        if (payNowResultInvoke instanceof AuraSubscriptionPaywallViewModel.PayNowResult.NeedsName) {
            AuraSubscriptionPaywallViewModel.PayNowResult.NeedsName needsName = (AuraSubscriptionPaywallViewModel.PayNowResult.NeedsName) payNowResultInvoke;
            this.$nameGate.onHold.invoke(purchaseTap, needsName.dialog, needsName.disclaimer, this.$cta, this.$checkoutAddOn);
            function0 = this.$nameGate.onNavigate;
        } else if (payNowResultInvoke instanceof AuraSubscriptionPaywallViewModel.PayNowResult.Launch) {
            AuraSubscriptionPaywallBottomSheetKt.launchTierPurchase(this.$activity, ((AuraSubscriptionPaywallViewModel.PayNowResult.Launch) payNowResultInvoke).productId, purchaseTap.payMetadata, purchaseTap.payDirection, this.$nmeEntryPoint, purchaseTap.priceEventData, purchaseTap.isPaidTier, purchaseTap.selectedTier, this.$onPurchaseResult, SubscriptionSheetHelpersKt.withAddOnContinuation(this.$checkoutAddOn, this.$entryPoint, this.$navigator, this.$onPurchaseConfirmed), this.$onPurchasePending);
            return;
        } else {
            if (!C7384Etj.areEqual(payNowResultInvoke, AuraSubscriptionPaywallViewModel.PayNowResult.Settling.INSTANCE)) {
                if (!C7384Etj.areEqual(payNowResultInvoke, AuraSubscriptionPaywallViewModel.PayNowResult.Ignored.INSTANCE)) {
                    throw C3cG.A0q();
                }
                return;
            }
            function0 = this.$onPurchasePending;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$dispatchPurchase$1$1(G0U<? super String, ? extends AuraSubscriptionPaywallViewModel.PayNowResult> g0u, NameGate nameGate, PaywallCta paywallCta, SubscriptionAddOnIntegration subscriptionAddOnIntegration, FragmentActivity fragmentActivity, C98f c98f, G0U<? super AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u2, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, AuraNavigator auraNavigator, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$onPayNowClicked = g0u;
        this.$nameGate = nameGate;
        this.$cta = paywallCta;
        this.$checkoutAddOn = subscriptionAddOnIntegration;
        this.$activity = fragmentActivity;
        this.$nmeEntryPoint = c98f;
        this.$onPurchaseResult = g0u2;
        this.$entryPoint = subscriptionPaywallEntryPoint;
        this.$navigator = auraNavigator;
        this.$onPurchaseConfirmed = function0;
        this.$onPurchasePending = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PurchaseTap purchaseTap) {
        invoke2(purchaseTap);
        return Unit.INSTANCE;
    }
}

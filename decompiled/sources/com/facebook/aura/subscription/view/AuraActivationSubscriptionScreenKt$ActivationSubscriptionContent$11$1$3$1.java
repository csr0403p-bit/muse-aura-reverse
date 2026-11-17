package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C98f;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$3$1 extends AbstractC7559F3s implements G0U<SubscriptionProduct, Unit> {
    public final /* synthetic */ String $currentTierCode;
    public final /* synthetic */ PaywallFunnel $funnel;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ MutableState<String> $userSelectedId$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SubscriptionProduct subscriptionProduct) {
        C7384Etj.A0Y(subscriptionProduct, 0);
        AuraSubscriptionPaywallViewModel.UiState.Loaded loaded = this.$loaded;
        AuraSubscriptionPaywallBottomSheetKt.logPlanTierClick(subscriptionProduct, loaded != null ? loaded.currentProductId : null, this.$funnel.waterfallStage, this.$currentTierCode, this.$nmeEntryPoint);
        this.$userSelectedId$delegate.Af8(subscriptionProduct.productId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$3$1(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, PaywallFunnel paywallFunnel, String str, C98f c98f, MutableState<String> mutableState) {
        super(1);
        this.$loaded = loaded;
        this.$funnel = paywallFunnel;
        this.$currentTierCode = str;
        this.$nmeEntryPoint = c98f;
        this.$userSelectedId$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SubscriptionProduct subscriptionProduct) {
        invoke2(subscriptionProduct);
        return Unit.INSTANCE;
    }
}

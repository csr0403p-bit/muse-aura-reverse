package com.facebook.aura.subscription.view;

import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$usesConfidentialVm$2$1 extends AbstractC7559F3s implements Function0<MutableState<Boolean>> {
    public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$usesConfidentialVm$2$1(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel) {
        super(0);
        this.$viewModel = auraSubscriptionPaywallViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<Boolean> invoke() {
        return AbstractC1798ArH.A08(this.$viewModel.defaultsToConfidentialVm);
    }
}

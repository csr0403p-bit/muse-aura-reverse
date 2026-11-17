package com.facebook.aura.subscription.view;

import X.C7438Evz;
import X.G0U;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;

/* loaded from: classes4.dex */
public final /* synthetic */ class AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$4$1 extends C7438Evz implements G0U<String, AuraSubscriptionPaywallViewModel.PayNowResult> {
    public AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$4$1(Object obj) {
        super(1, obj, AuraSubscriptionPaywallViewModel.class, "onPayNowClicked", "onPayNowClicked(Ljava/lang/String;)Lcom/facebook/aura/subscription/model/AuraSubscriptionPaywallViewModel$PayNowResult;", 0);
    }

    @Override // X.G0U
    public final AuraSubscriptionPaywallViewModel.PayNowResult invoke(String str) {
        return ((AuraSubscriptionPaywallViewModel) this.receiver).onPayNowClicked(str);
    }
}

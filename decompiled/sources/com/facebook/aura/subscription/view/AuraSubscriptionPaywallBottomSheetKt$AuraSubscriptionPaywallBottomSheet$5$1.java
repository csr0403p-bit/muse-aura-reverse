package com.facebook.aura.subscription.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$5$1 extends C7438Evz implements G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> {
    public AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$5$1(Object obj) {
        super(1, obj, AuraSubscriptionPaywallViewModel.class, "onPurchaseResult", "onPurchaseResult(Lcom/facebook/aura/subscription/model/AuraSubscriptionPaywallViewModel$PurchaseOutcome;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraSubscriptionPaywallViewModel.PurchaseOutcome purchaseOutcome) {
        ((AuraSubscriptionPaywallViewModel) AnonymousClass006.A0o(purchaseOutcome, this)).onPurchaseResult(purchaseOutcome);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionPaywallViewModel.PurchaseOutcome purchaseOutcome) {
        invoke2(purchaseOutcome);
        return Unit.INSTANCE;
    }
}

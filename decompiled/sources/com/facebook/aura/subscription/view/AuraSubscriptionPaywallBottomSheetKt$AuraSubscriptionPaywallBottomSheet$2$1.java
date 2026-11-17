package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$2$1(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel) {
        super(0);
        this.$viewModel = auraSubscriptionPaywallViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.refreshPlayStorePrices();
    }
}

package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C98d;
import X.C98f;
import X.G0U;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallPlans$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $currentTierCode;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ G0U<String, Unit> $onSelect;
    public final /* synthetic */ SubscriptionProduct $product;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $state;
    public final /* synthetic */ C98d $waterfallStage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallPlans$1$2$1$1(SubscriptionProduct subscriptionProduct, AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, C98d c98d, String str, C98f c98f, G0U<? super String, Unit> g0u) {
        super(0);
        this.$product = subscriptionProduct;
        this.$state = loaded;
        this.$waterfallStage = c98d;
        this.$currentTierCode = str;
        this.$nmeEntryPoint = c98f;
        this.$onSelect = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraSubscriptionPaywallBottomSheetKt.logPlanTierClick(this.$product, this.$state.currentProductId, this.$waterfallStage, this.$currentTierCode, this.$nmeEntryPoint);
        this.$onSelect.invoke(this.$product.productId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

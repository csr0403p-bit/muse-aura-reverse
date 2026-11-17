package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraSubscriptionUsageViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$9$1(AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel) {
        super(0);
        this.$viewModel = auraSubscriptionUsageViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.openPaymentPortal();
    }
}

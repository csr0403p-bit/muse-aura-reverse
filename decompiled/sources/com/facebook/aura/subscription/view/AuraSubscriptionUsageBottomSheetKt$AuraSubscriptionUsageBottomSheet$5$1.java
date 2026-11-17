package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $onNavigateToPage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$5$1(G0U<? super AuraSubscriptionPage, Unit> g0u) {
        super(0);
        this.$onNavigateToPage = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onNavigateToPage.invoke(AuraSubscriptionPage.Paywall.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

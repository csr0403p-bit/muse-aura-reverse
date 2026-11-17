package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationPlanCard$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<SubscriptionProduct, Unit> $onSelect;
    public final /* synthetic */ SubscriptionProduct $product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationPlanCard$1$1$1$1(G0U<? super SubscriptionProduct, Unit> g0u, SubscriptionProduct subscriptionProduct) {
        super(0);
        this.$onSelect = g0u;
        this.$product = subscriptionProduct;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelect.invoke(this.$product);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

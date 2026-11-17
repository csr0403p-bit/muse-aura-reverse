package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.subscription.model.SubscriptionEntryPointDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageCardKt$UsageContent$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SubscriptionEntryPointDestination $entryPointDestination;
    public final /* synthetic */ G0U<SubscriptionEntryPointDestination, Unit> $onEntryPointClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageCardKt$UsageContent$3$1(G0U<? super SubscriptionEntryPointDestination, Unit> g0u, SubscriptionEntryPointDestination subscriptionEntryPointDestination) {
        super(0);
        this.$onEntryPointClick = g0u;
        this.$entryPointDestination = subscriptionEntryPointDestination;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onEntryPointClick.invoke(this.$entryPointDestination);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

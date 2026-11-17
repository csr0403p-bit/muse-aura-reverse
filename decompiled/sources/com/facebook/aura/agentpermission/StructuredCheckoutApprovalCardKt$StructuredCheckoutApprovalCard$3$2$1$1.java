package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.navigation.key.CheckoutLodgingPolicy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$3$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<CheckoutLodgingPolicy, Unit> $onShowLodgingPolicy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StructuredCheckoutApprovalCardKt$StructuredCheckoutApprovalCard$3$2$1$1(G0U<? super CheckoutLodgingPolicy, Unit> g0u) {
        super(0);
        this.$onShowLodgingPolicy = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onShowLodgingPolicy.invoke(CheckoutLodgingPolicy.CANCELLATION);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

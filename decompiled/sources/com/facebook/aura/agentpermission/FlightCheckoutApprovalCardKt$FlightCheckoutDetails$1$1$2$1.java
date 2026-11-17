package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightCheckoutApprovalCardKt$FlightCheckoutDetails$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0U<Integer, Unit> $onShowLeg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightCheckoutApprovalCardKt$FlightCheckoutDetails$1$1$2$1(G0U<? super Integer, Unit> g0u, int i) {
        super(0);
        this.$onShowLeg = g0u;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onShowLeg.invoke(Integer.valueOf(this.$index));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

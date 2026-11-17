package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CheckoutApprovalSharedKt$CheckoutActions$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecision;
    public final /* synthetic */ AgentPermissionDecisionOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutApprovalSharedKt$CheckoutActions$2$1$1$1(G0U<? super AgentPermissionDecisionOption, Unit> g0u, AgentPermissionDecisionOption agentPermissionDecisionOption) {
        super(0);
        this.$onDecision = g0u;
        this.$option = agentPermissionDecisionOption;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDecision.invoke(this.$option);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

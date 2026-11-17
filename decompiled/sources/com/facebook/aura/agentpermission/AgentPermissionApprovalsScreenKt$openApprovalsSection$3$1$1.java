package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsScreenKt$openApprovalsSection$3$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ G0V<HatchAgentPermissionsRepository.AgentPermissionApproval, Integer, Unit> $onSubmit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentPermissionApprovalsScreenKt$openApprovalsSection$3$1$1(G0V<? super HatchAgentPermissionsRepository.AgentPermissionApproval, ? super Integer, Unit> g0v, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(1);
        this.$onSubmit = g0v;
        this.$approval = agentPermissionApproval;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        AnonymousClass001.A1H(this.$approval, this.$onSubmit, i);
    }
}

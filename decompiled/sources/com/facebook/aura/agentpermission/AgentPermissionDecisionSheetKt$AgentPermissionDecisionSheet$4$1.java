package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$4$1 extends AbstractC7559F3s implements G0U<AgentPermissionDecisionOption, Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;
    public final /* synthetic */ AgentPermissionDecisionViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        C7384Etj.A0Y(agentPermissionDecisionOption, 0);
        AgentPermissionTelemetryKt.logAgentPermissionDecisionSheetConfirmClick(this.$currentApproval, agentPermissionDecisionOption);
        this.$viewModel.submit(agentPermissionDecisionOption, this.$currentApproval.messageRevision);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$4$1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionDecisionViewModel agentPermissionDecisionViewModel) {
        super(1);
        this.$currentApproval = agentPermissionApproval;
        this.$viewModel = agentPermissionDecisionViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        invoke2(agentPermissionDecisionOption);
        return Unit.INSTANCE;
    }
}

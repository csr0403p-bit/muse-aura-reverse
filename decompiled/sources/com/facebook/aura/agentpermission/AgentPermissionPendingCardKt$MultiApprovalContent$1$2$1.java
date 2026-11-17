package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgentPermissionPendingCardKt$MultiApprovalContent$1$2$1 extends AbstractC7559F3s implements G0U<AgentPermissionDecisionOption, Unit> {
    public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApproval> $approvals;
    public final /* synthetic */ AgentPermissionPendingCardViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        C7384Etj.A0Y(agentPermissionDecisionOption, 0);
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(AgentPermissionPendingCardKt.bulkActionComponent(agentPermissionDecisionOption), HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_PILL, null, this.$approvals, agentPermissionDecisionOption, 1);
        this.$viewModel.submitBulkDecision(this.$approvals, agentPermissionDecisionOption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardKt$MultiApprovalContent$1$2$1(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, AgentPermissionPendingCardViewModel agentPermissionPendingCardViewModel) {
        super(1);
        this.$approvals = list;
        this.$viewModel = agentPermissionPendingCardViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        invoke2(agentPermissionDecisionOption);
        return Unit.INSTANCE;
    }
}

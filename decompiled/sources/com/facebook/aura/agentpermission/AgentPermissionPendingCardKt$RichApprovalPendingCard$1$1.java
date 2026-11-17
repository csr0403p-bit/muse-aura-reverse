package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgentPermissionPendingCardKt$RichApprovalPendingCard$1$1 extends AbstractC7559F3s implements G0U<AgentPermissionDecisionOption, Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ AgentPermissionPendingCardViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        C7384Etj.A0Y(agentPermissionDecisionOption, 0);
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(HatchComponent.AGENT_PERMISSION_CONFIRM_BUTTON, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_PILL, this.$approval, null, agentPermissionDecisionOption, 1);
        this.$viewModel.submitSingleDecision(this.$approval, agentPermissionDecisionOption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardKt$RichApprovalPendingCard$1$1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionPendingCardViewModel agentPermissionPendingCardViewModel) {
        super(1);
        this.$approval = agentPermissionApproval;
        this.$viewModel = agentPermissionPendingCardViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        invoke2(agentPermissionDecisionOption);
        return Unit.INSTANCE;
    }
}

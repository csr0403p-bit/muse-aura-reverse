package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$3 extends AbstractC7559F3s implements G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, String> {
    public static final AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$3 INSTANCE = new AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$3();

    public AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$3() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ String invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval2 = agentPermissionApproval;
        C7384Etj.A0Y(agentPermissionApproval2, 0);
        return agentPermissionApproval2.approvalId;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return agentPermissionApproval.approvalId;
    }
}

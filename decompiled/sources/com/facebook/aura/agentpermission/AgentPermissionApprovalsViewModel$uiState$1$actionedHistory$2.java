package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.ApprovalRecord;
import com.facebook.aura.gateway.ApprovalRecordStatus;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$2 extends AbstractC7559F3s implements G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, Boolean> {
    public static final AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$2 INSTANCE = new AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$2();

    public AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$2() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        ApprovalRecord approvalRecord = agentPermissionApproval.approvalRecord;
        return Boolean.valueOf(AnonymousClass006.A1Z(approvalRecord != null ? approvalRecord.status : null, ApprovalRecordStatus.PENDING));
    }
}

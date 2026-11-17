package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Set;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$1 extends AbstractC7559F3s implements G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, Boolean> {
    public final /* synthetic */ Set<String> $openIds;

    @Override // X.G0U
    public final Boolean invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return Boolean.valueOf(this.$openIds.contains(agentPermissionApproval.approvalId));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$1(Set<String> set) {
        super(1);
        this.$openIds = set;
    }
}

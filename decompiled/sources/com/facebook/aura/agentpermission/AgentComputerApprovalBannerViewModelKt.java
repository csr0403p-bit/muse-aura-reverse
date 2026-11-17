package com.facebook.aura.agentpermission;

import X.AnonymousClass002;
import com.facebook.aura.gateway.ApprovalPresentation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt;

/* loaded from: classes2.dex */
public abstract class AgentComputerApprovalBannerViewModelKt {
    public static final boolean blocksItsOwnConversation(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        return AnonymousClass002.A1Z(HatchAgentPermissionsRepositoryKt.classifyApprovalPresentation(agentPermissionApproval, agentPermissionApproval.threadId), ApprovalPresentation.BLOCKING);
    }
}

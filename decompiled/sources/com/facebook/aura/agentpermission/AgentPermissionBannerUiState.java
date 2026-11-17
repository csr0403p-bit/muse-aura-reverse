package com.facebook.aura.agentpermission;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes.dex */
public final class AgentPermissionBannerUiState extends C06G {
    public static final int $stable = 8;
    public final List<HatchAgentPermissionsRepository.AgentPermissionApproval> approvals;

    public final AgentPermissionBannerUiState copy(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list) {
        C7384Etj.A0Y(list, 0);
        return new AgentPermissionBannerUiState(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AgentPermissionBannerUiState) && C7384Etj.areEqual(this.approvals, ((AgentPermissionBannerUiState) obj).approvals));
    }

    public /* synthetic */ AgentPermissionBannerUiState(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list);
    }

    public static /* synthetic */ AgentPermissionBannerUiState copy$default(AgentPermissionBannerUiState agentPermissionBannerUiState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = agentPermissionBannerUiState.approvals;
        }
        C7384Etj.A0Y(list, 0);
        return new AgentPermissionBannerUiState(list);
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionApproval> component1() {
        return this.approvals;
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionApproval> getApprovals() {
        return this.approvals;
    }

    public int hashCode() {
        return this.approvals.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public AgentPermissionBannerUiState(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list) {
        C7384Etj.A0Y(list, 0);
        this.approvals = list;
    }

    public AgentPermissionBannerUiState() {
        this(C0881AGi.A00);
    }
}

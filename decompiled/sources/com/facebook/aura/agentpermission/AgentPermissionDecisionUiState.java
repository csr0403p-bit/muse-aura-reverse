package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class AgentPermissionDecisionUiState extends C06G {
    public static final int $stable = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
    public final HatchAgentPermissionsRepository.AgentPermissionApproval approval;
    public final boolean awaitingApproval;
    public final boolean confirming;
    public final boolean submitting;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentPermissionDecisionUiState) {
                AgentPermissionDecisionUiState agentPermissionDecisionUiState = (AgentPermissionDecisionUiState) obj;
                if (!C7384Etj.areEqual(this.approval, agentPermissionDecisionUiState.approval) || this.submitting != agentPermissionDecisionUiState.submitting || this.awaitingApproval != agentPermissionDecisionUiState.awaitingApproval || this.confirming != agentPermissionDecisionUiState.confirming) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgentPermissionDecisionUiState copy$default(AgentPermissionDecisionUiState agentPermissionDecisionUiState, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            agentPermissionApproval = agentPermissionDecisionUiState.approval;
        }
        if ((i & 2) != 0) {
            z = agentPermissionDecisionUiState.submitting;
        }
        if ((i & 4) != 0) {
            z2 = agentPermissionDecisionUiState.awaitingApproval;
        }
        if ((i & 8) != 0) {
            z3 = agentPermissionDecisionUiState.confirming;
        }
        return new AgentPermissionDecisionUiState(agentPermissionApproval, z, z2, z3);
    }

    public final HatchAgentPermissionsRepository.AgentPermissionApproval component1() {
        return this.approval;
    }

    public final boolean component2() {
        return this.submitting;
    }

    public final boolean component3() {
        return this.awaitingApproval;
    }

    public final boolean component4() {
        return this.confirming;
    }

    public final AgentPermissionDecisionUiState copy(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, boolean z2, boolean z3) {
        return new AgentPermissionDecisionUiState(agentPermissionApproval, z, z2, z3);
    }

    public final HatchAgentPermissionsRepository.AgentPermissionApproval getApproval() {
        return this.approval;
    }

    public final boolean getAwaitingApproval() {
        return this.awaitingApproval;
    }

    public final boolean getConfirming() {
        return this.confirming;
    }

    public final boolean getSubmitting() {
        return this.submitting;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass006.A0D(this.approval) * 31, this.submitting), this.awaitingApproval), this.confirming);
    }

    public AgentPermissionDecisionUiState(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, boolean z2, boolean z3) {
        this.approval = agentPermissionApproval;
        this.submitting = z;
        this.awaitingApproval = z2;
        this.confirming = z3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgentPermissionDecisionUiState(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(agentPermissionApproval, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), AnonymousClass005.A1P(i, z3));
    }
}

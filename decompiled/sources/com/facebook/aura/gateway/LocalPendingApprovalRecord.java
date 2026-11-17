package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.InterfaceC10560Hsz;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class LocalPendingApprovalRecord extends C06G {
    public final HatchAgentPermissionsRepository.AgentPermissionApproval approval;
    public final InterfaceC10560Hsz<AgentPermissionDecision> decision;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalPendingApprovalRecord) {
                LocalPendingApprovalRecord localPendingApprovalRecord = (LocalPendingApprovalRecord) obj;
                if (!C7384Etj.areEqual(this.approval, localPendingApprovalRecord.approval) || !C7384Etj.areEqual(this.decision, localPendingApprovalRecord.decision)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalPendingApprovalRecord copy$default(LocalPendingApprovalRecord localPendingApprovalRecord, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, InterfaceC10560Hsz interfaceC10560Hsz, int i, Object obj) {
        if ((i & 1) != 0) {
            agentPermissionApproval = localPendingApprovalRecord.approval;
        }
        if ((i & 2) != 0) {
            interfaceC10560Hsz = localPendingApprovalRecord.decision;
        }
        AnonymousClass003.A0u(agentPermissionApproval, interfaceC10560Hsz);
        return new LocalPendingApprovalRecord(agentPermissionApproval, interfaceC10560Hsz);
    }

    public final HatchAgentPermissionsRepository.AgentPermissionApproval component1() {
        return this.approval;
    }

    public final InterfaceC10560Hsz<AgentPermissionDecision> component2() {
        return this.decision;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionApproval getApproval() {
        return this.approval;
    }

    public final InterfaceC10560Hsz<AgentPermissionDecision> getDecision() {
        return this.decision;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.decision, AnonymousClass005.A0E(this.approval));
    }

    public LocalPendingApprovalRecord(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, InterfaceC10560Hsz<AgentPermissionDecision> interfaceC10560Hsz) {
        AnonymousClass003.A0u(agentPermissionApproval, interfaceC10560Hsz);
        this.approval = agentPermissionApproval;
        this.decision = interfaceC10560Hsz;
    }

    public final LocalPendingApprovalRecord copy(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, InterfaceC10560Hsz<AgentPermissionDecision> interfaceC10560Hsz) {
        AnonymousClass003.A0u(agentPermissionApproval, interfaceC10560Hsz);
        return new LocalPendingApprovalRecord(agentPermissionApproval, interfaceC10560Hsz);
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.agentpermission;

import X.A3q;
import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Set;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsUiState extends C06G {
    public static final int $stable = 8;
    public final boolean canLoadMoreHistory;
    public final Set<String> confirmingApprovalIds;
    public final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> history;
    public final String historyLoadMoreKey;
    public final ApprovalHistoryLoadingState historyLoadingState;
    public final boolean isLoadingMoreHistory;
    public final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> openApprovals;
    public final BO6<String, ApprovalRowDecisions> rowDecisions;
    public final Set<String> submittingApprovalIds;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentPermissionApprovalsUiState) {
                AgentPermissionApprovalsUiState agentPermissionApprovalsUiState = (AgentPermissionApprovalsUiState) obj;
                if (!C7384Etj.areEqual(this.openApprovals, agentPermissionApprovalsUiState.openApprovals) || !C7384Etj.areEqual(this.history, agentPermissionApprovalsUiState.history) || this.historyLoadingState != agentPermissionApprovalsUiState.historyLoadingState || this.canLoadMoreHistory != agentPermissionApprovalsUiState.canLoadMoreHistory || this.isLoadingMoreHistory != agentPermissionApprovalsUiState.isLoadingMoreHistory || !C7384Etj.areEqual(this.historyLoadMoreKey, agentPermissionApprovalsUiState.historyLoadMoreKey) || !C7384Etj.areEqual(this.submittingApprovalIds, agentPermissionApprovalsUiState.submittingApprovalIds) || !C7384Etj.areEqual(this.confirmingApprovalIds, agentPermissionApprovalsUiState.confirmingApprovalIds) || !C7384Etj.areEqual(this.rowDecisions, agentPermissionApprovalsUiState.rowDecisions)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AgentPermissionApprovalsUiState(AHD ahd, AHD ahd2, ApprovalHistoryLoadingState approvalHistoryLoadingState, boolean z, boolean z2, String str, Set set, Set set2, BO6 bo6, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2, (i & 4) != 0 ? ApprovalHistoryLoadingState.IDLE : approvalHistoryLoadingState, (i & 8) != 0 ? true : z, AnonymousClass005.A1Q(i, z2), (i & 32) != 0 ? null : str, (i & 64) != 0 ? A3q.A00 : set, (i & 128) != 0 ? A3q.A00 : set2, (i & 256) != 0 ? C0953AJg.A00() : bo6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentPermissionApprovalsUiState copy$default(AgentPermissionApprovalsUiState agentPermissionApprovalsUiState, AHD ahd, AHD ahd2, ApprovalHistoryLoadingState approvalHistoryLoadingState, boolean z, boolean z2, String str, Set set, Set set2, BO6 bo6, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = agentPermissionApprovalsUiState.openApprovals;
        }
        if ((i & 2) != 0) {
            ahd2 = agentPermissionApprovalsUiState.history;
        }
        if ((i & 4) != 0) {
            approvalHistoryLoadingState = agentPermissionApprovalsUiState.historyLoadingState;
        }
        if ((i & 8) != 0) {
            z = agentPermissionApprovalsUiState.canLoadMoreHistory;
        }
        if ((i & 16) != 0) {
            z2 = agentPermissionApprovalsUiState.isLoadingMoreHistory;
        }
        if ((i & 32) != 0) {
            str = agentPermissionApprovalsUiState.historyLoadMoreKey;
        }
        if ((i & 64) != 0) {
            set = agentPermissionApprovalsUiState.submittingApprovalIds;
        }
        if ((i & 128) != 0) {
            set2 = agentPermissionApprovalsUiState.confirmingApprovalIds;
        }
        if ((i & 256) != 0) {
            bo6 = agentPermissionApprovalsUiState.rowDecisions;
        }
        return agentPermissionApprovalsUiState.copy(ahd, ahd2, approvalHistoryLoadingState, z, z2, str, set, set2, bo6);
    }

    public final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> component1() {
        return this.openApprovals;
    }

    public final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> component2() {
        return this.history;
    }

    public final ApprovalHistoryLoadingState component3() {
        return this.historyLoadingState;
    }

    public final boolean component4() {
        return this.canLoadMoreHistory;
    }

    public final boolean component5() {
        return this.isLoadingMoreHistory;
    }

    public final String component6() {
        return this.historyLoadMoreKey;
    }

    public final Set<String> component7() {
        return this.submittingApprovalIds;
    }

    public final Set<String> component8() {
        return this.confirmingApprovalIds;
    }

    public final BO6<String, ApprovalRowDecisions> component9() {
        return this.rowDecisions;
    }

    public final boolean getCanLoadMoreHistory() {
        return this.canLoadMoreHistory;
    }

    public final Set<String> getConfirmingApprovalIds() {
        return this.confirmingApprovalIds;
    }

    public final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> getHistory() {
        return this.history;
    }

    public final String getHistoryLoadMoreKey() {
        return this.historyLoadMoreKey;
    }

    public final ApprovalHistoryLoadingState getHistoryLoadingState() {
        return this.historyLoadingState;
    }

    public final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> getOpenApprovals() {
        return this.openApprovals;
    }

    public final BO6<String, ApprovalRowDecisions> getRowDecisions() {
        return this.rowDecisions;
    }

    public final Set<String> getSubmittingApprovalIds() {
        return this.submittingApprovalIds;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rowDecisions, AnonymousClass005.A0F(this.confirmingApprovalIds, AnonymousClass005.A0F(this.submittingApprovalIds, (C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.historyLoadingState, AnonymousClass005.A0F(this.history, AnonymousClass005.A0E(this.openApprovals))), this.canLoadMoreHistory), this.isLoadingMoreHistory) + AnonymousClass006.A0G(this.historyLoadMoreKey)) * 31)));
    }

    public final boolean isLoadingMoreHistory() {
        return this.isLoadingMoreHistory;
    }

    public final AgentPermissionApprovalsUiState copy(AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> ahd, AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> ahd2, ApprovalHistoryLoadingState approvalHistoryLoadingState, boolean z, boolean z2, String str, Set<String> set, Set<String> set2, BO6<String, ApprovalRowDecisions> bo6) {
        AnonymousClass005.A0x(ahd, ahd2, approvalHistoryLoadingState);
        AnonymousClass005.A13(set, set2, bo6, 6);
        return new AgentPermissionApprovalsUiState(ahd, ahd2, approvalHistoryLoadingState, z, z2, str, set, set2, bo6);
    }

    public String toString() {
        return super.toString();
    }

    public AgentPermissionApprovalsUiState(AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> ahd, AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> ahd2, ApprovalHistoryLoadingState approvalHistoryLoadingState, boolean z, boolean z2, String str, Set<String> set, Set<String> set2, BO6<String, ApprovalRowDecisions> bo6) {
        AnonymousClass005.A0x(ahd, ahd2, approvalHistoryLoadingState);
        AnonymousClass005.A13(set, set2, bo6, 6);
        this.openApprovals = ahd;
        this.history = ahd2;
        this.historyLoadingState = approvalHistoryLoadingState;
        this.canLoadMoreHistory = z;
        this.isLoadingMoreHistory = z2;
        this.historyLoadMoreKey = str;
        this.submittingApprovalIds = set;
        this.confirmingApprovalIds = set2;
        this.rowDecisions = bo6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentPermissionApprovalsUiState() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }
}

package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes2.dex */
public final class ApprovalHistoryState extends C06G {
    public final boolean canLoadMore;
    public final boolean isLoadingMore;
    public final List<HatchAgentPermissionsRepository.AgentPermissionApproval> items;
    public final ApprovalHistoryLoadingState loadingState;
    public final String nextCursor;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalHistoryState) {
                ApprovalHistoryState approvalHistoryState = (ApprovalHistoryState) obj;
                if (!C7384Etj.areEqual(this.items, approvalHistoryState.items) || this.loadingState != approvalHistoryState.loadingState || !C7384Etj.areEqual(this.nextCursor, approvalHistoryState.nextCursor) || this.canLoadMore != approvalHistoryState.canLoadMore || this.isLoadingMore != approvalHistoryState.isLoadingMore) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApprovalHistoryState copy$default(ApprovalHistoryState approvalHistoryState, List list, ApprovalHistoryLoadingState approvalHistoryLoadingState, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = approvalHistoryState.items;
        }
        if ((i & 2) != 0) {
            approvalHistoryLoadingState = approvalHistoryState.loadingState;
        }
        if ((i & 4) != 0) {
            str = approvalHistoryState.nextCursor;
        }
        if ((i & 8) != 0) {
            z = approvalHistoryState.canLoadMore;
        }
        if ((i & 16) != 0) {
            z2 = approvalHistoryState.isLoadingMore;
        }
        return approvalHistoryState.copy(list, approvalHistoryLoadingState, str, z, z2);
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionApproval> component1() {
        return this.items;
    }

    public final ApprovalHistoryLoadingState component2() {
        return this.loadingState;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final boolean component4() {
        return this.canLoadMore;
    }

    public final boolean component5() {
        return this.isLoadingMore;
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final List<HatchAgentPermissionsRepository.AgentPermissionApproval> getItems() {
        return this.items;
    }

    public final ApprovalHistoryLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((AnonymousClass005.A0F(this.loadingState, AnonymousClass005.A0E(this.items)) + AnonymousClass006.A0G(this.nextCursor)) * 31, this.canLoadMore), this.isLoadingMore);
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public ApprovalHistoryState(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, ApprovalHistoryLoadingState approvalHistoryLoadingState, String str, boolean z, boolean z2) {
        AnonymousClass003.A0u(list, approvalHistoryLoadingState);
        this.items = list;
        this.loadingState = approvalHistoryLoadingState;
        this.nextCursor = str;
        this.canLoadMore = z;
        this.isLoadingMore = z2;
    }

    public final ApprovalHistoryState copy(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, ApprovalHistoryLoadingState approvalHistoryLoadingState, String str, boolean z, boolean z2) {
        AnonymousClass003.A0u(list, approvalHistoryLoadingState);
        return new ApprovalHistoryState(list, approvalHistoryLoadingState, str, z, z2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalHistoryState(List list, ApprovalHistoryLoadingState approvalHistoryLoadingState, String str, boolean z, boolean z2, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? ApprovalHistoryLoadingState.IDLE : approvalHistoryLoadingState, AnonymousClass006.A0t(i, str), (i & 8) != 0 ? true : z, C3cI.A1S(i, z2));
    }

    public ApprovalHistoryState() {
        this(C0881AGi.A00, ApprovalHistoryLoadingState.IDLE, null, true, false);
    }
}

package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AgentPermissionApprovalsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$1$1(AgentPermissionApprovalsViewModel agentPermissionApprovalsViewModel) {
        super(1);
        this.$viewModel = agentPermissionApprovalsViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.loadHistory(false);
        return new C78g() { // from class: com.facebook.aura.agentpermission.AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsScreenKt$approvalsStatusItem$2$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ AgentPermissionApprovalsUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionApprovalsScreenKt$approvalsStatusItem$2$1$1(AgentPermissionApprovalsUiState agentPermissionApprovalsUiState, Function0<Unit> function0) {
        super(1);
        this.$uiState = agentPermissionApprovalsUiState;
        this.$onLoadMore = function0;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$uiState.isLoadingMoreHistory) {
            this.$onLoadMore.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$approvalsStatusItem$2$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

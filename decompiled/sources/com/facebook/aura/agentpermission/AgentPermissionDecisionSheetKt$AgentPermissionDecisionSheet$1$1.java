package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $approvalId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$1$1(String str) {
        super(1);
        this.$approvalId = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AgentPermissionSurfaceVisibility.INSTANCE.opened(this.$approvalId);
        final String str = this.$approvalId;
        return new C78g() { // from class: com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                AgentPermissionSurfaceVisibility.INSTANCE.closed(str);
            }
        };
    }
}

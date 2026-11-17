package com.facebook.aura.agentpermission;

import X.C7438Evz;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentPermissionPendingCardKt$rememberPendingApprovalBatchKeySnapshot$1$1 extends C7438Evz implements Function0<String> {
    public AgentPermissionPendingCardKt$rememberPendingApprovalBatchKeySnapshot$1$1(Object obj) {
        super(0, obj, AgentPermissionPendingCardViewModel.class, "currentBatchKey", "currentBatchKey()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((AgentPermissionPendingCardViewModel) this.receiver).currentBatchKey();
    }
}

package com.facebook.aura.agentpermission;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionApprovalHistoryRepository", f = "AgentPermissionApprovalHistoryRepository.kt", l = {23}, m = "getApprovalHistory-0E7RQCE", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionApprovalHistoryRepository$getApprovalHistory$1 extends HzP {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AgentPermissionApprovalHistoryRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionApprovalHistoryRepository$getApprovalHistory$1(AgentPermissionApprovalHistoryRepository agentPermissionApprovalHistoryRepository, HtJ<? super AgentPermissionApprovalHistoryRepository$getApprovalHistory$1> htJ) {
        super(htJ);
        this.this$0 = agentPermissionApprovalHistoryRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m160getApprovalHistory0E7RQCE(null, 0, this));
    }
}

package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2k;
import X.HtJ;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$uiState$1", f = "AgentPermissionDecisionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionDecisionViewModel$uiState$1 extends AbstractC07127nr implements G2k<HatchAgentPermissionsRepository.AgentPermissionApproval, Boolean, Boolean, Boolean, HtJ<? super AgentPermissionDecisionUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public /* synthetic */ boolean Z$2;
    public int label;

    public AgentPermissionDecisionViewModel$uiState$1(HtJ<? super AgentPermissionDecisionViewModel$uiState$1> htJ) {
        super(5, htJ);
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Boolean bool, Boolean bool2, Boolean bool3, HtJ<? super AgentPermissionDecisionUiState> htJ) {
        return invoke(agentPermissionApproval, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r7 = r8.L$0
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r7 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r7
            boolean r6 = r8.Z$0
            boolean r5 = r8.Z$1
            boolean r4 = r8.Z$2
            int r0 = r8.label
            if (r0 != 0) goto L29
            X.Hwg.A00(r9)
            r3 = 0
            if (r6 != 0) goto L17
            r2 = 0
            if (r4 == 0) goto L18
        L17:
            r2 = 1
        L18:
            if (r7 != 0) goto L1d
            r1 = 1
            if (r5 != 0) goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r4 == 0) goto L23
            if (r6 != 0) goto L23
            r3 = 1
        L23:
            com.facebook.aura.agentpermission.AgentPermissionDecisionUiState r0 = new com.facebook.aura.agentpermission.AgentPermissionDecisionUiState
            r0.<init>(r7, r2, r1, r3)
            return r0
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$uiState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, boolean z2, boolean z3, HtJ<? super AgentPermissionDecisionUiState> htJ) {
        AgentPermissionDecisionViewModel$uiState$1 agentPermissionDecisionViewModel$uiState$1 = new AgentPermissionDecisionViewModel$uiState$1(htJ);
        agentPermissionDecisionViewModel$uiState$1.L$0 = agentPermissionApproval;
        agentPermissionDecisionViewModel$uiState$1.Z$0 = z;
        agentPermissionDecisionViewModel$uiState$1.Z$1 = z2;
        agentPermissionDecisionViewModel$uiState$1.Z$2 = z3;
        return agentPermissionDecisionViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }
}

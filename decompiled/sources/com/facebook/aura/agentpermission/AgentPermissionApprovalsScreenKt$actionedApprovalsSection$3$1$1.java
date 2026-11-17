package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgentPermissionApprovalsScreenKt$actionedApprovalsSection$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> $onOpen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentPermissionApprovalsScreenKt$actionedApprovalsSection$3$1$1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, G0U<? super HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> g0u) {
        super(0);
        this.$approval = agentPermissionApproval;
        this.$onOpen = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(HatchComponent.APPROVAL_HISTORY_ROW, HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_SHEET, this.$approval, null, null, 1);
        this.$onOpen.invoke(this.$approval);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

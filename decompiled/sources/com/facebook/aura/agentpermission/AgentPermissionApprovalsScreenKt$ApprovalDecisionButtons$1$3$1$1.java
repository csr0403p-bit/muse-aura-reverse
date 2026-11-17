package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ G0U<Integer, Unit> $onDecision;
    public final /* synthetic */ AgentPermissionDecisionOption $option;
    public final /* synthetic */ int $optionIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$1$1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionDecisionOption agentPermissionDecisionOption, G0U<? super Integer, Unit> g0u, int i) {
        super(0);
        this.$approval = agentPermissionApproval;
        this.$option = agentPermissionDecisionOption;
        this.$onDecision = g0u;
        this.$optionIndex = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(HatchComponent.AGENT_PERMISSION_CONFIRM_BUTTON, HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_SHEET, this.$approval, null, this.$option, 1);
        AnonymousClass005.A0l(this.$optionIndex, this.$onDecision);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

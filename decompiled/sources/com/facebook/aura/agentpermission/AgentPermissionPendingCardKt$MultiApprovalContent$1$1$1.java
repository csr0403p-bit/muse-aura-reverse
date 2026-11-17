package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgentPermissionDecisionSheetKey;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgentPermissionPendingCardKt$MultiApprovalContent$1$1$1 extends AbstractC7559F3s implements G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> {
    public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApproval> $approvals;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(HatchComponent.OPEN_AGENT_PERMISSION_DECISION_SELECTOR_SHEET, HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_PILL, agentPermissionApproval, null, null, this.$approvals.size());
        this.$navigator.navigate((AuraNavKey) new AgentPermissionDecisionSheetKey(agentPermissionApproval.approvalId), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardKt$MultiApprovalContent$1$1$1(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, AuraNavigator auraNavigator) {
        super(1);
        this.$approvals = list;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        invoke2(agentPermissionApproval);
        return Unit.INSTANCE;
    }
}

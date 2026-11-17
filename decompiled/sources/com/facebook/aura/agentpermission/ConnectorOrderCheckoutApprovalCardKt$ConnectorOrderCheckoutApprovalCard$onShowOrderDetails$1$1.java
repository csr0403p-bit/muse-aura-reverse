package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AgentPermissionTaskDetailsSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$onShowOrderDetails$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ RichApprovalSurface $surface;
    public final /* synthetic */ G0V<HatchComponent, AuraNavKey, Unit> $tap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$onShowOrderDetails$1$1(G0V<? super HatchComponent, ? super AuraNavKey, Unit> g0v, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, RichApprovalSurface richApprovalSurface) {
        super(0);
        this.$tap = g0v;
        this.$approval = agentPermissionApproval;
        this.$surface = richApprovalSurface;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$tap.invoke(HatchComponent.AGENT_PERMISSION_SEE_DETAILS_BUTTON, new AgentPermissionTaskDetailsSheetKey(this.$approval.approvalId, this.$surface.screen));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

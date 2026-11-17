package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.FlightCheckoutLegSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RichApprovalCardKt$FlightRichCard$3$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ G0V<HatchComponent, AuraNavKey, Unit> $tap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RichApprovalCardKt$FlightRichCard$3$1(G0V<? super HatchComponent, ? super AuraNavKey, Unit> g0v, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(1);
        this.$tap = g0v;
        this.$approval = agentPermissionApproval;
    }

    public final void invoke(int i) {
        this.$tap.invoke(HatchComponent.AGENT_PERMISSION_SEE_DETAILS_BUTTON, new FlightCheckoutLegSheetKey(this.$approval.approvalId, i));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.FlightCheckoutSummarySheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class RichApprovalCardKt$FlightRichCard$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ G0V<HatchComponent, AuraNavKey, Unit> $tap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RichApprovalCardKt$FlightRichCard$2$1(G0V<? super HatchComponent, ? super AuraNavKey, Unit> g0v, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(0);
        this.$tap = g0v;
        this.$approval = agentPermissionApproval;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$tap.invoke(HatchComponent.CHECKOUT_TOTAL_ROW, new FlightCheckoutSummarySheetKey(this.$approval.approvalId));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

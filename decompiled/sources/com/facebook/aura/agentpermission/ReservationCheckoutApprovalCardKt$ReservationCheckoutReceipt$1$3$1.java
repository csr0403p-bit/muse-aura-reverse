package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C3cI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ HatchAgentPermissionsRepository.ReservationCheckoutApproval $checkout;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$1$3$1(HatchScreen hatchScreen, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AuraNavigator auraNavigator, HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval) {
        super(0);
        this.$screen = hatchScreen;
        this.$approval = agentPermissionApproval;
        this.$navigator = auraNavigator;
        this.$checkout = reservationCheckoutApproval;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C3cI.A1C(HatchComponent.AGENT_PERMISSION_PAYMENT_ROW, this.$screen, this.$approval);
        this.$navigator.navigate((AuraNavKey) AgentPermissionPendingCardKt.checkoutPaymentRowKey(this.$approval.approvalId, this.$checkout), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ShopifyCheckoutSummarySheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$1$2$1(AuraNavigator auraNavigator, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(0);
        this.$navigator = auraNavigator;
        this.$approval = agentPermissionApproval;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new ShopifyCheckoutSummarySheetKey(this.$approval.approvalId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

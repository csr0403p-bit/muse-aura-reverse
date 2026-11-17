package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cH;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<HatchAgentPermissionsRepository.AgentPermissionApproval> $approval$delegate;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$3$1(AuraNavigator auraNavigator, C1BO<HatchAgentPermissionsRepository.AgentPermissionApproval> c1bo) {
        super(0);
        this.$navigator = auraNavigator;
        this.$approval$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AgentPermissionTelemetryKt.logAgentPermissionSheetCloseClick(C3cH.A0N(this.$approval$delegate), HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

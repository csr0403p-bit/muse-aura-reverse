package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RichApprovalCardKt$BrowserCheckoutRichCard$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichApprovalCardKt$BrowserCheckoutRichCard$3$1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(0);
        this.$approval = agentPermissionApproval;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AgentPermissionTelemetryKt.logBrowserCheckoutTermsLinkClick(this.$approval);
    }
}

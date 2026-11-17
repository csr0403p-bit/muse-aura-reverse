package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C3cI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class RichApprovalCardKt$BrowserCheckoutRichCard$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ RichApprovalSurface $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichApprovalCardKt$BrowserCheckoutRichCard$4$1(RichApprovalSurface richApprovalSurface, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(0);
        this.$surface = richApprovalSurface;
        this.$approval = agentPermissionApproval;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C3cI.A1C(HatchComponent.OPEN_BROWSER_BUTTON, this.$surface.screen, this.$approval);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

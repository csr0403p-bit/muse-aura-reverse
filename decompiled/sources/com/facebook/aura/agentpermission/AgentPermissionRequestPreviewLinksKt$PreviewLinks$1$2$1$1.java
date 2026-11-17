package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C07C;
import X.C0jP;
import X.C10571Hud;
import X.CFK;
import X.HsJ;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgentPermissionRequestPreviewLinksKt$PreviewLinks$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewLink $item;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ C07C $this_Column;
    public final /* synthetic */ C0jP $uriHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionRequestPreviewLinksKt$PreviewLinks$1$2$1$1(HatchScreen hatchScreen, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, C07C c07c, C0jP c0jP, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewLink agentPermissionRequestPreviewLink) {
        super(0);
        this.$screen = hatchScreen;
        this.$approval = agentPermissionApproval;
        this.$this_Column = c07c;
        this.$uriHandler = c0jP;
        this.$item = agentPermissionRequestPreviewLink;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object c10571Hud;
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(HatchComponent.EXTERNAL_LINK, this.$screen, this.$approval, null, null, 1);
        try {
            this.$uriHandler.openUri(this.$item.url);
            c10571Hud = Unit.INSTANCE;
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        Throwable thA00 = HsJ.A00(c10571Hud);
        if (thA00 != null) {
            CFK.A0A(AgentPermissionRequestPreviewLinksKt.TAG, "Failed to open approval preview link", thA00);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

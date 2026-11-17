package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class RichApprovalCardKt$rememberRichApprovalTap$1$1 extends AbstractC7559F3s implements G0V<HatchComponent, AuraNavKey, Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichApprovalCardKt$rememberRichApprovalTap$1$1(AuraNavigator auraNavigator, HatchScreen hatchScreen, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        super(2);
        this.$navigator = auraNavigator;
        this.$screen = hatchScreen;
        this.$approval = agentPermissionApproval;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(HatchComponent hatchComponent, AuraNavKey auraNavKey) {
        invoke2(hatchComponent, auraNavKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchComponent hatchComponent, AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 1);
        if (hatchComponent != null) {
            AgentPermissionTelemetryKt.logAgentPermissionCardClick(hatchComponent, this.$screen, this.$approval, null, null, 1);
        }
        this.$navigator.navigate(auraNavKey, false);
    }
}

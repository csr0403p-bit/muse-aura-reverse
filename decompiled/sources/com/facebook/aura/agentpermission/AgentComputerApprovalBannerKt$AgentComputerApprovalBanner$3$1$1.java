package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgentPermissionDecisionSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgentComputerApprovalBannerKt$AgentComputerApprovalBanner$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentComputerApprovalBannerKt$AgentComputerApprovalBanner$3$1$1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AuraNavigator auraNavigator) {
        super(0);
        this.$currentApproval = agentPermissionApproval;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.AGENT_PERMISSION, HatchScreen.AGENT_PERMISSION_BANNER, HatchComponent.AGENT_PERMISSION_BANNER_REVIEW_BUTTON, this.$currentApproval.approvalId, null, null);
        this.$navigator.navigate((AuraNavKey) new AgentPermissionDecisionSheetKey(this.$currentApproval.approvalId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

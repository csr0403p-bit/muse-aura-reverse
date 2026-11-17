package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgentPermissionDecisionSheetKey;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import com.facebook.aura.navigation.key.HatchStatusTab;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgentPermissionBannerKt$AgentPermissionBanner$onReview$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApproval> $approvals;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionBannerKt$AgentPermissionBanner$onReview$1$1(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$approvals = list;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.AGENT_PERMISSION;
        HatchScreen hatchScreen = HatchScreen.AGENT_PERMISSION_BANNER;
        HatchComponent hatchComponent = HatchComponent.AGENT_PERMISSION_BANNER_REVIEW_BUTTON;
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) AbstractC0878AGe.A0K(this.$approvals);
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, agentPermissionApproval != null ? agentPermissionApproval.approvalId : null, AnonymousClass006.A10("approval_count", String.valueOf(this.$approvals.size())), null);
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval2 = (HatchAgentPermissionsRepository.AgentPermissionApproval) AbstractC0878AGe.A0K(this.$approvals);
        this.$navigator.navigate(agentPermissionApproval2 != null ? new AgentPermissionDecisionSheetKey(agentPermissionApproval2.approvalId) : new HatchStatusScreenKey(HatchStatusTab.APPROVALS, this.$sessionId, null, null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

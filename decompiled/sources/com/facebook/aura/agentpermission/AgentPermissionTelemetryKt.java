package com.facebook.aura.agentpermission;

import X.AIW;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BRg;
import X.C0924AIa;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.AgentPermissionPayloadType;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AgentPermissionTelemetryKt {
    public static final BRg agentPermissionApprovalImpression(BRg bRg, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen) {
        return HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.AGENT_PERMISSION, hatchScreen, HatchComponent.AGENT_PERMISSION_REQUEST_CARD, agentPermissionApproval.approvalId, agentPermissionImpressionMetadata(AnonymousClass005.A1Z(bRg, agentPermissionApproval, hatchScreen) ? 1 : 0, agentPermissionApproval), null, 500L, 0.0f, null, null, null);
    }

    public static final void logAgentPermissionApprovalImpression(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, int i, HatchScreen hatchScreen) {
        AnonymousClass003.A0v(agentPermissionApproval, hatchScreen);
        HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.AGENT_PERMISSION, hatchScreen, HatchComponent.AGENT_PERMISSION_REQUEST_CARD, agentPermissionApproval.approvalId, agentPermissionImpressionMetadata(i, agentPermissionApproval), null);
    }

    public static final void logAgentPermissionSheetCloseClick(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen) {
        C7384Etj.A0Y(hatchScreen, 1);
        logAgentPermissionCardClick(HatchComponent.CLOSE_BUTTON, hatchScreen, agentPermissionApproval, null, null, 1);
    }

    public static final Map<String, String> agentPermissionImpressionMetadata(int i, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("pending_count", String.valueOf(i));
        c0924AIa.put("approval_id", agentPermissionApproval.approvalId);
        c0924AIa.put("approval_type", metadataValue(agentPermissionApproval.payloadType));
        return AIW.A0K(c0924AIa);
    }

    public static final void logAgentPermissionCardClick(HatchComponent hatchComponent, HatchScreen hatchScreen, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.AGENT_PERMISSION, hatchScreen, hatchComponent, agentPermissionApproval.approvalId, agentPermissionCardMetadata(1, agentPermissionApproval, str), null);
    }

    public static /* synthetic */ void logAgentPermissionCardClick$default(HatchComponent hatchComponent, HatchScreen hatchScreen, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, List list, AgentPermissionDecisionOption agentPermissionDecisionOption, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            agentPermissionApproval = null;
        }
        if ((i2 & 8) != 0) {
            list = null;
        }
        if ((i2 & 16) != 0) {
            agentPermissionDecisionOption = null;
        }
        if ((i2 & 32) != 0) {
            i = 1;
        }
        logAgentPermissionCardClick(hatchComponent, hatchScreen, agentPermissionApproval, list, agentPermissionDecisionOption, i);
    }

    public static /* synthetic */ void logAgentPermissionSheetCloseClick$default(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchScreen = HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET;
        }
        logAgentPermissionSheetCloseClick(agentPermissionApproval, hatchScreen);
    }

    public static final void logApprovalsLoadMoreClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.LOAD_MORE_BUTTON, HatchComponent.TAB_APPROVALS.getValue(), null, null);
    }

    public static final Map<String, String> agentPermissionCardMetadata(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str) {
        if (list.size() == 1) {
            return agentPermissionCardMetadata(list.size(), (HatchAgentPermissionsRepository.AgentPermissionApproval) AbstractC0878AGe.A0J(list), str);
        }
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("approval_count", String.valueOf(list.size()));
        if (str != null) {
            c0924AIa.put("decision", str);
        }
        return AIW.A0K(c0924AIa);
    }

    public static final void logAgentPermissionDecisionSheetConfirmClick(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionDecisionOption agentPermissionDecisionOption) {
        AnonymousClass003.A0u(agentPermissionApproval, agentPermissionDecisionOption);
        logAgentPermissionCardClick(HatchComponent.AGENT_PERMISSION_DECISION_SHEET_CONFIRM_BUTTON, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET, agentPermissionApproval, agentPermissionDecisionOption.kind);
    }

    public static final void logBrowserCheckoutTermsLinkClick(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        AnonymousClass006.A0b(agentPermissionApproval).logClick(HatchSurface.CHAT, HatchSubsurface.AGENT_PERMISSION, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_PILL, HatchComponent.BROWSER_CHECKOUT_TERMS_LINK, agentPermissionApproval.approvalId, agentPermissionCardMetadata(1, agentPermissionApproval, null), null);
    }

    public static final String metadataValue(AgentPermissionPayloadType agentPermissionPayloadType) {
        String wireValue = agentPermissionPayloadType.getWireValue();
        return wireValue == null ? "unknown" : wireValue;
    }

    public static final Map<String, String> agentPermissionCardMetadata(int i, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str) {
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("approval_count", String.valueOf(i));
        if (agentPermissionApproval != null) {
            c0924AIa.put("approval_id", agentPermissionApproval.approvalId);
            c0924AIa.put("approval_type", metadataValue(agentPermissionApproval.payloadType));
        }
        if (str != null) {
            c0924AIa.put("decision", str);
        }
        return AIW.A0K(c0924AIa);
    }

    public static final void logAgentPermissionCardClick(HatchComponent hatchComponent, HatchScreen hatchScreen, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, AgentPermissionDecisionOption agentPermissionDecisionOption, int i) {
        String str;
        Map<String, String> mapAgentPermissionCardMetadata;
        AnonymousClass003.A0u(hatchComponent, hatchScreen);
        String str2 = null;
        if (agentPermissionDecisionOption != null) {
            str = agentPermissionDecisionOption.kind;
        } else {
            str = null;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.AGENT_PERMISSION;
        if (agentPermissionApproval != null) {
            str2 = agentPermissionApproval.approvalId;
        }
        if (list != null) {
            mapAgentPermissionCardMetadata = agentPermissionCardMetadata(list, str);
        } else {
            mapAgentPermissionCardMetadata = agentPermissionCardMetadata(i, agentPermissionApproval, str);
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str2, mapAgentPermissionCardMetadata, null);
    }
}

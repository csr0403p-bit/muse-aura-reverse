package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.BFI;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class ApprovalCardOnlyKt {
    public static final Set<String> REUSABLE_ALLOW_KINDS = BFI.A0H(new String[]{ApprovalRecordDecision.ALLOW_SESSION.getWireValue(), ApprovalRecordDecision.ALLOW_TODAY.getWireValue(), ApprovalRecordDecision.ALLOW_ALWAYS.getWireValue()});
    public static final Set<String> DENY_KINDS = BFI.A0H(new String[]{ApprovalRecordDecision.DENY.getWireValue(), ApprovalRecordDecision.DENY_ALWAYS.getWireValue()});

    public static final boolean approvesOnCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        if (decidesOnlyOnCard(agentPermissionApproval)) {
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<AgentPermissionDecisionOption> it = list.iterator();
                while (it.hasNext()) {
                    if (!isDenial(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean decidesOnlyOnCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return isPurchasePreapproval(agentPermissionApproval) || isConnectorOrderApproval(agentPermissionApproval);
    }

    public static final boolean isConnectorOrderApproval(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        if (agentPermissionApproval.payloadType == AgentPermissionPayloadType.CONNECTOR && !AnonymousClass002.A1b(agentPermissionApproval.connectorTurnGrantEligible, true) && (agentPermissionApproval.requestPreviewDocument != null || agentPermissionApproval.requestPreviewDocumentSent)) {
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<AgentPermissionDecisionOption> it = list.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(it.next().kind, ApprovalRecordDecision.ALLOW_ONCE.getWireValue())) {
                        List<AgentPermissionDecisionOption> list2 = agentPermissionApproval.decisionOptions;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<AgentPermissionDecisionOption> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (REUSABLE_ALLOW_KINDS.contains(it2.next().kind)) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isDenial(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        C7384Etj.A0Y(agentPermissionDecisionOption, 0);
        return DENY_KINDS.contains(agentPermissionDecisionOption.kind);
    }

    public static final boolean isPurchasePreapproval(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return agentPermissionApproval.payloadType == AgentPermissionPayloadType.PURCHASE_PREAPPROVAL;
    }

    public static final boolean isQuickDecisionAllowed(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionDecisionOption agentPermissionDecisionOption) {
        boolean zA1a = AnonymousClass002.A1a(agentPermissionApproval, agentPermissionDecisionOption);
        if (!decidesOnlyOnCard(agentPermissionApproval) || isDenial(agentPermissionDecisionOption)) {
            return zA1a;
        }
        return false;
    }

    public static final List<AgentPermissionDecisionOption> quickDecisionOptions(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        boolean zDecidesOnlyOnCard = decidesOnlyOnCard(agentPermissionApproval);
        List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
        if (!zDecidesOnlyOnCard) {
            return list;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (AgentPermissionDecisionOption agentPermissionDecisionOption : list) {
            if (isDenial(agentPermissionDecisionOption)) {
                arrayListA0h.add(agentPermissionDecisionOption);
            }
        }
        return arrayListA0h;
    }

    public static final HatchAgentPermissionsRepository.AgentPermissionApproval withCardOnlyDecisionApplied(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument;
        C7384Etj.A0Y(agentPermissionApproval, 0);
        if (!decidesOnlyOnCard(agentPermissionApproval)) {
            return agentPermissionApproval;
        }
        ConnectorOrderCheckout connectorOrderCheckoutOrNull = null;
        if (agentPermissionApproval.richPayload == null && isConnectorOrderApproval(agentPermissionApproval) && (agentPermissionRequestPreviewDocument = agentPermissionApproval.requestPreviewDocument) != null) {
            connectorOrderCheckoutOrNull = ConnectorOrderCheckoutKt.toConnectorOrderCheckoutOrNull(agentPermissionRequestPreviewDocument);
        }
        HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
        if (agentPermissionRichPayload == null) {
            agentPermissionRichPayload = connectorOrderCheckoutOrNull;
        }
        return HatchAgentPermissionsRepository.AgentPermissionApproval.copy$default(agentPermissionApproval, null, true, null, 0L, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, agentPermissionRichPayload, false, null, null, -268435459, null);
    }
}

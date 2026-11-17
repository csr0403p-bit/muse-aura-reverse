package com.facebook.aura.agentpermission;

import X.AbstractC2159Azp;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1BO;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.R;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.model.AiIdentity;

/* loaded from: classes2.dex */
public abstract class AgentPermissionTitleKt {
    public static final String agentPermissionHeadline(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, String str2, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        String strHeadline = AgentPermissionHeadlineKt.headline(agentPermissionApproval, agentPermissionAgentName(bfm, 0), str, str2);
        if (strHeadline == null) {
            bfm.AgE(1816986727);
            strHeadline = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200a7);
        } else {
            bfm.AgE(1816984123);
        }
        AnonymousClass001.A1D(bfm);
        return strHeadline;
    }

    public static final String agentPermissionHeadlineOrNull(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, String str2, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return AgentPermissionHeadlineKt.headline(agentPermissionApproval, agentPermissionAgentName(bfm, 0), str, str2);
    }

    public static final String agentPermissionNarrative(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, String str2, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        String strAgentPermissionAgentName = agentPermissionAgentName(bfm, 0);
        String strPurposeSummaryText = AgentPermissionHeadlineKt.purposeSummaryText(agentPermissionApproval);
        if (strPurposeSummaryText == null && (strPurposeSummaryText = trimToNonBlank(str)) == null && (strPurposeSummaryText = trimToNonBlank(str2)) == null) {
            return null;
        }
        return AbstractC2159Azp.A0z(strPurposeSummaryText, AgentPermissionHeadlineKt.APPROVAL_ASSISTANT_PLACEHOLDER, strAgentPermissionAgentName);
    }

    public static final String agentPermissionQuestion(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BFM bfm, int i) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        String strPermissionQuestionText = AgentPermissionHeadlineKt.permissionQuestionText(agentPermissionApproval, agentPermissionAgentName(bfm, 0));
        if (strPermissionQuestionText == null) {
            bfm.AgE(-299469767);
            strPermissionQuestionText = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200a7);
        } else {
            bfm.AgE(-299471968);
        }
        AnonymousClass001.A1D(bfm);
        return strPermissionQuestionText;
    }

    public static final String requestDisplayName(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        String strTrimToNonBlank = trimToNonBlank(agentPermissionApproval.displayName);
        return strTrimToNonBlank == null ? trimToNonBlank(agentPermissionApproval.connectorDisplayName) : strTrimToNonBlank;
    }

    public static final String trimToNonBlank(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
            return null;
        }
        return strA0l;
    }

    public static final String agentPermissionAgentName(BFM bfm, int i) {
        String strA01;
        String str;
        AiIdentity aiIdentity = (AiIdentity) C1BO.A07(bfm, HatchGatewayConnection.Companion.getInstance(AnonymousClass002.A0h(bfm)).getAiIdentity());
        if (aiIdentity == null || (str = aiIdentity.name) == null || (strA01 = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA01)) {
            bfm.AgE(1211676930);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12007e);
        } else {
            bfm.AgE(1211675008);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }
}

package com.facebook.aura.gateway;

import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C7384Etj;
import X.C7BY;
import X.C7LE;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class AgentPermissionHeadlineKt {
    public static final String APPROVAL_ASSISTANT_PLACEHOLDER = "{assistant}";
    public static final Set<String> EMPTY_PREVIEW_BODIES = BFI.A0H(new String[]{"{}", "[]", HatchCcvLoggingKt.NO_POSTAL_FIELD, "\"\""});

    public static final String attentionExplanation(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        String str;
        C7384Etj.A0Y(agentPermissionApproval, 0);
        String str2 = agentPermissionApproval.attentionLabel;
        if (str2 == null || C7BY.A0j(str2) || (str = agentPermissionApproval.permissionCaption) == null) {
            return null;
        }
        return HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str);
    }

    public static final boolean hasInlineRequestPreview(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return agentPermissionApproval.requestPresentation == AgentPermissionRequestPresentation.INLINE && hasRequestPreview(agentPermissionApproval);
    }

    public static final boolean hasRequestPreview(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return agentPermissionApproval.requestPreviewDocument != null || isMeaningfulPreview(agentPermissionApproval.requestPreview);
    }

    public static final boolean isMeaningfulPreview(String str) {
        String strA0l;
        int length;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || (length = strA0l.length()) == 0) {
            return false;
        }
        Set<String> set = EMPTY_PREVIEW_BODIES;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char cCharAt = strA0l.charAt(i);
            if (!C7LE.A00(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return !set.contains(sb.toString());
    }

    public static final String permissionCaptionText(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        String str = agentPermissionApproval.permissionCaption;
        if (str == null || str.equals(attentionExplanation(agentPermissionApproval))) {
            return null;
        }
        return str;
    }

    public static final String purposeSummaryText(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        String str = agentPermissionApproval.purposeSummary;
        if (str != null) {
            return HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str);
        }
        return null;
    }

    public static final boolean rendersCheckoutCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
        return (agentPermissionRichPayload instanceof PurchasePreapproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.BrowserCheckoutApproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ShopifyCheckoutApproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ReservationCheckoutApproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.CarRentalReservationApproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.FlightCheckoutApproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.StripeLinkCheckoutApproval) || (agentPermissionRichPayload instanceof DeliveryCheckoutApproval) || (agentPermissionRichPayload instanceof ConnectorOrderCheckout);
    }

    public static /* synthetic */ String headline$default(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return headline(agentPermissionApproval, str, str2, str3);
    }

    public static final String headline(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, String str2, String str3) {
        String strTrimToNonEmpty;
        AnonymousClass003.A0u(agentPermissionApproval, str);
        String str4 = agentPermissionApproval.cardTitle;
        ApprovalRecord approvalRecord = agentPermissionApproval.approvalRecord;
        Iterator it = Arrays.asList(str4, str2, str3, approvalRecord != null ? approvalRecord.summaryTitle : null, agentPermissionApproval.permissionQuestion).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (strA0j != null && (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(strA0j)) != null) {
                return AbstractC2159Azp.A0z(strTrimToNonEmpty, APPROVAL_ASSISTANT_PLACEHOLDER, str);
            }
        }
        return null;
    }

    public static final String permissionQuestionText(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str) {
        String strTrimToNonEmpty;
        AnonymousClass003.A0u(agentPermissionApproval, str);
        String str2 = agentPermissionApproval.permissionQuestion;
        if (str2 == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) == null) {
            return null;
        }
        return AbstractC2159Azp.A0z(strTrimToNonEmpty, APPROVAL_ASSISTANT_PLACEHOLDER, str);
    }
}

package com.facebook.aura.agentpermission;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.R;
import com.facebook.aura.gateway.ApprovalIconKey;
import com.facebook.aura.gateway.ApprovalRecord;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserTaskConfirmationTreatment {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserTaskConfirmationTreatment[] $VALUES;
    public static final BrowserTaskConfirmationTreatment BROWSER;
    public static final BrowserTaskConfirmationTreatment CHECKOUT;
    public static final Companion Companion;
    public final int iconRes;

    static {
        BrowserTaskConfirmationTreatment browserTaskConfirmationTreatment = new BrowserTaskConfirmationTreatment("BROWSER", 0, R.drawable.circle_alert_wght400_outline_24);
        BROWSER = browserTaskConfirmationTreatment;
        BrowserTaskConfirmationTreatment browserTaskConfirmationTreatment2 = new BrowserTaskConfirmationTreatment("CHECKOUT", 1, R.drawable.shoppingcart_outline_24_wght400);
        CHECKOUT = browserTaskConfirmationTreatment2;
        BrowserTaskConfirmationTreatment[] browserTaskConfirmationTreatmentArr = {browserTaskConfirmationTreatment, browserTaskConfirmationTreatment2};
        $VALUES = browserTaskConfirmationTreatmentArr;
        $ENTRIES = C3cG.A0w(browserTaskConfirmationTreatmentArr);
        Companion = new Companion();
    }

    public static Ey9<BrowserTaskConfirmationTreatment> getEntries() {
        return $ENTRIES;
    }

    public static BrowserTaskConfirmationTreatment valueOf(String str) {
        return (BrowserTaskConfirmationTreatment) Enum.valueOf(BrowserTaskConfirmationTreatment.class, str);
    }

    public static BrowserTaskConfirmationTreatment[] values() {
        return (BrowserTaskConfirmationTreatment[]) $VALUES.clone();
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final class Companion {
        public final BrowserTaskConfirmationTreatment forApproval(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            C7384Etj.A0Y(agentPermissionApproval, 0);
            ApprovalRecord approvalRecord = agentPermissionApproval.approvalRecord;
            return (approvalRecord != null ? approvalRecord.iconKey : null) == ApprovalIconKey.WARNING ? BrowserTaskConfirmationTreatment.BROWSER : BrowserTaskConfirmationTreatment.CHECKOUT;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public BrowserTaskConfirmationTreatment(String str, int i, int i2) {
        this.iconRes = i2;
    }
}

package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ApprovalDecisionSkipReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalDecisionSkipReason[] $VALUES;
    public static final ApprovalDecisionSkipReason ALREADY_SUBMITTING;
    public static final ApprovalDecisionSkipReason AWAITING_SNAPSHOT;
    public static final ApprovalDecisionSkipReason NOT_PENDING;
    public static final ApprovalDecisionSkipReason NO_SESSION;
    public static final ApprovalDecisionSkipReason OPTION_UNAVAILABLE;
    public final String value;

    static {
        ApprovalDecisionSkipReason approvalDecisionSkipReason = new ApprovalDecisionSkipReason("ALREADY_SUBMITTING", 0, "already_submitting");
        ALREADY_SUBMITTING = approvalDecisionSkipReason;
        ApprovalDecisionSkipReason approvalDecisionSkipReason2 = new ApprovalDecisionSkipReason("NOT_PENDING", 1, "not_pending");
        NOT_PENDING = approvalDecisionSkipReason2;
        ApprovalDecisionSkipReason approvalDecisionSkipReason3 = new ApprovalDecisionSkipReason("OPTION_UNAVAILABLE", 2, "option_unavailable");
        OPTION_UNAVAILABLE = approvalDecisionSkipReason3;
        ApprovalDecisionSkipReason approvalDecisionSkipReason4 = new ApprovalDecisionSkipReason("NO_SESSION", 3, "no_session");
        NO_SESSION = approvalDecisionSkipReason4;
        ApprovalDecisionSkipReason approvalDecisionSkipReason5 = new ApprovalDecisionSkipReason("AWAITING_SNAPSHOT", 4, "awaiting_snapshot");
        AWAITING_SNAPSHOT = approvalDecisionSkipReason5;
        ApprovalDecisionSkipReason[] approvalDecisionSkipReasonArr = {approvalDecisionSkipReason, approvalDecisionSkipReason2, approvalDecisionSkipReason3, approvalDecisionSkipReason4, approvalDecisionSkipReason5};
        $VALUES = approvalDecisionSkipReasonArr;
        $ENTRIES = C3cG.A0w(approvalDecisionSkipReasonArr);
    }

    public static Ey9<ApprovalDecisionSkipReason> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalDecisionSkipReason valueOf(String str) {
        return (ApprovalDecisionSkipReason) Enum.valueOf(ApprovalDecisionSkipReason.class, str);
    }

    public static ApprovalDecisionSkipReason[] values() {
        return (ApprovalDecisionSkipReason[]) $VALUES.clone();
    }

    public final String getValue$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        return this.value;
    }

    public ApprovalDecisionSkipReason(String str, int i, String str2) {
        this.value = str2;
    }
}

package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ApprovalRecord extends C06G {
    public static final int $stable = 0;
    public final Long decidedAtMs;
    public final ApprovalRecordDecision decision;
    public final ApprovalIconKey iconKey;
    public final String outcomeLabel;
    public final ApprovalRecordStatus status;
    public final String summaryTitle;

    public static /* synthetic */ ApprovalRecord copy$default(ApprovalRecord approvalRecord, Long l, ApprovalRecordStatus approvalRecordStatus, ApprovalRecordDecision approvalRecordDecision, String str, ApprovalIconKey approvalIconKey, String str2, int i, Object obj) {
        Long l2 = l;
        ApprovalRecordStatus approvalRecordStatus2 = approvalRecordStatus;
        ApprovalRecordDecision approvalRecordDecision2 = approvalRecordDecision;
        String str3 = str;
        ApprovalIconKey approvalIconKey2 = approvalIconKey;
        String str4 = str2;
        if ((i & 1) != 0) {
            l2 = approvalRecord.decidedAtMs;
        }
        if ((i & 2) != 0) {
            approvalRecordStatus2 = approvalRecord.status;
        }
        if ((i & 4) != 0) {
            approvalRecordDecision2 = approvalRecord.decision;
        }
        if ((i & 8) != 0) {
            str3 = approvalRecord.summaryTitle;
        }
        if ((i & 16) != 0) {
            approvalIconKey2 = approvalRecord.iconKey;
        }
        if ((i & 32) != 0) {
            str4 = approvalRecord.outcomeLabel;
        }
        return new ApprovalRecord(l2, approvalRecordStatus2, approvalRecordDecision2, str3, approvalIconKey2, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRecord) {
                ApprovalRecord approvalRecord = (ApprovalRecord) obj;
                if (!C7384Etj.areEqual(this.decidedAtMs, approvalRecord.decidedAtMs) || this.status != approvalRecord.status || this.decision != approvalRecord.decision || !C7384Etj.areEqual(this.summaryTitle, approvalRecord.summaryTitle) || this.iconKey != approvalRecord.iconKey || !C7384Etj.areEqual(this.outcomeLabel, approvalRecord.outcomeLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Long component1() {
        return this.decidedAtMs;
    }

    public final ApprovalRecordStatus component2() {
        return this.status;
    }

    public final ApprovalRecordDecision component3() {
        return this.decision;
    }

    public final String component4() {
        return this.summaryTitle;
    }

    public final ApprovalIconKey component5() {
        return this.iconKey;
    }

    public final String component6() {
        return this.outcomeLabel;
    }

    public final ApprovalRecord copy(Long l, ApprovalRecordStatus approvalRecordStatus, ApprovalRecordDecision approvalRecordDecision, String str, ApprovalIconKey approvalIconKey, String str2) {
        return new ApprovalRecord(l, approvalRecordStatus, approvalRecordDecision, str, approvalIconKey, str2);
    }

    public final Long getDecidedAtMs() {
        return this.decidedAtMs;
    }

    public final ApprovalRecordDecision getDecision() {
        return this.decision;
    }

    public final ApprovalIconKey getIconKey() {
        return this.iconKey;
    }

    public final String getOutcomeLabel() {
        return this.outcomeLabel;
    }

    public final ApprovalRecordStatus getStatus() {
        return this.status;
    }

    public final String getSummaryTitle() {
        return this.summaryTitle;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0D(this.decidedAtMs) * 31) + AnonymousClass006.A0D(this.status)) * 31) + AnonymousClass006.A0D(this.decision)) * 31) + AnonymousClass006.A0G(this.summaryTitle)) * 31) + AnonymousClass006.A0D(this.iconKey)) * 31) + AnonymousClass005.A0H(this.outcomeLabel);
    }

    public ApprovalRecord(Long l, ApprovalRecordStatus approvalRecordStatus, ApprovalRecordDecision approvalRecordDecision, String str, ApprovalIconKey approvalIconKey, String str2) {
        this.decidedAtMs = l;
        this.status = approvalRecordStatus;
        this.decision = approvalRecordDecision;
        this.summaryTitle = str;
        this.iconKey = approvalIconKey;
        this.outcomeLabel = str2;
    }

    public String toString() {
        return super.toString();
    }
}

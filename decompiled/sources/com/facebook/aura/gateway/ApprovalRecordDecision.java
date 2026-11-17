package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ApprovalRecordDecision {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalRecordDecision[] $VALUES;
    public static final ApprovalRecordDecision ALLOW_ALWAYS;
    public static final ApprovalRecordDecision ALLOW_ONCE;
    public static final ApprovalRecordDecision ALLOW_SESSION;
    public static final ApprovalRecordDecision ALLOW_TODAY;
    public static final ApprovalRecordDecision AUTO_ALLOW;
    public static final Companion Companion;
    public static final ApprovalRecordDecision DENY;
    public static final ApprovalRecordDecision DENY_ALWAYS;
    public static final ApprovalRecordDecision TIMED_OUT;
    public final String wireValue;

    static {
        ApprovalRecordDecision approvalRecordDecision = new ApprovalRecordDecision("ALLOW_ONCE", 0, "allow_once");
        ALLOW_ONCE = approvalRecordDecision;
        ApprovalRecordDecision approvalRecordDecision2 = new ApprovalRecordDecision("ALLOW_SESSION", 1, "allow_session");
        ALLOW_SESSION = approvalRecordDecision2;
        ApprovalRecordDecision approvalRecordDecision3 = new ApprovalRecordDecision("ALLOW_TODAY", 2, "allow_today");
        ALLOW_TODAY = approvalRecordDecision3;
        ApprovalRecordDecision approvalRecordDecision4 = new ApprovalRecordDecision("ALLOW_ALWAYS", 3, "allow_always");
        ALLOW_ALWAYS = approvalRecordDecision4;
        ApprovalRecordDecision approvalRecordDecision5 = new ApprovalRecordDecision("AUTO_ALLOW", 4, "auto_allow");
        AUTO_ALLOW = approvalRecordDecision5;
        ApprovalRecordDecision approvalRecordDecision6 = new ApprovalRecordDecision("DENY", 5, ConfidentialVmSettingsJsonKt.MODE_DENY);
        DENY = approvalRecordDecision6;
        ApprovalRecordDecision approvalRecordDecision7 = new ApprovalRecordDecision("DENY_ALWAYS", 6, "deny_always");
        DENY_ALWAYS = approvalRecordDecision7;
        ApprovalRecordDecision approvalRecordDecision8 = new ApprovalRecordDecision("TIMED_OUT", 7, "timed_out");
        TIMED_OUT = approvalRecordDecision8;
        ApprovalRecordDecision[] approvalRecordDecisionArr = {approvalRecordDecision, approvalRecordDecision2, approvalRecordDecision3, approvalRecordDecision4, approvalRecordDecision5, approvalRecordDecision6, approvalRecordDecision7, approvalRecordDecision8};
        $VALUES = approvalRecordDecisionArr;
        $ENTRIES = C3cG.A0w(approvalRecordDecisionArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ApprovalRecordDecision fromWire(String str) {
            ApprovalRecordDecision next;
            Iterator<ApprovalRecordDecision> it = ApprovalRecordDecision.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<ApprovalRecordDecision> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalRecordDecision valueOf(String str) {
        return (ApprovalRecordDecision) Enum.valueOf(ApprovalRecordDecision.class, str);
    }

    public static ApprovalRecordDecision[] values() {
        return (ApprovalRecordDecision[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ApprovalRecordDecision(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

package com.facebook.aura.gateway;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0924AIa;
import X.C3cG;
import X.C60N;
import X.Ey9;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.pairs.PairsRepositoryKt;

/* loaded from: classes2.dex */
public final class ApprovalDecisionAnalytics {
    public static final int $stable = 0;
    public static final String EVENT_NAME = "agent_permission_decision";
    public static final String EVENT_TYPE_OUTCOME = "outcome";
    public static final ApprovalDecisionAnalytics INSTANCE = new ApprovalDecisionAnalytics();
    public static final String KEY_APPROVAL_ID = "approval_id";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Outcome {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Outcome[] $VALUES;
        public static final Outcome APPLIED;
        public static final Outcome FAILED;
        public static final Outcome NOT_APPLIED;
        public static final Outcome REJECTED;
        public static final Outcome SKIPPED;
        public final String value;

        static {
            Outcome outcome = new Outcome("APPLIED", 0, PairsRepositoryKt.GOAL_EDIT_APPLIED);
            APPLIED = outcome;
            Outcome outcome2 = new Outcome("NOT_APPLIED", 1, "not_applied");
            NOT_APPLIED = outcome2;
            Outcome outcome3 = new Outcome("REJECTED", 2, "rejected");
            REJECTED = outcome3;
            Outcome outcome4 = new Outcome(CvmMigrationStatusJson.STAGE_FAILED, 3, "failed");
            FAILED = outcome4;
            Outcome outcome5 = new Outcome("SKIPPED", 4, "skipped");
            SKIPPED = outcome5;
            Outcome[] outcomeArr = {outcome, outcome2, outcome3, outcome4, outcome5};
            $VALUES = outcomeArr;
            $ENTRIES = C3cG.A0w(outcomeArr);
        }

        public static Ey9<Outcome> getEntries() {
            return $ENTRIES;
        }

        public static Outcome valueOf(String str) {
            return (Outcome) Enum.valueOf(Outcome.class, str);
        }

        public static Outcome[] values() {
            return (Outcome[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Outcome(String str, int i, String str2) {
            this.value = str2;
        }
    }

    private final String decisionErrorType(Throwable th) {
        NetworkException networkException;
        int i;
        if (!(th instanceof NetworkException) || (i = (networkException = (NetworkException) th).httpResponseCode) <= 0) {
            return C60N.A00(1);
        }
        String str = networkException.errorCode;
        return str == null ? FGI.A0H("http_", i) : str;
    }

    private final void log(String str, Outcome outcome, String str2, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.CHAT.getValue();
        String value2 = HatchSubsurface.AGENT_PERMISSION.getValue();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("approval_id", str);
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), outcome.getValue());
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.ERROR_TYPE, str2, c0924AIaA0u);
        }
        hatchAppEventLogger.logEvent(EVENT_NAME, value, value2, "outcome", EVENT_NAME, AIW.A0K(c0924AIaA0u), hatchAppEventLoggingContext);
    }

    public static /* synthetic */ void log$default(ApprovalDecisionAnalytics approvalDecisionAnalytics, String str, Outcome outcome, String str2, HatchAppEventLoggingContext hatchAppEventLoggingContext, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            hatchAppEventLoggingContext = null;
        }
        approvalDecisionAnalytics.log(str, outcome, str2, hatchAppEventLoggingContext);
    }

    public static /* synthetic */ void logSkipped$default(ApprovalDecisionAnalytics approvalDecisionAnalytics, String str, ApprovalDecisionSkipReason approvalDecisionSkipReason, ApprovalOrigin approvalOrigin, int i, Object obj) {
        if ((i & 4) != 0) {
            approvalOrigin = null;
        }
        approvalDecisionAnalytics.logSkipped(str, approvalDecisionSkipReason, approvalOrigin);
    }

    public final void logApplied$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass003.A0u(str, hatchAppEventLoggingContext);
        log(str, Outcome.APPLIED, null, hatchAppEventLoggingContext);
    }

    public final void logFailed$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, Throwable th, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass005.A0x(str, th, hatchAppEventLoggingContext);
        log(str, Outcome.FAILED, decisionErrorType(th), hatchAppEventLoggingContext);
    }

    public final void logNotApplied$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, String str2, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass003.A0v(str, hatchAppEventLoggingContext);
        if (str2 != null) {
            log(str, Outcome.REJECTED, str2, hatchAppEventLoggingContext);
        } else {
            log(str, Outcome.NOT_APPLIED, null, hatchAppEventLoggingContext);
        }
    }

    public final void logSkipped(String str, ApprovalDecisionSkipReason approvalDecisionSkipReason, ApprovalOrigin approvalOrigin) {
        AnonymousClass003.A0u(str, approvalDecisionSkipReason);
        if (approvalOrigin != ApprovalOrigin.LOCAL_HITL) {
            log(str, Outcome.SKIPPED, approvalDecisionSkipReason.getValue$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(), null);
        }
    }
}

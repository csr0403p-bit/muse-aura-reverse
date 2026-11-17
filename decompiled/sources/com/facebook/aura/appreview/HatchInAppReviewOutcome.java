package com.facebook.aura.appreview;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;

/* loaded from: classes5.dex */
public interface HatchInAppReviewOutcome {

    public final class Failure implements HatchInAppReviewOutcome {
        public static final int $stable = 8;
        public final Throwable cause;
        public final FailureReason reason;

        public Failure(FailureReason failureReason, Throwable th) {
            C7384Etj.A0Y(failureReason, 0);
            this.reason = failureReason;
            this.cause = th;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final FailureReason getReason() {
            return this.reason;
        }

        public /* synthetic */ Failure(FailureReason failureReason, Throwable th, int i, C06H c06h) {
            this(failureReason, (i & 2) != 0 ? null : th);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason ACTIVITY_GONE;
        public static final FailureReason IN_FLIGHT;
        public static final FailureReason LAUNCH_FAILED;
        public static final FailureReason PLAY_SERVICES_UNAVAILABLE;
        public static final FailureReason REQUEST_FAILED;
        public final String analyticsValue;

        static {
            FailureReason failureReason = new FailureReason("PLAY_SERVICES_UNAVAILABLE", 0, "play_services_unavailable");
            PLAY_SERVICES_UNAVAILABLE = failureReason;
            FailureReason failureReason2 = new FailureReason("ACTIVITY_GONE", 1, "activity_gone");
            ACTIVITY_GONE = failureReason2;
            FailureReason failureReason3 = new FailureReason("IN_FLIGHT", 2, "in_flight");
            IN_FLIGHT = failureReason3;
            FailureReason failureReason4 = new FailureReason("REQUEST_FAILED", 3, HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_REQUEST_FAILED);
            REQUEST_FAILED = failureReason4;
            FailureReason failureReason5 = new FailureReason("LAUNCH_FAILED", 4, "launch_failed");
            LAUNCH_FAILED = failureReason5;
            FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3, failureReason4, failureReason5};
            $VALUES = failureReasonArr;
            $ENTRIES = C3cG.A0w(failureReasonArr);
        }

        public static Ey9<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }

        public FailureReason(String str, int i, String str2) {
            this.analyticsValue = str2;
        }
    }

    public final class Success implements HatchInAppReviewOutcome {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return -483962770;
        }
    }
}

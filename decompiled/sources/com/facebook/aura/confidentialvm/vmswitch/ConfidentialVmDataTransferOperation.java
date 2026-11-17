package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC7606F5t;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C2CS;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.Ey9;
import X.HtJ;
import X.InterfaceC7549F2g;
import kotlin.Unit;

/* loaded from: classes2.dex */
public interface ConfidentialVmDataTransferOperation extends InterfaceC7549F2g {

    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ Object followStartedTransfer$suspendImpl(ConfidentialVmDataTransferOperation confidentialVmDataTransferOperation, HtJ<? super Outcome> htJ) {
            return new Outcome.Failed(FailureReason.NO_MIGRATION, null, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AfterClear {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AfterClear[] $VALUES;
        public static final AfterClear KEPT;
        public static final AfterClear RESTART;
        public static final AfterClear STAY;

        static {
            AfterClear afterClear = new AfterClear("STAY", 0);
            STAY = afterClear;
            AfterClear afterClear2 = new AfterClear("RESTART", 1);
            RESTART = afterClear2;
            AfterClear afterClear3 = new AfterClear("KEPT", 2);
            KEPT = afterClear3;
            AfterClear[] afterClearArr = {afterClear, afterClear2, afterClear3};
            $VALUES = afterClearArr;
            $ENTRIES = C3cG.A0w(afterClearArr);
        }

        public static Ey9<AfterClear> getEntries() {
            return $ENTRIES;
        }

        public static AfterClear valueOf(String str) {
            return (AfterClear) Enum.valueOf(AfterClear.class, str);
        }

        public static AfterClear[] values() {
            return (AfterClear[]) $VALUES.clone();
        }

        public AfterClear(String str, int i) {
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static C20Q<Unit> getRetryRequests(ConfidentialVmDataTransferOperation confidentialVmDataTransferOperation) {
            return C2CS.A00;
        }

        @Deprecated
        public static Object followStartedTransfer(ConfidentialVmDataTransferOperation confidentialVmDataTransferOperation, HtJ<? super Outcome> htJ) {
            return CC.followStartedTransfer$suspendImpl(confidentialVmDataTransferOperation, htJ);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason CHECKPOINT_FAILED;
        public static final FailureReason DESTINATION_UNAVAILABLE;
        public static final FailureReason MIGRATION_REFUSED;
        public static final FailureReason NO_MIGRATION;
        public static final FailureReason REQUEST_FAILED;
        public static final FailureReason SERVER_UNAVAILABLE;
        public static final FailureReason TRANSFER_FAILED;
        public static final FailureReason TRANSFER_INTERRUPTED;
        public final boolean isRetryable;

        /* JADX WARN: Multi-variable type inference failed */
        static {
            int i = 1;
            C06H c06h = null;
            FailureReason failureReason = new FailureReason("NO_MIGRATION", 0, 0 == true ? 1 : 0, i, c06h);
            NO_MIGRATION = failureReason;
            FailureReason failureReason2 = new FailureReason("CHECKPOINT_FAILED", i, 0 == true ? 1 : 0, i, c06h);
            CHECKPOINT_FAILED = failureReason2;
            int i2 = 1;
            C06H c06h2 = null;
            FailureReason failureReason3 = new FailureReason("SERVER_UNAVAILABLE", 2, 0 == true ? 1 : 0, i2, c06h2);
            SERVER_UNAVAILABLE = failureReason3;
            FailureReason failureReason4 = new FailureReason("REQUEST_FAILED", 3, 0 == true ? 1 : 0, i2, c06h2);
            REQUEST_FAILED = failureReason4;
            FailureReason failureReason5 = new FailureReason("TRANSFER_FAILED", 4, false);
            TRANSFER_FAILED = failureReason5;
            FailureReason failureReason6 = new FailureReason("TRANSFER_INTERRUPTED", 5, 0 == true ? 1 : 0, i2, c06h2);
            TRANSFER_INTERRUPTED = failureReason6;
            FailureReason failureReason7 = new FailureReason("DESTINATION_UNAVAILABLE", 6, 0 == true ? 1 : 0, i2, c06h2);
            DESTINATION_UNAVAILABLE = failureReason7;
            FailureReason failureReason8 = new FailureReason("MIGRATION_REFUSED", 7, false);
            MIGRATION_REFUSED = failureReason8;
            FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3, failureReason4, failureReason5, failureReason6, failureReason7, failureReason8};
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

        public final boolean isRetryable() {
            return this.isRetryable;
        }

        public FailureReason(String str, int i, boolean z) {
            this.isRetryable = z;
        }

        public /* synthetic */ FailureReason(String str, int i, boolean z, int i2, C06H c06h) {
            this(str, i, (i2 & 1) != 0 ? true : z);
        }
    }

    public interface Outcome {

        public final class Completed implements Outcome {
            public static final Completed INSTANCE = new Completed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Completed);
            }

            public String toString() {
                return AbstractC7606F5t.A00(10);
            }

            public int hashCode() {
                return -1513114704;
            }
        }

        public final class Failed extends C06G implements Outcome {
            public final Progress progress;
            public final FailureReason reason;
            public final String serverError;

            public Failed(FailureReason failureReason, String str, Progress progress) {
                C7384Etj.A0Y(failureReason, 0);
                this.reason = failureReason;
                this.serverError = str;
                this.progress = progress;
            }

            public final Failed copy(FailureReason failureReason, String str, Progress progress) {
                C7384Etj.A0Y(failureReason, 0);
                return new Failed(failureReason, str, progress);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Failed) {
                        Failed failed = (Failed) obj;
                        if (this.reason != failed.reason || !C7384Etj.areEqual(this.serverError, failed.serverError) || !C7384Etj.areEqual(this.progress, failed.progress)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, FailureReason failureReason, String str, Progress progress, int i, Object obj) {
                if ((i & 1) != 0) {
                    failureReason = failed.reason;
                }
                if ((i & 2) != 0) {
                    str = failed.serverError;
                }
                if ((i & 4) != 0) {
                    progress = failed.progress;
                }
                return failed.copy(failureReason, str, progress);
            }

            public final FailureReason component1() {
                return this.reason;
            }

            public final String component2() {
                return this.serverError;
            }

            public final Progress component3() {
                return this.progress;
            }

            public final Progress getProgress() {
                return this.progress;
            }

            public final FailureReason getReason() {
                return this.reason;
            }

            public final String getServerError() {
                return this.serverError;
            }

            public int hashCode() {
                return ((AnonymousClass005.A0E(this.reason) + AnonymousClass006.A0G(this.serverError)) * 31) + C3cH.A02(this.progress);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Failed(FailureReason failureReason, String str, Progress progress, int i, C06H c06h) {
                this(failureReason, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : progress);
            }
        }
    }

    public final class Progress extends C06G {
        public final boolean isTransferStarted;
        public final boolean isWaitingOnLockedDestination;
        public final int run;
        public final ProgressStep step;

        public Progress(ProgressStep progressStep, boolean z, boolean z2, int i) {
            C7384Etj.A0Y(progressStep, 0);
            this.step = progressStep;
            this.isTransferStarted = z;
            this.isWaitingOnLockedDestination = z2;
            this.run = i;
        }

        public final Progress copy(ProgressStep progressStep, boolean z, boolean z2, int i) {
            C7384Etj.A0Y(progressStep, 0);
            return new Progress(progressStep, z, z2, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Progress) {
                    Progress progress = (Progress) obj;
                    if (this.step != progress.step || this.isTransferStarted != progress.isTransferStarted || this.isWaitingOnLockedDestination != progress.isWaitingOnLockedDestination || this.run != progress.run) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, ProgressStep progressStep, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                progressStep = progress.step;
            }
            if ((i2 & 2) != 0) {
                z = progress.isTransferStarted;
            }
            if ((i2 & 4) != 0) {
                z2 = progress.isWaitingOnLockedDestination;
            }
            if ((i2 & 8) != 0) {
                i = progress.run;
            }
            C7384Etj.A0Y(progressStep, 0);
            return new Progress(progressStep, z, z2, i);
        }

        public final ProgressStep component1() {
            return this.step;
        }

        public final boolean component2() {
            return this.isTransferStarted;
        }

        public final boolean component3() {
            return this.isWaitingOnLockedDestination;
        }

        public final int component4() {
            return this.run;
        }

        public final int getRun() {
            return this.run;
        }

        public final ProgressStep getStep() {
            return this.step;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.step), this.isTransferStarted), this.isWaitingOnLockedDestination) + this.run;
        }

        public final boolean isTransferStarted() {
            return this.isTransferStarted;
        }

        public final boolean isWaitingOnLockedDestination() {
            return this.isWaitingOnLockedDestination;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Progress(ProgressStep progressStep, boolean z, boolean z2, int i, int i2, C06H c06h) {
            this((i2 & 1) != 0 ? ProgressStep.PREPARING : progressStep, AnonymousClass001.A1Q(i2, z), AnonymousClass005.A1O(i2, z2), (i2 & 8) != 0 ? 0 : i);
        }

        public Progress() {
            this(ProgressStep.PREPARING, false, false, 0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ProgressStep {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ProgressStep[] $VALUES;
        public static final ProgressStep EXPORTING;
        public static final ProgressStep FINALIZING;
        public static final ProgressStep IMPORTING;
        public static final ProgressStep PREPARING;
        public static final ProgressStep SWITCHING;

        static {
            ProgressStep progressStep = new ProgressStep("PREPARING", 0);
            PREPARING = progressStep;
            ProgressStep progressStep2 = new ProgressStep("EXPORTING", 1);
            EXPORTING = progressStep2;
            ProgressStep progressStep3 = new ProgressStep("IMPORTING", 2);
            IMPORTING = progressStep3;
            ProgressStep progressStep4 = new ProgressStep(CvmMigrationStatusJson.STAGE_FINALIZING, 3);
            FINALIZING = progressStep4;
            ProgressStep progressStep5 = new ProgressStep("SWITCHING", 4);
            SWITCHING = progressStep5;
            ProgressStep[] progressStepArr = {progressStep, progressStep2, progressStep3, progressStep4, progressStep5};
            $VALUES = progressStepArr;
            $ENTRIES = C3cG.A0w(progressStepArr);
        }

        public static Ey9<ProgressStep> getEntries() {
            return $ENTRIES;
        }

        public static ProgressStep valueOf(String str) {
            return (ProgressStep) Enum.valueOf(ProgressStep.class, str);
        }

        public static ProgressStep[] values() {
            return (ProgressStep[]) $VALUES.clone();
        }

        public ProgressStep(String str, int i) {
        }
    }

    void clearFailedProgress(Progress progress);

    Object clearSavedProgress(HtJ<? super AfterClear> htJ);

    Object followStartedTransfer(HtJ<? super Outcome> htJ);

    C1BN<Progress> getProgress();

    C20Q<Unit> getRetryRequests();

    Object resumeIfStarted(HtJ<? super Boolean> htJ);

    Object run(HtJ<? super Outcome> htJ);
}

package com.facebook.aura.confidentialvm.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;

/* loaded from: classes2.dex */
public final class ConfidentialVmDataTransferUiState extends C06G {
    public static final int $stable = 0;
    public final boolean canLeaveApp;
    public final boolean canRetry;
    public final String internalErrorDetail;
    public final boolean isAwaitingStart;
    public final boolean isFailed;
    public final boolean isLeaving;
    public final boolean keepsScreenOn;
    public final ConfidentialVmDataTransferOperation.ProgressStep progressStep;

    public final ConfidentialVmDataTransferUiState copy(boolean z, boolean z2, boolean z3, String str, ConfidentialVmDataTransferOperation.ProgressStep progressStep, boolean z4, boolean z5, boolean z6) {
        C7384Etj.A0Y(progressStep, 4);
        return new ConfidentialVmDataTransferUiState(z, z2, z3, str, progressStep, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDataTransferUiState) {
                ConfidentialVmDataTransferUiState confidentialVmDataTransferUiState = (ConfidentialVmDataTransferUiState) obj;
                if (this.isFailed != confidentialVmDataTransferUiState.isFailed || this.canRetry != confidentialVmDataTransferUiState.canRetry || this.isLeaving != confidentialVmDataTransferUiState.isLeaving || !C7384Etj.areEqual(this.internalErrorDetail, confidentialVmDataTransferUiState.internalErrorDetail) || this.progressStep != confidentialVmDataTransferUiState.progressStep || this.isAwaitingStart != confidentialVmDataTransferUiState.isAwaitingStart || this.canLeaveApp != confidentialVmDataTransferUiState.canLeaveApp || this.keepsScreenOn != confidentialVmDataTransferUiState.keepsScreenOn) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmDataTransferUiState copy$default(ConfidentialVmDataTransferUiState confidentialVmDataTransferUiState, boolean z, boolean z2, boolean z3, String str, ConfidentialVmDataTransferOperation.ProgressStep progressStep, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confidentialVmDataTransferUiState.isFailed;
        }
        if ((i & 2) != 0) {
            z2 = confidentialVmDataTransferUiState.canRetry;
        }
        if ((i & 4) != 0) {
            z3 = confidentialVmDataTransferUiState.isLeaving;
        }
        if ((i & 8) != 0) {
            str = confidentialVmDataTransferUiState.internalErrorDetail;
        }
        if ((i & 16) != 0) {
            progressStep = confidentialVmDataTransferUiState.progressStep;
        }
        if ((i & 32) != 0) {
            z4 = confidentialVmDataTransferUiState.isAwaitingStart;
        }
        if ((i & 64) != 0) {
            z5 = confidentialVmDataTransferUiState.canLeaveApp;
        }
        if ((i & 128) != 0) {
            z6 = confidentialVmDataTransferUiState.keepsScreenOn;
        }
        return confidentialVmDataTransferUiState.copy(z, z2, z3, str, progressStep, z4, z5, z6);
    }

    public final boolean component1() {
        return this.isFailed;
    }

    public final boolean component2() {
        return this.canRetry;
    }

    public final boolean component3() {
        return this.isLeaving;
    }

    public final String component4() {
        return this.internalErrorDetail;
    }

    public final ConfidentialVmDataTransferOperation.ProgressStep component5() {
        return this.progressStep;
    }

    public final boolean component6() {
        return this.isAwaitingStart;
    }

    public final boolean component7() {
        return this.canLeaveApp;
    }

    public final boolean component8() {
        return this.keepsScreenOn;
    }

    public final boolean getCanLeaveApp() {
        return this.canLeaveApp;
    }

    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final String getInternalErrorDetail() {
        return this.internalErrorDetail;
    }

    public final boolean getKeepsScreenOn() {
        return this.keepsScreenOn;
    }

    public final ConfidentialVmDataTransferOperation.ProgressStep getProgressStep() {
        return this.progressStep;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.progressStep, (C0KA.A01(C0KA.A01(C0KA.A02(this.isFailed), this.canRetry), this.isLeaving) + AnonymousClass006.A0G(this.internalErrorDetail)) * 31), this.isAwaitingStart), this.canLeaveApp), this.keepsScreenOn);
    }

    public final boolean isAwaitingStart() {
        return this.isAwaitingStart;
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public final boolean isLeaving() {
        return this.isLeaving;
    }

    public /* synthetic */ ConfidentialVmDataTransferUiState(boolean z, boolean z2, boolean z3, String str, ConfidentialVmDataTransferOperation.ProgressStep progressStep, boolean z4, boolean z5, boolean z6, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), AnonymousClass006.A0u(i, str), (i & 16) != 0 ? ConfidentialVmDataTransferOperation.ProgressStep.PREPARING : progressStep, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, C3cH.A1N(i, z6));
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmDataTransferUiState(boolean z, boolean z2, boolean z3, String str, ConfidentialVmDataTransferOperation.ProgressStep progressStep, boolean z4, boolean z5, boolean z6) {
        C7384Etj.A0Y(progressStep, 4);
        this.isFailed = z;
        this.canRetry = z2;
        this.isLeaving = z3;
        this.internalErrorDetail = str;
        this.progressStep = progressStep;
        this.isAwaitingStart = z4;
        this.canLeaveApp = z5;
        this.keepsScreenOn = z6;
    }

    public ConfidentialVmDataTransferUiState() {
        this(false, false, false, null, ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, false, false, false);
    }
}

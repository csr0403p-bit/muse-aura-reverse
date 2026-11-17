package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0KA;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class LocalBrowserMissingTaskUiState {
    public static final int $stable = 0;
    public final boolean canStop;
    public final LocalBrowserTaskOutcome outcome;
    public final LocalBrowserStopStatus stopStatus;

    public LocalBrowserMissingTaskUiState(LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, LocalBrowserStopStatus localBrowserStopStatus) {
        C7384Etj.A0Y(localBrowserStopStatus, 2);
        this.outcome = localBrowserTaskOutcome;
        this.canStop = z;
        this.stopStatus = localBrowserStopStatus;
    }

    public final LocalBrowserMissingTaskUiState copy(LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, LocalBrowserStopStatus localBrowserStopStatus) {
        C7384Etj.A0Y(localBrowserStopStatus, 2);
        return new LocalBrowserMissingTaskUiState(localBrowserTaskOutcome, z, localBrowserStopStatus);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserMissingTaskUiState) {
                LocalBrowserMissingTaskUiState localBrowserMissingTaskUiState = (LocalBrowserMissingTaskUiState) obj;
                if (this.outcome != localBrowserMissingTaskUiState.outcome || this.canStop != localBrowserMissingTaskUiState.canStop || this.stopStatus != localBrowserMissingTaskUiState.stopStatus) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserMissingTaskUiState copy$default(LocalBrowserMissingTaskUiState localBrowserMissingTaskUiState, LocalBrowserTaskOutcome localBrowserTaskOutcome, boolean z, LocalBrowserStopStatus localBrowserStopStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            localBrowserTaskOutcome = localBrowserMissingTaskUiState.outcome;
        }
        if ((i & 2) != 0) {
            z = localBrowserMissingTaskUiState.canStop;
        }
        if ((i & 4) != 0) {
            localBrowserStopStatus = localBrowserMissingTaskUiState.stopStatus;
        }
        return localBrowserMissingTaskUiState.copy(localBrowserTaskOutcome, z, localBrowserStopStatus);
    }

    public final LocalBrowserTaskOutcome component1() {
        return this.outcome;
    }

    public final boolean component2() {
        return this.canStop;
    }

    public final LocalBrowserStopStatus component3() {
        return this.stopStatus;
    }

    public final boolean getCanStop() {
        return this.canStop;
    }

    public final LocalBrowserTaskOutcome getOutcome() {
        return this.outcome;
    }

    public final LocalBrowserStopStatus getStopStatus() {
        return this.stopStatus;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.stopStatus, C0KA.A01(AnonymousClass006.A0D(this.outcome) * 31, this.canStop));
    }

    public String toString() {
        LocalBrowserTaskOutcome localBrowserTaskOutcome = this.outcome;
        boolean z = this.canStop;
        LocalBrowserStopStatus localBrowserStopStatus = this.stopStatus;
        StringBuilder sbA0f = C3cG.A0f(localBrowserTaskOutcome, "LocalBrowserMissingTaskUiState(outcome=");
        sbA0f.append(", canStop=");
        sbA0f.append(z);
        return C3cJ.A0L(localBrowserStopStatus, ", stopStatus=", sbA0f);
    }
}

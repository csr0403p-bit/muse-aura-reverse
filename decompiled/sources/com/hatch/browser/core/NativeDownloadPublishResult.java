package com.hatch.browser.core;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import com.hatch.browser.protocol.DownloadPublishOutcome;

/* loaded from: classes5.dex */
public final class NativeDownloadPublishResult {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public DownloadPublishOutcome outcome;

    public NativeDownloadPublishResult(DownloadPublishOutcome downloadPublishOutcome) {
        C7384Etj.A0Y(downloadPublishOutcome, 0);
        this.outcome = downloadPublishOutcome;
    }

    public final NativeDownloadPublishResult copy(DownloadPublishOutcome downloadPublishOutcome) {
        C7384Etj.A0Y(downloadPublishOutcome, 0);
        return new NativeDownloadPublishResult(downloadPublishOutcome);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativeDownloadPublishResult) && C7384Etj.areEqual(this.outcome, ((NativeDownloadPublishResult) obj).outcome));
    }

    public final void setOutcome(DownloadPublishOutcome downloadPublishOutcome) {
        C7384Etj.A0Y(downloadPublishOutcome, 0);
        this.outcome = downloadPublishOutcome;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ NativeDownloadPublishResult copy$default(NativeDownloadPublishResult nativeDownloadPublishResult, DownloadPublishOutcome downloadPublishOutcome, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadPublishOutcome = nativeDownloadPublishResult.outcome;
        }
        C7384Etj.A0Y(downloadPublishOutcome, 0);
        return new NativeDownloadPublishResult(downloadPublishOutcome);
    }

    public final DownloadPublishOutcome component1() {
        return this.outcome;
    }

    public final DownloadPublishOutcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return this.outcome.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("NativeDownloadPublishResult(outcome=", this.outcome);
    }
}

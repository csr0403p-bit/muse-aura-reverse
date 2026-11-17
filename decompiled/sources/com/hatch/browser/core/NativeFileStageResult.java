package com.hatch.browser.core;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import com.hatch.browser.protocol.FileStageOutcome;

/* loaded from: classes6.dex */
public final class NativeFileStageResult {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public FileStageOutcome outcome;

    public NativeFileStageResult(FileStageOutcome fileStageOutcome) {
        C7384Etj.A0Y(fileStageOutcome, 0);
        this.outcome = fileStageOutcome;
    }

    public final NativeFileStageResult copy(FileStageOutcome fileStageOutcome) {
        C7384Etj.A0Y(fileStageOutcome, 0);
        return new NativeFileStageResult(fileStageOutcome);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativeFileStageResult) && C7384Etj.areEqual(this.outcome, ((NativeFileStageResult) obj).outcome));
    }

    public final void setOutcome(FileStageOutcome fileStageOutcome) {
        C7384Etj.A0Y(fileStageOutcome, 0);
        this.outcome = fileStageOutcome;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ NativeFileStageResult copy$default(NativeFileStageResult nativeFileStageResult, FileStageOutcome fileStageOutcome, int i, Object obj) {
        if ((i & 1) != 0) {
            fileStageOutcome = nativeFileStageResult.outcome;
        }
        C7384Etj.A0Y(fileStageOutcome, 0);
        return new NativeFileStageResult(fileStageOutcome);
    }

    public final FileStageOutcome component1() {
        return this.outcome;
    }

    public final FileStageOutcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return this.outcome.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("NativeFileStageResult(outcome=", this.outcome);
    }
}

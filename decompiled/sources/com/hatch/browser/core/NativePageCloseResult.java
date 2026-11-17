package com.hatch.browser.core;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import com.hatch.browser.protocol.PageCloseOutcome;

/* loaded from: classes6.dex */
public final class NativePageCloseResult {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public PageCloseOutcome outcome;

    public NativePageCloseResult(PageCloseOutcome pageCloseOutcome) {
        C7384Etj.A0Y(pageCloseOutcome, 0);
        this.outcome = pageCloseOutcome;
    }

    public final NativePageCloseResult copy(PageCloseOutcome pageCloseOutcome) {
        C7384Etj.A0Y(pageCloseOutcome, 0);
        return new NativePageCloseResult(pageCloseOutcome);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativePageCloseResult) && C7384Etj.areEqual(this.outcome, ((NativePageCloseResult) obj).outcome));
    }

    public final void setOutcome(PageCloseOutcome pageCloseOutcome) {
        C7384Etj.A0Y(pageCloseOutcome, 0);
        this.outcome = pageCloseOutcome;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ NativePageCloseResult copy$default(NativePageCloseResult nativePageCloseResult, PageCloseOutcome pageCloseOutcome, int i, Object obj) {
        if ((i & 1) != 0) {
            pageCloseOutcome = nativePageCloseResult.outcome;
        }
        C7384Etj.A0Y(pageCloseOutcome, 0);
        return new NativePageCloseResult(pageCloseOutcome);
    }

    public final PageCloseOutcome component1() {
        return this.outcome;
    }

    public final PageCloseOutcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return this.outcome.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("NativePageCloseResult(outcome=", this.outcome);
    }
}

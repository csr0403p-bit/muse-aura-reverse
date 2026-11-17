package com.hatch.browser.core;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import com.hatch.browser.protocol.PageAuthorityDecision;

/* loaded from: classes6.dex */
public final class NativePageAuthorityDecision {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public PageAuthorityDecision decision;

    public NativePageAuthorityDecision(PageAuthorityDecision pageAuthorityDecision) {
        C7384Etj.A0Y(pageAuthorityDecision, 0);
        this.decision = pageAuthorityDecision;
    }

    public final NativePageAuthorityDecision copy(PageAuthorityDecision pageAuthorityDecision) {
        C7384Etj.A0Y(pageAuthorityDecision, 0);
        return new NativePageAuthorityDecision(pageAuthorityDecision);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativePageAuthorityDecision) && C7384Etj.areEqual(this.decision, ((NativePageAuthorityDecision) obj).decision));
    }

    public final void setDecision(PageAuthorityDecision pageAuthorityDecision) {
        C7384Etj.A0Y(pageAuthorityDecision, 0);
        this.decision = pageAuthorityDecision;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ NativePageAuthorityDecision copy$default(NativePageAuthorityDecision nativePageAuthorityDecision, PageAuthorityDecision pageAuthorityDecision, int i, Object obj) {
        if ((i & 1) != 0) {
            pageAuthorityDecision = nativePageAuthorityDecision.decision;
        }
        C7384Etj.A0Y(pageAuthorityDecision, 0);
        return new NativePageAuthorityDecision(pageAuthorityDecision);
    }

    public final PageAuthorityDecision component1() {
        return this.decision;
    }

    public final PageAuthorityDecision getDecision() {
        return this.decision;
    }

    public int hashCode() {
        return this.decision.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("NativePageAuthorityDecision(decision=", this.decision);
    }
}

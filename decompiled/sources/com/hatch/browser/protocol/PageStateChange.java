package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageStateChange {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public PageAuthorityRevision revision;
    public PageAuthorityState state;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageStateChange) {
                PageStateChange pageStateChange = (PageStateChange) obj;
                if (!C7384Etj.areEqual(this.revision, pageStateChange.revision) || !C7384Etj.areEqual(this.state, pageStateChange.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRevision(PageAuthorityRevision pageAuthorityRevision) {
        C7384Etj.A0Y(pageAuthorityRevision, 0);
        this.revision = pageAuthorityRevision;
    }

    public final void setState(PageAuthorityState pageAuthorityState) {
        C7384Etj.A0Y(pageAuthorityState, 0);
        this.state = pageAuthorityState;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PageStateChange copy$default(PageStateChange pageStateChange, PageAuthorityRevision pageAuthorityRevision, PageAuthorityState pageAuthorityState, int i, Object obj) {
        if ((i & 1) != 0) {
            pageAuthorityRevision = pageStateChange.revision;
        }
        if ((i & 2) != 0) {
            pageAuthorityState = pageStateChange.state;
        }
        AnonymousClass003.A0u(pageAuthorityRevision, pageAuthorityState);
        return new PageStateChange(pageAuthorityRevision, pageAuthorityState);
    }

    public final PageAuthorityRevision component1() {
        return this.revision;
    }

    public final PageAuthorityState component2() {
        return this.state;
    }

    public final PageAuthorityRevision getRevision() {
        return this.revision;
    }

    public final PageAuthorityState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, AnonymousClass005.A0E(this.revision));
    }

    public String toString() {
        return C3cJ.A0L(this.state, ", state=", C3cG.A0f(this.revision, "PageStateChange(revision="));
    }

    public PageStateChange(PageAuthorityRevision pageAuthorityRevision, PageAuthorityState pageAuthorityState) {
        AnonymousClass003.A0u(pageAuthorityRevision, pageAuthorityState);
        this.revision = pageAuthorityRevision;
        this.state = pageAuthorityState;
    }

    public final PageStateChange copy(PageAuthorityRevision pageAuthorityRevision, PageAuthorityState pageAuthorityState) {
        AnonymousClass003.A0u(pageAuthorityRevision, pageAuthorityState);
        return new PageStateChange(pageAuthorityRevision, pageAuthorityState);
    }
}

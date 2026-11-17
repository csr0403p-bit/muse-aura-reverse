package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class PageAuthorityDecision {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Denied extends PageAuthorityDecision {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final HostRefusal reason;

        public Denied(HostRefusal hostRefusal) {
            C7384Etj.A0Y(hostRefusal, 0);
            this.reason = hostRefusal;
        }

        public final Denied copy(HostRefusal hostRefusal) {
            C7384Etj.A0Y(hostRefusal, 0);
            return new Denied(hostRefusal);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Denied) && this.reason == ((Denied) obj).reason);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Denied copy$default(Denied denied, HostRefusal hostRefusal, int i, Object obj) {
            if ((i & 1) != 0) {
                hostRefusal = denied.reason;
            }
            C7384Etj.A0Y(hostRefusal, 0);
            return new Denied(hostRefusal);
        }

        public final HostRefusal component1() {
            return this.reason;
        }

        public final HostRefusal getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Denied(reason=", this.reason);
        }
    }

    public final class Granted extends PageAuthorityDecision {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final PageAuthoritySnapshot snapshot;

        public Granted(PageAuthoritySnapshot pageAuthoritySnapshot) {
            C7384Etj.A0Y(pageAuthoritySnapshot, 0);
            this.snapshot = pageAuthoritySnapshot;
        }

        public final Granted copy(PageAuthoritySnapshot pageAuthoritySnapshot) {
            C7384Etj.A0Y(pageAuthoritySnapshot, 0);
            return new Granted(pageAuthoritySnapshot);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Granted) && C7384Etj.areEqual(this.snapshot, ((Granted) obj).snapshot));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Granted copy$default(Granted granted, PageAuthoritySnapshot pageAuthoritySnapshot, int i, Object obj) {
            if ((i & 1) != 0) {
                pageAuthoritySnapshot = granted.snapshot;
            }
            C7384Etj.A0Y(pageAuthoritySnapshot, 0);
            return new Granted(pageAuthoritySnapshot);
        }

        public final PageAuthoritySnapshot component1() {
            return this.snapshot;
        }

        public final PageAuthoritySnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            return this.snapshot.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Granted(snapshot=", this.snapshot);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public PageAuthorityDecision() {
    }

    public /* synthetic */ PageAuthorityDecision(C06H c06h) {
    }
}

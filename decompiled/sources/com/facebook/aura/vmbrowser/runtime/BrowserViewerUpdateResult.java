package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass006;
import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.browsertask.control.BrowserControlLease;

/* loaded from: classes2.dex */
public interface BrowserViewerUpdateResult {

    public final class Failed implements BrowserViewerUpdateResult {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 192066958;
        }
    }

    public final class InvalidState implements BrowserViewerUpdateResult {
        public static final int $stable = 0;
        public static final InvalidState INSTANCE = new InvalidState();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidState);
        }

        public String toString() {
            return "InvalidState";
        }

        public int hashCode() {
            return -1944345237;
        }
    }

    public final class Retry implements BrowserViewerUpdateResult {
        public static final int $stable = 0;
        public static final Retry INSTANCE = new Retry();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public String toString() {
            return "Retry";
        }

        public int hashCode() {
            return 987239223;
        }
    }

    public final class Updated implements BrowserViewerUpdateResult {
        public static final int $stable = BrowserControlLease.$stable;
        public final BrowserControlLease lease;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Updated) && C7384Etj.areEqual(this.lease, ((Updated) obj).lease));
        }

        public /* synthetic */ Updated(BrowserControlLease browserControlLease, int i, C06H c06h) {
            this((i & 1) != 0 ? null : browserControlLease);
        }

        public static /* synthetic */ Updated copy$default(Updated updated, BrowserControlLease browserControlLease, int i, Object obj) {
            if ((i & 1) != 0) {
                browserControlLease = updated.lease;
            }
            return new Updated(browserControlLease);
        }

        public final BrowserControlLease component1() {
            return this.lease;
        }

        public final Updated copy(BrowserControlLease browserControlLease) {
            return new Updated(browserControlLease);
        }

        public final BrowserControlLease getLease() {
            return this.lease;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.lease);
        }

        public String toString() {
            return C3cJ.A0M("Updated(lease=", this.lease);
        }

        public Updated(BrowserControlLease browserControlLease) {
            this.lease = browserControlLease;
        }

        public Updated() {
            this(null);
        }
    }
}

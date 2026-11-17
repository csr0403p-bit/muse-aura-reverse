package com.facebook.aura.browsertask.control;

import X.AnonymousClass006;
import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface BrowserPresentResult {

    public final class Presented implements BrowserPresentResult {
        public static final int $stable = BrowserControlLease.$stable;
        public final BrowserControlLease lease;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Presented) && C7384Etj.areEqual(this.lease, ((Presented) obj).lease));
        }

        public /* synthetic */ Presented(BrowserControlLease browserControlLease, int i, C06H c06h) {
            this((i & 1) != 0 ? null : browserControlLease);
        }

        public static /* synthetic */ Presented copy$default(Presented presented, BrowserControlLease browserControlLease, int i, Object obj) {
            if ((i & 1) != 0) {
                browserControlLease = presented.lease;
            }
            return new Presented(browserControlLease);
        }

        public final BrowserControlLease component1() {
            return this.lease;
        }

        public final Presented copy(BrowserControlLease browserControlLease) {
            return new Presented(browserControlLease);
        }

        public final BrowserControlLease getLease() {
            return this.lease;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.lease);
        }

        public String toString() {
            return C3cJ.A0M("Presented(lease=", this.lease);
        }

        public Presented(BrowserControlLease browserControlLease) {
            this.lease = browserControlLease;
        }

        public Presented() {
            this(null);
        }
    }

    public final class PreviewRevoked implements BrowserPresentResult {
        public static final int $stable = 0;
        public static final PreviewRevoked INSTANCE = new PreviewRevoked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PreviewRevoked);
        }

        public String toString() {
            return "PreviewRevoked";
        }

        public int hashCode() {
            return 870994194;
        }
    }

    public final class Retry implements BrowserPresentResult {
        public static final int $stable = 0;
        public static final Retry INSTANCE = new Retry();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public String toString() {
            return "Retry";
        }

        public int hashCode() {
            return -1380941876;
        }
    }
}

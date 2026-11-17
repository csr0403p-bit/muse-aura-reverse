package com.facebook.aura.browsertask.navigation;

import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface BrowserTaskAgentOpenResult {

    public final class Failed implements BrowserTaskAgentOpenResult {
        public static final int $stable = 0;
        public final BrowserTaskAgentOpenFailure reason;

        public Failed(BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure) {
            C7384Etj.A0Y(browserTaskAgentOpenFailure, 0);
            this.reason = browserTaskAgentOpenFailure;
        }

        public final Failed copy(BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure) {
            C7384Etj.A0Y(browserTaskAgentOpenFailure, 0);
            return new Failed(browserTaskAgentOpenFailure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.reason == ((Failed) obj).reason);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                browserTaskAgentOpenFailure = failed.reason;
            }
            C7384Etj.A0Y(browserTaskAgentOpenFailure, 0);
            return new Failed(browserTaskAgentOpenFailure);
        }

        public final BrowserTaskAgentOpenFailure component1() {
            return this.reason;
        }

        public final BrowserTaskAgentOpenFailure getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Failed(reason=", this.reason);
        }
    }

    public final class Opened implements BrowserTaskAgentOpenResult {
        public static final int $stable = 0;
        public static final Opened INSTANCE = new Opened();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Opened);
        }

        public String toString() {
            return "Opened";
        }

        public int hashCode() {
            return 352666159;
        }
    }
}

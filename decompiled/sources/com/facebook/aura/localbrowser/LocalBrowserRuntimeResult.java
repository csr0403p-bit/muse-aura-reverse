package com.facebook.aura.localbrowser;

import X.C7384Etj;

/* loaded from: classes2.dex */
public interface LocalBrowserRuntimeResult {

    public final class Created implements LocalBrowserRuntimeResult {
        public static final int $stable = LocalBrowserSession.$stable;
        public final LocalBrowserSession session;

        public Created(LocalBrowserSession localBrowserSession) {
            C7384Etj.A0Y(localBrowserSession, 0);
            this.session = localBrowserSession;
        }

        public final LocalBrowserSession getSession() {
            return this.session;
        }
    }

    public final class Unavailable implements LocalBrowserRuntimeResult {
        public static final int $stable = 0;
        public final LocalBrowserRuntimeFailure reason;

        public Unavailable(LocalBrowserRuntimeFailure localBrowserRuntimeFailure) {
            C7384Etj.A0Y(localBrowserRuntimeFailure, 0);
            this.reason = localBrowserRuntimeFailure;
        }

        public final LocalBrowserRuntimeFailure getReason() {
            return this.reason;
        }
    }
}

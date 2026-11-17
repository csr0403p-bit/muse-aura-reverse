package com.meta.health.core;

import X.FGI;

/* loaded from: classes6.dex */
public abstract class MetaHealthError extends Exception {

    public final class IncompleteResult extends MetaHealthError {
        public IncompleteResult() {
            super("Health data query exceeded its safe limit before the range was exhausted.", null);
        }
    }

    public final class OutOfOrderCommit extends MetaHealthError {
        public OutOfOrderCommit() {
            super("Attempted to commit anchors out of FIFO order.", null);
        }
    }

    public final class QueryFailed extends MetaHealthError {
    }

    public final class SdkUnavailable extends MetaHealthError {
        public SdkUnavailable() {
            super("Health Connect SDK is not available on this device.", null);
        }
    }

    public final class AuthorizationFailed extends MetaHealthError {
        /* JADX WARN: Illegal instructions before constructor call */
        public AuthorizationFailed(Throwable th) {
            String message = th.getMessage();
            super(FGI.A0M("Health data authorization failed: ", message == null ? "unknown" : message), th);
        }
    }
}

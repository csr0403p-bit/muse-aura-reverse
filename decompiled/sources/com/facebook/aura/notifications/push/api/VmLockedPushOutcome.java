package com.facebook.aura.notifications.push.api;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface VmLockedPushOutcome {

    public final class Accepted implements VmLockedPushOutcome {
        public static final Accepted INSTANCE = new Accepted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Accepted);
        }

        public String toString() {
            return "Accepted";
        }

        public int hashCode() {
            return 1372203920;
        }
    }

    public final class Dropped implements VmLockedPushOutcome {
        public final String reason;

        public Dropped(String str) {
            C7384Etj.A0Y(str, 0);
            this.reason = str;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    public final class NotHandled implements VmLockedPushOutcome {
        public static final NotHandled INSTANCE = new NotHandled();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotHandled);
        }

        public String toString() {
            return "NotHandled";
        }

        public int hashCode() {
            return 818886290;
        }
    }
}

package com.facebook.aura.auth;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes4.dex */
public interface LogoutResult {

    public final class BearerRejected implements LogoutResult {
        public static final BearerRejected INSTANCE = new BearerRejected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BearerRejected);
        }

        public String toString() {
            return "BearerRejected";
        }

        public int hashCode() {
            return 141097040;
        }
    }

    public final class Failed implements LogoutResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -4332914;
        }
    }

    public final class Success implements LogoutResult {
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return -914900014;
        }
    }
}

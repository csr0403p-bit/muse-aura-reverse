package com.facebook.aura.confidentialvm.repository;

/* loaded from: classes.dex */
public interface ConfidentialVmPinVerifyResult {

    public final class AuthenticationFailed implements ConfidentialVmPinVerifyResult {
        public static final AuthenticationFailed INSTANCE = new AuthenticationFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthenticationFailed);
        }

        public String toString() {
            return "AuthenticationFailed";
        }

        public int hashCode() {
            return 510863804;
        }
    }

    public final class Match implements ConfidentialVmPinVerifyResult {
        public static final Match INSTANCE = new Match();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Match);
        }

        public String toString() {
            return "Match";
        }

        public int hashCode() {
            return 1640597438;
        }
    }

    /* loaded from: classes4.dex */
    public final class Mismatch implements ConfidentialVmPinVerifyResult {
        public static final Mismatch INSTANCE = new Mismatch();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Mismatch);
        }

        public String toString() {
            return "Mismatch";
        }

        public int hashCode() {
            return 1096021301;
        }
    }
}

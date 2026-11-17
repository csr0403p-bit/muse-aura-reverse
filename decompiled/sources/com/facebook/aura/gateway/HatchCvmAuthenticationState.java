package com.facebook.aura.gateway;

/* loaded from: classes2.dex */
public interface HatchCvmAuthenticationState {

    /* loaded from: classes3.dex */
    public final class Disabled implements HatchCvmAuthenticationState {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Disabled);
        }

        public String toString() {
            return "Disabled";
        }

        public int hashCode() {
            return 2094625445;
        }
    }

    public final class EnrollmentRequired implements HatchCvmAuthenticationState {
        public static final int $stable = 0;
        public static final EnrollmentRequired INSTANCE = new EnrollmentRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnrollmentRequired);
        }

        public String toString() {
            return "EnrollmentRequired";
        }

        public int hashCode() {
            return -385644628;
        }
    }

    public final class Failed implements HatchCvmAuthenticationState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 1557906086;
        }
    }

    /* loaded from: classes4.dex */
    public final class Ready implements HatchCvmAuthenticationState {
        public static final int $stable = 0;
        public static final Ready INSTANCE = new Ready();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public String toString() {
            return "Ready";
        }

        public int hashCode() {
            return -1878214118;
        }
    }

    public final class RecoveryRequired implements HatchCvmAuthenticationState {
        public static final int $stable = 0;
        public static final RecoveryRequired INSTANCE = new RecoveryRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RecoveryRequired);
        }

        public String toString() {
            return "RecoveryRequired";
        }

        public int hashCode() {
            return 2124458365;
        }
    }

    public final class VerificationFailed implements HatchCvmAuthenticationState {
        public static final int $stable = 0;
        public static final VerificationFailed INSTANCE = new VerificationFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VerificationFailed);
        }

        public String toString() {
            return "VerificationFailed";
        }

        public int hashCode() {
            return -12652767;
        }
    }

    /* loaded from: classes5.dex */
    public final class Verifying implements HatchCvmAuthenticationState {
        public static final int $stable = 0;
        public static final Verifying INSTANCE = new Verifying();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Verifying);
        }

        public String toString() {
            return "Verifying";
        }

        public int hashCode() {
            return -996221504;
        }
    }
}

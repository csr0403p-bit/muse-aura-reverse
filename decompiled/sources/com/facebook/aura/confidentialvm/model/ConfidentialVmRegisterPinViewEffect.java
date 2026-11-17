package com.facebook.aura.confidentialvm.model;

/* loaded from: classes.dex */
public interface ConfidentialVmRegisterPinViewEffect {

    public final class CredentialAccepted implements ConfidentialVmRegisterPinViewEffect {
        public static final int $stable = 0;
        public static final CredentialAccepted INSTANCE = new CredentialAccepted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialAccepted);
        }

        public String toString() {
            return "CredentialAccepted";
        }

        public int hashCode() {
            return 250846215;
        }
    }

    public final class EscrowFailed implements ConfidentialVmRegisterPinViewEffect {
        public static final int $stable = 0;
        public static final EscrowFailed INSTANCE = new EscrowFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EscrowFailed);
        }

        public String toString() {
            return "EscrowFailed";
        }

        public int hashCode() {
            return 1599918731;
        }
    }

    public final class ExistingRegistrationFound implements ConfidentialVmRegisterPinViewEffect {
        public static final int $stable = 0;
        public static final ExistingRegistrationFound INSTANCE = new ExistingRegistrationFound();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ExistingRegistrationFound);
        }

        public String toString() {
            return "ExistingRegistrationFound";
        }

        public int hashCode() {
            return 916511989;
        }
    }

    public final class RegistrationLookupRetryFailed implements ConfidentialVmRegisterPinViewEffect {
        public static final int $stable = 0;
        public static final RegistrationLookupRetryFailed INSTANCE = new RegistrationLookupRetryFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RegistrationLookupRetryFailed);
        }

        public String toString() {
            return "RegistrationLookupRetryFailed";
        }

        public int hashCode() {
            return -741293847;
        }
    }

    public final class SelectionPersistenceFailed implements ConfidentialVmRegisterPinViewEffect {
        public static final int $stable = 0;
        public static final SelectionPersistenceFailed INSTANCE = new SelectionPersistenceFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectionPersistenceFailed);
        }

        public String toString() {
            return "SelectionPersistenceFailed";
        }

        public int hashCode() {
            return 1177199993;
        }
    }
}

package com.facebook.aura.confidentialvm.repository;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes.dex */
public interface ConfidentialVmEscrowResult {

    public final class AlreadyRegistered implements ConfidentialVmEscrowResult {
        public static final AlreadyRegistered INSTANCE = new AlreadyRegistered();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AlreadyRegistered);
        }

        public String toString() {
            return "AlreadyRegistered";
        }

        public int hashCode() {
            return -1868014446;
        }
    }

    public final class Failure implements ConfidentialVmEscrowResult {
        public static final Failure INSTANCE = new Failure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public String toString() {
            return "Failure";
        }

        public int hashCode() {
            return 1326354210;
        }
    }

    public final class RegistrationLookupUnavailable implements ConfidentialVmEscrowResult {
        public static final RegistrationLookupUnavailable INSTANCE = new RegistrationLookupUnavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RegistrationLookupUnavailable);
        }

        public String toString() {
            return "RegistrationLookupUnavailable";
        }

        public int hashCode() {
            return -75210155;
        }
    }

    public final class Success implements ConfidentialVmEscrowResult {
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return 545758619;
        }
    }
}

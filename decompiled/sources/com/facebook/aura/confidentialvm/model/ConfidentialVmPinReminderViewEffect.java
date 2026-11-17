package com.facebook.aura.confidentialvm.model;

/* loaded from: classes.dex */
public interface ConfidentialVmPinReminderViewEffect {

    public final class VerificationFailed implements ConfidentialVmPinReminderViewEffect {
        public static final int $stable = 0;
        public static final VerificationFailed INSTANCE = new VerificationFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VerificationFailed);
        }

        public String toString() {
            return "VerificationFailed";
        }

        public int hashCode() {
            return 1963370508;
        }
    }

    public final class VerificationSucceeded implements ConfidentialVmPinReminderViewEffect {
        public static final int $stable = 0;
        public static final VerificationSucceeded INSTANCE = new VerificationSucceeded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VerificationSucceeded);
        }

        public String toString() {
            return "VerificationSucceeded";
        }

        public int hashCode() {
            return -907024334;
        }
    }
}

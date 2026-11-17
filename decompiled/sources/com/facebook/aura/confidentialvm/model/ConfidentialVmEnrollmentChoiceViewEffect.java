package com.facebook.aura.confidentialvm.model;

/* loaded from: classes.dex */
public interface ConfidentialVmEnrollmentChoiceViewEffect {

    public final class CreatePin implements ConfidentialVmEnrollmentChoiceViewEffect {
        public static final int $stable = 0;
        public static final CreatePin INSTANCE = new CreatePin();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CreatePin);
        }

        public String toString() {
            return "CreatePin";
        }

        public int hashCode() {
            return -796954711;
        }
    }

    public final class EnterExistingPin implements ConfidentialVmEnrollmentChoiceViewEffect {
        public static final int $stable = 0;
        public static final EnterExistingPin INSTANCE = new EnterExistingPin();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnterExistingPin);
        }

        public String toString() {
            return "EnterExistingPin";
        }

        public int hashCode() {
            return 857804642;
        }
    }
}

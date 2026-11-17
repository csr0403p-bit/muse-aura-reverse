package com.facebook.aura.confidentialvm.model;

/* loaded from: classes.dex */
public interface ConfidentialVmLoginViewEffect {

    public final class VerificationSucceeded implements ConfidentialVmLoginViewEffect {
        public static final int $stable = 0;
        public static final VerificationSucceeded INSTANCE = new VerificationSucceeded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VerificationSucceeded);
        }

        public String toString() {
            return "VerificationSucceeded";
        }

        public int hashCode() {
            return 324945972;
        }
    }
}

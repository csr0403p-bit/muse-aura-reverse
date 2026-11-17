package com.facebook.aura.confidentialvm.model;

/* loaded from: classes2.dex */
public interface ConfidentialVmDataTransferViewEffect {

    public final class Left implements ConfidentialVmDataTransferViewEffect {
        public static final int $stable = 0;
        public static final Left INSTANCE = new Left();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Left);
        }

        public String toString() {
            return "Left";
        }

        public int hashCode() {
            return 1092196839;
        }
    }
}

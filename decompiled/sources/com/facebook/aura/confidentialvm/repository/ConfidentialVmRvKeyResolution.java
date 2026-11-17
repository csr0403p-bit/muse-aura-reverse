package com.facebook.aura.confidentialvm.repository;

import X.C7384Etj;

/* loaded from: classes2.dex */
public interface ConfidentialVmRvKeyResolution {

    public final class Available implements ConfidentialVmRvKeyResolution {
        public final ConfidentialVmRvKey key;

        public Available(ConfidentialVmRvKey confidentialVmRvKey) {
            C7384Etj.A0Y(confidentialVmRvKey, 0);
            this.key = confidentialVmRvKey;
        }

        public final ConfidentialVmRvKey getKey() {
            return this.key;
        }
    }

    public final class DeviceLocked implements ConfidentialVmRvKeyResolution {
        public static final DeviceLocked INSTANCE = new DeviceLocked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceLocked);
        }

        public String toString() {
            return "DeviceLocked";
        }

        public int hashCode() {
            return 1049642507;
        }
    }

    /* loaded from: classes4.dex */
    public final class Failure implements ConfidentialVmRvKeyResolution {
        public static final Failure INSTANCE = new Failure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public String toString() {
            return "Failure";
        }

        public int hashCode() {
            return 1553454495;
        }
    }

    public final class NoStoredSecret implements ConfidentialVmRvKeyResolution {
        public static final NoStoredSecret INSTANCE = new NoStoredSecret();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NoStoredSecret);
        }

        public String toString() {
            return "NoStoredSecret";
        }

        public int hashCode() {
            return 373959391;
        }
    }

    public final class UnreadableSecret implements ConfidentialVmRvKeyResolution {
        public static final UnreadableSecret INSTANCE = new UnreadableSecret();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnreadableSecret);
        }

        public String toString() {
            return "UnreadableSecret";
        }

        public int hashCode() {
            return 1556802852;
        }
    }
}

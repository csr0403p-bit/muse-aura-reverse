package com.facebook.aura.sharesheet;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface SharingJarvisPath extends JarvisPath.Extension {

    public final class SharingAttempt implements SharingJarvisPath {
        public static final int $stable = 0;
        public static final SharingAttempt INSTANCE = new SharingAttempt();
        public static final String value = "api/sharing/attempt";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SharingAttempt);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SharingAttempt";
        }

        public int hashCode() {
            return 1762736343;
        }
    }

    public final class SharingEligibility implements SharingJarvisPath {
        public static final int $stable = 0;
        public static final SharingEligibility INSTANCE = new SharingEligibility();
        public static final String value = "api/sharing/eligibility";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SharingEligibility);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SharingEligibility";
        }

        public int hashCode() {
            return -809585513;
        }
    }
}

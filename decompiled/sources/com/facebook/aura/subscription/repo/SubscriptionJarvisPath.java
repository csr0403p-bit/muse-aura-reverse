package com.facebook.aura.subscription.repo;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface SubscriptionJarvisPath extends JarvisPath.Extension {

    public final class SubscriptionCallback implements SubscriptionJarvisPath {
        public static final int $stable = 0;
        public static final SubscriptionCallback INSTANCE = new SubscriptionCallback();
        public static final String value = "subscription/callback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SubscriptionCallback);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SubscriptionCallback";
        }

        public int hashCode() {
            return 2065949006;
        }
    }

    public final class SubscriptionRedeemComplimentary implements SubscriptionJarvisPath {
        public static final int $stable = 0;
        public static final SubscriptionRedeemComplimentary INSTANCE = new SubscriptionRedeemComplimentary();
        public static final String value = "api/subscription/redeem-complimentary";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SubscriptionRedeemComplimentary);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SubscriptionRedeemComplimentary";
        }

        public int hashCode() {
            return -1020563175;
        }
    }
}

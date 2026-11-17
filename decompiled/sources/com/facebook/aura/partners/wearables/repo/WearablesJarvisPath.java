package com.facebook.aura.partners.wearables.repo;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface WearablesJarvisPath extends JarvisPath.Extension {

    /* loaded from: classes6.dex */
    public final class SubscriptionCheckComplimentary implements WearablesJarvisPath {
        public static final SubscriptionCheckComplimentary INSTANCE = new SubscriptionCheckComplimentary();
        public static final String value = "api/subscription/check-complimentary";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SubscriptionCheckComplimentary);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SubscriptionCheckComplimentary";
        }

        public int hashCode() {
            return -633836718;
        }
    }
}

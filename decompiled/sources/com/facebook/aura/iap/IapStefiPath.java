package com.facebook.aura.iap;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface IapStefiPath extends StefiHatchPath.Extension {

    public final class SubscriptionPurchaseStartAttribution implements IapStefiPath {
        public static final SubscriptionPurchaseStartAttribution INSTANCE = new SubscriptionPurchaseStartAttribution();
        public static final String value = "/hatch/subscription/purchase-start-attribution";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SubscriptionPurchaseStartAttribution);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SubscriptionPurchaseStartAttribution";
        }

        public int hashCode() {
            return -1412079505;
        }
    }
}

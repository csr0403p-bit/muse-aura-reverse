package com.facebook.aura.partners.wearables.repo;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes6.dex */
public interface WearablesStefiPath extends StefiHatchPath.Extension {

    public final class WearablesCommsConsent implements WearablesStefiPath {
        public static final WearablesCommsConsent INSTANCE = new WearablesCommsConsent();
        public static final String value = "/hatch/wearables/comms_consent";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WearablesCommsConsent);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WearablesCommsConsent";
        }

        public int hashCode() {
            return 671340358;
        }
    }

    public final class WearablesComplimentaryOffer implements WearablesStefiPath {
        public static final WearablesComplimentaryOffer INSTANCE = new WearablesComplimentaryOffer();
        public static final String value = "/hatch/wearables/complimentary_offer";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WearablesComplimentaryOffer);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WearablesComplimentaryOffer";
        }

        public int hashCode() {
            return -1235417903;
        }
    }

    public final class WearablesLink implements WearablesStefiPath {
        public static final WearablesLink INSTANCE = new WearablesLink();
        public static final String value = "/hatch/wearables/link";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WearablesLink);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WearablesLink";
        }

        public int hashCode() {
            return 1793976077;
        }
    }
}

package com.facebook.aura.whatsapp.repository;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface WhatsAppJarvisPath extends JarvisPath.Extension {

    public final class WhatsAppCompanionLink implements WhatsAppJarvisPath {
        public static final WhatsAppCompanionLink INSTANCE = new WhatsAppCompanionLink();
        public static final String value = "whatsapp_companion/link";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WhatsAppCompanionLink);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WhatsAppCompanionLink";
        }

        public int hashCode() {
            return -94835910;
        }
    }

    public final class WhatsAppCompanionStatus implements WhatsAppJarvisPath {
        public static final WhatsAppCompanionStatus INSTANCE = new WhatsAppCompanionStatus();
        public static final String value = "whatsapp_companion/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WhatsAppCompanionStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WhatsAppCompanionStatus";
        }

        public int hashCode() {
            return -732808398;
        }
    }
}

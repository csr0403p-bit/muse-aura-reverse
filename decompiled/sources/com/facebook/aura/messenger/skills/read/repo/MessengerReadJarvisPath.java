package com.facebook.aura.messenger.skills.read.repo;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes2.dex */
public interface MessengerReadJarvisPath extends JarvisPath.Extension {

    public final class MessengerReadPinStatus implements MessengerReadJarvisPath {
        public static final MessengerReadPinStatus INSTANCE = new MessengerReadPinStatus();
        public static final String value = "api/messenger_companion/pin-status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MessengerReadPinStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "MessengerReadPinStatus";
        }

        public int hashCode() {
            return -1456188930;
        }
    }

    public final class MessengerReadUnlock implements MessengerReadJarvisPath {
        public static final MessengerReadUnlock INSTANCE = new MessengerReadUnlock();
        public static final String value = "api/messenger_companion/unlock";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MessengerReadUnlock);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "MessengerReadUnlock";
        }

        public int hashCode() {
            return -1169455475;
        }
    }
}

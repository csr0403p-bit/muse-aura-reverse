package com.facebook.aura.settings;

/* loaded from: classes.dex */
public interface ConnectedDevicesViewEffect {

    public final class CommunityDeviceRemovalFailed implements ConnectedDevicesViewEffect {
        public static final int $stable = 0;
        public static final CommunityDeviceRemovalFailed INSTANCE = new CommunityDeviceRemovalFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CommunityDeviceRemovalFailed);
        }

        public String toString() {
            return "CommunityDeviceRemovalFailed";
        }

        public int hashCode() {
            return -1944071853;
        }
    }

    public final class UnpairFailed implements ConnectedDevicesViewEffect {
        public static final int $stable = 0;
        public static final UnpairFailed INSTANCE = new UnpairFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnpairFailed);
        }

        public String toString() {
            return "UnpairFailed";
        }

        public int hashCode() {
            return -1552276359;
        }
    }

    public final class UnpairKeyRevokePending implements ConnectedDevicesViewEffect {
        public static final int $stable = 0;
        public static final UnpairKeyRevokePending INSTANCE = new UnpairKeyRevokePending();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnpairKeyRevokePending);
        }

        public String toString() {
            return "UnpairKeyRevokePending";
        }

        public int hashCode() {
            return -487495346;
        }
    }

    public final class UnpairSucceeded implements ConnectedDevicesViewEffect {
        public static final int $stable = 0;
        public static final UnpairSucceeded INSTANCE = new UnpairSucceeded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnpairSucceeded);
        }

        public String toString() {
            return "UnpairSucceeded";
        }

        public int hashCode() {
            return 1529641125;
        }
    }
}

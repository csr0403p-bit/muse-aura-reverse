package com.facebook.aura.devices.token;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface DeviceTokenStefiPath extends StefiHatchPath.Extension {

    public final class DeviceTokenMint implements DeviceTokenStefiPath {
        public static final DeviceTokenMint INSTANCE = new DeviceTokenMint();
        public static final String value = "/hatch/device_token/mint";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceTokenMint);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DeviceTokenMint";
        }

        public int hashCode() {
            return -1554789482;
        }
    }

    public final class DeviceTokenRevoke implements DeviceTokenStefiPath {
        public static final DeviceTokenRevoke INSTANCE = new DeviceTokenRevoke();
        public static final String value = "/hatch/device_token/revoke";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceTokenRevoke);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DeviceTokenRevoke";
        }

        public int hashCode() {
            return 635615418;
        }
    }
}

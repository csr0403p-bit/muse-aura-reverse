package com.facebook.aura.devices.token;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface DeviceTokenJarvisPath extends JarvisPath.Extension {

    public final class DeviceKeysRegister implements DeviceTokenJarvisPath {
        public static final DeviceKeysRegister INSTANCE = new DeviceKeysRegister();
        public static final String value = "v1/devices/register";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceKeysRegister);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DeviceKeysRegister";
        }

        public int hashCode() {
            return 451480068;
        }
    }

    public final class DeviceKeysRevoke implements DeviceTokenJarvisPath {
        public static final DeviceKeysRevoke INSTANCE = new DeviceKeysRevoke();
        public static final String value = "v1/devices/revoke";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceKeysRevoke);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DeviceKeysRevoke";
        }

        public int hashCode() {
            return 988630567;
        }
    }
}

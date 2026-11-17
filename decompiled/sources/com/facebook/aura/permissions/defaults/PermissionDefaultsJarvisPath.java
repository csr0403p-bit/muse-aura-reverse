package com.facebook.aura.permissions.defaults;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface PermissionDefaultsJarvisPath extends JarvisPath.Extension {

    public final class PermissionsSettings implements PermissionDefaultsJarvisPath {
        public static final PermissionsSettings INSTANCE = new PermissionsSettings();
        public static final String value = "permissions/settings";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PermissionsSettings);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PermissionsSettings";
        }

        public int hashCode() {
            return 624490374;
        }
    }
}

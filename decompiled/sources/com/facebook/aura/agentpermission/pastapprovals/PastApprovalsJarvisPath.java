package com.facebook.aura.agentpermission.pastapprovals;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface PastApprovalsJarvisPath extends JarvisPath.Extension {

    public final class PermissionsReset implements PastApprovalsJarvisPath {
        public static final int $stable = 0;
        public static final PermissionsReset INSTANCE = new PermissionsReset();
        public static final String value = "permissions/reset";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PermissionsReset);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PermissionsReset";
        }

        public int hashCode() {
            return -1879390901;
        }
    }
}

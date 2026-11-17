package com.facebook.aura.agentpermission;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes2.dex */
public interface AgentPermissionJarvisPath extends JarvisPath.Extension {

    public final class ApprovalsHistory implements AgentPermissionJarvisPath {
        public static final int $stable = 0;
        public static final ApprovalsHistory INSTANCE = new ApprovalsHistory();
        public static final String value = "approvals/history";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ApprovalsHistory);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ApprovalsHistory";
        }

        public int hashCode() {
            return 1437382142;
        }
    }
}

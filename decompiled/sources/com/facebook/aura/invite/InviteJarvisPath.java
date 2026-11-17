package com.facebook.aura.invite;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes.dex */
public interface InviteJarvisPath extends JarvisPath.Extension {

    public final class InviteBadge implements InviteJarvisPath {
        public static final InviteBadge INSTANCE = new InviteBadge();
        public static final String value = "api/invite/badge";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InviteBadge);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "InviteBadge";
        }

        public int hashCode() {
            return -72356044;
        }
    }

    public final class InviteBadgeSeen implements InviteJarvisPath {
        public static final InviteBadgeSeen INSTANCE = new InviteBadgeSeen();
        public static final String value = "api/invite/badge/seen";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InviteBadgeSeen);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "InviteBadgeSeen";
        }

        public int hashCode() {
            return -1222346801;
        }
    }
}

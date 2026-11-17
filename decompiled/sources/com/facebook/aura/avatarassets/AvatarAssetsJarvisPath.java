package com.facebook.aura.avatarassets;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes2.dex */
public interface AvatarAssetsJarvisPath extends JarvisPath.Extension {

    public final class AvatarAssets implements AvatarAssetsJarvisPath {
        public static final AvatarAssets INSTANCE = new AvatarAssets();
        public static final String value = "api/avatar/assets";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AvatarAssets);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AvatarAssets";
        }

        public int hashCode() {
            return -1580468958;
        }
    }
}

package com.facebook.aura.commands.photos;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface PhotosJarvisPath extends JarvisPath.Extension {

    /* loaded from: classes6.dex */
    public final class FsUploadStatus implements PhotosJarvisPath {
        public static final FsUploadStatus INSTANCE = new FsUploadStatus();
        public static final String value = "fs/upload/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsUploadStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsUploadStatus";
        }

        public int hashCode() {
            return 565196396;
        }
    }
}

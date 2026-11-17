package com.facebook.aura.storagerecovery.data;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public interface StorageRecoveryJarvisPath extends JarvisPath.Extension {

    public final class RecoveryStorageDelete implements StorageRecoveryJarvisPath {
        public static final RecoveryStorageDelete INSTANCE = new RecoveryStorageDelete();
        public static final String value = "api/recovery/storage/delete";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RecoveryStorageDelete);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "RecoveryStorageDelete";
        }

        public int hashCode() {
            return 683537511;
        }
    }

    public final class RecoveryStorageList implements StorageRecoveryJarvisPath {
        public static final RecoveryStorageList INSTANCE = new RecoveryStorageList();
        public static final String value = "api/recovery/storage/list";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RecoveryStorageList);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "RecoveryStorageList";
        }

        public int hashCode() {
            return -271671718;
        }
    }

    public final class RecoveryStorageStatus implements StorageRecoveryJarvisPath {
        public static final RecoveryStorageStatus INSTANCE = new RecoveryStorageStatus();
        public static final String value = "api/recovery/storage/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RecoveryStorageStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "RecoveryStorageStatus";
        }

        public int hashCode() {
            return 1126514350;
        }
    }
}

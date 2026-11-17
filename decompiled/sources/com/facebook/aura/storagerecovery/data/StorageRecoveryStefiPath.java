package com.facebook.aura.storagerecovery.data;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface StorageRecoveryStefiPath extends StefiHatchPath.Extension {

    public final class MintVmRecoveryToken implements StorageRecoveryStefiPath {
        public static final MintVmRecoveryToken INSTANCE = new MintVmRecoveryToken();
        public static final String value = "/hatch/mint_vm_recovery_token";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MintVmRecoveryToken);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "MintVmRecoveryToken";
        }

        public int hashCode() {
            return -757659153;
        }
    }
}

package com.facebook.aura.wallet.address;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface WalletAddressStefiPath extends StefiHatchPath.Extension {

    public final class WalletAddresses implements WalletAddressStefiPath {
        public static final WalletAddresses INSTANCE = new WalletAddresses();
        public static final String value = "/hatch/wallet/account-info?include=addresses";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WalletAddresses);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WalletAddresses";
        }

        public int hashCode() {
            return 919350443;
        }
    }
}

package com.facebook.aura.devices.pairing;

import X.C7384Etj;
import com.facebook.aura.devices.pairing.HatchSavedWifiNetworkStore;
import com.facebook.aura.hatchlockcrypto.HatchPassphraseEncryptor;

/* loaded from: classes2.dex */
public final class KeystoreSavedWifiCipher implements HatchSavedWifiNetworkStore.RecordCipher {
    public static final KeystoreSavedWifiCipher INSTANCE = new KeystoreSavedWifiCipher();

    @Override // com.facebook.aura.devices.pairing.HatchSavedWifiNetworkStore.RecordCipher
    public byte[] open(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return HatchPassphraseEncryptor.INSTANCE.decrypt(HatchSavedWifiNetworkStoreKt.KEY_ALIAS, bArr);
    }

    @Override // com.facebook.aura.devices.pairing.HatchSavedWifiNetworkStore.RecordCipher
    public byte[] seal(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return HatchPassphraseEncryptor.INSTANCE.encrypt(HatchSavedWifiNetworkStoreKt.KEY_ALIAS, bArr);
    }
}

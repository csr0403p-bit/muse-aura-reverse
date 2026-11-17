package com.facebook.aura.login.credentials;

import X.C7384Etj;
import com.facebook.aura.hatchlockcrypto.HatchPassphraseEncryptor;
import com.facebook.aura.login.credentials.AuraRememberedAccountsStore;

/* loaded from: classes2.dex */
public final class KeystoreOneTapCipher implements AuraRememberedAccountsStore.RecordCipher {
    public static final KeystoreOneTapCipher INSTANCE = new KeystoreOneTapCipher();

    @Override // com.facebook.aura.login.credentials.AuraRememberedAccountsStore.RecordCipher
    public byte[] open(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return HatchPassphraseEncryptor.INSTANCE.decrypt(AuraOneTapLoginStoreKt.KEY_ALIAS, bArr);
    }

    @Override // com.facebook.aura.login.credentials.AuraRememberedAccountsStore.RecordCipher
    public byte[] seal(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return HatchPassphraseEncryptor.INSTANCE.encrypt(AuraOneTapLoginStoreKt.KEY_ALIAS, bArr);
    }
}

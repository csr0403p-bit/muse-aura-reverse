package com.facebook.aura.conversation.offline;

import X.AbstractC0903AHf;
import X.BV4;
import X.BV8;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.HsJ;
import android.security.keystore.KeyGenParameterSpec;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes5.dex */
public final class HatchOfflineConversationCipher {
    public final HatchOfflineConversationDao dao;
    public volatile SecretKey dataKey;
    public final Object dataKeyLock;
    public volatile boolean keyUnavailable;
    public final SecureRandom random;

    public HatchOfflineConversationCipher(HatchOfflineConversationDao hatchOfflineConversationDao) {
        C7384Etj.A0Y(hatchOfflineConversationDao, 0);
        this.dao = hatchOfflineConversationDao;
        this.dataKeyLock = C3cG.A0T();
        this.random = new SecureRandom();
    }

    public final byte[] decrypt(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        SecretKey secretKeyDataKeyOrNull = dataKeyOrNull();
        if (secretKeyDataKeyOrNull == null) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeyDataKeyOrNull, new GCMParameterSpec(128, bArr, 0, 12));
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] encrypt(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C7384Etj.A0Y(bArr, 0);
        SecretKey secretKeyDataKeyOrNull = dataKeyOrNull();
        if (secretKeyDataKeyOrNull == null) {
            return null;
        }
        byte[] bArr2 = new byte[12];
        this.random.nextBytes(bArr2);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeyDataKeyOrNull, new GCMParameterSpec(128, bArr2));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        C7384Etj.A0U(bArrDoFinal);
        return AbstractC0903AHf.A07(bArr2, bArrDoFinal);
    }

    private final SecretKey dataKeyOrNull() {
        Object objA0s;
        SecretKey secretKey = this.dataKey;
        if (secretKey != null) {
            return secretKey;
        }
        SecretKey secretKey2 = null;
        if (this.keyUnavailable) {
            return null;
        }
        synchronized (this.dataKeyLock) {
            SecretKey secretKey3 = this.dataKey;
            if (secretKey3 == null) {
                try {
                    objA0s = loadOrCreateDataKey();
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 != null) {
                    this.keyUnavailable = true;
                    CFK.A0A(HatchOfflineConversationCipherKt.TAG, "Keystore unusable; offline conversation cache disabled", thA00);
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                secretKey3 = (SecretKey) objA0s;
                if (secretKey3 != null) {
                    this.dataKey = secretKey3;
                    secretKey2 = secretKey3;
                }
            } else {
                secretKey2 = secretKey3;
            }
        }
        return secretKey2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Hud] */
    private final SecretKey loadOrCreateDataKey() {
        SecretKey secretKeyA0s;
        HatchOfflineKeyEntity hatchOfflineKeyEntityLoadDataKey = this.dao.loadDataKey(1);
        byte[] bArr = hatchOfflineKeyEntityLoadDataKey != null ? hatchOfflineKeyEntityLoadDataKey.wrappedKey : null;
        if (bArr != null) {
            try {
                secretKeyA0s = unwrap(bArr);
            } catch (Throwable th) {
                secretKeyA0s = C3cG.A0s(th);
            }
            secretKey = secretKeyA0s instanceof C10571Hud ? null : secretKeyA0s;
        }
        if (secretKey != null) {
            return secretKey;
        }
        byte[] bArr2 = new byte[32];
        this.random.nextBytes(bArr2);
        this.dao.upsertDataKey(new HatchOfflineKeyEntity(1, wrap(bArr2)));
        return BV4.A17(bArr2);
    }

    private final SecretKey loadWrappingKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, UnrecoverableEntryException {
        KeyStore.SecretKeyEntry secretKeyEntry;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(HatchOfflineConversationCipherKt.KEY_ALIAS, null);
        if (!(entry instanceof KeyStore.SecretKeyEntry) || (secretKeyEntry = (KeyStore.SecretKeyEntry) entry) == null) {
            return null;
        }
        return secretKeyEntry.getSecretKey();
    }

    private final SecretKey unwrap(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, requireWrappingKey(), new GCMParameterSpec(128, bArr, 0, 12));
        return BV4.A17(cipher.doFinal(bArr, 12, bArr.length - 12));
    }

    private final byte[] wrap(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, getOrCreateWrappingKey());
        byte[] iv = cipher.getIV();
        C7384Etj.A0U(iv);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        C7384Etj.A0U(bArrDoFinal);
        return AbstractC0903AHf.A07(iv, bArrDoFinal);
    }

    public final void onUserDataCleared() {
        synchronized (this.dataKeyLock) {
            this.dataKey = null;
            this.keyUnavailable = false;
        }
    }

    private final SecretKey getOrCreateWrappingKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        SecretKey secretKeyLoadWrappingKey = loadWrappingKey();
        if (secretKeyLoadWrappingKey != null) {
            return secretKeyLoadWrappingKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES, "AndroidKeyStore");
        keyGenerator.init(BV8.A0X(new KeyGenParameterSpec.Builder(HatchOfflineConversationCipherKt.KEY_ALIAS, 3)).build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        C7384Etj.A0U(secretKeyGenerateKey);
        return secretKeyGenerateKey;
    }

    private final SecretKey requireWrappingKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, UnrecoverableEntryException {
        SecretKey secretKeyLoadWrappingKey = loadWrappingKey();
        if (secretKeyLoadWrappingKey != null) {
            return secretKeyLoadWrappingKey;
        }
        throw C3cG.A0Q("Offline conversation key not found");
    }
}

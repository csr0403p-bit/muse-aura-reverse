package com.facebook.aura.hatchlockcrypto;

import X.AbstractC0903AHf;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BV5;
import X.BV8;
import X.C60P;
import X.C7384Etj;
import android.security.keystore.KeyGenParameterSpec;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes5.dex */
public final class HatchBiometricPassphraseEncryptor {
    public static final int GCM_IV_LENGTH_BYTES = 12;
    public static final int GCM_TAG_LENGTH_BITS = 128;
    public static final HatchBiometricPassphraseEncryptor INSTANCE = new HatchBiometricPassphraseEncryptor();
    public static final int KEY_SIZE = 256;
    public static final String TRANSFORMATION = "AES/GCM/NoPadding";

    public final Cipher getEncryptCipher(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        C7384Etj.A0Y(str, 0);
        SecretKey orCreateKey = getOrCreateKey(str);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, orCreateKey);
        return cipher;
    }

    public final SecretKey getOrCreateKey(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SecretKey secretKeyGenerateKey;
        C7384Etj.A0Y(str, 0);
        KeyStore.Entry entryA19 = BV8.A19(str);
        if (entryA19 instanceof KeyStore.SecretKeyEntry) {
            secretKeyGenerateKey = ((KeyStore.SecretKeyEntry) entryA19).getSecretKey();
        } else {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES, "AndroidKeyStore");
            keyGenerator.init(BV8.A0X(new KeyGenParameterSpec.Builder(str, 3)).setUserAuthenticationRequired(true).setUserAuthenticationParameters(30, 3).build());
            secretKeyGenerateKey = keyGenerator.generateKey();
        }
        C7384Etj.A0U(secretKeyGenerateKey);
        return secretKeyGenerateKey;
    }

    public final Cipher getUninitializedDecryptCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        C7384Etj.A0U(cipher);
        return cipher;
    }

    public final Cipher getUninitializedEncryptCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        C7384Etj.A0U(cipher);
        return cipher;
    }

    public final byte[] decrypt(Cipher cipher, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        AnonymousClass003.A0u(cipher, bArr);
        byte[] bArrDoFinal = cipher.doFinal(AbstractC0903AHf.A06(bArr, 12, bArr.length));
        C7384Etj.A0U(bArrDoFinal);
        return bArrDoFinal;
    }

    public final byte[] encrypt(Cipher cipher, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        AnonymousClass003.A0u(cipher, bArr);
        byte[] iv = cipher.getIV();
        C7384Etj.A0U(iv);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        C7384Etj.A0U(bArrDoFinal);
        return AbstractC0903AHf.A07(iv, bArrDoFinal);
    }

    public final Cipher getDecryptCipher(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        KeyStore.SecretKeyEntry secretKeyEntry;
        boolean zA1b = AnonymousClass004.A1b(str, bArr);
        KeyStore.Entry entryA19 = BV8.A19(str);
        if (!(entryA19 instanceof KeyStore.SecretKeyEntry) || (secretKeyEntry = (KeyStore.SecretKeyEntry) entryA19) == null) {
            throw BV5.A0U("Key not found: ", str);
        }
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeyEntry.getSecretKey(), new GCMParameterSpec(128, AbstractC0903AHf.A06(bArr, zA1b ? 1 : 0, 12)));
        return cipher;
    }

    public final void initDecryptCipher(Cipher cipher, String str, byte[] bArr) throws NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        KeyStore.SecretKeyEntry secretKeyEntry;
        boolean zA1b = AnonymousClass004.A1b(cipher, str);
        C7384Etj.A0Y(bArr, 2);
        KeyStore.Entry entryA19 = BV8.A19(str);
        if (!(entryA19 instanceof KeyStore.SecretKeyEntry) || (secretKeyEntry = (KeyStore.SecretKeyEntry) entryA19) == null) {
            throw BV5.A0U("Key not found: ", str);
        }
        cipher.init(2, secretKeyEntry.getSecretKey(), new GCMParameterSpec(128, AbstractC0903AHf.A06(bArr, zA1b ? 1 : 0, 12)));
    }

    public final void initEncryptCipher(Cipher cipher, String str) throws NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        boolean zA1Y = C60P.A1Y(cipher, str);
        cipher.init(zA1Y ? 1 : 0, getOrCreateKey(str));
    }
}

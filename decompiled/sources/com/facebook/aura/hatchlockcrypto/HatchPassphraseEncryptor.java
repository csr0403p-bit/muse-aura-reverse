package com.facebook.aura.hatchlockcrypto;

import X.AbstractC0903AHf;
import X.AnonymousClass004;
import X.BV5;
import X.BV8;
import X.C60P;
import X.C7384Etj;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.StrongBoxUnavailableException;
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
public final class HatchPassphraseEncryptor {
    public static final int GCM_IV_LENGTH_BYTES = 12;
    public static final int GCM_TAG_LENGTH_BITS = 128;
    public static final HatchPassphraseEncryptor INSTANCE = new HatchPassphraseEncryptor();
    public static final int KEY_SIZE = 256;
    public static final String TRANSFORMATION = "AES/GCM/NoPadding";

    private final SecretKey generateKey(String str, boolean z) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES, "AndroidKeyStore");
        keyGenerator.init(BV8.A0X(new KeyGenParameterSpec.Builder(str, 3)).setIsStrongBoxBacked(z).build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        C7384Etj.A0U(secretKeyGenerateKey);
        return secretKeyGenerateKey;
    }

    private final SecretKey getOrCreateKey(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore.Entry entryA19 = BV8.A19(str);
        if (!(entryA19 instanceof KeyStore.SecretKeyEntry)) {
            try {
                return generateKey(str, true);
            } catch (StrongBoxUnavailableException unused) {
                return generateKey(str, false);
            }
        }
        SecretKey secretKey = ((KeyStore.SecretKeyEntry) entryA19).getSecretKey();
        C7384Etj.A0U(secretKey);
        return secretKey;
    }

    public final byte[] decrypt(String str, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        KeyStore.SecretKeyEntry secretKeyEntry;
        boolean zA1b = AnonymousClass004.A1b(str, bArr);
        KeyStore.Entry entryA19 = BV8.A19(str);
        if (!(entryA19 instanceof KeyStore.SecretKeyEntry) || (secretKeyEntry = (KeyStore.SecretKeyEntry) entryA19) == null) {
            throw BV5.A0U("Key not found: ", str);
        }
        byte[] bArrA06 = AbstractC0903AHf.A06(bArr, zA1b ? 1 : 0, 12);
        byte[] bArrA062 = AbstractC0903AHf.A06(bArr, 12, bArr.length);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeyEntry.getSecretKey(), new GCMParameterSpec(128, bArrA06));
        byte[] bArrDoFinal = cipher.doFinal(bArrA062);
        C7384Etj.A0U(bArrDoFinal);
        return bArrDoFinal;
    }

    public final byte[] encrypt(String str, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException {
        boolean zA1Y = C60P.A1Y(str, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(zA1Y ? 1 : 0, getOrCreateKey(str));
        byte[] iv = cipher.getIV();
        C7384Etj.A0U(iv);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        C7384Etj.A0U(bArrDoFinal);
        return AbstractC0903AHf.A07(iv, bArrDoFinal);
    }
}

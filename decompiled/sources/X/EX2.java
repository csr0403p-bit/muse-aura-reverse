package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes5.dex */
public abstract class EX2 {
    public static BiometricPrompt.CryptoObject A00(EX8 ex8) {
        IdentityCredential identityCredentialA00;
        if (ex8 == null) {
            return null;
        }
        Cipher cipher = ex8.A01;
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = ex8.A00;
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = ex8.A02;
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialA00 = ex8.A00()) == null) {
            return null;
        }
        return EXD.A00(identityCredentialA00);
    }

    public static EX8 A01() throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES, "AndroidKeyStore");
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            Key key = keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, key);
            return new EX8(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }
}

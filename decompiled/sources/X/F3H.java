package X;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.StrongBoxUnavailableException;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;

/* loaded from: classes5.dex */
public final class F3H {
    public final Context A00;
    public final KeyStore A01;

    public static final KeyPair A00(F3V f3v, Integer num) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(f3v.A01, 12);
        Integer num2 = C79.A00;
        KeyGenParameterSpec.Builder digests = builder.setKeySize(num == num2 ? 256 : 2048).setCertificateSerialNumber(f3v.A02).setCertificateSubject(f3v.A05).setCertificateNotBefore(f3v.A04).setCertificateNotAfter(f3v.A03).setUserAuthenticationRequired(f3v.A06).setDigests(ConfidentialVmPinVerifierCrypto.SHA_256);
        if (num == num2) {
            digests.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"));
        } else {
            digests.setSignaturePaddings("PKCS1");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            A01(digests, f3v);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = digests.build();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(num == C79.A0C ? "RSA" : "EC", "AndroidKeyStore");
        keyPairGenerator.initialize(keyGenParameterSpecBuild);
        try {
            return keyPairGenerator.generateKeyPair();
        } catch (ProviderException e) {
            if (e instanceof StrongBoxUnavailableException) {
                throw e;
            }
            throw new InvalidAlgorithmParameterException("Android KeyStore failed to generate key pair", e);
        }
    }

    public static void A01(KeyGenParameterSpec.Builder builder, F3V f3v) {
        if (f3v.A06) {
            builder.setUserAuthenticationParameters(f3v.A00, 2);
        }
    }

    public F3H(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            context.getMainExecutor().execute(new RunnableC7553F3e());
        } catch (Exception unused) {
        }
        this.A00 = context;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        this.A01 = keyStore;
    }
}

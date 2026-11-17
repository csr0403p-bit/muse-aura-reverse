package X;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* loaded from: classes5.dex */
public abstract class EXD {
    public static BiometricPrompt.CryptoObject A00(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential A01(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}

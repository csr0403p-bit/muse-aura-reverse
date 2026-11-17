package X;

import android.security.keystore.KeyGenParameterSpec;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes5.dex */
public final class EX3 {
    public static final Object A00 = C3cG.A0T();

    public static boolean A00(String keyUri) throws GeneralSecurityException {
        boolean z;
        synchronized (A00) {
            if (!keyUri.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                throw BV5.A0T("key URI must start with %s", new Object[]{"android-keystore://"});
            }
            String strSubstring = keyUri.substring("android-keystore://".length());
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.containsAlias(strSubstring)) {
                    z = false;
                } else {
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strSubstring, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES, "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                    z = true;
                }
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return z;
    }

    public final EX4 A01(String uri) throws GeneralSecurityException {
        EX4 ex4;
        try {
            synchronized (A00) {
                if (!uri.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                    throw BV5.A0T("key URI must start with %s", new Object[]{"android-keystore://"});
                }
                ex4 = new EX4(uri.substring("android-keystore://".length()));
                byte[] bArrA00 = EXH.A00(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(bArrA00, ex4.A8i(ex4.AAW(bArrA00, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return ex4;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}

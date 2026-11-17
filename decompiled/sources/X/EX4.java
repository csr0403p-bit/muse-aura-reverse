package X;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* loaded from: classes5.dex */
public final class EX4 implements EX9 {
    public final EX9 A00;

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws BadPaddingException, InterruptedException {
        try {
            return this.A00.A8i(ciphertext, associatedData);
        } catch (BadPaddingException e) {
            throw e;
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e2);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return this.A00.A8i(ciphertext, associatedData);
        }
    }

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws InterruptedException {
        try {
            return this.A00.AAW(plaintext, associatedData);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return this.A00.AAW(plaintext, associatedData);
        }
    }

    public EX4(String keyId) throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.A00 = new EX5(keyId, keyStore);
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}

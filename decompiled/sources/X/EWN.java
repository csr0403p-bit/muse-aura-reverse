package X;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

@Deprecated
/* loaded from: classes5.dex */
public final class EWN {
    public final KeyGenParameterSpec A00;
    public final String A01;

    public final String toString() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        boolean zContainsAlias;
        String str = this.A01;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            zContainsAlias = keyStore.containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            zContainsAlias = false;
        }
        return FGI.A0n("MasterKey{keyAlias=", str, ", isKeyStoreBacked=", "}", zContainsAlias);
    }

    public EWN(String str, Object obj) {
        this.A01 = str;
        this.A00 = (KeyGenParameterSpec) obj;
    }
}

package X;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class EW0 {
    public static EW0 A02;
    public final KeyStore A00;
    public final HashMap<Principal, X509Certificate> A01;

    public EW0() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            keyStore.load(null, null);
            try {
                HashMap<Principal, X509Certificate> mapA0u = BV4.A0u();
                Enumeration<String> enumerationAliases = keyStore.aliases();
                while (enumerationAliases.hasMoreElements()) {
                    X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(enumerationAliases.nextElement());
                    if (x509Certificate != null) {
                        mapA0u.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                    }
                }
                this.A01 = mapA0u;
                this.A00 = keyStore;
            } catch (KeyStoreException e) {
                throw BV4.A0N(e);
            }
        } catch (FileNotFoundException e2) {
            throw BV4.A0N(e2);
        } catch (IOException e3) {
            throw BV4.A0N(e3);
        } catch (KeyStoreException e4) {
            throw BV4.A0N(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw BV4.A0N(e5);
        } catch (CertificateException e6) {
            throw BV4.A0N(e6);
        }
    }
}

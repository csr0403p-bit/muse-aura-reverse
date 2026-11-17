package X;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes5.dex */
public final class EZU extends EZT {
    public static final C6782EZr A01;
    public static final boolean A02;
    public final Provider A00;

    @Override // X.EZT
    public final String A03(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<LX/Ec1;>;)V */
    @Override // X.EZT
    public final void A08(String str, List list, SSLSocket sSLSocket) {
        AnonymousClass002.A1A(sSLSocket, 0, list);
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = AbstractC6773EZh.A00(list).toArray(new String[0]);
            if (array == null) {
                throw BV6.A0h();
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    static {
        C6782EZr c6782EZr = new C6782EZr();
        A01 = c6782EZr;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, c6782EZr.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (C6782EZr.A00()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        A02 = z;
    }

    public EZU() {
        Provider providerNewProvider = Conscrypt.newProvider();
        C7384Etj.A0U(providerNewProvider);
        this.A00 = providerNewProvider;
    }

    @Override // X.EZT
    public final X509TrustManager A05() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C7384Etj.A0X(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw BV4.A0a("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C6783EZs.A00);
                return x509TrustManager;
            }
        }
        throw EZT.A00(trustManagers);
    }
}

package X;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

/* loaded from: classes5.dex */
public final class EWW extends X509ExtendedTrustManager implements EWZ {
    public final EWX A00;

    public EWW() {
        EW0 ew0;
        synchronized (EW0.class) {
            ew0 = EW0.A02;
            if (ew0 == null) {
                ew0 = new EW0();
                EW0.A02 = ew0;
            }
        }
        this.A00 = new EWX(ew0);
    }

    @Override // X.EWY
    public final void A6B(String str, String str2, X509Certificate[] x509CertificateArr) {
        this.A00.A6B(str, str2, x509CertificateArr);
    }

    @Override // X.EWZ
    public final void A6C(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        this.A00.A6C(str, str2, x509CertificateArr, z);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.A00.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.A00.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        EWX ewx = this.A00;
        ((X509ExtendedTrustManager) ewx.A03).checkServerTrusted(x509CertificateArr, str, socket);
        ewx.A02(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        EWX ewx = this.A00;
        ((X509ExtendedTrustManager) ewx.A03).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        ewx.A02(x509CertificateArr);
    }
}

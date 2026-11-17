package X;

import android.os.Trace;
import com.facebook.acra.util.HttpConnectionProvider;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* loaded from: classes5.dex */
public final class CCY implements HttpConnectionProvider {
    public CCb A00;

    @Override // com.facebook.acra.util.HttpConnectionProvider
    public final HttpURLConnection getConnection(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            Trace.beginSection("PinnedSSLConnectionProvider.configureSocketFactory");
            try {
                CCb cCb = this.A00;
                if (cCb == null) {
                    cCb = new CCb();
                    this.A00 = cCb;
                }
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, cCb.A00, null);
                    httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                } catch (KeyManagementException | NoSuchAlgorithmException e) {
                    CFK.A0A(C9Y.TAG, "Pinning failed", e);
                    C2Q.A00().AT9("SocketFactory", e, null);
                }
            } finally {
                Trace.endSection();
            }
        }
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        return httpURLConnection;
    }
}

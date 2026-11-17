package X;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes5.dex */
public final class EWX extends EWR implements EWZ {
    public final X509TrustManagerExtensions A00;

    @Override // X.EWY
    public final void A6B(String str, String str2, X509Certificate[] x509CertificateArr) {
        A01(this.A00.checkServerTrusted(x509CertificateArr, str, str2));
    }

    @Override // X.EWZ
    public final void A6C(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        List<X509Certificate> listCheckServerTrusted = this.A00.checkServerTrusted(x509CertificateArr, str, str2);
        if (z) {
            A01(listCheckServerTrusted);
        }
    }

    public EWX(EW0 ew0) {
        super(ew0);
        this.A00 = new X509TrustManagerExtensions(this.A03);
    }

    public EWX() {
        this(null);
    }
}

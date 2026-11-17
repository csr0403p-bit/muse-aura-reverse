package X;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.EZc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6768EZc extends AbstractC6792Ea1 {
    public final X509TrustManagerExtensions A00;
    public final X509TrustManager A01;

    public final boolean equals(Object obj) {
        return (obj instanceof C6768EZc) && ((C6768EZc) obj).A01 == this.A01;
    }

    public final int hashCode() {
        return System.identityHashCode(this.A01);
    }

    public C6768EZc(X509TrustManagerExtensions x509TrustManagerExtensions, X509TrustManager x509TrustManager) {
        this.A01 = x509TrustManager;
        this.A00 = x509TrustManagerExtensions;
    }
}

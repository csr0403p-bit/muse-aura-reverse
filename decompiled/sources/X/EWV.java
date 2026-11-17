package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public final class EWV implements InterfaceC6781EZq {
    public final Method A00;
    public final X509TrustManager A01;

    @Override // X.InterfaceC6781EZq
    public final X509Certificate ABR(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C7384Etj.A0Y(x509Certificate, 0);
        try {
            Object objInvoke = this.A00.invoke(this.A01, x509Certificate);
            if (objInvoke != null) {
                return ((TrustAnchor) objInvoke).getTrustedCert();
            }
            throw BV4.A0a("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e) {
            throw Bb9.A00("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EWV) {
                EWV ewv = (EWV) obj;
                if (!this.A01.equals(ewv.A01) || !this.A00.equals(ewv.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CustomTrustRootIndex(trustManager=");
        sbA0x.append(this.A01);
        sbA0x.append(", findByIssuerAndSignatureMethod=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public EWV(Method method, X509TrustManager x509TrustManager) {
        this.A01 = x509TrustManager;
        this.A00 = method;
    }
}

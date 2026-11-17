package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes5.dex */
public final class EWU implements InterfaceC6781EZq {
    public final Map<X500Principal, Set<X509Certificate>> A00;

    public EWU(X509Certificate... x509CertificateArr) {
        C7384Etj.A0Y(x509CertificateArr, 0);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        int length = x509CertificateArr.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C7384Etj.A0U(subjectX500Principal);
            Object objA0k = linkedHashMapA0j.get(subjectX500Principal);
            if (objA0k == null) {
                objA0k = C3cG.A0k();
                linkedHashMapA0j.put(subjectX500Principal, objA0k);
            }
            ((Set) objA0k).add(x509Certificate);
        }
        this.A00 = linkedHashMapA0j;
    }

    @Override // X.InterfaceC6781EZq
    public final X509Certificate ABR(X509Certificate x509Certificate) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        C7384Etj.A0Y(x509Certificate, 0);
        Set setA10 = BV4.A10(x509Certificate.getIssuerX500Principal(), this.A00);
        Object obj = null;
        if (setA10 == null) {
            return null;
        }
        for (Object obj2 : setA10) {
            try {
                x509Certificate.verify(((Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof EWU) && ((EWU) obj).A00.equals(this.A00);
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

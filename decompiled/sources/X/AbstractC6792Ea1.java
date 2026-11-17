package X;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: X.Ea1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6792Ea1 {
    public final List<Certificate> A00(List<? extends Certificate> list, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        if (!(this instanceof EZX)) {
            C6768EZc c6768EZc = (C6768EZc) this;
            Object[] array = list.toArray(new X509Certificate[AnonymousClass004.A1b(list, str)]);
            if (array == null) {
                throw BV6.A0h();
            }
            try {
                List<X509Certificate> listCheckServerTrusted = c6768EZc.A00.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                C7384Etj.A0U(listCheckServerTrusted);
                return listCheckServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        }
        EZX ezx = (EZX) this;
        C7384Etj.A0Y(list, 0);
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayListA0h = C3cG.A0h();
        Object objRemoveFirst = arrayDeque.removeFirst();
        C7384Etj.A0U(objRemoveFirst);
        arrayListA0h.add(objRemoveFirst);
        int i = 0;
        boolean z = false;
        do {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayListA0h.get(arrayListA0h.size() - 1);
            X509Certificate x509CertificateABR = ezx.A00.ABR(x509Certificate);
            if (x509CertificateABR == null) {
                Iterator itA0N = C7384Etj.A0N(arrayDeque);
                while (itA0N.hasNext()) {
                    Object next = itA0N.next();
                    if (next == null) {
                        throw BV4.A0a("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    boolean z2 = false;
                    if (C7384Etj.areEqual(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            z2 = true;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                    if (z2) {
                        itA0N.remove();
                        arrayListA0h.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException(AnonymousClass006.A0y(x509Certificate, "Failed to find a trusted cert that signed ", C60O.A0w()));
                }
                return arrayListA0h;
            }
            if (arrayListA0h.size() > 1 || !C7384Etj.areEqual(x509Certificate, x509CertificateABR)) {
                arrayListA0h.add(x509CertificateABR);
            }
            boolean z3 = false;
            if (C7384Etj.areEqual(x509CertificateABR.getIssuerDN(), x509CertificateABR.getSubjectDN())) {
                try {
                    x509CertificateABR.verify(x509CertificateABR.getPublicKey());
                    z3 = true;
                } catch (GeneralSecurityException unused2) {
                }
            }
            if (z3) {
                return arrayListA0h;
            }
            z = true;
        } while (i < 9);
        throw new SSLPeerUnverifiedException(AnonymousClass006.A0y(arrayListA0h, "Certificate chain too long: ", C60O.A0w()));
    }
}

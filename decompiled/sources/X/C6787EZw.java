package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;

/* renamed from: X.EZw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6787EZw {
    public static final C6787EZw A02 = new C6787EZw(AbstractC0878AGe.A0g(C3cG.A0h()), null);
    public final Set A00;
    public final AbstractC6792Ea1 A01;

    public C6787EZw(Set set, AbstractC6792Ea1 abstractC6792Ea1) {
        C7384Etj.A0Y(set, 0);
        this.A00 = set;
        this.A01 = abstractC6792Ea1;
    }

    public static final String A00(Certificate certificate) throws NoSuchAlgorithmException {
        C7384Etj.A0Y(certificate, 0);
        if (!(certificate instanceof X509Certificate)) {
            throw C60O.A0i("Certificate pinning requires X509 certificates");
        }
        byte[] encoded = certificate.getPublicKey().getEncoded();
        C7384Etj.A0U(encoded);
        int length = encoded.length;
        long j = length;
        AbstractC6789EZy.A01(j, 0L, j);
        C6788EZx c6788EZx = new C6788EZx(AbstractC0903AHf.A06(encoded, 0, length));
        MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
        messageDigest.update(c6788EZx.data, 0, c6788EZx.A0C());
        byte[] bArrDigest = messageDigest.digest();
        C7384Etj.A0X(bArrDigest);
        return AnonymousClass006.A0y(new C6788EZx(bArrDigest).A05(), "sha256/", C60O.A0w());
    }

    public final void A01(String str, Function0<? extends List<? extends X509Certificate>> function0) throws SSLPeerUnverifiedException {
        Set set = this.A00;
        C0881AGi c0881AGi = C0881AGi.A00;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("matchesHostname");
        }
        if (c0881AGi.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = function0.invoke();
        Iterator<? extends X509Certificate> it2 = listInvoke.iterator();
        while (it2.hasNext()) {
            it2.next();
            Iterator it3 = c0881AGi.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw BV4.A0a("getHashAlgorithm");
            }
        }
        StringBuilder sbA0x = C60O.A0x("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate : listInvoke) {
            sbA0x.append("\n    ");
            sbA0x.append(A00(x509Certificate));
            sbA0x.append(": ");
            sbA0x.append(x509Certificate.getSubjectDN().getName());
        }
        sbA0x.append("\n  Pinned certificates for ");
        sbA0x.append(str);
        sbA0x.append(":");
        Iterator it4 = c0881AGi.iterator();
        while (it4.hasNext()) {
            it4.next();
            sbA0x.append("\n    ");
            sbA0x.append((Object) null);
        }
        throw new SSLPeerUnverifiedException(sbA0x.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6787EZw) {
            C6787EZw c6787EZw = (C6787EZw) obj;
            if (c6787EZw.A00.equals(this.A00) && C7384Etj.areEqual(c6787EZw.A01, this.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((1517 + this.A00.hashCode()) * 41) + C60R.A01(this.A01);
    }
}

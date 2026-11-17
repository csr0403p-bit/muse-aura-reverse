package X;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: X.EEu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6558EEu implements HostnameVerifier {
    public final boolean A01(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        boolean z;
        int length;
        int length2;
        boolean zA1a = AnonymousClass002.A1a(str, x509Certificate);
        if (AbstractC6556EEs.A00.A08(str)) {
            List<String> listA00 = A00(x509Certificate, 7);
            String strA00 = AbstractC6556EEs.A00(str);
            z = false;
            if (!(listA00 instanceof Collection) || !listA00.isEmpty()) {
                Iterator<String> it = listA00.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(strA00, AbstractC6556EEs.A00(it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            List<String> listA002 = A00(x509Certificate, 2);
            if (AbstractC6556EEs.A02(str)) {
                str = C60Q.A0g(str);
            }
            z = false;
            if ((listA002 instanceof Collection) && listA002.isEmpty()) {
                return false;
            }
            Iterator<String> it2 = listA002.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                String strA0M = str;
                if (str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && next != null && next.length() != 0 && !next.startsWith(".") && !next.endsWith("..")) {
                    if (!str.endsWith(".")) {
                        strA0M = FGI.A0M(str, ".");
                    }
                    if (!next.endsWith(".")) {
                        next = FGI.A0M(next, ".");
                    }
                    if (AbstractC6556EEs.A02(next)) {
                        Locale locale = Locale.US;
                        C7384Etj.A0V(locale);
                        next = next.toLowerCase(locale);
                    }
                    if (C7BY.A0q(next, "*", false)) {
                        if (next.startsWith("*.") && C7BY.A08(next, '*', zA1a ? 1 : 0) == -1 && (length = strA0M.length()) >= next.length() && !"*.".equals(next)) {
                            String strSubstring = next.substring(zA1a ? 1 : 0);
                            if (strA0M.endsWith(strSubstring) && ((length2 = length - strSubstring.length()) <= 0 || C7BY.A09(strA0M, '.', length2 - 1) == -1)) {
                                return true;
                            }
                        }
                    } else if (strA0M.equals(next)) {
                        return true;
                    }
                }
            }
        }
        return z;
    }

    public static final List<String> A00(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C0881AGi.A00;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && C7384Etj.areEqual(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayListA0h.add(obj);
                }
            }
            return arrayListA0h;
        } catch (CertificateParsingException unused) {
            return C0881AGi.A00;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean zA1b = AnonymousClass004.A1b(str, sSLSession);
        if (!AbstractC6556EEs.A02(str)) {
            return zA1b;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[zA1b ? 1 : 0];
            C7384Etj.A0Z(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return A01(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return zA1b;
        }
    }
}

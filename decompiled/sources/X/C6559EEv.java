package X;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: X.EEv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6559EEv implements HostnameVerifier {
    public static final C6559EEv A00 = new C6559EEv();

    public final boolean A02(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        boolean z;
        int length;
        int length2;
        C7384Etj.A0Y(x509Certificate, 1);
        if (AbstractC6843Eav.A02.A08(str)) {
            String strA00 = AbstractC6557EEt.A00(str);
            List<String> listA00 = A00(x509Certificate, 7);
            z = false;
            if (!(listA00 instanceof Collection) || !listA00.isEmpty()) {
                Iterator<String> it = listA00.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(strA00, AbstractC6557EEt.A00(AnonymousClass005.A0j(it)))) {
                        return true;
                    }
                }
            }
        } else {
            if (A01(str)) {
                str = C60Q.A0g(str);
            }
            List<String> listA002 = A00(x509Certificate, 2);
            z = false;
            if ((listA002 instanceof Collection) && listA002.isEmpty()) {
                return false;
            }
            Iterator<String> it2 = listA002.iterator();
            while (it2.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it2);
                String strA0y = str;
                if (str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && strA0j != null && strA0j.length() != 0 && !strA0j.startsWith(".") && !strA0j.endsWith("..")) {
                    if (!str.endsWith(".")) {
                        strA0y = AnonymousClass006.A0y(".", str, C60O.A0w());
                    }
                    if (!strA0j.endsWith(".")) {
                        strA0j = AnonymousClass006.A0y(".", strA0j, C60O.A0w());
                    }
                    if (A01(strA0j)) {
                        strA0j = C60Q.A0g(strA0j);
                    }
                    if (C7BY.A0q(strA0j, "*", false)) {
                        if (AnonymousClass005.A1a(strA0j, "*.") && C7BY.A08(strA0j, '*', 1) == -1 && (length = strA0y.length()) >= strA0j.length() && !"*.".equals(strA0j)) {
                            String strSubstring = strA0j.substring(1);
                            if (strA0y.endsWith(strSubstring) && ((length2 = length - strSubstring.length()) <= 0 || C7BY.A09(strA0y, '.', length2 - 1) == -1)) {
                                return true;
                            }
                        }
                    } else if (C7384Etj.areEqual(strA0y, strA0j)) {
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
                if (list != null && list.size() >= 2 && C7384Etj.areEqual(C8j4.A0p(list), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayListA0h.add(obj);
                }
            }
            return arrayListA0h;
        } catch (CertificateParsingException unused) {
            return C0881AGi.A00;
        }
    }

    public static final boolean A01(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        if (length < 0) {
            throw C8j3.A0v("endIndex < beginIndex: ", " < ", length, 0);
        }
        if (length > length) {
            throw C60O.A0i(FGI.A0T("endIndex > string.length: ", " > ", length, length));
        }
        long j = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            long j2 = 1;
            if (cCharAt >= '\u0080') {
                if (cCharAt < '\u0800') {
                    i = 2;
                } else if (cCharAt < '\ud800' || cCharAt > '\udfff') {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (cCharAt > '\udbff' || cCharAt2 < '\udc00' || cCharAt2 > '\udfff') {
                        j++;
                        i2 = i3;
                    } else {
                        j += 4;
                        i2 += 2;
                    }
                }
                j2 = i;
            }
            j += j2;
            i2++;
        }
        return length == ((int) j);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean zA1b = AnonymousClass004.A1b(str, sSLSession);
        if (!A01(str)) {
            return zA1b;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[zA1b ? 1 : 0];
            if (certificate != null) {
                return A02(str, (X509Certificate) certificate);
            }
            throw BV4.A0a("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}

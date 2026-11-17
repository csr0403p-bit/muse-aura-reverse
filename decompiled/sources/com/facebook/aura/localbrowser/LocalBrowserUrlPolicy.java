package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes3.dex */
public final class LocalBrowserUrlPolicy {
    public static final int $stable = 0;
    public static final LocalBrowserUrlPolicy INSTANCE = new LocalBrowserUrlPolicy();

    public final String host(String str) {
        String host;
        C7384Etj.A0Y(str, 0);
        String strNavigationUrl = navigationUrl(str);
        if (strNavigationUrl != null && (host = new URI(strNavigationUrl).getHost()) != null) {
            String strA0u = AnonymousClass001.A0u(host);
            if (strA0u.length() > 0) {
                return strA0u;
            }
        }
        return null;
    }

    public final String httpsUpgrade(String str) {
        URI uri;
        C7384Etj.A0Y(str, 0);
        if (!AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, str)) {
            return null;
        }
        try {
            uri = new URI(str);
            if (uri.getPort() != -1 && uri.getPort() != 80) {
                uri = null;
            }
        } catch (URISyntaxException unused) {
        }
        String rawAuthority = uri != null ? uri.getRawAuthority() : null;
        if (rawAuthority == null) {
            return null;
        }
        String strSubstring = str.substring(7);
        if (strSubstring.startsWith(rawAuthority)) {
            return navigationUrl(FGI.A0U("https://", C7BY.A0L(":80", rawAuthority), strSubstring.substring(rawAuthority.length())));
        }
        return null;
    }

    public final String navigationUrl(String str) {
        String host;
        int port;
        C7384Etj.A0Y(str, 0);
        if (str.equals("about:blank")) {
            return str;
        }
        int length = str.length();
        if (length <= 8192) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    try {
                        URI uri = new URI(str);
                        String scheme = uri.getScheme();
                        if ((scheme == null ? false : scheme.equalsIgnoreCase("https")) && !uri.isOpaque() && (host = uri.getHost()) != null && host.length() != 0 && uri.getRawUserInfo() == null && (uri.getPort() == -1 || (1 <= (port = uri.getPort()) && port < 65536))) {
                            return uri.toASCIIString();
                        }
                    } catch (URISyntaxException unused) {
                    }
                } else {
                    char cCharAt = str.charAt(i);
                    if (cCharAt <= ' ' || cCharAt == '\\') {
                        break;
                    }
                    i++;
                }
            }
        }
        return null;
    }
}

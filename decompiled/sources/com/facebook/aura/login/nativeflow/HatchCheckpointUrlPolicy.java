package com.facebook.aura.login.nativeflow;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import android.net.Uri;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import com.facebook.aura.network.sandbox.AuraSandbox;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchCheckpointUrlPolicy {
    public static final String AUTH_HOST = "auth.meta.com";
    public static final int HTTPS_PORT = 443;
    public static final String HTTPS_SCHEME = "https";
    public static final String META_AI_CHECKPOINT_PATH = "/checkpoints/";
    public static final String META_AI_HOST = "www.meta.ai";
    public static final String OD_AUTH_SUFFIX = ".od.auth.meta.com";
    public static final HatchCheckpointUrlPolicy INSTANCE = new HatchCheckpointUrlPolicy();
    public static final Set<String> TRUSTED_WEB_DOMAINS = C60O.A1B("meta.com", AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX, "fb.com", "instagram.com");
    public static final Set<String> LINK_SHIM_LABELS = C60O.A19("l", "lm");

    public final boolean isTrustedAuthNavigation(String str) {
        C7384Etj.A0Y(str, 0);
        Uri uriTrustedHttpsUri = trustedHttpsUri(str);
        if (uriTrustedHttpsUri == null) {
            return false;
        }
        String host = uriTrustedHttpsUri.getHost();
        if (host == null) {
            host = "";
        }
        return isTrustedAuthHost(host);
    }

    public final boolean isTrustedWebNavigation(String str) {
        String strA0S;
        C7384Etj.A0Y(str, 0);
        Uri uriTrustedHttpsUri = trustedHttpsUri(str);
        if (uriTrustedHttpsUri != null) {
            if (!isMetaAiCheckpoint(uriTrustedHttpsUri)) {
                String host = uriTrustedHttpsUri.getHost();
                String strA0u = null;
                if (host != null && (strA0S = C7BY.A0S(host, host, '.')) != null) {
                    strA0u = AnonymousClass001.A0u(strA0S);
                }
                if (!AbstractC0878AGe.A0k(LINK_SHIM_LABELS, strA0u)) {
                    Set<String> set = TRUSTED_WEB_DOMAINS;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<String> it = set.iterator();
                        while (it.hasNext()) {
                            if (C7Je.A05(uriTrustedHttpsUri, AnonymousClass005.A0j(it), true)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final String sanitizedInitialUrl(String str) {
        C7384Etj.A0Y(str, 0);
        Uri uriTrustedHttpsUri = trustedHttpsUri(str);
        if (uriTrustedHttpsUri != null) {
            HatchCheckpointUrlPolicy hatchCheckpointUrlPolicy = INSTANCE;
            String host = uriTrustedHttpsUri.getHost();
            if (host == null) {
                host = "";
            }
            if (hatchCheckpointUrlPolicy.isTrustedAuthHost(host) || hatchCheckpointUrlPolicy.isMetaAiCheckpoint(uriTrustedHttpsUri)) {
                return str;
            }
        }
        return null;
    }

    private final boolean isMetaAiCheckpoint(Uri uri) {
        String host;
        String path = uri.getPath();
        if (path != null && (host = uri.getHost()) != null && host.equalsIgnoreCase(META_AI_HOST) && path.startsWith(META_AI_CHECKPOINT_PATH)) {
            List listA0h = C7BY.A0h(path, new char[1], '/');
            if (!(listA0h instanceof Collection) || !listA0h.isEmpty()) {
                for (Object obj : listA0h) {
                    if (".".equals(obj) || "..".equals(obj)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final boolean isTrustedAuthHost(String str) {
        String strA0u = AnonymousClass001.A0u(str);
        if (!strA0u.equals(AUTH_HOST)) {
            if (AuraSandbox.INSTANCE.isHttpSandboxEnabled() && strA0u.endsWith(OD_AUTH_SUFFIX)) {
                String strA0L = C7BY.A0L(OD_AUTH_SUFFIX, strA0u);
                if (strA0L.length() <= 0 || C7BY.A0k(strA0L, '.')) {
                }
            }
            return false;
        }
        return true;
    }

    private final Uri trustedHttpsUri(String str) {
        String host;
        if (!C7BY.A0j(str)) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null && "https".equalsIgnoreCase(uriA01.getScheme()) && uriA01.getUserInfo() == null && ((uriA01.getPort() == -1 || uriA01.getPort() == 443) && (host = uriA01.getHost()) != null && !C7BY.A0j(host))) {
                return uriA01;
            }
        }
        return null;
    }

    public final String sanitizedResumeToken(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        if (C7BY.A0j(str2) || !INSTANCE.isTrustedAuthNavigation(str)) {
            return null;
        }
        return str2;
    }
}

package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFI;
import X.C10571Hud;
import X.C3cG;
import X.C60N;
import X.C7384Etj;
import X.C7BY;
import X.Ey9;
import X.FGI;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes4.dex */
public final class CustomConnectorOAuthValidator {
    public static final CustomConnectorOAuthValidator INSTANCE = new CustomConnectorOAuthValidator();
    public static final Set<String> sensitiveQueryKeys = BFI.A0H(new String[]{"client_secret", "client_assertion", "assertion", AuraDeeplinkRouteMapper.CODE_PARAM, "redirect_uri", "state", NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, "refresh_token", "id_token", "token", HatchConnectorQplLogger.AuthType.PASSWORD});

    public final CustomConnectorOAuthValidationError validate(CustomConnectorOAuthConfig customConnectorOAuthConfig) {
        C7384Etj.A0Y(customConnectorOAuthConfig, 0);
        if (customConnectorOAuthConfig.version != 1) {
            return CustomConnectorOAuthValidationError.WRONG_VERSION;
        }
        CustomConnectorOAuthCredential customConnectorOAuthCredential = customConnectorOAuthConfig.credential;
        if (!CustomConnectorName.INSTANCE.isValid(customConnectorOAuthCredential.name)) {
            return CustomConnectorOAuthValidationError.INVALID_NAME;
        }
        if (customConnectorOAuthCredential.domains.isEmpty()) {
            return CustomConnectorOAuthValidationError.DOMAINS_EMPTY;
        }
        Iterator<String> it = customConnectorOAuthCredential.domains.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!INSTANCE.isValidDomain(next)) {
                if (next != null) {
                    return CustomConnectorOAuthValidationError.INVALID_DOMAIN;
                }
            }
        }
        CustomConnectorOAuthDetails customConnectorOAuthDetails = customConnectorOAuthCredential.oauth;
        if (!CustomConnectorApiKeyValidator.INSTANCE.isValidHost(customConnectorOAuthDetails.issuerDomain)) {
            return CustomConnectorOAuthValidationError.INVALID_ISSUER_DOMAIN;
        }
        if (!isValidOAuthUrl(customConnectorOAuthDetails.authorizationUrl, customConnectorOAuthDetails.issuerDomain)) {
            return CustomConnectorOAuthValidationError.INVALID_AUTHORIZATION_URL;
        }
        if (!isValidOAuthUrl(customConnectorOAuthDetails.tokenUrl, customConnectorOAuthDetails.issuerDomain)) {
            return CustomConnectorOAuthValidationError.INVALID_TOKEN_URL;
        }
        String str = customConnectorOAuthDetails.revokeUrl;
        if (str != null && !isValidOAuthUrl(str, customConnectorOAuthDetails.issuerDomain)) {
            return CustomConnectorOAuthValidationError.INVALID_REVOKE_URL;
        }
        if (!isHttpsUrl(customConnectorOAuthDetails.redirectUri)) {
            return CustomConnectorOAuthValidationError.INVALID_REDIRECT_URI;
        }
        if (customConnectorOAuthDetails.tokenEndpointAuthMethod == null) {
            return null;
        }
        Ey9<CustomConnectorOAuthAuthMethod> entries = CustomConnectorOAuthAuthMethod.getEntries();
        ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
        Iterator<CustomConnectorOAuthAuthMethod> it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(it2.next().getWireValue());
        }
        if (arrayListA0i.contains(customConnectorOAuthDetails.tokenEndpointAuthMethod)) {
            return null;
        }
        return CustomConnectorOAuthValidationError.INVALID_AUTH_METHOD;
    }

    private final boolean isHttpsUrl(String str) {
        Object objA0s;
        String scheme;
        try {
            objA0s = new URI(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        String strA0u = null;
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        URI uri = (URI) objA0s;
        if (uri != null && (scheme = uri.getScheme()) != null) {
            strA0u = AnonymousClass001.A0u(scheme);
        }
        return "https".equals(strA0u);
    }

    private final boolean isValidOAuthUrl(String str, String str2) {
        Object objA0s;
        String host;
        List listA0g;
        try {
            objA0s = new URI(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        URI uri = (URI) objA0s;
        if (uri != null) {
            String scheme = uri.getScheme();
            if ("https".equals(scheme != null ? AnonymousClass001.A0u(scheme) : null) && uri.getUserInfo() == null && uri.getFragment() == null && (host = uri.getHost()) != null) {
                Locale locale = Locale.ROOT;
                String strA0L = C7BY.A0L(".", host.toLowerCase(locale));
                if (strA0L != null) {
                    String strNormalizeDomain = normalizeDomain(str2);
                    if (strA0L.equals(strNormalizeDomain) || strA0L.endsWith(FGI.A0M(".", strNormalizeDomain))) {
                        String rawQuery = uri.getRawQuery();
                        if (rawQuery == null || (listA0g = C7BY.A0g(rawQuery, new char[]{'&'})) == null) {
                            return true;
                        }
                        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0g);
                        Iterator it = listA0g.iterator();
                        while (it.hasNext()) {
                            String strA0j = AnonymousClass005.A0j(it);
                            arrayListA0i.add(C7BY.A0S(strA0j, strA0j, '=').toLowerCase(locale));
                        }
                        if ((arrayListA0i instanceof Collection) && arrayListA0i.isEmpty()) {
                            return true;
                        }
                        Iterator it2 = arrayListA0i.iterator();
                        while (it2.hasNext()) {
                            if (sensitiveQueryKeys.contains(it2.next())) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isValidDomain(String str) {
        String strNormalizeDomain = normalizeDomain(str);
        return (strNormalizeDomain.length() <= 0 || HatchHtmlDiagnostics.LOCALHOST.equals(strNormalizeDomain) || CustomConnectorApiKeyValidator.INSTANCE.isIPLiteral(strNormalizeDomain)) ? false : true;
    }

    private final String normalizeDomain(String str) {
        return C7BY.A0L(".", AnonymousClass001.A0u(str));
    }

    public final boolean isSafeAuthorizeUrl(String str, String str2) {
        Object objA0s;
        String strA0L;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        try {
            objA0s = new URI(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        URI uri = (URI) objA0s;
        if (uri != null) {
            String scheme = uri.getScheme();
            if ("https".equals(scheme != null ? AnonymousClass001.A0u(scheme) : null) && uri.getUserInfo() == null) {
                String host = uri.getHost();
                if (host == null || (strA0L = C7BY.A0L(".", AnonymousClass001.A0u(host))) == null) {
                    return false;
                }
                String strNormalizeDomain = normalizeDomain(str2);
                return strA0L.equals(strNormalizeDomain) || strA0L.endsWith(FGI.A0M(".", strNormalizeDomain)) || strA0L.equals(C60N.A00(5));
            }
        }
        return zA1b;
    }

    public final CustomConnectorOAuthValidationError validateClient(String str, String str2, CustomConnectorOAuthAuthMethod customConnectorOAuthAuthMethod) {
        AnonymousClass003.A0v(str, customConnectorOAuthAuthMethod);
        if (AnonymousClass002.A0l(str).length() == 0) {
            return CustomConnectorOAuthValidationError.EMPTY_CLIENT_ID;
        }
        if (!customConnectorOAuthAuthMethod.getRequiresClientSecret()) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (AnonymousClass002.A0l(str2).length() == 0) {
            return CustomConnectorOAuthValidationError.MISSING_CLIENT_SECRET;
        }
        return null;
    }
}

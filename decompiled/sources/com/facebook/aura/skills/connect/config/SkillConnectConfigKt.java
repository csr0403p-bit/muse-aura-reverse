package com.facebook.aura.skills.connect.config;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7354EnR;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.FGI;
import X.G0U;
import android.net.Uri;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.login.nativeflow.HatchCheckpointUrlPolicy;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class SkillConnectConfigKt {
    public static final String CONNECTORS_PATH_SEGMENT = "connectors";
    public static final String CONNECTOR_ACCOUNT_LINK_PATH_PREFIX = "/connectors/";
    public static final String CONNECTOR_ACCOUNT_LINK_PATH_SUFFIX = "/accounts/link";
    public static final String CONNECT_PATH_SEGMENT = "connect";
    public static final Map<String, String> DIRECT_OAUTH_SKILL_IDS_BY_HOST = C3cH.A0m("auth.onepeloton.com", "peloton", C3cG.A0r("login.link.com", "stripe-link"), C3cG.A0r("api.healthex.io", "healthex"));
    public static final String DISCONNECT_PATH_SEGMENT = "disconnect";
    public static final List<FirstPartyConnectorConfig> FIRST_PARTY_CONNECTORS;
    public static final String HATCH_API_KEY_PATH = "/connect/api-key";
    public static final String HATCH_CONSENT_PATH = "/connect/consent";
    public static final String HATCH_OAUTH_PATH = "/connect/oauth";
    public static final String HATCH_PASSWORD_PATH = "/connect/password";
    public static final String HTTPS_SCHEME = "https";
    public static final String MESSENGER_SKILL_ID = "messenger";
    public static final String META_BUSINESS_SKILL_ID = "meta_business";

    public static final HatchAccountLinkingTarget accountLinkingTarget(FirstPartyConnectorConfig firstPartyConnectorConfig) {
        C7384Etj.A0Y(firstPartyConnectorConfig, 0);
        switch (firstPartyConnectorConfig.accountIdentity.ordinal()) {
            case 0:
            case 6:
                return null;
            case 1:
                return "messenger".equals(firstPartyConnectorConfig.id) ? HatchAccountLinkingTarget.MESSENGER : HatchAccountLinkingTarget.FACEBOOK;
            case 2:
            case 3:
                return HatchAccountLinkingTarget.INSTAGRAM;
            case 4:
            case 5:
                return HatchAccountLinkingTarget.THREADS;
            default:
                throw C3cG.A0q();
        }
    }

    public static final String connectorIdentifierFromUrl(String str, String str2) {
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null || !"https".equals(C60Q.A0i(uriA01.getScheme())) || !HatchUrl.DOMAIN.equals(C60Q.A0i(uriA01.getHost()))) {
            return null;
        }
        List<String> pathSegments = uriA01.getPathSegments();
        if (pathSegments.size() < 3 || !C7384Etj.areEqual(pathSegments.get(0), "connectors") || !C7384Etj.areEqual(pathSegments.get(1), str2)) {
            return null;
        }
        String str3 = pathSegments.get(2);
        String str4 = str3;
        C7384Etj.A0X(str4);
        return C7BY.A0j(str4) ? null : str3;
    }

    public static final Map<String, String> extractApiKeyCallbackParams(String str) {
        C7384Etj.A0Y(str, 0);
        return nonServiceParamsFromHatchUrl(str, "/connect/api-key");
    }

    public static final String extractConnectorAccountLinkIdentifier(String str) {
        String strFirstPartyConnectorPath;
        C7384Etj.A0Y(str, 0);
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 != null && (strFirstPartyConnectorPath = firstPartyConnectorPath(uriA01)) != null && strFirstPartyConnectorPath.startsWith(CONNECTOR_ACCOUNT_LINK_PATH_PREFIX) && strFirstPartyConnectorPath.endsWith(CONNECTOR_ACCOUNT_LINK_PATH_SUFFIX)) {
            String strA0L = C7BY.A0L(CONNECTOR_ACCOUNT_LINK_PATH_SUFFIX, C7BY.A0K(CONNECTOR_ACCOUNT_LINK_PATH_PREFIX, strFirstPartyConnectorPath));
            if (!C7BY.A0j(strA0L) && !C7BY.A0k(strA0L, '/') && !".".equals(strA0L) && !"..".equals(strA0L)) {
                return strA0L;
            }
        }
        return null;
    }

    public static final String extractDirectOAuthSkillIdentifier(String str) {
        String host;
        String queryParameter;
        C7384Etj.A0Y(str, 0);
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null || !"https".equals(C60Q.A0i(uriA01.getScheme())) || (host = uriA01.getHost()) == null || C7BY.A0j(host) || C7Je.A05(uriA01, HatchCheckpointUrlPolicy.AUTH_HOST, true) || C7Je.A05(uriA01, "accountscenter.meta.com", true) || !AuraDeeplinkRouteMapper.CODE_PARAM.equals(uriA01.getQueryParameter("response_type")) || (queryParameter = uriA01.getQueryParameter("client_id")) == null || queryParameter.length() == 0) {
            return null;
        }
        String queryParameter2 = uriA01.getQueryParameter("service");
        if (queryParameter2 != null || (queryParameter2 = uriA01.getQueryParameter(ErrorReportingConstants.APP_NAME_KEY)) != null) {
            return queryParameter2;
        }
        String host2 = uriA01.getHost();
        if (host2 != null) {
            return C60O.A0p(AnonymousClass001.A0u(host2), DIRECT_OAUTH_SKILL_IDS_BY_HOST);
        }
        return null;
    }

    public static final String extractFirstPartyIdentifier(String str, G0U<? super FirstPartyConnectorConfig, String> g0u) {
        String strFirstPartyConnectorPath;
        FirstPartyConnectorConfig next;
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null || (strFirstPartyConnectorPath = firstPartyConnectorPath(uriA01)) == null) {
            return null;
        }
        Iterator<FirstPartyConnectorConfig> it = FIRST_PARTY_CONNECTORS.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(g0u.invoke(next), strFirstPartyConnectorPath)) {
                break;
            }
        }
        FirstPartyConnectorConfig firstPartyConnectorConfig = next;
        if (firstPartyConnectorConfig != null) {
            return firstPartyConnectorConfig.id;
        }
        return null;
    }

    public static final Map<String, String> extractPasswordCallbackParams(String str) {
        C7384Etj.A0Y(str, 0);
        return nonServiceParamsFromHatchUrl(str, HATCH_PASSWORD_PATH);
    }

    public static final String extractSkillConnectIdentifier(String str) {
        C7384Etj.A0Y(str, 0);
        String strConnectorIdentifierFromUrl = connectorIdentifierFromUrl(str, "connect");
        if (strConnectorIdentifierFromUrl != null) {
            return strConnectorIdentifierFromUrl;
        }
        String strServiceFromHatchUrl = serviceFromHatchUrl(str, HATCH_CONSENT_PATH);
        if (strServiceFromHatchUrl != null) {
            return strServiceFromHatchUrl;
        }
        String strServiceFromHatchUrl2 = serviceFromHatchUrl(str, "/connect/api-key");
        if (strServiceFromHatchUrl2 != null) {
            return strServiceFromHatchUrl2;
        }
        String strServiceFromHatchUrl3 = serviceFromHatchUrl(str, HATCH_PASSWORD_PATH);
        if (strServiceFromHatchUrl3 != null) {
            return strServiceFromHatchUrl3;
        }
        String strServiceFromHatchUrl4 = serviceFromHatchUrl(str, "/connect/oauth");
        return strServiceFromHatchUrl4 == null ? extractFirstPartyIdentifier(str, new C7354EnR() { // from class: com.facebook.aura.skills.connect.config.SkillConnectConfigKt.extractSkillConnectIdentifier.1
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public Object get(Object obj) {
                return ((FirstPartyConnectorConfig) obj).connectPath;
            }
        }) : strServiceFromHatchUrl4;
    }

    public static final String extractSkillDisconnectIdentifier(String str) {
        C7384Etj.A0Y(str, 0);
        String strConnectorIdentifierFromUrl = connectorIdentifierFromUrl(str, "disconnect");
        if (strConnectorIdentifierFromUrl != null) {
            return strConnectorIdentifierFromUrl;
        }
        String strExtractFirstPartyIdentifier = extractFirstPartyIdentifier(str, new C7354EnR() { // from class: com.facebook.aura.skills.connect.config.SkillConnectConfigKt.extractSkillDisconnectIdentifier.2
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public Object get(Object obj) {
                return ((FirstPartyConnectorConfig) obj).disconnectPath;
            }
        });
        if (strExtractFirstPartyIdentifier != null) {
            return strExtractFirstPartyIdentifier;
        }
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null || !"https".equals(C60Q.A0i(uriA01.getScheme())) || !HatchUrl.DOMAIN.equals(C60Q.A0i(uriA01.getHost()))) {
            return null;
        }
        List<String> pathSegments = uriA01.getPathSegments();
        if (pathSegments.size() != 2 || !C7384Etj.areEqual(AbstractC0878AGe.A0F(pathSegments), "disconnect")) {
            return null;
        }
        String str2 = pathSegments.get(1);
        String str3 = str2;
        C7384Etj.A0X(str3);
        return C7BY.A0j(str3) ? null : str2;
    }

    public static final FirstPartyConnectorConfig firstPartyConnectorConfigForSkill(String str) {
        FirstPartyConnectorConfig next;
        C7384Etj.A0Y(str, 0);
        Iterator<FirstPartyConnectorConfig> it = FIRST_PARTY_CONNECTORS.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.id)) {
                break;
            }
        }
        return next;
    }

    public static final boolean isHatchConnectUrl(String str, String str2) {
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null) {
            return false;
        }
        if (!"https".equals(C60Q.A0i(uriA01.getScheme()))) {
            return false;
        }
        String host = uriA01.getHost();
        return HatchUrl.DOMAIN.equals(host != null ? AnonymousClass001.A0u(host) : null) && C7384Etj.areEqual(uriA01.getPath(), str2);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountIdentity.values().length];
            try {
                AnonymousClass002.A13(AccountIdentity.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AccountIdentity.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AccountIdentity.INSTAGRAM_MESSAGES, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AccountIdentity.THREADS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AccountIdentity.THREADS_MESSAGES, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AccountIdentity.META_BUSINESS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AccountIdentity.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        FirstPartyConnectorConfig firstPartyConnectorConfig = new FirstPartyConnectorConfig(META_BUSINESS_SKILL_ID, "Meta Business Manager", false, false, AccountIdentity.META_BUSINESS, "/connectors/connect/meta_business", "/connectors/disconnect/meta_business", false, true, true);
        FirstPartyConnectorConfig firstPartyConnectorConfig2 = new FirstPartyConnectorConfig(NativeLoginAccountResolverKt.WHATSAPP_USER_ID, "WhatsApp", false, false, AccountIdentity.WHATSAPP, "/connect/whatsapp_companion", "/disconnect/whatsapp_companion", false, false, false);
        AccountIdentity accountIdentity = AccountIdentity.FACEBOOK;
        FIRST_PARTY_CONNECTORS = Arrays.asList(firstPartyConnectorConfig, firstPartyConnectorConfig2, new FirstPartyConnectorConfig(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK, "Facebook", false, true, accountIdentity, "/connect/facebook", "/disconnect/facebook", false, false, false), new FirstPartyConnectorConfig("messenger", "Messenger", true, false, accountIdentity, "/connect/messenger_companion", "/disconnect/messenger_companion", false, true, false), new FirstPartyConnectorConfig(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM, "Instagram", false, true, AccountIdentity.INSTAGRAM, "/connect/instagram", "/disconnect/instagram", false, false, false), new FirstPartyConnectorConfig(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_THREADS, "Threads", false, true, AccountIdentity.THREADS, "/connect/threads", "/disconnect/threads", false, false, false), new FirstPartyConnectorConfig("instagram_messages", "Instagram Messages", true, false, AccountIdentity.INSTAGRAM_MESSAGES, "/connect/instagram_messages", "/disconnect/instagram_messages", true, true, false), new FirstPartyConnectorConfig("threads_messages", "Threads Messages", true, false, AccountIdentity.THREADS_MESSAGES, "/connect/threads_messages", "/disconnect/threads_messages", true, true, false));
    }

    public static final String extractApiKeyIdentifier(String str) {
        return serviceFromHatchUrl(str, "/connect/api-key");
    }

    public static final String extractConsentIdentifier(String str) {
        return serviceFromHatchUrl(str, HATCH_CONSENT_PATH);
    }

    public static final String extractDirectOAuthSkillConnectIdentifier(String str) {
        String queryParameter;
        C7384Etj.A0Y(str, 0);
        if (!isHatchConnectUrl(str, "/connect/oauth")) {
            return null;
        }
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null || (queryParameter = uriA01.getQueryParameter("url")) == null) {
            return null;
        }
        return extractDirectOAuthSkillIdentifier(queryParameter);
    }

    public static final String extractOAuthProvider(String str) {
        return serviceFromHatchUrl(str, "/connect/oauth");
    }

    public static final String extractPasswordIdentifier(String str) {
        return serviceFromHatchUrl(str, HATCH_PASSWORD_PATH);
    }

    public static final String firstPartyConnectorPath(Uri uri) {
        String strA0i = C60Q.A0i(uri.getScheme());
        String strA0i2 = C60Q.A0i(uri.getHost());
        if ("https".equals(strA0i) && HatchUrl.DOMAIN.equals(strA0i2)) {
            return uri.getPath();
        }
        if (!"hatch".equals(strA0i) || strA0i2 == null || C7BY.A0j(strA0i2)) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return FGI.A0U(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0i2, path);
    }

    public static final Map<String, String> nonServiceParamsFromHatchUrl(String str, String str2) {
        if (isHatchConnectUrl(str, str2)) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                Set<String> queryParameterNames = uriA01.getQueryParameterNames();
                ArrayList arrayListA0s = C60Q.A0s(queryParameterNames);
                for (String str3 : queryParameterNames) {
                    if (!"service".equals(str3)) {
                        arrayListA0s.add(str3);
                    }
                }
                LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0s));
                for (Object obj : arrayListA0s) {
                    String queryParameter = uriA01.getQueryParameter((String) obj);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    linkedHashMapA15.put(obj, queryParameter);
                }
                return linkedHashMapA15;
            }
        }
        return AGH.A0E();
    }

    public static final String serviceFromHatchUrl(String str, String str2) {
        String queryParameter;
        if (isHatchConnectUrl(str, str2)) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null && (queryParameter = uriA01.getQueryParameter("service")) != null && queryParameter.length() != 0) {
                return queryParameter;
            }
        }
        return null;
    }
}

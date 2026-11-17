package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import X.C60R;
import X.C6t6;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.FGI;
import X.HsJ;
import android.net.Uri;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes3.dex */
public abstract class SpacesWebViewSessionKt {
    public static final String PEER_SPACES_ROUTE_PREFIX = "/api/peer-spaces/by-id/";
    public static final String PEER_SPACE_ORIGIN_SUFFIX = ".peer-space.invalid";
    public static final String SPACES_ROUTE_PREFIX = "/spaces/v2/";

    public static final boolean isOnGrantedSpaceOrigin(C6t6 c6t6) {
        HtmlSpacesWebViewSession htmlSpacesWebViewSession;
        String str;
        C7384Etj.A0Y(c6t6, 0);
        Object tag = c6t6.getTag();
        if (!(tag instanceof HtmlSpacesWebViewSession) || (htmlSpacesWebViewSession = (HtmlSpacesWebViewSession) tag) == null || (str = htmlSpacesWebViewSession.sourceUrl) == null || htmlSpacesWebViewSession.authToken == null) {
            return false;
        }
        return isSameOrigin(c6t6.getUrl(), str);
    }

    public static final boolean isPeerSpaceOrigin(String str) {
        return str != null && str.endsWith(PEER_SPACE_ORIGIN_SUFFIX);
    }

    public static final boolean isSameOrigin(String str, String str2) {
        String scheme;
        String host;
        if (str != null && str2 != null) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                Uri uriA012 = null;
                try {
                    uriA012 = C7Je.A01(str2);
                } catch (SecurityException | UnsupportedOperationException unused2) {
                }
                if (uriA012 != null && (scheme = uriA01.getScheme()) != null && (host = uriA01.getHost()) != null && scheme.equalsIgnoreCase(uriA012.getScheme()) && host.equalsIgnoreCase(uriA012.getHost()) && portOrDefault(uriA01) == portOrDefault(uriA012)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String peerSpaceOrigin(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0U("https://", AnonymousClass001.A0u(str), PEER_SPACE_ORIGIN_SUFFIX);
    }

    public static final String spacesRoutePrefixFor(String str) {
        Object objA0s;
        Uri uri;
        if (str != null) {
            try {
                objA0s = Uri.parse(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            uri = (Uri) objA0s;
        } else {
            uri = null;
        }
        if (uri == null || !isPeerSpaceOrigin(uri.getHost())) {
            return SPACES_ROUTE_PREFIX;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String strA0K = C7BY.A0K(PEER_SPACES_ROUTE_PREFIX, path);
        return FGI.A0U(PEER_SPACES_ROUTE_PREFIX, C7BY.A0S(strA0K, strA0K, '/'), CustomConnectorRegisterRepositoryKt.ROOT_PATH);
    }

    public static final HtmlSpacesWebViewSession spacesSession(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        Object tag = c6t6.getTag();
        C7384Etj.A0Z(tag, "null cannot be cast to non-null type com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession");
        return (HtmlSpacesWebViewSession) tag;
    }

    public static final String toCanonicalSpaceDocumentUrl(String str) {
        Object objA0s;
        Uri uri;
        String path;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = Uri.parse(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (HsJ.A00(objA0s) != null || (path = (uri = (Uri) objA0s).getPath()) == null || !path.startsWith(SPACES_ROUTE_PREFIX) || path.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
            return str;
        }
        String strA0K = C7BY.A0K(SPACES_ROUTE_PREFIX, path);
        return (strA0K.length() == 0 || C7BY.A0k(strA0K, '/')) ? str : C60R.A0b(uri.buildUpon().path(FGI.A0M(path, CustomConnectorRegisterRepositoryKt.ROOT_PATH)));
    }

    public static final String toGatewaySpaceUrl(String str, String str2) {
        Object objA0s;
        String strA0Z;
        String encodedPath;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = Uri.parse(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Uri uri = (Uri) objA0s;
        if (uri != null) {
            if (!isPeerSpaceOrigin(uri.getHost())) {
                return str;
            }
            if (str2 != null && (strA0Z = C7BY.A0Z(str2, '/')) != null && (encodedPath = uri.getEncodedPath()) != null) {
                String encodedQuery = uri.getEncodedQuery();
                return FGI.A0U(strA0Z, encodedPath, encodedQuery != null ? FGI.A0M(HatchOpenGraphRepository.UNKNOWN_HOST, encodedQuery) : "");
            }
        }
        return null;
    }

    public static final boolean isPeerSpaceAccessEnded(int i, boolean z) {
        if (i == 401 || i == 403) {
            return true;
        }
        if (z) {
            return i == 404 || i == 410;
        }
        return false;
    }

    public static final String loggableSpaceUrl(String str) {
        Object objA0s;
        if (str != null) {
            try {
                objA0s = Uri.parse(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            Uri uri = (Uri) objA0s;
            if (uri != null) {
                if (!isPeerSpaceOrigin(uri.getHost())) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (path.startsWith(PEER_SPACES_ROUTE_PREFIX)) {
                    }
                }
                return PEER_SPACES_ROUTE_PREFIX;
            }
        }
        return str;
    }

    public static final String peerSpaceDocumentUrl(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return FGI.A0d("https://", AnonymousClass001.A0u(str), PEER_SPACE_ORIGIN_SUFFIX, str2);
    }

    public static final int portOrDefault(Uri uri) {
        if (uri.getPort() != -1) {
            return uri.getPort();
        }
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equalsIgnoreCase("https")) {
            return 443;
        }
        String scheme2 = uri.getScheme();
        return (scheme2 == null || !scheme2.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP)) ? -1 : 80;
    }
}

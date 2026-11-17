package X;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.6xU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6xU {
    public static final C6li A0L;
    public static final C6li A0M;
    public static final C6li A0N;
    public static final C6li A0O;
    public static final C6li A0P;
    public static final C6li A0Q;
    public static final C6li A0R;
    public static final C6li A0S;
    public static final C6li A0T;
    public static final C6li A0U;
    public static final C6li A0V;
    public static final C6li A0W;
    public static final C6li A0X;
    public static final C6li A0Y;
    public static final C6li A0Z;
    public static final C6li A0a;
    public static final C6li A0b;
    public static final C6li A0c;
    public static final C6li A0d;
    public static final C6li A0e;
    public static final C6li A0f;
    public static final C6li A0g;
    public static final C6li A0h;
    public static final C6li A0i;
    public static final C6li A0j;
    public static final C6li A0k;
    public static final C6li A0l;
    public static final C6li A0m;
    public static final C6li A0n;
    public static final C6li A0o;
    public static final C6li A0p;
    public static final C6li A0q;
    public static final C6li A0r;
    public static final C6li A0s;

    @Deprecated(forRemoval = true)
    public static final C6li A0t;
    public static final C6li A0u;
    public static final C6li A0v;
    public static final C6li A0w;
    public static final C6li A0x;
    public static final C6li A0y;
    public static final C6li A0z;
    public static final C6li A10;
    public static final C6li A11;
    public static final C6li A12;
    public static final C6li A13;
    public static final C6li A14;
    public static final C6li A15;
    public static final C6li A16;
    public static final C6li A18;

    @Deprecated
    public static final C05756xb A19;
    public static final C05756xb A1A;
    public static final C05756xb A1B;
    public static final C05756xb A1C;
    public static final C05796xf A1R;
    public static final C05796xf A1T;
    public static final C05806xg A1V;
    public static final C05806xg A1W;
    public static final C05806xg A1X;

    @Deprecated
    public static final C05806xg A1Y;
    public static final C05806xg A1Z;
    public static final C05816xh A1a;
    public static final C6xX A1b;
    public static final C6xZ A05 = new C6xZ("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final C6xZ A01 = new C6xZ("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final C05766xc A1F = new C05766xc("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final C05746xa A0C = new C05746xa("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final C05776xd A1P = new C05776xd("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    @Deprecated
    public static final C05776xd A1G = new C05776xd("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    @Deprecated
    public static final C05776xd A1H = new C05776xd("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final C05776xd A1I = new C05776xd("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final C05776xd A1J = new C05776xd("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final C05776xd A1L = new C05776xd("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final C05746xa A0D = new C05746xa("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final C05746xa A0F = new C05746xa("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final C05746xa A0G = new C05746xa("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final C05746xa A0H = new C05746xa("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    public static final C05746xa A0E = new C05746xa("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final C05746xa A0I = new C05746xa("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final C6xZ A04 = new C6xZ("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    public static final C6xZ A03 = new C6xZ("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    public static final C05746xa A0J = new C05746xa("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final C05776xd A1K = new C05776xd("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final C05746xa A0K = new C05746xa("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    public static final C6xZ A0B = new C6xZ("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final C6xZ A0A = new C6xZ("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final C05776xd A1M = new C05776xd("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final C05776xd A1N = new C05776xd("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final C05776xd A1O = new C05776xd("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final C6xZ A08 = new C6xZ("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final C6xZ A07 = new C6xZ("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final C6li A17 = new C6li("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final C6xZ A09 = new C6xZ("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final C6xZ A00 = new C6xZ("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final C6xZ A02 = new C6xZ("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final C6xZ A06 = new C6xZ("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final C05766xc A1E = new C05766xc("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final C05766xc A1D = new C05766xc("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final C05796xf A1S = new C05796xf("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final C05796xf A1U = new C05796xf("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final C05786xe A1Q = new C05786xe("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX WARN: Type inference failed for: r0v42, types: [X.6xX] */
    static {
        C05816xh c05816xh = new C05816xh();
        Set<C6xY> set = C6xY.A00;
        set.add(c05816xh);
        A1a = c05816xh;
        C05806xg c05806xg = new C05806xg();
        set.add(c05806xg);
        A1W = c05806xg;
        C05806xg c05806xg2 = new C05806xg();
        set.add(c05806xg2);
        A1V = c05806xg2;
        A1T = new C05796xf("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        A1b = new AbstractC05726xV() { // from class: X.6xX
            public final Pattern A00 = Pattern.compile("\\A\\d+");

            @Override // X.AbstractC05726xV
            public final boolean A00() {
                return Build.VERSION.SDK_INT >= 33;
            }
        };
        A0r = new C6li("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        A0g = new C6li("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        A1R = new C05796xf("FORCE_DARK", "FORCE_DARK");
        A0a = new C6li("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        A18 = new C6li("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        A0W = new C6li("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        A0s = new C6li("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        A0c = new C6li("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        A0Z = new C6li("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        A0b = new C6li("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        A0t = new C6li("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        A0y = new C6li("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        A0z = new C6li() { // from class: X.6xW
            @Override // X.AbstractC05726xV
            public final boolean A01() {
                PackageInfo currentWebViewPackage;
                return super.A01() && (currentWebViewPackage = WebView.getCurrentWebViewPackage()) != null && currentWebViewPackage.getLongVersionCode() >= 636700000;
            }
        };
        A0h = new C6li() { // from class: X.6xM
            @Override // X.AbstractC05726xV
            public final boolean A01() {
                if (!super.A01() || !C6xU.A00("MULTI_PROCESS")) {
                    return false;
                }
                if (C6xU.A0g.A01()) {
                    return AbstractC05846xo.A00.AL2().isMultiProcessEnabled();
                }
                throw C60Q.A0q();
            }
        };
        A0M = new C6li("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        A13 = new C6li("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        A0i = new C6li("MUTE_AUDIO", "MUTE_AUDIO");
        A16 = new C6li("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        A0w = new C6li("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        A0N = new C6li("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        A0O = new C6li("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS");
        A0P = new C6li("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V3", "BACK_FORWARD_CACHE_SETTINGS_V3");
        A0Q = new C6li("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V4", "BACK_FORWARD_CACHE_SETTINGS_V4");
        A0V = new C6li("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        A0p = new C6li() { // from class: X.6xN
            @Override // X.AbstractC05726xV
            public final boolean A01() {
                if (C6xU.A00("MULTI_PROFILE")) {
                    return super.A01();
                }
                return false;
            }
        };
        A1B = new C05756xb("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP_V2");
        A19 = new C05756xb("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        A1A = new C05756xb("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        A0U = new C6li("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        A0o = new C6li("PRERENDER_URL_V2", "PRERENDER_URL_V3");
        A0x = new C6li("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");
        A0n = new C6li("PREFETCH_CACHE_V1", "PREFETCH_CACHE_V1");
        A1C = new C05756xb("IMPLEMENTATION_ONLY_FEATURE", "PREFETCH_WITH_CALLBACK_RESULT_V1");
        A0v = new C6li("SET_MAX_PRERENDERS_V1", "SET_MAX_PRERENDERS_V1");
        A0u = new C6li("SAVE_STATE", "SAVE_STATE");
        A0j = new C6li("NAVIGATION_GET_WEB_RESOURCE_ERROR", "NAVIGATION_GET_WEB_RESOURCE_ERROR");
        A0k = new C6li("NAVIGATION_LISTENER", "PAGE_GET_URL");
        A0q = new C6li("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW");
        A0l = new C6li("PAYMENT_REQUEST", "PAYMENT_REQUEST");
        A11 = new C6li("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1");
        A12 = new C6li("WEBVIEW_BUILDER_EXPERIMENTAL_V2", "WEBVIEW_BUILDER_V2");
        A0R = new C6li("COOKIE_INTERCEPT", "COOKIE_INTERCEPT");
        A10 = new C6li("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS");
        A0T = new C6li("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS");
        C05806xg c05806xg3 = new C05806xg();
        set.add(c05806xg3);
        A1X = c05806xg3;
        C05806xg c05806xg4 = new C05806xg();
        set.add(c05806xg4);
        A1Y = c05806xg4;
        C05806xg c05806xg5 = new C05806xg();
        set.add(c05806xg5);
        A1Z = c05806xg5;
        A0m = new C6li("PRECONNECT", "PRECONNECT");
        A0Y = new C6li("ENQUEUE_PRECONNECT", "ENQUEUE_PRECONNECT");
        A0L = new C6li("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1");
        A0e = new C6li("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS");
        A0f = new C6li("JS_INJECTION_IN_FRAME_AND_WORLD", "JS_INJECTION_IN_FRAME_AND_WORLD");
        A15 = new C6li("WEBVIEW_NAVIGATE_EXPERIMENTAL_V1", "WEBVIEW_NAVIGATE_V1");
        A14 = new C6li("WEBVIEW_NAVIGATE_DRAIN_PREFETCH", "WEBVIEW_NAVIGATE_DRAIN_PREFETCH");
        A0X = new C6li("DOWNLOAD_FAVICONS_ENABLED", "DOWNLOAD_FAVICONS_ENABLED");
        A0d = new C6li("HTTP_CACHE_MANAGER", "HTTP_CACHE_MANAGER");
        A0S = new C6li("CROSS_ORIGIN_ISOLATED_ALLOWLIST", "CROSS_ORIGIN_ISOLATED_ALLOW_LIST");
    }

    public static boolean A00(String str) {
        Set<C6xi> setUnmodifiableSet = Collections.unmodifiableSet(AbstractC05726xV.A02);
        HashSet hashSetA13 = C60O.A13();
        for (C6xi c6xi : setUnmodifiableSet) {
            C3cI.A1J(str, c6xi, ((AbstractC05726xV) c6xi).A00, hashSetA13);
        }
        if (hashSetA13.isEmpty()) {
            throw new RuntimeException(FGI.A0M("Unknown feature ", str));
        }
        Iterator it = hashSetA13.iterator();
        while (it.hasNext()) {
            AbstractC05726xV abstractC05726xV = (AbstractC05726xV) ((C6xi) it.next());
            if (abstractC05726xV.A00() || abstractC05726xV.A01()) {
                return true;
            }
        }
        return false;
    }
}

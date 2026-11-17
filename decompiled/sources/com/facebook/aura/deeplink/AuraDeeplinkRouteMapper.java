package com.facebook.aura.deeplink;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass801;
import X.C06827l3;
import X.C06H;
import X.C0881AGi;
import X.C31u;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.F0C;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7359EnW;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.deeplink.HatchNotificationDeeplinkHandler;
import com.facebook.aura.deeplink.MC;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.library.model.HatchPendingLibrarySegment;
import com.facebook.aura.library.model.LibrarySegment;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.CustomConnectorAuthSheetKey;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.skills.connect.config.CustomConnectorLinkParser;
import com.facebook.aura.skills.connect.config.SkillConnectConfigKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(AuraDeeplinkRouteMapper.class, "maxLength", "<v#0>", 0);
    public static final int $stable = 0;
    public static final String ACTIVITY_ROUTE = "activity";
    public static final String APP_LAUNCH_HOST = "applink.muse.ai";
    public static final String CHAT_ROUTE = "chat";
    public static final String CODE_PARAM = "code";
    public static final String CONNECTORS_ROUTE = "connectors";
    public static final String CONNECT_COMPLETE_ROUTE = "connect_complete";
    public static final String CUSTOM_CONNECT_COMPLETE_PATH = "/connect/complete";
    public static final String DEVICE_PERMISSIONS_ROUTE = "device_permissions";
    public static final String EMAIL_SETUP_ROUTE = "email_setup";
    public static final String GOALS_ROUTE = "goals";
    public static final String HATCH_SCHEME = "hatch";
    public static final String HIGHLIGHT_PARAM = "highlight";
    public static final String HOME_ROUTE = "home";
    public static final String HTTPS_SCHEME = "https";
    public static final String ID_PARAM = "id";
    public static final AuraDeeplinkRouteMapper INSTANCE;
    public static final String INVITE_FRIENDS_ROUTE = "invite_friends";
    public static final String INVITE_ROUTE = "invite";
    public static final String JOIN_ROUTE = "join";
    public static final String LIBRARY_ARTIFACTS_ROUTE = "artifacts";
    public static final String LIBRARY_ITEM_ROUTE = "item";
    public static final String LIBRARY_ROUTE = "library";
    public static final String MEMORY_DEFAULT_PATH = "MEMORY.md";
    public static final String MEMORY_ROUTE = "memory";
    public static final String OAUTH_CALLBACK_PATH = "/api/hatch/oauth/callback";
    public static final String OAUTH_CALLBACK_ROUTE = "oauth_callback";
    public static final String PATH_PARAM = "path";
    public static final String QUERY_PARAM = "q";
    public static final String REDEEM_INVITE_CODE_ROUTE = "redeem_invite_code";
    public static final String SEARCH_ROUTE = "search";
    public static final String SECTION_PARAM = "section";
    public static final String SETTINGS_ROUTE = "settings";
    public static final String SKILL_CONNECT_ROUTE = "connect";
    public static final String SKILL_DISCONNECT_ROUTE = "disconnect";
    public static final String STATUS_ROUTE = "status";
    public static final String STRIPE_LINK_CONNECT_COMPLETE_PATH = "/stripe_link/connect/complete";
    public static final String STRIPE_LINK_ROUTE = "stripe_link";
    public static final String TAB_PARAM = "tab";
    public static final String TASK_ROUTE = "task";
    public static final String THREAD_ROUTE = "thread";
    public static final C06827l3 WORKSPACE_PATH_REGEX;
    public static final List<RouteSpec> commonSessionedRouteSpecs;
    public static final List<RouteSpec> sessionedRouteSpecs;
    public static final List<SessionlessRouteSpec> sessionlessRouteSpecs;

    public interface BaseRouteSpec {
        String getExactPath();

        G0U<Uri, Boolean> getFallbackMatch();

        G0U<Uri, Boolean> getHasRoute();

        AuraDeeplinkAccessScope getHatchAccessScope();

        AuraDeeplinkAccessScope getHttpsAccessScope();

        String getRouteName();

        String getScheme();
    }

    public final class RouteSpec implements BaseRouteSpec {
        public final String exactPath;
        public final G0W<Uri, List<String>, AbstractC3358CGz, AuraDeeplinkRoute> executeRoute;
        public final G0U<Uri, Boolean> fallbackMatch;
        public final G0U<Uri, Boolean> hasRoute;
        public final AuraDeeplinkAccessScope hatchAccessScope;
        public final AuraDeeplinkAccessScope httpsAccessScope;
        public final boolean resolvesAfterActivation;
        public final String routeName;
        public final String scheme;

        /* JADX WARN: Multi-variable type inference failed */
        public RouteSpec(String str, String str2, String str3, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2, G0U<? super Uri, Boolean> g0u, G0U<? super Uri, Boolean> g0u2, boolean z, G0W<? super Uri, ? super List<String>, ? super AbstractC3358CGz, AuraDeeplinkRoute> g0w) {
            AnonymousClass005.A12(str, auraDeeplinkAccessScope, auraDeeplinkAccessScope2, 0);
            C60O.A1N(g0u2, 6, g0w);
            this.routeName = str;
            this.scheme = str2;
            this.exactPath = str3;
            this.hatchAccessScope = auraDeeplinkAccessScope;
            this.httpsAccessScope = auraDeeplinkAccessScope2;
            this.fallbackMatch = g0u;
            this.hasRoute = g0u2;
            this.resolvesAfterActivation = z;
            this.executeRoute = g0w;
        }

        /* renamed from: com.facebook.aura.deeplink.AuraDeeplinkRouteMapper$RouteSpec$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Uri uri) {
                return AnonymousClass001.A0i();
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
                return AnonymousClass001.A0i();
            }
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public String getExactPath() {
            return this.exactPath;
        }

        public final G0W<Uri, List<String>, AbstractC3358CGz, AuraDeeplinkRoute> getExecuteRoute() {
            return this.executeRoute;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public G0U<Uri, Boolean> getFallbackMatch() {
            return this.fallbackMatch;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public G0U<Uri, Boolean> getHasRoute() {
            return this.hasRoute;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public AuraDeeplinkAccessScope getHatchAccessScope() {
            return this.hatchAccessScope;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public AuraDeeplinkAccessScope getHttpsAccessScope() {
            return this.httpsAccessScope;
        }

        public final boolean getResolvesAfterActivation() {
            return this.resolvesAfterActivation;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public String getRouteName() {
            return this.routeName;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public String getScheme() {
            return this.scheme;
        }

        public /* synthetic */ RouteSpec(String str, String str2, String str3, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2, G0U g0u, G0U g0u2, boolean z, G0W g0w, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope, (i & 16) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope2, (i & 32) != 0 ? null : g0u, (i & 64) != 0 ? AnonymousClass1.INSTANCE : g0u2, C3cH.A1N(i, z), g0w);
        }
    }

    public final class SessionlessRouteSpec implements BaseRouteSpec {
        public final String exactPath;
        public final G0V<Uri, List<String>, AuraDeeplinkRoute> executeRoute;
        public final G0U<Uri, Boolean> fallbackMatch;
        public final G0U<Uri, Boolean> hasRoute;
        public final AuraDeeplinkAccessScope hatchAccessScope;
        public final AuraDeeplinkAccessScope httpsAccessScope;
        public final String routeName;
        public final String scheme;

        /* JADX WARN: Multi-variable type inference failed */
        public SessionlessRouteSpec(String str, String str2, String str3, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2, G0U<? super Uri, Boolean> g0u, G0U<? super Uri, Boolean> g0u2, G0V<? super Uri, ? super List<String>, AuraDeeplinkRoute> g0v) {
            AnonymousClass005.A12(str, auraDeeplinkAccessScope, auraDeeplinkAccessScope2, 0);
            AnonymousClass003.A10(g0u2, g0v);
            this.routeName = str;
            this.scheme = str2;
            this.exactPath = str3;
            this.hatchAccessScope = auraDeeplinkAccessScope;
            this.httpsAccessScope = auraDeeplinkAccessScope2;
            this.fallbackMatch = g0u;
            this.hasRoute = g0u2;
            this.executeRoute = g0v;
        }

        /* renamed from: com.facebook.aura.deeplink.AuraDeeplinkRouteMapper$SessionlessRouteSpec$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Uri uri) {
                return AnonymousClass001.A0i();
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
                return AnonymousClass001.A0i();
            }
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public String getExactPath() {
            return this.exactPath;
        }

        public final G0V<Uri, List<String>, AuraDeeplinkRoute> getExecuteRoute() {
            return this.executeRoute;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public G0U<Uri, Boolean> getFallbackMatch() {
            return this.fallbackMatch;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public G0U<Uri, Boolean> getHasRoute() {
            return this.hasRoute;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public AuraDeeplinkAccessScope getHatchAccessScope() {
            return this.hatchAccessScope;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public AuraDeeplinkAccessScope getHttpsAccessScope() {
            return this.httpsAccessScope;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public String getRouteName() {
            return this.routeName;
        }

        @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.BaseRouteSpec
        public String getScheme() {
            return this.scheme;
        }

        public /* synthetic */ SessionlessRouteSpec(String str, String str2, String str3, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2, G0U g0u, G0U g0u2, G0V g0v, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope, (i & 16) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope2, (i & 32) != 0 ? null : g0u, (i & 64) != 0 ? AnonymousClass1.INSTANCE : g0u2, g0v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentItem contentItemForPath(String str) {
        return new ContentItem(C7BY.A0M(str), ContentTypeDetector.INSTANCE.fromFileName(str), str, null, null, null, null, null, null, false, null, null, null, null, null);
    }

    public final BaseRouteSpec getRouteForUri$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return matchingRouteSpec(uri);
    }

    public final BaseRouteSpec getSignedOutRouteForUri$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        SessionlessRouteSpec sessionlessRouteSpec = (SessionlessRouteSpec) specForUri(sessionlessRouteSpecs, uri);
        return (sessionlessRouteSpec == null || !AnonymousClass003.A1X(uri, sessionlessRouteSpec.getHasRoute())) ? specForUri(sessionedRouteSpecs, uri) : sessionlessRouteSpec;
    }

    public final boolean hasRouteForUri(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return isAppLaunchHost(uri) || matchingRouteSpec(uri) != null;
    }

    public final boolean isAppLaunchUri(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return isAppLaunchHost(uri);
    }

    public final boolean isHatchChatRoute(Uri uri) {
        RouteSpec routeSpec;
        C7384Etj.A0Y(uri, 0);
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equalsIgnoreCase("hatch") && (routeSpec = (RouteSpec) specForUri(sessionedRouteSpecs, uri)) != null) {
            String routeName = routeSpec.getRouteName();
            if (("chat".equals(routeName) || HOME_ROUTE.equals(routeName)) && AnonymousClass003.A1X(uri, routeSpec.getHasRoute())) {
                return true;
            }
        }
        return false;
    }

    public final AuraDeeplinkRoute routeForSessionlessUri(Uri uri) {
        SessionlessRouteSpec sessionlessRouteSpec;
        C7384Etj.A0Y(uri, 0);
        if (isAppLaunchHost(uri) || (sessionlessRouteSpec = (SessionlessRouteSpec) specForUri(sessionlessRouteSpecs, uri)) == null || !AnonymousClass003.A1X(uri, sessionlessRouteSpec.getHasRoute())) {
            return null;
        }
        return sessionlessRouteSpec.executeRoute.invoke(uri, AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri));
    }

    public final String routeNameResolvedAfterActivation(Uri uri) {
        RouteSpec routeSpec;
        C7384Etj.A0Y(uri, 0);
        if (isAppLaunchHost(uri) || (routeSpec = (RouteSpec) specForUri(sessionedRouteSpecs, uri)) == null || !routeSpec.resolvesAfterActivation || !AnonymousClass003.A1X(uri, routeSpec.getHasRoute())) {
            return null;
        }
        return routeSpec.getRouteName();
    }

    static {
        AuraDeeplinkRouteMapper auraDeeplinkRouteMapper = new AuraDeeplinkRouteMapper();
        INSTANCE = auraDeeplinkRouteMapper;
        sessionlessRouteSpecs = C0881AGi.A00;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.PUBLIC;
        AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$1 auraDeeplinkRouteMapper$commonSessionedRouteSpecs$1 = AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$1.INSTANCE;
        RouteSpec.AnonymousClass1 anonymousClass1 = RouteSpec.AnonymousClass1.INSTANCE;
        RouteSpec routeSpec = new RouteSpec(JOIN_ROUTE, null, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, null, anonymousClass1, false, auraDeeplinkRouteMapper$commonSessionedRouteSpecs$1);
        RouteSpec routeSpec2 = new RouteSpec("invite", null, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, null, anonymousClass1, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$2.INSTANCE);
        AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$3 auraDeeplinkRouteMapper$commonSessionedRouteSpecs$3 = AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$3.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope2 = AuraDeeplinkAccessScope.ALL_FAMILY;
        RouteSpec routeSpec3 = new RouteSpec("goals", null, "/goals", auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, anonymousClass1, false, auraDeeplinkRouteMapper$commonSessionedRouteSpecs$3);
        RouteSpec routeSpec4 = new RouteSpec("invite_friends", null, "/invite_friends", auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$4.INSTANCE, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$5.INSTANCE);
        RouteSpec routeSpec5 = new RouteSpec(REDEEM_INVITE_CODE_ROUTE, null, "/redeem_invite_code", auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$6.INSTANCE, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$7.INSTANCE);
        AuraDeeplinkAccessScope auraDeeplinkAccessScope3 = AuraDeeplinkAccessScope.NOT_APPLICABLE;
        AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$8 auraDeeplinkRouteMapper$commonSessionedRouteSpecs$8 = AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$8.INSTANCE;
        RouteSpec.AnonymousClass1 anonymousClass12 = RouteSpec.AnonymousClass1.INSTANCE;
        RouteSpec routeSpec6 = new RouteSpec("chat", "hatch", null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope3, null, anonymousClass12, false, auraDeeplinkRouteMapper$commonSessionedRouteSpecs$8);
        RouteSpec routeSpec7 = new RouteSpec(HOME_ROUTE, "hatch", null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope3, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$9.INSTANCE);
        RouteSpec routeSpec8 = new RouteSpec("chat", "https", null, auraDeeplinkAccessScope3, auraDeeplinkAccessScope, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$10.INSTANCE);
        RouteSpec routeSpec9 = new RouteSpec("thread", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$11.INSTANCE);
        RouteSpec routeSpec10 = new RouteSpec("library", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$12.INSTANCE);
        RouteSpec routeSpec11 = new RouteSpec("library", null, "/library", auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$13.INSTANCE);
        RouteSpec routeSpec12 = new RouteSpec(MEMORY_ROUTE, null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$14.INSTANCE);
        RouteSpec routeSpec13 = new RouteSpec("settings", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$15.INSTANCE);
        RouteSpec routeSpec14 = new RouteSpec(SEARCH_ROUTE, null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, anonymousClass12, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$16.INSTANCE);
        RouteSpec routeSpec15 = new RouteSpec(EMAIL_SETUP_ROUTE, "hatch", "/email_setup", auraDeeplinkAccessScope2, auraDeeplinkAccessScope3, null, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$17.INSTANCE, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$18.INSTANCE);
        AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$19 auraDeeplinkRouteMapper$commonSessionedRouteSpecs$19 = AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$19.INSTANCE;
        RouteSpec.AnonymousClass1 anonymousClass13 = RouteSpec.AnonymousClass1.INSTANCE;
        RouteSpec routeSpec16 = new RouteSpec(STATUS_ROUTE, null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, anonymousClass13, false, auraDeeplinkRouteMapper$commonSessionedRouteSpecs$19);
        RouteSpec routeSpec17 = new RouteSpec("activity", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, anonymousClass13, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$20.INSTANCE);
        RouteSpec routeSpec18 = new RouteSpec(TASK_ROUTE, null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, anonymousClass13, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$21.INSTANCE);
        RouteSpec routeSpec19 = new RouteSpec(DEVICE_PERMISSIONS_ROUTE, null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, anonymousClass13, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$22.INSTANCE);
        RouteSpec routeSpec20 = new RouteSpec(BrowserCredentialsDeeplink.ROUTE_NAME, null, BrowserCredentialsDeeplink.ROUTE_PATH, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$23(BrowserCredentialsDeeplink.INSTANCE), false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$24.INSTANCE);
        RouteSpec routeSpec21 = new RouteSpec("connect", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, anonymousClass13, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$25.INSTANCE);
        RouteSpec routeSpec22 = new RouteSpec("disconnect", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, anonymousClass13, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$26.INSTANCE);
        RouteSpec routeSpec23 = new RouteSpec("connectors", "hatch", null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, null, new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$27(auraDeeplinkRouteMapper), false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$28.INSTANCE);
        RouteSpec routeSpec24 = new RouteSpec("connectors", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, null, new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$29(auraDeeplinkRouteMapper), false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$30.INSTANCE);
        AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$31 auraDeeplinkRouteMapper$commonSessionedRouteSpecs$31 = AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$31.INSTANCE;
        RouteSpec.AnonymousClass1 anonymousClass14 = RouteSpec.AnonymousClass1.INSTANCE;
        List<RouteSpec> listAsList = Arrays.asList(routeSpec, routeSpec2, routeSpec3, routeSpec4, routeSpec5, routeSpec6, routeSpec7, routeSpec8, routeSpec9, routeSpec10, routeSpec11, routeSpec12, routeSpec13, routeSpec14, routeSpec15, routeSpec16, routeSpec17, routeSpec18, routeSpec19, routeSpec20, routeSpec21, routeSpec22, routeSpec23, routeSpec24, new RouteSpec(OAUTH_CALLBACK_ROUTE, null, "/api/hatch/oauth/callback", auraDeeplinkAccessScope3, auraDeeplinkAccessScope, null, anonymousClass14, false, auraDeeplinkRouteMapper$commonSessionedRouteSpecs$31), new RouteSpec(CONNECT_COMPLETE_ROUTE, null, "/connect/complete", auraDeeplinkAccessScope3, auraDeeplinkAccessScope, null, anonymousClass14, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$32.INSTANCE), new RouteSpec("stripe_link", null, "/stripe_link/connect/complete", auraDeeplinkAccessScope3, auraDeeplinkAccessScope, null, anonymousClass14, false, AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$33.INSTANCE));
        commonSessionedRouteSpecs = listAsList;
        sessionedRouteSpecs = AbstractC0878AGe.A0P(auraDeeplinkRouteMapper.providedSessionedRouteSpecs(), listAsList);
        WORKSPACE_PATH_REGEX = C06827l3.A02(".*\\.[A-Za-z0-9]+$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute chatRoute(Uri uri, AbstractC3358CGz abstractC3358CGz) {
        String queryParameter;
        HatchNotificationDeeplinkHandler hatchNotificationDeeplinkHandler = HatchNotificationDeeplinkHandler.INSTANCE;
        HatchNotificationDeeplinkHandler.StructuredPrompt structuredPromptStructuredPromptFromChatDeeplink = hatchNotificationDeeplinkHandler.structuredPromptFromChatDeeplink(uri);
        if (structuredPromptStructuredPromptFromChatDeeplink == null && (queryParameter = uri.getQueryParameter("prompt")) != null) {
            if (queryParameter.length() > chatRoute$lambda$0$0(AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.hatch_gtm.chat_share_prompt_max_length))) {
                return null;
            }
        }
        return new AuraDeeplinkRoute(hatchNotificationDeeplinkHandler.approvalIdFromChatDeeplink(uri) != null ? ConversationTabScreenKey.INSTANCE : hatchNotificationDeeplinkHandler.handleChatDeeplink(uri, structuredPromptStructuredPromptFromChatDeeplink, abstractC3358CGz), LaunchFlag.REPLACE_BACKSTACK, null);
    }

    public static final long chatRoute$lambda$0$0(C31u<Object, Long> c31u) {
        return C3cG.A05(C31u.A00(c31u, $$delegatedProperties));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String inviteCode(Uri uri) {
        String queryParameter = uri.getQueryParameter(CODE_PARAM);
        if (queryParameter != null && !C7BY.A0j(queryParameter)) {
            return queryParameter;
        }
        String str = (String) AbstractC0878AGe.A0A(1, AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri));
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute libraryRoute(Uri uri) {
        LibrarySegment librarySegmentFromWire = LibrarySegment.Companion.fromWire(uri.getQueryParameter("tab"));
        if (librarySegmentFromWire != null) {
            HatchPendingLibrarySegment.INSTANCE.request(librarySegmentFromWire);
        }
        return new AuraDeeplinkRoute(LibraryScreenKey.INSTANCE, LaunchFlag.BRING_TO_FRONT, null);
    }

    private final BaseRouteSpec matchingRouteSpec(Uri uri) {
        SessionlessRouteSpec sessionlessRouteSpec = (SessionlessRouteSpec) specForUri(sessionlessRouteSpecs, uri);
        if (sessionlessRouteSpec != null && AnonymousClass003.A1X(uri, sessionlessRouteSpec.getHasRoute())) {
            return sessionlessRouteSpec;
        }
        RouteSpec routeSpec = (RouteSpec) specForUri(sessionedRouteSpecs, uri);
        if (routeSpec == null || !AnonymousClass003.A1X(uri, routeSpec.getHasRoute())) {
            return null;
        }
        return routeSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute skillConnectRoute(Uri uri) {
        if (CustomConnectorLinkParser.INSTANCE.tryParse(C60O.A0o(uri)) != null) {
            F0C<C9hr<Object>>[] f0cArr = CustomConnectorAuthSheetKey.$childSerializers;
            return new AuraDeeplinkRoute(new CustomConnectorAuthSheetKey(C60O.A0o(uri), HatchSkillOAuthOrigin.CHAT, null), LaunchFlag.NAVIGATE, null);
        }
        String strExtractDirectOAuthSkillConnectIdentifier = SkillConnectConfigKt.extractDirectOAuthSkillConnectIdentifier(C60O.A0o(uri));
        if (strExtractDirectOAuthSkillConnectIdentifier == null && (strExtractDirectOAuthSkillConnectIdentifier = SkillConnectConfigKt.extractSkillConnectIdentifier(C60O.A0o(uri))) == null) {
            return null;
        }
        return new AuraDeeplinkRoute(new SkillConnectDisconnectRouterScreenKey(strExtractDirectOAuthSkillConnectIdentifier, true, null, HatchSkillOAuthOrigin.CHAT, null, false), LaunchFlag.NAVIGATE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasConnectorRoute(Uri uri) {
        return (SkillConnectConfigKt.extractConnectorAccountLinkIdentifier(C60O.A0o(uri)) == null && skillConnectRoute(uri) == null && skillDisconnectRoute(uri) == null) ? false : true;
    }

    private final boolean isAppLaunchHost(Uri uri) {
        String host;
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("https") && (host = uri.getHost()) != null && host.equalsIgnoreCase(APP_LAUNCH_HOST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isWorkspaceRelativePath(String str) {
        if (Uri.parse(str).getScheme() == null) {
            return C7BY.A0k(str, '/') || WORKSPACE_PATH_REGEX.A08(str);
        }
        return false;
    }

    private final List<RouteSpec> providedSessionedRouteSpecs() {
        int[] iArrA0m = AnonymousClass801.A0m();
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        do {
            List<AuraDeeplinkRouteSpec> listA0O = AnonymousClass801.A0O(iArrA0m[i]);
            C7384Etj.A0U(listA0O);
            ArrayList arrayListA0i = AnonymousClass003.A0i(listA0O);
            for (AuraDeeplinkRouteSpec auraDeeplinkRouteSpec : listA0O) {
                arrayListA0i.add(new RouteSpec(auraDeeplinkRouteSpec.routeName, auraDeeplinkRouteSpec.scheme, auraDeeplinkRouteSpec.exactPath, auraDeeplinkRouteSpec.hatchAccessScope, auraDeeplinkRouteSpec.httpsAccessScope, auraDeeplinkRouteSpec.fallbackMatch, auraDeeplinkRouteSpec.hasRoute, auraDeeplinkRouteSpec.resolvesAfterActivation, new AuraDeeplinkRouteMapper$providedSessionedRouteSpecs$1$1$1(auraDeeplinkRouteSpec)));
            }
            AbstractC0882AGj.A0r(arrayListA0i, arrayListA0h);
            i++;
        } while (i < 14);
        return arrayListA0h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute skillDisconnectRoute(Uri uri) {
        String strExtractSkillDisconnectIdentifier = SkillConnectConfigKt.extractSkillDisconnectIdentifier(C60O.A0o(uri));
        if (strExtractSkillDisconnectIdentifier == null) {
            return null;
        }
        return new AuraDeeplinkRoute(new SkillConnectDisconnectRouterScreenKey(strExtractSkillDisconnectIdentifier, false, null, HatchSkillOAuthOrigin.SETTINGS, null, false), LaunchFlag.NAVIGATE, null);
    }

    private final <T extends BaseRouteSpec> T specForUri(List<? extends T> list, Uri uri) {
        T t;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        String strNormalizedRoutePath = AuraDeeplinkRouteMapperKt.normalizedRoutePath(uri);
        ArrayList arrayListA0h = C3cG.A0h();
        for (T t2 : list) {
            T t3 = t2;
            if (t3.getScheme() != null && AbstractC2159Azp.A12(uri.getScheme(), t3.getScheme(), true)) {
                arrayListA0h.add(t2);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (T t4 : list) {
            if (t4.getScheme() == null) {
                arrayListA0h2.add(t4);
            }
        }
        Iterator it = arrayListA0h.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(((BaseRouteSpec) next).getExactPath(), strNormalizedRoutePath)) {
                break;
            }
        }
        T t5 = (T) next;
        if (t5 == null) {
            Iterator it2 = arrayListA0h2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (C7384Etj.areEqual(((BaseRouteSpec) next2).getExactPath(), strNormalizedRoutePath)) {
                    break;
                }
            }
            t5 = (T) next2;
            if (t5 == null) {
                String strA0Y = C7BY.A0Y(strNormalizedRoutePath, '/');
                String strA0S = C7BY.A0S(strA0Y, strA0Y, '/');
                if (C7BY.A0j(strA0S)) {
                    strA0S = null;
                }
                Iterator it3 = arrayListA0h.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (C7384Etj.areEqual(((BaseRouteSpec) next3).getRouteName(), strA0S)) {
                        break;
                    }
                }
                t5 = (T) next3;
                if (t5 == null) {
                    Iterator it4 = arrayListA0h2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it4.next();
                        if (C7384Etj.areEqual(((BaseRouteSpec) next4).getRouteName(), strA0S)) {
                            break;
                        }
                    }
                    t5 = (T) next4;
                    if (t5 == null) {
                        Iterator<? extends T> it5 = list.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            T next5 = it5.next();
                            G0U<Uri, Boolean> fallbackMatch = next5.getFallbackMatch();
                            if (fallbackMatch != null && AnonymousClass003.A1X(uri, fallbackMatch)) {
                                t = next5;
                                break;
                            }
                        }
                        return t;
                    }
                }
            }
        }
        return t5;
    }

    public final String connectorAccountLinkIdentifierForUri(Uri uri) {
        RouteSpec routeSpec;
        String strA0f = C60R.A0f(uri);
        C7384Etj.A0U(strA0f);
        String strExtractConnectorAccountLinkIdentifier = SkillConnectConfigKt.extractConnectorAccountLinkIdentifier(strA0f);
        if (strExtractConnectorAccountLinkIdentifier == null || (routeSpec = (RouteSpec) specForUri(sessionedRouteSpecs, uri)) == null || !AnonymousClass003.A1X(uri, routeSpec.getHasRoute()) || !"connectors".equals(routeSpec.getRouteName())) {
            return null;
        }
        return strExtractConnectorAccountLinkIdentifier;
    }

    public final String matchedRoutePath$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(Uri uri, BaseRouteSpec baseRouteSpec) {
        G0U<Uri, Boolean> fallbackMatch;
        boolean zA1Y = C60P.A1Y(uri, baseRouteSpec);
        String exactPath = baseRouteSpec.getExactPath();
        return (exactPath == null || (fallbackMatch = baseRouteSpec.getFallbackMatch()) == null || AnonymousClass003.A1X(uri, fallbackMatch) != zA1Y) ? AuraDeeplinkRouteMapperKt.normalizedRoutePath(uri) : exactPath;
    }

    public final AuraDeeplinkRoute routeForSessionedUri(Uri uri, AbstractC3358CGz abstractC3358CGz) {
        RouteSpec routeSpec;
        AnonymousClass003.A0u(uri, abstractC3358CGz);
        if (isAppLaunchHost(uri) || (routeSpec = (RouteSpec) specForUri(sessionedRouteSpecs, uri)) == null || !AnonymousClass003.A1X(uri, routeSpec.getHasRoute())) {
            return null;
        }
        return routeSpec.executeRoute.invoke(uri, AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri), abstractC3358CGz);
    }
}

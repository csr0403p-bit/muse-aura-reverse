package com.facebook.aura.graphql;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3357CGy;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CH0;
import X.CPS;
import X.DYI;
import X.EnumC3451CNw;
import X.Ey9;
import X.F0C;
import X.F0T;
import X.InterfaceC5106DYe;
import X.InterfaceC5107DYf;
import com.facebook.aura.appid.AuraClientToken;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.network.sandbox.AuraSandbox;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLService {
    public static final String ABRA_GRAPHQL_URL_PROD = "https://graph.meta.ai/graphql";
    public static final String FRL_GRAPHQL_URL_PROD = "https://meta.graph.meta.com/graphql";
    public static final AuraGraphQLService INSTANCE = new AuraGraphQLService();
    public static final ConcurrentHashMap<GqlExecutorKey, AuraGraphQLQueryExecutor> executorCache = C60O.A1C();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AuthMode {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AuthMode[] $VALUES;
        public static final AuthMode ABRA_SESSION;
        public static final AuthMode FRL_OR_LOGGED_OUT;
        public static final AuthMode FRL_REQUIRED;

        static {
            AuthMode authMode = new AuthMode("ABRA_SESSION", 0);
            ABRA_SESSION = authMode;
            AuthMode authMode2 = new AuthMode("FRL_OR_LOGGED_OUT", 1);
            FRL_OR_LOGGED_OUT = authMode2;
            AuthMode authMode3 = new AuthMode("FRL_REQUIRED", 2);
            FRL_REQUIRED = authMode3;
            AuthMode[] authModeArr = {authMode, authMode2, authMode3};
            $VALUES = authModeArr;
            $ENTRIES = C3cG.A0w(authModeArr);
        }

        public static Ey9<AuthMode> getEntries() {
            return $ENTRIES;
        }

        public static AuthMode valueOf(String str) {
            return (AuthMode) Enum.valueOf(AuthMode.class, str);
        }

        public static AuthMode[] values() {
            return (AuthMode[]) $VALUES.clone();
        }

        public AuthMode(String str, int i) {
        }
    }

    public final class GqlExecutorKey extends C06G {
        public final AuthMode authMode;
        public final String buildConfigName;
        public final String url;
        public final String userId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof GqlExecutorKey) {
                    GqlExecutorKey gqlExecutorKey = (GqlExecutorKey) obj;
                    if (!C7384Etj.areEqual(this.buildConfigName, gqlExecutorKey.buildConfigName) || !C7384Etj.areEqual(this.url, gqlExecutorKey.url) || !C7384Etj.areEqual(this.userId, gqlExecutorKey.userId) || this.authMode != gqlExecutorKey.authMode) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ GqlExecutorKey copy$default(GqlExecutorKey gqlExecutorKey, String str, String str2, String str3, AuthMode authMode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gqlExecutorKey.buildConfigName;
            }
            if ((i & 2) != 0) {
                str2 = gqlExecutorKey.url;
            }
            if ((i & 4) != 0) {
                str3 = gqlExecutorKey.userId;
            }
            if ((i & 8) != 0) {
                authMode = gqlExecutorKey.authMode;
            }
            AnonymousClass005.A0y(str, str2, authMode);
            return new GqlExecutorKey(str, str2, str3, authMode);
        }

        public final String component1() {
            return this.buildConfigName;
        }

        public final String component2() {
            return this.url;
        }

        public final String component3() {
            return this.userId;
        }

        public final AuthMode component4() {
            return this.authMode;
        }

        public final AuthMode getAuthMode() {
            return this.authMode;
        }

        public final String getBuildConfigName() {
            return this.buildConfigName;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.authMode, (AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.buildConfigName)) + AnonymousClass006.A0G(this.userId)) * 31);
        }

        public GqlExecutorKey(String str, String str2, String str3, AuthMode authMode) {
            AnonymousClass005.A0y(str, str2, authMode);
            this.buildConfigName = str;
            this.url = str2;
            this.userId = str3;
            this.authMode = authMode;
        }

        public final GqlExecutorKey copy(String str, String str2, String str3, AuthMode authMode) {
            AnonymousClass005.A0y(str, str2, authMode);
            return new GqlExecutorKey(str, str2, str3, authMode);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLService$abraInstance$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String strA0z;
            AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
            return (currentUserSession == null || (strA0z = C3357CGy.A0z(currentUserSession)) == null) ? AuraClientToken.loggedOutFRLAccessToken : strA0z;
        }
    }

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLService$bloksInstance$1, reason: invalid class name and case insensitive filesystem */
    public final class C121891 extends AbstractC7559F3s implements Function0<String> {
        public static final C121891 INSTANCE = new C121891();

        public C121891() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String metaAccessToken = AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken();
            return metaAccessToken == null ? AuraClientToken.loggedOutFRLAccessToken : metaAccessToken;
        }
    }

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLService$frlInstance$1, reason: invalid class name and case insensitive filesystem */
    public final class C121911 extends AbstractC7559F3s implements Function0<String> {
        public static final C121911 INSTANCE = new C121911();

        public C121911() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String metaAccessToken = AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken();
            return metaAccessToken == null ? AuraClientToken.loggedOutFRLAccessToken : metaAccessToken;
        }
    }

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLService$frlWithAbraBuildConfigInstance$1, reason: invalid class name and case insensitive filesystem */
    public final class C121921 extends AbstractC7559F3s implements Function0<String> {
        public static final C121921 INSTANCE = new C121921();

        public C121921() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String metaAccessToken = AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken();
            return metaAccessToken == null ? AuraClientToken.loggedOutFRLAccessToken : metaAccessToken;
        }
    }

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLService$iapInstance$1, reason: invalid class name and case insensitive filesystem */
    public final class C121931 extends AbstractC7559F3s implements Function0<String> {
        public static final C121931 INSTANCE = new C121931();

        public C121931() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String metaAccessToken = AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken();
            return metaAccessToken == null ? AuraClientToken.loggedOutFRLAccessToken : metaAccessToken;
        }
    }

    public final AuraGraphQLQueryExecutor abraInstance(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return cachedExecutor(AuraGraphQLExecutorFactory.ABRA_ANDROID_BUILD_CONFIG, getAbraGraphqlUrl(), abstractC3358CGz, AuthMode.ABRA_SESSION, AnonymousClass1.INSTANCE);
    }

    public final InterfaceC5107DYf bloksInstance() {
        return cachedExecutor(AuraGraphQLExecutorFactory.MWA_FRL_ANDROID_BUILD_CONFIG, getFrlGraphqlUrl(), AuraUserSessionStore.INSTANCE.getCurrentUserSession(), AuthMode.FRL_OR_LOGGED_OUT, C121891.INSTANCE);
    }

    public final InterfaceC5107DYf frlInstance() {
        return cachedExecutor(AuraGraphQLExecutorFactory.MWA_FRL_ANDROID_BUILD_CONFIG, getFrlGraphqlUrl(), AuraUserSessionStore.INSTANCE.getCurrentUserSession(), AuthMode.FRL_REQUIRED, C121911.INSTANCE);
    }

    public final InterfaceC5107DYf frlWithAbraBuildConfigInstance(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return cachedExecutor(AuraGraphQLExecutorFactory.ABRA_ANDROID_BUILD_CONFIG, getFrlGraphqlUrl(), abstractC3358CGz, AuthMode.FRL_REQUIRED, C121921.INSTANCE);
    }

    public final InterfaceC5107DYf iapInstance() {
        return cachedExecutor(AuraGraphQLExecutorFactory.ABRA_ANDROID_BUILD_CONFIG, getFrlGraphqlUrl(), AuraUserSessionStore.INSTANCE.getCurrentUserSession(), AuthMode.FRL_OR_LOGGED_OUT, C121931.INSTANCE);
    }

    private final AuraGraphQLQueryExecutor cachedExecutor(final String str, final String str2, final AbstractC3358CGz abstractC3358CGz, AuthMode authMode, final Function0<String> function0) {
        AuraGraphQLQueryExecutor auraGraphQLQueryExecutorComputeIfAbsent = executorCache.computeIfAbsent(new GqlExecutorKey(str, str2, abstractC3358CGz != null ? ((CH0) abstractC3358CGz).A01 : null, authMode), new Function() { // from class: com.facebook.aura.graphql.AuraGraphQLService.cachedExecutor.1
            @Override // java.util.function.Function
            public final AuraGraphQLQueryExecutor apply(GqlExecutorKey gqlExecutorKey) {
                AuraGraphQLExecutorFactory auraGraphQLExecutorFactory = AuraGraphQLExecutorFactory.INSTANCE;
                auraGraphQLExecutorFactory.init();
                int i = AuraTigonServiceProvider.GATEWAY_STREAM_OPEN_PING_TIMEOUT_MS;
                return new AuraGraphQLQueryExecutor(auraGraphQLExecutorFactory.create(F0C.A02().A00, AuraGraphQLService$cachedExecutor$1$pandoExecutor$1.INSTANCE, str2, function0, str, abstractC3358CGz, new AuraGraphQLService$cachedExecutor$1$pandoExecutor$2(AuraLanguageHeaderUtil.INSTANCE), false));
            }
        });
        C7384Etj.A0U(auraGraphQLQueryExecutorComputeIfAbsent);
        return auraGraphQLQueryExecutorComputeIfAbsent;
    }

    private final String getAbraGraphqlUrl() {
        AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
        return auraSandbox.rewriteUrl("https://graph.meta.ai/graphql", auraSandbox.getGraphqlHost());
    }

    private final String getFrlGraphqlUrl() {
        AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
        return auraSandbox.rewriteUrl(FRL_GRAPHQL_URL_PROD, auraSandbox.getGraphqlHost());
    }

    public final void clearCache$fbandroid_express_aura_java_com_facebook_aura_graphql_graphql() {
        executorCache.clear();
    }

    public final <T> InterfaceC5106DYe execute(AbstractC3358CGz abstractC3358CGz, DYI<T> dyi, F0T<T> f0t, CPS cps, Executor executor) {
        AnonymousClass005.A0x(abstractC3358CGz, dyi, f0t);
        C7384Etj.A0Y(executor, 4);
        return abraInstance(abstractC3358CGz).execute(dyi, f0t, cps, executor);
    }

    public final <T> InterfaceC5106DYe execute(AbstractC3358CGz abstractC3358CGz, DYI<T> dyi, F0T<T> f0t, CPS cps) {
        AnonymousClass005.A0x(abstractC3358CGz, dyi, f0t);
        return abraInstance(abstractC3358CGz).execute(dyi, f0t, cps, EnumC3451CNw.A01);
    }
}

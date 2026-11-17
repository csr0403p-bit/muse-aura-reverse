package com.facebook.aura.graphql;

import X.AbstractC0878AGe;
import X.AbstractC3081BxN;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV5;
import X.BWN;
import X.C0881AGi;
import X.C31u;
import X.C3cG;
import X.C3cH;
import X.C5120DZw;
import X.C5322DgG;
import X.C60N;
import X.C7384Etj;
import X.C7BY;
import X.CGM;
import X.DYp;
import X.DYx;
import X.DZ0;
import X.DZ8;
import X.F0C;
import X.FGI;
import X.G0V;
import X.HxE;
import X.InterfaceC7359EnW;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.graphql.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.graphql.query.JSONPersistedQueryProvider;
import com.facebook.pando.ConnectionManager;
import com.facebook.pando.PandoConnectionService;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoConsistencyStackJNI;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoParseConfig;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.pando.primaryexecution.analytics.PandoAnalyticsService;
import com.facebook.pando.primaryexecution.cache.PandoCacheService;
import com.facebook.pando.primaryexecution.cache.PandoCacheTimeoutService;
import com.facebook.pando.primaryexecution.cache.PandoResponseCache;
import com.facebook.pando.primaryexecution.cancelledcallbacks.PandoCancelledCallbacksService;
import com.facebook.pando.primaryexecution.networksequencing.PandoNetworkSequencingService;
import com.facebook.pando.primaryexecution.renderfromstore.PandoRFSService;
import com.facebook.pando.primaryexecution.tigon.PandoTigonConfig;
import com.facebook.pando.primaryexecution.tigon.PandoTigonService;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLExecutorFactory {
    public static final String TAG = "AuraGraphQLExecutorFactory";
    public static volatile boolean initialized;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(AuraGraphQLExecutorFactory.class, "flatbufferBackedDocIdsEnabled", "getFlatbufferBackedDocIdsEnabled()Z"), C3cG.A0y(AuraGraphQLExecutorFactory.class, "ossParsingEnabled", "getOssParsingEnabled()Z"), C3cG.A0y(AuraGraphQLExecutorFactory.class, "consistencyBlocklistPaths", "getConsistencyBlocklistPaths()Ljava/lang/String;")};
    public static final AuraGraphQLExecutorFactory INSTANCE = new AuraGraphQLExecutorFactory();
    public static final String ABRA_ANDROID_BUILD_CONFIG = "abra-android";
    public static final String COMPANION_AR_BUILD_CONFIG = "companion-ar";
    public static final String MWA_FRL_ANDROID_BUILD_CONFIG = "frl-android";
    public static final List<String> BUILD_CONFIGS = BV5.A12(ABRA_ANDROID_BUILD_CONFIG, COMPANION_AR_BUILD_CONFIG, MWA_FRL_ANDROID_BUILD_CONFIG);
    public static final F0C timerExecutor$delegate = AbstractC5321DgF.A03(AuraGraphQLExecutorFactory$timerExecutor$2.INSTANCE);
    public static final C31u flatbufferBackedDocIdsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_android_pando_graphql_configs.enable_flatbuffer_backed_client_doc_ids);
    public static final C31u ossParsingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.mwa_android_pando_graphql_configs.enable_oss_parsing);
    public static final C31u consistencyBlocklistPaths$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.mwa_android_pando_graphql_configs.consistency_blocklist_paths);

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLExecutorFactory$create$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return "";
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLExecutorFactory$createPrimaryExecution$1, reason: invalid class name and case insensitive filesystem */
    public final class C121871 extends AbstractC7559F3s implements G0V<String, String, Map<String, ? extends String>> {
        public final /* synthetic */ Function0<String> $acceptedLanguageHeader;
        public final /* synthetic */ boolean $skipOAuthPrefix;
        public final /* synthetic */ Function0<String> $token;
        public final /* synthetic */ Function0<String> $userAgent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121871(Function0<String> function0, boolean z, Function0<String> function02, Function0<String> function03) {
            super(2);
            this.$token = function0;
            this.$skipOAuthPrefix = z;
            this.$userAgent = function02;
            this.$acceptedLanguageHeader = function03;
        }

        @Override // X.G0V
        public final Map<String, String> invoke(String str, String str2) {
            String strInvoke = this.$token.invoke();
            if (!this.$skipOAuthPrefix) {
                strInvoke = FGI.A0M("OAuth ", strInvoke);
            }
            HxE hxEA0r = C3cG.A0r("Authorization", strInvoke);
            HxE hxEA0r2 = C3cG.A0r("User-Agent", this.$userAgent.invoke());
            return C3cH.A0m(C60N.A00(40), this.$acceptedLanguageHeader.invoke(), hxEA0r, hxEA0r2);
        }
    }

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLExecutorFactory$init$1, reason: invalid class name and case insensitive filesystem */
    public final class C121881 extends AbstractC7559F3s implements Function0<CGM> {
        public final /* synthetic */ String $config;

        /* renamed from: com.facebook.aura.graphql.AuraGraphQLExecutorFactory$init$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01801 extends AbstractC7559F3s implements Function0<CGM> {
            public final /* synthetic */ String $config;
            public final /* synthetic */ boolean $enableFlatbufferBackedDocIDs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01801(boolean z, String str) {
                super(0);
                this.$enableFlatbufferBackedDocIDs = z;
                this.$config = str;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CGM invoke() {
                return this.$enableFlatbufferBackedDocIDs ? AbstractC3081BxN.A00().A02(this.$config) : new JSONPersistedQueryProvider(C3cG.A06(), this.$config);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121881(String str) {
            super(0);
            this.$config = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CGM invoke() {
            return new AuraPersistedQueryProvider(C5322DgG.A01((Function0) new C01801(AuraGraphQLExecutorFactory.INSTANCE.getFlatbufferBackedDocIdsEnabled(), this.$config)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PandoConsistencyServiceJNI createConsistencyService() {
        return PandoConsistencyServiceJNI.create(PandoConsistencyStackJNI.create(false, 0, false, false, C0881AGi.A00, false), AuraExecutors.INSTANCE.createSerialExecutor(), 0, false, 500, false, 0, false, false, false, 0, false, "", false, false, false);
    }

    public final DYp create(TigonServiceHolder tigonServiceHolder, Function0<String> function0, String str, Function0<String> function02, String str2, AbstractC3358CGz abstractC3358CGz, Function0<String> function03, boolean z) {
        C7384Etj.A0Y(tigonServiceHolder, 0);
        AnonymousClass005.A11(function0, str, function02, 1);
        C7384Etj.A0Y(str2, 4);
        C7384Etj.A0Y(function03, 6);
        boolean ossParsingEnabled = getOssParsingEnabled();
        C5322DgG c5322DgGA03 = AbstractC5321DgF.A03(AuraGraphQLExecutorFactory$create$connectionManager$1.INSTANCE);
        C5322DgG c5322DgGA032 = AbstractC5321DgF.A03(AuraGraphQLExecutorFactory$create$consistency$1.INSTANCE);
        C5322DgG c5322DgGA01 = C5322DgG.A01((Function0) new AuraGraphQLExecutorFactory$create$primaryExecution$1(tigonServiceHolder, function0, function02, abstractC3358CGz, c5322DgGA03, c5322DgGA032, function03, str2, ossParsingEnabled, z, str));
        List listA0e = C7BY.A0e(getConsistencyBlocklistPaths(), ", ");
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0e);
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(AbstractC0878AGe.A0X(C7BY.A0e(AnonymousClass005.A0j(it), ".")));
        }
        return new DYp(new DZ0(c5322DgGA03), AbstractC3081BxN.A00().A02(str2), new DYx(arrayListA0i), AuraExecutors.INSTANCE.createSerialExecutor(), c5322DgGA01, c5322DgGA032, ossParsingEnabled);
    }

    public final synchronized void init() {
        if (!initialized) {
            initialized = true;
            AbstractC3081BxN.A01(C3cG.A06(), BWN.A02);
            for (String str : BUILD_CONFIGS) {
                C121881 c121881 = new C121881(str);
                C7384Etj.A0Y(str, 0);
                AbstractMap abstractMap = DZ8.A00;
                if (!abstractMap.containsKey(str)) {
                    abstractMap.put(str, c121881.invoke());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DYp create$default(AuraGraphQLExecutorFactory auraGraphQLExecutorFactory, TigonServiceHolder tigonServiceHolder, Function0 function0, String str, Function0 function02, String str2, AbstractC3358CGz abstractC3358CGz, Function0 function03, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            abstractC3358CGz = null;
        }
        if ((i & 64) != 0) {
            function03 = AnonymousClass1.INSTANCE;
        }
        return auraGraphQLExecutorFactory.create(tigonServiceHolder, function0, str, function02, str2, abstractC3358CGz, function03, C3cG.A1K(i & 128, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PandoPrimaryExecution createPrimaryExecution(TigonServiceHolder tigonServiceHolder, Function0<String> function0, Function0<String> function02, Function0<String> function03, AbstractC3358CGz abstractC3358CGz, F0C<ConnectionManager> f0c, F0C<PandoGraphQLConsistencyJNI> f0c2, Function0<String> function04, String str, boolean z, boolean z2) {
        PandoResponseCache pandoResponseCache = PandoResponseCache.$redex_init_class;
        int i = AuraExecutors.CORE_POOL_SIZE;
        PandoResponseCache pandoResponseCache2 = new PandoResponseCache(new AuraExecutors.SerialExecutor(F0C.A05()), new AuraGraphQLCacheFileStash(str, abstractC3358CGz));
        PandoTigonService pandoTigonService = PandoTigonService.$redex_init_class;
        Executor executorA06 = F0C.A06(AuraExecutors.backgroundThreadExecutor$delegate);
        C5120DZw c5120DZwA02 = AbstractC3081BxN.A00().A02(str);
        PandoTigonConfig pandoTigonConfig = new PandoTigonConfig(new C121871(function03, z2, function0, function04), function02, false, false, false, false);
        PandoParseConfig pandoParseConfig = new PandoParseConfig(false, false, null);
        AnonymousClass005.A11(tigonServiceHolder, executorA06, c5120DZwA02, 1);
        PandoCacheService pandoCacheService = new PandoCacheService(PandoCacheService.initHybridData(new PandoNetworkSequencingService(PandoNetworkSequencingService.initHybridData(new PandoTigonService(PandoTigonService.initHybridData("", tigonServiceHolder, executorA06, C5120DZw.A00(c5120DZwA02), pandoParseConfig, pandoTigonConfig, z)))), pandoResponseCache2, null));
        PandoCacheTimeoutService pandoCacheTimeoutService = PandoCacheTimeoutService.$redex_init_class;
        PandoCacheTimeoutService pandoCacheTimeoutService2 = new PandoCacheTimeoutService(pandoCacheService, pandoResponseCache2, (ScheduledExecutorService) timerExecutor$delegate.getValue());
        PandoRFSService pandoRFSService = PandoRFSService.$redex_init_class;
        PandoGraphQLConsistencyJNI value = f0c2.getValue();
        C7384Etj.A0Y(value, 1);
        PandoRFSService pandoRFSService2 = new PandoRFSService(PandoRFSService.initHybridData(pandoCacheTimeoutService2, value));
        PandoConnectionService pandoConnectionService = PandoConnectionService.$redex_init_class;
        ConnectionManager value2 = f0c.getValue();
        C7384Etj.A0Y(value2, 1);
        return new PandoAnalyticsService(PandoAnalyticsService.initHybridData(new PandoCancelledCallbacksService(PandoCancelledCallbacksService.initHybridData(new PandoConnectionService(PandoConnectionService.initHybridData(pandoRFSService2, value2)))), 3213622));
    }

    private final String getConsistencyBlocklistPaths() {
        return BV5.A0m(this, consistencyBlocklistPaths$delegate, $$delegatedProperties, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFlatbufferBackedDocIdsEnabled() {
        return C31u.A01(this, flatbufferBackedDocIdsEnabled$delegate, $$delegatedProperties, 0);
    }

    private final Executor getFlipperExecutor() {
        return null;
    }

    private final boolean getOssParsingEnabled() {
        return C31u.A01(this, ossParsingEnabled$delegate, $$delegatedProperties, 1);
    }

    private final ScheduledExecutorService getTimerExecutor() {
        return (ScheduledExecutorService) timerExecutor$delegate.getValue();
    }
}

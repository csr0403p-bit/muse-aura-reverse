package com.facebook.aura.network.tigon;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.DCW;
import X.ERV;
import X.F0C;
import X.InterfaceC3290C9q;
import com.crossapp.tigonhttp.TigonHttpClientConfig;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.crossapp.tigonhttp.noise.TigonHttpClientWithNoise$TigonHttpClientWithNoiseServiceHolder;
import com.facebook.aura.analytics.impl.AuraTigonXAnalyticsProviderImpl;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.tigon.interceptor.AuraTigonInterceptorsHolder;
import com.facebook.aura.network.tigon.prioritization.AuraHttpPriorityCalculatorProvider;
import com.facebook.aura.network.tigon.prioritization.AuraHttpPriorityContextInterceptor;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.interceptors.TigonXplatInterceptorsHolder;
import com.facebook.tigon.interceptors.deviceidentifiers.DeviceIdentifiersInterceptor;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.tigon.unexpectedeventreporter.TigonUnexpectedEventReporter;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class AuraTigonServiceProvider {
    public static final int GATEWAY_STREAM_OPEN_PING_TIMEOUT_MS = 8000;
    public static final int SCOPED_NOISE_IDENTITY_PROBE_POOL_SIZE = 5;
    public static final int SCOPED_VM_CHANNEL_POOL_SIZE = 4;
    public static final List<F0C<ScopedNoiseIdentityProbeResources>> scopedNoiseIdentityProbeResourceHolders;
    public static final List<F0C<ScopedNoiseIdentityProbeResources>> scopedVmChannelResourceHolders;
    public static final F0C tigonHttpClient$delegate;
    public static final AuraTigonServiceProvider INSTANCE = new AuraTigonServiceProvider();
    public static final String gatewayIngressHostsRegex = AbstractC0878AGe.A0L("|", "^(", ")$", HatchGatewayIngressHostsKt.HATCH_GATEWAY_INGRESS_HOSTS, AuraTigonServiceProvider$gatewayIngressHostsRegex$1.INSTANCE);
    public static final DeviceIdentifiersInterceptor deviceIdentifiersInterceptor = new DeviceIdentifiersInterceptor();

    public final boolean preconnect(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            return false;
        }
        try {
            DCW dcwA02 = F0C.A02();
            String strA0l = AnonymousClass002.A0l(str);
            C7384Etj.A0Y(strA0l, 0);
            dcwA02.A00.preconnect(strA0l);
            objA0s = AnonymousClass001.A0i();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = false;
        }
        return AnonymousClass001.A1X(objA0s);
    }

    static {
        Integer num = C79.A00;
        tigonHttpClient$delegate = AbstractC5321DgF.A02(num, AuraTigonServiceProvider$tigonHttpClient$2.INSTANCE);
        ArrayList arrayListA11 = C60O.A11(5);
        int i = 0;
        int i2 = 0;
        do {
            arrayListA11.add(AbstractC5321DgF.A02(num, new AuraTigonServiceProvider$scopedNoiseIdentityProbeResourceHolders$1$1(i2)));
            i2++;
        } while (i2 < 5);
        scopedNoiseIdentityProbeResourceHolders = arrayListA11;
        ArrayList arrayListA112 = C60O.A11(4);
        do {
            arrayListA112.add(AbstractC5321DgF.A02(num, new AuraTigonServiceProvider$scopedVmChannelResourceHolders$1$1(i)));
            i++;
        } while (i < 4);
        scopedVmChannelResourceHolders = arrayListA112;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.crossapp.tigonhttp.TigonHttpClientConfig createConfig(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L1a
            android.content.Context r0 = X.C3cG.A06()
            java.io.File r0 = r0.getCacheDir()
            X.C7384Etj.A0U(r0)
            java.io.File r0 = X.CEV.A00(r0, r6)
            r0.mkdirs()
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L1c
        L1a:
            java.lang.String r0 = ""
        L1c:
            com.crossapp.tigonhttp.TigonHttpClientConfig r2 = new com.crossapp.tigonhttp.TigonHttpClientConfig
            r2.<init>(r0)
            java.lang.String r0 = "/settings/http/transparent_http_proxy"
            org.json.JSONObject r3 = X.C9X.A02(r0)
            java.lang.String r1 = ""
            if (r3 == 0) goto L32
            java.lang.String r0 = "value"
            java.lang.String r1 = r3.optString(r0, r1)
        L32:
            X.C7384Etj.A0U(r1)
            int r0 = r1.length()
            r4 = 1
            boolean r0 = X.AnonymousClass002.A1N(r0)
            r2.isRunningEndToEndTest = r0
            r2.proxyHostAndPortForE2ETest = r1
            r2.externalRequestInterceptorEnforceSanitization = r4
            com.facebook.aura.network.transport.tigon.AuraTigonConfigGatesImpl r6 = com.facebook.aura.network.transport.tigon.AuraTigonConfigGatesImpl.INSTANCE
            java.lang.String[] r0 = r6.externalRequestInterceptorAdditionalPlaintextAllowlist()
            X.C7384Etj.A0U(r0)
            r2.externalRequestInterceptorAdditionalPlaintextAllowlist = r0
            java.lang.String[] r0 = r6.externalRequestInterceptorAdditionalThirdPartyAllowlist()
            X.C7384Etj.A0U(r0)
            r2.externalRequestInterceptorAdditionalThirdPartyAllowlist = r0
            java.lang.String[] r0 = r6.externalRequestInterceptorCredentialDomainAllowlist()
            r2.setExternalRequestInterceptorCredentialDomainAllowlist(r0)
            com.facebook.aura.network.sandbox.AuraSandbox r5 = com.facebook.aura.network.sandbox.AuraSandbox.INSTANCE
            boolean r1 = r5.isGraphqlSandboxEnabled()
            boolean r0 = r5.isHttpSandboxEnabled()
            if (r1 != 0) goto L6d
            if (r0 == 0) goto L6f
        L6d:
            r2.trustSandboxCertificates = r4
        L6f:
            r0 = 25000(0x61a8, float:3.5032E-41)
            r2.quicKeepAliveTimeoutMs = r0
            r2.enableBugReport = r4
            java.lang.String r3 = "AuraCorrelationInterceptor"
            java.lang.String r1 = "AuraHttpPriorityContextInterceptor"
            java.lang.String r0 = "DeviceIdentifiersInterceptor"
            java.lang.String[] r0 = new java.lang.String[]{r3, r1, r0}
            r2.requestInterceptorsOrder = r0
            boolean r0 = r5.isGraphqlSandboxEnabled()
            if (r0 != 0) goto L8d
            boolean r0 = r5.isHttpSandboxEnabled()
            if (r0 == 0) goto L8f
        L8d:
            r2.forceHttp2 = r4
        L8f:
            r2.ohaiEnabled = r4
            r2.ohaiConfigProviderEnabled = r4
            java.lang.String r0 = "https://meta-ohttp-relay-prod.fastly-edge.com/"
            r2.ohaiProxyUrl = r0
            java.lang.String r0 = "https://meta-ohttp-relay-prod.fastly-edge.com/chunked/"
            r2.ohaiProxyChunkedUrl = r0
            java.lang.String r0 = "ALL"
            r2.ohaiAllowedGraphQLQueries = r0
            r2.ohaiOhttpTargetNewVip = r4
            r2.enableMnsWebSocketConnectionQpl = r4
            java.lang.String r1 = com.facebook.aura.network.tigon.AuraTigonServiceProvider.gatewayIngressHostsRegex
            r2.setForceHttp2HostsRegex(r1)
            r2.setHttp2MaxInFlightRequestsPerConnectionHostsRegex(r1)
            int r0 = r6.gatewayHttp2StreamsPerConnection()
            r2.http2MaxInFlightRequestsPerConnectionForHosts = r0
            r2.setLongLivedHostsRegex(r1)
            int r0 = r6.gatewayHttp2PingIntervalMs()
            r2.longLivedHostsHttp2PingIntervalMs = r0
            int r0 = r6.gatewayHttp2PingTimeoutMs()
            r2.longLivedHostsHttp2PingTimeoutMs = r0
            r2.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame = r4
            r0 = 8000(0x1f40, float:1.121E-41)
            r2.longLivedHostsHttp2StreamOpenPingTimeoutMs = r0
            boolean r0 = r6.gatewayHttp2StreamCloseRetiresQuietConnection()
            r2.longLivedHostsHttp2StreamCloseRetiresQuietConnection = r0
            int r0 = r6.gatewayHttp2EstablishTimeoutMs()
            r2.longLivedHostsEstablishTimeoutMs = r0
            int r0 = r6.gatewayHttp2TcpKeepAliveIdleSeconds()
            r2.longLivedHostsTcpKeepAliveIdleTimeSeconds = r0
            int r0 = r6.gatewayHttp2TcpKeepAliveIntervalSeconds()
            r2.longLivedHostsTcpKeepAliveIntervalSeconds = r0
            int r0 = r6.gatewayHttp2TcpKeepAliveRetryCount()
            r2.longLivedHostsTcpKeepAliveRetryCount = r0
            int r0 = r6.http2ConnectionFlowControlWindow()
            r2.http2ConnectionFlowControlWindow = r0
            int r0 = r6.http2StreamFlowControlWindow()
            r2.http2StreamFlowControlWindow = r0
            boolean r0 = r6.fizzEnabled()
            r2.fizzMobileEnabled = r0
            boolean r0 = r6.fizzPqcEnabled()
            r2.pqcEnabled = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.tigon.AuraTigonServiceProvider.createConfig(java.lang.String):com.crossapp.tigonhttp.TigonHttpClientConfig");
    }

    public static /* synthetic */ DCW createNoiseEnabledClient$default(AuraTigonServiceProvider auraTigonServiceProvider, String str, ScheduledExecutorService scheduledExecutorService, NoiseChannelManagerHolder noiseChannelManagerHolder, InterfaceC3290C9q interfaceC3290C9q, int i, Object obj) {
        if ((i & 8) != 0) {
            interfaceC3290C9q = null;
        }
        return auraTigonServiceProvider.createNoiseEnabledClient(str, scheduledExecutorService, noiseChannelManagerHolder, interfaceC3290C9q);
    }

    public final ScopedNoiseIdentityProbeResources getScopedNoiseIdentityProbeResources(int i) {
        return scopedNoiseIdentityProbeResourceHolders.get(i).getValue();
    }

    public final ScopedNoiseIdentityProbeResources getScopedVmChannelResources(int i) {
        return scopedVmChannelResourceHolders.get(i).getValue();
    }

    public final boolean shouldTrustSandboxCertificates$fbandroid_express_aura_java_com_facebook_aura_network_tigon_tigon(boolean z, boolean z2) {
        return z || z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DCW createNoiseEnabledClient(String str, ScheduledExecutorService scheduledExecutorService, NoiseChannelManagerHolder noiseChannelManagerHolder, InterfaceC3290C9q interfaceC3290C9q) {
        TigonHttpClientConfig tigonHttpClientConfigCreateConfig = createConfig(str);
        String value = AuraUserAgent.fullUserAgent.getValue();
        HucClient hucClient = new HucClient((ExecutorService) AuraExecutors.backgroundThreadExecutor$delegate.getValue(), null, null, 10000);
        XAnalyticsHolder xAnalyticsHolderProvide = AuraTigonXAnalyticsProviderImpl.INSTANCE.provide();
        TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder = TigonXplatInterceptorsHolder.$redex_init_class;
        AuraTigonInterceptorsHolder auraTigonInterceptorsHolder = new AuraTigonInterceptorsHolder(Arrays.asList(new AuraHttpPriorityContextInterceptor(), deviceIdentifiersInterceptor));
        AuraHttpPriorityCalculatorProvider auraHttpPriorityCalculatorProvider = new AuraHttpPriorityCalculatorProvider();
        AnonymousClass002.A1B(value, 1, scheduledExecutorService);
        C7384Etj.A0Y(noiseChannelManagerHolder, 5);
        ERV erv = new ERV(new TigonHttpClientWithNoise$TigonHttpClientWithNoiseServiceHolder(tigonHttpClientConfigCreateConfig, value, "4331325740476680", scheduledExecutorService, null, hucClient, xAnalyticsHolderProvide, auraTigonInterceptorsHolder, auraHttpPriorityCalculatorProvider, null, null, null, noiseChannelManagerHolder), scheduledExecutorService);
        if (interfaceC3290C9q != null) {
            TigonUnexpectedEventReporter.INSTANCE.initialize(interfaceC3290C9q);
        }
        return erv;
    }

    private final DCW getTigonHttpClient() {
        return F0C.A02();
    }

    public final String generateBugReport() {
        return F0C.A02().A00.generateBugReport();
    }

    public final DCW get() {
        return F0C.A02();
    }

    public final TigonServiceHolder getTigonServiceHolder() {
        return F0C.A02().A00;
    }

    public final TigonXplatService getTigonXplatService() {
        return F0C.A02().A00;
    }
}

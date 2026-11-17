package com.crossapp.tigonhttp;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV6;
import X.BV7;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C8j5;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class TigonHttpClientConfig {
    public String[] additionalRedirectHeaders;
    public boolean autotuneReceiveConnFlowControl;
    public boolean autotuneReceiveStreamFlowControl;
    public int bugReportAnalyticsRequestSampleWeight;
    public int bugReportMaxLastTelemetryEvents;
    public final String cacheDirectory;
    public boolean certCompressionEnabled;
    public String[] combinableResponseHeaders;
    public int connectionExpiryTimeoutMs;
    public boolean disableZstd;
    public boolean enableBugReport;
    public boolean enableCertificateVerificationWithProofOfPossession;
    public boolean enableGiphyOverMNS;
    public boolean enableMNSQPL;
    public boolean enableMnsWebSocketConnectionQpl;
    public boolean enableNoiseGate;
    public String eventLoopThreadName;
    public int eventLoopThreadPriority;
    public String[] externalRequestInterceptorAdditionalPlaintextAllowlist;
    public String[] externalRequestInterceptorAdditionalThirdPartyAllowlist;
    public String[] externalRequestInterceptorCredentialDomainAllowlist;
    public boolean externalRequestInterceptorEnforceSanitization;
    public boolean fizzMobileEnabled;
    public boolean forceHttp2;
    public String forceHttp2HostsRegex;
    public long giphyRaceHedgeDelayMs;
    public int headerValidationSampleWeight;
    public boolean http2BackPressureEnabled;
    public int http2ConnectionFlowControlWindow;
    public boolean http2ManualFlowControlEnabled;
    public int http2MaxInFlightRequestsPerConnection;
    public int http2MaxInFlightRequestsPerConnectionForHosts;
    public String http2MaxInFlightRequestsPerConnectionHostsRegex;
    public int http2StreamFlowControlWindow;
    public boolean http3EnableExtendedConnect;
    public boolean isRunningEndToEndTest;
    public int longLivedHostsEstablishTimeoutMs;
    public int longLivedHostsHttp2PingIntervalMs;
    public int longLivedHostsHttp2PingTimeoutMs;
    public boolean longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame;
    public boolean longLivedHostsHttp2StreamCloseRetiresQuietConnection;
    public int longLivedHostsHttp2StreamOpenPingTimeoutMs;
    public int longLivedHostsHttp3PingIntervalMs;
    public String longLivedHostsRegex;
    public int longLivedHostsTcpKeepAliveIdleTimeSeconds;
    public int longLivedHostsTcpKeepAliveIntervalSeconds;
    public int longLivedHostsTcpKeepAliveRetryCount;
    public int mhrSampleWeight;
    public boolean mnsHttpTransactionEarlySetFailState;
    public String[] mnsQplFilteredUrlSubstrings;
    public long mnsRequestBodyBackpressureMaxBufferSize;
    public boolean mnsZstdDStreamReuseEnabled;
    public boolean mvfstAdditiveIncreaseAfterHystart;
    public int mvfstBatchingMode;
    public boolean mvfstCoalesceStreamReads;
    public boolean mvfstEnablePacing;
    public boolean mvfstEnableSpuriousLossRecovery;
    public boolean mvfstPrioritizeExpiredIdleTimeout;
    public int mvfstUDPSendBufferSizeBytes;
    public boolean mvfstUseAdaptiveLossReorderingThresholds;
    public boolean mvfstUseContinuousMemory;
    public boolean mvfstUseHandshakeTimeout;
    public boolean mvfstUseSocketWritableEvents;
    public int nonTransientErrorRetryLimit;
    public boolean ohaiAllowDevserverProxyUrl;
    public String ohaiAllowedGraphQLQueries;
    public boolean ohaiConfigProviderEnabled;
    public boolean ohaiEnabled;
    public boolean ohaiOhttpTargetNewVip;
    public String ohaiProxyChunkedUrl;
    public String ohaiProxyUrl;
    public boolean omitClientIpAddressesFromTelemetry;
    public boolean pqcEnabled;
    public boolean preferIPv6ForBothTCPAndQUIC;
    public String proxyHostAndPortForE2ETest;
    public int quicEgressDscp;
    public int quicEgressSoPriority;
    public int quicExperimentId;
    public int quicHandshakeTimeoutMs;
    public int quicIdleTimeoutMs;
    public long quicInitialMaxData;
    public long quicInitialMaxStreamDataBidiLocal;
    public int quicKeepAliveTimeoutMs;
    public String quicKnobsJson;
    public boolean quicUseMvfstMobile;
    public String[] requestInterceptorsOrder;
    public String[] responseInterceptorsOrder;
    public int retryDelayMaxMs;
    public int retryDelayMinMs;
    public boolean retryOnTimeout;
    public Integer[] retryStatusCodes;
    public int secureTcpEstablishTimeoutMs;
    public int statusCodeRetryLimit;
    public int tcpDelayMs;
    public int tcpEgressDscp;
    public int tcpEgressSoPriority;
    public int transactionReceiveTimeoutMs;
    public int transientErrorRetryLimit;
    public boolean trustSandboxCertificates;
    public boolean useDiskCacheV2;
    public boolean useDiskCacheV2EventLoopExecutor;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TigonHttpClientConfig(String str) {
        C7384Etj.A0Y(str, 0);
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        Object[] objArr69 = 0 == true ? 1 : 0;
        Object[] objArr70 = 0 == true ? 1 : 0;
        Object[] objArr71 = 0 == true ? 1 : 0;
        Object[] objArr72 = 0 == true ? 1 : 0;
        Object[] objArr73 = 0 == true ? 1 : 0;
        Object[] objArr74 = 0 == true ? 1 : 0;
        Object[] objArr75 = 0 == true ? 1 : 0;
        Object[] objArr76 = 0 == true ? 1 : 0;
        Object[] objArr77 = 0 == true ? 1 : 0;
        Object[] objArr78 = 0 == true ? 1 : 0;
        Object[] objArr79 = 0 == true ? 1 : 0;
        Object[] objArr80 = 0 == true ? 1 : 0;
        Object[] objArr81 = 0 == true ? 1 : 0;
        Object[] objArr82 = 0 == true ? 1 : 0;
        Object[] objArr83 = 0 == true ? 1 : 0;
        Object[] objArr84 = 0 == true ? 1 : 0;
        Object[] objArr85 = 0 == true ? 1 : 0;
        Object[] objArr86 = 0 == true ? 1 : 0;
        Object[] objArr87 = 0 == true ? 1 : 0;
        Object[] objArr88 = 0 == true ? 1 : 0;
        Object[] objArr89 = 0 == true ? 1 : 0;
        Object[] objArr90 = 0 == true ? 1 : 0;
        Object[] objArr91 = 0 == true ? 1 : 0;
        Object[] objArr92 = 0 == true ? 1 : 0;
        Object[] objArr93 = 0 == true ? 1 : 0;
        this(str, null, false, objArr, objArr2, objArr3, objArr4, new String[]{"Set-Cookie"}, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr78, objArr13, objArr79, objArr80, objArr81, objArr14, objArr15, objArr16, objArr82, j, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr83, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr84, objArr33, objArr34, objArr35, objArr36, objArr37, objArr85, j, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr86, objArr52, objArr53, objArr54, objArr87, objArr88, objArr55, objArr56, objArr57, objArr89, objArr58, objArr59, objArr60, objArr61, objArr62, j, j, objArr63, objArr90, objArr64, objArr91, objArr92, objArr65, objArr66, objArr67, objArr93, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, -130, i, i, 31, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TigonHttpClientConfig) {
                TigonHttpClientConfig tigonHttpClientConfig = (TigonHttpClientConfig) obj;
                if (!C7384Etj.areEqual(this.cacheDirectory, tigonHttpClientConfig.cacheDirectory) || !C7384Etj.areEqual(this.additionalRedirectHeaders, tigonHttpClientConfig.additionalRedirectHeaders) || this.autotuneReceiveConnFlowControl != tigonHttpClientConfig.autotuneReceiveConnFlowControl || this.autotuneReceiveStreamFlowControl != tigonHttpClientConfig.autotuneReceiveStreamFlowControl || this.bugReportAnalyticsRequestSampleWeight != tigonHttpClientConfig.bugReportAnalyticsRequestSampleWeight || this.bugReportMaxLastTelemetryEvents != tigonHttpClientConfig.bugReportMaxLastTelemetryEvents || this.certCompressionEnabled != tigonHttpClientConfig.certCompressionEnabled || !C7384Etj.areEqual(this.combinableResponseHeaders, tigonHttpClientConfig.combinableResponseHeaders) || this.connectionExpiryTimeoutMs != tigonHttpClientConfig.connectionExpiryTimeoutMs || this.disableZstd != tigonHttpClientConfig.disableZstd || this.enableBugReport != tigonHttpClientConfig.enableBugReport || this.enableCertificateVerificationWithProofOfPossession != tigonHttpClientConfig.enableCertificateVerificationWithProofOfPossession || this.enableGiphyOverMNS != tigonHttpClientConfig.enableGiphyOverMNS || this.enableMNSQPL != tigonHttpClientConfig.enableMNSQPL || this.enableMnsWebSocketConnectionQpl != tigonHttpClientConfig.enableMnsWebSocketConnectionQpl || this.enableNoiseGate != tigonHttpClientConfig.enableNoiseGate || !C7384Etj.areEqual(this.eventLoopThreadName, tigonHttpClientConfig.eventLoopThreadName) || this.eventLoopThreadPriority != tigonHttpClientConfig.eventLoopThreadPriority || !C7384Etj.areEqual(this.externalRequestInterceptorAdditionalPlaintextAllowlist, tigonHttpClientConfig.externalRequestInterceptorAdditionalPlaintextAllowlist) || !C7384Etj.areEqual(this.externalRequestInterceptorAdditionalThirdPartyAllowlist, tigonHttpClientConfig.externalRequestInterceptorAdditionalThirdPartyAllowlist) || !C7384Etj.areEqual(this.externalRequestInterceptorCredentialDomainAllowlist, tigonHttpClientConfig.externalRequestInterceptorCredentialDomainAllowlist) || this.externalRequestInterceptorEnforceSanitization != tigonHttpClientConfig.externalRequestInterceptorEnforceSanitization || this.fizzMobileEnabled != tigonHttpClientConfig.fizzMobileEnabled || this.forceHttp2 != tigonHttpClientConfig.forceHttp2 || !C7384Etj.areEqual(this.forceHttp2HostsRegex, tigonHttpClientConfig.forceHttp2HostsRegex) || this.giphyRaceHedgeDelayMs != tigonHttpClientConfig.giphyRaceHedgeDelayMs || this.headerValidationSampleWeight != tigonHttpClientConfig.headerValidationSampleWeight || this.http2BackPressureEnabled != tigonHttpClientConfig.http2BackPressureEnabled || this.http2ConnectionFlowControlWindow != tigonHttpClientConfig.http2ConnectionFlowControlWindow || this.http2ManualFlowControlEnabled != tigonHttpClientConfig.http2ManualFlowControlEnabled || this.http2MaxInFlightRequestsPerConnection != tigonHttpClientConfig.http2MaxInFlightRequestsPerConnection || this.http2MaxInFlightRequestsPerConnectionForHosts != tigonHttpClientConfig.http2MaxInFlightRequestsPerConnectionForHosts || !C7384Etj.areEqual(this.http2MaxInFlightRequestsPerConnectionHostsRegex, tigonHttpClientConfig.http2MaxInFlightRequestsPerConnectionHostsRegex) || this.http2StreamFlowControlWindow != tigonHttpClientConfig.http2StreamFlowControlWindow || this.http3EnableExtendedConnect != tigonHttpClientConfig.http3EnableExtendedConnect || this.isRunningEndToEndTest != tigonHttpClientConfig.isRunningEndToEndTest || this.longLivedHostsEstablishTimeoutMs != tigonHttpClientConfig.longLivedHostsEstablishTimeoutMs || this.longLivedHostsHttp2PingIntervalMs != tigonHttpClientConfig.longLivedHostsHttp2PingIntervalMs || this.longLivedHostsHttp2PingTimeoutMs != tigonHttpClientConfig.longLivedHostsHttp2PingTimeoutMs || this.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame != tigonHttpClientConfig.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame || this.longLivedHostsHttp2StreamCloseRetiresQuietConnection != tigonHttpClientConfig.longLivedHostsHttp2StreamCloseRetiresQuietConnection || this.longLivedHostsHttp2StreamOpenPingTimeoutMs != tigonHttpClientConfig.longLivedHostsHttp2StreamOpenPingTimeoutMs || this.longLivedHostsHttp3PingIntervalMs != tigonHttpClientConfig.longLivedHostsHttp3PingIntervalMs || !C7384Etj.areEqual(this.longLivedHostsRegex, tigonHttpClientConfig.longLivedHostsRegex) || this.longLivedHostsTcpKeepAliveIdleTimeSeconds != tigonHttpClientConfig.longLivedHostsTcpKeepAliveIdleTimeSeconds || this.longLivedHostsTcpKeepAliveIntervalSeconds != tigonHttpClientConfig.longLivedHostsTcpKeepAliveIntervalSeconds || this.longLivedHostsTcpKeepAliveRetryCount != tigonHttpClientConfig.longLivedHostsTcpKeepAliveRetryCount || this.mhrSampleWeight != tigonHttpClientConfig.mhrSampleWeight || this.mnsHttpTransactionEarlySetFailState != tigonHttpClientConfig.mnsHttpTransactionEarlySetFailState || !C7384Etj.areEqual(this.mnsQplFilteredUrlSubstrings, tigonHttpClientConfig.mnsQplFilteredUrlSubstrings) || this.mnsRequestBodyBackpressureMaxBufferSize != tigonHttpClientConfig.mnsRequestBodyBackpressureMaxBufferSize || this.mnsZstdDStreamReuseEnabled != tigonHttpClientConfig.mnsZstdDStreamReuseEnabled || this.mvfstAdditiveIncreaseAfterHystart != tigonHttpClientConfig.mvfstAdditiveIncreaseAfterHystart || this.mvfstBatchingMode != tigonHttpClientConfig.mvfstBatchingMode || this.mvfstCoalesceStreamReads != tigonHttpClientConfig.mvfstCoalesceStreamReads || this.mvfstEnablePacing != tigonHttpClientConfig.mvfstEnablePacing || this.mvfstEnableSpuriousLossRecovery != tigonHttpClientConfig.mvfstEnableSpuriousLossRecovery || this.mvfstPrioritizeExpiredIdleTimeout != tigonHttpClientConfig.mvfstPrioritizeExpiredIdleTimeout || this.mvfstUDPSendBufferSizeBytes != tigonHttpClientConfig.mvfstUDPSendBufferSizeBytes || this.mvfstUseAdaptiveLossReorderingThresholds != tigonHttpClientConfig.mvfstUseAdaptiveLossReorderingThresholds || this.mvfstUseContinuousMemory != tigonHttpClientConfig.mvfstUseContinuousMemory || this.mvfstUseHandshakeTimeout != tigonHttpClientConfig.mvfstUseHandshakeTimeout || this.mvfstUseSocketWritableEvents != tigonHttpClientConfig.mvfstUseSocketWritableEvents || this.nonTransientErrorRetryLimit != tigonHttpClientConfig.nonTransientErrorRetryLimit || this.ohaiAllowDevserverProxyUrl != tigonHttpClientConfig.ohaiAllowDevserverProxyUrl || !C7384Etj.areEqual(this.ohaiAllowedGraphQLQueries, tigonHttpClientConfig.ohaiAllowedGraphQLQueries) || this.ohaiConfigProviderEnabled != tigonHttpClientConfig.ohaiConfigProviderEnabled || this.ohaiEnabled != tigonHttpClientConfig.ohaiEnabled || this.ohaiOhttpTargetNewVip != tigonHttpClientConfig.ohaiOhttpTargetNewVip || !C7384Etj.areEqual(this.ohaiProxyChunkedUrl, tigonHttpClientConfig.ohaiProxyChunkedUrl) || !C7384Etj.areEqual(this.ohaiProxyUrl, tigonHttpClientConfig.ohaiProxyUrl) || this.omitClientIpAddressesFromTelemetry != tigonHttpClientConfig.omitClientIpAddressesFromTelemetry || this.pqcEnabled != tigonHttpClientConfig.pqcEnabled || this.preferIPv6ForBothTCPAndQUIC != tigonHttpClientConfig.preferIPv6ForBothTCPAndQUIC || !C7384Etj.areEqual(this.proxyHostAndPortForE2ETest, tigonHttpClientConfig.proxyHostAndPortForE2ETest) || this.quicEgressDscp != tigonHttpClientConfig.quicEgressDscp || this.quicEgressSoPriority != tigonHttpClientConfig.quicEgressSoPriority || this.quicExperimentId != tigonHttpClientConfig.quicExperimentId || this.quicHandshakeTimeoutMs != tigonHttpClientConfig.quicHandshakeTimeoutMs || this.quicIdleTimeoutMs != tigonHttpClientConfig.quicIdleTimeoutMs || this.quicInitialMaxData != tigonHttpClientConfig.quicInitialMaxData || this.quicInitialMaxStreamDataBidiLocal != tigonHttpClientConfig.quicInitialMaxStreamDataBidiLocal || this.quicKeepAliveTimeoutMs != tigonHttpClientConfig.quicKeepAliveTimeoutMs || !C7384Etj.areEqual(this.quicKnobsJson, tigonHttpClientConfig.quicKnobsJson) || this.quicUseMvfstMobile != tigonHttpClientConfig.quicUseMvfstMobile || !C7384Etj.areEqual(this.requestInterceptorsOrder, tigonHttpClientConfig.requestInterceptorsOrder) || !C7384Etj.areEqual(this.responseInterceptorsOrder, tigonHttpClientConfig.responseInterceptorsOrder) || this.retryDelayMaxMs != tigonHttpClientConfig.retryDelayMaxMs || this.retryDelayMinMs != tigonHttpClientConfig.retryDelayMinMs || this.retryOnTimeout != tigonHttpClientConfig.retryOnTimeout || !C7384Etj.areEqual(this.retryStatusCodes, tigonHttpClientConfig.retryStatusCodes) || this.secureTcpEstablishTimeoutMs != tigonHttpClientConfig.secureTcpEstablishTimeoutMs || this.statusCodeRetryLimit != tigonHttpClientConfig.statusCodeRetryLimit || this.tcpDelayMs != tigonHttpClientConfig.tcpDelayMs || this.tcpEgressDscp != tigonHttpClientConfig.tcpEgressDscp || this.tcpEgressSoPriority != tigonHttpClientConfig.tcpEgressSoPriority || this.transactionReceiveTimeoutMs != tigonHttpClientConfig.transactionReceiveTimeoutMs || this.transientErrorRetryLimit != tigonHttpClientConfig.transientErrorRetryLimit || this.trustSandboxCertificates != tigonHttpClientConfig.trustSandboxCertificates || this.useDiskCacheV2 != tigonHttpClientConfig.useDiskCacheV2 || this.useDiskCacheV2EventLoopExecutor != tigonHttpClientConfig.useDiskCacheV2EventLoopExecutor) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setAdditionalRedirectHeaders(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.additionalRedirectHeaders = strArr;
    }

    public final void setCombinableResponseHeaders(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.combinableResponseHeaders = strArr;
    }

    public final void setEventLoopThreadName(String str) {
        C7384Etj.A0Y(str, 0);
        this.eventLoopThreadName = str;
    }

    public final void setExternalRequestInterceptorAdditionalPlaintextAllowlist(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.externalRequestInterceptorAdditionalPlaintextAllowlist = strArr;
    }

    public final void setExternalRequestInterceptorAdditionalThirdPartyAllowlist(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.externalRequestInterceptorAdditionalThirdPartyAllowlist = strArr;
    }

    public final void setExternalRequestInterceptorCredentialDomainAllowlist(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.externalRequestInterceptorCredentialDomainAllowlist = strArr;
    }

    public final void setForceHttp2HostsRegex(String str) {
        C7384Etj.A0Y(str, 0);
        this.forceHttp2HostsRegex = str;
    }

    public final void setHttp2MaxInFlightRequestsPerConnectionHostsRegex(String str) {
        C7384Etj.A0Y(str, 0);
        this.http2MaxInFlightRequestsPerConnectionHostsRegex = str;
    }

    public final void setLongLivedHostsRegex(String str) {
        C7384Etj.A0Y(str, 0);
        this.longLivedHostsRegex = str;
    }

    public final void setMnsQplFilteredUrlSubstrings(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.mnsQplFilteredUrlSubstrings = strArr;
    }

    public final void setOhaiAllowedGraphQLQueries(String str) {
        C7384Etj.A0Y(str, 0);
        this.ohaiAllowedGraphQLQueries = str;
    }

    public final void setOhaiProxyChunkedUrl(String str) {
        C7384Etj.A0Y(str, 0);
        this.ohaiProxyChunkedUrl = str;
    }

    public final void setOhaiProxyUrl(String str) {
        C7384Etj.A0Y(str, 0);
        this.ohaiProxyUrl = str;
    }

    public final void setProxyHostAndPortForE2ETest(String str) {
        C7384Etj.A0Y(str, 0);
        this.proxyHostAndPortForE2ETest = str;
    }

    public final void setQuicKnobsJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.quicKnobsJson = str;
    }

    public final void setRequestInterceptorsOrder(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.requestInterceptorsOrder = strArr;
    }

    public final void setResponseInterceptorsOrder(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.responseInterceptorsOrder = strArr;
    }

    public final void setRetryStatusCodes(Integer[] numArr) {
        C7384Etj.A0Y(numArr, 0);
        this.retryStatusCodes = numArr;
    }

    public final String component1() {
        return this.cacheDirectory;
    }

    public final boolean component10() {
        return this.disableZstd;
    }

    public final boolean component100() {
        return this.useDiskCacheV2;
    }

    public final boolean component101() {
        return this.useDiskCacheV2EventLoopExecutor;
    }

    public final boolean component11() {
        return this.enableBugReport;
    }

    public final boolean component12() {
        return this.enableCertificateVerificationWithProofOfPossession;
    }

    public final boolean component13() {
        return this.enableGiphyOverMNS;
    }

    public final boolean component14() {
        return this.enableMNSQPL;
    }

    public final boolean component15() {
        return this.enableMnsWebSocketConnectionQpl;
    }

    public final boolean component16() {
        return this.enableNoiseGate;
    }

    public final String component17() {
        return this.eventLoopThreadName;
    }

    public final int component18() {
        return this.eventLoopThreadPriority;
    }

    public final String[] component19() {
        return this.externalRequestInterceptorAdditionalPlaintextAllowlist;
    }

    public final String[] component2() {
        return this.additionalRedirectHeaders;
    }

    public final String[] component20() {
        return this.externalRequestInterceptorAdditionalThirdPartyAllowlist;
    }

    public final String[] component21() {
        return this.externalRequestInterceptorCredentialDomainAllowlist;
    }

    public final boolean component22() {
        return this.externalRequestInterceptorEnforceSanitization;
    }

    public final boolean component23() {
        return this.fizzMobileEnabled;
    }

    public final boolean component24() {
        return this.forceHttp2;
    }

    public final String component25() {
        return this.forceHttp2HostsRegex;
    }

    public final long component26() {
        return this.giphyRaceHedgeDelayMs;
    }

    public final int component27() {
        return this.headerValidationSampleWeight;
    }

    public final boolean component28() {
        return this.http2BackPressureEnabled;
    }

    public final int component29() {
        return this.http2ConnectionFlowControlWindow;
    }

    public final boolean component3() {
        return this.autotuneReceiveConnFlowControl;
    }

    public final boolean component30() {
        return this.http2ManualFlowControlEnabled;
    }

    public final int component31() {
        return this.http2MaxInFlightRequestsPerConnection;
    }

    public final int component32() {
        return this.http2MaxInFlightRequestsPerConnectionForHosts;
    }

    public final String component33() {
        return this.http2MaxInFlightRequestsPerConnectionHostsRegex;
    }

    public final int component34() {
        return this.http2StreamFlowControlWindow;
    }

    public final boolean component35() {
        return this.http3EnableExtendedConnect;
    }

    public final boolean component36() {
        return this.isRunningEndToEndTest;
    }

    public final int component37() {
        return this.longLivedHostsEstablishTimeoutMs;
    }

    public final int component38() {
        return this.longLivedHostsHttp2PingIntervalMs;
    }

    public final int component39() {
        return this.longLivedHostsHttp2PingTimeoutMs;
    }

    public final boolean component4() {
        return this.autotuneReceiveStreamFlowControl;
    }

    public final boolean component40() {
        return this.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame;
    }

    public final boolean component41() {
        return this.longLivedHostsHttp2StreamCloseRetiresQuietConnection;
    }

    public final int component42() {
        return this.longLivedHostsHttp2StreamOpenPingTimeoutMs;
    }

    public final int component43() {
        return this.longLivedHostsHttp3PingIntervalMs;
    }

    public final String component44() {
        return this.longLivedHostsRegex;
    }

    public final int component45() {
        return this.longLivedHostsTcpKeepAliveIdleTimeSeconds;
    }

    public final int component46() {
        return this.longLivedHostsTcpKeepAliveIntervalSeconds;
    }

    public final int component47() {
        return this.longLivedHostsTcpKeepAliveRetryCount;
    }

    public final int component48() {
        return this.mhrSampleWeight;
    }

    public final boolean component49() {
        return this.mnsHttpTransactionEarlySetFailState;
    }

    public final int component5() {
        return this.bugReportAnalyticsRequestSampleWeight;
    }

    public final String[] component50() {
        return this.mnsQplFilteredUrlSubstrings;
    }

    public final long component51() {
        return this.mnsRequestBodyBackpressureMaxBufferSize;
    }

    public final boolean component52() {
        return this.mnsZstdDStreamReuseEnabled;
    }

    public final boolean component53() {
        return this.mvfstAdditiveIncreaseAfterHystart;
    }

    public final int component54() {
        return this.mvfstBatchingMode;
    }

    public final boolean component55() {
        return this.mvfstCoalesceStreamReads;
    }

    public final boolean component56() {
        return this.mvfstEnablePacing;
    }

    public final boolean component57() {
        return this.mvfstEnableSpuriousLossRecovery;
    }

    public final boolean component58() {
        return this.mvfstPrioritizeExpiredIdleTimeout;
    }

    public final int component59() {
        return this.mvfstUDPSendBufferSizeBytes;
    }

    public final int component6() {
        return this.bugReportMaxLastTelemetryEvents;
    }

    public final boolean component60() {
        return this.mvfstUseAdaptiveLossReorderingThresholds;
    }

    public final boolean component61() {
        return this.mvfstUseContinuousMemory;
    }

    public final boolean component62() {
        return this.mvfstUseHandshakeTimeout;
    }

    public final boolean component63() {
        return this.mvfstUseSocketWritableEvents;
    }

    public final int component64() {
        return this.nonTransientErrorRetryLimit;
    }

    public final boolean component65() {
        return this.ohaiAllowDevserverProxyUrl;
    }

    public final String component66() {
        return this.ohaiAllowedGraphQLQueries;
    }

    public final boolean component67() {
        return this.ohaiConfigProviderEnabled;
    }

    public final boolean component68() {
        return this.ohaiEnabled;
    }

    public final boolean component69() {
        return this.ohaiOhttpTargetNewVip;
    }

    public final boolean component7() {
        return this.certCompressionEnabled;
    }

    public final String component70() {
        return this.ohaiProxyChunkedUrl;
    }

    public final String component71() {
        return this.ohaiProxyUrl;
    }

    public final boolean component72() {
        return this.omitClientIpAddressesFromTelemetry;
    }

    public final boolean component73() {
        return this.pqcEnabled;
    }

    public final boolean component74() {
        return this.preferIPv6ForBothTCPAndQUIC;
    }

    public final String component75() {
        return this.proxyHostAndPortForE2ETest;
    }

    public final int component76() {
        return this.quicEgressDscp;
    }

    public final int component77() {
        return this.quicEgressSoPriority;
    }

    public final int component78() {
        return this.quicExperimentId;
    }

    public final int component79() {
        return this.quicHandshakeTimeoutMs;
    }

    public final String[] component8() {
        return this.combinableResponseHeaders;
    }

    public final int component80() {
        return this.quicIdleTimeoutMs;
    }

    public final long component81() {
        return this.quicInitialMaxData;
    }

    public final long component82() {
        return this.quicInitialMaxStreamDataBidiLocal;
    }

    public final int component83() {
        return this.quicKeepAliveTimeoutMs;
    }

    public final String component84() {
        return this.quicKnobsJson;
    }

    public final boolean component85() {
        return this.quicUseMvfstMobile;
    }

    public final String[] component86() {
        return this.requestInterceptorsOrder;
    }

    public final String[] component87() {
        return this.responseInterceptorsOrder;
    }

    public final int component88() {
        return this.retryDelayMaxMs;
    }

    public final int component89() {
        return this.retryDelayMinMs;
    }

    public final int component9() {
        return this.connectionExpiryTimeoutMs;
    }

    public final boolean component90() {
        return this.retryOnTimeout;
    }

    public final Integer[] component91() {
        return this.retryStatusCodes;
    }

    public final int component92() {
        return this.secureTcpEstablishTimeoutMs;
    }

    public final int component93() {
        return this.statusCodeRetryLimit;
    }

    public final int component94() {
        return this.tcpDelayMs;
    }

    public final int component95() {
        return this.tcpEgressDscp;
    }

    public final int component96() {
        return this.tcpEgressSoPriority;
    }

    public final int component97() {
        return this.transactionReceiveTimeoutMs;
    }

    public final int component98() {
        return this.transientErrorRetryLimit;
    }

    public final boolean component99() {
        return this.trustSandboxCertificates;
    }

    public final String[] getAdditionalRedirectHeaders() {
        return this.additionalRedirectHeaders;
    }

    public final boolean getAutotuneReceiveConnFlowControl() {
        return this.autotuneReceiveConnFlowControl;
    }

    public final boolean getAutotuneReceiveStreamFlowControl() {
        return this.autotuneReceiveStreamFlowControl;
    }

    public final int getBugReportAnalyticsRequestSampleWeight() {
        return this.bugReportAnalyticsRequestSampleWeight;
    }

    public final int getBugReportMaxLastTelemetryEvents() {
        return this.bugReportMaxLastTelemetryEvents;
    }

    public final String getCacheDirectory() {
        return this.cacheDirectory;
    }

    public final boolean getCertCompressionEnabled() {
        return this.certCompressionEnabled;
    }

    public final String[] getCombinableResponseHeaders() {
        return this.combinableResponseHeaders;
    }

    public final int getConnectionExpiryTimeoutMs() {
        return this.connectionExpiryTimeoutMs;
    }

    public final boolean getDisableZstd() {
        return this.disableZstd;
    }

    public final boolean getEnableBugReport() {
        return this.enableBugReport;
    }

    public final boolean getEnableCertificateVerificationWithProofOfPossession() {
        return this.enableCertificateVerificationWithProofOfPossession;
    }

    public final boolean getEnableGiphyOverMNS() {
        return this.enableGiphyOverMNS;
    }

    public final boolean getEnableMNSQPL() {
        return this.enableMNSQPL;
    }

    public final boolean getEnableMnsWebSocketConnectionQpl() {
        return this.enableMnsWebSocketConnectionQpl;
    }

    public final boolean getEnableNoiseGate() {
        return this.enableNoiseGate;
    }

    public final String getEventLoopThreadName() {
        return this.eventLoopThreadName;
    }

    public final int getEventLoopThreadPriority() {
        return this.eventLoopThreadPriority;
    }

    public final String[] getExternalRequestInterceptorAdditionalPlaintextAllowlist() {
        return this.externalRequestInterceptorAdditionalPlaintextAllowlist;
    }

    public final String[] getExternalRequestInterceptorAdditionalThirdPartyAllowlist() {
        return this.externalRequestInterceptorAdditionalThirdPartyAllowlist;
    }

    public final String[] getExternalRequestInterceptorCredentialDomainAllowlist() {
        return this.externalRequestInterceptorCredentialDomainAllowlist;
    }

    public final boolean getExternalRequestInterceptorEnforceSanitization() {
        return this.externalRequestInterceptorEnforceSanitization;
    }

    public final boolean getFizzMobileEnabled() {
        return this.fizzMobileEnabled;
    }

    public final boolean getForceHttp2() {
        return this.forceHttp2;
    }

    public final String getForceHttp2HostsRegex() {
        return this.forceHttp2HostsRegex;
    }

    public final long getGiphyRaceHedgeDelayMs() {
        return this.giphyRaceHedgeDelayMs;
    }

    public final int getHeaderValidationSampleWeight() {
        return this.headerValidationSampleWeight;
    }

    public final boolean getHttp2BackPressureEnabled() {
        return this.http2BackPressureEnabled;
    }

    public final int getHttp2ConnectionFlowControlWindow() {
        return this.http2ConnectionFlowControlWindow;
    }

    public final boolean getHttp2ManualFlowControlEnabled() {
        return this.http2ManualFlowControlEnabled;
    }

    public final int getHttp2MaxInFlightRequestsPerConnection() {
        return this.http2MaxInFlightRequestsPerConnection;
    }

    public final int getHttp2MaxInFlightRequestsPerConnectionForHosts() {
        return this.http2MaxInFlightRequestsPerConnectionForHosts;
    }

    public final String getHttp2MaxInFlightRequestsPerConnectionHostsRegex() {
        return this.http2MaxInFlightRequestsPerConnectionHostsRegex;
    }

    public final int getHttp2StreamFlowControlWindow() {
        return this.http2StreamFlowControlWindow;
    }

    public final boolean getHttp3EnableExtendedConnect() {
        return this.http3EnableExtendedConnect;
    }

    public final int getLongLivedHostsEstablishTimeoutMs() {
        return this.longLivedHostsEstablishTimeoutMs;
    }

    public final int getLongLivedHostsHttp2PingIntervalMs() {
        return this.longLivedHostsHttp2PingIntervalMs;
    }

    public final int getLongLivedHostsHttp2PingTimeoutMs() {
        return this.longLivedHostsHttp2PingTimeoutMs;
    }

    public final boolean getLongLivedHostsHttp2PingTimeoutRestartsOnAnyFrame() {
        return this.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame;
    }

    public final boolean getLongLivedHostsHttp2StreamCloseRetiresQuietConnection() {
        return this.longLivedHostsHttp2StreamCloseRetiresQuietConnection;
    }

    public final int getLongLivedHostsHttp2StreamOpenPingTimeoutMs() {
        return this.longLivedHostsHttp2StreamOpenPingTimeoutMs;
    }

    public final int getLongLivedHostsHttp3PingIntervalMs() {
        return this.longLivedHostsHttp3PingIntervalMs;
    }

    public final String getLongLivedHostsRegex() {
        return this.longLivedHostsRegex;
    }

    public final int getLongLivedHostsTcpKeepAliveIdleTimeSeconds() {
        return this.longLivedHostsTcpKeepAliveIdleTimeSeconds;
    }

    public final int getLongLivedHostsTcpKeepAliveIntervalSeconds() {
        return this.longLivedHostsTcpKeepAliveIntervalSeconds;
    }

    public final int getLongLivedHostsTcpKeepAliveRetryCount() {
        return this.longLivedHostsTcpKeepAliveRetryCount;
    }

    public final int getMhrSampleWeight() {
        return this.mhrSampleWeight;
    }

    public final boolean getMnsHttpTransactionEarlySetFailState() {
        return this.mnsHttpTransactionEarlySetFailState;
    }

    public final String[] getMnsQplFilteredUrlSubstrings() {
        return this.mnsQplFilteredUrlSubstrings;
    }

    public final long getMnsRequestBodyBackpressureMaxBufferSize() {
        return this.mnsRequestBodyBackpressureMaxBufferSize;
    }

    public final boolean getMnsZstdDStreamReuseEnabled() {
        return this.mnsZstdDStreamReuseEnabled;
    }

    public final boolean getMvfstAdditiveIncreaseAfterHystart() {
        return this.mvfstAdditiveIncreaseAfterHystart;
    }

    public final int getMvfstBatchingMode() {
        return this.mvfstBatchingMode;
    }

    public final boolean getMvfstCoalesceStreamReads() {
        return this.mvfstCoalesceStreamReads;
    }

    public final boolean getMvfstEnablePacing() {
        return this.mvfstEnablePacing;
    }

    public final boolean getMvfstEnableSpuriousLossRecovery() {
        return this.mvfstEnableSpuriousLossRecovery;
    }

    public final boolean getMvfstPrioritizeExpiredIdleTimeout() {
        return this.mvfstPrioritizeExpiredIdleTimeout;
    }

    public final int getMvfstUDPSendBufferSizeBytes() {
        return this.mvfstUDPSendBufferSizeBytes;
    }

    public final boolean getMvfstUseAdaptiveLossReorderingThresholds() {
        return this.mvfstUseAdaptiveLossReorderingThresholds;
    }

    public final boolean getMvfstUseContinuousMemory() {
        return this.mvfstUseContinuousMemory;
    }

    public final boolean getMvfstUseHandshakeTimeout() {
        return this.mvfstUseHandshakeTimeout;
    }

    public final boolean getMvfstUseSocketWritableEvents() {
        return this.mvfstUseSocketWritableEvents;
    }

    public final int getNonTransientErrorRetryLimit() {
        return this.nonTransientErrorRetryLimit;
    }

    public final boolean getOhaiAllowDevserverProxyUrl() {
        return this.ohaiAllowDevserverProxyUrl;
    }

    public final String getOhaiAllowedGraphQLQueries() {
        return this.ohaiAllowedGraphQLQueries;
    }

    public final boolean getOhaiConfigProviderEnabled() {
        return this.ohaiConfigProviderEnabled;
    }

    public final boolean getOhaiEnabled() {
        return this.ohaiEnabled;
    }

    public final boolean getOhaiOhttpTargetNewVip() {
        return this.ohaiOhttpTargetNewVip;
    }

    public final String getOhaiProxyChunkedUrl() {
        return this.ohaiProxyChunkedUrl;
    }

    public final String getOhaiProxyUrl() {
        return this.ohaiProxyUrl;
    }

    public final boolean getOmitClientIpAddressesFromTelemetry() {
        return this.omitClientIpAddressesFromTelemetry;
    }

    public final boolean getPqcEnabled() {
        return this.pqcEnabled;
    }

    public final boolean getPreferIPv6ForBothTCPAndQUIC() {
        return this.preferIPv6ForBothTCPAndQUIC;
    }

    public final String getProxyHostAndPortForE2ETest() {
        return this.proxyHostAndPortForE2ETest;
    }

    public final int getQuicEgressDscp() {
        return this.quicEgressDscp;
    }

    public final int getQuicEgressSoPriority() {
        return this.quicEgressSoPriority;
    }

    public final int getQuicExperimentId() {
        return this.quicExperimentId;
    }

    public final int getQuicHandshakeTimeoutMs() {
        return this.quicHandshakeTimeoutMs;
    }

    public final int getQuicIdleTimeoutMs() {
        return this.quicIdleTimeoutMs;
    }

    public final long getQuicInitialMaxData() {
        return this.quicInitialMaxData;
    }

    public final long getQuicInitialMaxStreamDataBidiLocal() {
        return this.quicInitialMaxStreamDataBidiLocal;
    }

    public final int getQuicKeepAliveTimeoutMs() {
        return this.quicKeepAliveTimeoutMs;
    }

    public final String getQuicKnobsJson() {
        return this.quicKnobsJson;
    }

    public final boolean getQuicUseMvfstMobile() {
        return this.quicUseMvfstMobile;
    }

    public final String[] getRequestInterceptorsOrder() {
        return this.requestInterceptorsOrder;
    }

    public final String[] getResponseInterceptorsOrder() {
        return this.responseInterceptorsOrder;
    }

    public final int getRetryDelayMaxMs() {
        return this.retryDelayMaxMs;
    }

    public final int getRetryDelayMinMs() {
        return this.retryDelayMinMs;
    }

    public final boolean getRetryOnTimeout() {
        return this.retryOnTimeout;
    }

    public final Integer[] getRetryStatusCodes() {
        return this.retryStatusCodes;
    }

    public final int getSecureTcpEstablishTimeoutMs() {
        return this.secureTcpEstablishTimeoutMs;
    }

    public final int getStatusCodeRetryLimit() {
        return this.statusCodeRetryLimit;
    }

    public final int getTcpDelayMs() {
        return this.tcpDelayMs;
    }

    public final int getTcpEgressDscp() {
        return this.tcpEgressDscp;
    }

    public final int getTcpEgressSoPriority() {
        return this.tcpEgressSoPriority;
    }

    public final int getTransactionReceiveTimeoutMs() {
        return this.transactionReceiveTimeoutMs;
    }

    public final int getTransientErrorRetryLimit() {
        return this.transientErrorRetryLimit;
    }

    public final boolean getTrustSandboxCertificates() {
        return this.trustSandboxCertificates;
    }

    public final boolean getUseDiskCacheV2() {
        return this.useDiskCacheV2;
    }

    public final boolean getUseDiskCacheV2EventLoopExecutor() {
        return this.useDiskCacheV2EventLoopExecutor;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((((((((((((((BV6.A0E(this.retryStatusCodes, C0KA.A01((((BV6.A0E(this.responseInterceptorsOrder, BV6.A0E(this.requestInterceptorsOrder, C0KA.A01(AnonymousClass005.A0I(this.quicKnobsJson, (AnonymousClass006.A06(this.quicInitialMaxStreamDataBidiLocal, AnonymousClass006.A06(this.quicInitialMaxData, (((((((((AnonymousClass005.A0I(this.proxyHostAndPortForE2ETest, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.ohaiProxyUrl, AnonymousClass005.A0I(this.ohaiProxyChunkedUrl, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.ohaiAllowedGraphQLQueries, C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(AnonymousClass006.A06(this.mnsRequestBodyBackpressureMaxBufferSize, BV6.A0E(this.mnsQplFilteredUrlSubstrings, C0KA.A01((((((((AnonymousClass005.A0I(this.longLivedHostsRegex, (((C0KA.A01(C0KA.A01((((((C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.http2MaxInFlightRequestsPerConnectionHostsRegex, (((C0KA.A01((C0KA.A01((AnonymousClass006.A06(this.giphyRaceHedgeDelayMs, AnonymousClass005.A0I(this.forceHttp2HostsRegex, C0KA.A01(C0KA.A01(C0KA.A01(BV6.A0E(this.externalRequestInterceptorCredentialDomainAllowlist, BV6.A0E(this.externalRequestInterceptorAdditionalThirdPartyAllowlist, BV6.A0E(this.externalRequestInterceptorAdditionalPlaintextAllowlist, (AnonymousClass005.A0I(this.eventLoopThreadName, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((BV6.A0E(this.combinableResponseHeaders, C0KA.A01((((C0KA.A01(C0KA.A01(BV6.A0E(this.additionalRedirectHeaders, AnonymousClass001.A0G(this.cacheDirectory)), this.autotuneReceiveConnFlowControl), this.autotuneReceiveStreamFlowControl) + this.bugReportAnalyticsRequestSampleWeight) * 31) + this.bugReportMaxLastTelemetryEvents) * 31, this.certCompressionEnabled)) + this.connectionExpiryTimeoutMs) * 31, this.disableZstd), this.enableBugReport), this.enableCertificateVerificationWithProofOfPossession), this.enableGiphyOverMNS), this.enableMNSQPL), this.enableMnsWebSocketConnectionQpl), this.enableNoiseGate)) + this.eventLoopThreadPriority) * 31))), this.externalRequestInterceptorEnforceSanitization), this.fizzMobileEnabled), this.forceHttp2))) + this.headerValidationSampleWeight) * 31, this.http2BackPressureEnabled) + this.http2ConnectionFlowControlWindow) * 31, this.http2ManualFlowControlEnabled) + this.http2MaxInFlightRequestsPerConnection) * 31) + this.http2MaxInFlightRequestsPerConnectionForHosts) * 31) + this.http2StreamFlowControlWindow) * 31, this.http3EnableExtendedConnect), this.isRunningEndToEndTest) + this.longLivedHostsEstablishTimeoutMs) * 31) + this.longLivedHostsHttp2PingIntervalMs) * 31) + this.longLivedHostsHttp2PingTimeoutMs) * 31, this.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame), this.longLivedHostsHttp2StreamCloseRetiresQuietConnection) + this.longLivedHostsHttp2StreamOpenPingTimeoutMs) * 31) + this.longLivedHostsHttp3PingIntervalMs) * 31) + this.longLivedHostsTcpKeepAliveIdleTimeSeconds) * 31) + this.longLivedHostsTcpKeepAliveIntervalSeconds) * 31) + this.longLivedHostsTcpKeepAliveRetryCount) * 31) + this.mhrSampleWeight) * 31, this.mnsHttpTransactionEarlySetFailState))), this.mnsZstdDStreamReuseEnabled), this.mvfstAdditiveIncreaseAfterHystart) + this.mvfstBatchingMode) * 31, this.mvfstCoalesceStreamReads), this.mvfstEnablePacing), this.mvfstEnableSpuriousLossRecovery), this.mvfstPrioritizeExpiredIdleTimeout) + this.mvfstUDPSendBufferSizeBytes) * 31, this.mvfstUseAdaptiveLossReorderingThresholds), this.mvfstUseContinuousMemory), this.mvfstUseHandshakeTimeout), this.mvfstUseSocketWritableEvents) + this.nonTransientErrorRetryLimit) * 31, this.ohaiAllowDevserverProxyUrl)), this.ohaiConfigProviderEnabled), this.ohaiEnabled), this.ohaiOhttpTargetNewVip))), this.omitClientIpAddressesFromTelemetry), this.pqcEnabled), this.preferIPv6ForBothTCPAndQUIC)) + this.quicEgressDscp) * 31) + this.quicEgressSoPriority) * 31) + this.quicExperimentId) * 31) + this.quicHandshakeTimeoutMs) * 31) + this.quicIdleTimeoutMs) * 31)) + this.quicKeepAliveTimeoutMs) * 31), this.quicUseMvfstMobile))) + this.retryDelayMaxMs) * 31) + this.retryDelayMinMs) * 31, this.retryOnTimeout)) + this.secureTcpEstablishTimeoutMs) * 31) + this.statusCodeRetryLimit) * 31) + this.tcpDelayMs) * 31) + this.tcpEgressDscp) * 31) + this.tcpEgressSoPriority) * 31) + this.transactionReceiveTimeoutMs) * 31) + this.transientErrorRetryLimit) * 31, this.trustSandboxCertificates), this.useDiskCacheV2), this.useDiskCacheV2EventLoopExecutor);
    }

    public final boolean isRunningEndToEndTest() {
        return this.isRunningEndToEndTest;
    }

    public String toString() {
        String str = this.cacheDirectory;
        String string = Arrays.toString(this.additionalRedirectHeaders);
        boolean z = this.autotuneReceiveConnFlowControl;
        boolean z2 = this.autotuneReceiveStreamFlowControl;
        int i = this.bugReportAnalyticsRequestSampleWeight;
        int i2 = this.bugReportMaxLastTelemetryEvents;
        boolean z3 = this.certCompressionEnabled;
        String string2 = Arrays.toString(this.combinableResponseHeaders);
        int i3 = this.connectionExpiryTimeoutMs;
        boolean z4 = this.disableZstd;
        boolean z5 = this.enableBugReport;
        boolean z6 = this.enableCertificateVerificationWithProofOfPossession;
        boolean z7 = this.enableGiphyOverMNS;
        boolean z8 = this.enableMNSQPL;
        boolean z9 = this.enableMnsWebSocketConnectionQpl;
        boolean z10 = this.enableNoiseGate;
        String str2 = this.eventLoopThreadName;
        int i4 = this.eventLoopThreadPriority;
        String string3 = Arrays.toString(this.externalRequestInterceptorAdditionalPlaintextAllowlist);
        String string4 = Arrays.toString(this.externalRequestInterceptorAdditionalThirdPartyAllowlist);
        String string5 = Arrays.toString(this.externalRequestInterceptorCredentialDomainAllowlist);
        boolean z11 = this.externalRequestInterceptorEnforceSanitization;
        boolean z12 = this.fizzMobileEnabled;
        boolean z13 = this.forceHttp2;
        String str3 = this.forceHttp2HostsRegex;
        long j = this.giphyRaceHedgeDelayMs;
        int i5 = this.headerValidationSampleWeight;
        boolean z14 = this.http2BackPressureEnabled;
        int i6 = this.http2ConnectionFlowControlWindow;
        boolean z15 = this.http2ManualFlowControlEnabled;
        int i7 = this.http2MaxInFlightRequestsPerConnection;
        int i8 = this.http2MaxInFlightRequestsPerConnectionForHosts;
        String str4 = this.http2MaxInFlightRequestsPerConnectionHostsRegex;
        int i9 = this.http2StreamFlowControlWindow;
        boolean z16 = this.http3EnableExtendedConnect;
        boolean z17 = this.isRunningEndToEndTest;
        int i10 = this.longLivedHostsEstablishTimeoutMs;
        int i11 = this.longLivedHostsHttp2PingIntervalMs;
        int i12 = this.longLivedHostsHttp2PingTimeoutMs;
        boolean z18 = this.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame;
        boolean z19 = this.longLivedHostsHttp2StreamCloseRetiresQuietConnection;
        int i13 = this.longLivedHostsHttp2StreamOpenPingTimeoutMs;
        int i14 = this.longLivedHostsHttp3PingIntervalMs;
        String str5 = this.longLivedHostsRegex;
        int i15 = this.longLivedHostsTcpKeepAliveIdleTimeSeconds;
        int i16 = this.longLivedHostsTcpKeepAliveIntervalSeconds;
        int i17 = this.longLivedHostsTcpKeepAliveRetryCount;
        int i18 = this.mhrSampleWeight;
        boolean z20 = this.mnsHttpTransactionEarlySetFailState;
        String string6 = Arrays.toString(this.mnsQplFilteredUrlSubstrings);
        long j2 = this.mnsRequestBodyBackpressureMaxBufferSize;
        boolean z21 = this.mnsZstdDStreamReuseEnabled;
        boolean z22 = this.mvfstAdditiveIncreaseAfterHystart;
        int i19 = this.mvfstBatchingMode;
        boolean z23 = this.mvfstCoalesceStreamReads;
        boolean z24 = this.mvfstEnablePacing;
        boolean z25 = this.mvfstEnableSpuriousLossRecovery;
        boolean z26 = this.mvfstPrioritizeExpiredIdleTimeout;
        int i20 = this.mvfstUDPSendBufferSizeBytes;
        boolean z27 = this.mvfstUseAdaptiveLossReorderingThresholds;
        boolean z28 = this.mvfstUseContinuousMemory;
        boolean z29 = this.mvfstUseHandshakeTimeout;
        boolean z30 = this.mvfstUseSocketWritableEvents;
        int i21 = this.nonTransientErrorRetryLimit;
        boolean z31 = this.ohaiAllowDevserverProxyUrl;
        String str6 = this.ohaiAllowedGraphQLQueries;
        boolean z32 = this.ohaiConfigProviderEnabled;
        boolean z33 = this.ohaiEnabled;
        boolean z34 = this.ohaiOhttpTargetNewVip;
        String str7 = this.ohaiProxyChunkedUrl;
        String str8 = this.ohaiProxyUrl;
        boolean z35 = this.omitClientIpAddressesFromTelemetry;
        boolean z36 = this.pqcEnabled;
        boolean z37 = this.preferIPv6ForBothTCPAndQUIC;
        String str9 = this.proxyHostAndPortForE2ETest;
        int i22 = this.quicEgressDscp;
        int i23 = this.quicEgressSoPriority;
        int i24 = this.quicExperimentId;
        int i25 = this.quicHandshakeTimeoutMs;
        int i26 = this.quicIdleTimeoutMs;
        long j3 = this.quicInitialMaxData;
        long j4 = this.quicInitialMaxStreamDataBidiLocal;
        int i27 = this.quicKeepAliveTimeoutMs;
        String str10 = this.quicKnobsJson;
        boolean z38 = this.quicUseMvfstMobile;
        String string7 = Arrays.toString(this.requestInterceptorsOrder);
        String string8 = Arrays.toString(this.responseInterceptorsOrder);
        int i28 = this.retryDelayMaxMs;
        int i29 = this.retryDelayMinMs;
        boolean z39 = this.retryOnTimeout;
        String string9 = Arrays.toString(this.retryStatusCodes);
        int i30 = this.secureTcpEstablishTimeoutMs;
        int i31 = this.statusCodeRetryLimit;
        int i32 = this.tcpDelayMs;
        int i33 = this.tcpEgressDscp;
        int i34 = this.tcpEgressSoPriority;
        int i35 = this.transactionReceiveTimeoutMs;
        int i36 = this.transientErrorRetryLimit;
        boolean z40 = this.trustSandboxCertificates;
        boolean z41 = this.useDiskCacheV2;
        boolean z42 = this.useDiskCacheV2EventLoopExecutor;
        StringBuilder sbA0x = C3cI.A0x("TigonHttpClientConfig(cacheDirectory=", str);
        sbA0x.append(", additionalRedirectHeaders=");
        sbA0x.append(string);
        sbA0x.append(", autotuneReceiveConnFlowControl=");
        sbA0x.append(z);
        sbA0x.append(", autotuneReceiveStreamFlowControl=");
        sbA0x.append(z2);
        sbA0x.append(", bugReportAnalyticsRequestSampleWeight=");
        sbA0x.append(i);
        sbA0x.append(", bugReportMaxLastTelemetryEvents=");
        sbA0x.append(i2);
        sbA0x.append(", certCompressionEnabled=");
        sbA0x.append(z3);
        sbA0x.append(", combinableResponseHeaders=");
        sbA0x.append(string2);
        sbA0x.append(", connectionExpiryTimeoutMs=");
        sbA0x.append(i3);
        sbA0x.append(", disableZstd=");
        sbA0x.append(z4);
        sbA0x.append(", enableBugReport=");
        sbA0x.append(z5);
        sbA0x.append(", enableCertificateVerificationWithProofOfPossession=");
        sbA0x.append(z6);
        sbA0x.append(", enableGiphyOverMNS=");
        sbA0x.append(z7);
        sbA0x.append(", enableMNSQPL=");
        sbA0x.append(z8);
        sbA0x.append(", enableMnsWebSocketConnectionQpl=");
        sbA0x.append(z9);
        sbA0x.append(", enableNoiseGate=");
        sbA0x.append(z10);
        sbA0x.append(", eventLoopThreadName=");
        sbA0x.append(str2);
        sbA0x.append(", eventLoopThreadPriority=");
        sbA0x.append(i4);
        sbA0x.append(", externalRequestInterceptorAdditionalPlaintextAllowlist=");
        sbA0x.append(string3);
        sbA0x.append(", externalRequestInterceptorAdditionalThirdPartyAllowlist=");
        sbA0x.append(string4);
        sbA0x.append(", externalRequestInterceptorCredentialDomainAllowlist=");
        sbA0x.append(string5);
        sbA0x.append(", externalRequestInterceptorEnforceSanitization=");
        sbA0x.append(z11);
        sbA0x.append(", fizzMobileEnabled=");
        sbA0x.append(z12);
        sbA0x.append(", forceHttp2=");
        sbA0x.append(z13);
        sbA0x.append(", forceHttp2HostsRegex=");
        sbA0x.append(str3);
        sbA0x.append(", giphyRaceHedgeDelayMs=");
        sbA0x.append(j);
        sbA0x.append(", headerValidationSampleWeight=");
        sbA0x.append(i5);
        sbA0x.append(", http2BackPressureEnabled=");
        sbA0x.append(z14);
        sbA0x.append(", http2ConnectionFlowControlWindow=");
        sbA0x.append(i6);
        sbA0x.append(", http2ManualFlowControlEnabled=");
        sbA0x.append(z15);
        sbA0x.append(", http2MaxInFlightRequestsPerConnection=");
        sbA0x.append(i7);
        sbA0x.append(", http2MaxInFlightRequestsPerConnectionForHosts=");
        sbA0x.append(i8);
        sbA0x.append(", http2MaxInFlightRequestsPerConnectionHostsRegex=");
        sbA0x.append(str4);
        sbA0x.append(", http2StreamFlowControlWindow=");
        sbA0x.append(i9);
        sbA0x.append(", http3EnableExtendedConnect=");
        sbA0x.append(z16);
        sbA0x.append(", isRunningEndToEndTest=");
        sbA0x.append(z17);
        sbA0x.append(", longLivedHostsEstablishTimeoutMs=");
        sbA0x.append(i10);
        sbA0x.append(", longLivedHostsHttp2PingIntervalMs=");
        sbA0x.append(i11);
        sbA0x.append(", longLivedHostsHttp2PingTimeoutMs=");
        sbA0x.append(i12);
        sbA0x.append(", longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame=");
        sbA0x.append(z18);
        sbA0x.append(", longLivedHostsHttp2StreamCloseRetiresQuietConnection=");
        sbA0x.append(z19);
        sbA0x.append(", longLivedHostsHttp2StreamOpenPingTimeoutMs=");
        sbA0x.append(i13);
        sbA0x.append(", longLivedHostsHttp3PingIntervalMs=");
        sbA0x.append(i14);
        sbA0x.append(", longLivedHostsRegex=");
        sbA0x.append(str5);
        sbA0x.append(", longLivedHostsTcpKeepAliveIdleTimeSeconds=");
        sbA0x.append(i15);
        sbA0x.append(", longLivedHostsTcpKeepAliveIntervalSeconds=");
        sbA0x.append(i16);
        sbA0x.append(", longLivedHostsTcpKeepAliveRetryCount=");
        sbA0x.append(i17);
        sbA0x.append(", mhrSampleWeight=");
        sbA0x.append(i18);
        sbA0x.append(", mnsHttpTransactionEarlySetFailState=");
        sbA0x.append(z20);
        sbA0x.append(", mnsQplFilteredUrlSubstrings=");
        sbA0x.append(string6);
        sbA0x.append(", mnsRequestBodyBackpressureMaxBufferSize=");
        sbA0x.append(j2);
        sbA0x.append(", mnsZstdDStreamReuseEnabled=");
        sbA0x.append(z21);
        sbA0x.append(", mvfstAdditiveIncreaseAfterHystart=");
        sbA0x.append(z22);
        sbA0x.append(", mvfstBatchingMode=");
        sbA0x.append(i19);
        sbA0x.append(", mvfstCoalesceStreamReads=");
        sbA0x.append(z23);
        sbA0x.append(", mvfstEnablePacing=");
        sbA0x.append(z24);
        sbA0x.append(", mvfstEnableSpuriousLossRecovery=");
        sbA0x.append(z25);
        sbA0x.append(", mvfstPrioritizeExpiredIdleTimeout=");
        sbA0x.append(z26);
        sbA0x.append(", mvfstUDPSendBufferSizeBytes=");
        sbA0x.append(i20);
        sbA0x.append(", mvfstUseAdaptiveLossReorderingThresholds=");
        sbA0x.append(z27);
        sbA0x.append(", mvfstUseContinuousMemory=");
        sbA0x.append(z28);
        sbA0x.append(", mvfstUseHandshakeTimeout=");
        sbA0x.append(z29);
        sbA0x.append(", mvfstUseSocketWritableEvents=");
        sbA0x.append(z30);
        sbA0x.append(", nonTransientErrorRetryLimit=");
        sbA0x.append(i21);
        sbA0x.append(", ohaiAllowDevserverProxyUrl=");
        sbA0x.append(z31);
        sbA0x.append(", ohaiAllowedGraphQLQueries=");
        sbA0x.append(str6);
        sbA0x.append(", ohaiConfigProviderEnabled=");
        sbA0x.append(z32);
        sbA0x.append(", ohaiEnabled=");
        sbA0x.append(z33);
        sbA0x.append(", ohaiOhttpTargetNewVip=");
        sbA0x.append(z34);
        sbA0x.append(", ohaiProxyChunkedUrl=");
        sbA0x.append(str7);
        sbA0x.append(", ohaiProxyUrl=");
        sbA0x.append(str8);
        sbA0x.append(", omitClientIpAddressesFromTelemetry=");
        sbA0x.append(z35);
        sbA0x.append(", pqcEnabled=");
        sbA0x.append(z36);
        sbA0x.append(", preferIPv6ForBothTCPAndQUIC=");
        sbA0x.append(z37);
        sbA0x.append(", proxyHostAndPortForE2ETest=");
        sbA0x.append(str9);
        sbA0x.append(", quicEgressDscp=");
        sbA0x.append(i22);
        sbA0x.append(", quicEgressSoPriority=");
        sbA0x.append(i23);
        sbA0x.append(", quicExperimentId=");
        sbA0x.append(i24);
        sbA0x.append(", quicHandshakeTimeoutMs=");
        sbA0x.append(i25);
        sbA0x.append(", quicIdleTimeoutMs=");
        sbA0x.append(i26);
        sbA0x.append(", quicInitialMaxData=");
        sbA0x.append(j3);
        sbA0x.append(", quicInitialMaxStreamDataBidiLocal=");
        sbA0x.append(j4);
        sbA0x.append(", quicKeepAliveTimeoutMs=");
        sbA0x.append(i27);
        sbA0x.append(", quicKnobsJson=");
        sbA0x.append(str10);
        sbA0x.append(", quicUseMvfstMobile=");
        sbA0x.append(z38);
        sbA0x.append(", requestInterceptorsOrder=");
        sbA0x.append(string7);
        sbA0x.append(", responseInterceptorsOrder=");
        sbA0x.append(string8);
        sbA0x.append(", retryDelayMaxMs=");
        sbA0x.append(i28);
        sbA0x.append(", retryDelayMinMs=");
        sbA0x.append(i29);
        sbA0x.append(", retryOnTimeout=");
        sbA0x.append(z39);
        sbA0x.append(", retryStatusCodes=");
        sbA0x.append(string9);
        sbA0x.append(", secureTcpEstablishTimeoutMs=");
        sbA0x.append(i30);
        sbA0x.append(", statusCodeRetryLimit=");
        sbA0x.append(i31);
        sbA0x.append(", tcpDelayMs=");
        sbA0x.append(i32);
        sbA0x.append(", tcpEgressDscp=");
        sbA0x.append(i33);
        sbA0x.append(", tcpEgressSoPriority=");
        sbA0x.append(i34);
        sbA0x.append(", transactionReceiveTimeoutMs=");
        sbA0x.append(i35);
        sbA0x.append(", transientErrorRetryLimit=");
        sbA0x.append(i36);
        sbA0x.append(", trustSandboxCertificates=");
        sbA0x.append(z40);
        sbA0x.append(", useDiskCacheV2=");
        sbA0x.append(z41);
        return C8j5.A0W(", useDiskCacheV2EventLoopExecutor=", sbA0x, z42);
    }

    public final void setAutotuneReceiveConnFlowControl(boolean z) {
        this.autotuneReceiveConnFlowControl = z;
    }

    public final void setAutotuneReceiveStreamFlowControl(boolean z) {
        this.autotuneReceiveStreamFlowControl = z;
    }

    public final void setBugReportAnalyticsRequestSampleWeight(int i) {
        this.bugReportAnalyticsRequestSampleWeight = i;
    }

    public final void setBugReportMaxLastTelemetryEvents(int i) {
        this.bugReportMaxLastTelemetryEvents = i;
    }

    public final void setCertCompressionEnabled(boolean z) {
        this.certCompressionEnabled = z;
    }

    public final void setConnectionExpiryTimeoutMs(int i) {
        this.connectionExpiryTimeoutMs = i;
    }

    public final void setDisableZstd(boolean z) {
        this.disableZstd = z;
    }

    public final void setEnableBugReport(boolean z) {
        this.enableBugReport = z;
    }

    public final void setEnableCertificateVerificationWithProofOfPossession(boolean z) {
        this.enableCertificateVerificationWithProofOfPossession = z;
    }

    public final void setEnableGiphyOverMNS(boolean z) {
        this.enableGiphyOverMNS = z;
    }

    public final void setEnableMNSQPL(boolean z) {
        this.enableMNSQPL = z;
    }

    public final void setEnableMnsWebSocketConnectionQpl(boolean z) {
        this.enableMnsWebSocketConnectionQpl = z;
    }

    public final void setEnableNoiseGate(boolean z) {
        this.enableNoiseGate = z;
    }

    public final void setEventLoopThreadPriority(int i) {
        this.eventLoopThreadPriority = i;
    }

    public final void setExternalRequestInterceptorEnforceSanitization(boolean z) {
        this.externalRequestInterceptorEnforceSanitization = z;
    }

    public final void setFizzMobileEnabled(boolean z) {
        this.fizzMobileEnabled = z;
    }

    public final void setForceHttp2(boolean z) {
        this.forceHttp2 = z;
    }

    public final void setGiphyRaceHedgeDelayMs(long j) {
        this.giphyRaceHedgeDelayMs = j;
    }

    public final void setHeaderValidationSampleWeight(int i) {
        this.headerValidationSampleWeight = i;
    }

    public final void setHttp2BackPressureEnabled(boolean z) {
        this.http2BackPressureEnabled = z;
    }

    public final void setHttp2ConnectionFlowControlWindow(int i) {
        this.http2ConnectionFlowControlWindow = i;
    }

    public final void setHttp2ManualFlowControlEnabled(boolean z) {
        this.http2ManualFlowControlEnabled = z;
    }

    public final void setHttp2MaxInFlightRequestsPerConnection(int i) {
        this.http2MaxInFlightRequestsPerConnection = i;
    }

    public final void setHttp2MaxInFlightRequestsPerConnectionForHosts(int i) {
        this.http2MaxInFlightRequestsPerConnectionForHosts = i;
    }

    public final void setHttp2StreamFlowControlWindow(int i) {
        this.http2StreamFlowControlWindow = i;
    }

    public final void setHttp3EnableExtendedConnect(boolean z) {
        this.http3EnableExtendedConnect = z;
    }

    public final void setLongLivedHostsEstablishTimeoutMs(int i) {
        this.longLivedHostsEstablishTimeoutMs = i;
    }

    public final void setLongLivedHostsHttp2PingIntervalMs(int i) {
        this.longLivedHostsHttp2PingIntervalMs = i;
    }

    public final void setLongLivedHostsHttp2PingTimeoutMs(int i) {
        this.longLivedHostsHttp2PingTimeoutMs = i;
    }

    public final void setLongLivedHostsHttp2PingTimeoutRestartsOnAnyFrame(boolean z) {
        this.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame = z;
    }

    public final void setLongLivedHostsHttp2StreamCloseRetiresQuietConnection(boolean z) {
        this.longLivedHostsHttp2StreamCloseRetiresQuietConnection = z;
    }

    public final void setLongLivedHostsHttp2StreamOpenPingTimeoutMs(int i) {
        this.longLivedHostsHttp2StreamOpenPingTimeoutMs = i;
    }

    public final void setLongLivedHostsHttp3PingIntervalMs(int i) {
        this.longLivedHostsHttp3PingIntervalMs = i;
    }

    public final void setLongLivedHostsTcpKeepAliveIdleTimeSeconds(int i) {
        this.longLivedHostsTcpKeepAliveIdleTimeSeconds = i;
    }

    public final void setLongLivedHostsTcpKeepAliveIntervalSeconds(int i) {
        this.longLivedHostsTcpKeepAliveIntervalSeconds = i;
    }

    public final void setLongLivedHostsTcpKeepAliveRetryCount(int i) {
        this.longLivedHostsTcpKeepAliveRetryCount = i;
    }

    public final void setMhrSampleWeight(int i) {
        this.mhrSampleWeight = i;
    }

    public final void setMnsHttpTransactionEarlySetFailState(boolean z) {
        this.mnsHttpTransactionEarlySetFailState = z;
    }

    public final void setMnsRequestBodyBackpressureMaxBufferSize(long j) {
        this.mnsRequestBodyBackpressureMaxBufferSize = j;
    }

    public final void setMnsZstdDStreamReuseEnabled(boolean z) {
        this.mnsZstdDStreamReuseEnabled = z;
    }

    public final void setMvfstAdditiveIncreaseAfterHystart(boolean z) {
        this.mvfstAdditiveIncreaseAfterHystart = z;
    }

    public final void setMvfstBatchingMode(int i) {
        this.mvfstBatchingMode = i;
    }

    public final void setMvfstCoalesceStreamReads(boolean z) {
        this.mvfstCoalesceStreamReads = z;
    }

    public final void setMvfstEnablePacing(boolean z) {
        this.mvfstEnablePacing = z;
    }

    public final void setMvfstEnableSpuriousLossRecovery(boolean z) {
        this.mvfstEnableSpuriousLossRecovery = z;
    }

    public final void setMvfstPrioritizeExpiredIdleTimeout(boolean z) {
        this.mvfstPrioritizeExpiredIdleTimeout = z;
    }

    public final void setMvfstUDPSendBufferSizeBytes(int i) {
        this.mvfstUDPSendBufferSizeBytes = i;
    }

    public final void setMvfstUseAdaptiveLossReorderingThresholds(boolean z) {
        this.mvfstUseAdaptiveLossReorderingThresholds = z;
    }

    public final void setMvfstUseContinuousMemory(boolean z) {
        this.mvfstUseContinuousMemory = z;
    }

    public final void setMvfstUseHandshakeTimeout(boolean z) {
        this.mvfstUseHandshakeTimeout = z;
    }

    public final void setMvfstUseSocketWritableEvents(boolean z) {
        this.mvfstUseSocketWritableEvents = z;
    }

    public final void setNonTransientErrorRetryLimit(int i) {
        this.nonTransientErrorRetryLimit = i;
    }

    public final void setOhaiAllowDevserverProxyUrl(boolean z) {
        this.ohaiAllowDevserverProxyUrl = z;
    }

    public final void setOhaiConfigProviderEnabled(boolean z) {
        this.ohaiConfigProviderEnabled = z;
    }

    public final void setOhaiEnabled(boolean z) {
        this.ohaiEnabled = z;
    }

    public final void setOhaiOhttpTargetNewVip(boolean z) {
        this.ohaiOhttpTargetNewVip = z;
    }

    public final void setOmitClientIpAddressesFromTelemetry(boolean z) {
        this.omitClientIpAddressesFromTelemetry = z;
    }

    public final void setPqcEnabled(boolean z) {
        this.pqcEnabled = z;
    }

    public final void setPreferIPv6ForBothTCPAndQUIC(boolean z) {
        this.preferIPv6ForBothTCPAndQUIC = z;
    }

    public final void setQuicEgressDscp(int i) {
        this.quicEgressDscp = i;
    }

    public final void setQuicEgressSoPriority(int i) {
        this.quicEgressSoPriority = i;
    }

    public final void setQuicExperimentId(int i) {
        this.quicExperimentId = i;
    }

    public final void setQuicHandshakeTimeoutMs(int i) {
        this.quicHandshakeTimeoutMs = i;
    }

    public final void setQuicIdleTimeoutMs(int i) {
        this.quicIdleTimeoutMs = i;
    }

    public final void setQuicInitialMaxData(long j) {
        this.quicInitialMaxData = j;
    }

    public final void setQuicInitialMaxStreamDataBidiLocal(long j) {
        this.quicInitialMaxStreamDataBidiLocal = j;
    }

    public final void setQuicKeepAliveTimeoutMs(int i) {
        this.quicKeepAliveTimeoutMs = i;
    }

    public final void setQuicUseMvfstMobile(boolean z) {
        this.quicUseMvfstMobile = z;
    }

    public final void setRetryDelayMaxMs(int i) {
        this.retryDelayMaxMs = i;
    }

    public final void setRetryDelayMinMs(int i) {
        this.retryDelayMinMs = i;
    }

    public final void setRetryOnTimeout(boolean z) {
        this.retryOnTimeout = z;
    }

    public final void setRunningEndToEndTest(boolean z) {
        this.isRunningEndToEndTest = z;
    }

    public final void setSecureTcpEstablishTimeoutMs(int i) {
        this.secureTcpEstablishTimeoutMs = i;
    }

    public final void setStatusCodeRetryLimit(int i) {
        this.statusCodeRetryLimit = i;
    }

    public final void setTcpDelayMs(int i) {
        this.tcpDelayMs = i;
    }

    public final void setTcpEgressDscp(int i) {
        this.tcpEgressDscp = i;
    }

    public final void setTcpEgressSoPriority(int i) {
        this.tcpEgressSoPriority = i;
    }

    public final void setTransactionReceiveTimeoutMs(int i) {
        this.transactionReceiveTimeoutMs = i;
    }

    public final void setTransientErrorRetryLimit(int i) {
        this.transientErrorRetryLimit = i;
    }

    public final void setTrustSandboxCertificates(boolean z) {
        this.trustSandboxCertificates = z;
    }

    public final void setUseDiskCacheV2(boolean z) {
        this.useDiskCacheV2 = z;
    }

    public final void setUseDiskCacheV2EventLoopExecutor(boolean z) {
        this.useDiskCacheV2EventLoopExecutor = z;
    }

    public final TigonHttpClientConfig copy(String str, String[] strArr, boolean z, boolean z2, int i, int i2, boolean z3, String[] strArr2, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, int i4, String[] strArr3, String[] strArr4, String[] strArr5, boolean z11, boolean z12, boolean z13, String str3, long j, int i5, boolean z14, int i6, boolean z15, int i7, int i8, String str4, int i9, boolean z16, boolean z17, int i10, int i11, int i12, boolean z18, boolean z19, int i13, int i14, String str5, int i15, int i16, int i17, int i18, boolean z20, String[] strArr6, long j2, boolean z21, boolean z22, int i19, boolean z23, boolean z24, boolean z25, boolean z26, int i20, boolean z27, boolean z28, boolean z29, boolean z30, int i21, boolean z31, String str6, boolean z32, boolean z33, boolean z34, String str7, String str8, boolean z35, boolean z36, boolean z37, String str9, int i22, int i23, int i24, int i25, int i26, long j3, long j4, int i27, String str10, boolean z38, String[] strArr7, String[] strArr8, int i28, int i29, boolean z39, Integer[] numArr, int i30, int i31, int i32, int i33, int i34, int i35, int i36, boolean z40, boolean z41, boolean z42) {
        AnonymousClass003.A0u(str, strArr);
        C7384Etj.A0Y(strArr2, 7);
        C7384Etj.A0Y(str2, 16);
        C7384Etj.A0Y(strArr3, 18);
        C7384Etj.A0Y(strArr4, 19);
        C7384Etj.A0Y(strArr5, 20);
        C7384Etj.A0Y(str3, 24);
        C7384Etj.A0Y(str4, 32);
        C7384Etj.A0Y(str5, 43);
        C7384Etj.A0Y(strArr6, 49);
        C7384Etj.A0Y(str6, 65);
        C7384Etj.A0Y(str7, 69);
        C7384Etj.A0Y(str8, 70);
        C7384Etj.A0Y(str9, 74);
        C7384Etj.A0Y(str10, 83);
        C7384Etj.A0Y(strArr7, 85);
        C7384Etj.A0Y(strArr8, 86);
        C7384Etj.A0Y(numArr, 90);
        return new TigonHttpClientConfig(str, strArr, z, z2, i, i2, z3, strArr2, i3, z4, z5, z6, z7, z8, z9, z10, str2, i4, strArr3, strArr4, strArr5, z11, z12, z13, str3, j, i5, z14, i6, z15, i7, i8, str4, i9, z16, z17, i10, i11, i12, z18, z19, i13, i14, str5, i15, i16, i17, i18, z20, strArr6, j2, z21, z22, i19, z23, z24, z25, z26, i20, z27, z28, z29, z30, i21, z31, str6, z32, z33, z34, str7, str8, z35, z36, z37, str9, i22, i23, i24, i25, i26, j3, j4, i27, str10, z38, strArr7, strArr8, i28, i29, z39, numArr, i30, i31, i32, i33, i34, i35, i36, z40, z41, z42);
    }

    public static /* synthetic */ TigonHttpClientConfig copy$default(TigonHttpClientConfig tigonHttpClientConfig, String str, String[] strArr, boolean z, boolean z2, int i, int i2, boolean z3, String[] strArr2, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, int i4, String[] strArr3, String[] strArr4, String[] strArr5, boolean z11, boolean z12, boolean z13, String str3, long j, int i5, boolean z14, int i6, boolean z15, int i7, int i8, String str4, int i9, boolean z16, boolean z17, int i10, int i11, int i12, boolean z18, boolean z19, int i13, int i14, String str5, int i15, int i16, int i17, int i18, boolean z20, String[] strArr6, long j2, boolean z21, boolean z22, int i19, boolean z23, boolean z24, boolean z25, boolean z26, int i20, boolean z27, boolean z28, boolean z29, boolean z30, int i21, boolean z31, String str6, boolean z32, boolean z33, boolean z34, String str7, String str8, boolean z35, boolean z36, boolean z37, String str9, int i22, int i23, int i24, int i25, int i26, long j3, long j4, int i27, String str10, boolean z38, String[] strArr7, String[] strArr8, int i28, int i29, boolean z39, Integer[] numArr, int i30, int i31, int i32, int i33, int i34, int i35, int i36, boolean z40, boolean z41, boolean z42, int i37, int i38, int i39, int i40, Object obj) {
        String[] strArr9 = strArr;
        boolean z43 = z;
        boolean z44 = z2;
        int i41 = i;
        int i42 = i2;
        String str11 = str;
        boolean z45 = z3;
        String[] strArr10 = strArr2;
        int i43 = i3;
        boolean z46 = z4;
        boolean z47 = z5;
        boolean z48 = z6;
        boolean z49 = z7;
        String[] strArr11 = strArr4;
        String[] strArr12 = strArr5;
        boolean z50 = z11;
        boolean z51 = z12;
        boolean z52 = z13;
        String str12 = str3;
        long j5 = j;
        String str13 = str4;
        boolean z53 = z17;
        int i44 = i10;
        int i45 = i11;
        String str14 = str5;
        boolean z54 = z20;
        String[] strArr13 = strArr6;
        long j6 = j2;
        boolean z55 = z21;
        int i46 = i19;
        String str15 = str6;
        boolean z56 = z32;
        boolean z57 = z33;
        boolean z58 = z34;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        int i47 = i24;
        int i48 = i25;
        int i49 = i26;
        long j7 = j3;
        long j8 = j4;
        String str19 = str10;
        String[] strArr14 = strArr7;
        String[] strArr15 = strArr8;
        Integer[] numArr2 = numArr;
        int i50 = i32;
        int i51 = i33;
        int i52 = i34;
        int i53 = i35;
        int i54 = i36;
        boolean z59 = z40;
        boolean z60 = z41;
        boolean z61 = z8;
        boolean z62 = z9;
        boolean z63 = z10;
        String str20 = str2;
        int i55 = i4;
        String[] strArr16 = strArr3;
        int i56 = i5;
        boolean z64 = z14;
        int i57 = i6;
        boolean z65 = z15;
        int i58 = i7;
        int i59 = i8;
        int i60 = i9;
        boolean z66 = z16;
        int i61 = i12;
        boolean z67 = z18;
        boolean z68 = z19;
        int i62 = i13;
        int i63 = i14;
        int i64 = i15;
        int i65 = i16;
        int i66 = i17;
        int i67 = i18;
        boolean z69 = z22;
        boolean z70 = z23;
        boolean z71 = z24;
        boolean z72 = z25;
        boolean z73 = z26;
        int i68 = i20;
        boolean z74 = z27;
        boolean z75 = z28;
        boolean z76 = z29;
        boolean z77 = z30;
        int i69 = i21;
        boolean z78 = z31;
        boolean z79 = z35;
        boolean z80 = z36;
        boolean z81 = z37;
        int i70 = i22;
        int i71 = i23;
        int i72 = i27;
        boolean z82 = z38;
        int i73 = i28;
        int i74 = i29;
        boolean z83 = z39;
        int i75 = i30;
        int i76 = i31;
        boolean z84 = z42;
        if ((i37 & 1) != 0) {
            str11 = tigonHttpClientConfig.cacheDirectory;
        }
        if ((i37 & 2) != 0) {
            strArr9 = tigonHttpClientConfig.additionalRedirectHeaders;
        }
        if ((i37 & 4) != 0) {
            z43 = tigonHttpClientConfig.autotuneReceiveConnFlowControl;
        }
        if ((i37 & 8) != 0) {
            z44 = tigonHttpClientConfig.autotuneReceiveStreamFlowControl;
        }
        if ((i37 & 16) != 0) {
            i41 = tigonHttpClientConfig.bugReportAnalyticsRequestSampleWeight;
        }
        if ((i37 & 32) != 0) {
            i42 = tigonHttpClientConfig.bugReportMaxLastTelemetryEvents;
        }
        if ((i37 & 64) != 0) {
            z45 = tigonHttpClientConfig.certCompressionEnabled;
        }
        if ((i37 & 128) != 0) {
            strArr10 = tigonHttpClientConfig.combinableResponseHeaders;
        }
        if ((i37 & 256) != 0) {
            i43 = tigonHttpClientConfig.connectionExpiryTimeoutMs;
        }
        if ((i37 & 512) != 0) {
            z46 = tigonHttpClientConfig.disableZstd;
        }
        if ((i37 & 1024) != 0) {
            z47 = tigonHttpClientConfig.enableBugReport;
        }
        if ((i37 & 2048) != 0) {
            z48 = tigonHttpClientConfig.enableCertificateVerificationWithProofOfPossession;
        }
        if ((i37 & 4096) != 0) {
            z49 = tigonHttpClientConfig.enableGiphyOverMNS;
        }
        if ((i37 & 8192) != 0) {
            z61 = tigonHttpClientConfig.enableMNSQPL;
        }
        if ((i37 & 16384) != 0) {
            z62 = tigonHttpClientConfig.enableMnsWebSocketConnectionQpl;
        }
        if ((i37 & 32768) != 0) {
            z63 = tigonHttpClientConfig.enableNoiseGate;
        }
        if ((i37 & 65536) != 0) {
            str20 = tigonHttpClientConfig.eventLoopThreadName;
        }
        if ((i37 & 131072) != 0) {
            i55 = tigonHttpClientConfig.eventLoopThreadPriority;
        }
        if ((i37 & 262144) != 0) {
            strArr16 = tigonHttpClientConfig.externalRequestInterceptorAdditionalPlaintextAllowlist;
        }
        if ((i37 & 524288) != 0) {
            strArr11 = tigonHttpClientConfig.externalRequestInterceptorAdditionalThirdPartyAllowlist;
        }
        if ((i37 & 1048576) != 0) {
            strArr12 = tigonHttpClientConfig.externalRequestInterceptorCredentialDomainAllowlist;
        }
        if ((i37 & 2097152) != 0) {
            z50 = tigonHttpClientConfig.externalRequestInterceptorEnforceSanitization;
        }
        if ((i37 & 4194304) != 0) {
            z51 = tigonHttpClientConfig.fizzMobileEnabled;
        }
        if ((i37 & 8388608) != 0) {
            z52 = tigonHttpClientConfig.forceHttp2;
        }
        if ((i37 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str12 = tigonHttpClientConfig.forceHttp2HostsRegex;
        }
        if ((i37 & 33554432) != 0) {
            j5 = tigonHttpClientConfig.giphyRaceHedgeDelayMs;
        }
        if ((i37 & 67108864) != 0) {
            i56 = tigonHttpClientConfig.headerValidationSampleWeight;
        }
        if ((i37 & 134217728) != 0) {
            z64 = tigonHttpClientConfig.http2BackPressureEnabled;
        }
        if ((i37 & 268435456) != 0) {
            i57 = tigonHttpClientConfig.http2ConnectionFlowControlWindow;
        }
        if ((i37 & 536870912) != 0) {
            z65 = tigonHttpClientConfig.http2ManualFlowControlEnabled;
        }
        if ((i37 & 1073741824) != 0) {
            i58 = tigonHttpClientConfig.http2MaxInFlightRequestsPerConnection;
        }
        if ((i37 & Integer.MIN_VALUE) != 0) {
            i59 = tigonHttpClientConfig.http2MaxInFlightRequestsPerConnectionForHosts;
        }
        if ((i38 & 1) != 0) {
            str13 = tigonHttpClientConfig.http2MaxInFlightRequestsPerConnectionHostsRegex;
        }
        if ((i38 & 2) != 0) {
            i60 = tigonHttpClientConfig.http2StreamFlowControlWindow;
        }
        if ((i38 & 4) != 0) {
            z66 = tigonHttpClientConfig.http3EnableExtendedConnect;
        }
        if ((i38 & 8) != 0) {
            z53 = tigonHttpClientConfig.isRunningEndToEndTest;
        }
        if ((i38 & 16) != 0) {
            i44 = tigonHttpClientConfig.longLivedHostsEstablishTimeoutMs;
        }
        if ((i38 & 32) != 0) {
            i45 = tigonHttpClientConfig.longLivedHostsHttp2PingIntervalMs;
        }
        if ((i38 & 64) != 0) {
            i61 = tigonHttpClientConfig.longLivedHostsHttp2PingTimeoutMs;
        }
        if ((i38 & 128) != 0) {
            z67 = tigonHttpClientConfig.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame;
        }
        if ((i38 & 256) != 0) {
            z68 = tigonHttpClientConfig.longLivedHostsHttp2StreamCloseRetiresQuietConnection;
        }
        if ((i38 & 512) != 0) {
            i62 = tigonHttpClientConfig.longLivedHostsHttp2StreamOpenPingTimeoutMs;
        }
        if ((i38 & 1024) != 0) {
            i63 = tigonHttpClientConfig.longLivedHostsHttp3PingIntervalMs;
        }
        if ((i38 & 2048) != 0) {
            str14 = tigonHttpClientConfig.longLivedHostsRegex;
        }
        if ((i38 & 4096) != 0) {
            i64 = tigonHttpClientConfig.longLivedHostsTcpKeepAliveIdleTimeSeconds;
        }
        if ((i38 & 8192) != 0) {
            i65 = tigonHttpClientConfig.longLivedHostsTcpKeepAliveIntervalSeconds;
        }
        if ((i38 & 16384) != 0) {
            i66 = tigonHttpClientConfig.longLivedHostsTcpKeepAliveRetryCount;
        }
        if ((i38 & 32768) != 0) {
            i67 = tigonHttpClientConfig.mhrSampleWeight;
        }
        if ((i38 & 65536) != 0) {
            z54 = tigonHttpClientConfig.mnsHttpTransactionEarlySetFailState;
        }
        if ((i38 & 131072) != 0) {
            strArr13 = tigonHttpClientConfig.mnsQplFilteredUrlSubstrings;
        }
        if ((i38 & 262144) != 0) {
            j6 = tigonHttpClientConfig.mnsRequestBodyBackpressureMaxBufferSize;
        }
        if ((i38 & 524288) != 0) {
            z55 = tigonHttpClientConfig.mnsZstdDStreamReuseEnabled;
        }
        if ((i38 & 1048576) != 0) {
            z69 = tigonHttpClientConfig.mvfstAdditiveIncreaseAfterHystart;
        }
        if ((i38 & 2097152) != 0) {
            i46 = tigonHttpClientConfig.mvfstBatchingMode;
        }
        if ((i38 & 4194304) != 0) {
            z70 = tigonHttpClientConfig.mvfstCoalesceStreamReads;
        }
        if ((i38 & 8388608) != 0) {
            z71 = tigonHttpClientConfig.mvfstEnablePacing;
        }
        if ((i38 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            z72 = tigonHttpClientConfig.mvfstEnableSpuriousLossRecovery;
        }
        if ((i38 & 33554432) != 0) {
            z73 = tigonHttpClientConfig.mvfstPrioritizeExpiredIdleTimeout;
        }
        if ((i38 & 67108864) != 0) {
            i68 = tigonHttpClientConfig.mvfstUDPSendBufferSizeBytes;
        }
        if ((i38 & 134217728) != 0) {
            z74 = tigonHttpClientConfig.mvfstUseAdaptiveLossReorderingThresholds;
        }
        if ((i38 & 268435456) != 0) {
            z75 = tigonHttpClientConfig.mvfstUseContinuousMemory;
        }
        if ((i38 & 536870912) != 0) {
            z76 = tigonHttpClientConfig.mvfstUseHandshakeTimeout;
        }
        if ((i38 & 1073741824) != 0) {
            z77 = tigonHttpClientConfig.mvfstUseSocketWritableEvents;
        }
        if ((i38 & Integer.MIN_VALUE) != 0) {
            i69 = tigonHttpClientConfig.nonTransientErrorRetryLimit;
        }
        if ((i39 & 1) != 0) {
            z78 = tigonHttpClientConfig.ohaiAllowDevserverProxyUrl;
        }
        if ((i39 & 2) != 0) {
            str15 = tigonHttpClientConfig.ohaiAllowedGraphQLQueries;
        }
        if ((i39 & 4) != 0) {
            z56 = tigonHttpClientConfig.ohaiConfigProviderEnabled;
        }
        if ((i39 & 8) != 0) {
            z57 = tigonHttpClientConfig.ohaiEnabled;
        }
        if ((i39 & 16) != 0) {
            z58 = tigonHttpClientConfig.ohaiOhttpTargetNewVip;
        }
        if ((i39 & 32) != 0) {
            str16 = tigonHttpClientConfig.ohaiProxyChunkedUrl;
        }
        if ((i39 & 64) != 0) {
            str17 = tigonHttpClientConfig.ohaiProxyUrl;
        }
        if ((i39 & 128) != 0) {
            z79 = tigonHttpClientConfig.omitClientIpAddressesFromTelemetry;
        }
        if ((i39 & 256) != 0) {
            z80 = tigonHttpClientConfig.pqcEnabled;
        }
        if ((i39 & 512) != 0) {
            z81 = tigonHttpClientConfig.preferIPv6ForBothTCPAndQUIC;
        }
        if ((i39 & 1024) != 0) {
            str18 = tigonHttpClientConfig.proxyHostAndPortForE2ETest;
        }
        if ((i39 & 2048) != 0) {
            i70 = tigonHttpClientConfig.quicEgressDscp;
        }
        if ((i39 & 4096) != 0) {
            i71 = tigonHttpClientConfig.quicEgressSoPriority;
        }
        if ((i39 & 8192) != 0) {
            i47 = tigonHttpClientConfig.quicExperimentId;
        }
        if ((i39 & 16384) != 0) {
            i48 = tigonHttpClientConfig.quicHandshakeTimeoutMs;
        }
        if ((i39 & 32768) != 0) {
            i49 = tigonHttpClientConfig.quicIdleTimeoutMs;
        }
        if ((i39 & 65536) != 0) {
            j7 = tigonHttpClientConfig.quicInitialMaxData;
        }
        if ((i39 & 131072) != 0) {
            j8 = tigonHttpClientConfig.quicInitialMaxStreamDataBidiLocal;
        }
        if ((i39 & 262144) != 0) {
            i72 = tigonHttpClientConfig.quicKeepAliveTimeoutMs;
        }
        if ((i39 & 524288) != 0) {
            str19 = tigonHttpClientConfig.quicKnobsJson;
        }
        if ((i39 & 1048576) != 0) {
            z82 = tigonHttpClientConfig.quicUseMvfstMobile;
        }
        if ((i39 & 2097152) != 0) {
            strArr14 = tigonHttpClientConfig.requestInterceptorsOrder;
        }
        if ((i39 & 4194304) != 0) {
            strArr15 = tigonHttpClientConfig.responseInterceptorsOrder;
        }
        if ((i39 & 8388608) != 0) {
            i73 = tigonHttpClientConfig.retryDelayMaxMs;
        }
        if ((i39 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            i74 = tigonHttpClientConfig.retryDelayMinMs;
        }
        if ((i39 & 33554432) != 0) {
            z83 = tigonHttpClientConfig.retryOnTimeout;
        }
        if ((i39 & 67108864) != 0) {
            numArr2 = tigonHttpClientConfig.retryStatusCodes;
        }
        if ((i39 & 134217728) != 0) {
            i75 = tigonHttpClientConfig.secureTcpEstablishTimeoutMs;
        }
        if ((i39 & 268435456) != 0) {
            i76 = tigonHttpClientConfig.statusCodeRetryLimit;
        }
        if ((i39 & 536870912) != 0) {
            i50 = tigonHttpClientConfig.tcpDelayMs;
        }
        if ((i39 & 1073741824) != 0) {
            i51 = tigonHttpClientConfig.tcpEgressDscp;
        }
        if ((i39 & Integer.MIN_VALUE) != 0) {
            i52 = tigonHttpClientConfig.tcpEgressSoPriority;
        }
        if ((i40 & 1) != 0) {
            i53 = tigonHttpClientConfig.transactionReceiveTimeoutMs;
        }
        if ((i40 & 2) != 0) {
            i54 = tigonHttpClientConfig.transientErrorRetryLimit;
        }
        if ((i40 & 4) != 0) {
            z59 = tigonHttpClientConfig.trustSandboxCertificates;
        }
        if ((i40 & 8) != 0) {
            z60 = tigonHttpClientConfig.useDiskCacheV2;
        }
        if ((i40 & 16) != 0) {
            z84 = tigonHttpClientConfig.useDiskCacheV2EventLoopExecutor;
        }
        return tigonHttpClientConfig.copy(str11, strArr9, z43, z44, i41, i42, z45, strArr10, i43, z46, z47, z48, z49, z61, z62, z63, str20, i55, strArr16, strArr11, strArr12, z50, z51, z52, str12, j5, i56, z64, i57, z65, i58, i59, str13, i60, z66, z53, i44, i45, i61, z67, z68, i62, i63, str14, i64, i65, i66, i67, z54, strArr13, j6, z55, z69, i46, z70, z71, z72, z73, i68, z74, z75, z76, z77, i69, z78, str15, z56, z57, z58, str16, str17, z79, z80, z81, str18, i70, i71, i47, i48, i49, j7, j8, i72, str19, z82, strArr14, strArr15, i73, i74, z83, numArr2, i75, i76, i50, i51, i52, i53, i54, z59, z60, z84);
    }

    public /* synthetic */ TigonHttpClientConfig(String str, String[] strArr, boolean z, boolean z2, int i, int i2, boolean z3, String[] strArr2, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, int i4, String[] strArr3, String[] strArr4, String[] strArr5, boolean z11, boolean z12, boolean z13, String str3, long j, int i5, boolean z14, int i6, boolean z15, int i7, int i8, String str4, int i9, boolean z16, boolean z17, int i10, int i11, int i12, boolean z18, boolean z19, int i13, int i14, String str5, int i15, int i16, int i17, int i18, boolean z20, String[] strArr6, long j2, boolean z21, boolean z22, int i19, boolean z23, boolean z24, boolean z25, boolean z26, int i20, boolean z27, boolean z28, boolean z29, boolean z30, int i21, boolean z31, String str6, boolean z32, boolean z33, boolean z34, String str7, String str8, boolean z35, boolean z36, boolean z37, String str9, int i22, int i23, int i24, int i25, int i26, long j3, long j4, int i27, String str10, boolean z38, String[] strArr7, String[] strArr8, int i28, int i29, boolean z39, Integer[] numArr, int i30, int i31, int i32, int i33, int i34, int i35, int i36, boolean z40, boolean z41, boolean z42, int i37, int i38, int i39, int i40, C06H c06h) {
        this(str, (i37 & 2) != 0 ? new String[0] : strArr, C3cG.A1K(i37 & 4, z), C3cG.A1K(i37 & 8, z2), (i37 & 16) != 0 ? 100 : i, (i37 & 32) != 0 ? 1000 : i2, C3cG.A1K(i37 & 64, z3), (i37 & 128) != 0 ? new String[]{"Set-Cookie"} : strArr2, (i37 & 256) != 0 ? 0 : i3, C3cG.A1K(i37 & 512, z4), C3cG.A1K(i37 & 1024, z5), C3cG.A1K(i37 & 2048, z6), C3cG.A1K(i37 & 4096, z7), (i37 & 8192) != 0 ? true : z8, C3cG.A1K(i37 & 16384, z9), C3cH.A1L(i37, 32768, z10), (i37 & 65536) != 0 ? "TigonHttpClientEventLoop" : str2, BV7.A05(i37, 131072, i4), (i37 & 262144) != 0 ? new String[0] : strArr3, (i37 & 524288) != 0 ? new String[0] : strArr4, (i37 & 1048576) != 0 ? new String[0] : strArr5, (i37 & 2097152) != 0 ? true : z11, C3cH.A1L(i37, 4194304, z12), C3cH.A1L(i37, 8388608, z13), (i37 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? "" : str3, C3cH.A03(i37 & 33554432, j), BV7.A05(i37, 67108864, i5), C3cH.A1L(i37, 134217728, z14), BV7.A05(i37, 268435456, i6), C3cH.A1L(i37, 536870912, z15), BV7.A05(i37, 1073741824, i7), BV7.A05(i37, Integer.MIN_VALUE, i8), (i38 & 1) != 0 ? "" : str4, (i38 & 2) != 0 ? 0 : i9, C3cG.A1K(i38 & 4, z16), C3cG.A1K(i38 & 8, z17), (i38 & 16) != 0 ? 0 : i10, (i38 & 32) != 0 ? 0 : i11, (i38 & 64) != 0 ? 0 : i12, C3cG.A1K(i38 & 128, z18), C3cG.A1K(i38 & 256, z19), (i38 & 512) != 0 ? 0 : i13, (i38 & 1024) != 0 ? 0 : i14, (i38 & 2048) != 0 ? "" : str5, (i38 & 4096) != 0 ? 0 : i15, (i38 & 8192) != 0 ? 0 : i16, (i38 & 16384) != 0 ? 0 : i17, (i38 & 32768) != 0 ? 10000 : i18, C3cH.A1L(i38, 65536, z20), (i38 & 131072) != 0 ? new String[0] : strArr6, C3cH.A03(i38 & 262144, j2), C3cH.A1L(i38, 524288, z21), C3cH.A1L(i38, 1048576, z22), BV7.A05(i38, 2097152, i19), C3cH.A1L(i38, 4194304, z23), C3cH.A1L(i38, 8388608, z24), C3cH.A1L(i38, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, z25), C3cH.A1L(i38, 33554432, z26), BV7.A05(i38, 67108864, i20), C3cH.A1L(i38, 134217728, z27), C3cH.A1L(i38, 268435456, z28), C3cH.A1L(i38, 536870912, z29), C3cH.A1L(i38, 1073741824, z30), (i38 & Integer.MIN_VALUE) != 0 ? 2 : i21, C3cG.A1K(i39 & 1, z31), (i39 & 2) != 0 ? "" : str6, C3cG.A1K(i39 & 4, z32), C3cG.A1K(i39 & 8, z33), C3cG.A1K(i39 & 16, z34), (i39 & 32) != 0 ? "" : str7, (i39 & 64) != 0 ? "" : str8, C3cG.A1K(i39 & 128, z35), C3cG.A1K(i39 & 256, z36), C3cG.A1K(i39 & 512, z37), (i39 & 1024) != 0 ? "" : str9, (i39 & 2048) != 0 ? 0 : i22, (i39 & 4096) != 0 ? 0 : i23, (i39 & 8192) != 0 ? 0 : i24, (i39 & 16384) != 0 ? 0 : i25, BV7.A05(i39, 32768, i26), C3cH.A03(i39 & 65536, j3), (i39 & 131072) == 0 ? j4 : 0L, BV7.A05(i39, 262144, i27), (i39 & 524288) == 0 ? str10 : "", (i39 & 1048576) != 0 ? true : z38, (i39 & 2097152) != 0 ? new String[0] : strArr7, (i39 & 4194304) != 0 ? new String[0] : strArr8, (8388608 & i39) != 0 ? 600000 : i28, (i39 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? 2000 : i29, (i39 & 33554432) != 0 ? true : z39, (i39 & 67108864) != 0 ? new Integer[0] : numArr, BV7.A05(i39, 134217728, i30), BV7.A05(i39, 268435456, i31), BV7.A05(i39, 536870912, i32), BV7.A05(i39, 1073741824, i33), BV7.A05(i39, Integer.MIN_VALUE, i34), (i40 & 1) != 0 ? 0 : i35, (i40 & 2) != 0 ? 15 : i36, C3cG.A1K(i40 & 4, z40), C3cG.A1K(i40 & 8, z41), C3cG.A1K(i40 & 16, z42));
    }

    public TigonHttpClientConfig(String str, String[] strArr, boolean z, boolean z2, int i, int i2, boolean z3, String[] strArr2, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, int i4, String[] strArr3, String[] strArr4, String[] strArr5, boolean z11, boolean z12, boolean z13, String str3, long j, int i5, boolean z14, int i6, boolean z15, int i7, int i8, String str4, int i9, boolean z16, boolean z17, int i10, int i11, int i12, boolean z18, boolean z19, int i13, int i14, String str5, int i15, int i16, int i17, int i18, boolean z20, String[] strArr6, long j2, boolean z21, boolean z22, int i19, boolean z23, boolean z24, boolean z25, boolean z26, int i20, boolean z27, boolean z28, boolean z29, boolean z30, int i21, boolean z31, String str6, boolean z32, boolean z33, boolean z34, String str7, String str8, boolean z35, boolean z36, boolean z37, String str9, int i22, int i23, int i24, int i25, int i26, long j3, long j4, int i27, String str10, boolean z38, String[] strArr7, String[] strArr8, int i28, int i29, boolean z39, Integer[] numArr, int i30, int i31, int i32, int i33, int i34, int i35, int i36, boolean z40, boolean z41, boolean z42) {
        AnonymousClass003.A0u(str, strArr);
        C7384Etj.A0Y(strArr2, 7);
        C7384Etj.A0Y(str2, 16);
        C7384Etj.A0Y(strArr3, 18);
        C7384Etj.A0Y(strArr4, 19);
        C7384Etj.A0Y(strArr5, 20);
        C7384Etj.A0Y(str3, 24);
        C7384Etj.A0Y(str4, 32);
        C7384Etj.A0Y(str5, 43);
        C7384Etj.A0Y(strArr6, 49);
        C7384Etj.A0Y(str6, 65);
        C7384Etj.A0Y(str7, 69);
        C7384Etj.A0Y(str8, 70);
        C7384Etj.A0Y(str9, 74);
        C7384Etj.A0Y(str10, 83);
        C7384Etj.A0Y(strArr7, 85);
        C7384Etj.A0Y(strArr8, 86);
        C7384Etj.A0Y(numArr, 90);
        this.cacheDirectory = str;
        this.additionalRedirectHeaders = strArr;
        this.autotuneReceiveConnFlowControl = z;
        this.autotuneReceiveStreamFlowControl = z2;
        this.bugReportAnalyticsRequestSampleWeight = i;
        this.bugReportMaxLastTelemetryEvents = i2;
        this.certCompressionEnabled = z3;
        this.combinableResponseHeaders = strArr2;
        this.connectionExpiryTimeoutMs = i3;
        this.disableZstd = z4;
        this.enableBugReport = z5;
        this.enableCertificateVerificationWithProofOfPossession = z6;
        this.enableGiphyOverMNS = z7;
        this.enableMNSQPL = z8;
        this.enableMnsWebSocketConnectionQpl = z9;
        this.enableNoiseGate = z10;
        this.eventLoopThreadName = str2;
        this.eventLoopThreadPriority = i4;
        this.externalRequestInterceptorAdditionalPlaintextAllowlist = strArr3;
        this.externalRequestInterceptorAdditionalThirdPartyAllowlist = strArr4;
        this.externalRequestInterceptorCredentialDomainAllowlist = strArr5;
        this.externalRequestInterceptorEnforceSanitization = z11;
        this.fizzMobileEnabled = z12;
        this.forceHttp2 = z13;
        this.forceHttp2HostsRegex = str3;
        this.giphyRaceHedgeDelayMs = j;
        this.headerValidationSampleWeight = i5;
        this.http2BackPressureEnabled = z14;
        this.http2ConnectionFlowControlWindow = i6;
        this.http2ManualFlowControlEnabled = z15;
        this.http2MaxInFlightRequestsPerConnection = i7;
        this.http2MaxInFlightRequestsPerConnectionForHosts = i8;
        this.http2MaxInFlightRequestsPerConnectionHostsRegex = str4;
        this.http2StreamFlowControlWindow = i9;
        this.http3EnableExtendedConnect = z16;
        this.isRunningEndToEndTest = z17;
        this.longLivedHostsEstablishTimeoutMs = i10;
        this.longLivedHostsHttp2PingIntervalMs = i11;
        this.longLivedHostsHttp2PingTimeoutMs = i12;
        this.longLivedHostsHttp2PingTimeoutRestartsOnAnyFrame = z18;
        this.longLivedHostsHttp2StreamCloseRetiresQuietConnection = z19;
        this.longLivedHostsHttp2StreamOpenPingTimeoutMs = i13;
        this.longLivedHostsHttp3PingIntervalMs = i14;
        this.longLivedHostsRegex = str5;
        this.longLivedHostsTcpKeepAliveIdleTimeSeconds = i15;
        this.longLivedHostsTcpKeepAliveIntervalSeconds = i16;
        this.longLivedHostsTcpKeepAliveRetryCount = i17;
        this.mhrSampleWeight = i18;
        this.mnsHttpTransactionEarlySetFailState = z20;
        this.mnsQplFilteredUrlSubstrings = strArr6;
        this.mnsRequestBodyBackpressureMaxBufferSize = j2;
        this.mnsZstdDStreamReuseEnabled = z21;
        this.mvfstAdditiveIncreaseAfterHystart = z22;
        this.mvfstBatchingMode = i19;
        this.mvfstCoalesceStreamReads = z23;
        this.mvfstEnablePacing = z24;
        this.mvfstEnableSpuriousLossRecovery = z25;
        this.mvfstPrioritizeExpiredIdleTimeout = z26;
        this.mvfstUDPSendBufferSizeBytes = i20;
        this.mvfstUseAdaptiveLossReorderingThresholds = z27;
        this.mvfstUseContinuousMemory = z28;
        this.mvfstUseHandshakeTimeout = z29;
        this.mvfstUseSocketWritableEvents = z30;
        this.nonTransientErrorRetryLimit = i21;
        this.ohaiAllowDevserverProxyUrl = z31;
        this.ohaiAllowedGraphQLQueries = str6;
        this.ohaiConfigProviderEnabled = z32;
        this.ohaiEnabled = z33;
        this.ohaiOhttpTargetNewVip = z34;
        this.ohaiProxyChunkedUrl = str7;
        this.ohaiProxyUrl = str8;
        this.omitClientIpAddressesFromTelemetry = z35;
        this.pqcEnabled = z36;
        this.preferIPv6ForBothTCPAndQUIC = z37;
        this.proxyHostAndPortForE2ETest = str9;
        this.quicEgressDscp = i22;
        this.quicEgressSoPriority = i23;
        this.quicExperimentId = i24;
        this.quicHandshakeTimeoutMs = i25;
        this.quicIdleTimeoutMs = i26;
        this.quicInitialMaxData = j3;
        this.quicInitialMaxStreamDataBidiLocal = j4;
        this.quicKeepAliveTimeoutMs = i27;
        this.quicKnobsJson = str10;
        this.quicUseMvfstMobile = z38;
        this.requestInterceptorsOrder = strArr7;
        this.responseInterceptorsOrder = strArr8;
        this.retryDelayMaxMs = i28;
        this.retryDelayMinMs = i29;
        this.retryOnTimeout = z39;
        this.retryStatusCodes = numArr;
        this.secureTcpEstablishTimeoutMs = i30;
        this.statusCodeRetryLimit = i31;
        this.tcpDelayMs = i32;
        this.tcpEgressDscp = i33;
        this.tcpEgressSoPriority = i34;
        this.transactionReceiveTimeoutMs = i35;
        this.transientErrorRetryLimit = i36;
        this.trustSandboxCertificates = z40;
        this.useDiskCacheV2 = z41;
        this.useDiskCacheV2EventLoopExecutor = z42;
    }
}

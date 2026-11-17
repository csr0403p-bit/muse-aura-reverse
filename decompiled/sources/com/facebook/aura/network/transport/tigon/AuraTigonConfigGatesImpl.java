package com.facebook.aura.network.transport.tigon;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C31u;
import X.C3cG;
import X.C7BY;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import com.facebook.aura.network.endpoint.AuraEndpointSelector;
import com.facebook.aura.network.tigon.AuraTigonConfigGates;
import com.facebook.aura.network.transport.tigon.MC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class AuraTigonConfigGatesImpl implements AuraTigonConfigGates {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(AuraTigonConfigGatesImpl.class, "externalRequestInterceptorAdditionalPlaintextAllowlist", "getExternalRequestInterceptorAdditionalPlaintextAllowlist()Ljava/lang/String;"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "externalRequestInterceptorAdditionalThirdPartyAllowlist", "getExternalRequestInterceptorAdditionalThirdPartyAllowlist()Ljava/lang/String;"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "fizzEnabled", "getFizzEnabled()Z"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "fizzPqcEnabled", "getFizzPqcEnabled()Z"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2StreamsPerConnection", "getGatewayHttp2StreamsPerConnection()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2PingIntervalMs", "getGatewayHttp2PingIntervalMs()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2PingTimeoutMs", "getGatewayHttp2PingTimeoutMs()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2StreamCloseRetiresQuietConnection", "getGatewayHttp2StreamCloseRetiresQuietConnection()Z"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2EstablishTimeoutMs", "getGatewayHttp2EstablishTimeoutMs()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2TcpKeepAliveIdleSeconds", "getGatewayHttp2TcpKeepAliveIdleSeconds()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2TcpKeepAliveIntervalSeconds", "getGatewayHttp2TcpKeepAliveIntervalSeconds()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "gatewayHttp2TcpKeepAliveRetryCount", "getGatewayHttp2TcpKeepAliveRetryCount()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "http2ConnectionFlowControlWindow", "getHttp2ConnectionFlowControlWindow()I"), C3cG.A0y(AuraTigonConfigGatesImpl.class, "http2StreamFlowControlWindow", "getHttp2StreamFlowControlWindow()I")};
    public static final AuraTigonConfigGatesImpl INSTANCE = new AuraTigonConfigGatesImpl();
    public static final C31u externalRequestInterceptorAdditionalPlaintextAllowlist$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_networking.external_request_interceptor_additional_plaintext_allowlist);
    public static final C31u externalRequestInterceptorAdditionalThirdPartyAllowlist$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_networking.external_request_interceptor_additional_third_party_allowlist);
    public static final C31u fizzEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.fizz_enabled);
    public static final C31u fizzPqcEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.fizz_pqc_enabled);
    public static final C31u gatewayHttp2StreamsPerConnection$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_http2_streams_per_connection);
    public static final C31u gatewayHttp2PingIntervalMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_http2_ping_interval_ms);
    public static final C31u gatewayHttp2PingTimeoutMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_http2_ping_timeout_ms);
    public static final C31u gatewayHttp2StreamCloseRetiresQuietConnection$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.gateway_http2_stream_close_retires_quiet_connection);
    public static final C31u gatewayHttp2EstablishTimeoutMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_http2_establish_timeout_ms);
    public static final C31u gatewayHttp2TcpKeepAliveIdleSeconds$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_http2_tcp_keepalive_idle_seconds);
    public static final C31u gatewayHttp2TcpKeepAliveIntervalSeconds$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_http2_tcp_keepalive_interval_seconds);
    public static final C31u gatewayHttp2TcpKeepAliveRetryCount$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_http2_tcp_keepalive_retry_count);
    public static final C31u http2ConnectionFlowControlWindow$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.http2_connection_flow_control_window);
    public static final C31u http2StreamFlowControlWindow$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.http2_stream_flow_control_window);

    private final String getExternalRequestInterceptorAdditionalPlaintextAllowlist() {
        return BV5.A0m(this, externalRequestInterceptorAdditionalPlaintextAllowlist$delegate, $$delegatedProperties, 0);
    }

    private final String getExternalRequestInterceptorAdditionalThirdPartyAllowlist() {
        return BV5.A0m(this, externalRequestInterceptorAdditionalThirdPartyAllowlist$delegate, $$delegatedProperties, 1);
    }

    private final boolean getFizzEnabled() {
        return C31u.A01(this, fizzEnabled$delegate, $$delegatedProperties, 2);
    }

    private final boolean getFizzPqcEnabled() {
        return C31u.A01(this, fizzPqcEnabled$delegate, $$delegatedProperties, 3);
    }

    private final int getGatewayHttp2EstablishTimeoutMs() {
        return BV5.A05(this, gatewayHttp2EstablishTimeoutMs$delegate, $$delegatedProperties, 8);
    }

    private final int getGatewayHttp2PingIntervalMs() {
        return BV5.A05(this, gatewayHttp2PingIntervalMs$delegate, $$delegatedProperties, 5);
    }

    private final int getGatewayHttp2PingTimeoutMs() {
        return BV5.A05(this, gatewayHttp2PingTimeoutMs$delegate, $$delegatedProperties, 6);
    }

    private final boolean getGatewayHttp2StreamCloseRetiresQuietConnection() {
        return C31u.A01(this, gatewayHttp2StreamCloseRetiresQuietConnection$delegate, $$delegatedProperties, 7);
    }

    private final int getGatewayHttp2StreamsPerConnection() {
        return BV5.A05(this, gatewayHttp2StreamsPerConnection$delegate, $$delegatedProperties, 4);
    }

    private final int getGatewayHttp2TcpKeepAliveIdleSeconds() {
        return BV5.A05(this, gatewayHttp2TcpKeepAliveIdleSeconds$delegate, $$delegatedProperties, 9);
    }

    private final int getGatewayHttp2TcpKeepAliveIntervalSeconds() {
        return BV5.A05(this, gatewayHttp2TcpKeepAliveIntervalSeconds$delegate, $$delegatedProperties, 10);
    }

    private final int getGatewayHttp2TcpKeepAliveRetryCount() {
        return BV5.A05(this, gatewayHttp2TcpKeepAliveRetryCount$delegate, $$delegatedProperties, 11);
    }

    private final int getHttp2ConnectionFlowControlWindow() {
        return BV5.A05(this, http2ConnectionFlowControlWindow$delegate, $$delegatedProperties, 12);
    }

    private final int getHttp2StreamFlowControlWindow() {
        return BV5.A05(this, http2StreamFlowControlWindow$delegate, $$delegatedProperties, 13);
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public String[] externalRequestInterceptorCredentialDomainAllowlist() {
        return new String[]{AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX, AuraEndpointSelector.DEFAULT_DOMAIN_SUFFIX, "meta.ai", "api.muse.ai"};
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public String[] externalRequestInterceptorAdditionalPlaintextAllowlist() {
        List listA0e = C7BY.A0e(getExternalRequestInterceptorAdditionalPlaintextAllowlist(), ",");
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0e);
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(C7BY.A0F((String) it.next()).toString());
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : arrayListA0i) {
            if (!C7BY.A0j((String) obj)) {
                arrayListA0h.add(obj);
            }
        }
        return BV4.A1b(arrayListA0h);
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public String[] externalRequestInterceptorAdditionalThirdPartyAllowlist() {
        List listA0e = C7BY.A0e(getExternalRequestInterceptorAdditionalThirdPartyAllowlist(), ",");
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0e);
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(C7BY.A0F((String) it.next()).toString());
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : arrayListA0i) {
            if (!C7BY.A0j((String) obj)) {
                arrayListA0h.add(obj);
            }
        }
        return BV4.A1b(AbstractC0878AGe.A0T(AbstractC0878AGe.A0Q(AuraTigonConfigGatesImplKt.IDEMPOTENCY_KEY_HEADER, AbstractC0878AGe.A0Q(AuraTigonConfigGatesImplKt.STORAGE_RECOVERY_NOTARY_HEADER, arrayListA0h))));
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public boolean fizzEnabled() {
        return getFizzEnabled();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public boolean fizzPqcEnabled() {
        return getFizzPqcEnabled();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int gatewayHttp2EstablishTimeoutMs() {
        return getGatewayHttp2EstablishTimeoutMs();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int gatewayHttp2PingIntervalMs() {
        return getGatewayHttp2PingIntervalMs();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int gatewayHttp2PingTimeoutMs() {
        return getGatewayHttp2PingTimeoutMs();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public boolean gatewayHttp2StreamCloseRetiresQuietConnection() {
        return getGatewayHttp2StreamCloseRetiresQuietConnection();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int gatewayHttp2StreamsPerConnection() {
        return getGatewayHttp2StreamsPerConnection();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int gatewayHttp2TcpKeepAliveIdleSeconds() {
        return getGatewayHttp2TcpKeepAliveIdleSeconds();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int gatewayHttp2TcpKeepAliveIntervalSeconds() {
        return getGatewayHttp2TcpKeepAliveIntervalSeconds();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int gatewayHttp2TcpKeepAliveRetryCount() {
        return getGatewayHttp2TcpKeepAliveRetryCount();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int http2ConnectionFlowControlWindow() {
        return getHttp2ConnectionFlowControlWindow();
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonConfigGates
    public int http2StreamFlowControlWindow() {
        return getHttp2StreamFlowControlWindow();
    }
}

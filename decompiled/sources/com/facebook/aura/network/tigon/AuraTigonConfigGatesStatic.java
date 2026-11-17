package com.facebook.aura.network.tigon;

import com.facebook.aura.network.transport.tigon.AuraTigonConfigGatesImpl;

/* loaded from: classes5.dex */
public class AuraTigonConfigGatesStatic {
    public static String[] externalRequestInterceptorAdditionalPlaintextAllowlist() {
        return AuraTigonConfigGatesImpl.INSTANCE.externalRequestInterceptorAdditionalPlaintextAllowlist();
    }

    public static String[] externalRequestInterceptorAdditionalThirdPartyAllowlist() {
        return AuraTigonConfigGatesImpl.INSTANCE.externalRequestInterceptorAdditionalThirdPartyAllowlist();
    }

    public static String[] externalRequestInterceptorCredentialDomainAllowlist() {
        return AuraTigonConfigGatesImpl.INSTANCE.externalRequestInterceptorCredentialDomainAllowlist();
    }

    public static boolean fizzEnabled() {
        return AuraTigonConfigGatesImpl.INSTANCE.fizzEnabled();
    }

    public static boolean fizzPqcEnabled() {
        return AuraTigonConfigGatesImpl.INSTANCE.fizzPqcEnabled();
    }

    public static int gatewayHttp2EstablishTimeoutMs() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2EstablishTimeoutMs();
    }

    public static int gatewayHttp2PingIntervalMs() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2PingIntervalMs();
    }

    public static int gatewayHttp2PingTimeoutMs() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2PingTimeoutMs();
    }

    public static boolean gatewayHttp2StreamCloseRetiresQuietConnection() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2StreamCloseRetiresQuietConnection();
    }

    public static int gatewayHttp2StreamsPerConnection() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2StreamsPerConnection();
    }

    public static int gatewayHttp2TcpKeepAliveIdleSeconds() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2TcpKeepAliveIdleSeconds();
    }

    public static int gatewayHttp2TcpKeepAliveIntervalSeconds() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2TcpKeepAliveIntervalSeconds();
    }

    public static int gatewayHttp2TcpKeepAliveRetryCount() {
        return AuraTigonConfigGatesImpl.INSTANCE.gatewayHttp2TcpKeepAliveRetryCount();
    }

    public static int http2ConnectionFlowControlWindow() {
        return AuraTigonConfigGatesImpl.INSTANCE.http2ConnectionFlowControlWindow();
    }

    public static int http2StreamFlowControlWindow() {
        return AuraTigonConfigGatesImpl.INSTANCE.http2StreamFlowControlWindow();
    }
}

package com.facebook.aura.network.tigon;

/* loaded from: classes5.dex */
public interface AuraTigonConfigGates {
    String[] externalRequestInterceptorAdditionalPlaintextAllowlist();

    String[] externalRequestInterceptorAdditionalThirdPartyAllowlist();

    String[] externalRequestInterceptorCredentialDomainAllowlist();

    boolean fizzEnabled();

    boolean fizzPqcEnabled();

    int gatewayHttp2EstablishTimeoutMs();

    int gatewayHttp2PingIntervalMs();

    int gatewayHttp2PingTimeoutMs();

    boolean gatewayHttp2StreamCloseRetiresQuietConnection();

    int gatewayHttp2StreamsPerConnection();

    int gatewayHttp2TcpKeepAliveIdleSeconds();

    int gatewayHttp2TcpKeepAliveIntervalSeconds();

    int gatewayHttp2TcpKeepAliveRetryCount();

    int http2ConnectionFlowControlWindow();

    int http2StreamFlowControlWindow();
}

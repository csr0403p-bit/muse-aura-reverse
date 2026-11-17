package com.facebook.aura.network.transport;

/* loaded from: classes5.dex */
public interface HatchTransportFactory {
    HatchHttpClient httpClient(HatchAuthScheme hatchAuthScheme);

    HatchScopedVmChannel openScopedVmChannel(String str, String str2, String str3);

    HatchWebSocket webSocket(HatchAuthScheme hatchAuthScheme);

    boolean willUseTigon(HatchAuthScheme hatchAuthScheme);
}

package com.facebook.aura.gateway;

/* loaded from: classes5.dex */
public interface GatewayParkedTransportHook {
    void cancel();

    String hostForGateway(String str);

    boolean park(String str);
}

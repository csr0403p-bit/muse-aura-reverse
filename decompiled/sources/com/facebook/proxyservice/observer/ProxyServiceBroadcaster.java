package com.facebook.proxyservice.observer;

import X.C3cG;
import X.HG0;
import java.util.List;

/* loaded from: classes6.dex */
public class ProxyServiceBroadcaster {
    public static final HG0 Companion = new HG0();
    public static final ProxyServiceBroadcaster instance = new ProxyServiceBroadcaster();
    public String clientAddress = "";
    public String clientRegion = "";
    public String proxyAddress = "";
    public final List observers = C3cG.A0h();

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public final synchronized String getProxyAddress() {
        return "";
    }

    public final synchronized int getSocksProxyPort() {
        return 0;
    }

    public final synchronized boolean isLightProxy() {
        return false;
    }

    public final synchronized boolean isLightProxyAvailable() {
        return false;
    }

    public static final ProxyServiceBroadcaster getInstance() {
        return instance;
    }
}

package com.facebook.aura.gateway.noise.carrier;

import X.ETi;

/* loaded from: classes5.dex */
public final class NoiseGatewayCarrierSoLoader {
    public static final NoiseGatewayCarrierSoLoader INSTANCE = new NoiseGatewayCarrierSoLoader();
    public static volatile boolean loaded;

    public static final void ensureLoaded() {
        if (loaded) {
            return;
        }
        synchronized (INSTANCE) {
            if (!loaded) {
                ETi.loadLibrary("noise-gateway-carrier-jni");
                loaded = true;
            }
        }
    }
}

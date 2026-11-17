package com.facebook.aura.gateway.store;

/* loaded from: classes2.dex */
public abstract class HatchGatewayPrefsStoreKt {
    public static final HatchVmConfidentiality parseHatchVmConfidentiality(String str) {
        try {
            return str != null ? HatchVmConfidentiality.valueOf(str) : HatchVmConfidentiality.UNKNOWN;
        } catch (IllegalArgumentException unused) {
            return HatchVmConfidentiality.UNKNOWN;
        }
    }
}

package com.facebook.aura.bloks.fbpay.pttprovider;

import X.BV4;

/* loaded from: classes5.dex */
public final class AuraDeviceInfoProvider {
    public static final AuraDeviceInfoProvider INSTANCE = new AuraDeviceInfoProvider();

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.aura.bloks.fbpay.pttprovider.AuraDeviceInfoProvider$getDeviceInfo$1] */
    public AnonymousClass1 getDeviceInfo() {
        return new Object() { // from class: com.facebook.aura.bloks.fbpay.pttprovider.AuraDeviceInfoProvider.getDeviceInfo.1
            public String getDeviceId() {
                return BV4.A0f();
            }
        };
    }
}

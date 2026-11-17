package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.gateway.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes4.dex */
public final class HatchGatewayPreconnectFlags {
    public static final int $stable = 0;
    public static final String FLAG_NAME = "hatch_android_networking.enable_gateway_preconnect";
    public static volatile Boolean overrideForTest;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchGatewayPreconnectFlags.class, "mcEnabled", "getMcEnabled()Z");
    public static final HatchGatewayPreconnectFlags INSTANCE = new HatchGatewayPreconnectFlags();
    public static final C31u mcEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.enable_gateway_preconnect);

    private final boolean getMcEnabled() {
        return C31u.A01(this, mcEnabled$delegate, $$delegatedProperties, 0);
    }

    public final Boolean getOverrideForTest() {
        return overrideForTest;
    }

    public final boolean isEnabled() {
        Boolean bool = overrideForTest;
        return bool != null ? bool.booleanValue() : getMcEnabled();
    }

    public final void setOverrideForTest(Boolean bool) {
        overrideForTest = bool;
    }
}

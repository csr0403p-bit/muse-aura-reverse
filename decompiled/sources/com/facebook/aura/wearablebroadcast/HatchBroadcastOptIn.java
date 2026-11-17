package com.facebook.aura.wearablebroadcast;

import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.wearablebroadcast.MC;

/* loaded from: classes3.dex */
public final class HatchBroadcastOptIn {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchBroadcastOptIn.class, "forwardingEnabled", "getForwardingEnabled()Z");
    public static final HatchBroadcastOptIn INSTANCE = new HatchBroadcastOptIn();
    public static final C31u forwardingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.wearables_hatch.enable_wearable_tts_forwarding);

    private final boolean getForwardingEnabled() {
        return C31u.A01(this, forwardingEnabled$delegate, $$delegatedProperties, 0);
    }

    public final boolean isEnabled() {
        return getForwardingEnabled();
    }
}

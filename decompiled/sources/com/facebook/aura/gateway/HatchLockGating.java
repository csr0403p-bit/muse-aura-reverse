package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.gateway.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes.dex */
public final class HatchLockGating {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchLockGating.class, "isEnabled", "isEnabled()Z");
    public static final HatchLockGating INSTANCE = new HatchLockGating();
    public static final C31u isEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_hatch_lock);

    public final boolean isEnabled() {
        return C31u.A01(this, isEnabled$delegate, $$delegatedProperties, 0);
    }
}

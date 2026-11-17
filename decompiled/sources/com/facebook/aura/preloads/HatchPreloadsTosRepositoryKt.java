package com.facebook.aura.preloads;

import X.AnonymousClass001;
import X.C31u;
import X.C60O;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.preloads.MC;

/* loaded from: classes3.dex */
public abstract class HatchPreloadsTosRepositoryKt {
    public static final String TAG = "HatchPreloadsTos";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchPreloadsTosRepositoryKt.class, "isPreloadsTosEnabled", "isPreloadsTosEnabled()Z", 1);
    public static final C31u isPreloadsTosEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_app_preloads_sessionless_mcs.enable_preloads_tos);

    public static final boolean isPreloadsTosEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isPreloadsTosEnabled$delegate, $$delegatedProperties));
    }
}

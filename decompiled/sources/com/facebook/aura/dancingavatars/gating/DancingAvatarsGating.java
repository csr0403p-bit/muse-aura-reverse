package com.facebook.aura.dancingavatars.gating;

import X.C31u;
import X.C7354EnR;
import X.InterfaceC7359EnW;
import com.facebook.aura.dancingavatars.gating.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes.dex */
public final class DancingAvatarsGating {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(DancingAvatarsGating.class, "isEnabled", "isEnabled()Z", 0), new C7354EnR(DancingAvatarsGating.class, "canShareToNonMetaApps", "getCanShareToNonMetaApps()Z", 0)};
    public static final DancingAvatarsGating INSTANCE = new DancingAvatarsGating();
    public static final C31u isEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_dancing_avatars.enabled);
    public static final C31u canShareToNonMetaApps$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_dancing_avatars.share_to_non_meta_apps);

    public final boolean getCanShareToNonMetaApps() {
        return C31u.A01(this, canShareToNonMetaApps$delegate, $$delegatedProperties, 1);
    }

    public final boolean isEnabled() {
        return C31u.A01(this, isEnabled$delegate, $$delegatedProperties, 0);
    }
}

package com.facebook.aura.status.view;

import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.status.view.MC;

/* loaded from: classes.dex */
public final class HatchStatusMC {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchStatusMC.class, "isShareAvatarEnabled", "isShareAvatarEnabled()Z");
    public static final HatchStatusMC INSTANCE = new HatchStatusMC();
    public static final C31u isShareAvatarEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.share_avatar_enabled);

    public final boolean isShareAvatarEnabled() {
        return C31u.A01(this, isShareAvatarEnabled$delegate, $$delegatedProperties, 0);
    }
}

package com.facebook.aura.spaces.view;

import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.main.api.TimeSpentModuleProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;

/* loaded from: classes.dex */
public final class PeerSpaceTimeSpentModule implements TimeSpentModuleProvider {
    public static final int $stable = 0;
    public static final PeerSpaceTimeSpentModule INSTANCE = new PeerSpaceTimeSpentModule();

    @Override // com.facebook.aura.main.api.TimeSpentModuleProvider
    public HatchModule moduleFor(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        if (auraNavKey instanceof PeerSpaceScreenKey) {
            return HatchModule.HATCH_PEER_SPACE;
        }
        return null;
    }
}

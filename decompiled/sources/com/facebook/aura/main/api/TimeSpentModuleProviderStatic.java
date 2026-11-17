package com.facebook.aura.main.api;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.pairs.PairsTimeSpentModules;
import com.facebook.aura.spaces.view.PeerSpaceTimeSpentModule;

/* loaded from: classes.dex */
public class TimeSpentModuleProviderStatic {
    public static HatchModule moduleFor(int i, AuraNavKey auraNavKey) {
        if (i == 0) {
            return PairsTimeSpentModules.INSTANCE.moduleFor(auraNavKey);
        }
        if (i == 1) {
            return PeerSpaceTimeSpentModule.INSTANCE.moduleFor(auraNavKey);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}

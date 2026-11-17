package com.facebook.aura.main.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C7384Etj;
import X.DFI;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.pairs.PairsTimeSpentModules;
import com.facebook.aura.spaces.view.PeerSpaceTimeSpentModule;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class TimeSpentModules {
    public static final int $stable = 0;
    public static final TimeSpentModules INSTANCE = new TimeSpentModules();

    public final HatchModule moduleFor(AuraNavKey auraNavKey) {
        HatchModule hatchModuleModuleFor;
        C7384Etj.A0Y(auraNavKey, 0);
        Iterator<E> it = new DFI(new int[]{0, 1}, 1).iterator();
        while (it.hasNext()) {
            int iA0F = AnonymousClass001.A0F(it.next());
            if (iA0F == 0) {
                hatchModuleModuleFor = PairsTimeSpentModules.INSTANCE.moduleFor(auraNavKey);
            } else {
                if (iA0F != 1) {
                    throw AnonymousClass005.A0c(iA0F);
                }
                hatchModuleModuleFor = PeerSpaceTimeSpentModule.INSTANCE.moduleFor(auraNavKey);
            }
            if (hatchModuleModuleFor != null) {
                return hatchModuleModuleFor;
            }
        }
        return null;
    }
}

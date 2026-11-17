package com.facebook.aura.partners.wearables.intf;

import X.AnonymousClass005;
import com.facebook.aura.partners.wearables.impl.HatchWearablesIntegrationProvider;

/* loaded from: classes2.dex */
public class WearablesIntegrationProviderStatic {
    public static WearablesIntegration integration(int i) {
        if (i == 0) {
            return HatchWearablesIntegrationProvider.INSTANCE.integration();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}

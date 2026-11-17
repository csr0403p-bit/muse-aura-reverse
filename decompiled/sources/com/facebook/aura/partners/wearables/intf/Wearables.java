package com.facebook.aura.partners.wearables.intf;

import com.facebook.aura.partners.wearables.impl.HatchWearablesIntegrationProvider;

/* loaded from: classes2.dex */
public final class Wearables {
    public static final int $stable = 0;
    public static final Wearables INSTANCE = new Wearables();

    public final WearablesIntegration getIntegration() {
        int i = new int[]{0}[0];
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            return HatchWearablesIntegrationProvider.INSTANCE.integration();
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", numValueOf));
    }
}

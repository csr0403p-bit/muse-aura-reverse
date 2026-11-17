package com.facebook.aura.partners.wearables.impl;

import com.facebook.aura.partners.wearables.intf.WearablesIntegration;
import com.facebook.aura.partners.wearables.intf.WearablesIntegrationProvider;

/* loaded from: classes2.dex */
public final class HatchWearablesIntegrationProvider implements WearablesIntegrationProvider {
    public static final int $stable = 0;
    public static final HatchWearablesIntegrationProvider INSTANCE = new HatchWearablesIntegrationProvider();

    @Override // com.facebook.aura.partners.wearables.intf.WearablesIntegrationProvider
    public WearablesIntegration integration() {
        return HatchWearablesIntegration.INSTANCE;
    }
}

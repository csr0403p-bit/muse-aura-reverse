package com.facebook.aura.devices.link.ordering.impl;

import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegrationProvider;

/* loaded from: classes.dex */
public final class HatchLinkSubscriptionAddOnIntegrationProvider implements SubscriptionAddOnIntegrationProvider {
    public static final HatchLinkSubscriptionAddOnIntegrationProvider INSTANCE = new HatchLinkSubscriptionAddOnIntegrationProvider();

    @Override // com.facebook.aura.devices.intf.SubscriptionAddOnIntegrationProvider
    public SubscriptionAddOnIntegration integration() {
        return HatchLinkSubscriptionAddOnIntegration.INSTANCE;
    }
}

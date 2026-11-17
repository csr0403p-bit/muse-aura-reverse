package com.facebook.aura.devices.intf;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.devices.link.ordering.impl.HatchLinkSubscriptionAddOnIntegrationProvider;
import java.util.Collection;

/* loaded from: classes.dex */
public final class SubscriptionAddOn {
    public static final int $stable = 0;
    public static final SubscriptionAddOn INSTANCE = new SubscriptionAddOn();

    private final SubscriptionAddOnIntegration findIntegration() {
        int i = new int[]{0}[0];
        if (i == 0) {
            return HatchLinkSubscriptionAddOnIntegrationProvider.INSTANCE.integration();
        }
        throw AnonymousClass005.A0c(i);
    }

    public final SubscriptionAddOnIntegration resolveCheckoutIntegration(Collection<String> collection, boolean z) {
        SubscriptionAddOnIntegration subscriptionAddOnIntegrationFindIntegration;
        C7384Etj.A0Y(collection, 0);
        if (z || collection.isEmpty() || (subscriptionAddOnIntegrationFindIntegration = findIntegration()) == null || !collection.contains(subscriptionAddOnIntegrationFindIntegration.getCatalogType()) || !subscriptionAddOnIntegrationFindIntegration.isCheckoutEnabled()) {
            return null;
        }
        return subscriptionAddOnIntegrationFindIntegration;
    }

    public final SubscriptionAddOnIntegration resolveIntegration() {
        SubscriptionAddOnIntegration subscriptionAddOnIntegrationFindIntegration = findIntegration();
        if (subscriptionAddOnIntegrationFindIntegration == null || !subscriptionAddOnIntegrationFindIntegration.isEnabled()) {
            return null;
        }
        return subscriptionAddOnIntegrationFindIntegration;
    }
}

package com.facebook.aura.devices.intf;

import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public interface SubscriptionAddOnIntegration {
    String getCatalogType();

    boolean isCheckoutEnabled();

    boolean isEnabled();

    boolean isPrePurchaseClaim(AuraNavKey auraNavKey);

    SubscriptionAddOnManagementAction managementAction(SubscriptionAddOnEntry subscriptionAddOnEntry);

    SubscriptionCheckoutAddOnUi ui();
}

package com.facebook.aura.devices.intf;

import X.AnonymousClass005;
import com.facebook.aura.devices.link.ordering.impl.HatchLinkSubscriptionAddOnIntegrationProvider;

/* loaded from: classes.dex */
public class SubscriptionAddOnIntegrationProviderStatic {
    public static SubscriptionAddOnIntegration integration(int i) {
        if (i == 0) {
            return HatchLinkSubscriptionAddOnIntegrationProvider.INSTANCE.integration();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}

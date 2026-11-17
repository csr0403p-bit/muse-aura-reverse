package com.facebook.aura.devices.intf;

import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class SubscriptionAddOnManagementAction {
    public static final int $stable = 8;
    public final AuraNavKey destination;
    public final int iconRes;

    public SubscriptionAddOnManagementAction(int i, AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 1);
        this.iconRes = i;
        this.destination = auraNavKey;
    }

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final int getIconRes() {
        return this.iconRes;
    }
}

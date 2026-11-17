package com.facebook.aura.share.api;

import X.AnonymousClass002;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class ItemShareAction {
    public final AuraNavKey destination;
    public final int iconRes;
    public final int labelRes;
    public final HatchComponent logComponent;

    public ItemShareAction(int i, int i2, AuraNavKey auraNavKey, HatchComponent hatchComponent) {
        AnonymousClass002.A1B(auraNavKey, 2, hatchComponent);
        this.labelRes = i;
        this.iconRes = i2;
        this.destination = auraNavKey;
        this.logComponent = hatchComponent;
    }

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final HatchComponent getLogComponent() {
        return this.logComponent;
    }
}

package com.facebook.aura.partners.wearables.impl;

import com.facebook.aura.partners.wearables.intf.WearablesIntegration;
import com.facebook.aura.partners.wearables.intf.WearablesUi;

/* loaded from: classes2.dex */
public final class HatchWearablesIntegration implements WearablesIntegration {
    public static final HatchWearablesIntegration INSTANCE = new HatchWearablesIntegration();
    public static final WearablesUi ui = HatchWearablesUi.INSTANCE;

    @Override // com.facebook.aura.partners.wearables.intf.WearablesIntegration
    public WearablesUi getUi() {
        return ui;
    }
}

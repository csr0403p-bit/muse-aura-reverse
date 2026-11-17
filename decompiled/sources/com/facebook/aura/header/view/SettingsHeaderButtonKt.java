package com.facebook.aura.header.view;

import X.AGI;
import X.AHD;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public abstract class SettingsHeaderButtonKt {
    public static final AHD<HeaderButton> SettingsHeaderButtons = AGI.A0E(HeaderButton.Settings);

    public static final void logSettingsHeaderClick(HatchScreen hatchScreen) {
        AnonymousClass006.A0b(hatchScreen).logClick(HatchSurface.ONBOARDING, null, hatchScreen, HatchComponent.TAB_SETTINGS, null, null, null);
    }

    public static final AHD<HeaderButton> getSettingsHeaderButtons() {
        return SettingsHeaderButtons;
    }
}

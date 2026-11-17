package com.facebook.aura.appappearance;

import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandProvider;

/* loaded from: classes3.dex */
public final class AppAppearanceUiCommandProvider implements UiCommandProvider {
    public static final int $stable = 0;
    public static final AppAppearanceUiCommandProvider INSTANCE = new AppAppearanceUiCommandProvider();

    @Override // com.facebook.aura.uicontrol.UiCommandProvider
    public UiCommandContributor contributor() {
        return AppAppearanceUiCommands.INSTANCE;
    }
}

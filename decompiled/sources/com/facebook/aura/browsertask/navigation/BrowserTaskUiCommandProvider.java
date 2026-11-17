package com.facebook.aura.browsertask.navigation;

import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandProvider;

/* loaded from: classes3.dex */
public final class BrowserTaskUiCommandProvider implements UiCommandProvider {
    public static final int $stable = 0;
    public static final BrowserTaskUiCommandProvider INSTANCE = new BrowserTaskUiCommandProvider();

    @Override // com.facebook.aura.uicontrol.UiCommandProvider
    public UiCommandContributor contributor() {
        return BrowserTaskUiCommands.INSTANCE;
    }
}

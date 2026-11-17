package com.facebook.aura.explore.uicontrol;

import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandProvider;

/* loaded from: classes3.dex */
public final class IdeaUiCommandProvider implements UiCommandProvider {
    public static final IdeaUiCommandProvider INSTANCE = new IdeaUiCommandProvider();

    @Override // com.facebook.aura.uicontrol.UiCommandProvider
    public UiCommandContributor contributor() {
        return IdeaUiCommands.INSTANCE;
    }
}

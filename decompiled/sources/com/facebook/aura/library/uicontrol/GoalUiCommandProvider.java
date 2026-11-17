package com.facebook.aura.library.uicontrol;

import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandProvider;

/* loaded from: classes3.dex */
public final class GoalUiCommandProvider implements UiCommandProvider {
    public static final GoalUiCommandProvider INSTANCE = new GoalUiCommandProvider();

    @Override // com.facebook.aura.uicontrol.UiCommandProvider
    public UiCommandContributor contributor() {
        return GoalUiCommands.INSTANCE;
    }
}

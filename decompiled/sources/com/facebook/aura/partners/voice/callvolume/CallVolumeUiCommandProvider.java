package com.facebook.aura.partners.voice.callvolume;

import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandProvider;

/* loaded from: classes3.dex */
public final class CallVolumeUiCommandProvider implements UiCommandProvider {
    public static final CallVolumeUiCommandProvider INSTANCE = new CallVolumeUiCommandProvider();

    @Override // com.facebook.aura.uicontrol.UiCommandProvider
    public UiCommandContributor contributor() {
        return CallVolumeUiCommands.INSTANCE;
    }
}

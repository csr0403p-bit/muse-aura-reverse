package com.facebook.aura.partners.voice.uicontrol;

import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandProvider;

/* loaded from: classes3.dex */
public final class VoiceUiCommandProvider implements UiCommandProvider {
    public static final VoiceUiCommandProvider INSTANCE = new VoiceUiCommandProvider();

    @Override // com.facebook.aura.uicontrol.UiCommandProvider
    public UiCommandContributor contributor() {
        return VoiceUiCommands.INSTANCE;
    }
}

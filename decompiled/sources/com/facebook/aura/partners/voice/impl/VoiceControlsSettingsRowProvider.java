package com.facebook.aura.partners.voice.impl;

import com.facebook.aura.settings.api.SettingsGeneralRowContributor;
import com.facebook.aura.settings.api.SettingsGeneralRowProvider;

/* loaded from: classes.dex */
public final class VoiceControlsSettingsRowProvider implements SettingsGeneralRowProvider {
    public static final int $stable = 0;
    public static final VoiceControlsSettingsRowProvider INSTANCE = new VoiceControlsSettingsRowProvider();

    @Override // com.facebook.aura.settings.api.SettingsGeneralRowProvider
    public SettingsGeneralRowContributor contributor() {
        return VoiceControlsSettingsRow.INSTANCE;
    }
}

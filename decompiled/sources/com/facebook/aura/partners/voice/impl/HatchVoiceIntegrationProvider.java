package com.facebook.aura.partners.voice.impl;

import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import com.facebook.aura.partners.voice.intf.VoiceIntegrationProvider;

/* loaded from: classes2.dex */
public final class HatchVoiceIntegrationProvider implements VoiceIntegrationProvider {
    public static final int $stable = 0;
    public static final HatchVoiceIntegrationProvider INSTANCE = new HatchVoiceIntegrationProvider();

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegrationProvider
    public VoiceIntegration integration() {
        return HatchVoiceIntegration.INSTANCE;
    }
}

package com.facebook.aura.assist;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;

/* loaded from: classes2.dex */
public final class HatchVoiceInteractionSessionService extends VoiceInteractionSessionService {
    public static final int $stable = 8;

    @Override // android.service.voice.VoiceInteractionSessionService
    public VoiceInteractionSession onNewSession(Bundle bundle) {
        return new HatchVoiceInteractionSession(this);
    }
}

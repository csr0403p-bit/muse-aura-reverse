package com.facebook.aura.partners.voice.viewmodel;

import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.partners.voice.api.VoiceOption;

/* loaded from: classes4.dex */
public abstract class VoiceControlsViewModelKt {
    public static final VoiceOption toVoiceOption(VoiceOptionData voiceOptionData) {
        return new VoiceOption(voiceOptionData.voiceId, voiceOptionData.name, "", "", "", "");
    }
}

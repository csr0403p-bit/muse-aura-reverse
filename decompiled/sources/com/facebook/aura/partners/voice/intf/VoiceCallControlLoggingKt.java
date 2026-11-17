package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass003;
import X.AnonymousClass007;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class VoiceCallControlLoggingKt {
    public static final void logCallControlClick(VoiceCallStateHolder voiceCallStateHolder, HatchComponent hatchComponent) {
        AnonymousClass003.A0u(voiceCallStateHolder, hatchComponent);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.VOICE_MODE, HatchSubsurface.COMPOSER, HatchScreen.VOICE_OVERLAY, hatchComponent, null, callAttemptMetadata(voiceCallStateHolder), null);
    }

    public static final void logCallControlToggle(VoiceCallStateHolder voiceCallStateHolder, boolean z, HatchComponent hatchComponent) {
        AnonymousClass003.A0v(voiceCallStateHolder, hatchComponent);
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.VOICE_MODE, HatchSubsurface.COMPOSER, HatchScreen.VOICE_OVERLAY, hatchComponent, null, callAttemptMetadata(voiceCallStateHolder));
    }

    public static final Map<String, String> callAttemptMetadata(VoiceCallStateHolder voiceCallStateHolder) {
        String str;
        ActiveAppAudioCall value = voiceCallStateHolder.activeAppAudioCall.getValue();
        if (value == null || (str = value.callId) == null) {
            return null;
        }
        return AnonymousClass007.A0c(HatchMetadataKey.CALL_ATTEMPT_ID, str);
    }
}

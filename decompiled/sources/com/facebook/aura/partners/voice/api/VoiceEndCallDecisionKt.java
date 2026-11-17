package com.facebook.aura.partners.voice.api;

/* loaded from: classes2.dex */
public abstract class VoiceEndCallDecisionKt {
    public static final VoiceEndCallDecision voiceEndCallDecision(String str, String str2, String str3) {
        if (str3 == null || str3.equalsIgnoreCase(str2)) {
            if (str == null || str.length() == 0) {
                return VoiceEndCallDecision.END;
            }
            if (!str.equalsIgnoreCase(str2)) {
                return VoiceEndCallDecision.END_SUPPRESS_EARCON;
            }
        }
        return VoiceEndCallDecision.IGNORE;
    }
}

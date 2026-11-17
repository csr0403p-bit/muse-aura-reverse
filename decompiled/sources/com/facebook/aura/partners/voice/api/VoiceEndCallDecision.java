package com.facebook.aura.partners.voice.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceEndCallDecision {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEndCallDecision[] $VALUES;
    public static final VoiceEndCallDecision END;
    public static final VoiceEndCallDecision END_SUPPRESS_EARCON;
    public static final VoiceEndCallDecision IGNORE;

    static {
        VoiceEndCallDecision voiceEndCallDecision = new VoiceEndCallDecision("IGNORE", 0);
        IGNORE = voiceEndCallDecision;
        VoiceEndCallDecision voiceEndCallDecision2 = new VoiceEndCallDecision("END_SUPPRESS_EARCON", 1);
        END_SUPPRESS_EARCON = voiceEndCallDecision2;
        VoiceEndCallDecision voiceEndCallDecision3 = new VoiceEndCallDecision("END", 2);
        END = voiceEndCallDecision3;
        VoiceEndCallDecision[] voiceEndCallDecisionArr = {voiceEndCallDecision, voiceEndCallDecision2, voiceEndCallDecision3};
        $VALUES = voiceEndCallDecisionArr;
        $ENTRIES = C3cG.A0w(voiceEndCallDecisionArr);
    }

    public static Ey9<VoiceEndCallDecision> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEndCallDecision valueOf(String str) {
        return (VoiceEndCallDecision) Enum.valueOf(VoiceEndCallDecision.class, str);
    }

    public static VoiceEndCallDecision[] values() {
        return (VoiceEndCallDecision[]) $VALUES.clone();
    }

    public VoiceEndCallDecision(String str, int i) {
    }
}

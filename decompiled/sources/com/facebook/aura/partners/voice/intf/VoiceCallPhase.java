package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallPhase[] $VALUES;
    public static final VoiceCallPhase ACTIVE;
    public static final VoiceCallPhase CONNECTED;
    public static final VoiceCallPhase CONNECTING;
    public static final VoiceCallPhase ENDED;

    static {
        VoiceCallPhase voiceCallPhase = new VoiceCallPhase("CONNECTING", 0);
        CONNECTING = voiceCallPhase;
        VoiceCallPhase voiceCallPhase2 = new VoiceCallPhase("CONNECTED", 1);
        CONNECTED = voiceCallPhase2;
        VoiceCallPhase voiceCallPhase3 = new VoiceCallPhase("ACTIVE", 2);
        ACTIVE = voiceCallPhase3;
        VoiceCallPhase voiceCallPhase4 = new VoiceCallPhase("ENDED", 3);
        ENDED = voiceCallPhase4;
        VoiceCallPhase[] voiceCallPhaseArr = {voiceCallPhase, voiceCallPhase2, voiceCallPhase3, voiceCallPhase4};
        $VALUES = voiceCallPhaseArr;
        $ENTRIES = C3cG.A0w(voiceCallPhaseArr);
    }

    public static Ey9<VoiceCallPhase> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallPhase valueOf(String str) {
        return (VoiceCallPhase) Enum.valueOf(VoiceCallPhase.class, str);
    }

    public static VoiceCallPhase[] values() {
        return (VoiceCallPhase[]) $VALUES.clone();
    }

    public VoiceCallPhase(String str, int i) {
    }
}

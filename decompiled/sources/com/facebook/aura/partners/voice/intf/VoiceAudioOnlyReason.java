package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceAudioOnlyReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceAudioOnlyReason[] $VALUES;
    public static final VoiceAudioOnlyReason ANSWERED_AWAY;
    public static final VoiceAudioOnlyReason AVATAR_INCOMPATIBLE;
    public static final VoiceAudioOnlyReason CAR;
    public static final VoiceAudioOnlyReason EMBODIMENT_DISABLED;
    public static final VoiceAudioOnlyReason LIVE_AVATAR_OFF;
    public static final VoiceAudioOnlyReason LOW_RAM_DEVICE;
    public static final VoiceAudioOnlyReason WATCH_VOICE_CALL;
    public final String wireValue;

    static {
        VoiceAudioOnlyReason voiceAudioOnlyReason = new VoiceAudioOnlyReason("CAR", 0, "car");
        CAR = voiceAudioOnlyReason;
        VoiceAudioOnlyReason voiceAudioOnlyReason2 = new VoiceAudioOnlyReason("WATCH_VOICE_CALL", 1, "watch_voice_call");
        WATCH_VOICE_CALL = voiceAudioOnlyReason2;
        VoiceAudioOnlyReason voiceAudioOnlyReason3 = new VoiceAudioOnlyReason("LIVE_AVATAR_OFF", 2, "live_avatar_off");
        LIVE_AVATAR_OFF = voiceAudioOnlyReason3;
        VoiceAudioOnlyReason voiceAudioOnlyReason4 = new VoiceAudioOnlyReason("LOW_RAM_DEVICE", 3, "low_ram_device");
        LOW_RAM_DEVICE = voiceAudioOnlyReason4;
        VoiceAudioOnlyReason voiceAudioOnlyReason5 = new VoiceAudioOnlyReason("EMBODIMENT_DISABLED", 4, "embodiment_disabled");
        EMBODIMENT_DISABLED = voiceAudioOnlyReason5;
        VoiceAudioOnlyReason voiceAudioOnlyReason6 = new VoiceAudioOnlyReason("AVATAR_INCOMPATIBLE", 5, "avatar_incompatible");
        AVATAR_INCOMPATIBLE = voiceAudioOnlyReason6;
        VoiceAudioOnlyReason voiceAudioOnlyReason7 = new VoiceAudioOnlyReason("ANSWERED_AWAY", 6, "answered_away");
        ANSWERED_AWAY = voiceAudioOnlyReason7;
        VoiceAudioOnlyReason[] voiceAudioOnlyReasonArr = {voiceAudioOnlyReason, voiceAudioOnlyReason2, voiceAudioOnlyReason3, voiceAudioOnlyReason4, voiceAudioOnlyReason5, voiceAudioOnlyReason6, voiceAudioOnlyReason7};
        $VALUES = voiceAudioOnlyReasonArr;
        $ENTRIES = C3cG.A0w(voiceAudioOnlyReasonArr);
    }

    public static Ey9<VoiceAudioOnlyReason> getEntries() {
        return $ENTRIES;
    }

    public static VoiceAudioOnlyReason valueOf(String str) {
        return (VoiceAudioOnlyReason) Enum.valueOf(VoiceAudioOnlyReason.class, str);
    }

    public static VoiceAudioOnlyReason[] values() {
        return (VoiceAudioOnlyReason[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public VoiceAudioOnlyReason(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

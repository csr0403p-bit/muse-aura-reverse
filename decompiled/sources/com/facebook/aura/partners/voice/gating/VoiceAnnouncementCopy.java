package com.facebook.aura.partners.voice.gating;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceAnnouncementCopy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceAnnouncementCopy[] $VALUES;
    public static final VoiceAnnouncementCopy HEAR_THAT;
    public static final VoiceAnnouncementCopy NOW_HAS_A_VOICE;
    public static final VoiceAnnouncementCopy TURN_IT_UP;

    static {
        VoiceAnnouncementCopy voiceAnnouncementCopy = new VoiceAnnouncementCopy("HEAR_THAT", 0);
        HEAR_THAT = voiceAnnouncementCopy;
        VoiceAnnouncementCopy voiceAnnouncementCopy2 = new VoiceAnnouncementCopy("TURN_IT_UP", 1);
        TURN_IT_UP = voiceAnnouncementCopy2;
        VoiceAnnouncementCopy voiceAnnouncementCopy3 = new VoiceAnnouncementCopy("NOW_HAS_A_VOICE", 2);
        NOW_HAS_A_VOICE = voiceAnnouncementCopy3;
        VoiceAnnouncementCopy[] voiceAnnouncementCopyArr = {voiceAnnouncementCopy, voiceAnnouncementCopy2, voiceAnnouncementCopy3};
        $VALUES = voiceAnnouncementCopyArr;
        $ENTRIES = C3cG.A0w(voiceAnnouncementCopyArr);
    }

    public static Ey9<VoiceAnnouncementCopy> getEntries() {
        return $ENTRIES;
    }

    public static VoiceAnnouncementCopy valueOf(String str) {
        return (VoiceAnnouncementCopy) Enum.valueOf(VoiceAnnouncementCopy.class, str);
    }

    public static VoiceAnnouncementCopy[] values() {
        return (VoiceAnnouncementCopy[]) $VALUES.clone();
    }

    public VoiceAnnouncementCopy(String str, int i) {
    }
}

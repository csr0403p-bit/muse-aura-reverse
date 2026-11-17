package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallActivity {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallActivity[] $VALUES;
    public static final VoiceCallActivity IDLE;
    public static final VoiceCallActivity SPEAKING;
    public static final VoiceCallActivity THINKING;

    static {
        VoiceCallActivity voiceCallActivity = new VoiceCallActivity("IDLE", 0);
        IDLE = voiceCallActivity;
        VoiceCallActivity voiceCallActivity2 = new VoiceCallActivity("THINKING", 1);
        THINKING = voiceCallActivity2;
        VoiceCallActivity voiceCallActivity3 = new VoiceCallActivity("SPEAKING", 2);
        SPEAKING = voiceCallActivity3;
        VoiceCallActivity[] voiceCallActivityArr = {voiceCallActivity, voiceCallActivity2, voiceCallActivity3};
        $VALUES = voiceCallActivityArr;
        $ENTRIES = C3cG.A0w(voiceCallActivityArr);
    }

    public static Ey9<VoiceCallActivity> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallActivity valueOf(String str) {
        return (VoiceCallActivity) Enum.valueOf(VoiceCallActivity.class, str);
    }

    public static VoiceCallActivity[] values() {
        return (VoiceCallActivity[]) $VALUES.clone();
    }

    public VoiceCallActivity(String str, int i) {
    }
}

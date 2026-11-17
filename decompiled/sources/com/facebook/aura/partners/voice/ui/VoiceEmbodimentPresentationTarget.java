package com.facebook.aura.partners.voice.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoiceEmbodimentPresentationTarget {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEmbodimentPresentationTarget[] $VALUES;
    public static final VoiceEmbodimentPresentationTarget ACTIVITY_CLIP;
    public static final VoiceEmbodimentPresentationTarget FALLBACK;
    public static final VoiceEmbodimentPresentationTarget LIVE_RTC;

    static {
        VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget = new VoiceEmbodimentPresentationTarget("FALLBACK", 0);
        FALLBACK = voiceEmbodimentPresentationTarget;
        VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget2 = new VoiceEmbodimentPresentationTarget("ACTIVITY_CLIP", 1);
        ACTIVITY_CLIP = voiceEmbodimentPresentationTarget2;
        VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget3 = new VoiceEmbodimentPresentationTarget("LIVE_RTC", 2);
        LIVE_RTC = voiceEmbodimentPresentationTarget3;
        VoiceEmbodimentPresentationTarget[] voiceEmbodimentPresentationTargetArr = {voiceEmbodimentPresentationTarget, voiceEmbodimentPresentationTarget2, voiceEmbodimentPresentationTarget3};
        $VALUES = voiceEmbodimentPresentationTargetArr;
        $ENTRIES = C3cG.A0w(voiceEmbodimentPresentationTargetArr);
    }

    public static Ey9<VoiceEmbodimentPresentationTarget> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEmbodimentPresentationTarget valueOf(String str) {
        return (VoiceEmbodimentPresentationTarget) Enum.valueOf(VoiceEmbodimentPresentationTarget.class, str);
    }

    public static VoiceEmbodimentPresentationTarget[] values() {
        return (VoiceEmbodimentPresentationTarget[]) $VALUES.clone();
    }

    public VoiceEmbodimentPresentationTarget(String str, int i) {
    }
}

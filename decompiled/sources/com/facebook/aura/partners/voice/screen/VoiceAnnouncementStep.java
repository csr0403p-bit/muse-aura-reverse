package com.facebook.aura.partners.voice.screen;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceAnnouncementStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceAnnouncementStep[] $VALUES;
    public static final VoiceAnnouncementStep CLOSED;
    public static final VoiceAnnouncementStep PROMO;
    public static final VoiceAnnouncementStep VOICE_NUX;
    public static final VoiceAnnouncementStep VOICE_NUX_SHOWN;
    public final boolean showsVoiceNux;

    static {
        VoiceAnnouncementStep voiceAnnouncementStep = new VoiceAnnouncementStep("CLOSED", 0, false);
        CLOSED = voiceAnnouncementStep;
        VoiceAnnouncementStep voiceAnnouncementStep2 = new VoiceAnnouncementStep("PROMO", 1, false);
        PROMO = voiceAnnouncementStep2;
        VoiceAnnouncementStep voiceAnnouncementStep3 = new VoiceAnnouncementStep("VOICE_NUX", 2, true);
        VOICE_NUX = voiceAnnouncementStep3;
        VoiceAnnouncementStep voiceAnnouncementStep4 = new VoiceAnnouncementStep("VOICE_NUX_SHOWN", 3, true);
        VOICE_NUX_SHOWN = voiceAnnouncementStep4;
        VoiceAnnouncementStep[] voiceAnnouncementStepArr = {voiceAnnouncementStep, voiceAnnouncementStep2, voiceAnnouncementStep3, voiceAnnouncementStep4};
        $VALUES = voiceAnnouncementStepArr;
        $ENTRIES = C3cG.A0w(voiceAnnouncementStepArr);
    }

    public static Ey9<VoiceAnnouncementStep> getEntries() {
        return $ENTRIES;
    }

    public static VoiceAnnouncementStep valueOf(String str) {
        return (VoiceAnnouncementStep) Enum.valueOf(VoiceAnnouncementStep.class, str);
    }

    public static VoiceAnnouncementStep[] values() {
        return (VoiceAnnouncementStep[]) $VALUES.clone();
    }

    public final boolean getShowsVoiceNux() {
        return this.showsVoiceNux;
    }

    public VoiceAnnouncementStep(String str, int i, boolean z) {
        this.showsVoiceNux = z;
    }
}

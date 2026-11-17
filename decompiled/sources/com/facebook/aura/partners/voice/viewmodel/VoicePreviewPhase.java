package com.facebook.aura.partners.voice.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoicePreviewPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoicePreviewPhase[] $VALUES;
    public static final VoicePreviewPhase LOADING;
    public static final VoicePreviewPhase PLAYING;

    static {
        VoicePreviewPhase voicePreviewPhase = new VoicePreviewPhase("LOADING", 0);
        LOADING = voicePreviewPhase;
        VoicePreviewPhase voicePreviewPhase2 = new VoicePreviewPhase("PLAYING", 1);
        PLAYING = voicePreviewPhase2;
        VoicePreviewPhase[] voicePreviewPhaseArr = {voicePreviewPhase, voicePreviewPhase2};
        $VALUES = voicePreviewPhaseArr;
        $ENTRIES = C3cG.A0w(voicePreviewPhaseArr);
    }

    public static Ey9<VoicePreviewPhase> getEntries() {
        return $ENTRIES;
    }

    public static VoicePreviewPhase valueOf(String str) {
        return (VoicePreviewPhase) Enum.valueOf(VoicePreviewPhase.class, str);
    }

    public static VoicePreviewPhase[] values() {
        return (VoicePreviewPhase[]) $VALUES.clone();
    }

    public VoicePreviewPhase(String str, int i) {
    }
}

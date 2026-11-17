package com.facebook.aura.partners.voice.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoicePreviewPlaybackPath {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoicePreviewPlaybackPath[] $VALUES;
    public static final VoicePreviewPlaybackPath CALL_AUDIO;
    public static final VoicePreviewPlaybackPath MEDIA_PLAYER;
    public static final VoicePreviewPlaybackPath PCM_STREAM;
    public static final VoicePreviewPlaybackPath RTC_PLAYOUT;
    public final String value;

    static {
        VoicePreviewPlaybackPath voicePreviewPlaybackPath = new VoicePreviewPlaybackPath("MEDIA_PLAYER", 0, "media_player");
        MEDIA_PLAYER = voicePreviewPlaybackPath;
        VoicePreviewPlaybackPath voicePreviewPlaybackPath2 = new VoicePreviewPlaybackPath("PCM_STREAM", 1, "pcm_stream");
        PCM_STREAM = voicePreviewPlaybackPath2;
        VoicePreviewPlaybackPath voicePreviewPlaybackPath3 = new VoicePreviewPlaybackPath("CALL_AUDIO", 2, "call_audio");
        CALL_AUDIO = voicePreviewPlaybackPath3;
        VoicePreviewPlaybackPath voicePreviewPlaybackPath4 = new VoicePreviewPlaybackPath("RTC_PLAYOUT", 3, "rtc_playout");
        RTC_PLAYOUT = voicePreviewPlaybackPath4;
        VoicePreviewPlaybackPath[] voicePreviewPlaybackPathArr = {voicePreviewPlaybackPath, voicePreviewPlaybackPath2, voicePreviewPlaybackPath3, voicePreviewPlaybackPath4};
        $VALUES = voicePreviewPlaybackPathArr;
        $ENTRIES = C3cG.A0w(voicePreviewPlaybackPathArr);
    }

    public static Ey9<VoicePreviewPlaybackPath> getEntries() {
        return $ENTRIES;
    }

    public static VoicePreviewPlaybackPath valueOf(String str) {
        return (VoicePreviewPlaybackPath) Enum.valueOf(VoicePreviewPlaybackPath.class, str);
    }

    public static VoicePreviewPlaybackPath[] values() {
        return (VoicePreviewPlaybackPath[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoicePreviewPlaybackPath(String str, int i, String str2) {
        this.value = str2;
    }
}

package com.facebook.aura.partners.voice.gating;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallAudioStream {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallAudioStream[] $VALUES;
    public static final VoiceCallAudioStream ASSISTANT;
    public static final VoiceCallAudioStream MEDIA;
    public static final VoiceCallAudioStream VOICE_CALL;
    public final int usage;

    static {
        VoiceCallAudioStream voiceCallAudioStream = new VoiceCallAudioStream("VOICE_CALL", 0, 2);
        VOICE_CALL = voiceCallAudioStream;
        VoiceCallAudioStream voiceCallAudioStream2 = new VoiceCallAudioStream("ASSISTANT", 1, 16);
        ASSISTANT = voiceCallAudioStream2;
        VoiceCallAudioStream voiceCallAudioStream3 = new VoiceCallAudioStream("MEDIA", 2, 1);
        MEDIA = voiceCallAudioStream3;
        VoiceCallAudioStream[] voiceCallAudioStreamArr = {voiceCallAudioStream, voiceCallAudioStream2, voiceCallAudioStream3};
        $VALUES = voiceCallAudioStreamArr;
        $ENTRIES = C3cG.A0w(voiceCallAudioStreamArr);
    }

    public static Ey9<VoiceCallAudioStream> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallAudioStream valueOf(String str) {
        return (VoiceCallAudioStream) Enum.valueOf(VoiceCallAudioStream.class, str);
    }

    public static VoiceCallAudioStream[] values() {
        return (VoiceCallAudioStream[]) $VALUES.clone();
    }

    public final int getUsage() {
        return this.usage;
    }

    public VoiceCallAudioStream(String str, int i, int i2) {
        this.usage = i2;
    }
}

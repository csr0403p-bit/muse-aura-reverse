package com.facebook.aura.audio;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AudioStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AudioStatus[] $VALUES;
    public static final AudioStatus LOADING;
    public static final AudioStatus PAUSED;
    public static final AudioStatus PLAYING;

    static {
        AudioStatus audioStatus = new AudioStatus("LOADING", 0);
        LOADING = audioStatus;
        AudioStatus audioStatus2 = new AudioStatus("PLAYING", 1);
        PLAYING = audioStatus2;
        AudioStatus audioStatus3 = new AudioStatus("PAUSED", 2);
        PAUSED = audioStatus3;
        AudioStatus[] audioStatusArr = {audioStatus, audioStatus2, audioStatus3};
        $VALUES = audioStatusArr;
        $ENTRIES = C3cG.A0w(audioStatusArr);
    }

    public static Ey9<AudioStatus> getEntries() {
        return $ENTRIES;
    }

    public static AudioStatus valueOf(String str) {
        return (AudioStatus) Enum.valueOf(AudioStatus.class, str);
    }

    public static AudioStatus[] values() {
        return (AudioStatus[]) $VALUES.clone();
    }

    public AudioStatus(String str, int i) {
    }
}

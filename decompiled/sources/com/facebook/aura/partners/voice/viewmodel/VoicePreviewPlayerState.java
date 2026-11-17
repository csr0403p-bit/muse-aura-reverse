package com.facebook.aura.partners.voice.viewmodel;

/* loaded from: classes2.dex */
public final class VoicePreviewPlayerState {
    public static final int $stable = 0;
    public final Long durationMs;
    public final Boolean isPlaying;
    public final Long positionMs;
    public final Integer routedDeviceType;
    public final int usage;

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final Long getPositionMs() {
        return this.positionMs;
    }

    public final Integer getRoutedDeviceType() {
        return this.routedDeviceType;
    }

    public final int getUsage() {
        return this.usage;
    }

    public final Boolean isPlaying() {
        return this.isPlaying;
    }

    public VoicePreviewPlayerState(int i, Integer num, Boolean bool, Long l, Long l2) {
        this.usage = i;
        this.routedDeviceType = num;
        this.isPlaying = bool;
        this.positionMs = l;
        this.durationMs = l2;
    }
}

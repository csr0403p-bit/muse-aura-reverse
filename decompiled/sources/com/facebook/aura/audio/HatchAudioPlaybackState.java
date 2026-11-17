package com.facebook.aura.audio;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchAudioPlaybackState extends C06G {
    public static final int $stable = 0;
    public final int durationMs;
    public final HatchAudioItem item;
    public final float playbackRate;
    public final AudioStatus status;
    public final float volume;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAudioPlaybackState) {
                HatchAudioPlaybackState hatchAudioPlaybackState = (HatchAudioPlaybackState) obj;
                if (!C7384Etj.areEqual(this.item, hatchAudioPlaybackState.item) || this.status != hatchAudioPlaybackState.status || this.durationMs != hatchAudioPlaybackState.durationMs || Float.compare(this.playbackRate, hatchAudioPlaybackState.playbackRate) != 0 || Float.compare(this.volume, hatchAudioPlaybackState.volume) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAudioPlaybackState copy$default(HatchAudioPlaybackState hatchAudioPlaybackState, HatchAudioItem hatchAudioItem, AudioStatus audioStatus, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hatchAudioItem = hatchAudioPlaybackState.item;
        }
        if ((i2 & 2) != 0) {
            audioStatus = hatchAudioPlaybackState.status;
        }
        if ((i2 & 4) != 0) {
            i = hatchAudioPlaybackState.durationMs;
        }
        if ((i2 & 8) != 0) {
            f = hatchAudioPlaybackState.playbackRate;
        }
        if ((i2 & 16) != 0) {
            f2 = hatchAudioPlaybackState.volume;
        }
        return hatchAudioPlaybackState.copy(hatchAudioItem, audioStatus, i, f, f2);
    }

    public final HatchAudioItem component1() {
        return this.item;
    }

    public final AudioStatus component2() {
        return this.status;
    }

    public final int component3() {
        return this.durationMs;
    }

    public final float component4() {
        return this.playbackRate;
    }

    public final float component5() {
        return this.volume;
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final HatchAudioItem getItem() {
        return this.item;
    }

    public final float getPlaybackRate() {
        return this.playbackRate;
    }

    public final AudioStatus getStatus() {
        return this.status;
    }

    public final float getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return AnonymousClass005.A02((AnonymousClass005.A0F(this.status, AnonymousClass005.A0E(this.item)) + this.durationMs) * 31, this.playbackRate) + Float.floatToIntBits(this.volume);
    }

    public HatchAudioPlaybackState(HatchAudioItem hatchAudioItem, AudioStatus audioStatus, int i, float f, float f2) {
        AnonymousClass003.A0u(hatchAudioItem, audioStatus);
        this.item = hatchAudioItem;
        this.status = audioStatus;
        this.durationMs = i;
        this.playbackRate = f;
        this.volume = f2;
    }

    public final HatchAudioPlaybackState copy(HatchAudioItem hatchAudioItem, AudioStatus audioStatus, int i, float f, float f2) {
        AnonymousClass003.A0u(hatchAudioItem, audioStatus);
        return new HatchAudioPlaybackState(hatchAudioItem, audioStatus, i, f, f2);
    }

    public String toString() {
        return super.toString();
    }
}

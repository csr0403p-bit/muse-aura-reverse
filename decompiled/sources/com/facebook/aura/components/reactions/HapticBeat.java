package com.facebook.aura.components.reactions;

import X.C06H;

/* loaded from: classes6.dex */
public final class HapticBeat {
    public final int durationMs;
    public final float intensity;
    public final float sharpness;
    public final int timeMs;

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final float getIntensity() {
        return this.intensity;
    }

    public final float getSharpness() {
        return this.sharpness;
    }

    public final int getTimeMs() {
        return this.timeMs;
    }

    public HapticBeat(int i, float f, float f2, int i2) {
        this.timeMs = i;
        this.intensity = f;
        this.sharpness = f2;
        this.durationMs = i2;
    }

    public /* synthetic */ HapticBeat(int i, float f, float f2, int i2, int i3, C06H c06h) {
        this(i, f, f2, (i3 & 8) != 0 ? 0 : i2);
    }
}

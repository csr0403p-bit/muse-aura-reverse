package com.facebook.aura.components.reactions;

/* loaded from: classes6.dex */
public final class HapticPulse {
    public final int primitive;
    public final float scale;
    public final int timeMs;

    public final int getPrimitive() {
        return this.primitive;
    }

    public final float getScale() {
        return this.scale;
    }

    public final int getTimeMs() {
        return this.timeMs;
    }

    public HapticPulse(int i, int i2, float f) {
        this.timeMs = i;
        this.primitive = i2;
        this.scale = f;
    }
}

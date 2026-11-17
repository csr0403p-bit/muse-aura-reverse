package com.facebook.aura.ageverification;

/* loaded from: classes3.dex */
public final class NormalizedFace {
    public static final int $stable = 0;
    public final float centerX;
    public final float centerY;
    public final float height;
    public final float pitchDegrees;
    public final float yawDegrees;

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPitchDegrees() {
        return this.pitchDegrees;
    }

    public final float getYawDegrees() {
        return this.yawDegrees;
    }

    public NormalizedFace(float f, float f2, float f3, float f4, float f5) {
        this.centerX = f;
        this.centerY = f2;
        this.height = f3;
        this.yawDegrees = f4;
        this.pitchDegrees = f5;
    }
}

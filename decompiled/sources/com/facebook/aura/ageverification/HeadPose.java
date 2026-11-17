package com.facebook.aura.ageverification;

/* loaded from: classes3.dex */
public final class HeadPose {
    public static final int $stable = 0;
    public final float pitch;
    public final float yaw;

    public final float getPitch() {
        return this.pitch;
    }

    public final float getYaw() {
        return this.yaw;
    }

    public final boolean isNeutral() {
        return Math.abs(this.yaw) <= 0.016666668f && Math.abs(this.pitch) <= 0.016666668f;
    }

    public HeadPose(float f, float f2) {
        this.yaw = f;
        this.pitch = f2;
    }
}

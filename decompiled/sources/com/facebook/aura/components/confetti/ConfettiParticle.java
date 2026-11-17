package com.facebook.aura.components.confetti;

import X.C06H;

/* loaded from: classes4.dex */
public final class ConfettiParticle {
    public final float angle;
    public final long color;
    public final float maxDistance;
    public final float rotation;
    public final long size;
    public final float spin;

    public final float getAngle() {
        return this.angle;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m374getColor0d7_KjU() {
        return this.color;
    }

    public final float getMaxDistance() {
        return this.maxDistance;
    }

    public final float getRotation() {
        return this.rotation;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m375getSizeNHjbRc() {
        return this.size;
    }

    public final float getSpin() {
        return this.spin;
    }

    public /* synthetic */ ConfettiParticle(float f, float f2, long j, long j2, float f3, float f4, C06H c06h) {
        this(f, f2, j, j2, f3, f4);
    }

    public ConfettiParticle(float f, float f2, long j, long j2, float f3, float f4) {
        this.angle = f;
        this.maxDistance = f2;
        this.color = j;
        this.size = j2;
        this.rotation = f3;
        this.spin = f4;
    }
}

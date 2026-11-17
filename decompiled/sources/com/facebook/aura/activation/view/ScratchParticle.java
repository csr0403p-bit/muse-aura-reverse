package com.facebook.aura.activation.view;

import X.C06H;

/* loaded from: classes4.dex */
public final class ScratchParticle {
    public final long birthNanos;
    public final float diameterPx;
    public final boolean isBright;
    public final long origin;
    public final long velocity;

    public final float ageSeconds(long j) {
        return (j - this.birthNanos) / 1.0E9f;
    }

    public final long getBirthNanos() {
        return this.birthNanos;
    }

    public final float getDiameterPx() {
        return this.diameterPx;
    }

    /* renamed from: getOrigin-F1C5BW0, reason: not valid java name */
    public final long m157getOriginF1C5BW0() {
        return this.origin;
    }

    /* renamed from: getVelocity-F1C5BW0, reason: not valid java name */
    public final long m158getVelocityF1C5BW0() {
        return this.velocity;
    }

    public final boolean isBright() {
        return this.isBright;
    }

    public ScratchParticle(long j, long j2, long j3, float f, boolean z) {
        this.origin = j;
        this.velocity = j2;
        this.birthNanos = j3;
        this.diameterPx = f;
        this.isBright = z;
    }

    public /* synthetic */ ScratchParticle(long j, long j2, long j3, float f, boolean z, C06H c06h) {
        this(j, j2, j3, f, z);
    }
}

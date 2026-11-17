package com.facebook.aura.activation.view;

import X.AnonymousClass003;
import X.C06H;

/* loaded from: classes4.dex */
public final class ConfettiParticle {
    public final long color;
    public final float delay;
    public final ConfettiDepth depth;
    public final float drag;
    public final float end;
    public final float gravity;
    public final float height;
    public final ConfettiKind kind;
    public final float lifetime;
    public final float normalizedX;
    public final float rotation;
    public final float spin;
    public final float startY;
    public final float swayAmplitude;
    public final float swayFrequency;
    public final float swayPhase;
    public final float targetOffset;
    public final float targetSide;
    public final float targetStrength;
    public final boolean targetsSuccess;
    public final float tumblePhase;
    public final float tumbleRate;
    public final float velocityX;
    public final float velocityY;
    public final float width;

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m136getColor0d7_KjU() {
        return this.color;
    }

    public final float getDelay() {
        return this.delay;
    }

    public final ConfettiDepth getDepth() {
        return this.depth;
    }

    public final float getDrag() {
        return this.drag;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getGravity() {
        return this.gravity;
    }

    public final float getHeight() {
        return this.height;
    }

    public final ConfettiKind getKind() {
        return this.kind;
    }

    public final float getLifetime() {
        return this.lifetime;
    }

    public final float getNormalizedX() {
        return this.normalizedX;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getSpin() {
        return this.spin;
    }

    public final float getStartY() {
        return this.startY;
    }

    public final float getSwayAmplitude() {
        return this.swayAmplitude;
    }

    public final float getSwayFrequency() {
        return this.swayFrequency;
    }

    public final float getSwayPhase() {
        return this.swayPhase;
    }

    public final float getTargetOffset() {
        return this.targetOffset;
    }

    public final float getTargetSide() {
        return this.targetSide;
    }

    public final float getTargetStrength() {
        return this.targetStrength;
    }

    public final boolean getTargetsSuccess() {
        return this.targetsSuccess;
    }

    public final float getTumblePhase() {
        return this.tumblePhase;
    }

    public final float getTumbleRate() {
        return this.tumbleRate;
    }

    public final float getVelocityX() {
        return this.velocityX;
    }

    public final float getVelocityY() {
        return this.velocityY;
    }

    public final float getWidth() {
        return this.width;
    }

    public ConfettiParticle(ConfettiDepth confettiDepth, ConfettiKind confettiKind, long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z, float f18, float f19, float f20) {
        AnonymousClass003.A0u(confettiDepth, confettiKind);
        this.depth = confettiDepth;
        this.kind = confettiKind;
        this.color = j;
        this.normalizedX = f;
        this.startY = f2;
        this.delay = f3;
        this.velocityX = f4;
        this.velocityY = f5;
        this.gravity = f6;
        this.drag = f7;
        this.width = f8;
        this.height = f9;
        this.rotation = f10;
        this.spin = f11;
        this.tumblePhase = f12;
        this.tumbleRate = f13;
        this.swayAmplitude = f14;
        this.swayFrequency = f15;
        this.swayPhase = f16;
        this.lifetime = f17;
        this.targetsSuccess = z;
        this.targetSide = f18;
        this.targetOffset = f19;
        this.targetStrength = f20;
        this.end = f3 + f17;
    }

    public /* synthetic */ ConfettiParticle(ConfettiDepth confettiDepth, ConfettiKind confettiKind, long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z, float f18, float f19, float f20, C06H c06h) {
        this(confettiDepth, confettiKind, j, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, z, f18, f19, f20);
    }
}

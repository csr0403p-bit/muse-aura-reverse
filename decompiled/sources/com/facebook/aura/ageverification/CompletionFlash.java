package com.facebook.aura.ageverification;

import X.AnonymousClass003;
import X.C1BO;

/* loaded from: classes3.dex */
public final class CompletionFlash {
    public static final int $stable = 0;
    public final HeadMovement direction;
    public final C1BO<Float> strength;

    public final HeadMovement getDirection() {
        return this.direction;
    }

    public final C1BO<Float> getStrength() {
        return this.strength;
    }

    public CompletionFlash(HeadMovement headMovement, C1BO<Float> c1bo) {
        AnonymousClass003.A0u(headMovement, c1bo);
        this.direction = headMovement;
        this.strength = c1bo;
    }
}

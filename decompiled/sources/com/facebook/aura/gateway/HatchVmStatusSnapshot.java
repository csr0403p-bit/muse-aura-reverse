package com.facebook.aura.gateway;

/* loaded from: classes5.dex */
public final class HatchVmStatusSnapshot<Identity, Health> {
    public static final int $stable = 0;
    public final HatchVmStatusFailure failure;
    public final Health health;
    public final Identity identity;

    public final HatchVmStatusFailure getFailure() {
        return this.failure;
    }

    public final Health getHealth() {
        return this.health;
    }

    public final Identity getIdentity() {
        return this.identity;
    }

    public HatchVmStatusSnapshot(Identity identity, Health health, HatchVmStatusFailure hatchVmStatusFailure) {
        this.identity = identity;
        this.health = health;
        this.failure = hatchVmStatusFailure;
    }
}

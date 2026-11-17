package com.facebook.aura.pairs;

/* loaded from: classes3.dex */
public abstract class PairsPendingLevelStoreKt {
    public static final long DROPPED_RETENTION_MS = 604800000;
    public static final String STATE_DROPPED = "dropped";
    public static final String STATE_PENDING = "pending";

    public static final PairsPendingLevelJson dropped(PairsPendingLevelJson pairsPendingLevelJson, long j) {
        return new PairsPendingLevelJson(pairsPendingLevelJson.preset, Math.max(pairsPendingLevelJson.expires_at_ms, j + 604800000), STATE_DROPPED);
    }

    public static final PairsLevel level(PairsPendingLevelJson pairsPendingLevelJson) {
        return PairsLevel.Companion.fromWire(pairsPendingLevelJson.preset);
    }
}

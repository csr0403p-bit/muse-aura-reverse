package com.facebook.aura.appupdate;

/* loaded from: classes5.dex */
public final class AuraPlayStalledUpdateRetry {
    public static final int $stable = 0;
    public static final long COOLDOWN_MS = 86400000;
    public static final AuraPlayStalledUpdateRetry INSTANCE = new AuraPlayStalledUpdateRetry();
    public static final String ATTEMPTED_AT_KEY = "play_stalled_update_attempted_at";
    public static final AppUpdateNudgeCooldown cooldown = new AppUpdateNudgeCooldown(ATTEMPTED_AT_KEY, 86400000);

    public final void recordAttempt() {
        cooldown.record();
    }

    public final boolean shouldRetry() {
        return cooldown.isElapsed();
    }
}

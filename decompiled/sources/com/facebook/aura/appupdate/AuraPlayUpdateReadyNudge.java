package com.facebook.aura.appupdate;

/* loaded from: classes5.dex */
public final class AuraPlayUpdateReadyNudge {
    public static final int $stable = 0;
    public static final long COOLDOWN_MS = 86400000;
    public static final AuraPlayUpdateReadyNudge INSTANCE = new AuraPlayUpdateReadyNudge();
    public static final String SHOWN_AT_KEY = "play_update_ready_shown_at";
    public static final AppUpdateNudgeCooldown cooldown = new AppUpdateNudgeCooldown(SHOWN_AT_KEY, 86400000);

    public final void recordShown() {
        cooldown.record();
    }

    public final boolean shouldShow() {
        return cooldown.isElapsed();
    }
}

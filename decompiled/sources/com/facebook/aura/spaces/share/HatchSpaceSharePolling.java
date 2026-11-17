package com.facebook.aura.spaces.share;

/* loaded from: classes4.dex */
public final class HatchSpaceSharePolling {
    public static final int $stable = 0;
    public static final long DISCOVERY_AFTER_SUCCESS_TIMEOUT_MS = 15000;
    public static final long DISCOVERY_TIMEOUT_MS = 75000;
    public static final long ERROR_BACKOFF_MS = 30000;
    public static final long FAST_POLL_INTERVAL_MS = 500;
    public static final long FAST_POLL_WINDOW_MS = 6000;
    public static final HatchSpaceSharePolling INSTANCE = new HatchSpaceSharePolling();
    public static final long SLOW_POLL_INTERVAL_MS = 2000;

    public final Long nextDelayMs(long j, long j2, boolean z) {
        if (j2 <= 0) {
            return null;
        }
        return Long.valueOf(Math.min(z ? 30000L : j < 6000 ? 500L : 2000L, j2));
    }
}

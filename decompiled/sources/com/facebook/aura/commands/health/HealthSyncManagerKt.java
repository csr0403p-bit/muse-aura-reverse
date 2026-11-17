package com.facebook.aura.commands.health;

import java.time.Duration;

/* loaded from: classes6.dex */
public abstract class HealthSyncManagerKt {
    public static final long DEBOUNCE_MS = 2000;
    public static final long DEFAULT_INTERVAL_SECONDS = 1800;
    public static final String DEFAULT_PROVIDER_ID = "healthconnect";
    public static final String TAG = "HealthSyncManager";
    public static final String TRAILING_RESYNC_DATATYPE = "health_trailing_resync";
    public static final String TRAILING_RESYNC_FINGERPRINT = "trailing_resync";
    public static final String TRAILING_RESYNC_KEY = "last_resync_ms";
    public static final long TRAILING_RESYNC_THROTTLE_MS = 21600000;
    public static final String WATERMARK_DATATYPE = "health_proactive_watermark";
    public static final String WATERMARK_FINGERPRINT = "proactive";
    public static final String WATERMARK_KEY = "watermark_ms";
    public static final Duration TRAILING_RESYNC_WINDOW = Duration.ofDays(7);
    public static final Duration OBSERVER_MAX_LOOKBACK = Duration.ofHours(6);
    public static final DedupeSpec RESYNC_DEDUPE_SPEC = new DedupeSpec("health_trailing_resync_payload", "trailing_resync_payload", "payload_hash");
}

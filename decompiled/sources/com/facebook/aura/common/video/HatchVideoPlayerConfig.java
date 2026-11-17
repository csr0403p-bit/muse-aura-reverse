package com.facebook.aura.common.video;

/* loaded from: classes6.dex */
public final class HatchVideoPlayerConfig {
    public static final int $stable = 0;
    public static final int DEFAULT_VIDEO_PREFETCH_BYTES = 1048576;
    public static final int GROOT_CACHE_SIZE_MB = 100;
    public static final int GROOT_PLAYER_MAX_POOL_SIZE = 4;
    public static final HatchVideoPlayerConfig INSTANCE = new HatchVideoPlayerConfig();

    public final int getCacheSizeInBytes() {
        return 104857600;
    }

    public final int getConversationVideoPlayerPoolSize() {
        return 4;
    }

    public final int getGrootPlayerMaxPoolSize() {
        return 4;
    }

    public final int getVideoPrefetchBytes() {
        return 1048576;
    }
}

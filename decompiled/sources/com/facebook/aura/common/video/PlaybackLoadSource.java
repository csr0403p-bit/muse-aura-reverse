package com.facebook.aura.common.video;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PlaybackLoadSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PlaybackLoadSource[] $VALUES;
    public static final PlaybackLoadSource FROM_EXISTING_CACHE;
    public static final PlaybackLoadSource FROM_PREFETCH;
    public static final PlaybackLoadSource NEW_LOAD;
    public final String logValue;

    static {
        PlaybackLoadSource playbackLoadSource = new PlaybackLoadSource("FROM_PREFETCH", 0, "from_prefetch");
        FROM_PREFETCH = playbackLoadSource;
        PlaybackLoadSource playbackLoadSource2 = new PlaybackLoadSource("FROM_EXISTING_CACHE", 1, "from_existing_cache");
        FROM_EXISTING_CACHE = playbackLoadSource2;
        PlaybackLoadSource playbackLoadSource3 = new PlaybackLoadSource("NEW_LOAD", 2, "new_load");
        NEW_LOAD = playbackLoadSource3;
        PlaybackLoadSource[] playbackLoadSourceArr = {playbackLoadSource, playbackLoadSource2, playbackLoadSource3};
        $VALUES = playbackLoadSourceArr;
        $ENTRIES = C3cG.A0w(playbackLoadSourceArr);
    }

    public static Ey9<PlaybackLoadSource> getEntries() {
        return $ENTRIES;
    }

    public static PlaybackLoadSource valueOf(String str) {
        return (PlaybackLoadSource) Enum.valueOf(PlaybackLoadSource.class, str);
    }

    public static PlaybackLoadSource[] values() {
        return (PlaybackLoadSource[]) $VALUES.clone();
    }

    public final String getLogValue() {
        return this.logValue;
    }

    public PlaybackLoadSource(String str, int i, String str2) {
        this.logValue = str2;
    }
}

package com.facebook.aura.feed.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedVideoPlaybackState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedVideoPlaybackState[] $VALUES;
    public static final FeedVideoPlaybackState PAUSED;
    public static final FeedVideoPlaybackState PLAYING;
    public static final FeedVideoPlaybackState STOPPED;

    static {
        FeedVideoPlaybackState feedVideoPlaybackState = new FeedVideoPlaybackState("STOPPED", 0);
        STOPPED = feedVideoPlaybackState;
        FeedVideoPlaybackState feedVideoPlaybackState2 = new FeedVideoPlaybackState("PLAYING", 1);
        PLAYING = feedVideoPlaybackState2;
        FeedVideoPlaybackState feedVideoPlaybackState3 = new FeedVideoPlaybackState("PAUSED", 2);
        PAUSED = feedVideoPlaybackState3;
        FeedVideoPlaybackState[] feedVideoPlaybackStateArr = {feedVideoPlaybackState, feedVideoPlaybackState2, feedVideoPlaybackState3};
        $VALUES = feedVideoPlaybackStateArr;
        $ENTRIES = new F3w(feedVideoPlaybackStateArr);
    }

    public static Ey9<FeedVideoPlaybackState> getEntries() {
        return $ENTRIES;
    }

    public static FeedVideoPlaybackState valueOf(String str) {
        return (FeedVideoPlaybackState) Enum.valueOf(FeedVideoPlaybackState.class, str);
    }

    public static FeedVideoPlaybackState[] values() {
        return (FeedVideoPlaybackState[]) $VALUES.clone();
    }

    public FeedVideoPlaybackState(String str, int i) {
    }
}

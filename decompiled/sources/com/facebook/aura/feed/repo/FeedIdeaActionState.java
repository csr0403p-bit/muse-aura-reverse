package com.facebook.aura.feed.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedIdeaActionState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedIdeaActionState[] $VALUES;
    public static final FeedIdeaActionState AVAILABLE;
    public static final FeedIdeaActionState BUILT;

    static {
        FeedIdeaActionState feedIdeaActionState = new FeedIdeaActionState("AVAILABLE", 0);
        AVAILABLE = feedIdeaActionState;
        FeedIdeaActionState feedIdeaActionState2 = new FeedIdeaActionState("BUILT", 1);
        BUILT = feedIdeaActionState2;
        FeedIdeaActionState[] feedIdeaActionStateArr = {feedIdeaActionState, feedIdeaActionState2};
        $VALUES = feedIdeaActionStateArr;
        $ENTRIES = new F3w(feedIdeaActionStateArr);
    }

    public static Ey9<FeedIdeaActionState> getEntries() {
        return $ENTRIES;
    }

    public static FeedIdeaActionState valueOf(String str) {
        return (FeedIdeaActionState) Enum.valueOf(FeedIdeaActionState.class, str);
    }

    public static FeedIdeaActionState[] values() {
        return (FeedIdeaActionState[]) $VALUES.clone();
    }

    public FeedIdeaActionState(String str, int i) {
    }
}

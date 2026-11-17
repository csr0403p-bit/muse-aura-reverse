package com.facebook.aura.feed.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedReaction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedReaction[] $VALUES;
    public static final FeedReaction DISLIKE;
    public static final FeedReaction LIKE;
    public static final FeedReaction LOVE;

    static {
        FeedReaction feedReaction = new FeedReaction("LIKE", 0);
        LIKE = feedReaction;
        FeedReaction feedReaction2 = new FeedReaction("LOVE", 1);
        LOVE = feedReaction2;
        FeedReaction feedReaction3 = new FeedReaction("DISLIKE", 2);
        DISLIKE = feedReaction3;
        FeedReaction[] feedReactionArr = {feedReaction, feedReaction2, feedReaction3};
        $VALUES = feedReactionArr;
        $ENTRIES = new F3w(feedReactionArr);
    }

    public static Ey9<FeedReaction> getEntries() {
        return $ENTRIES;
    }

    public static FeedReaction valueOf(String str) {
        return (FeedReaction) Enum.valueOf(FeedReaction.class, str);
    }

    public static FeedReaction[] values() {
        return (FeedReaction[]) $VALUES.clone();
    }

    public FeedReaction(String str, int i) {
    }
}

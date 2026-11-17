package com.facebook.aura.feed.model;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FeedPaginationMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedPaginationMode[] $VALUES;
    public static final FeedPaginationMode CURSOR;
    public static final FeedPaginationMode INFINITE;

    static {
        FeedPaginationMode feedPaginationMode = new FeedPaginationMode("INFINITE", 0);
        INFINITE = feedPaginationMode;
        FeedPaginationMode feedPaginationMode2 = new FeedPaginationMode("CURSOR", 1);
        CURSOR = feedPaginationMode2;
        FeedPaginationMode[] feedPaginationModeArr = {feedPaginationMode, feedPaginationMode2};
        $VALUES = feedPaginationModeArr;
        $ENTRIES = C3cG.A0w(feedPaginationModeArr);
    }

    public static Ey9<FeedPaginationMode> getEntries() {
        return $ENTRIES;
    }

    public static FeedPaginationMode valueOf(String str) {
        return (FeedPaginationMode) Enum.valueOf(FeedPaginationMode.class, str);
    }

    public static FeedPaginationMode[] values() {
        return (FeedPaginationMode[]) $VALUES.clone();
    }

    public FeedPaginationMode(String str, int i) {
    }
}

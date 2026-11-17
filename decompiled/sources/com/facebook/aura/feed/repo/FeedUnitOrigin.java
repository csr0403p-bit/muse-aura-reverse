package com.facebook.aura.feed.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedUnitOrigin {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedUnitOrigin[] $VALUES;
    public static final FeedUnitOrigin AGENT;
    public static final FeedUnitOrigin GENERATED;
    public static final FeedUnitOrigin IDEA;
    public static final FeedUnitOrigin INGESTED;
    public static final FeedUnitOrigin UNKNOWN;

    static {
        FeedUnitOrigin feedUnitOrigin = new FeedUnitOrigin("GENERATED", 0);
        GENERATED = feedUnitOrigin;
        FeedUnitOrigin feedUnitOrigin2 = new FeedUnitOrigin("INGESTED", 1);
        INGESTED = feedUnitOrigin2;
        FeedUnitOrigin feedUnitOrigin3 = new FeedUnitOrigin("AGENT", 2);
        AGENT = feedUnitOrigin3;
        FeedUnitOrigin feedUnitOrigin4 = new FeedUnitOrigin("IDEA", 3);
        IDEA = feedUnitOrigin4;
        FeedUnitOrigin feedUnitOrigin5 = new FeedUnitOrigin("UNKNOWN", 4);
        UNKNOWN = feedUnitOrigin5;
        FeedUnitOrigin[] feedUnitOriginArr = {feedUnitOrigin, feedUnitOrigin2, feedUnitOrigin3, feedUnitOrigin4, feedUnitOrigin5};
        $VALUES = feedUnitOriginArr;
        $ENTRIES = new F3w(feedUnitOriginArr);
    }

    public static Ey9<FeedUnitOrigin> getEntries() {
        return $ENTRIES;
    }

    public static FeedUnitOrigin valueOf(String str) {
        return (FeedUnitOrigin) Enum.valueOf(FeedUnitOrigin.class, str);
    }

    public static FeedUnitOrigin[] values() {
        return (FeedUnitOrigin[]) $VALUES.clone();
    }

    public FeedUnitOrigin(String str, int i) {
    }
}

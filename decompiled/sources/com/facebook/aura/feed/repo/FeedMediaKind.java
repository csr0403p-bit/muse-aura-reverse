package com.facebook.aura.feed.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedMediaKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedMediaKind[] $VALUES;
    public static final FeedMediaKind IMAGE;
    public static final FeedMediaKind VIDEO;

    static {
        FeedMediaKind feedMediaKind = new FeedMediaKind("IMAGE", 0);
        IMAGE = feedMediaKind;
        FeedMediaKind feedMediaKind2 = new FeedMediaKind("VIDEO", 1);
        VIDEO = feedMediaKind2;
        FeedMediaKind[] feedMediaKindArr = {feedMediaKind, feedMediaKind2};
        $VALUES = feedMediaKindArr;
        $ENTRIES = new F3w(feedMediaKindArr);
    }

    public static Ey9<FeedMediaKind> getEntries() {
        return $ENTRIES;
    }

    public static FeedMediaKind valueOf(String str) {
        return (FeedMediaKind) Enum.valueOf(FeedMediaKind.class, str);
    }

    public static FeedMediaKind[] values() {
        return (FeedMediaKind[]) $VALUES.clone();
    }

    public FeedMediaKind(String str, int i) {
    }
}

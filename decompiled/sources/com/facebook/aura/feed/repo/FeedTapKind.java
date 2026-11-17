package com.facebook.aura.feed.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedTapKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedTapKind[] $VALUES;
    public static final FeedTapKind IMAGE;
    public static final FeedTapKind LINK;
    public static final FeedTapKind SOCIAL_SOURCE;
    public static final FeedTapKind VIDEO;
    public final String wireValue;

    static {
        FeedTapKind feedTapKind = new FeedTapKind("IMAGE", 0, "tap_image");
        IMAGE = feedTapKind;
        FeedTapKind feedTapKind2 = new FeedTapKind("VIDEO", 1, "tap_video");
        VIDEO = feedTapKind2;
        FeedTapKind feedTapKind3 = new FeedTapKind("LINK", 2, "tap_link");
        LINK = feedTapKind3;
        FeedTapKind feedTapKind4 = new FeedTapKind("SOCIAL_SOURCE", 3, "tap_social_source");
        SOCIAL_SOURCE = feedTapKind4;
        FeedTapKind[] feedTapKindArr = {feedTapKind, feedTapKind2, feedTapKind3, feedTapKind4};
        $VALUES = feedTapKindArr;
        $ENTRIES = new F3w(feedTapKindArr);
    }

    public static Ey9<FeedTapKind> getEntries() {
        return $ENTRIES;
    }

    public static FeedTapKind valueOf(String str) {
        return (FeedTapKind) Enum.valueOf(FeedTapKind.class, str);
    }

    public static FeedTapKind[] values() {
        return (FeedTapKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public FeedTapKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

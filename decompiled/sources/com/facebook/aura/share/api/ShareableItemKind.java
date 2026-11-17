package com.facebook.aura.share.api;

import X.Ey9;
import X.F3w;
import com.facebook.aura.model.ReplyAttributionSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ShareableItemKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShareableItemKind[] $VALUES;
    public static final ShareableItemKind FEED;
    public static final ShareableItemKind FILE;
    public static final ShareableItemKind GOAL;
    public static final ShareableItemKind IDEA;
    public static final ShareableItemKind SPACE;
    public final String wire;

    static {
        ShareableItemKind shareableItemKind = new ShareableItemKind("SPACE", 0, "space");
        SPACE = shareableItemKind;
        ShareableItemKind shareableItemKind2 = new ShareableItemKind("GOAL", 1, ReplyAttributionSerializer.TYPE_GOAL);
        GOAL = shareableItemKind2;
        ShareableItemKind shareableItemKind3 = new ShareableItemKind("IDEA", 2, "idea");
        IDEA = shareableItemKind3;
        ShareableItemKind shareableItemKind4 = new ShareableItemKind("FEED", 3, "feed");
        FEED = shareableItemKind4;
        ShareableItemKind shareableItemKind5 = new ShareableItemKind("FILE", 4, "file");
        FILE = shareableItemKind5;
        ShareableItemKind[] shareableItemKindArr = {shareableItemKind, shareableItemKind2, shareableItemKind3, shareableItemKind4, shareableItemKind5};
        $VALUES = shareableItemKindArr;
        $ENTRIES = new F3w(shareableItemKindArr);
    }

    public static Ey9<ShareableItemKind> getEntries() {
        return $ENTRIES;
    }

    public static ShareableItemKind valueOf(String str) {
        return (ShareableItemKind) Enum.valueOf(ShareableItemKind.class, str);
    }

    public static ShareableItemKind[] values() {
        return (ShareableItemKind[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public ShareableItemKind(String str, int i, String str2) {
        this.wire = str2;
    }
}

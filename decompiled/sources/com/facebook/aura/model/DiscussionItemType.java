package com.facebook.aura.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DiscussionItemType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DiscussionItemType[] $VALUES;
    public static final DiscussionItemType Activity;
    public static final DiscussionItemType FeedCard;
    public static final DiscussionItemType File;
    public static final DiscussionItemType Goal;

    static {
        DiscussionItemType discussionItemType = new DiscussionItemType("FeedCard", 0);
        FeedCard = discussionItemType;
        DiscussionItemType discussionItemType2 = new DiscussionItemType("Activity", 1);
        Activity = discussionItemType2;
        DiscussionItemType discussionItemType3 = new DiscussionItemType("File", 2);
        File = discussionItemType3;
        DiscussionItemType discussionItemType4 = new DiscussionItemType("Goal", 3);
        Goal = discussionItemType4;
        DiscussionItemType[] discussionItemTypeArr = {discussionItemType, discussionItemType2, discussionItemType3, discussionItemType4};
        $VALUES = discussionItemTypeArr;
        $ENTRIES = new F3w(discussionItemTypeArr);
    }

    public static Ey9<DiscussionItemType> getEntries() {
        return $ENTRIES;
    }

    public static DiscussionItemType valueOf(String str) {
        return (DiscussionItemType) Enum.valueOf(DiscussionItemType.class, str);
    }

    public static DiscussionItemType[] values() {
        return (DiscussionItemType[]) $VALUES.clone();
    }

    public DiscussionItemType(String str, int i) {
    }
}

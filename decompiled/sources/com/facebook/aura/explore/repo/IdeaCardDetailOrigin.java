package com.facebook.aura.explore.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeaCardDetailOrigin {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaCardDetailOrigin[] $VALUES;
    public static final IdeaCardDetailOrigin CHAT;
    public static final IdeaCardDetailOrigin FEED;

    static {
        IdeaCardDetailOrigin ideaCardDetailOrigin = new IdeaCardDetailOrigin("FEED", 0);
        FEED = ideaCardDetailOrigin;
        IdeaCardDetailOrigin ideaCardDetailOrigin2 = new IdeaCardDetailOrigin("CHAT", 1);
        CHAT = ideaCardDetailOrigin2;
        IdeaCardDetailOrigin[] ideaCardDetailOriginArr = {ideaCardDetailOrigin, ideaCardDetailOrigin2};
        $VALUES = ideaCardDetailOriginArr;
        $ENTRIES = new F3w(ideaCardDetailOriginArr);
    }

    public static Ey9<IdeaCardDetailOrigin> getEntries() {
        return $ENTRIES;
    }

    public static IdeaCardDetailOrigin valueOf(String str) {
        return (IdeaCardDetailOrigin) Enum.valueOf(IdeaCardDetailOrigin.class, str);
    }

    public static IdeaCardDetailOrigin[] values() {
        return (IdeaCardDetailOrigin[]) $VALUES.clone();
    }

    public IdeaCardDetailOrigin(String str, int i) {
    }
}

package com.facebook.aura.explore.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class IdeaSwipeAnchor {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaSwipeAnchor[] $VALUES;
    public static final IdeaSwipeAnchor CLOSED;
    public static final IdeaSwipeAnchor MORE_LIKE_THIS;
    public static final IdeaSwipeAnchor NOT_INTERESTED;

    static {
        IdeaSwipeAnchor ideaSwipeAnchor = new IdeaSwipeAnchor("NOT_INTERESTED", 0);
        NOT_INTERESTED = ideaSwipeAnchor;
        IdeaSwipeAnchor ideaSwipeAnchor2 = new IdeaSwipeAnchor("CLOSED", 1);
        CLOSED = ideaSwipeAnchor2;
        IdeaSwipeAnchor ideaSwipeAnchor3 = new IdeaSwipeAnchor("MORE_LIKE_THIS", 2);
        MORE_LIKE_THIS = ideaSwipeAnchor3;
        IdeaSwipeAnchor[] ideaSwipeAnchorArr = {ideaSwipeAnchor, ideaSwipeAnchor2, ideaSwipeAnchor3};
        $VALUES = ideaSwipeAnchorArr;
        $ENTRIES = C3cG.A0w(ideaSwipeAnchorArr);
    }

    public static Ey9<IdeaSwipeAnchor> getEntries() {
        return $ENTRIES;
    }

    public static IdeaSwipeAnchor valueOf(String str) {
        return (IdeaSwipeAnchor) Enum.valueOf(IdeaSwipeAnchor.class, str);
    }

    public static IdeaSwipeAnchor[] values() {
        return (IdeaSwipeAnchor[]) $VALUES.clone();
    }

    public IdeaSwipeAnchor(String str, int i) {
    }
}

package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeaCardLayout {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaCardLayout[] $VALUES;
    public static final IdeaCardLayout COMMUNITY_ROWS;
    public static final Companion Companion;
    public static final IdeaCardLayout IDEAS;

    static {
        IdeaCardLayout ideaCardLayout = new IdeaCardLayout("IDEAS", 0);
        IDEAS = ideaCardLayout;
        IdeaCardLayout ideaCardLayout2 = new IdeaCardLayout("COMMUNITY_ROWS", 1);
        COMMUNITY_ROWS = ideaCardLayout2;
        IdeaCardLayout[] ideaCardLayoutArr = {ideaCardLayout, ideaCardLayout2};
        $VALUES = ideaCardLayoutArr;
        $ENTRIES = new F3w(ideaCardLayoutArr);
        Companion = new Companion();
    }

    public static Ey9<IdeaCardLayout> getEntries() {
        return $ENTRIES;
    }

    public static IdeaCardLayout valueOf(String str) {
        return (IdeaCardLayout) Enum.valueOf(IdeaCardLayout.class, str);
    }

    public static IdeaCardLayout[] values() {
        return (IdeaCardLayout[]) $VALUES.clone();
    }

    public final class Companion {
        public final IdeaCardLayout fromWire(String str) {
            C7384Etj.A0Y(str, 0);
            return AnonymousClass001.A0u(str).equals("hero") ? IdeaCardLayout.IDEAS : IdeaCardLayout.COMMUNITY_ROWS;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaCardLayout(String str, int i) {
    }
}

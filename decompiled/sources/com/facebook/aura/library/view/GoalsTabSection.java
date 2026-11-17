package com.facebook.aura.library.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GoalsTabSection {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalsTabSection[] $VALUES;
    public static final GoalsTabSection GOALS;
    public static final GoalsTabSection TRACKING;

    static {
        GoalsTabSection goalsTabSection = new GoalsTabSection("TRACKING", 0);
        TRACKING = goalsTabSection;
        GoalsTabSection goalsTabSection2 = new GoalsTabSection("GOALS", 1);
        GOALS = goalsTabSection2;
        GoalsTabSection[] goalsTabSectionArr = {goalsTabSection, goalsTabSection2};
        $VALUES = goalsTabSectionArr;
        $ENTRIES = C3cG.A0w(goalsTabSectionArr);
    }

    public static Ey9<GoalsTabSection> getEntries() {
        return $ENTRIES;
    }

    public static GoalsTabSection valueOf(String str) {
        return (GoalsTabSection) Enum.valueOf(GoalsTabSection.class, str);
    }

    public static GoalsTabSection[] values() {
        return (GoalsTabSection[]) $VALUES.clone();
    }

    public GoalsTabSection(String str, int i) {
    }
}

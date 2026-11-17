package com.facebook.aura.library.repo;

import X.AnonymousClass002;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GoalListSection {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalListSection[] $VALUES;
    public static final GoalListSection GOALS;
    public static final GoalListSection TRACKING;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoalListSection.values().length];
            try {
                AnonymousClass002.A13(GoalListSection.GOALS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(GoalListSection.TRACKING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        GoalListSection goalListSection = new GoalListSection("GOALS", 0);
        GOALS = goalListSection;
        GoalListSection goalListSection2 = new GoalListSection("TRACKING", 1);
        TRACKING = goalListSection2;
        GoalListSection[] goalListSectionArr = {goalListSection, goalListSection2};
        $VALUES = goalListSectionArr;
        $ENTRIES = C3cG.A0w(goalListSectionArr);
    }

    public static Ey9<GoalListSection> getEntries() {
        return $ENTRIES;
    }

    public static GoalListSection valueOf(String str) {
        return (GoalListSection) Enum.valueOf(GoalListSection.class, str);
    }

    public static GoalListSection[] values() {
        return (GoalListSection[]) $VALUES.clone();
    }

    public GoalListSection(String str, int i) {
    }

    public final GoalSource getWireSource() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return GoalSource.USER_GOAL;
        }
        if (iOrdinal == 1) {
            return GoalSource.ASSISTANT_TRACKING;
        }
        throw C3cG.A0q();
    }
}

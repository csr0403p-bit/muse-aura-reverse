package com.facebook.aura.spaces.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BuiltInItemType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BuiltInItemType[] $VALUES;
    public static final BuiltInItemType EXPLORE;
    public static final BuiltInItemType GOALS;
    public static final BuiltInItemType LIBRARY;
    public static final BuiltInItemType SETTINGS;
    public final String displayTitle;
    public final String id;

    static {
        BuiltInItemType builtInItemType = new BuiltInItemType("EXPLORE", 0, "explore", "Explore");
        EXPLORE = builtInItemType;
        BuiltInItemType builtInItemType2 = new BuiltInItemType("GOALS", 1, "goals", "Goals");
        GOALS = builtInItemType2;
        BuiltInItemType builtInItemType3 = new BuiltInItemType("LIBRARY", 2, "library", "Library");
        LIBRARY = builtInItemType3;
        BuiltInItemType builtInItemType4 = new BuiltInItemType("SETTINGS", 3, "settings", "Settings");
        SETTINGS = builtInItemType4;
        BuiltInItemType[] builtInItemTypeArr = {builtInItemType, builtInItemType2, builtInItemType3, builtInItemType4};
        $VALUES = builtInItemTypeArr;
        $ENTRIES = new F3w(builtInItemTypeArr);
    }

    public static Ey9<BuiltInItemType> getEntries() {
        return $ENTRIES;
    }

    public static BuiltInItemType valueOf(String str) {
        return (BuiltInItemType) Enum.valueOf(BuiltInItemType.class, str);
    }

    public static BuiltInItemType[] values() {
        return (BuiltInItemType[]) $VALUES.clone();
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final String getId() {
        return this.id;
    }

    public BuiltInItemType(String str, int i, String str2, String str3) {
        this.id = str2;
        this.displayTitle = str3;
    }
}

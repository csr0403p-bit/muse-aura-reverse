package com.facebook.aura.spaces.menu;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SpaceContextMenuMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceContextMenuMode[] $VALUES;
    public static final SpaceContextMenuMode DEFAULT;
    public static final SpaceContextMenuMode LIBRARY;
    public static final SpaceContextMenuMode SIDEBAR;

    static {
        SpaceContextMenuMode spaceContextMenuMode = new SpaceContextMenuMode("DEFAULT", 0);
        DEFAULT = spaceContextMenuMode;
        SpaceContextMenuMode spaceContextMenuMode2 = new SpaceContextMenuMode("SIDEBAR", 1);
        SIDEBAR = spaceContextMenuMode2;
        SpaceContextMenuMode spaceContextMenuMode3 = new SpaceContextMenuMode("LIBRARY", 2);
        LIBRARY = spaceContextMenuMode3;
        SpaceContextMenuMode[] spaceContextMenuModeArr = {spaceContextMenuMode, spaceContextMenuMode2, spaceContextMenuMode3};
        $VALUES = spaceContextMenuModeArr;
        $ENTRIES = new F3w(spaceContextMenuModeArr);
    }

    public static Ey9<SpaceContextMenuMode> getEntries() {
        return $ENTRIES;
    }

    public static SpaceContextMenuMode valueOf(String str) {
        return (SpaceContextMenuMode) Enum.valueOf(SpaceContextMenuMode.class, str);
    }

    public static SpaceContextMenuMode[] values() {
        return (SpaceContextMenuMode[]) $VALUES.clone();
    }

    public SpaceContextMenuMode(String str, int i) {
    }
}

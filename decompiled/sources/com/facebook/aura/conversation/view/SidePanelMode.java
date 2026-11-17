package com.facebook.aura.conversation.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SidePanelMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SidePanelMode[] $VALUES;
    public static final SidePanelMode ARCHIVED;
    public static final SidePanelMode DEFAULT;
    public static final SidePanelMode SEARCH;

    static {
        SidePanelMode sidePanelMode = new SidePanelMode("DEFAULT", 0);
        DEFAULT = sidePanelMode;
        SidePanelMode sidePanelMode2 = new SidePanelMode("ARCHIVED", 1);
        ARCHIVED = sidePanelMode2;
        SidePanelMode sidePanelMode3 = new SidePanelMode("SEARCH", 2);
        SEARCH = sidePanelMode3;
        SidePanelMode[] sidePanelModeArr = {sidePanelMode, sidePanelMode2, sidePanelMode3};
        $VALUES = sidePanelModeArr;
        $ENTRIES = new F3w(sidePanelModeArr);
    }

    public static Ey9<SidePanelMode> getEntries() {
        return $ENTRIES;
    }

    public static SidePanelMode valueOf(String str) {
        return (SidePanelMode) Enum.valueOf(SidePanelMode.class, str);
    }

    public static SidePanelMode[] values() {
        return (SidePanelMode[]) $VALUES.clone();
    }

    public SidePanelMode(String str, int i) {
    }
}

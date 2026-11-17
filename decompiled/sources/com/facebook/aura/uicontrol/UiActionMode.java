package com.facebook.aura.uicontrol;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class UiActionMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UiActionMode[] $VALUES;
    public static final UiActionMode LIGHTUP;
    public static final UiActionMode PERFORM;
    public static final UiActionMode SUGGEST;

    static {
        UiActionMode uiActionMode = new UiActionMode("PERFORM", 0);
        PERFORM = uiActionMode;
        UiActionMode uiActionMode2 = new UiActionMode("SUGGEST", 1);
        SUGGEST = uiActionMode2;
        UiActionMode uiActionMode3 = new UiActionMode("LIGHTUP", 2);
        LIGHTUP = uiActionMode3;
        UiActionMode[] uiActionModeArr = {uiActionMode, uiActionMode2, uiActionMode3};
        $VALUES = uiActionModeArr;
        $ENTRIES = C3cG.A0w(uiActionModeArr);
    }

    public static Ey9<UiActionMode> getEntries() {
        return $ENTRIES;
    }

    public static UiActionMode valueOf(String str) {
        return (UiActionMode) Enum.valueOf(UiActionMode.class, str);
    }

    public static UiActionMode[] values() {
        return (UiActionMode[]) $VALUES.clone();
    }

    public UiActionMode(String str, int i) {
    }
}

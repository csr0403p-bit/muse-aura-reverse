package com.meta.maps.fancypins;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class FancyPinZOrderMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FancyPinZOrderMode[] $VALUES;
    public static final FancyPinZOrderMode CUSTOM;
    public static final FancyPinZOrderMode INSERTION_ORDER;
    public static final FancyPinZOrderMode RANK_PRIORITY;
    public static final FancyPinZOrderMode SCREEN_Y;

    static {
        FancyPinZOrderMode fancyPinZOrderMode = new FancyPinZOrderMode("CUSTOM", 0);
        CUSTOM = fancyPinZOrderMode;
        FancyPinZOrderMode fancyPinZOrderMode2 = new FancyPinZOrderMode("SCREEN_Y", 1);
        SCREEN_Y = fancyPinZOrderMode2;
        FancyPinZOrderMode fancyPinZOrderMode3 = new FancyPinZOrderMode("INSERTION_ORDER", 2);
        INSERTION_ORDER = fancyPinZOrderMode3;
        FancyPinZOrderMode fancyPinZOrderMode4 = new FancyPinZOrderMode("RANK_PRIORITY", 3);
        RANK_PRIORITY = fancyPinZOrderMode4;
        FancyPinZOrderMode[] fancyPinZOrderModeArr = {fancyPinZOrderMode, fancyPinZOrderMode2, fancyPinZOrderMode3, fancyPinZOrderMode4};
        $VALUES = fancyPinZOrderModeArr;
        $ENTRIES = C3cG.A0w(fancyPinZOrderModeArr);
    }

    public static Ey9<FancyPinZOrderMode> getEntries() {
        return $ENTRIES;
    }

    public static FancyPinZOrderMode valueOf(String str) {
        return (FancyPinZOrderMode) Enum.valueOf(FancyPinZOrderMode.class, str);
    }

    public static FancyPinZOrderMode[] values() {
        return (FancyPinZOrderMode[]) $VALUES.clone();
    }

    public FancyPinZOrderMode(String str, int i) {
    }
}

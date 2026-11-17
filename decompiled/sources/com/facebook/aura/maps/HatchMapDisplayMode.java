package com.facebook.aura.maps;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchMapDisplayMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchMapDisplayMode[] $VALUES;
    public static final HatchMapDisplayMode FULLSCREEN;
    public static final HatchMapDisplayMode INLINE;

    static {
        HatchMapDisplayMode hatchMapDisplayMode = new HatchMapDisplayMode("INLINE", 0);
        INLINE = hatchMapDisplayMode;
        HatchMapDisplayMode hatchMapDisplayMode2 = new HatchMapDisplayMode("FULLSCREEN", 1);
        FULLSCREEN = hatchMapDisplayMode2;
        HatchMapDisplayMode[] hatchMapDisplayModeArr = {hatchMapDisplayMode, hatchMapDisplayMode2};
        $VALUES = hatchMapDisplayModeArr;
        $ENTRIES = C3cG.A0w(hatchMapDisplayModeArr);
    }

    public static Ey9<HatchMapDisplayMode> getEntries() {
        return $ENTRIES;
    }

    public static HatchMapDisplayMode valueOf(String str) {
        return (HatchMapDisplayMode) Enum.valueOf(HatchMapDisplayMode.class, str);
    }

    public static HatchMapDisplayMode[] values() {
        return (HatchMapDisplayMode[]) $VALUES.clone();
    }

    public HatchMapDisplayMode(String str, int i) {
    }
}

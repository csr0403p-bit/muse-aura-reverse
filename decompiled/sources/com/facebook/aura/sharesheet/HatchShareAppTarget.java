package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchShareAppTarget {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShareAppTarget[] $VALUES;
    public static final HatchShareAppTarget FACEBOOK;
    public static final HatchShareAppTarget INSTAGRAM;
    public static final HatchShareAppTarget MESSENGER;

    static {
        HatchShareAppTarget hatchShareAppTarget = new HatchShareAppTarget("FACEBOOK", 0);
        FACEBOOK = hatchShareAppTarget;
        HatchShareAppTarget hatchShareAppTarget2 = new HatchShareAppTarget("INSTAGRAM", 1);
        INSTAGRAM = hatchShareAppTarget2;
        HatchShareAppTarget hatchShareAppTarget3 = new HatchShareAppTarget("MESSENGER", 2);
        MESSENGER = hatchShareAppTarget3;
        HatchShareAppTarget[] hatchShareAppTargetArr = {hatchShareAppTarget, hatchShareAppTarget2, hatchShareAppTarget3};
        $VALUES = hatchShareAppTargetArr;
        $ENTRIES = new F3w(hatchShareAppTargetArr);
    }

    public static Ey9<HatchShareAppTarget> getEntries() {
        return $ENTRIES;
    }

    public static HatchShareAppTarget valueOf(String str) {
        return (HatchShareAppTarget) Enum.valueOf(HatchShareAppTarget.class, str);
    }

    public static HatchShareAppTarget[] values() {
        return (HatchShareAppTarget[]) $VALUES.clone();
    }

    public HatchShareAppTarget(String str, int i) {
    }
}

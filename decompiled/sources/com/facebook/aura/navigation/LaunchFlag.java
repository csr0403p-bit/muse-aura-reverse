package com.facebook.aura.navigation;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LaunchFlag {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LaunchFlag[] $VALUES;
    public static final LaunchFlag BRING_TO_FRONT;
    public static final LaunchFlag NAVIGATE;
    public static final LaunchFlag REPLACE;
    public static final LaunchFlag REPLACE_BACKSTACK;

    static {
        LaunchFlag launchFlag = new LaunchFlag("NAVIGATE", 0);
        NAVIGATE = launchFlag;
        LaunchFlag launchFlag2 = new LaunchFlag("REPLACE", 1);
        REPLACE = launchFlag2;
        LaunchFlag launchFlag3 = new LaunchFlag("REPLACE_BACKSTACK", 2);
        REPLACE_BACKSTACK = launchFlag3;
        LaunchFlag launchFlag4 = new LaunchFlag("BRING_TO_FRONT", 3);
        BRING_TO_FRONT = launchFlag4;
        LaunchFlag[] launchFlagArr = {launchFlag, launchFlag2, launchFlag3, launchFlag4};
        $VALUES = launchFlagArr;
        $ENTRIES = C3cG.A0w(launchFlagArr);
    }

    public static Ey9<LaunchFlag> getEntries() {
        return $ENTRIES;
    }

    public static LaunchFlag valueOf(String str) {
        return (LaunchFlag) Enum.valueOf(LaunchFlag.class, str);
    }

    public static LaunchFlag[] values() {
        return (LaunchFlag[]) $VALUES.clone();
    }

    public LaunchFlag(String str, int i) {
    }
}

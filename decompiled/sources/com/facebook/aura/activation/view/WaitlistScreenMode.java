package com.facebook.aura.activation.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class WaitlistScreenMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WaitlistScreenMode[] $VALUES;
    public static final WaitlistScreenMode JOIN;
    public static final WaitlistScreenMode JOINED;
    public static final WaitlistScreenMode LIMITED;

    static {
        WaitlistScreenMode waitlistScreenMode = new WaitlistScreenMode("JOIN", 0);
        JOIN = waitlistScreenMode;
        WaitlistScreenMode waitlistScreenMode2 = new WaitlistScreenMode("JOINED", 1);
        JOINED = waitlistScreenMode2;
        WaitlistScreenMode waitlistScreenMode3 = new WaitlistScreenMode("LIMITED", 2);
        LIMITED = waitlistScreenMode3;
        WaitlistScreenMode[] waitlistScreenModeArr = {waitlistScreenMode, waitlistScreenMode2, waitlistScreenMode3};
        $VALUES = waitlistScreenModeArr;
        $ENTRIES = C3cG.A0w(waitlistScreenModeArr);
    }

    public static Ey9<WaitlistScreenMode> getEntries() {
        return $ENTRIES;
    }

    public static WaitlistScreenMode valueOf(String str) {
        return (WaitlistScreenMode) Enum.valueOf(WaitlistScreenMode.class, str);
    }

    public static WaitlistScreenMode[] values() {
        return (WaitlistScreenMode[]) $VALUES.clone();
    }

    public WaitlistScreenMode(String str, int i) {
    }
}

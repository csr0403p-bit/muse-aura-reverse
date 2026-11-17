package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SelfieMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SelfieMode[] $VALUES;
    public static final SelfieMode GUIDED;
    public static final SelfieMode RETRY;
    public static final SelfieMode UNAVAILABLE;

    static {
        SelfieMode selfieMode = new SelfieMode("RETRY", 0);
        RETRY = selfieMode;
        SelfieMode selfieMode2 = new SelfieMode("GUIDED", 1);
        GUIDED = selfieMode2;
        SelfieMode selfieMode3 = new SelfieMode("UNAVAILABLE", 2);
        UNAVAILABLE = selfieMode3;
        SelfieMode[] selfieModeArr = {selfieMode, selfieMode2, selfieMode3};
        $VALUES = selfieModeArr;
        $ENTRIES = C3cG.A0w(selfieModeArr);
    }

    public static Ey9<SelfieMode> getEntries() {
        return $ENTRIES;
    }

    public static SelfieMode valueOf(String str) {
        return (SelfieMode) Enum.valueOf(SelfieMode.class, str);
    }

    public static SelfieMode[] values() {
        return (SelfieMode[]) $VALUES.clone();
    }

    public SelfieMode(String str, int i) {
    }
}

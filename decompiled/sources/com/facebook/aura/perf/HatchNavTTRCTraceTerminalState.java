package com.facebook.aura.perf;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchNavTTRCTraceTerminalState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchNavTTRCTraceTerminalState[] $VALUES;
    public static final HatchNavTTRCTraceTerminalState FAILURE;
    public static final HatchNavTTRCTraceTerminalState SUCCESS;

    static {
        HatchNavTTRCTraceTerminalState hatchNavTTRCTraceTerminalState = new HatchNavTTRCTraceTerminalState("SUCCESS", 0);
        SUCCESS = hatchNavTTRCTraceTerminalState;
        HatchNavTTRCTraceTerminalState hatchNavTTRCTraceTerminalState2 = new HatchNavTTRCTraceTerminalState("FAILURE", 1);
        FAILURE = hatchNavTTRCTraceTerminalState2;
        HatchNavTTRCTraceTerminalState[] hatchNavTTRCTraceTerminalStateArr = {hatchNavTTRCTraceTerminalState, hatchNavTTRCTraceTerminalState2};
        $VALUES = hatchNavTTRCTraceTerminalStateArr;
        $ENTRIES = new F3w(hatchNavTTRCTraceTerminalStateArr);
    }

    public static Ey9<HatchNavTTRCTraceTerminalState> getEntries() {
        return $ENTRIES;
    }

    public static HatchNavTTRCTraceTerminalState valueOf(String str) {
        return (HatchNavTTRCTraceTerminalState) Enum.valueOf(HatchNavTTRCTraceTerminalState.class, str);
    }

    public static HatchNavTTRCTraceTerminalState[] values() {
        return (HatchNavTTRCTraceTerminalState[]) $VALUES.clone();
    }

    public HatchNavTTRCTraceTerminalState(String str, int i) {
    }
}

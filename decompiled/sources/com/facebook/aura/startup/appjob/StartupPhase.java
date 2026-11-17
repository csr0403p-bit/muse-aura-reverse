package com.facebook.aura.startup.appjob;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StartupPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StartupPhase[] $VALUES;
    public static final StartupPhase BLOCKING;
    public static final StartupPhase NON_BLOCKING_CRITICAL_PRIORITY;
    public static final StartupPhase NON_BLOCKING_HIGH_PRIORITY;
    public static final StartupPhase NON_BLOCKING_LOW_PRIORITY;

    static {
        StartupPhase startupPhase = new StartupPhase("BLOCKING", 0);
        BLOCKING = startupPhase;
        StartupPhase startupPhase2 = new StartupPhase("NON_BLOCKING_CRITICAL_PRIORITY", 1);
        NON_BLOCKING_CRITICAL_PRIORITY = startupPhase2;
        StartupPhase startupPhase3 = new StartupPhase("NON_BLOCKING_HIGH_PRIORITY", 2);
        NON_BLOCKING_HIGH_PRIORITY = startupPhase3;
        StartupPhase startupPhase4 = new StartupPhase("NON_BLOCKING_LOW_PRIORITY", 3);
        NON_BLOCKING_LOW_PRIORITY = startupPhase4;
        StartupPhase[] startupPhaseArr = {startupPhase, startupPhase2, startupPhase3, startupPhase4};
        $VALUES = startupPhaseArr;
        $ENTRIES = C3cG.A0w(startupPhaseArr);
    }

    public static Ey9<StartupPhase> getEntries() {
        return $ENTRIES;
    }

    public static StartupPhase valueOf(String str) {
        return (StartupPhase) Enum.valueOf(StartupPhase.class, str);
    }

    public static StartupPhase[] values() {
        return (StartupPhase[]) $VALUES.clone();
    }

    public StartupPhase(String str, int i) {
    }
}

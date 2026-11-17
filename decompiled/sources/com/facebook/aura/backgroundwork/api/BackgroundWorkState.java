package com.facebook.aura.backgroundwork.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BackgroundWorkState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BackgroundWorkState[] $VALUES;
    public static final BackgroundWorkState FINISHED;
    public static final BackgroundWorkState NEEDS_USER;
    public static final BackgroundWorkState RUNNING;

    static {
        BackgroundWorkState backgroundWorkState = new BackgroundWorkState("RUNNING", 0);
        RUNNING = backgroundWorkState;
        BackgroundWorkState backgroundWorkState2 = new BackgroundWorkState("NEEDS_USER", 1);
        NEEDS_USER = backgroundWorkState2;
        BackgroundWorkState backgroundWorkState3 = new BackgroundWorkState("FINISHED", 2);
        FINISHED = backgroundWorkState3;
        BackgroundWorkState[] backgroundWorkStateArr = {backgroundWorkState, backgroundWorkState2, backgroundWorkState3};
        $VALUES = backgroundWorkStateArr;
        $ENTRIES = C3cG.A0w(backgroundWorkStateArr);
    }

    public static Ey9<BackgroundWorkState> getEntries() {
        return $ENTRIES;
    }

    public static BackgroundWorkState valueOf(String str) {
        return (BackgroundWorkState) Enum.valueOf(BackgroundWorkState.class, str);
    }

    public static BackgroundWorkState[] values() {
        return (BackgroundWorkState[]) $VALUES.clone();
    }

    public BackgroundWorkState(String str, int i) {
    }
}

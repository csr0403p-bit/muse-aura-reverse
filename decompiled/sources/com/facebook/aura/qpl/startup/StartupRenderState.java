package com.facebook.aura.qpl.startup;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StartupRenderState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StartupRenderState[] $VALUES;
    public static final StartupRenderState ENDED;
    public static final StartupRenderState NOT_STARTED;
    public static final StartupRenderState STARTED;

    static {
        StartupRenderState startupRenderState = new StartupRenderState("NOT_STARTED", 0);
        NOT_STARTED = startupRenderState;
        StartupRenderState startupRenderState2 = new StartupRenderState(CvmMigrationStatusJson.STAGE_STARTED, 1);
        STARTED = startupRenderState2;
        StartupRenderState startupRenderState3 = new StartupRenderState("ENDED", 2);
        ENDED = startupRenderState3;
        StartupRenderState[] startupRenderStateArr = {startupRenderState, startupRenderState2, startupRenderState3};
        $VALUES = startupRenderStateArr;
        $ENTRIES = C3cG.A0w(startupRenderStateArr);
    }

    public static Ey9<StartupRenderState> getEntries() {
        return $ENTRIES;
    }

    public static StartupRenderState valueOf(String str) {
        return (StartupRenderState) Enum.valueOf(StartupRenderState.class, str);
    }

    public static StartupRenderState[] values() {
        return (StartupRenderState[]) $VALUES.clone();
    }

    public StartupRenderState(String str, int i) {
    }
}

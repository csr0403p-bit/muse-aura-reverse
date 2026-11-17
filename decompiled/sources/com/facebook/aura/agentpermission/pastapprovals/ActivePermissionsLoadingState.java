package com.facebook.aura.agentpermission.pastapprovals;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ActivePermissionsLoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ActivePermissionsLoadingState[] $VALUES;
    public static final ActivePermissionsLoadingState ERROR;
    public static final ActivePermissionsLoadingState IDLE;
    public static final ActivePermissionsLoadingState LOADING;
    public static final ActivePermissionsLoadingState SUCCESS;

    static {
        ActivePermissionsLoadingState activePermissionsLoadingState = new ActivePermissionsLoadingState("IDLE", 0);
        IDLE = activePermissionsLoadingState;
        ActivePermissionsLoadingState activePermissionsLoadingState2 = new ActivePermissionsLoadingState("LOADING", 1);
        LOADING = activePermissionsLoadingState2;
        ActivePermissionsLoadingState activePermissionsLoadingState3 = new ActivePermissionsLoadingState("SUCCESS", 2);
        SUCCESS = activePermissionsLoadingState3;
        ActivePermissionsLoadingState activePermissionsLoadingState4 = new ActivePermissionsLoadingState("ERROR", 3);
        ERROR = activePermissionsLoadingState4;
        ActivePermissionsLoadingState[] activePermissionsLoadingStateArr = {activePermissionsLoadingState, activePermissionsLoadingState2, activePermissionsLoadingState3, activePermissionsLoadingState4};
        $VALUES = activePermissionsLoadingStateArr;
        $ENTRIES = C3cG.A0w(activePermissionsLoadingStateArr);
    }

    public static Ey9<ActivePermissionsLoadingState> getEntries() {
        return $ENTRIES;
    }

    public static ActivePermissionsLoadingState valueOf(String str) {
        return (ActivePermissionsLoadingState) Enum.valueOf(ActivePermissionsLoadingState.class, str);
    }

    public static ActivePermissionsLoadingState[] values() {
        return (ActivePermissionsLoadingState[]) $VALUES.clone();
    }

    public ActivePermissionsLoadingState(String str, int i) {
    }
}

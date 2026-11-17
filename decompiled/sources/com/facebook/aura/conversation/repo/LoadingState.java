package com.facebook.aura.conversation.repo;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState FAILED;
    public static final LoadingState IDLE;
    public static final LoadingState LOADING;
    public static final LoadingState SUCCESS;

    static {
        LoadingState loadingState = new LoadingState("IDLE", 0);
        IDLE = loadingState;
        LoadingState loadingState2 = new LoadingState("LOADING", 1);
        LOADING = loadingState2;
        LoadingState loadingState3 = new LoadingState("SUCCESS", 2);
        SUCCESS = loadingState3;
        LoadingState loadingState4 = new LoadingState(CvmMigrationStatusJson.STAGE_FAILED, 3);
        FAILED = loadingState4;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4};
        $VALUES = loadingStateArr;
        $ENTRIES = new F3w(loadingStateArr);
    }

    public static Ey9<LoadingState> getEntries() {
        return $ENTRIES;
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) $VALUES.clone();
    }

    public LoadingState(String str, int i) {
    }
}

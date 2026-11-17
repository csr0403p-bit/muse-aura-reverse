package com.facebook.aura.library.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState ERROR;
    public static final LoadingState INITIAL;
    public static final LoadingState LOADING;
    public static final LoadingState REFRESH_ERROR;
    public static final LoadingState REFRESH_LOADING;
    public static final LoadingState REFRESH_SILENTLY;
    public static final LoadingState SUCCESS;

    static {
        LoadingState loadingState = new LoadingState("INITIAL", 0);
        INITIAL = loadingState;
        LoadingState loadingState2 = new LoadingState("LOADING", 1);
        LOADING = loadingState2;
        LoadingState loadingState3 = new LoadingState("REFRESH_LOADING", 2);
        REFRESH_LOADING = loadingState3;
        LoadingState loadingState4 = new LoadingState("REFRESH_SILENTLY", 3);
        REFRESH_SILENTLY = loadingState4;
        LoadingState loadingState5 = new LoadingState("SUCCESS", 4);
        SUCCESS = loadingState5;
        LoadingState loadingState6 = new LoadingState("REFRESH_ERROR", 5);
        REFRESH_ERROR = loadingState6;
        LoadingState loadingState7 = new LoadingState("ERROR", 6);
        ERROR = loadingState7;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4, loadingState5, loadingState6, loadingState7};
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

package com.facebook.aura.spaces.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState ERROR;
    public static final LoadingState INITIAL;
    public static final LoadingState LOADING;
    public static final LoadingState REFRESHING;
    public static final LoadingState SUCCESS;

    static {
        LoadingState loadingState = new LoadingState("INITIAL", 0);
        INITIAL = loadingState;
        LoadingState loadingState2 = new LoadingState("LOADING", 1);
        LOADING = loadingState2;
        LoadingState loadingState3 = new LoadingState("REFRESHING", 2);
        REFRESHING = loadingState3;
        LoadingState loadingState4 = new LoadingState("SUCCESS", 3);
        SUCCESS = loadingState4;
        LoadingState loadingState5 = new LoadingState("ERROR", 4);
        ERROR = loadingState5;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4, loadingState5};
        $VALUES = loadingStateArr;
        $ENTRIES = C3cG.A0w(loadingStateArr);
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

package com.facebook.aura.explore.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ExploreLoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ExploreLoadingState[] $VALUES;
    public static final ExploreLoadingState ERROR;
    public static final ExploreLoadingState INITIAL;
    public static final ExploreLoadingState LOADED;
    public static final ExploreLoadingState LOADING;
    public static final ExploreLoadingState LOADING_MORE;
    public static final ExploreLoadingState REFRESHING;
    public static final ExploreLoadingState REFRESH_SILENTLY;

    static {
        ExploreLoadingState exploreLoadingState = new ExploreLoadingState("INITIAL", 0);
        INITIAL = exploreLoadingState;
        ExploreLoadingState exploreLoadingState2 = new ExploreLoadingState("LOADING", 1);
        LOADING = exploreLoadingState2;
        ExploreLoadingState exploreLoadingState3 = new ExploreLoadingState("LOADING_MORE", 2);
        LOADING_MORE = exploreLoadingState3;
        ExploreLoadingState exploreLoadingState4 = new ExploreLoadingState("REFRESHING", 3);
        REFRESHING = exploreLoadingState4;
        ExploreLoadingState exploreLoadingState5 = new ExploreLoadingState("REFRESH_SILENTLY", 4);
        REFRESH_SILENTLY = exploreLoadingState5;
        ExploreLoadingState exploreLoadingState6 = new ExploreLoadingState("LOADED", 5);
        LOADED = exploreLoadingState6;
        ExploreLoadingState exploreLoadingState7 = new ExploreLoadingState("ERROR", 6);
        ERROR = exploreLoadingState7;
        ExploreLoadingState[] exploreLoadingStateArr = {exploreLoadingState, exploreLoadingState2, exploreLoadingState3, exploreLoadingState4, exploreLoadingState5, exploreLoadingState6, exploreLoadingState7};
        $VALUES = exploreLoadingStateArr;
        $ENTRIES = new F3w(exploreLoadingStateArr);
    }

    public static Ey9<ExploreLoadingState> getEntries() {
        return $ENTRIES;
    }

    public static ExploreLoadingState valueOf(String str) {
        return (ExploreLoadingState) Enum.valueOf(ExploreLoadingState.class, str);
    }

    public static ExploreLoadingState[] values() {
        return (ExploreLoadingState[]) $VALUES.clone();
    }

    public ExploreLoadingState(String str, int i) {
    }
}

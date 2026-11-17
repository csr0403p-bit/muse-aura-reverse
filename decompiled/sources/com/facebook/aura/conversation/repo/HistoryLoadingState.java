package com.facebook.aura.conversation.repo;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HistoryLoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HistoryLoadingState[] $VALUES;
    public static final HistoryLoadingState FAILED;
    public static final HistoryLoadingState INITIAL;
    public static final HistoryLoadingState LOADING;
    public static final HistoryLoadingState REFRESHING;
    public static final HistoryLoadingState SUCCESS;

    static {
        HistoryLoadingState historyLoadingState = new HistoryLoadingState("INITIAL", 0);
        INITIAL = historyLoadingState;
        HistoryLoadingState historyLoadingState2 = new HistoryLoadingState("LOADING", 1);
        LOADING = historyLoadingState2;
        HistoryLoadingState historyLoadingState3 = new HistoryLoadingState("REFRESHING", 2);
        REFRESHING = historyLoadingState3;
        HistoryLoadingState historyLoadingState4 = new HistoryLoadingState("SUCCESS", 3);
        SUCCESS = historyLoadingState4;
        HistoryLoadingState historyLoadingState5 = new HistoryLoadingState(CvmMigrationStatusJson.STAGE_FAILED, 4);
        FAILED = historyLoadingState5;
        HistoryLoadingState[] historyLoadingStateArr = {historyLoadingState, historyLoadingState2, historyLoadingState3, historyLoadingState4, historyLoadingState5};
        $VALUES = historyLoadingStateArr;
        $ENTRIES = new F3w(historyLoadingStateArr);
    }

    public static Ey9<HistoryLoadingState> getEntries() {
        return $ENTRIES;
    }

    public static HistoryLoadingState valueOf(String str) {
        return (HistoryLoadingState) Enum.valueOf(HistoryLoadingState.class, str);
    }

    public static HistoryLoadingState[] values() {
        return (HistoryLoadingState[]) $VALUES.clone();
    }

    public HistoryLoadingState(String str, int i) {
    }
}

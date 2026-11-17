package com.facebook.aura.conversation.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LoadChatHistoryOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LoadChatHistoryOutcome[] $VALUES;
    public static final LoadChatHistoryOutcome ALREADY_LOADED;
    public static final LoadChatHistoryOutcome ALREADY_LOADING;
    public static final LoadChatHistoryOutcome FETCHED;

    static {
        LoadChatHistoryOutcome loadChatHistoryOutcome = new LoadChatHistoryOutcome("FETCHED", 0);
        FETCHED = loadChatHistoryOutcome;
        LoadChatHistoryOutcome loadChatHistoryOutcome2 = new LoadChatHistoryOutcome("ALREADY_LOADED", 1);
        ALREADY_LOADED = loadChatHistoryOutcome2;
        LoadChatHistoryOutcome loadChatHistoryOutcome3 = new LoadChatHistoryOutcome("ALREADY_LOADING", 2);
        ALREADY_LOADING = loadChatHistoryOutcome3;
        LoadChatHistoryOutcome[] loadChatHistoryOutcomeArr = {loadChatHistoryOutcome, loadChatHistoryOutcome2, loadChatHistoryOutcome3};
        $VALUES = loadChatHistoryOutcomeArr;
        $ENTRIES = C3cG.A0w(loadChatHistoryOutcomeArr);
    }

    public static Ey9<LoadChatHistoryOutcome> getEntries() {
        return $ENTRIES;
    }

    public static LoadChatHistoryOutcome valueOf(String str) {
        return (LoadChatHistoryOutcome) Enum.valueOf(LoadChatHistoryOutcome.class, str);
    }

    public static LoadChatHistoryOutcome[] values() {
        return (LoadChatHistoryOutcome[]) $VALUES.clone();
    }

    public LoadChatHistoryOutcome(String str, int i) {
    }
}

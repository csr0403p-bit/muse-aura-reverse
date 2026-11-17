package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchShareSheetLoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShareSheetLoadingState[] $VALUES;
    public static final HatchShareSheetLoadingState LOADED;
    public static final HatchShareSheetLoadingState LOADING;

    static {
        HatchShareSheetLoadingState hatchShareSheetLoadingState = new HatchShareSheetLoadingState("LOADING", 0);
        LOADING = hatchShareSheetLoadingState;
        HatchShareSheetLoadingState hatchShareSheetLoadingState2 = new HatchShareSheetLoadingState("LOADED", 1);
        LOADED = hatchShareSheetLoadingState2;
        HatchShareSheetLoadingState[] hatchShareSheetLoadingStateArr = {hatchShareSheetLoadingState, hatchShareSheetLoadingState2};
        $VALUES = hatchShareSheetLoadingStateArr;
        $ENTRIES = new F3w(hatchShareSheetLoadingStateArr);
    }

    public static Ey9<HatchShareSheetLoadingState> getEntries() {
        return $ENTRIES;
    }

    public static HatchShareSheetLoadingState valueOf(String str) {
        return (HatchShareSheetLoadingState) Enum.valueOf(HatchShareSheetLoadingState.class, str);
    }

    public static HatchShareSheetLoadingState[] values() {
        return (HatchShareSheetLoadingState[]) $VALUES.clone();
    }

    public HatchShareSheetLoadingState(String str, int i) {
    }
}

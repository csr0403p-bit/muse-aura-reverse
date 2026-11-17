package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchShoppingDataState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShoppingDataState[] $VALUES;
    public static final HatchShoppingDataState FRESH;
    public static final HatchShoppingDataState SAVED;
    public final String value;

    static {
        HatchShoppingDataState hatchShoppingDataState = new HatchShoppingDataState("FRESH", 0, "fresh");
        FRESH = hatchShoppingDataState;
        HatchShoppingDataState hatchShoppingDataState2 = new HatchShoppingDataState("SAVED", 1, "saved");
        SAVED = hatchShoppingDataState2;
        HatchShoppingDataState[] hatchShoppingDataStateArr = {hatchShoppingDataState, hatchShoppingDataState2};
        $VALUES = hatchShoppingDataStateArr;
        $ENTRIES = C3cG.A0w(hatchShoppingDataStateArr);
    }

    public static Ey9<HatchShoppingDataState> getEntries() {
        return $ENTRIES;
    }

    public static HatchShoppingDataState valueOf(String str) {
        return (HatchShoppingDataState) Enum.valueOf(HatchShoppingDataState.class, str);
    }

    public static HatchShoppingDataState[] values() {
        return (HatchShoppingDataState[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchShoppingDataState(String str, int i, String str2) {
        this.value = str2;
    }
}

package com.facebook.aura.maps;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchMapsNativeModuleState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchMapsNativeModuleState[] $VALUES;
    public static final HatchMapsNativeModuleState LOADING;
    public static final HatchMapsNativeModuleState NOT_LOADED;
    public static final HatchMapsNativeModuleState READY;
    public static final HatchMapsNativeModuleState UNAVAILABLE;

    static {
        HatchMapsNativeModuleState hatchMapsNativeModuleState = new HatchMapsNativeModuleState("NOT_LOADED", 0);
        NOT_LOADED = hatchMapsNativeModuleState;
        HatchMapsNativeModuleState hatchMapsNativeModuleState2 = new HatchMapsNativeModuleState("LOADING", 1);
        LOADING = hatchMapsNativeModuleState2;
        HatchMapsNativeModuleState hatchMapsNativeModuleState3 = new HatchMapsNativeModuleState("READY", 2);
        READY = hatchMapsNativeModuleState3;
        HatchMapsNativeModuleState hatchMapsNativeModuleState4 = new HatchMapsNativeModuleState("UNAVAILABLE", 3);
        UNAVAILABLE = hatchMapsNativeModuleState4;
        HatchMapsNativeModuleState[] hatchMapsNativeModuleStateArr = {hatchMapsNativeModuleState, hatchMapsNativeModuleState2, hatchMapsNativeModuleState3, hatchMapsNativeModuleState4};
        $VALUES = hatchMapsNativeModuleStateArr;
        $ENTRIES = C3cG.A0w(hatchMapsNativeModuleStateArr);
    }

    public static Ey9<HatchMapsNativeModuleState> getEntries() {
        return $ENTRIES;
    }

    public static HatchMapsNativeModuleState valueOf(String str) {
        return (HatchMapsNativeModuleState) Enum.valueOf(HatchMapsNativeModuleState.class, str);
    }

    public static HatchMapsNativeModuleState[] values() {
        return (HatchMapsNativeModuleState[]) $VALUES.clone();
    }

    public HatchMapsNativeModuleState(String str, int i) {
    }
}

package com.facebook.aura.status.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchStatusState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchStatusState[] $VALUES;
    public static final HatchStatusState CONNECTING;
    public static final HatchStatusState DISCONNECTED;
    public static final HatchStatusState ERROR;
    public static final HatchStatusState OUT_OF_CREDITS;
    public static final HatchStatusState PAUSED;
    public static final HatchStatusState READY;
    public static final HatchStatusState RESETTING;
    public static final HatchStatusState THINKING;
    public static final HatchStatusState TYPING;
    public static final HatchStatusState WORKING;

    static {
        HatchStatusState hatchStatusState = new HatchStatusState("READY", 0);
        READY = hatchStatusState;
        HatchStatusState hatchStatusState2 = new HatchStatusState("THINKING", 1);
        THINKING = hatchStatusState2;
        HatchStatusState hatchStatusState3 = new HatchStatusState("TYPING", 2);
        TYPING = hatchStatusState3;
        HatchStatusState hatchStatusState4 = new HatchStatusState("WORKING", 3);
        WORKING = hatchStatusState4;
        HatchStatusState hatchStatusState5 = new HatchStatusState("OUT_OF_CREDITS", 4);
        OUT_OF_CREDITS = hatchStatusState5;
        HatchStatusState hatchStatusState6 = new HatchStatusState("CONNECTING", 5);
        CONNECTING = hatchStatusState6;
        HatchStatusState hatchStatusState7 = new HatchStatusState("DISCONNECTED", 6);
        DISCONNECTED = hatchStatusState7;
        HatchStatusState hatchStatusState8 = new HatchStatusState("ERROR", 7);
        ERROR = hatchStatusState8;
        HatchStatusState hatchStatusState9 = new HatchStatusState("RESETTING", 8);
        RESETTING = hatchStatusState9;
        HatchStatusState hatchStatusState10 = new HatchStatusState("PAUSED", 9);
        PAUSED = hatchStatusState10;
        HatchStatusState[] hatchStatusStateArr = {hatchStatusState, hatchStatusState2, hatchStatusState3, hatchStatusState4, hatchStatusState5, hatchStatusState6, hatchStatusState7, hatchStatusState8, hatchStatusState9, hatchStatusState10};
        $VALUES = hatchStatusStateArr;
        $ENTRIES = C3cG.A0w(hatchStatusStateArr);
    }

    public static Ey9<HatchStatusState> getEntries() {
        return $ENTRIES;
    }

    public static HatchStatusState valueOf(String str) {
        return (HatchStatusState) Enum.valueOf(HatchStatusState.class, str);
    }

    public static HatchStatusState[] values() {
        return (HatchStatusState[]) $VALUES.clone();
    }

    public HatchStatusState(String str, int i) {
    }
}
